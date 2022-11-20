// 
// Decompiled by Procyon v0.6.0
// 

package we;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import mg.d0;
import java.util.concurrent.Executor;

public final class v<TResult> extends g<TResult>
{
    public final Object a;
    public final t<TResult> b;
    public boolean c;
    public volatile boolean d;
    public TResult e;
    public Exception f;
    
    public v() {
        this.a = new Object();
        this.b = (t<TResult>)new t();
    }
    
    public final void a(final Executor executor, final b b) {
        this.b.a((s)new p(executor, b));
        this.v();
    }
    
    public final void b(final Executor executor, final c c) {
        this.b.a((s)new q(executor, (we.c<Object>)c));
        this.v();
    }
    
    public final v c(final Executor executor, final d d) {
        this.b.a((s)new r(executor, d));
        this.v();
        return this;
    }
    
    public final v d(final Executor executor, final e e) {
        this.b.a((s)new n(executor, e));
        this.v();
        return this;
    }
    
    public final v e(final e e) {
        this.d((Executor)i.a, e);
        return this;
    }
    
    public final <TContinuationResult> g<TContinuationResult> f(final Executor executor, final a<TResult, TContinuationResult> a) {
        final v v = new v();
        this.b.a((s)new n(executor, a, v));
        this.v();
        return v;
    }
    
    public final <TContinuationResult> g<TContinuationResult> g(final a<TResult, TContinuationResult> a) {
        return this.f((Executor)i.a, a);
    }
    
    public final <TContinuationResult> g<TContinuationResult> h(final Executor executor, final a<TResult, g<TContinuationResult>> a) {
        final v v = new v();
        this.b.a((s)new o(executor, a, v, 0));
        this.v();
        return v;
    }
    
    public final Exception i() {
        synchronized (this.a) {
            return this.f;
        }
    }
    
    public final TResult j() {
        final Object a = this.a;
        monitorenter(a);
        while (true) {
            try {
                d0.D(this.c, "Task is not yet complete");
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                final Exception f = this.f;
                if (f == null) {
                    final TResult e = this.e;
                    monitorexit(a);
                    return e;
                }
                throw new RuntimeExecutionException((Throwable)f);
                monitorexit(a);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final <X extends Throwable> TResult k(final Class<X> clazz) throws X, Throwable {
        final Object a = this.a;
        monitorenter(a);
        while (true) {
            try {
                d0.D(this.c, "Task is not yet complete");
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (clazz.isInstance(this.f)) {
                    throw (Throwable)clazz.cast(this.f);
                }
                final Exception f = this.f;
                if (f == null) {
                    final TResult e = this.e;
                    monitorexit(a);
                    return e;
                }
                throw new RuntimeExecutionException((Throwable)f);
                monitorexit(a);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean l() {
        return this.d;
    }
    
    public final boolean m() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    public final boolean n() {
        synchronized (this.a) {
            final boolean c = this.c;
            boolean b2;
            final boolean b = b2 = false;
            if (c) {
                b2 = b;
                if (!this.d) {
                    b2 = b;
                    if (this.f == null) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
    }
    
    public final <TContinuationResult> g<TContinuationResult> o(final Executor executor, final f<TResult, TContinuationResult> f) {
        final v v = new v();
        this.b.a((s)new o(executor, f, v, 1));
        this.v();
        return v;
    }
    
    public final <TContinuationResult> g<TContinuationResult> p(final f<TResult, TContinuationResult> f) {
        final u a = i.a;
        final v v = new v();
        this.b.a((s)new o((Executor)a, f, v, 1));
        this.v();
        return v;
    }
    
    public final void q(final c c) {
        this.b.a((s)new q((Executor)i.a, (we.c<Object>)c));
        this.v();
    }
    
    public final v r(final d d) {
        this.c((Executor)i.a, d);
        return this;
    }
    
    public final void s(final Exception f) {
        if (f != null) {
            synchronized (this.a) {
                if (!this.c) {
                    this.c = true;
                    this.f = f;
                    monitorexit(this.a);
                    this.b.b((g)this);
                    return;
                }
                throw DuplicateTaskCompletionException.of((g)this);
            }
        }
        throw new NullPointerException("Exception must not be null");
    }
    
    public final void t(final TResult e) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.e = e;
                monitorexit(this.a);
                this.b.b((g)this);
                return;
            }
            throw DuplicateTaskCompletionException.of((g)this);
        }
    }
    
    public final void u() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.d = true;
            monitorexit(this.a);
            this.b.b((g)this);
        }
    }
    
    public final void v() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            monitorexit(this.a);
            this.b.b((g)this);
        }
    }
}
