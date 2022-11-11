// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import z0.f1;
import z0.h1;
import z0.r;
import rg2.a;
import z0.a1;
import z0.r0;
import sg2.e;
import hg2.j;
import z0.d;
import rg2.p;
import z0.p0;

public final class CompositionLocalKt
{
    public static final void a(final p0<?>[] array, final p<? super d, ? super Integer, j> p4, final d d, final int n) {
        e.f((Object)array, "values");
        e.f((Object)p4, "content");
        final ComposerImpl s = d.s(-1390796515);
        s.y0((p0[])array);
        p4.invoke((Object)s, Integer.valueOf(n >> 3 & 0xE));
        s.T();
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new CompositionLocalKt$CompositionLocalProvider.CompositionLocalKt$CompositionLocalProvider$1((p0[])array, (p)p4, n);
        }
    }
    
    public static final r b(final a1 a1, final a a2) {
        e.f((Object)a1, "policy");
        e.f((Object)a2, "defaultFactory");
        return new r(a1, a2);
    }
    
    public static final f1 d(final a a) {
        e.f((Object)a, "defaultFactory");
        return new f1(a);
    }
}
