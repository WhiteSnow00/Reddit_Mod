// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg2.p;
import mg.d0;
import cg2.j;
import cj2.f;
import mg2.q;
import cj2.e;

public final class c implements e<Object>
{
    public final e f;
    public final e g;
    public final q h;
    
    public c(final e f, final e g, final q h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final Object a(final f<Object> f, final gg2.c<? super j> c) {
        final Object g = d0.G((p)new CombineKt$zipImpl$1$1((f)f, this.f, this.g, this.h, (gg2.c)null), (gg2.c)c);
        if (g == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return g;
        }
        return j.a;
    }
}
