// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import af2.e0;
import af2.c;
import af2.g0;
import af2.a;

public final class h<T> extends af2.a
{
    public final g0<T> f;
    
    public h(final g0<T> f) {
        this.f = f;
    }
    
    @Override
    public final void w(final c c) {
        this.f.a((e0)new a(c));
    }
    
    public static final class a<T> implements e0<T>
    {
        public final c f;
        
        public a(final c f) {
            this.f = f;
        }
        
        public final void onError(final Throwable t) {
            this.f.onError(t);
        }
        
        public final void onSubscribe(final df2.a a) {
            this.f.onSubscribe(a);
        }
        
        public final void onSuccess(final T t) {
            this.f.onComplete();
        }
    }
}
