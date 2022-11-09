// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import java.util.concurrent.Executor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

public final class b
{
    public static final b b;
    public final ExecutorService a;
    
    static {
        b = new b();
    }
    
    public b() {
        final String property = System.getProperty("java.runtime.name");
        ExecutorService cachedThreadPool;
        if (property == null || !property.toLowerCase(Locale.US).contains("android")) {
            cachedThreadPool = Executors.newCachedThreadPool();
        }
        else {
            final p6.a b = p6.a.b;
            cachedThreadPool = new ThreadPoolExecutor(p6.a.c, p6.a.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
            ((ThreadPoolExecutor)cachedThreadPool).allowCoreThreadTimeOut(true);
        }
        this.a = cachedThreadPool;
        Executors.newSingleThreadScheduledExecutor();
        new a();
    }
    
    public static final class a implements Executor
    {
        public ThreadLocal<Integer> f;
        
        public a() {
            this.f = new ThreadLocal<Integer>();
        }
        
        public final void a() {
            Integer value;
            if ((value = this.f.get()) == null) {
                value = 0;
            }
            final int n = value - 1;
            if (n == 0) {
                this.f.remove();
            }
            else {
                this.f.set(n);
            }
        }
        
        @Override
        public final void execute(final Runnable runnable) {
            Integer value;
            if ((value = this.f.get()) == null) {
                value = 0;
            }
            final int n = value + 1;
            this.f.set(n);
            Label_0058: {
                if (n > 15) {
                    break Label_0058;
                }
                try {
                    runnable.run();
                    return;
                    p6.b.b.a.execute(runnable);
                }
                finally {
                    this.a();
                }
            }
        }
    }
}
