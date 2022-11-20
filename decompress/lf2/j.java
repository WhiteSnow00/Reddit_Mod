// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.flowable.FlowableCollect;
import io.reactivex.internal.disposables.EmptyDisposable;
import af2.l;
import hf2.a;
import af2.e0;
import java.util.concurrent.Callable;
import af2.g;
import if2.b;
import af2.c0;

public final class j<T, U> extends c0<U> implements b<U>
{
    public final g<T> f;
    public final Callable<? extends U> g;
    public final ff2.b<? super U, ? super T> h;
    
    public j(final g<T> f, final Callable<? extends U> g, final ff2.b<? super U, ? super T> h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void G(final e0<? super U> e0) {
        try {
            final U call = (U)this.g.call();
            hf2.a.b((Object)call, "The initialSupplier returned a null value");
            this.f.subscribe(new a<Object, Object>((af2.e0<? super Object>)e0, call, (ff2.b<? super Object, ? super Object>)this.h));
        }
        finally {
            final Throwable t;
            EmptyDisposable.error(t, e0);
        }
    }
    
    public final g<U> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableCollect(this.f, this.g, this.h));
    }
    
    public static final class a<T, U> implements l<T>, df2.a
    {
        public final e0<? super U> f;
        public final ff2.b<? super U, ? super T> g;
        public final U h;
        public d i;
        public boolean j;
        
        public a(final e0<? super U> f, final U h, final ff2.b<? super U, ? super T> g) {
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        public final void dispose() {
            this.i.cancel();
            this.i = (d)SubscriptionHelper.CANCELLED;
        }
        
        public final boolean isDisposed() {
            return this.i == SubscriptionHelper.CANCELLED;
        }
        
        public final void onComplete() {
            if (this.j) {
                return;
            }
            this.j = true;
            this.i = (d)SubscriptionHelper.CANCELLED;
            this.f.onSuccess((Object)this.h);
        }
        
        public final void onError(final Throwable t) {
            if (this.j) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.j = true;
            this.i = (d)SubscriptionHelper.CANCELLED;
            this.f.onError(t);
        }
        
        public final void onNext(final T t) {
            if (this.j) {
                return;
            }
            try {
                this.g.accept((Object)this.h, (Object)t);
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.i.cancel();
                this.onError(t2);
            }
        }
        
        @Override
        public final void onSubscribe(final d i) {
            if (SubscriptionHelper.validate(this.i, i)) {
                this.i = i;
                this.f.onSubscribe((df2.a)this);
                i.request(Long.MAX_VALUE);
            }
        }
    }
}
