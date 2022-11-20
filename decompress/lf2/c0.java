// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import df2.a;
import nt2.d;
import af2.a0;
import nt2.c;
import af2.t;
import af2.g;

public final class c0<T> extends g<T>
{
    public final t<T> f;
    
    public c0(final t<T> f) {
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        this.f.subscribe((af2.a0<? super T>)new a((nt2.c<? super Object>)c));
    }
    
    public static final class a<T> implements a0<T>, d
    {
        public final c<? super T> f;
        public df2.a g;
        
        public a(final c<? super T> f) {
            this.f = f;
        }
        
        public final void cancel() {
            this.g.dispose();
        }
        
        public final void onComplete() {
            this.f.onComplete();
        }
        
        public final void onError(final Throwable t) {
            this.f.onError(t);
        }
        
        public final void onNext(final T t) {
            this.f.onNext((Object)t);
        }
        
        public final void onSubscribe(final df2.a g) {
            this.g = g;
            this.f.onSubscribe((d)this);
        }
        
        public final void request(final long n) {
        }
    }
}
