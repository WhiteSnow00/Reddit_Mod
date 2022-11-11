// 
// Decompiled by Procyon v0.6.0
// 

package uf2;

import if2.a;
import io.reactivex.exceptions.CompositeException;
import ff2.e0;
import kf2.o;
import ff2.g0;
import ff2.c0;

public final class m<T> extends c0<T>
{
    public final g0<? extends T> f;
    public final o<? super Throwable, ? extends T> g;
    public final T h;
    
    public m(final g0<? extends T> f, final o<? super Throwable, ? extends T> g, final T h) {
        this.f = f;
        this.g = g;
        this.h = h;
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
            final m g = m.this;
            final o<? super Throwable, ? extends T> g2 = g.g;
            final T h;
            Label_0064: {
                if (g2 != null) {
                    try {
                        g2.apply((Object)t);
                        break Label_0064;
                    }
                    finally {
                        ej2.c0.i4((Throwable)h);
                        this.f.onError((Throwable)new CompositeException(new Throwable[] { t, (Throwable)h }));
                        return;
                    }
                }
                h = g.h;
            }
            if (h == null) {
                final NullPointerException ex = new NullPointerException("Value supplied was null");
                ex.initCause(t);
                this.f.onError((Throwable)ex);
                return;
            }
            this.f.onSuccess((Object)h);
        }
        
        public final void onSubscribe(final if2.a a) {
            this.f.onSubscribe(a);
        }
        
        public final void onSuccess(final T t) {
            this.f.onSuccess((Object)t);
        }
    }
}
