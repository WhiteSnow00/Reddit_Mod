// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.util.concurrent.ExecutorService;
import com.twitter.sdk.android.core.internal.CommonUtils;
import java.io.IOException;
import com.twitter.sdk.android.core.internal.CurrentTimeProvider;
import com.twitter.sdk.android.core.internal.persistence.FileStoreImpl;
import com.twitter.sdk.android.core.internal.SystemCurrentTimeProvider;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import java.util.concurrent.ConcurrentHashMap;
import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.GuestSessionProvider;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import com.twitter.sdk.android.core.TwitterAuthConfig;

public class ScribeClient
{
    private static final String STORAGE_DIR_BASE = "_se_to_send";
    private static final String WORKING_FILENAME_BASE = "_se.tap";
    private final TwitterAuthConfig authConfig;
    private final Context context;
    private final ScheduledExecutorService executor;
    private final GuestSessionProvider guestSessionProvider;
    private final IdManager idManager;
    private final ScribeConfig scribeConfig;
    public final ConcurrentHashMap<Long, ScribeHandler> scribeHandlers;
    private final SessionManager<? extends Session<TwitterAuthToken>> sessionManager;
    private final ScribeEvent$Transform transform;
    
    public ScribeClient(final Context context, final ScheduledExecutorService executor, final ScribeConfig scribeConfig, final ScribeEvent$Transform transform, final TwitterAuthConfig authConfig, final SessionManager<? extends Session<TwitterAuthToken>> sessionManager, final GuestSessionProvider guestSessionProvider, final IdManager idManager) {
        this.context = context;
        this.executor = executor;
        this.scribeConfig = scribeConfig;
        this.transform = transform;
        this.authConfig = authConfig;
        this.sessionManager = sessionManager;
        this.guestSessionProvider = guestSessionProvider;
        this.idManager = idManager;
        this.scribeHandlers = new ConcurrentHashMap<Long, ScribeHandler>(2);
    }
    
    private ScribeHandler newScribeHandler(final long n) throws IOException {
        final Context context = this.context;
        final ScribeFilesManager scribeFilesManager = new ScribeFilesManager(this.context, (EventTransform)this.transform, (CurrentTimeProvider)new SystemCurrentTimeProvider(), new QueueFileEventStorage(context, new FileStoreImpl(context).getFilesDir(), this.getWorkingFileNameForOwner(n), this.getStorageDirForOwner(n)), this.scribeConfig.maxFilesToKeep);
        return new ScribeHandler(this.context, this.getScribeStrategy(n, scribeFilesManager), (EventsFilesManager)scribeFilesManager, this.executor);
    }
    
    public ScribeHandler getScribeHandler(final long n) throws IOException {
        if (!this.scribeHandlers.containsKey(n)) {
            this.scribeHandlers.putIfAbsent(n, this.newScribeHandler(n));
        }
        return this.scribeHandlers.get(n);
    }
    
    public EventsStrategy<ScribeEvent> getScribeStrategy(final long n, final ScribeFilesManager scribeFilesManager) {
        if (this.scribeConfig.isEnabled) {
            CommonUtils.logControlled(this.context, "Scribe enabled");
            final Context context = this.context;
            final ScheduledExecutorService executor = this.executor;
            final ScribeConfig scribeConfig = this.scribeConfig;
            return (EventsStrategy<ScribeEvent>)new EnabledScribeStrategy(context, executor, scribeFilesManager, scribeConfig, new ScribeFilesSender(context, scribeConfig, n, this.authConfig, (SessionManager)this.sessionManager, this.guestSessionProvider, (ExecutorService)executor, this.idManager));
        }
        CommonUtils.logControlled(this.context, "Scribe disabled");
        return (EventsStrategy<ScribeEvent>)new DisabledEventsStrategy();
    }
    
    public String getStorageDirForOwner(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append("_se_to_send");
        return sb.toString();
    }
    
    public String getWorkingFileNameForOwner(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append("_se.tap");
        return sb.toString();
    }
    
    public boolean scribe(final ScribeEvent scribeEvent, final long n) {
        try {
            this.getScribeHandler(n).scribe(scribeEvent);
            return true;
        }
        catch (final IOException ex) {
            CommonUtils.logControlledError(this.context, "Failed to scribe event", ex);
            return false;
        }
    }
    
    public boolean scribeAndFlush(final ScribeEvent scribeEvent, final long n) {
        try {
            this.getScribeHandler(n).scribeAndFlush(scribeEvent);
            return true;
        }
        catch (final IOException ex) {
            CommonUtils.logControlledError(this.context, "Failed to scribe event", ex);
            return false;
        }
    }
}
