// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import hf2.a;
import nt2.b;
import ff2.o;

public final class j0<T, U> implements o<T, b<U>>
{
    public final o<? super T, ? extends Iterable<? extends U>> f;
    
    public j0(final o<? super T, ? extends Iterable<? extends U>> f) {
        this.f = f;
    }
    
    public final Object apply(Object apply) throws Exception {
        apply = this.f.apply(apply);
        a.b(apply, "The mapper returned a null Iterable");
        return new FlowableFromIterable((Iterable<?>)apply);
    }
}
