// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import p1.c;
import rg2.l;
import androidx.compose.animation.ColorVectorConverterKt;
import l0.g0;
import z0.d$a;
import l0.e;
import l0.d;
import aa1.a;
import o1.r;
import l0.d0;

public final class n
{
    public static final d0<r> a;
    
    static {
        a = aa1.a.Z0(0.0f, 0.0f, (Object)null, 7);
    }
    
    public static final e a(final long n, d a, final z0.d d, final int n2, final int n3) {
        d.A(-1942442407);
        if ((n3 & 0x2) != 0x0) {
            a = (d)n.a;
        }
        final c f = r.f(n);
        d.A(1157296644);
        final boolean m = d.m((Object)f);
        final Object b = d.B();
        g0 g0;
        if (m || (g0 = (g0)b) == d$a.a) {
            g0 = ColorVectorConverterKt.a.invoke(r.f(n));
            d.w((Object)g0);
        }
        d.I();
        final e d2 = androidx.compose.animation.core.a.d((Object)new r(n), (g0)g0, a, (Float)null, (l)null, d, (n2 & 0xE) | 0x240 | (0xE000 & n2 << 6), 8);
        d.I();
        return d2;
    }
}
