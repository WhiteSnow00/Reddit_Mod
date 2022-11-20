// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import xd.a;
import af2.c;
import af2.e0;
import java.util.concurrent.Callable;
import af2.e;
import af2.c0;

public final class m<T> extends c0<T>
{
    public final e f;
    public final Callable<? extends T> g;
    public final T h;
    
    public m(final e f, final Callable<? extends T> g, final T h) {
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.a((c)new a(e0));
    }
    
    public final class a implements c
    {
        public final e0<? super T> f;
        public final m g;
        
        public a(final m g, final e0<? super T> f) {
            this.g = g;
            this.f = f;
        }
        
        public final void onComplete() {
            final m g = this.g;
            final Callable<? extends T> g2 = g.g;
            final T h;
            Label_0045: {
                if (g2 != null) {
                    try {
                        g2.call();
                        break Label_0045;
                    }
                    finally {
                        xd.a.t1((Throwable)h);
                        this.f.onError((Throwable)h);
                        return;
                    }
                }
                h = g.h;
            }
            if (h == null) {
                this.f.onError((Throwable)new NullPointerException("The value supplied is null"));
            }
            else {
                this.f.onSuccess((Object)h);
            }
        }
        
        public final void onError(final Throwable t) {
            this.f.onError(t);
        }
        
        public final void onSubscribe(final df2.a a) {
            this.f.onSubscribe(a);
        }
    }
}
