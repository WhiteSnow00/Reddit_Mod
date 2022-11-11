// 
// Decompiled by Procyon v0.6.0
// 

package wf2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import if2.a;
import ff2.b0;

public final class i extends b0
{
    public static final i b;
    
    static {
        b = new i();
    }
    
    public final b0.c a() {
        return new c();
    }
    
    public final a c(final Runnable runnable) {
        RxJavaPlugins.onSchedule(runnable).run();
        return (a)EmptyDisposable.INSTANCE;
    }
    
    public final a d(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        try {
            timeUnit.sleep(n);
            RxJavaPlugins.onSchedule(runnable).run();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.onError(ex);
        }
        return (a)EmptyDisposable.INSTANCE;
    }
    
    public static final class c extends b0.c
    {
        public final PriorityBlockingQueue<i$b> f;
        public final AtomicInteger g;
        public final AtomicInteger h;
        public volatile boolean i;
        
        public c() {
            this.f = new PriorityBlockingQueue<i$b>();
            this.g = new AtomicInteger();
            this.h = new AtomicInteger();
        }
        
        @Override
        public final a b(final Runnable runnable) {
            return this.e(b0.c.a(TimeUnit.MILLISECONDS), runnable);
        }
        
        @Override
        public final a c(final Runnable runnable, long n, final TimeUnit timeUnit) {
            n = timeUnit.toMillis(n) + b0.c.a(TimeUnit.MILLISECONDS);
            return this.e(n, (Runnable)new i$a(runnable, this, n));
        }
        
        public final void dispose() {
            this.i = true;
        }
        
        public final a e(final long n, final Runnable runnable) {
            if (this.i) {
                return (a)EmptyDisposable.INSTANCE;
            }
            final i$b i$b = new i$b(runnable, Long.valueOf(n), this.h.incrementAndGet());
            this.f.add(i$b);
            if (this.g.getAndIncrement() == 0) {
                int addAndGet = 1;
                while (!this.i) {
                    final i$b i$b2 = this.f.poll();
                    if (i$b2 == null) {
                        if ((addAndGet = this.g.addAndGet(-addAndGet)) == 0) {
                            return (a)EmptyDisposable.INSTANCE;
                        }
                        continue;
                    }
                    else {
                        if (i$b2.i) {
                            continue;
                        }
                        i$b2.f.run();
                    }
                }
                this.f.clear();
                return (a)EmptyDisposable.INSTANCE;
            }
            return io.reactivex.disposables.a.c((Runnable)new c.i$c$a(this, i$b));
        }
        
        public final boolean isDisposed() {
            return this.i;
        }
    }
}
