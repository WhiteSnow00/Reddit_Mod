// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import df2.a;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.flowable.FlowableAll;
import af2.l;
import af2.e0;
import ff2.q;
import af2.g;
import if2.b;
import af2.c0;

public final class e<T> extends c0<Boolean> implements b<Boolean>
{
    public final g<T> f;
    public final q<? super T> g;
    
    public e(final g<T> f, final q<? super T> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super Boolean> e0) {
        this.f.subscribe(new a<Object>(e0, this.g));
    }
    
    public final g<Boolean> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableAll(this.f, this.g));
    }
    
    public static final class a<T> implements l<T>, df2.a
    {
        public final e0<? super Boolean> f;
        public final q<? super T> g;
        public d h;
        public boolean i;
        
        public a(final e0<? super Boolean> f, final q<? super T> g) {
            this.f = f;
            this.g = g;
        }
        
        public final void dispose() {
            this.h.cancel();
            this.h = (d)SubscriptionHelper.CANCELLED;
        }
        
        public final boolean isDisposed() {
            return this.h == SubscriptionHelper.CANCELLED;
        }
        
        public final void onComplete() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.h = (d)SubscriptionHelper.CANCELLED;
            this.f.onSuccess((Object)Boolean.TRUE);
        }
        
        public final void onError(final Throwable t) {
            if (this.i) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.i = true;
            this.h = (d)SubscriptionHelper.CANCELLED;
            this.f.onError(t);
        }
        
        public final void onNext(final T t) {
            if (this.i) {
                return;
            }
            try {
                if (!this.g.test((Object)t)) {
                    this.i = true;
                    this.h.cancel();
                    this.h = (d)SubscriptionHelper.CANCELLED;
                    this.f.onSuccess((Object)Boolean.FALSE);
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.h.cancel();
                this.h = (d)SubscriptionHelper.CANCELLED;
                this.onError(t2);
            }
        }
        
        @Override
        public final void onSubscribe(final d h) {
            if (SubscriptionHelper.validate(this.h, h)) {
                this.h = h;
                this.f.onSubscribe((df2.a)this);
                h.request(Long.MAX_VALUE);
            }
        }
    }
}
