// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.utils;

import ec2.a;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class TimeoutLock
{
    public final long a;
    public final TimeUnit b;
    public final ScheduledExecutorService c;
    public final CountDownLatch d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicReference<Future<?>> g;
    
    public TimeoutLock(final long a, final TimeUnit b) {
        this.c = Executors.newSingleThreadScheduledExecutor();
        this.d = new CountDownLatch(1);
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicReference<Future<?>>();
        this.a = a;
        this.b = b;
    }
    
    public final void a() throws InterruptedException, TimeoutException {
        synchronized (this) {
            ec2.a.b(">> TimeoutLock::await(%s)", new Object[] { this });
            if (this.d.getCount() == 0L) {
                this.b();
                ec2.a.a("-- return TimeoutLock already released ");
                return;
            }
            if (!this.e.getAndSet(false)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("++ isWaiting : ");
                sb.append(this.f.get());
                ec2.a.a(sb.toString());
                if (this.f.getAndSet(true)) {
                    return;
                }
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                    this.g.set(this.c.schedule(new Runnable() {
                        @Override
                        public final void run() {
                            boolean b = true;
                            ec2.a.b("++ TimeoutLock::Timeout( count=%s)", new Object[] { TimeoutLock.this.d.getCount() });
                            TimeoutLock.this.e.set(false);
                            final AtomicBoolean f = atomicBoolean;
                            if (TimeoutLock.this.d.getCount() <= 0L) {
                                b = false;
                            }
                            f.compareAndSet(false, b);
                            TimeoutLock.this.d.countDown();
                        }
                    }, this.a, this.b));
                    this.d.await();
                    this.f.set(false);
                    this.b();
                    ec2.a.b("++ await end interrupted=%s, isTimeout=%s", new Object[] { this.e, atomicBoolean.get() });
                    if (this.e.getAndSet(false)) {
                        throw new InterruptedException("a job was interrupted");
                    }
                    if (!atomicBoolean.getAndSet(false)) {
                        return;
                    }
                    throw new TimeoutException("exceed the timed out");
                }
                finally {
                    this.f.set(false);
                    this.b();
                }
            }
            throw new InterruptedException("a job was interrupted");
        }
    }
    
    public final void b() {
        final Future<?> future = this.g.getAndSet(null);
        if (future != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(">> TimeoutLock::cancel() job : ");
            sb.append(future);
            ec2.a.a(sb.toString());
            future.cancel(false);
        }
    }
    
    public final void c() {
        ec2.a.b(">> TimeoutLock::release(%s)", new Object[] { this });
        this.b();
        this.d.countDown();
    }
    
    public static class TimeoutException extends Exception
    {
        public TimeoutException(final String s) {
            super(s);
        }
    }
}
