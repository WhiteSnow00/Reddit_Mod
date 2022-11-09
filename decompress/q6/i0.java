// 
// Decompiled by Procyon v0.6.0
// 

package q6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import androidx.appcompat.widget.a1;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;

public final class i0<T>
{
    public static ExecutorService e;
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;
    public volatile h0<T> d;
    
    static {
        i0.e = Executors.newCachedThreadPool();
    }
    
    public i0() {
        throw null;
    }
    
    public i0(final Callable<h0<T>> callable, final boolean b) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (b) {
            try {
                this.c(callable.call());
            }
            finally {
                final Throwable t;
                this.c(new h0<T>(t));
            }
        }
        else {
            i0.e.execute(new a(callable));
        }
    }
    
    public final void a(final e0 e0) {
        synchronized (this) {
            final h0<T> d = this.d;
            if (d != null) {
                final Throwable b = d.b;
                if (b != null) {
                    e0.onResult(b);
                }
            }
            this.b.add(e0);
        }
    }
    
    public final void b(final e0 e0) {
        synchronized (this) {
            final h0<T> d = this.d;
            if (d != null) {
                final T a = d.a;
                if (a != null) {
                    e0.onResult(a);
                }
            }
            this.a.add(e0);
        }
    }
    
    public final void c(final h0<T> d) {
        if (this.d == null) {
            this.d = d;
            this.c.post((Runnable)new a1(this, 4));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
    
    public final class a extends FutureTask<h0<T>>
    {
        public a(final Callable<h0<T>> callable) {
            super(callable);
        }
        
        public final void done() {
            if (this.isCancelled()) {
                return;
            }
            try {
                i0.this.c(this.get());
                return;
            }
            catch (final ExecutionException ex) {}
            catch (final InterruptedException ex2) {}
            final ExecutionException ex;
            i0.this.c(new h0<T>(ex));
        }
    }
}
