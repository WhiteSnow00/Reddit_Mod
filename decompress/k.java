// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import com.appsflyer.AFLogger;
import X.6uu;
import X.6v3;
import X.6ut;
import X.6v6;
import java.util.concurrent.ExecutorService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import android.net.TrafficStats;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledExecutorService;

public final class k
{
    public static k values;
    public ScheduledExecutorService AFInAppEventParameterName;
    public final ThreadFactory AFInAppEventType;
    public Executor AFKeystoreWrapper;
    public ScheduledExecutorService valueOf;
    
    static {
        Covode.recordClassIndex(2701);
    }
    
    public k() {
        this.AFInAppEventType = new ThreadFactory() {
            static {
                Covode.recordClassIndex(2702);
            }
            
            @Override
            public final Thread newThread(final Runnable runnable) {
                return (Thread)new PthreadThread((Runnable)new Runnable() {
                    static {
                        Covode.recordClassIndex(2703);
                    }
                    
                    @Override
                    public final void run() {
                        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                        runnable.run();
                    }
                }, "/internal/k$4");
            }
        };
    }
    
    public static ExecutorService INVOKESTATIC_com_appsflyer_internal_k_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newFixedThreadPool(final int lizj, final ThreadFactory lji) {
        final 6uu liz = 6ut.LIZ(6v6.FIXED);
        liz.LIZJ = lizj;
        liz.LJI = lji;
        return 6v3.LIZ(liz.LIZ());
    }
    
    public static ScheduledExecutorService INVOKESTATIC_com_appsflyer_internal_k_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newScheduledThreadPool(final int lizj, final ThreadFactory lji) {
        final 6uu liz = 6ut.LIZ(6v6.SCHEDULED);
        liz.LIZJ = lizj;
        liz.LJI = lji;
        return (ScheduledExecutorService)6v3.LIZ(liz.LIZ());
    }
    
    public static void valueOf(final ExecutorService executorService) {
        try {
            AFLogger.AFInAppEventParameterName("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10L, TimeUnit.SECONDS);
        }
        catch (final InterruptedException ex) {
            AFLogger.AFInAppEventParameterName("InterruptedException!!!");
        }
        finally {
            if (!executorService.isTerminated()) {
                AFLogger.AFInAppEventParameterName("killing non-finished tasks");
            }
            executorService.shutdownNow();
        }
    }
    
    public final ScheduledThreadPoolExecutor AFInAppEventType() {
        final ScheduledExecutorService valueOf = this.valueOf;
        if (valueOf == null || valueOf.isShutdown() || this.valueOf.isTerminated()) {
            this.valueOf = INVOKESTATIC_com_appsflyer_internal_k_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newScheduledThreadPool(2, this.AFInAppEventType);
        }
        return (ScheduledThreadPoolExecutor)this.valueOf;
    }
    
    public final Executor AFKeystoreWrapper() {
        final Executor afKeystoreWrapper = this.AFKeystoreWrapper;
        if (afKeystoreWrapper == null || (afKeystoreWrapper instanceof ThreadPoolExecutor && (((ThreadPoolExecutor)afKeystoreWrapper).isShutdown() || ((ThreadPoolExecutor)this.AFKeystoreWrapper).isTerminated() || ((ThreadPoolExecutor)this.AFKeystoreWrapper).isTerminating()))) {
            this.AFKeystoreWrapper = INVOKESTATIC_com_appsflyer_internal_k_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newFixedThreadPool(2, this.AFInAppEventType);
        }
        return this.AFKeystoreWrapper;
    }
}
