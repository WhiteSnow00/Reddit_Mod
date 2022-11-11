// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import ff2.a0;
import ff2.y;
import sf2.a;

public final class ObservableTakeLast<T> extends a<T, T>
{
    public final int g;
    
    public ObservableTakeLast(final y<T> y, final int g) {
        super((y)y);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new TakeLastObserver((ff2.a0<? super Object>)a0, this.g));
    }
    
    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements a0<T>, if2.a
    {
        private static final long serialVersionUID = 7240042530241604978L;
        public volatile boolean cancelled;
        public final int count;
        public final a0<? super T> downstream;
        public if2.a upstream;
        
        public TakeLastObserver(final a0<? super T> downstream, final int count) {
            this.downstream = downstream;
            this.count = count;
        }
        
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
            }
        }
        
        public boolean isDisposed() {
            return this.cancelled;
        }
        
        public void onComplete() {
            final a0<? super T> downstream = this.downstream;
            while (!this.cancelled) {
                final Object poll = this.poll();
                if (poll == null) {
                    if (!this.cancelled) {
                        downstream.onComplete();
                    }
                    return;
                }
                downstream.onNext(poll);
            }
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            if (this.count == this.size()) {
                this.poll();
            }
            this.offer(t);
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
            }
        }
    }
}
