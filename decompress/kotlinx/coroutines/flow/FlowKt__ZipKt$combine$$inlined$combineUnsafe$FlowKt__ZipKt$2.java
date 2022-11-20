// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import cg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg2.q;
import mg2.a;
import kotlinx.coroutines.flow.internal.d;
import gg2.c;
import cj2.f;
import mg2.s;
import cj2.e;

public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 implements e<Object>
{
    public final e[] f;
    public final s g;
    
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(final e[] f, final s g) {
        this.f = f;
        this.g = g;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = d.a(this.f, (a)FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, (q)new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2((c)null, this.g), f, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
