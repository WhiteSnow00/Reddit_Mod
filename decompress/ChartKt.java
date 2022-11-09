import pg2.j;
import zg2.p;
import z0.r0;
import zg2.q;
import androidx.compose.runtime.ComposerImpl;
import zg2.l;
import androidx.compose.runtime.ComposerKt;
import ds1.b$a;
import mj2.c0;
import ah2.f;
import ds1.b;
import a42.a;
import j1.d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ChartKt
{
    public static final void a(final d d, final a a, b b, final z0.d d2, final int n, final int n2) {
        f.f((Object)d, "modifier");
        f.f((Object)a, "chartData");
        final ComposerImpl r = d2.r(1282295634);
        int n3;
        if ((n2 & 0x4) != 0x0) {
            final long b2 = ds1.a.b;
            final long g = c0.G(10);
            final long c = ds1.a.c;
            b = new b(b2, new b$a(g, c), new b$a(c0.G(10), c), ds1.a.a);
            n3 = (n & 0xFFFFFC7F);
        }
        else {
            n3 = n;
        }
        final q a2 = ComposerKt.a;
        androidx.compose.foundation.b.a(n3 & 0xE, (z0.d)r, d, (l)new ChartKt$Chart.ChartKt$Chart$1(a, b));
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new ChartKt$Chart.ChartKt$Chart$2(d, a, b, n, n2);
        }
    }
}
