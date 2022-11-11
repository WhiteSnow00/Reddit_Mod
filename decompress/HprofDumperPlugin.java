// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.dumpapp.plugins;

import java.util.Iterator;
import com.facebook.stetho.dumpapp.DumperContext;
import android.os.Debug;
import com.facebook.stetho.dumpapp.DumpUsageException;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import com.facebook.stetho.dumpapp.DumpException;
import java.io.InputStream;
import com.facebook.stetho.common.Util;
import java.io.FileInputStream;
import java.io.OutputStream;
import android.content.Context;
import com.facebook.stetho.dumpapp.DumperPlugin;

public class HprofDumperPlugin implements DumperPlugin
{
    private static final String NAME = "hprof";
    private final Context mContext;
    
    public HprofDumperPlugin(final Context mContext) {
        this.mContext = mContext;
    }
    
    private void handlePipeOutput(final OutputStream outputStream) throws DumpException {
        final File fileStreamPath = this.mContext.getFileStreamPath("hprof-dump.hprof");
        try {
            this.writeHprof(fileStreamPath);
            try {
                final FileInputStream fileInputStream = new FileInputStream(fileStreamPath);
                try {
                    Util.copy(fileInputStream, outputStream, new byte[2048]);
                }
                finally {
                    fileInputStream.close();
                }
            }
            catch (final IOException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failure copying ");
                sb.append(fileStreamPath);
                sb.append(" to dumper output");
                throw new DumpException(sb.toString());
            }
        }
        finally {
            if (fileStreamPath.exists()) {
                fileStreamPath.delete();
            }
        }
    }
    
    private static void truncateAndDeleteFile(final File file) throws IOException {
        new FileOutputStream(file).close();
        if (file.delete()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to delete ");
        sb.append(file);
        throw new IOException(sb.toString());
    }
    
    private void usage(final PrintStream printStream) throws DumpUsageException {
        printStream.println("Usage: dumpapp hprof [ path ]");
        printStream.println("Dump HPROF memory usage data from the running application.");
        printStream.println();
        printStream.println("Where path can be any of:");
        printStream.println("  -           Output directly to stdout");
        printStream.println("  <path>      Full path to a writable file on the device");
        printStream.println("  <filename>  Relative filename that will be stored in the app internal storage");
        throw new DumpUsageException("Missing path");
    }
    
    private void writeHprof(final File file) throws DumpException {
        try {
            truncateAndDeleteFile(file);
            Debug.dumpHprofData(file.getAbsolutePath());
        }
        catch (final IOException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failure writing to ");
            sb.append(file);
            sb.append(": ");
            sb.append(ex.getMessage());
            throw new DumpException(sb.toString());
        }
    }
    
    @Override
    public void dump(final DumperContext dumperContext) throws DumpException {
        final PrintStream stdout = dumperContext.getStdout();
        final Iterator<String> iterator = dumperContext.getArgsAsList().iterator();
        String s;
        if (iterator.hasNext()) {
            s = iterator.next();
        }
        else {
            s = null;
        }
        if (s == null) {
            this.usage(stdout);
        }
        else if ("-".equals(s)) {
            this.handlePipeOutput(stdout);
        }
        else {
            File fileStreamPath;
            if (!(fileStreamPath = new File(s)).isAbsolute()) {
                fileStreamPath = this.mContext.getFileStreamPath(s);
            }
            this.writeHprof(fileStreamPath);
            final StringBuilder sb = new StringBuilder();
            sb.append("Wrote to ");
            sb.append(fileStreamPath);
            stdout.println(sb.toString());
        }
    }
    
    @Override
    public String getName() {
        return "hprof";
    }
}
