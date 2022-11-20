// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import cj2.f;
import cj2.e;
import cj2.a;

public final class CancellableFlowImpl<T> implements a<T>
{
    public final e<T> f;
    
    public CancellableFlowImpl(final e<? extends T> f) {
        this.f = (e<T>)f;
    }
    
    public final Object a(final f<? super T> f, final c<? super j> c) {
        final Object a = this.f.a((f)new CancellableFlowImpl$collect$2((f)f), (c)c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
