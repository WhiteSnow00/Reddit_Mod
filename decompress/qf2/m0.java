// 
// Decompiled by Procyon v0.6.0
// 

package qf2;

import io.reactivex.internal.functions.Functions$w;
import io.reactivex.internal.operators.flowable.e;
import mf2.a;
import qt2.b;
import kf2.o;

public final class m0<T, U> implements o<T, b<T>>
{
    public final o<? super T, ? extends b<U>> f;
    
    public m0(final o<? super T, ? extends b<U>> f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) throws Exception {
        final Object apply = this.f.apply(o);
        a.b(apply, "The itemDelay returned a null Publisher");
        return new e<Object>((b)apply).map((kf2.o<? super Object, ?>)new Functions$w(o)).defaultIfEmpty(o);
    }
}
