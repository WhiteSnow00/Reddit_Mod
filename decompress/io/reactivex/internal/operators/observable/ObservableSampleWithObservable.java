// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import ag2.g;
import ff2.a0;
import ff2.y;
import sf2.a;

public final class ObservableSampleWithObservable<T> extends sf2.a<T, T>
{
    public final y<?> g;
    public final boolean h;
    
    public ObservableSampleWithObservable(final y<T> y, final y<?> g, final boolean h) {
        super((y)y);
        this.g = g;
        this.h = h;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final g g = new g((a0)a0);
        if (this.h) {
            super.f.subscribe((a0)new ObservableSampleWithObservable.ObservableSampleWithObservable$SampleMainEmitLast((a0)g, (y)this.g));
        }
        else {
            super.f.subscribe((a0)new ObservableSampleWithObservable.ObservableSampleWithObservable$SampleMainNoLast((a0)g, (y)this.g));
        }
    }
    
    public abstract static class SampleMainObserver<T> extends AtomicReference<T> implements a0<T>, if2.a
    {
        private static final long serialVersionUID = -3517602651313910099L;
        public final a0<? super T> downstream;
        public final AtomicReference<if2.a> other;
        public final y<?> sampler;
        public if2.a upstream;
        
        public SampleMainObserver(final a0<? super T> downstream, final y<?> sampler) {
            this.other = new AtomicReference<if2.a>();
            this.downstream = downstream;
            this.sampler = sampler;
        }
        
        public void complete() {
            this.upstream.dispose();
            this.completion();
        }
        
        public abstract void completion();
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this.other);
            this.upstream.dispose();
        }
        
        public void emit() {
            final T andSet = this.getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext((Object)andSet);
            }
        }
        
        public void error(final Throwable t) {
            this.upstream.dispose();
            this.downstream.onError(t);
        }
        
        public boolean isDisposed() {
            return this.other.get() == DisposableHelper.DISPOSED;
        }
        
        public void onComplete() {
            DisposableHelper.dispose((AtomicReference)this.other);
            this.completion();
        }
        
        public void onError(final Throwable t) {
            DisposableHelper.dispose((AtomicReference)this.other);
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            this.lazySet(t);
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
                if (this.other.get() == null) {
                    this.sampler.subscribe((a0)new a((SampleMainObserver<Object>)this));
                }
            }
        }
        
        public abstract void run();
        
        public boolean setOther(final if2.a a) {
            return DisposableHelper.setOnce((AtomicReference)this.other, a);
        }
    }
    
    public static final class a<T> implements a0<Object>
    {
        public final SampleMainObserver<T> f;
        
        public a(final SampleMainObserver<T> f) {
            this.f = f;
        }
        
        public final void onComplete() {
            this.f.complete();
        }
        
        public final void onError(final Throwable t) {
            this.f.error(t);
        }
        
        public final void onNext(final Object o) {
            this.f.run();
        }
        
        public final void onSubscribe(final if2.a other) {
            this.f.setOther(other);
        }
    }
}
