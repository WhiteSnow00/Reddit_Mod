// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import ff2.a0;
import if2.a;
import java.util.concurrent.atomic.AtomicReference;

public final class ObserverResourceWrapper<T> extends AtomicReference<a> implements a0<T>, a
{
    private static final long serialVersionUID = -8612022020200669122L;
    public final a0<? super T> downstream;
    public final AtomicReference<a> upstream;
    
    public ObserverResourceWrapper(final a0<? super T> downstream) {
        this.upstream = new AtomicReference<a>();
        this.downstream = downstream;
    }
    
    public void dispose() {
        DisposableHelper.dispose((AtomicReference)this.upstream);
        DisposableHelper.dispose((AtomicReference)this);
    }
    
    public boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }
    
    public void onComplete() {
        this.dispose();
        this.downstream.onComplete();
    }
    
    public void onError(final Throwable t) {
        this.dispose();
        this.downstream.onError(t);
    }
    
    public void onNext(final T t) {
        this.downstream.onNext((Object)t);
    }
    
    public void onSubscribe(final a a) {
        if (DisposableHelper.setOnce((AtomicReference)this.upstream, a)) {
            this.downstream.onSubscribe((a)this);
        }
    }
    
    public void setResource(final a a) {
        DisposableHelper.set((AtomicReference)this, a);
    }
}
