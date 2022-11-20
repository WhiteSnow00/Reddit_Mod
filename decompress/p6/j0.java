// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import androidx.activity.g;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;

public final class j0<T>
{
    public static ExecutorService e;
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;
    public volatile i0<T> d;
    
    static {
        j0.e = Executors.newCachedThreadPool();
    }
    
    public j0() {
        throw null;
    }
    
    public j0(final Callable<i0<T>> callable, final boolean b) {
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
                this.c(new i0<T>(t));
            }
        }
        else {
            j0.e.execute(new a(callable));
        }
    }
    
    public final void a(final f0 f0) {
        synchronized (this) {
            final i0<T> d = this.d;
            if (d != null) {
                final Throwable b = d.b;
                if (b != null) {
                    f0.onResult(b);
                }
            }
            this.b.add(f0);
        }
    }
    
    public final void b(final f0 f0) {
        synchronized (this) {
            final i0<T> d = this.d;
            if (d != null) {
                final T a = d.a;
                if (a != null) {
                    f0.onResult(a);
                }
            }
            this.a.add(f0);
        }
    }
    
    public final void c(final i0<T> d) {
        if (this.d == null) {
            this.d = d;
            this.c.post((Runnable)new g((Object)this, 5));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
    
    public final class a extends FutureTask<i0<T>>
    {
        public final j0 f;
        
        public a(final j0 f, final Callable<i0<T>> callable) {
            this.f = f;
            super(callable);
        }
        
        public final void done() {
            if (this.isCancelled()) {
                return;
            }
            try {
                this.f.c(this.get());
                return;
            }
            catch (final ExecutionException ex) {}
            catch (final InterruptedException ex2) {}
            final ExecutionException ex;
            this.f.c(new i0<T>(ex));
        }
    }
}
