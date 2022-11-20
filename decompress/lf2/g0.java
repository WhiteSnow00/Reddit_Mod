// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import af2.l;
import af2.c;
import io.reactivex.plugins.RxJavaPlugins;
import af2.g;
import if2.b;
import af2.a;

public final class g0<T> extends af2.a implements b<T>
{
    public final g<T> f;
    
    public g0(final g<T> f) {
        this.f = f;
    }
    
    public final g<T> d() {
        return RxJavaPlugins.onAssembly((g)new f0((g)this.f));
    }
    
    @Override
    public final void w(final c c) {
        this.f.subscribe(new a<Object>(c));
    }
    
    public static final class a<T> implements l<T>, df2.a
    {
        public final c f;
        public d g;
        
        public a(final c f) {
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
            this.f.onComplete();
        }
        
        public final void onError(final Throwable t) {
            this.g = (d)SubscriptionHelper.CANCELLED;
            this.f.onError(t);
        }
        
        public final void onNext(final T t) {
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
