// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.flowable.FlowableToList;
import io.reactivex.internal.disposables.EmptyDisposable;
import af2.l;
import hf2.a;
import af2.e0;
import java.util.concurrent.Callable;
import af2.g;
import if2.b;
import af2.c0;
import java.util.Collection;

public final class q1<T, U extends Collection<? super T>> extends c0<U> implements b<U>
{
    public final g<T> f;
    public final Callable<U> g;
    
    public q1(final g<T> f, final Callable<U> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super U> e0) {
        try {
            final Collection<? super T> call = this.g.call();
            hf2.a.b((Object)call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f.subscribe(new a<Object, Object>((af2.e0<? super Collection>)e0, call));
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            EmptyDisposable.error(t, e0);
        }
    }
    
    public final g<U> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableToList((g)this.f, (Callable)this.g));
    }
    
    public static final class a<T, U extends Collection<? super T>> implements l<T>, df2.a
    {
        public final e0<? super U> f;
        public d g;
        public U h;
        
        public a(final e0<? super U> f, final U h) {
            this.f = f;
            this.h = h;
        }
        
        public final void dispose() {
            this.g.cancel();
            this.g = (d)SubscriptionHelper.CANCELLED;
        }
        
        public final boolean isDisposed() {
            return this.g == SubscriptionHelper.CANCELLED;
        }
        
        public final void onComplete() {
            this.g = (d)SubscriptionHelper.CANCELLED;
            this.f.onSuccess((Object)this.h);
        }
        
        public final void onError(final Throwable t) {
            this.h = null;
            this.g = (d)SubscriptionHelper.CANCELLED;
            this.f.onError(t);
        }
        
        public final void onNext(final T t) {
            this.h.add(t);
        }
        
        @Override
        public final void onSubscribe(final d g) {
            if (SubscriptionHelper.validate(this.g, g)) {
                this.g = g;
                this.f.onSubscribe((df2.a)this);
                g.request(Long.MAX_VALUE);
            }
        }
    }
}
