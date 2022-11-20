// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg2.p;
import zg.a;
import cg2.j;
import gg2.c;
import cj2.f;
import mg2.q;

public final class e implements cj2.e<Object>
{
    public final q f;
    
    public e(final q f) {
        this.f = f;
    }
    
    public final Object a(final f<Object> f, final c<? super j> c) {
        final FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f, (f)f, (c)null);
        final dj2.e e = new dj2.e((c)c, c.getContext());
        final Object o0 = a.o0((ej2.q)e, (ej2.q)e, (p)flowCoroutineKt$scopedFlow$1$1);
        if (o0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return o0;
        }
        return j.a;
    }
}
