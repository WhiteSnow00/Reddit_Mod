// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import nt2.c;
import io.reactivex.internal.util.ErrorMode;
import ff2.o;
import nt2.b;
import af2.g;

public final class k<T, R> extends g<R>
{
    public final b<T> f;
    public final o<? super T, ? extends b<? extends R>> g;
    public final int h;
    public final ErrorMode i;
    
    public k(final g f, final o g, final ErrorMode i) {
        this.f = (b<T>)f;
        this.g = (o<? super T, ? extends b<? extends R>>)g;
        this.h = 2;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        if (f1.a(c, this.g, this.f)) {
            return;
        }
        this.f.subscribe((c)FlowableConcatMap.e((nt2.c<? super Object>)c, (ff2.o<? super Object, ? extends nt2.b<?>>)this.g, this.h, this.i));
    }
}
