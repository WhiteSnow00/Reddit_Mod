// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import vl.a;
import kotlinx.coroutines.internal.ThreadContextKt;
import hg2.j;
import lg2.c;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import hj2.f;

public final class UndispatchedContextCollector<T> implements f<T>
{
    public final CoroutineContext f;
    public final Object g;
    public final p<T, c<? super j>, Object> h;
    
    public UndispatchedContextCollector(final f<? super T> f, final CoroutineContext f2) {
        this.f = f2;
        this.g = ThreadContextKt.b(f2);
        this.h = (p<T, c<? super j>, Object>)new UndispatchedContextCollector$emitRef$1((f)f, (c)null);
    }
    
    @Override
    public final Object emit(final T t, final c<? super j> c) {
        final Object k0 = a.K0(this.f, (Object)t, this.g, (p)this.h, (c)c);
        if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k0;
        }
        return j.a;
    }
}
