// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow.internal;

import cg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg2.p;
import gg2.c;
import cj2.f;
import mg2.q;
import mg2.a;
import cj2.e;

public final class d
{
    public static final Object a(final e[] array, final a a, final q q, final f f, final c c) {
        final CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(array, a, q, f, (c)null);
        final dj2.e e = new dj2.e(c, c.getContext());
        final Object o0 = zg.a.o0((ej2.q)e, (ej2.q)e, (p)combineKt$combineInternal$2);
        if (o0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return o0;
        }
        return j.a;
    }
}
