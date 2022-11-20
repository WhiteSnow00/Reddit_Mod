// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import io.reactivex.exceptions.CompositeException;
import af2.c;
import ff2.q;
import af2.e;
import af2.a;

public final class i extends af2.a
{
    public final e f;
    public final q<? super Throwable> g;
    
    public i(final e f, final q<? super Throwable> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void w(final c c) {
        this.f.a((c)new a(c));
    }
    
    public final class a implements c
    {
        public final c f;
        public final i g;
        
        public a(final i g, final c f) {
            this.g = g;
            this.f = f;
        }
        
        public final void onComplete() {
            this.f.onComplete();
        }
        
        public final void onError(final Throwable t) {
            try {
                if (this.g.g.test((Object)t)) {
                    this.f.onComplete();
                }
                else {
                    this.f.onError(t);
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.f.onError((Throwable)new CompositeException(new Throwable[] { t, t2 }));
            }
        }
        
        public final void onSubscribe(final df2.a a) {
            this.f.onSubscribe(a);
        }
    }
}
