// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import af2.e0;
import af2.c;
import af2.e;
import ff2.o;
import af2.g0;
import af2.a;

public final class SingleFlatMapCompletable<T> extends a
{
    public final g0<T> f;
    public final o<? super T, ? extends e> g;
    
    public SingleFlatMapCompletable(final g0<T> f, final o<? super T, ? extends e> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void w(final c c) {
        final FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(c, (ff2.o<? super Object, ? extends e>)this.g);
        c.onSubscribe((df2.a)flatMapCompletableObserver);
        this.f.a((e0)flatMapCompletableObserver);
    }
    
    public static final class FlatMapCompletableObserver<T> extends AtomicReference<df2.a> implements e0<T>, c, df2.a
    {
        private static final long serialVersionUID = -2177128922851101253L;
        public final c downstream;
        public final o<? super T, ? extends e> mapper;
        
        public FlatMapCompletableObserver(final c downstream, final o<? super T, ? extends e> mapper) {
            this.downstream = downstream;
            this.mapper = mapper;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((df2.a)this.get());
        }
        
        public void onComplete() {
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
        }
        
        public void onSubscribe(final df2.a a) {
            DisposableHelper.replace((AtomicReference)this, a);
        }
        
        public void onSuccess(final T t) {
            try {
                final Object apply = this.mapper.apply((Object)t);
                hf2.a.b(apply, "The mapper returned a null CompletableSource");
                final e e = (e)apply;
                if (!this.isDisposed()) {
                    e.a((c)this);
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.onError(t2);
            }
        }
    }
}
