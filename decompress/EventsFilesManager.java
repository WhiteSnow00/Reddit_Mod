// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.util.ArrayList;
import java.io.File;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;
import com.twitter.sdk.android.core.internal.CommonUtils;
import java.util.Locale;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import com.twitter.sdk.android.core.internal.CurrentTimeProvider;
import android.content.Context;

public abstract class EventsFilesManager<T>
{
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    public final Context context;
    public final CurrentTimeProvider currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    public final EventsStorage eventStorage;
    public volatile long lastRollOverTime;
    public final List<EventsStorageListener> rollOverListeners;
    public final EventTransform<T> transform;
    
    public EventsFilesManager(final Context context, final EventTransform<T> transform, final CurrentTimeProvider currentTimeProvider, final EventsStorage eventStorage, final int defaultMaxFilesToKeep) throws IOException {
        this.rollOverListeners = new CopyOnWriteArrayList<EventsStorageListener>();
        this.context = context.getApplicationContext();
        this.transform = transform;
        this.eventStorage = eventStorage;
        this.currentTimeProvider = currentTimeProvider;
        this.lastRollOverTime = currentTimeProvider.getCurrentTimeMillis();
        this.defaultMaxFilesToKeep = defaultMaxFilesToKeep;
    }
    
    private void rollFileOverIfNeeded(final int n) throws IOException {
        if (!this.eventStorage.canWorkingFileStore(n, this.getMaxByteSizePerFile())) {
            CommonUtils.logControlled(this.context, 4, "Twitter", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", this.eventStorage.getWorkingFileUsedSizeInBytes(), n, this.getMaxByteSizePerFile()));
            this.rollFileOver();
        }
    }
    
    private void triggerRollOverOnListeners(final String s) {
        for (final EventsStorageListener eventsStorageListener : this.rollOverListeners) {
            try {
                eventsStorageListener.onRollOver(s);
            }
            catch (final Exception ex) {
                CommonUtils.logControlledError(this.context, "One of the roll over listeners threw an exception", ex);
            }
        }
    }
    
    public void deleteAllEventsFiles() {
        final EventsStorage eventStorage = this.eventStorage;
        eventStorage.deleteFilesInRollOverDirectory(eventStorage.getAllFilesInRollOverDirectory());
        this.eventStorage.deleteWorkingFile();
    }
    
    public void deleteOldestInRollOverIfOverMax() {
        final List<File> allFilesInRollOverDirectory = this.eventStorage.getAllFilesInRollOverDirectory();
        final int maxFilesToKeep = this.getMaxFilesToKeep();
        if (allFilesInRollOverDirectory.size() <= maxFilesToKeep) {
            return;
        }
        final int n = allFilesInRollOverDirectory.size() - maxFilesToKeep;
        CommonUtils.logControlled(this.context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", allFilesInRollOverDirectory.size(), maxFilesToKeep, n));
        final TreeSet set = new TreeSet((Comparator<? super E>)new Comparator<FileWithTimestamp>() {
            @Override
            public int compare(final FileWithTimestamp fileWithTimestamp, final FileWithTimestamp fileWithTimestamp2) {
                return (int)(fileWithTimestamp.timestamp - fileWithTimestamp2.timestamp);
            }
        });
        for (final File file : allFilesInRollOverDirectory) {
            set.add(new FileWithTimestamp(file, this.parseCreationTimestampFromFileName(file.getName())));
        }
        final ArrayList<File> list = new ArrayList<File>();
        final Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            list.add(((FileWithTimestamp)iterator2.next()).file);
            if (list.size() == n) {
                break;
            }
        }
        this.eventStorage.deleteFilesInRollOverDirectory(list);
    }
    
    public void deleteSentFiles(final List<File> list) {
        this.eventStorage.deleteFilesInRollOverDirectory(list);
    }
    
    public abstract String generateUniqueRollOverFileName();
    
    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.getBatchOfFilesToSend(1);
    }
    
    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }
    
    public int getMaxByteSizePerFile() {
        return 8000;
    }
    
    public int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }
    
    public long parseCreationTimestampFromFileName(final String s) {
        final String[] split = s.split("_");
        if (split.length != 3) {
            return 0L;
        }
        try {
            return Long.valueOf(split[2]);
        }
        catch (final NumberFormatException ex) {
            return 0L;
        }
    }
    
    public void registerRollOverListener(final EventsStorageListener eventsStorageListener) {
        if (eventsStorageListener != null) {
            this.rollOverListeners.add(eventsStorageListener);
        }
    }
    
    public boolean rollFileOver() throws IOException {
        final boolean workingFileEmpty = this.eventStorage.isWorkingFileEmpty();
        boolean b = true;
        String generateUniqueRollOverFileName;
        if (!workingFileEmpty) {
            generateUniqueRollOverFileName = this.generateUniqueRollOverFileName();
            this.eventStorage.rollOver(generateUniqueRollOverFileName);
            CommonUtils.logControlled(this.context, 4, "Twitter", String.format(Locale.US, "generated new file %s", generateUniqueRollOverFileName));
            this.lastRollOverTime = this.currentTimeProvider.getCurrentTimeMillis();
        }
        else {
            generateUniqueRollOverFileName = null;
            b = false;
        }
        this.triggerRollOverOnListeners(generateUniqueRollOverFileName);
        return b;
    }
    
    public void writeEvent(final T t) throws IOException {
        final byte[] bytes = this.transform.toBytes(t);
        this.rollFileOverIfNeeded(bytes.length);
        this.eventStorage.add(bytes);
    }
    
    public static class FileWithTimestamp
    {
        public final File file;
        public final long timestamp;
        
        public FileWithTimestamp(final File file, final long timestamp) {
            this.file = file;
            this.timestamp = timestamp;
        }
    }
}
