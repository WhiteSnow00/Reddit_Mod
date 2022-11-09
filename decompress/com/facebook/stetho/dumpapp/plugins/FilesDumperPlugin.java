// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.dumpapp.plugins;

import com.facebook.stetho.dumpapp.DumpException;
import ak0.m;
import com.facebook.stetho.dumpapp.DumperContext;
import android.os.Environment;
import com.facebook.stetho.dumpapp.DumpUsageException;
import java.io.Closeable;
import com.facebook.stetho.common.Util;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import com.facebook.stetho.dumpapp.ArgsHelper;
import java.util.Iterator;
import java.io.PrintStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.io.File;
import java.util.zip.ZipOutputStream;
import android.content.Context;
import com.facebook.stetho.dumpapp.DumperPlugin;

public class FilesDumperPlugin implements DumperPlugin
{
    private static final String NAME = "files";
    private final Context mContext;
    
    public FilesDumperPlugin(final Context mContext) {
        this.mContext = mContext;
    }
    
    private void addFiles(final ZipOutputStream zipOutputStream, final byte[] array, final File[] array2) throws IOException {
        final int length = array2.length;
        int i = 0;
        while (i < length) {
            Object o = array2[i];
            Label_0091: {
                if (((File)o).isDirectory()) {
                    this.addFiles(zipOutputStream, array, ((File)o).listFiles());
                    break Label_0091;
                }
                zipOutputStream.putNextEntry(new ZipEntry(relativizePath(getBaseDir(this.mContext).getParentFile(), (File)o)));
                o = new FileInputStream((File)o);
                try {
                    copy((InputStream)o, zipOutputStream, array);
                    ((FileInputStream)o).close();
                    ++i;
                    continue;
                }
                finally {
                    ((FileInputStream)o).close();
                }
            }
            break;
        }
    }
    
    private static void copy(final InputStream inputStream, final OutputStream outputStream, final byte[] array) throws IOException {
        while (true) {
            final int read = inputStream.read(array);
            if (read < 0) {
                break;
            }
            outputStream.write(array, 0, read);
        }
    }
    
    private void doDownload(PrintStream printStream, Iterator<String> zipOutputStream) throws DumpUsageException {
        final String nextArg = ArgsHelper.nextArg((Iterator<String>)zipOutputStream, "Must specify output file or '-'");
        final ArrayList list = new ArrayList();
        while (((Iterator)zipOutputStream).hasNext()) {
            list.add(resolvePossibleAppStoragePath(this.mContext, ((Iterator<String>)zipOutputStream).next()));
        }
        try {
            if (!"-".equals(nextArg)) {
                printStream = (PrintStream)new FileOutputStream(resolvePossibleSdcardPath(nextArg));
            }
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(printStream));
            try {
                final byte[] array = new byte[2048];
                if (list.size() > 0) {
                    this.addFiles(zipOutputStream, array, list.toArray(new File[list.size()]));
                }
                else {
                    this.addFiles(zipOutputStream, array, getBaseDir(this.mContext).listFiles());
                }
                try {
                    zipOutputStream.close();
                }
                catch (final IOException zipOutputStream) {
                    Util.close(printStream, false);
                    throw zipOutputStream;
                }
            }
            finally {
                try {
                    zipOutputStream.close();
                }
                catch (final IOException ex) {
                    Util.close(printStream, true);
                }
            }
        }
        catch (final IOException ex2) {
            throw new RuntimeException(ex2);
        }
    }
    
    private void doLs(final PrintStream printStream) throws DumpUsageException {
        final File baseDir = getBaseDir(this.mContext);
        if (baseDir.isDirectory()) {
            printDirectoryText(baseDir, "", printStream);
        }
    }
    
    private void doTree(final PrintStream printStream) throws DumpUsageException {
        printDirectoryVisual(getBaseDir(this.mContext), 0, printStream);
    }
    
    private void doUsage(final PrintStream printStream) {
        printStream.println("Usage: dumpapp files <command> [command-options]");
        printStream.println("       dumpapp files ls");
        printStream.println("       dumpapp files tree");
        printStream.println("       dumpapp files download <output.zip> [<path>...]");
        printStream.println();
        printStream.println("dumpapp files ls: List files similar to the ls command");
        printStream.println();
        printStream.println("dumpapp files tree: List files similar to the tree command");
        printStream.println();
        printStream.println("dumpapp files download: Fetch internal application storage");
        printStream.println("    <output.zip>: Output location or '-' for stdout");
        printStream.println("    <path>: Fetch only those paths named (directories fetch recursively)");
    }
    
    private static File getBaseDir(final Context context) {
        return context.getFilesDir().getParentFile();
    }
    
    private static void printDirectoryText(final File file, final String s, final PrintStream printStream) {
        final File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; ++i) {
            final File file2 = listFiles[i];
            if (file2.isDirectory()) {
                final StringBuilder k = a.k(s);
                k.append(file2.getName());
                k.append("/");
                printDirectoryText(file2, k.toString(), printStream);
            }
            else {
                final StringBuilder j = a.k(s);
                j.append(file2.getName());
                printStream.println(j.toString());
            }
        }
    }
    
    private static void printDirectoryVisual(final File file, final int n, final PrintStream printStream) {
        final File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; ++i) {
            printHeaderVisual(n, printStream);
            final File file2 = listFiles[i];
            printStream.print("+---");
            printStream.print(file2.getName());
            printStream.println();
            if (file2.isDirectory()) {
                printDirectoryVisual(file2, n + 1, printStream);
            }
        }
    }
    
    private static void printHeaderVisual(final int n, final PrintStream printStream) {
        for (int i = 0; i < n; ++i) {
            printStream.print("|   ");
        }
    }
    
    private static String relativizePath(final File file, final File file2) {
        final String absolutePath = file.getAbsolutePath();
        final String absolutePath2 = file2.getAbsolutePath();
        if (absolutePath2.startsWith(absolutePath)) {
            return absolutePath2.substring(absolutePath.length() + 1);
        }
        return absolutePath2;
    }
    
    private static File resolvePossibleAppStoragePath(final Context context, final String s) {
        if (s.startsWith("/")) {
            return new File(s);
        }
        return new File(getBaseDir(context), s);
    }
    
    private static File resolvePossibleSdcardPath(final String s) {
        if (s.startsWith("/")) {
            return new File(s);
        }
        return new File(Environment.getExternalStorageDirectory(), s);
    }
    
    @Override
    public void dump(final DumperContext dumperContext) throws DumpException {
        final Iterator<String> iterator = dumperContext.getArgsAsList().iterator();
        final String nextOptionalArg = ArgsHelper.nextOptionalArg(iterator, "");
        if ("ls".equals(nextOptionalArg)) {
            this.doLs(dumperContext.getStdout());
        }
        else if ("tree".equals(nextOptionalArg)) {
            this.doTree(dumperContext.getStdout());
        }
        else if ("download".equals(nextOptionalArg)) {
            this.doDownload(dumperContext.getStdout(), iterator);
        }
        else {
            this.doUsage(dumperContext.getStdout());
            if (!"".equals(nextOptionalArg)) {
                throw new DumpUsageException(m.l("Unknown command: ", nextOptionalArg));
            }
        }
    }
    
    @Override
    public String getName() {
        return "files";
    }
}
