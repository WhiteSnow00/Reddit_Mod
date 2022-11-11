// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Iterator;
import com.twitter.sdk.android.core.SessionManager;
import java.util.concurrent.ExecutorService;
import com.twitter.sdk.android.core.Session;

public class SessionMonitor<T extends Session>
{
    private final ExecutorService executorService;
    public final MonitorState monitorState;
    private final SessionManager<T> sessionManager;
    private final SessionVerifier sessionVerifier;
    private final SystemCurrentTimeProvider time;
    
    public SessionMonitor(final SessionManager<T> sessionManager, final SystemCurrentTimeProvider time, final ExecutorService executorService, final MonitorState monitorState, final SessionVerifier sessionVerifier) {
        this.time = time;
        this.sessionManager = sessionManager;
        this.executorService = executorService;
        this.monitorState = monitorState;
        this.sessionVerifier = sessionVerifier;
    }
    
    public SessionMonitor(final SessionManager<T> sessionManager, final ExecutorService executorService, final SessionVerifier<T> sessionVerifier) {
        this(sessionManager, new SystemCurrentTimeProvider(), executorService, new MonitorState(), sessionVerifier);
    }
    
    public void monitorActivityLifecycle(final ActivityLifecycleManager activityLifecycleManager) {
        activityLifecycleManager.registerCallbacks((ActivityLifecycleManager.Callbacks)new SessionMonitor$1(this));
    }
    
    public void triggerVerificationIfNecessary() {
        final Session activeSession = this.sessionManager.getActiveSession();
        final long currentTimeMillis = this.time.getCurrentTimeMillis();
        if (activeSession != null && this.monitorState.beginVerification(currentTimeMillis)) {
            this.executorService.submit(new Runnable() {
                @Override
                public void run() {
                    SessionMonitor.this.verifyAll();
                }
            });
        }
    }
    
    public void verifyAll() {
        final Iterator iterator = this.sessionManager.getSessionMap().values().iterator();
        while (iterator.hasNext()) {
            this.sessionVerifier.verifySession((Session)iterator.next());
        }
        this.monitorState.endVerification(this.time.getCurrentTimeMillis());
    }
    
    public static class MonitorState
    {
        private static final long TIME_THRESHOLD_IN_MILLIS = 21600000L;
        public long lastVerification;
        private final Calendar utcCalendar;
        public boolean verifying;
        
        public MonitorState() {
            this.utcCalendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        }
        
        private boolean isOnSameDate(final long timeInMillis, final long timeInMillis2) {
            this.utcCalendar.setTimeInMillis(timeInMillis);
            final int value = this.utcCalendar.get(6);
            final Calendar utcCalendar = this.utcCalendar;
            boolean b = true;
            final int value2 = utcCalendar.get(1);
            this.utcCalendar.setTimeInMillis(timeInMillis2);
            final int value3 = this.utcCalendar.get(6);
            final int value4 = this.utcCalendar.get(1);
            if (value != value3 || value2 != value4) {
                b = false;
            }
            return b;
        }
        
        public boolean beginVerification(final long n) {
            synchronized (this) {
                final long lastVerification = this.lastVerification;
                final boolean b = n - lastVerification > 21600000L;
                final boolean b2 = !this.isOnSameDate(n, lastVerification);
                return !this.verifying && (b || b2) && (this.verifying = true);
            }
        }
        
        public void endVerification(final long lastVerification) {
            synchronized (this) {
                this.verifying = false;
                this.lastVerification = lastVerification;
            }
        }
    }
}
