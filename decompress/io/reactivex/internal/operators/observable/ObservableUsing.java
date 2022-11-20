// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.EmptyDisposable;
import hf2.a;
import af2.a0;
import ff2.g;
import af2.y;
import ff2.o;
import java.util.concurrent.Callable;
import af2.t;

public final class ObservableUsing<T, D> extends t<T>
{
    public final Callable<? extends D> f;
    public final o<? super D, ? extends y<? extends T>> g;
    public final g<? super D> h;
    public final boolean i;
    
    public ObservableUsing(final Callable<? extends D> f, final o<? super D, ? extends y<? extends T>> g, final g<? super D> h, final boolean i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final a0<? super T> a0) {
        try {
            final D call = (D)this.f.call();
            try {
                final Object apply = this.g.apply((Object)call);
                a.b(apply, "The sourceSupplier returned a null ObservableSource");
                ((y)apply).subscribe((a0)new ObservableUsing.ObservableUsing$UsingObserver((a0)a0, (Object)call, (g)this.h, this.i));
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                try {
                    this.h.accept((Object)call);
                    EmptyDisposable.error(t, a0);
                }
                finally {
                    final Throwable t2;
                    xd.a.t1(t2);
                    EmptyDisposable.error((Throwable)new CompositeException(new Throwable[] { t, t2 }), a0);
                }
            }
        }
        finally {
            final Throwable t3;
            xd.a.t1(t3);
            EmptyDisposable.error(t3, a0);
        }
    }
}
