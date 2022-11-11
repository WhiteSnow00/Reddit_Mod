// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import yd.a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class g4 extends t4
{
    public static final AtomicLong p;
    public f4 h;
    public f4 i;
    public final PriorityBlockingQueue j;
    public final LinkedBlockingQueue k;
    public final d4 l;
    public final d4 m;
    public final Object n;
    public final Semaphore o;
    
    static {
        p = new AtomicLong(Long.MIN_VALUE);
    }
    
    public g4(final h4 h4) {
        super(h4);
        this.n = new Object();
        this.o = new Semaphore(2);
        this.j = new PriorityBlockingQueue();
        this.k = new LinkedBlockingQueue();
        this.l = new d4(this, "Thread death: Uncaught exception on worker thread");
        this.m = new d4(this, "Thread death: Uncaught exception on network thread");
    }
    
    public final void C() {
        if (Thread.currentThread() == this.i) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }
    
    public final Object D(AtomicReference value, final long n, final String s, final Runnable runnable) {
        synchronized (value) {
            ((h4)((w)this).f).a().G(runnable);
            try {
                value.wait(n);
                monitorexit(value);
                value = ((AtomicReference)value).get();
                if (value == null) {
                    ((h4)((w)this).f).f().n.a("Timed out waiting for ".concat(s));
                }
                return value;
            }
            catch (final InterruptedException ex) {
                final a3 n2 = ((h4)((w)this).f).f().n;
                final StringBuilder sb = new StringBuilder();
                sb.append("Interrupted waiting for ");
                sb.append(s);
                n2.a(sb.toString());
                return null;
            }
        }
    }
    
    public final e4 E(final Callable callable) throws IllegalStateException {
        this.A();
        final e4 e4 = new e4(this, callable, false);
        if (Thread.currentThread() == this.h) {
            if (!this.j.isEmpty()) {
                ((h4)((w)this).f).f().n.a("Callable skipped the worker queue.");
            }
            e4.run();
        }
        else {
            this.J(e4);
        }
        return e4;
    }
    
    public final void F(final Runnable runnable) throws IllegalStateException {
        this.A();
        final e4 e4 = new e4(this, runnable, false, "Task exception on network thread");
        synchronized (this.n) {
            this.k.add(e4);
            final f4 i = this.i;
            if (i == null) {
                ((Thread)(this.i = new f4(this, "Measurement Network", (BlockingQueue)this.k))).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.m);
                ((Thread)this.i).start();
                return;
            }
            synchronized (i.f) {
                i.f.notifyAll();
            }
        }
    }
    
    public final void G(final Runnable runnable) throws IllegalStateException {
        this.A();
        a.S0((Object)runnable);
        this.J(new e4(this, runnable, false, "Task exception on worker thread"));
    }
    
    public final void H(final Runnable runnable) throws IllegalStateException {
        this.A();
        this.J(new e4(this, runnable, true, "Task exception on worker thread"));
    }
    
    public final boolean I() {
        return Thread.currentThread() == this.h;
    }
    
    public final void J(e4 h) {
        synchronized (this.n) {
            this.j.add(h);
            final f4 h2 = this.h;
            if (h2 == null) {
                h = (e4)new f4(this, "Measurement Worker", (BlockingQueue)this.j);
                ((Thread)(this.h = (f4)h)).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.l);
                ((Thread)this.h).start();
                return;
            }
            synchronized (h2.f) {
                h2.f.notifyAll();
            }
        }
    }
    
    public final void y() {
        if (Thread.currentThread() == this.h) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
    
    public final boolean z() {
        return false;
    }
}
