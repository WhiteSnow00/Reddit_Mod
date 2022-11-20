// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import df2.a;
import java.util.concurrent.atomic.AtomicReference;
import af2.e0;
import af2.p;
import af2.r;
import ff2.o;
import af2.g0;
import af2.n;

public final class SingleFlatMapMaybe<T, R> extends n<R>
{
    public final g0<? extends T> f;
    public final o<? super T, ? extends r<? extends R>> g;
    
    public SingleFlatMapMaybe(final g0<? extends T> f, final o<? super T, ? extends r<? extends R>> g) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void t(final p<? super R> p) {
        this.f.a((e0)new FlatMapSingleObserver((af2.p<? super Object>)p, (ff2.o<? super Object, ? extends af2.r<?>>)this.g));
    }
    
    public static final class FlatMapSingleObserver<T, R> extends AtomicReference<df2.a> implements e0<T>, df2.a
    {
        private static final long serialVersionUID = -5843758257109742742L;
        public final p<? super R> downstream;
        public final o<? super T, ? extends r<? extends R>> mapper;
        
        public FlatMapSingleObserver(final p<? super R> downstream, final o<? super T, ? extends r<? extends R>> mapper) {
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
                hf2.a.b(apply, "The mapper returned a null MaybeSource");
                final r r = (r)apply;
                if (!this.isDisposed()) {
                    r.a((p)new a(this.downstream, this));
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.onError(t2);
            }
        }
    }
    
    public static final class a<R> implements p<R>
    {
        public final AtomicReference<df2.a> f;
        public final p<? super R> g;
        
        public a(final p g, final AtomicReference f) {
            this.f = f;
            this.g = (p<? super R>)g;
        }
        
        public final void onComplete() {
            this.g.onComplete();
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
