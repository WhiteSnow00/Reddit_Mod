// 
// Decompiled by Procyon v0.6.0
// 

package uf2;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.disposables.DisposableHelper;
import if2.a;
import ff2.e0;
import com.reddit.data.repository.q;
import kf2.g;
import ff2.g0;
import ff2.c0;

public final class c<T> extends c0<T>
{
    public final g0<T> f;
    public final g<? super T> g;
    
    public c(final c0 f, final q g) {
        this.f = (g0<T>)f;
        this.g = (g<? super T>)g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.b((e0)new a((ff2.e0<? super Object>)e0, (kf2.g<? super Object>)this.g));
    }
    
    public static final class a<T> implements e0<T>, if2.a
    {
        public final e0<? super T> f;
        public final g<? super T> g;
        public if2.a h;
        
        public a(final e0<? super T> f, final g<? super T> g) {
            this.f = f;
            this.g = g;
        }
        
        public final void dispose() {
            this.h.dispose();
        }
        
        public final boolean isDisposed() {
            return this.h.isDisposed();
        }
        
        public final void onError(final Throwable t) {
            this.f.onError(t);
        }
        
        public final void onSubscribe(final if2.a h) {
            if (DisposableHelper.validate(this.h, h)) {
                this.h = h;
                this.f.onSubscribe((if2.a)this);
            }
        }
        
        public final void onSuccess(final T t) {
            this.f.onSuccess((Object)t);
            try {
                this.g.accept((Object)t);
            }
            finally {
                final Throwable t2;
                ej2.c0.i4(t2);
                RxJavaPlugins.onError(t2);
            }
        }
    }
}
