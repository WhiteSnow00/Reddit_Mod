// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import df2.a;
import af2.e0;
import af2.b0;
import af2.g0;
import af2.c0;

public final class SingleSubscribeOn<T> extends c0<T>
{
    public final g0<? extends T> f;
    public final b0 g;
    
    public SingleSubscribeOn(final g0<? extends T> f, final b0 g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        final SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver((e0<? super T>)e0, (g0<? extends T>)this.f);
        e0.onSubscribe((a)subscribeOnObserver);
        subscribeOnObserver.task.replace(this.g.c((Runnable)subscribeOnObserver));
    }
    
    public static final class SubscribeOnObserver<T> extends AtomicReference<a> implements e0<T>, a, Runnable
    {
        private static final long serialVersionUID = 7000911171163930287L;
        public final e0<? super T> downstream;
        public final g0<? extends T> source;
        public final SequentialDisposable task;
        
        public SubscribeOnObserver(final e0<? super T> downstream, final g0<? extends T> source) {
            this.downstream = downstream;
            this.source = source;
            this.task = new SequentialDisposable();
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
            this.task.dispose();
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a)this.get());
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
        }
        
        public void onSubscribe(final a a) {
            DisposableHelper.setOnce((AtomicReference)this, a);
        }
        
        public void onSuccess(final T t) {
            this.downstream.onSuccess((Object)t);
        }
        
        public void run() {
            this.source.a((e0)this);
        }
    }
}
