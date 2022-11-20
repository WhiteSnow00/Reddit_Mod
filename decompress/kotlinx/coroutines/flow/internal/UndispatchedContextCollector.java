// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg.d0;
import kotlinx.coroutines.internal.ThreadContextKt;
import cg2.j;
import gg2.c;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import cj2.f;

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
    
    public final Object emit(final T t, final c<? super j> c) {
        final Object r1 = d0.r1(this.f, (Object)t, this.g, (p)this.h, (c)c);
        if (r1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return r1;
        }
        return j.a;
    }
}
