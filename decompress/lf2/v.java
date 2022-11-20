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
import io.reactivex.internal.operators.flowable.FlowableElementAt;
import af2.g;
import if2.b;
import af2.n;

public final class v<T> extends n<T> implements b<T>
{
    public final g<T> f;
    public final long g;
    
    public v(final long g, final g f) {
        this.f = f;
        this.g = g;
    }
    
    public final g<T> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableElementAt(this.f, this.g, null, false));
    }
    
    @Override
    public final void t(final p<? super T> p) {
        this.f.subscribe(new a<Object>(p, this.g));
    }
    
    public static final class a<T> implements l<T>, df2.a
    {
        public final p<? super T> f;
        public final long g;
        public d h;
        public long i;
        public boolean j;
        
        public a(final p<? super T> f, final long g) {
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
            this.h = (d)SubscriptionHelper.CANCELLED;
            if (!this.j) {
                this.j = true;
                this.f.onComplete();
            }
        }
        
        public final void onError(final Throwable t) {
            if (this.j) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.j = true;
            this.h = (d)SubscriptionHelper.CANCELLED;
            this.f.onError(t);
        }
        
        public final void onNext(final T t) {
            if (this.j) {
                return;
            }
            final long i = this.i;
            if (i == this.g) {
                this.j = true;
                this.h.cancel();
                this.h = (d)SubscriptionHelper.CANCELLED;
                this.f.onSuccess((Object)t);
                return;
            }
            this.i = i + 1L;
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
