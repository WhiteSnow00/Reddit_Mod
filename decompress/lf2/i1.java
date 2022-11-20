// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import df2.a;
import af2.l;
import af2.p;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.flowable.FlowableSingle;
import af2.g;
import if2.b;
import af2.n;

public final class i1<T> extends n<T> implements b<T>
{
    public final g<T> f;
    
    public i1(final g<T> f) {
        this.f = f;
    }
    
    public final g<T> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableSingle((g)this.f, (Object)null, false));
    }
    
    @Override
    public final void t(final p<? super T> p) {
        this.f.subscribe(new a<Object>(p));
    }
    
    public static final class a<T> implements l<T>, df2.a
    {
        public final p<? super T> f;
        public d g;
        public boolean h;
        public T i;
        
        public a(final p<? super T> f) {
            this.f = f;
        }
        
        public final void dispose() {
            this.g.cancel();
            this.g = (d)SubscriptionHelper.CANCELLED;
        }
        
        public final boolean isDisposed() {
            return this.g == SubscriptionHelper.CANCELLED;
        }
        
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.g = (d)SubscriptionHelper.CANCELLED;
            final T i = this.i;
            this.i = null;
            if (i == null) {
                this.f.onComplete();
            }
            else {
                this.f.onSuccess((Object)i);
            }
        }
        
        public final void onError(final Throwable t) {
            if (this.h) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.h = true;
            this.g = (d)SubscriptionHelper.CANCELLED;
            this.f.onError(t);
        }
        
        public final void onNext(final T i) {
            if (this.h) {
                return;
            }
            if (this.i != null) {
                this.h = true;
                this.g.cancel();
                this.g = (d)SubscriptionHelper.CANCELLED;
                this.f.onError((Throwable)new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.i = i;
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
