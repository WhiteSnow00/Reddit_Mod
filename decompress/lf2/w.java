// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import java.util.NoSuchElementException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import df2.a;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.flowable.FlowableElementAt;
import af2.l;
import af2.e0;
import af2.g;
import if2.b;
import af2.c0;

public final class w<T> extends c0<T> implements b<T>
{
    public final g<T> f;
    public final long g;
    public final T h;
    
    public w(final g<T> f, final long g, final T h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.subscribe(new a<Object>(e0, this.g, this.h));
    }
    
    public final g<T> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableElementAt(this.f, this.g, this.h, true));
    }
    
    public static final class a<T> implements l<T>, df2.a
    {
        public final e0<? super T> f;
        public final long g;
        public final T h;
        public d i;
        public long j;
        public boolean k;
        
        public a(final e0<? super T> f, final long g, final T h) {
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
            this.i = (d)SubscriptionHelper.CANCELLED;
            if (!this.k) {
                this.k = true;
                final T h = this.h;
                if (h != null) {
                    this.f.onSuccess((Object)h);
                }
                else {
                    this.f.onError((Throwable)new NoSuchElementException());
                }
            }
        }
        
        public final void onError(final Throwable t) {
            if (this.k) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.k = true;
            this.i = (d)SubscriptionHelper.CANCELLED;
            this.f.onError(t);
        }
        
        public final void onNext(final T t) {
            if (this.k) {
                return;
            }
            final long j = this.j;
            if (j == this.g) {
                this.k = true;
                this.i.cancel();
                this.i = (d)SubscriptionHelper.CANCELLED;
                this.f.onSuccess((Object)t);
                return;
            }
            this.j = j + 1L;
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
