// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.io.File;
import java.util.List;
import java.io.IOException;

public interface EventsStorage
{
    void add(final byte[] p0) throws IOException;
    
    boolean canWorkingFileStore(final int p0, final int p1);
    
    void deleteFilesInRollOverDirectory(final List<File> p0);
    
    void deleteWorkingFile();
    
    List<File> getAllFilesInRollOverDirectory();
    
    List<File> getBatchOfFilesToSend(final int p0);
    
    File getRollOverDirectory();
    
    File getWorkingDirectory();
    
    int getWorkingFileUsedSizeInBytes();
    
    boolean isWorkingFileEmpty();
    
    void rollOver(final String p0) throws IOException;
}
