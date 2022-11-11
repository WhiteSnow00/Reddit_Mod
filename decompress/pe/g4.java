// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.concurrent.FutureTask;
import lw0.b;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class g4 extends v4
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
    
    public final void M() {
        if (Thread.currentThread() == this.h) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
    
    @Override
    public final boolean N() {
        return false;
    }
    
    public final void Q() {
        if (Thread.currentThread() == this.i) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }
    
    public final Object R(AtomicReference value, final long n, final String s, final Runnable runnable) {
        synchronized (value) {
            ((h4)super.f).b().U(runnable);
            try {
                value.wait(n);
                monitorexit(value);
                value = ((AtomicReference)value).get();
                if (value == null) {
                    ((h4)super.f).h().n.a("Timed out waiting for ".concat(s));
                }
                return value;
            }
            catch (final InterruptedException ex) {
                final b3 n2 = ((h4)super.f).h().n;
                final StringBuilder sb = new StringBuilder();
                sb.append("Interrupted waiting for ");
                sb.append(s);
                n2.a(sb.toString());
                return null;
            }
        }
    }
    
    public final e4 S(final Callable callable) throws IllegalStateException {
        this.O();
        final e4 e4 = new e4(this, callable, false);
        if (Thread.currentThread() == this.h) {
            if (!this.j.isEmpty()) {
                ((h4)super.f).h().n.a("Callable skipped the worker queue.");
            }
            ((FutureTask)e4).run();
        }
        else {
            this.X(e4);
        }
        return e4;
    }
    
    public final void T(final Runnable runnable) throws IllegalStateException {
        this.O();
        final e4 e4 = new e4(this, runnable, false, "Task exception on network thread");
        synchronized (this.n) {
            this.k.add(e4);
            final f4 i = this.i;
            if (i == null) {
                (this.i = new f4(this, "Measurement Network", this.k)).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.m);
                this.i.start();
                return;
            }
            synchronized (i.f) {
                i.f.notifyAll();
            }
        }
    }
    
    public final void U(final Runnable runnable) throws IllegalStateException {
        this.O();
        b.R((Object)runnable);
        this.X(new e4(this, runnable, false, "Task exception on worker thread"));
    }
    
    public final void V(final Runnable runnable) throws IllegalStateException {
        this.O();
        this.X(new e4(this, runnable, true, "Task exception on worker thread"));
    }
    
    public final boolean W() {
        return Thread.currentThread() == this.h;
    }
    
    public final void X(e4 h) {
        synchronized (this.n) {
            this.j.add(h);
            final f4 h2 = this.h;
            if (h2 == null) {
                h = (e4)new f4(this, "Measurement Worker", this.j);
                (this.h = (f4)h).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.l);
                this.h.start();
                return;
            }
            synchronized (h2.f) {
                h2.f.notifyAll();
            }
        }
    }
}
