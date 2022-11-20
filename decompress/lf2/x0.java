// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import df2.a;
import af2.l;
import nt2.c;
import af2.p;
import nt2.b;
import af2.n;

public final class x0<T> extends n<T>
{
    public final b<T> f;
    
    public x0(final b<T> f) {
        this.f = f;
    }
    
    @Override
    public final void t(final p<? super T> p) {
        this.f.subscribe((c)new a((af2.p<? super Object>)p));
    }
    
    public static final class a<T> implements l<T>, df2.a
    {
        public final p<? super T> f;
        public d g;
        public T h;
        
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
            this.g = (d)SubscriptionHelper.CANCELLED;
            final T h = this.h;
            if (h != null) {
                this.h = null;
                this.f.onSuccess((Object)h);
            }
            else {
                this.f.onComplete();
            }
        }
        
        public final void onError(final Throwable t) {
            this.g = (d)SubscriptionHelper.CANCELLED;
            this.h = null;
            this.f.onError(t);
        }
        
        public final void onNext(final T h) {
            this.h = h;
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
