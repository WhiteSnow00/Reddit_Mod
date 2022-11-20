// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import af2.e0;
import ff2.a;
import af2.g0;
import af2.c0;

public final class SingleDoFinally<T> extends c0<T>
{
    public final g0<T> f;
    public final a g;
    
    public SingleDoFinally(final g0<T> f, final a g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.a((e0)new DoFinallyObserver((af2.e0<? super Object>)e0, this.g));
    }
    
    public static final class DoFinallyObserver<T> extends AtomicInteger implements e0<T>, df2.a
    {
        private static final long serialVersionUID = 4109457741734051389L;
        public final e0<? super T> downstream;
        public final a onFinally;
        public df2.a upstream;
        
        public DoFinallyObserver(final e0<? super T> downstream, final a onFinally) {
            this.downstream = downstream;
            this.onFinally = onFinally;
        }
        
        public void dispose() {
            this.upstream.dispose();
            this.runFinally();
        }
        
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
            this.runFinally();
        }
        
        public void onSubscribe(final df2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((df2.a)this);
            }
        }
        
        public void onSuccess(final T t) {
            this.downstream.onSuccess((Object)t);
            this.runFinally();
        }
        
        public void runFinally() {
            if (this.compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                }
                finally {
                    final Throwable t;
                    xd.a.t1(t);
                    RxJavaPlugins.onError(t);
                }
            }
        }
    }
}
