// 
// Decompiled by Procyon v0.6.0
// 

package u8;

import android.util.Log;
import android.os.StrictMode;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import android.text.TextUtils;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.Collection;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

public final class a implements ExecutorService
{
    public static final long g;
    public static volatile int h;
    public final ExecutorService f;
    
    static {
        g = TimeUnit.SECONDS.toMillis(10L);
    }
    
    public a(final ThreadPoolExecutor f) {
        this.f = f;
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) throws InterruptedException {
        return this.f.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.f.execute(runnable);
    }
    
    @Override
    public final <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f.invokeAll(collection);
    }
    
    @Override
    public final <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> collection, final long n, final TimeUnit timeUnit) throws InterruptedException {
        return this.f.invokeAll(collection, n, timeUnit);
    }
    
    @Override
    public final <T> T invokeAny(final Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f.invokeAny(collection);
    }
    
    @Override
    public final <T> T invokeAny(final Collection<? extends Callable<T>> collection, final long n, final TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f.invokeAny(collection, n, timeUnit);
    }
    
    @Override
    public final boolean isShutdown() {
        return this.f.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.f.isTerminated();
    }
    
    @Override
    public final void shutdown() {
        this.f.shutdown();
    }
    
    @Override
    public final List<Runnable> shutdownNow() {
        return this.f.shutdownNow();
    }
    
    @Override
    public final Future<?> submit(final Runnable runnable) {
        return this.f.submit(runnable);
    }
    
    @Override
    public final <T> Future<T> submit(final Runnable runnable, final T t) {
        return this.f.submit(runnable, t);
    }
    
    @Override
    public final <T> Future<T> submit(final Callable<T> callable) {
        return this.f.submit(callable);
    }
    
    @Override
    public final String toString() {
        return this.f.toString();
    }
    
    public static final class a
    {
        public final boolean a;
        public int b;
        public int c;
        public String d;
        
        public a(final boolean a) {
            this.a = a;
        }
        
        public final u8.a a() {
            if (!TextUtils.isEmpty((CharSequence)this.d)) {
                return new u8.a(new ThreadPoolExecutor(this.b, this.c, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue<Runnable>(), new b(this.d, this.a)));
            }
            final StringBuilder k = a.k("Name must be non-null and non-empty, but given: ");
            k.append(this.d);
            throw new IllegalArgumentException(k.toString());
        }
    }
    
    public static final class b implements ThreadFactory
    {
        public final String f;
        public final boolean g;
        public int h;
        
        public b(final String f, final boolean g) {
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final Thread newThread(final Runnable runnable) {
            synchronized (this) {
                final StringBuilder sb = new StringBuilder();
                sb.append("glide-");
                sb.append(this.f);
                sb.append("-thread-");
                sb.append(this.h);
                final Thread thread = new Thread(runnable, sb.toString()) {
                    @Override
                    public final void run() {
                        Process.setThreadPriority(9);
                        if (b.this.g) {
                            StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder().detectNetwork().penaltyDeath().build());
                        }
                        try {
                            super.run();
                        }
                        finally {
                            b.this.getClass();
                            final Throwable t;
                            c.a.a(t);
                        }
                    }
                };
                ++this.h;
                return thread;
            }
        }
    }
    
    public interface c
    {
        public static final a$c$a a = new c() {
            public final void a(final Throwable t) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", t);
                }
            }
        };
    }
}
