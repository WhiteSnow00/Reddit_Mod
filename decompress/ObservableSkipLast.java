// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import ff2.a0;
import ff2.y;
import sf2.a;

public final class ObservableSkipLast<T> extends a<T, T>
{
    public final int g;
    
    public ObservableSkipLast(final y<T> y, final int g) {
        super((y)y);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new SkipLastObserver((ff2.a0<? super Object>)a0, this.g));
    }
    
    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements a0<T>, if2.a
    {
        private static final long serialVersionUID = -3807491841935125653L;
        public final a0<? super T> downstream;
        public final int skip;
        public if2.a upstream;
        
        public SkipLastObserver(final a0<? super T> downstream, final int skip) {
            super(skip);
            this.downstream = downstream;
            this.skip = skip;
        }
        
        public void dispose() {
            this.upstream.dispose();
        }
        
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
        
        public void onComplete() {
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            if (this.skip == this.size()) {
                this.downstream.onNext(this.poll());
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
