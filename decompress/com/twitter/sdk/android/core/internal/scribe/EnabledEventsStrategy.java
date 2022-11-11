// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import com.twitter.sdk.android.core.internal.CommonUtils;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

public abstract class EnabledEventsStrategy<T> implements EventsStrategy<T>
{
    public static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    public final Context context;
    public final ScheduledExecutorService executorService;
    public final EventsFilesManager<T> filesManager;
    public volatile int rolloverIntervalSeconds;
    public final AtomicReference<ScheduledFuture<?>> scheduledRolloverFutureRef;
    
    public EnabledEventsStrategy(final Context context, final ScheduledExecutorService executorService, final EventsFilesManager<T> filesManager) {
        this.rolloverIntervalSeconds = -1;
        this.context = context;
        this.executorService = executorService;
        this.filesManager = filesManager;
        this.scheduledRolloverFutureRef = new AtomicReference<ScheduledFuture<?>>();
    }
    
    public void cancelTimeBasedFileRollOver() {
        if (this.scheduledRolloverFutureRef.get() != null) {
            CommonUtils.logControlled(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            this.scheduledRolloverFutureRef.get().cancel(false);
            this.scheduledRolloverFutureRef.set(null);
        }
    }
    
    public void configureRollover(final int rolloverIntervalSeconds) {
        this.rolloverIntervalSeconds = rolloverIntervalSeconds;
        this.scheduleTimeBasedFileRollOver(0L, this.rolloverIntervalSeconds);
    }
    
    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }
    
    public int getRollover() {
        return this.rolloverIntervalSeconds;
    }
    
    public void recordEvent(final T t) {
        CommonUtils.logControlled(this.context, t.toString());
        try {
            this.filesManager.writeEvent(t);
        }
        catch (final IOException ex) {
            CommonUtils.logControlledError(this.context, "Failed to write event.", ex);
        }
        this.scheduleTimeBasedRollOverIfNeeded();
    }
    
    public boolean rollFileOver() {
        try {
            return this.filesManager.rollFileOver();
        }
        catch (final IOException ex) {
            CommonUtils.logControlledError(this.context, "Failed to roll file over.", ex);
            return false;
        }
    }
    
    public void scheduleTimeBasedFileRollOver(final long n, final long n2) {
        if (this.scheduledRolloverFutureRef.get() == null) {
            final TimeBasedFileRollOverRunnable timeBasedFileRollOverRunnable = new TimeBasedFileRollOverRunnable(this.context, (FileRollOverManager)this);
            final Context context = this.context;
            final StringBuilder sb = new StringBuilder();
            sb.append("Scheduling time based file roll over every ");
            sb.append(n2);
            sb.append(" seconds");
            CommonUtils.logControlled(context, sb.toString());
            try {
                this.scheduledRolloverFutureRef.set(this.executorService.scheduleAtFixedRate(timeBasedFileRollOverRunnable, n, n2, TimeUnit.SECONDS));
            }
            catch (final RejectedExecutionException ex) {
                CommonUtils.logControlledError(this.context, "Failed to schedule time based file roll over", ex);
            }
        }
    }
    
    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.rolloverIntervalSeconds != -1) {
            this.scheduleTimeBasedFileRollOver(this.rolloverIntervalSeconds, this.rolloverIntervalSeconds);
        }
    }
    
    public void sendAndCleanUpIfSuccess() {
        final FilesSender filesSender = ((EventsStrategy)this).getFilesSender();
        if (filesSender == null) {
            CommonUtils.logControlled(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        CommonUtils.logControlled(this.context, "Sending all files");
        List<File> list = this.filesManager.getBatchOfFilesToSend();
        int n = 0;
        int n3;
        while (true) {
            int n2 = n;
            n3 = n;
            try {
                if (list.size() > 0) {
                    n2 = n;
                    CommonUtils.logControlled(this.context, String.format(Locale.US, "attempt to send batch of %d files", list.size()));
                    n2 = n;
                    final boolean send = filesSender.send(list);
                    n3 = n;
                    if (send) {
                        n2 = n;
                        n3 = (n2 = n + list.size());
                        this.filesManager.deleteSentFiles(list);
                    }
                    if (send) {
                        n2 = n3;
                        list = this.filesManager.getBatchOfFilesToSend();
                        n = n3;
                        continue;
                    }
                }
            }
            catch (final Exception ex) {
                final Context context = this.context;
                final StringBuilder r = a.r("Failed to send batch of analytics files to server: ");
                r.append(ex.getMessage());
                CommonUtils.logControlledError(context, r.toString(), ex);
                n3 = n2;
            }
            break;
        }
        if (n3 == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }
    
    public void sendEvents() {
        this.sendAndCleanUpIfSuccess();
    }
}
