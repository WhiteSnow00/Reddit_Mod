// 
// Decompiled by Procyon v0.6.0
// 

package yc2;

import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;

public final class b
{
    public ScheduledExecutorService a;
    public CountDownLatch b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final ArrayList e;
    
    public b() {
        this.a = Executors.newSingleThreadScheduledExecutor();
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new ArrayList();
    }
    
    public final void a() {
        final StringBuilder r = a.r("__ cancelAll size : ");
        r.append(this.e.size());
        ec2.a.a(r.toString());
        synchronized (this.e) {
            final Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((Future)iterator.next()).cancel(false);
            }
            this.e.clear();
        }
    }
    
    public final void b(final long n) throws InterruptedException {
        synchronized (this) {
            if (!this.c.getAndSet(false)) {
                if (this.d.getAndSet(true)) {
                    return;
                }
                try {
                    this.b = new CountDownLatch(1);
                    Object o = this.e;
                    synchronized (o) {
                        this.e.add(this.a.schedule(new Runnable() {
                            @Override
                            public final void run() {
                                final StringBuilder r = a.r("__ timeout : ");
                                r.append(yc2.b.this.e.size());
                                ec2.a.a(r.toString());
                                yc2.b.this.c.set(false);
                                final CountDownLatch b = yc2.b.this.b;
                                if (b != null) {
                                    b.countDown();
                                }
                            }
                        }, n, TimeUnit.MILLISECONDS));
                        monitorexit(o);
                        this.b.await();
                        o = this.b;
                        if (o != null) {
                            ((CountDownLatch)o).countDown();
                            this.b = null;
                        }
                        this.d.set(false);
                        this.a();
                        if (!this.c.getAndSet(false)) {
                            return;
                        }
                        o = new InterruptedException("CancelableThreadHolder thread has been interrupted");
                        throw o;
                    }
                }
                finally {
                    final CountDownLatch b = this.b;
                    if (b != null) {
                        b.countDown();
                        this.b = null;
                    }
                    this.d.set(false);
                    this.a();
                }
            }
            throw new InterruptedException("CancelableThreadHolder thread has been interrupted");
        }
    }
}
