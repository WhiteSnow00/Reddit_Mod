// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import af2.g;
import io.reactivex.internal.functions.Functions$w;
import io.reactivex.internal.operators.flowable.e;
import hf2.a;
import nt2.b;
import ff2.o;

public final class m0<T, U> implements o<T, b<T>>
{
    public final o<? super T, ? extends b<U>> f;
    
    public m0(final o<? super T, ? extends b<U>> f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) throws Exception {
        final Object apply = this.f.apply(o);
        a.b(apply, "The itemDelay returned a null Publisher");
        return ((g<Object>)new e((b)apply)).map((ff2.o<? super Object, ?>)new Functions$w(o)).defaultIfEmpty(o);
    }
}
