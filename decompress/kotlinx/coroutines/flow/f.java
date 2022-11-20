// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg2.a;
import kotlinx.coroutines.flow.internal.d;
import cg2.j;
import gg2.c;
import mg2.q;
import cj2.e;

public final class f implements e<Object>
{
    public final e f;
    public final e g;
    public final q h;
    
    public f(final e f, final e g, final q h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final Object a(final cj2.f<Object> f, final c<? super j> c) {
        final Object a = d.a(new e[] { this.f, this.g }, (a)FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, (q)new FlowKt__ZipKt$combine$1$1(this.h, (c)null), f, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
