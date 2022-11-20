// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import java.util.NoSuchElementException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import df2.a;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.flowable.FlowableSingle;
import af2.l;
import af2.e0;
import af2.g;
import if2.b;
import af2.c0;

public final class j1<T> extends c0<T> implements b<T>
{
    public final g<T> f;
    public final T g;
    
    public j1(final g<T> f, final T g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.subscribe(new a<Object>(e0, this.g));
    }
    
    public final g<T> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableSingle((g)this.f, (Object)this.g, true));
    }
    
    public static final class a<T> implements l<T>, df2.a
    {
        public final e0<? super T> f;
        public final T g;
        public d h;
        public boolean i;
        public T j;
        
        public a(final e0<? super T> f, final T g) {
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
            final T j = this.j;
            this.j = null;
            T g;
            if ((g = j) == null) {
                g = this.g;
            }
            if (g != null) {
                this.f.onSuccess((Object)g);
            }
            else {
                this.f.onError((Throwable)new NoSuchElementException());
            }
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
        
        public final void onNext(final T j) {
            if (this.i) {
                return;
            }
            if (this.j != null) {
                this.i = true;
                this.h.cancel();
                this.h = (d)SubscriptionHelper.CANCELLED;
                this.f.onError((Throwable)new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.j = j;
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
