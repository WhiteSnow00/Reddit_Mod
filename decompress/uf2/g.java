// 
// Decompiled by Procyon v0.6.0
// 

package uf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.e0;
import if2.a;
import ff2.g0;
import ff2.c0;

public final class g<T> extends c0<T>
{
    public final g0<T> f;
    public final kf2.g<? super if2.a> g;
    
    public g(final g0<T> f, final kf2.g<? super if2.a> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.b((e0)new a((ff2.e0<? super Object>)e0, this.g));
    }
    
    public static final class a<T> implements e0<T>
    {
        public final e0<? super T> f;
        public final kf2.g<? super if2.a> g;
        public boolean h;
        
        public a(final e0<? super T> f, final kf2.g<? super if2.a> g) {
            this.f = f;
            this.g = g;
        }
        
        public final void onError(final Throwable t) {
            if (this.h) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.f.onError(t);
        }
        
        public final void onSubscribe(final if2.a a) {
            try {
                this.g.accept((Object)a);
                this.f.onSubscribe(a);
            }
            finally {
                final Throwable t;
                ej2.c0.i4(t);
                this.h = true;
                a.dispose();
                EmptyDisposable.error(t, (e0)this.f);
            }
        }
        
        public final void onSuccess(final T t) {
            if (this.h) {
                return;
            }
            this.f.onSuccess((Object)t);
        }
    }
}
