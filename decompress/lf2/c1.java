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
import io.reactivex.internal.operators.flowable.FlowableReduce;
import ff2.c;
import af2.g;
import if2.b;
import af2.n;

public final class c1<T> extends n<T> implements b<T>
{
    public final g<T> f;
    public final c<T, T, T> g;
    
    public c1(final g<T> f, final c<T, T, T> g) {
        this.f = f;
        this.g = g;
    }
    
    public final g<T> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableReduce((g)this.f, (c)this.g));
    }
    
    @Override
    public final void t(final p<? super T> p) {
        this.f.subscribe(new a<Object>(p, this.g));
    }
    
    public static final class a<T> implements l<T>, df2.a
    {
        public final p<? super T> f;
        public final c<T, T, T> g;
        public T h;
        public d i;
        public boolean j;
        
        public a(final p<? super T> f, final c<T, T, T> g) {
            this.f = f;
            this.g = g;
        }
        
        public final void dispose() {
            this.i.cancel();
            this.j = true;
        }
        
        public final boolean isDisposed() {
            return this.j;
        }
        
        public final void onComplete() {
            if (this.j) {
                return;
            }
            this.j = true;
            final T h = this.h;
            if (h != null) {
                this.f.onSuccess((Object)h);
            }
            else {
                this.f.onComplete();
            }
        }
        
        public final void onError(final Throwable t) {
            if (this.j) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.j = true;
            this.f.onError(t);
        }
        
        public final void onNext(final T h) {
            if (this.j) {
                return;
            }
            final T h2 = this.h;
            if (h2 == null) {
                this.h = h;
            }
            else {
                try {
                    final Object apply = this.g.apply((Object)h2, (Object)h);
                    hf2.a.b(apply, "The reducer returned a null value");
                    this.h = (T)apply;
                }
                finally {
                    final Throwable t;
                    xd.a.t1(t);
                    this.i.cancel();
                    this.onError(t);
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
