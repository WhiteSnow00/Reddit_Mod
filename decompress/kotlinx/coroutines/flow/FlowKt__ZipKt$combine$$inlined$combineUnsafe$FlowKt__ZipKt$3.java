// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import hg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.q;
import rg2.a;
import kotlinx.coroutines.flow.internal.d;
import lg2.c;
import hj2.f;
import rg2.t;
import hj2.e;

public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 implements e<Object>
{
    public final /* synthetic */ e[] f;
    public final /* synthetic */ t g;
    
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(final e[] f, final t g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object a(final f f, final c c) {
        final Object a = d.a(this.f, (a)FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, (q)new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2((c)null, this.g), f, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
