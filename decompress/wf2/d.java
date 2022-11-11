// 
// Decompiled by Procyon v0.6.0
// 

package wf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import if2.a;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.schedulers.RxThreadFactory;
import ff2.b0;

public final class d extends b0
{
    public static final RxThreadFactory c;
    public static final RxThreadFactory d;
    public static final long e;
    public static final TimeUnit f;
    public static final d$c g;
    public static final d$a h;
    public final AtomicReference<d$a> b;
    
    static {
        f = TimeUnit.SECONDS;
        e = Long.getLong("rx2.io-keep-alive-time", 60L);
        ((f)(g = new d$c((ThreadFactory)new RxThreadFactory("RxCachedThreadSchedulerShutdown")))).dispose();
        final int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5)));
        final RxThreadFactory rxThreadFactory = c = new RxThreadFactory("RxCachedThreadScheduler", max);
        d = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        final d$a d$a = h = new d$a(0L, (TimeUnit)null, (ThreadFactory)rxThreadFactory);
        d$a.h.dispose();
        final ScheduledFuture j = d$a.j;
        if (j != null) {
            j.cancel(true);
        }
        final ScheduledExecutorService i = d$a.i;
        if (i != null) {
            i.shutdownNow();
        }
    }
    
    public d() {
        this(wf2.d.c);
    }
    
    public d(final ThreadFactory threadFactory) {
        final d$a h = wf2.d.h;
        final AtomicReference b = new AtomicReference<d$a>(h);
        this.b = (AtomicReference<d$a>)b;
        final d$a d$a = new d$a(wf2.d.e, wf2.d.f, threadFactory);
        while (true) {
            while (!b.compareAndSet(h, d$a)) {
                if (b.get() != h) {
                    final boolean b2 = false;
                    if (!b2) {
                        d$a.h.dispose();
                        final ScheduledFuture j = d$a.j;
                        if (j != null) {
                            j.cancel(true);
                        }
                        final ScheduledExecutorService i = d$a.i;
                        if (i != null) {
                            i.shutdownNow();
                        }
                    }
                    return;
                }
            }
            final boolean b2 = true;
            continue;
        }
    }
    
    public final b0.c a() {
        return new b(this.b.get());
    }
    
    public static final class b extends c
    {
        public final CompositeDisposable f;
        public final d$a g;
        public final d$c h;
        public final AtomicBoolean i;
        
        public b(final d$a g) {
            this.i = new AtomicBoolean();
            this.g = g;
            this.f = new CompositeDisposable();
            Object g2 = null;
            Label_0101: {
                if (g.h.isDisposed()) {
                    g2 = wf2.d.g;
                }
                else {
                    while (!g.g.isEmpty()) {
                        final d$c d$c = g.g.poll();
                        if (d$c != null) {
                            g2 = d$c;
                            break Label_0101;
                        }
                    }
                    final d$c d$c2 = new d$c(g.k);
                    g.h.add((a)d$c2);
                    g2 = d$c2;
                }
            }
            this.h = (d$c)g2;
        }
        
        @Override
        public final a c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
            if (this.f.isDisposed()) {
                return (a)EmptyDisposable.INSTANCE;
            }
            return (a)((f)this.h).e(runnable, n, timeUnit, (lf2.a)this.f);
        }
        
        public final void dispose() {
            if (this.i.compareAndSet(false, true)) {
                this.f.dispose();
                final d$a g = this.g;
                final d$c h = this.h;
                g.getClass();
                h.h = System.nanoTime() + g.f;
                g.g.offer(h);
            }
        }
        
        public final boolean isDisposed() {
            return this.i.get();
        }
    }
}
