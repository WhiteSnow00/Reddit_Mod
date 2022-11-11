// 
// Decompiled by Procyon v0.6.0
// 

package uf2;

import if2.a;
import io.reactivex.exceptions.CompositeException;
import ff2.e0;
import ra.s;
import kf2.b;
import ff2.g0;
import ff2.c0;

public final class f<T> extends c0<T>
{
    public final g0<T> f;
    public final b<? super T, ? super Throwable> g;
    
    public f(final c0 f, final s g) {
        this.f = (g0<T>)f;
        this.g = (b<? super T, ? super Throwable>)g;
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
            CompositeException ex = null;
            try {
                uf2.f.this.g.accept((Object)null, (Object)t);
            }
            finally {
                final Throwable t2;
                ej2.c0.i4(t2);
                ex = new CompositeException(new Throwable[] { t, t2 });
            }
            this.f.onError((Throwable)ex);
        }
        
        public final void onSubscribe(final if2.a a) {
            this.f.onSubscribe(a);
        }
        
        public final void onSuccess(final T t) {
            try {
                uf2.f.this.g.accept((Object)t, (Object)null);
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
