// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ej2.c0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import ag2.g;
import ff2.a0;
import ff2.y;
import kf2.c;
import sf2.a;

public final class ObservableWithLatestFrom<T, U, R> extends sf2.a<T, R>
{
    public final c<? super T, ? super U, ? extends R> g;
    public final y<? extends U> h;
    
    public ObservableWithLatestFrom(final y y, final y h, final c g) {
        super(y);
        this.g = (c<? super T, ? super U, ? extends R>)g;
        this.h = (y<? extends U>)h;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        final g g = new g((a0)a0);
        final WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver((ff2.a0<? super Object>)g, (kf2.c<? super Object, ? super Object, ?>)this.g);
        g.onSubscribe((if2.a)withLatestFromObserver);
        this.h.subscribe((a0)new a(withLatestFromObserver));
        super.f.subscribe((a0)withLatestFromObserver);
    }
    
    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements a0<T>, if2.a
    {
        private static final long serialVersionUID = -312246233408980075L;
        public final c<? super T, ? super U, ? extends R> combiner;
        public final a0<? super R> downstream;
        public final AtomicReference<if2.a> other;
        public final AtomicReference<if2.a> upstream;
        
        public WithLatestFromObserver(final a0<? super R> downstream, final c<? super T, ? super U, ? extends R> combiner) {
            this.upstream = new AtomicReference<if2.a>();
            this.other = new AtomicReference<if2.a>();
            this.downstream = downstream;
            this.combiner = combiner;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            DisposableHelper.dispose((AtomicReference)this.other);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((if2.a)this.upstream.get());
        }
        
        public void onComplete() {
            DisposableHelper.dispose((AtomicReference)this.other);
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            DisposableHelper.dispose((AtomicReference)this.other);
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            final Object value = this.get();
            if (value != null) {
                try {
                    final Object apply = this.combiner.apply((Object)t, value);
                    mf2.a.b(apply, "The combiner returned a null value");
                    this.downstream.onNext(apply);
                }
                finally {
                    final Throwable t2;
                    c0.i4(t2);
                    this.dispose();
                    this.downstream.onError(t2);
                }
            }
        }
        
        public void onSubscribe(final if2.a a) {
            DisposableHelper.setOnce((AtomicReference)this.upstream, a);
        }
        
        public void otherError(final Throwable t) {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            this.downstream.onError(t);
        }
        
        public boolean setOther(final if2.a a) {
            return DisposableHelper.setOnce((AtomicReference)this.other, a);
        }
    }
    
    public final class a implements a0<U>
    {
        public final WithLatestFromObserver<T, U, R> f;
        
        public a(final WithLatestFromObserver f) {
            this.f = f;
        }
        
        public final void onComplete() {
        }
        
        public final void onError(final Throwable t) {
            this.f.otherError(t);
        }
        
        public final void onNext(final U u) {
            this.f.lazySet((U)u);
        }
        
        public final void onSubscribe(final if2.a other) {
            this.f.setOther(other);
        }
    }
}
