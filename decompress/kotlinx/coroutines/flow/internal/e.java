// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.p;
import ui.b;
import hg2.j;
import lg2.c;
import hj2.f;
import rg2.q;

public final class e implements hj2.e<Object>
{
    public final /* synthetic */ q f;
    
    public e(final q f) {
        this.f = f;
    }
    
    @Override
    public final Object a(final f<Object> f, final c<? super j> c) {
        final FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f, (f)f, (c)null);
        final ij2.e e = new ij2.e((c)c, c.getContext());
        final Object x = b.X((jj2.q)e, (jj2.q)e, (p)flowCoroutineKt$scopedFlow$1$1);
        if (x == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return x;
        }
        return j.a;
    }
}
