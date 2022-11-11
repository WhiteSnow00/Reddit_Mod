// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.r0;
import y0.b;
import z0.f1;
import z0.d$a$a;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.jvm.internal.Lambda;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.foundation.IndicationKt;
import z0.p0;
import w0.l;
import y0.i;
import z0.d$a;
import z0.o0;
import sg2.e;
import hg2.j;
import z0.d;
import rg2.p;
import x0.n;
import x0.r;
import x0.a;

public final class MaterialThemeKt
{
    public static final void a(a u, r r, final n n, final p<? super d, ? super Integer, j> p7, final d d, final int n2, final int n3) {
        e.f((Object)p7, "content");
        final ComposerImpl s = d.s(-891417079);
        int n5;
        if ((n2 & 0xE) == 0x0) {
            int n4;
            if ((n3 & 0x1) == 0x0 && s.m((Object)u)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n2);
        }
        else {
            n5 = n2;
        }
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if ((n3 & 0x2) == 0x0 && s.m((Object)r)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 |= n6;
        }
        if ((n2 & 0x380) == 0x0) {
            int n7;
            if ((n3 & 0x4) == 0x0 && s.m((Object)n)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n5 |= n7;
        }
        n n8 = n;
        int n9;
        if ((n3 & 0x8) != 0x0) {
            n9 = (n5 | 0xC00);
        }
        else {
            n9 = n5;
            if ((n2 & 0x1C00) == 0x0) {
                int n10;
                if (s.m((Object)p7)) {
                    n10 = 2048;
                }
                else {
                    n10 = 1024;
                }
                n9 = (n5 | n10);
            }
        }
        n n11;
        a a = null;
        r r3;
        if ((n9 & 0x16DB) == 0x492 && s.c()) {
            s.k();
            final r r2 = r;
            n11 = n8;
            a = u;
            r3 = r2;
        }
        else {
            s.v0();
            int n14 = 0;
            r r4 = null;
            n n15 = null;
            Label_0453: {
                int n13;
                if ((n2 & 0x1) != 0x0 && !s.Y()) {
                    s.k();
                    int n12 = n9;
                    if ((n3 & 0x1) != 0x0) {
                        n12 = (n9 & 0xFFFFFFF1);
                    }
                    n13 = n12;
                    if ((n3 & 0x2) != 0x0) {
                        n13 = (n12 & 0xFFFFFF8F);
                    }
                    a = u;
                    n14 = n13;
                    r4 = r;
                    n15 = n8;
                    if ((n3 & 0x4) == 0x0) {
                        break Label_0453;
                    }
                }
                else {
                    int n16 = n9;
                    if ((n3 & 0x1) != 0x0) {
                        u = pd.r.u((d)s);
                        n16 = (n9 & 0xFFFFFFF1);
                    }
                    n13 = n16;
                    if ((n3 & 0x2) != 0x0) {
                        r = (r)s.u((o0)TypographyKt.a);
                        n13 = (n16 & 0xFFFFFF8F);
                    }
                    a = u;
                    n14 = n13;
                    r4 = r;
                    n15 = n8;
                    if ((n3 & 0x4) == 0x0) {
                        break Label_0453;
                    }
                    n8 = (n)s.u((o0)ShapesKt.a);
                }
                n14 = (n13 & 0xFFFFFC7F);
                n15 = n8;
                r4 = r;
                a = u;
            }
            s.S();
            s.A(-492369756);
            final Object c0 = s.c0();
            final d$a$a a2 = d$a.a;
            a a3;
            if ((a3 = (a)c0) == a2) {
                a3 = new a(a.e(), ((o1.r)((SnapshotMutableStateImpl)a.b).getValue()).a, a.f(), a.g(), a.a(), a.h(), ((o1.r)((SnapshotMutableStateImpl)a.g).getValue()).a, a.b(), a.c(), ((o1.r)((SnapshotMutableStateImpl)a.j).getValue()).a, a.d(), ((o1.r)((SnapshotMutableStateImpl)a.l).getValue()).a, a.i());
                s.I0((Object)a3);
            }
            s.R(false);
            final a a4 = a3;
            final f1 a5 = ColorsKt.a;
            e.f((Object)a4, "<this>");
            e.f((Object)a, "other");
            a.u(a.e(), a4.a);
            ((SnapshotMutableStateImpl)a4.b).setValue((Object)new o1.r(((o1.r)((SnapshotMutableStateImpl)a.b).getValue()).a));
            ((SnapshotMutableStateImpl)a4.c).setValue((Object)new o1.r(a.f()));
            ((SnapshotMutableStateImpl)a4.d).setValue((Object)new o1.r(a.g()));
            ((SnapshotMutableStateImpl)a4.e).setValue((Object)new o1.r(a.a()));
            a.u(a.h(), a4.f);
            ((SnapshotMutableStateImpl)a4.g).setValue((Object)new o1.r(((o1.r)((SnapshotMutableStateImpl)a.g).getValue()).a));
            ((SnapshotMutableStateImpl)a4.h).setValue((Object)new o1.r(a.b()));
            a.u(a.c(), a4.i);
            ((SnapshotMutableStateImpl)a4.j).setValue((Object)new o1.r(((o1.r)((SnapshotMutableStateImpl)a.j).getValue()).a));
            a.u(a.d(), a4.k);
            ((SnapshotMutableStateImpl)a4.l).setValue((Object)new o1.r(((o1.r)((SnapshotMutableStateImpl)a.l).getValue()).a));
            ((SnapshotMutableStateImpl)a4.m).setValue((Object)a.i());
            final b a6 = i.a(false, 0.0f, 0L, (d)s, 0, 7);
            s.A(-721696685);
            final long e = a4.e();
            final long a7 = a4.a();
            s.A(35572910);
            long n17 = ColorsKt.a(a4, a7);
            if (n17 == o1.r.l) {
                n17 = ((o1.r)s.u((o0)ContentColorKt.a)).a;
            }
            s.R(false);
            s.A(1999054879);
            final float l = nn0.a.l(0.74f, 0.6f, (d)s);
            s.R(false);
            final long b = o1.r.b(n17, l);
            final o1.r r5 = new o1.r(e);
            final o1.r r6 = new o1.r(a7);
            final o1.r r7 = new o1.r(b);
            s.A(1618982084);
            final boolean m = s.m((Object)r5);
            final boolean i = s.m((Object)r6);
            final boolean j = s.m((Object)r7);
            final Object c2 = s.c0();
            l k;
            if ((j | (m | i)) || (k = (l)c2) == a2) {
                final long e2 = a4.e();
                final float p8 = wd.a.p(e, 0.4f, b, a7);
                float n18 = 0.2f;
                final float p9 = wd.a.p(e, 0.2f, b, a7);
                if (p8 >= 4.5f) {
                    n18 = 0.4f;
                }
                else if (p9 >= 4.5f) {
                    int n19 = 0;
                    n18 = 0.4f;
                    float n20 = 0.2f;
                    float n21 = n18;
                    while (n19 < 7) {
                        final float n22 = wd.a.p(e, n18, b, a7) / 4.5f - 1.0f;
                        if (0.0f <= n22 && n22 <= 0.01f) {
                            break;
                        }
                        if (n22 < 0.0f) {
                            n21 = n18;
                        }
                        else {
                            n20 = n18;
                        }
                        n18 = (n21 + n20) / 2.0f;
                        ++n19;
                    }
                }
                k = new l(e2, o1.r.b(e, n18));
                s.I0((Object)k);
            }
            s.R(false);
            final l l2 = k;
            s.R(false);
            final p0 b2 = ((o0)ColorsKt.a).b((Object)a4);
            final z0.r a8 = ContentAlphaKt.a;
            s.A(629162431);
            final float l3 = nn0.a.l(1.0f, 0.87f, (d)s);
            s.I();
            CompositionLocalKt.a((p0<?>[])new p0[] { b2, ((o0)a8).b((Object)l3), ((o0)IndicationKt.a).b((Object)a6), ((o0)RippleThemeKt.a).b((Object)x0.i.a), ((o0)ShapesKt.a).b((Object)n15), ((o0)TextSelectionColorsKt.a).b((Object)l2), ((o0)TypographyKt.a).b((Object)r4) }, (p<? super d, ? super Integer, j>)aa1.a.R((d)s, -1740102967, (Lambda)new MaterialThemeKt$MaterialTheme$1(r4, (p)p7, n14)), (d)s, 56);
            n11 = n15;
            r3 = r4;
        }
        final r0 u2 = s.U();
        if (u2 != null) {
            u2.d = (p)new MaterialThemeKt$MaterialTheme$2(a, r3, n11, (p)p7, n2, n3);
        }
    }
}
