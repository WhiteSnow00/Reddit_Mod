// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.io.OutputStream;
import java.io.Closeable;
import java.io.InputStream;
import com.twitter.sdk.android.core.internal.CommonUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import android.content.Context;

public class QueueFileEventStorage implements EventsStorage
{
    private final Context context;
    private QueueFile queueFile;
    private File targetDirectory;
    private final String targetDirectoryName;
    private final File workingDirectory;
    private final File workingFile;
    
    public QueueFileEventStorage(final Context context, final File workingDirectory, final String s, final String targetDirectoryName) throws IOException {
        this.context = context;
        this.workingDirectory = workingDirectory;
        this.targetDirectoryName = targetDirectoryName;
        final File workingFile = new File(workingDirectory, s);
        this.workingFile = workingFile;
        this.queueFile = new QueueFile(workingFile);
        this.createTargetDirectory();
    }
    
    private void createTargetDirectory() {
        final File targetDirectory = new File(this.workingDirectory, this.targetDirectoryName);
        this.targetDirectory = targetDirectory;
        if (!targetDirectory.exists()) {
            this.targetDirectory.mkdirs();
        }
    }
    
    private void move(final File file, final File file2) throws IOException {
        final Closeable closeable = null;
        Closeable closeable2;
        Closeable closeable3;
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                final OutputStream moveOutputStream = this.getMoveOutputStream(file2);
                CommonUtils.copyStream((InputStream)fileInputStream, moveOutputStream, new byte[1024]);
                CommonUtils.closeOrLog((Closeable)fileInputStream, "Failed to close file input stream");
                CommonUtils.closeOrLog((Closeable)moveOutputStream, "Failed to close output stream");
                file.delete();
                return;
            }
            finally {}
        }
        finally {
            closeable2 = null;
            closeable3 = closeable;
        }
        CommonUtils.closeOrLog(closeable3, "Failed to close file input stream");
        CommonUtils.closeOrLog(closeable2, "Failed to close output stream");
        file.delete();
    }
    
    public void add(final byte[] array) throws IOException {
        this.queueFile.add(array);
    }
    
    public boolean canWorkingFileStore(final int n, final int n2) {
        return this.queueFile.hasSpaceFor(n, n2);
    }
    
    public void deleteFilesInRollOverDirectory(final List<File> list) {
        for (final File file : list) {
            CommonUtils.logControlled(this.context, String.format("deleting sent analytics file %s", file.getName()));
            file.delete();
        }
    }
    
    public void deleteWorkingFile() {
        while (true) {
            try {
                this.queueFile.close();
                this.workingFile.delete();
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public List<File> getAllFilesInRollOverDirectory() {
        return Arrays.asList(this.targetDirectory.listFiles());
    }
    
    public List<File> getBatchOfFilesToSend(final int n) {
        final ArrayList list = new ArrayList();
        final File[] listFiles = this.targetDirectory.listFiles();
        for (int length = listFiles.length, i = 0; i < length; ++i) {
            list.add(listFiles[i]);
            if (list.size() >= n) {
                break;
            }
        }
        return list;
    }
    
    public OutputStream getMoveOutputStream(final File file) throws IOException {
        return new FileOutputStream(file);
    }
    
    public File getRollOverDirectory() {
        return this.targetDirectory;
    }
    
    public File getWorkingDirectory() {
        return this.workingDirectory;
    }
    
    public int getWorkingFileUsedSizeInBytes() {
        return this.queueFile.usedBytes();
    }
    
    public boolean isWorkingFileEmpty() {
        return this.queueFile.isEmpty();
    }
    
    public void rollOver(final String s) throws IOException {
        this.queueFile.close();
        this.move(this.workingFile, new File(this.targetDirectory, s));
        this.queueFile = new QueueFile(this.workingFile);
    }
}
