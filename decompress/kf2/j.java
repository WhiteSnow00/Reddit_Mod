// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import af2.c;
import io.reactivex.internal.functions.Functions$o;
import io.reactivex.internal.functions.Functions;
import ff2.g;
import af2.e;
import af2.a;

public final class j extends af2.a
{
    public final e f;
    public final g<? super df2.a> g;
    public final g<? super Throwable> h;
    public final ff2.a i;
    public final ff2.a j;
    public final ff2.a k;
    public final ff2.a l;
    
    public j(final e f, final g g, final g h, final ff2.a i, final ff2.a k) {
        final Functions$o c = Functions.c;
        this.f = f;
        this.g = (g<? super df2.a>)g;
        this.h = (g<? super Throwable>)h;
        this.i = i;
        this.j = (ff2.a)c;
        this.k = k;
        this.l = (ff2.a)c;
    }
    
    @Override
    public final void w(final c c) {
        this.f.a((c)new a(c));
    }
    
    public final class a implements c, df2.a
    {
        public final c f;
        public df2.a g;
        public final j h;
        
        public a(final j h, final c f) {
            this.h = h;
            this.f = f;
        }
        
        public final void dispose() {
            try {
                this.h.l.run();
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                RxJavaPlugins.onError(t);
            }
            this.g.dispose();
        }
        
        public final boolean isDisposed() {
            return this.g.isDisposed();
        }
        
        public final void onComplete() {
            if (this.g == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.h.i.run();
                this.h.j.run();
                this.f.onComplete();
                try {
                    this.h.k.run();
                }
                finally {
                    final Throwable t;
                    xd.a.t1(t);
                    RxJavaPlugins.onError(t);
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.f.onError(t2);
            }
        }
        
        public final void onError(final Throwable t) {
            if (this.g == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(t);
                return;
            }
            CompositeException ex = null;
            try {
                this.h.h.accept((Object)t);
                this.h.j.run();
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                ex = new CompositeException(new Throwable[] { t, t2 });
            }
            this.f.onError((Throwable)ex);
            try {
                this.h.k.run();
            }
            finally {
                xd.a.t1(t);
                RxJavaPlugins.onError(t);
            }
        }
        
        public final void onSubscribe(final df2.a g) {
            try {
                this.h.g.accept((Object)g);
                if (DisposableHelper.validate(this.g, g)) {
                    this.g = g;
                    this.f.onSubscribe((df2.a)this);
                }
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                g.dispose();
                this.g = (df2.a)DisposableHelper.DISPOSED;
                EmptyDisposable.error(t, this.f);
            }
        }
    }
}
