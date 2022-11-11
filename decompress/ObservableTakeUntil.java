// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import lw0.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.a0;
import ff2.y;
import sf2.a;

public final class ObservableTakeUntil<T, U> extends a<T, T>
{
    public final y<? extends U> g;
    
    public ObservableTakeUntil(final y<T> y, final y<? extends U> g) {
        super((y)y);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver((a0<? super T>)a0);
        a0.onSubscribe((if2.a)takeUntilMainObserver);
        this.g.subscribe((a0)takeUntilMainObserver.otherObserver);
        super.f.subscribe((a0)takeUntilMainObserver);
    }
    
    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements a0<T>, if2.a
    {
        private static final long serialVersionUID = 1418547743690811973L;
        public final a0<? super T> downstream;
        public final AtomicThrowable error;
        public final OtherObserver otherObserver;
        public final AtomicReference<if2.a> upstream;
        
        public TakeUntilMainObserver(final a0<? super T> downstream) {
            this.downstream = downstream;
            this.upstream = new AtomicReference<if2.a>();
            this.otherObserver = new OtherObserver();
            this.error = new AtomicThrowable();
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            DisposableHelper.dispose((AtomicReference)this.otherObserver);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((if2.a)this.upstream.get());
        }
        
        public void onComplete() {
            DisposableHelper.dispose((AtomicReference)this.otherObserver);
            b.A1((a0)this.downstream, (AtomicInteger)this, this.error);
        }
        
        public void onError(final Throwable t) {
            DisposableHelper.dispose((AtomicReference)this.otherObserver);
            b.C1((a0)this.downstream, t, (AtomicInteger)this, this.error);
        }
        
        public void onNext(final T t) {
            b.F1((a0)this.downstream, (Object)t, (AtomicInteger)this, this.error);
        }
        
        public void onSubscribe(final if2.a a) {
            DisposableHelper.setOnce((AtomicReference)this.upstream, a);
        }
        
        public void otherComplete() {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            b.A1((a0)this.downstream, (AtomicInteger)this, this.error);
        }
        
        public void otherError(final Throwable t) {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            b.C1((a0)this.downstream, t, (AtomicInteger)this, this.error);
        }
        
        public final class OtherObserver extends AtomicReference<if2.a> implements a0<U>
        {
            private static final long serialVersionUID = -8693423678067375039L;
            
            public void onComplete() {
                TakeUntilMainObserver.this.otherComplete();
            }
            
            public void onError(final Throwable t) {
                TakeUntilMainObserver.this.otherError(t);
            }
            
            public void onNext(final U u) {
                DisposableHelper.dispose((AtomicReference)this);
                TakeUntilMainObserver.this.otherComplete();
            }
            
            public void onSubscribe(final if2.a a) {
                DisposableHelper.setOnce((AtomicReference)this, a);
            }
        }
    }
}
