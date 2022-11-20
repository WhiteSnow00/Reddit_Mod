// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import df2.a;
import af2.l;
import af2.e0;
import ff2.c;
import nt2.b;
import af2.c0;

public final class d1<T, R> extends c0<R>
{
    public final b<T> f;
    public final R g;
    public final c<R, ? super T, R> h;
    
    public d1(final b<T> f, final R g, final c<R, ? super T, R> h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void G(final e0<? super R> e0) {
        this.f.subscribe((nt2.c)new a((af2.e0<? super Object>)e0, (ff2.c<Object, ? super Object, Object>)this.h, this.g));
    }
    
    public static final class a<T, R> implements l<T>, df2.a
    {
        public final e0<? super R> f;
        public final c<R, ? super T, R> g;
        public R h;
        public d i;
        
        public a(final e0<? super R> f, final c<R, ? super T, R> g, final R h) {
            this.f = f;
            this.h = h;
            this.g = g;
        }
        
        public final void dispose() {
            this.i.cancel();
            this.i = (d)SubscriptionHelper.CANCELLED;
        }
        
        public final boolean isDisposed() {
            return this.i == SubscriptionHelper.CANCELLED;
        }
        
        public final void onComplete() {
            final R h = this.h;
            if (h != null) {
                this.h = null;
                this.i = (d)SubscriptionHelper.CANCELLED;
                this.f.onSuccess((Object)h);
            }
        }
        
        public final void onError(final Throwable t) {
            if (this.h != null) {
                this.h = null;
                this.i = (d)SubscriptionHelper.CANCELLED;
                this.f.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public final void onNext(final T t) {
            final R h = this.h;
            if (h != null) {
                try {
                    final Object apply = this.g.apply((Object)h, (Object)t);
                    hf2.a.b(apply, "The reducer returned a null value");
                    this.h = (R)apply;
                }
                finally {
                    final Throwable t2;
                    xd.a.t1(t2);
                    this.i.cancel();
                    this.onError(t2);
                }
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
