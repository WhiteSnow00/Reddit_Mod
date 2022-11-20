// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import df2.a;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.flowable.FlowableCount;
import af2.e0;
import af2.g;
import if2.b;
import af2.c0;

public final class l<T> extends c0<Long> implements b<Long>
{
    public final g<T> f;
    
    public l(final g<T> f) {
        this.f = f;
    }
    
    @Override
    public final void G(final e0<? super Long> e0) {
        this.f.subscribe(new a(e0));
    }
    
    public final g<Long> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableCount(this.f));
    }
    
    public static final class a implements l<Object>, df2.a
    {
        public final e0<? super Long> f;
        public d g;
        public long h;
        
        public a(final e0<? super Long> f) {
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
            this.g = (d)SubscriptionHelper.CANCELLED;
            this.f.onSuccess((Object)this.h);
        }
        
        public final void onError(final Throwable t) {
            this.g = (d)SubscriptionHelper.CANCELLED;
            this.f.onError(t);
        }
        
        public final void onNext(final Object o) {
            ++this.h;
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
