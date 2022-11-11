// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import al0.b;
import com.twitter.sdk.android.core.Logger;
import java.util.Locale;
import com.twitter.sdk.android.core.Twitter;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

public final class ExecutorUtils
{
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final long DEFAULT_TERMINATION_TIMEOUT = 1L;
    private static final long KEEP_ALIVE = 1L;
    private static final int MAXIMUM_POOL_SIZE;
    
    static {
        final int n = CPU_COUNT = Runtime.getRuntime().availableProcessors();
        CORE_POOL_SIZE = n + 1;
        MAXIMUM_POOL_SIZE = n * 2 + 1;
    }
    
    private ExecutorUtils() {
    }
    
    public static void addDelayedShutdownHook(final String s, final ExecutorService executorService) {
        addDelayedShutdownHook(s, executorService, 1L, TimeUnit.SECONDS);
    }
    
    public static void addDelayedShutdownHook(final String s, final ExecutorService executorService, final long n, final TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    executorService.shutdown();
                    if (!executorService.awaitTermination(n, timeUnit)) {
                        final Logger logger = Twitter.getLogger();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(s);
                        sb.append(" did not shutdown in the allocated time. Requesting immediate shutdown.");
                        logger.d("Twitter", sb.toString());
                        executorService.shutdownNow();
                    }
                }
                catch (final InterruptedException ex) {
                    Twitter.getLogger().d("Twitter", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", s));
                    executorService.shutdownNow();
                }
            }
        }, b.h("Twitter Shutdown Hook for ", s)));
    }
    
    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(final String s) {
        final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(s));
        addDelayedShutdownHook(s, singleThreadScheduledExecutor);
        return singleThreadScheduledExecutor;
    }
    
    public static ExecutorService buildThreadPoolExecutorService(final String s) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(ExecutorUtils.CORE_POOL_SIZE, ExecutorUtils.MAXIMUM_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), getNamedThreadFactory(s));
        addDelayedShutdownHook(s, threadPoolExecutor);
        return threadPoolExecutor;
    }
    
    public static ThreadFactory getNamedThreadFactory(final String s) {
        return new ThreadFactory() {
            public final /* synthetic */ AtomicLong val$count = new AtomicLong(1L);
            
            @Override
            public Thread newThread(final Runnable runnable) {
                final Thread thread = Executors.defaultThreadFactory().newThread(runnable);
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(this.val$count.getAndIncrement());
                thread.setName(sb.toString());
                return thread;
            }
        };
    }
}
