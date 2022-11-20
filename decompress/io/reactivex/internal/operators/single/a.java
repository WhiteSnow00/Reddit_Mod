// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import af2.e0;
import ff2.o;
import af2.g0;
import af2.c0;

public final class a<T, R> extends c0<R>
{
    public final g0<? extends T> f;
    public final o<? super T, ? extends R> g;
    
    public a(final g0<? extends T> f, final o<? super T, ? extends R> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super R> e0) {
        this.f.a((e0)new a((af2.e0<? super Object>)e0, (ff2.o<? super Object, ?>)this.g));
    }
    
    public static final class a<T, R> implements e0<T>
    {
        public final e0<? super R> f;
        public final o<? super T, ? extends R> g;
        
        public a(final e0<? super R> f, final o<? super T, ? extends R> g) {
            this.f = f;
            this.g = g;
        }
        
        public final void onError(final Throwable t) {
            this.f.onError(t);
        }
        
        public final void onSubscribe(final df2.a a) {
            this.f.onSubscribe(a);
        }
        
        public final void onSuccess(final T t) {
            try {
                final Object apply = this.g.apply((Object)t);
                hf2.a.b(apply, "The mapper function returned a null value.");
                this.f.onSuccess(apply);
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.onError(t2);
            }
        }
    }
}
