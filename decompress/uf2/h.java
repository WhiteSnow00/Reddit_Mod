// 
// Decompiled by Procyon v0.6.0
// 

package uf2;

import if2.a;
import ff2.e0;
import kf2.g;
import ff2.g0;
import ff2.c0;

public final class h<T> extends c0<T>
{
    public final g0<T> f;
    public final g<? super T> g;
    
    public h(final g0<T> f, final g<? super T> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.b((e0)new a(e0));
    }
    
    public final class a implements e0<T>
    {
        public final e0<? super T> f;
        
        public a(final e0<? super T> f) {
            this.f = f;
        }
        
        public final void onError(final Throwable t) {
            this.f.onError(t);
        }
        
        public final void onSubscribe(final if2.a a) {
            this.f.onSubscribe(a);
        }
        
        public final void onSuccess(final T t) {
            try {
                h.this.g.accept((Object)t);
                this.f.onSuccess((Object)t);
            }
            finally {
                final Throwable t2;
                ej2.c0.i4(t2);
                this.f.onError(t2);
            }
        }
    }
}
