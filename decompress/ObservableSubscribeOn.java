// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import ff2.a0;
import ff2.y;
import ff2.b0;
import sf2.a;

public final class ObservableSubscribeOn<T> extends sf2.a<T, T>
{
    public final b0 g;
    
    public ObservableSubscribeOn(final y<T> y, final b0 g) {
        super((y)y);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver((a0<? super T>)a0);
        a0.onSubscribe((if2.a)subscribeOnObserver);
        subscribeOnObserver.setDisposable(this.g.c((Runnable)new a(subscribeOnObserver)));
    }
    
    public static final class SubscribeOnObserver<T> extends AtomicReference<if2.a> implements a0<T>, if2.a
    {
        private static final long serialVersionUID = 8094547886072529208L;
        public final a0<? super T> downstream;
        public final AtomicReference<if2.a> upstream;
        
        public SubscribeOnObserver(final a0<? super T> downstream) {
            this.downstream = downstream;
            this.upstream = new AtomicReference<if2.a>();
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((if2.a)this.get());
        }
        
        public void onComplete() {
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            this.downstream.onNext((Object)t);
        }
        
        public void onSubscribe(final if2.a a) {
            DisposableHelper.setOnce((AtomicReference)this.upstream, a);
        }
        
        public void setDisposable(final if2.a a) {
            DisposableHelper.setOnce((AtomicReference)this, a);
        }
    }
    
    public final class a implements Runnable
    {
        public final SubscribeOnObserver<T> f;
        
        public a(final SubscribeOnObserver<T> f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            ObservableSubscribeOn.this.f.subscribe((a0)this.f);
        }
    }
}
