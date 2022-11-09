// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import i2.k;
import pg2.j;
import c2.e0;
import zg2.l;
import u2.i;
import androidx.compose.foundation.layout.SizeKt;
import c2.t;
import c2.r;
import c2.u;
import v0.n;
import z0.e1;
import n2.m;
import androidx.compose.ui.text.a;
import z0.d$a;
import androidx.compose.ui.unit.LayoutDirection;
import n2.g;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import ah2.f;
import i2.p;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class TextFieldSizeKt$textFieldMinSize$1 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ p $style;
    
    public TextFieldSizeKt$textFieldMinSize$1(final p $style) {
        this.$style = $style;
        super(3);
    }
    
    public final d invoke(d y0, final z0.d d, int a) {
        f.f((Object)y0, "$this$composed");
        d.A(1582736677);
        final b b = (b)d.t(CompositionLocalsKt.e);
        final g.a c = (g.a)d.t(CompositionLocalsKt.h);
        final LayoutDirection a2 = (LayoutDirection)d.t(CompositionLocalsKt.k);
        final p $style = this.$style;
        d.A(511388516);
        final boolean l = d.l($style);
        final boolean i = d.l(a2);
        final Object b2 = d.B();
        p a3;
        if ((l | i) || (a3 = (p)b2) == d$a.a) {
            a3 = a.a($style, a2);
            d.v(a3);
        }
        d.I();
        final p d2 = a3;
        d.A(511388516);
        final boolean j = d.l(c);
        final boolean k = d.l(d2);
        final Object b3 = d.B();
        e1 a4;
        if ((j | k) || (a4 = (e1)b3) == d$a.a) {
            final k a5 = d2.a;
            final g f = a5.f;
            m m;
            if ((m = a5.c) == null) {
                m = n2.m.m;
            }
            final n2.k d3 = a5.d;
            if (d3 != null) {
                a = d3.a;
            }
            else {
                a = 0;
            }
            final n2.l e = a5.e;
            int a6;
            if (e != null) {
                a6 = e.a;
            }
            else {
                a6 = 1;
            }
            a4 = c.a(f, m, a, a6);
            d.v(a4);
        }
        d.I();
        final e1 e2 = a4;
        final p $style2 = this.$style;
        d.A(-492369756);
        Object b4;
        if ((b4 = d.B()) == d$a.a) {
            d.v(b4 = new v0.q(a2, b, c, $style2, e2.getValue()));
        }
        d.I();
        final v0.q q = (v0.q)b4;
        final Object value = e2.getValue();
        q.getClass();
        f.f((Object)a2, "layoutDirection");
        f.f((Object)b, "density");
        f.f((Object)c, "fontFamilyResolver");
        f.f((Object)d2, "resolvedStyle");
        f.f(value, "typeface");
        if (a2 != q.a || !f.a((Object)b, (Object)q.b) || !f.a((Object)c, (Object)q.c) || !f.a((Object)d2, (Object)q.d) || !f.a(value, q.e)) {
            q.a = a2;
            q.b = b;
            q.c = c;
            q.d = d2;
            q.e = value;
            q.f = n.a(d2, b, c, n.a, 1);
        }
        y0 = dg.d.y0((d)d.a.f, (q)new q<u, r, u2.a, t>() {
            public final t invoke-3p2s80s(final u u, final r r, final long n) {
                f.f((Object)u, "$this$layout");
                f.f((Object)r, "measurable");
                SizeKt.e((d)d.a.f, 0.0f, 0.0f, 3);
                final long f = q.f;
                final e0 i = r.I(u2.a.a(n, yl.a.K((int)(f >> 32), u2.a.j(n), u2.a.h(n)), 0, yl.a.K(u2.i.b(f), u2.a.i(n), u2.a.g(n)), 0, 10));
                return u.E0(u, i.f, i.g, (l)new l<e0.a, j>() {
                    public final void invoke(final e0.a a) {
                        ah2.f.f((Object)a, "$this$layout");
                        final e0 $measured = i;
                        final e0.a.a a2 = e0.a.a;
                        a.e($measured, 0, 0, 0.0f);
                    }
                });
            }
        });
        d.I();
        return y0;
    }
}
