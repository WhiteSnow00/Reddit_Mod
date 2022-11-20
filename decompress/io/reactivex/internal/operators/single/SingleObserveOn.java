// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import df2.a;
import java.util.concurrent.atomic.AtomicReference;
import af2.e0;
import af2.b0;
import af2.g0;
import af2.c0;

public final class SingleObserveOn<T> extends c0<T>
{
    public final g0<T> f;
    public final b0 g;
    
    public SingleObserveOn(final g0<T> f, final b0 g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.a((e0)new ObserveOnSingleObserver((af2.e0<? super Object>)e0, this.g));
    }
    
    public static final class ObserveOnSingleObserver<T> extends AtomicReference<a> implements e0<T>, a, Runnable
    {
        private static final long serialVersionUID = 3528003840217436037L;
        public final e0<? super T> downstream;
        public Throwable error;
        public final b0 scheduler;
        public T value;
        
        public ObserveOnSingleObserver(final e0<? super T> downstream, final b0 scheduler) {
            this.downstream = downstream;
            this.scheduler = scheduler;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a)this.get());
        }
        
        public void onError(final Throwable error) {
            this.error = error;
            DisposableHelper.replace((AtomicReference)this, this.scheduler.c((Runnable)this));
        }
        
        public void onSubscribe(final a a) {
            if (DisposableHelper.setOnce((AtomicReference)this, a)) {
                this.downstream.onSubscribe((a)this);
            }
        }
        
        public void onSuccess(final T value) {
            this.value = value;
            DisposableHelper.replace((AtomicReference)this, this.scheduler.c((Runnable)this));
        }
        
        public void run() {
            final Throwable error = this.error;
            if (error != null) {
                this.downstream.onError(error);
            }
            else {
                this.downstream.onSuccess((Object)this.value);
            }
        }
    }
}
