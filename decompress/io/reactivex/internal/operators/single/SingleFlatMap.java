// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import df2.a;
import java.util.concurrent.atomic.AtomicReference;
import af2.e0;
import ff2.o;
import af2.g0;
import af2.c0;

public final class SingleFlatMap<T, R> extends c0<R>
{
    public final g0<? extends T> f;
    public final o<? super T, ? extends g0<? extends R>> g;
    
    public SingleFlatMap(final g0<? extends T> f, final o<? super T, ? extends g0<? extends R>> g) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void G(final e0<? super R> e0) {
        this.f.a((e0)new SingleFlatMapCallback((af2.e0<? super Object>)e0, (ff2.o<? super Object, ? extends af2.g0<?>>)this.g));
    }
    
    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<df2.a> implements e0<T>, df2.a
    {
        private static final long serialVersionUID = 3258103020495908596L;
        public final e0<? super R> downstream;
        public final o<? super T, ? extends g0<? extends R>> mapper;
        
        public SingleFlatMapCallback(final e0<? super R> downstream, final o<? super T, ? extends g0<? extends R>> mapper) {
            this.downstream = downstream;
            this.mapper = mapper;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((df2.a)this.get());
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
        }
        
        public void onSubscribe(final df2.a a) {
            if (DisposableHelper.setOnce((AtomicReference)this, a)) {
                this.downstream.onSubscribe((df2.a)this);
            }
        }
        
        public void onSuccess(final T t) {
            try {
                final Object apply = this.mapper.apply((Object)t);
                hf2.a.b(apply, "The single returned by the mapper is null");
                final g0 g0 = (g0)apply;
                if (!this.isDisposed()) {
                    g0.a((e0)new a(this.downstream, this));
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.downstream.onError(t2);
            }
        }
        
        public static final class a<R> implements e0<R>
        {
            public final AtomicReference<df2.a> f;
            public final e0<? super R> g;
            
            public a(final e0 g, final AtomicReference f) {
                this.f = f;
                this.g = (e0<? super R>)g;
            }
            
            public final void onError(final Throwable t) {
                this.g.onError(t);
            }
            
            public final void onSubscribe(final df2.a a) {
                DisposableHelper.replace((AtomicReference)this.f, a);
            }
            
            public final void onSuccess(final R r) {
                this.g.onSuccess((Object)r);
            }
        }
    }
}
