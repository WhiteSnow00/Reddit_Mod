// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.exceptions.CompositeException;
import jf2.l;
import io.reactivex.internal.disposables.DisposableHelper;
import df2.a;
import java.util.concurrent.atomic.AtomicReference;
import af2.e0;
import ff2.o;
import af2.g0;
import af2.c0;

public final class SingleResumeNext<T> extends c0<T>
{
    public final g0<? extends T> f;
    public final o<? super Throwable, ? extends g0<? extends T>> g;
    
    public SingleResumeNext(final g0<? extends T> f, final o<? super Throwable, ? extends g0<? extends T>> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.a((e0)new ResumeMainSingleObserver((af2.e0<? super Object>)e0, this.g));
    }
    
    public static final class ResumeMainSingleObserver<T> extends AtomicReference<a> implements e0<T>, a
    {
        private static final long serialVersionUID = -5314538511045349925L;
        public final e0<? super T> downstream;
        public final o<? super Throwable, ? extends g0<? extends T>> nextFunction;
        
        public ResumeMainSingleObserver(final e0<? super T> downstream, final o<? super Throwable, ? extends g0<? extends T>> nextFunction) {
            this.downstream = downstream;
            this.nextFunction = nextFunction;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a)this.get());
        }
        
        public void onError(final Throwable t) {
            try {
                final Object apply = this.nextFunction.apply((Object)t);
                hf2.a.b(apply, "The nextFunction returned a null SingleSource.");
                ((g0)apply).a((e0)new l(this.downstream, this));
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.downstream.onError((Throwable)new CompositeException(new Throwable[] { t, t2 }));
            }
        }
        
        public void onSubscribe(final a a) {
            if (DisposableHelper.setOnce((AtomicReference)this, a)) {
                this.downstream.onSubscribe((a)this);
            }
        }
        
        public void onSuccess(final T t) {
            this.downstream.onSuccess((Object)t);
        }
    }
}
