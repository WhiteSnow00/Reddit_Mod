// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import java.util.NoSuchElementException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import df2.a;
import af2.l;
import nt2.c;
import af2.e0;
import nt2.b;
import af2.c0;

public final class y0<T> extends c0<T>
{
    public final b<T> f;
    public final T g;
    
    public y0(final b<T> f, final T g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.subscribe((c)new a((af2.e0<? super Object>)e0, this.g));
    }
    
    public static final class a<T> implements l<T>, df2.a
    {
        public final e0<? super T> f;
        public final T g;
        public d h;
        public T i;
        
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
            this.h = (d)SubscriptionHelper.CANCELLED;
            final T i = this.i;
            if (i != null) {
                this.i = null;
                this.f.onSuccess((Object)i);
            }
            else {
                final T g = this.g;
                if (g != null) {
                    this.f.onSuccess((Object)g);
                }
                else {
                    this.f.onError((Throwable)new NoSuchElementException());
                }
            }
        }
        
        public final void onError(final Throwable t) {
            this.h = (d)SubscriptionHelper.CANCELLED;
            this.i = null;
            this.f.onError(t);
        }
        
        public final void onNext(final T i) {
            this.i = i;
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
