// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import hf2.a;
import af2.e0;
import ff2.c;
import java.util.concurrent.Callable;
import nt2.b;
import af2.c0;

public final class e1<T, R> extends c0<R>
{
    public final b<T> f;
    public final Callable<R> g;
    public final c<R, ? super T, R> h;
    
    public e1(final b<T> f, final Callable<R> g, final c<R, ? super T, R> h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void G(final e0<? super R> e0) {
        try {
            final R call = this.g.call();
            a.b((Object)call, "The seedSupplier returned a null value");
            this.f.subscribe((nt2.c)new d1.a((af2.e0<? super Object>)e0, (ff2.c<Object, ? super Object, Object>)this.h, call));
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            EmptyDisposable.error(t, e0);
        }
    }
}
