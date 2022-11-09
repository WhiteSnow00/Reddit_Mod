// 
// Decompiled by Procyon v0.6.0
// 

package h9;

import com.bumptech.glide.load.DataSource;
import java.util.concurrent.CancellationException;
import l9.j;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import i9.i;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;

public final class d<R> implements b<R>, e<R>
{
    public final int f;
    public final int g;
    public R h;
    public c i;
    public boolean j;
    public boolean k;
    public boolean l;
    public GlideException m;
    
    static {
        new d.d$a();
    }
    
    public d(final int f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    public final void b(final c i) {
        synchronized (this) {
            this.i = i;
        }
    }
    
    public final void c(final Drawable drawable) {
    }
    
    public final boolean cancel(final boolean b) {
        synchronized (this) {
            if (this.isDone()) {
                return false;
            }
            this.j = true;
            this.notifyAll();
            c i = null;
            if (b) {
                i = this.i;
                this.i = null;
            }
            monitorexit(this);
            if (i != null) {
                i.clear();
            }
            return true;
        }
    }
    
    public final void d(final R r, final j9.d<? super R> d) {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final void e(final i i) {
    }
    
    public final void f(final Drawable drawable) {
    }
    
    public final void g(final i i) {
        i.b(this.f, this.g);
    }
    
    public final R get() throws InterruptedException, ExecutionException {
        try {
            return this.i(null);
        }
        catch (final TimeoutException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final R get(final long n, final TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.i(timeUnit.toMillis(n));
    }
    
    public final c getRequest() {
        synchronized (this) {
            return this.i;
        }
    }
    
    public final void h(final Drawable drawable) {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final R i(final Long n) throws ExecutionException, InterruptedException, TimeoutException {
        synchronized (this) {
            if (!this.isDone() && !l9.j.h()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
            if (this.j) {
                throw new CancellationException();
            }
            if (this.l) {
                throw new ExecutionException((Throwable)this.m);
            }
            if (this.k) {
                return this.h;
            }
            if (n == null) {
                this.wait(0L);
            }
            else if (n > 0L) {
                for (long n2 = System.currentTimeMillis(), n3 = n + n2; !this.isDone() && n2 < n3; n2 = System.currentTimeMillis()) {
                    this.wait(n3 - n2);
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.l) {
                throw new ExecutionException((Throwable)this.m);
            }
            if (this.j) {
                throw new CancellationException();
            }
            if (this.k) {
                return this.h;
            }
            throw new TimeoutException();
        }
    }
    
    public final boolean isCancelled() {
        synchronized (this) {
            return this.j;
        }
    }
    
    public final boolean isDone() {
        synchronized (this) {
            return this.j || this.k || this.l;
        }
    }
    
    public final void onDestroy() {
    }
    
    public final boolean onLoadFailed(final GlideException m, final Object o, final i9.j<R> j, final boolean b) {
        synchronized (this) {
            this.l = true;
            this.m = m;
            this.notifyAll();
            return false;
        }
    }
    
    public final boolean onResourceReady(final R h, final Object o, final i9.j<R> j, final DataSource dataSource, final boolean b) {
        synchronized (this) {
            this.k = true;
            this.h = h;
            this.notifyAll();
            return false;
        }
    }
    
    public final void onStart() {
    }
    
    public final void onStop() {
    }
}
