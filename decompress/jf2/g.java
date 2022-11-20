// 
// Decompiled by Procyon v0.6.0
// 

package jf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.disposables.DisposableHelper;
import df2.a;
import af2.a0;

public final class g<T> implements a0<T>, a
{
    public final a0<? super T> f;
    public final ff2.g<? super a> g;
    public final ff2.a h;
    public a i;
    
    public g(final a0<? super T> f, final ff2.g<? super a> g, final ff2.a h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void dispose() {
        final a i = this.i;
        final DisposableHelper disposed = DisposableHelper.DISPOSED;
        if (i != disposed) {
            this.i = (a)disposed;
            try {
                this.h.run();
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                RxJavaPlugins.onError(t);
            }
            i.dispose();
        }
    }
    
    public final boolean isDisposed() {
        return this.i.isDisposed();
    }
    
    public final void onComplete() {
        final a i = this.i;
        final DisposableHelper disposed = DisposableHelper.DISPOSED;
        if (i != disposed) {
            this.i = (a)disposed;
            this.f.onComplete();
        }
    }
    
    public final void onError(final Throwable t) {
        final a i = this.i;
        final DisposableHelper disposed = DisposableHelper.DISPOSED;
        if (i != disposed) {
            this.i = (a)disposed;
            this.f.onError(t);
        }
        else {
            RxJavaPlugins.onError(t);
        }
    }
    
    public final void onNext(final T t) {
        this.f.onNext((Object)t);
    }
    
    public final void onSubscribe(final a i) {
        try {
            this.g.accept((Object)i);
            if (DisposableHelper.validate(this.i, i)) {
                this.i = i;
                this.f.onSubscribe((a)this);
            }
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            i.dispose();
            this.i = (a)DisposableHelper.DISPOSED;
            EmptyDisposable.error(t, this.f);
        }
    }
}
