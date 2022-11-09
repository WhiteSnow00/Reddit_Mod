// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import p1.c;
import zg2.l;
import l0.g0;
import androidx.compose.animation.ColorVectorConverterKt;
import z0.d$a;
import l0.e;
import l0.d;
import at1.a;
import o1.r;
import l0.d0;

public final class n
{
    public static final d0<r> a;
    
    static {
        a = at1.a.K1(0.0f, 0.0f, (Object)null, 7);
    }
    
    public static final e a(final long n, d a, final z0.d d, final int n2, final int n3) {
        d.A(-1942442407);
        if ((n3 & 0x2) != 0x0) {
            a = n.a;
        }
        final c f = r.f(n);
        d.A(1157296644);
        final boolean l = d.l(f);
        final Object b = d.B();
        Object o;
        if (l || (o = b) == d$a.a) {
            o = ColorVectorConverterKt.a.invoke((Object)r.f(n));
            d.v(o);
        }
        d.I();
        final e c = androidx.compose.animation.core.a.c((Object)new r(n), (g0)o, (d)a, (Float)null, (l)null, d, (n2 & 0xE) | 0x240 | (0xE000 & n2 << 6), 8);
        d.I();
        return c;
    }
}
