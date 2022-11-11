// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.swiperefresh;

import z0.e1;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.r0;
import z0.d$a$a;
import z0.f1;
import androidx.compose.runtime.ComposerImpl;
import hg2.j;
import androidx.compose.material.SurfaceKt;
import kotlin.jvm.internal.Lambda;
import cg.m0;
import rg2.l;
import androidx.compose.foundation.layout.SizeKt;
import z0.s;
import rg2.p;
import z0.h0;
import z0.d$a;
import androidx.compose.ui.platform.CompositionLocalsKt;
import nn0.a;
import z0.o0;
import androidx.compose.material.ShapesKt;
import x0.n;
import androidx.compose.material.ColorsKt;
import pd.r;
import sg2.e;
import o1.l0;
import j1.d;
import ea.c;
import ea.b;

public final class SwipeRefreshIndicatorKt
{
    public static final b a;
    public static final b b;
    
    static {
        a = new b(40, (float)7.5, (float)2.5, 10, 5);
        b = new b(56, 11, 3, 12, 6);
    }
    
    public static final void a(final c c, final float n, d f, boolean b, boolean b2, boolean b3, long h, long b4, l0 a, float n2, boolean b5, float n3, final z0.d d, final int n4, final int n5, final int n6) {
        e.f((Object)c, "state");
        final ComposerImpl s = d.s(373456677);
        int n7;
        if ((n6 & 0x1) != 0x0) {
            n7 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n8;
            if (s.m((Object)c)) {
                n8 = 4;
            }
            else {
                n8 = 2;
            }
            n7 = (n8 | n4);
        }
        else {
            n7 = n4;
        }
        int n9;
        if ((n6 & 0x2) != 0x0) {
            n9 = (n7 | 0x30);
        }
        else {
            n9 = n7;
            if ((n4 & 0x70) == 0x0) {
                int n10;
                if (s.o(n)) {
                    n10 = 32;
                }
                else {
                    n10 = 16;
                }
                n9 = (n7 | n10);
            }
        }
        final int n11 = n6 & 0x4;
        int n14 = 0;
        Label_0201: {
            int n12;
            if (n11 != 0) {
                n12 = (n9 | 0x180);
            }
            else {
                n12 = n9;
                if ((n4 & 0x380) == 0x0) {
                    int n13;
                    if (s.m((Object)f)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n9 | n13);
                    break Label_0201;
                }
            }
            n14 = n12;
        }
        final int n15 = n6 & 0x8;
        int n18 = 0;
        Label_0273: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n4 & 0x1C00) == 0x0) {
                    int n17;
                    if (s.n(b)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0273;
                }
            }
            n18 = n16;
        }
        final int n19 = n6 & 0x10;
        int n20;
        if (n19 != 0) {
            n20 = (n18 | 0x6000);
        }
        else {
            n20 = n18;
            if ((0xE000 & n4) == 0x0) {
                int n21;
                if (s.n(b2)) {
                    n21 = 16384;
                }
                else {
                    n21 = 8192;
                }
                n20 = (n18 | n21);
            }
        }
        final int n22 = n6 & 0x20;
        int n23;
        if (n22 != 0) {
            n23 = (n20 | 0x30000);
        }
        else {
            n23 = n20;
            if ((n4 & 0x70000) == 0x0) {
                int n24;
                if (s.n(b3)) {
                    n24 = 131072;
                }
                else {
                    n24 = 65536;
                }
                n23 = (n20 | n24);
            }
        }
        if ((n4 & 0x380000) == 0x0) {
            int n25;
            if ((n6 & 0x40) == 0x0 && s.K(h)) {
                n25 = 1048576;
            }
            else {
                n25 = 524288;
            }
            n23 |= n25;
        }
        if ((n4 & 0x1C00000) == 0x0) {
            int n26;
            if ((n6 & 0x80) == 0x0 && s.K(b4)) {
                n26 = 8388608;
            }
            else {
                n26 = 4194304;
            }
            n23 |= n26;
        }
        if ((0xE000000 & n4) == 0x0) {
            int n27;
            if ((n6 & 0x100) == 0x0 && s.m((Object)a)) {
                n27 = 67108864;
            }
            else {
                n27 = 33554432;
            }
            n23 |= n27;
        }
        final int n28 = n6 & 0x200;
        int n31 = 0;
        Label_0616: {
            int n29;
            if (n28 != 0) {
                n29 = (n23 | 0x30000000);
            }
            else {
                n29 = n23;
                if ((0x70000000 & n4) == 0x0) {
                    int n30;
                    if (s.o(n2)) {
                        n30 = 536870912;
                    }
                    else {
                        n30 = 268435456;
                    }
                    n31 = (n23 | n30);
                    break Label_0616;
                }
            }
            n31 = n29;
        }
        final int n32 = n6 & 0x400;
        int n33;
        if (n32 != 0) {
            n33 = (n5 | 0x6);
        }
        else if ((n5 & 0xE) == 0x0) {
            int n34;
            if (s.n(b5)) {
                n34 = 4;
            }
            else {
                n34 = 2;
            }
            n33 = (n5 | n34);
        }
        else {
            n33 = n5;
        }
        final int n35 = n6 & 0x800;
        int n36;
        if (n35 != 0) {
            n36 = (n33 | 0x30);
        }
        else {
            n36 = n33;
            if ((n5 & 0x70) == 0x0) {
                int n37;
                if (s.o(n3)) {
                    n37 = 32;
                }
                else {
                    n37 = 16;
                }
                n36 = (n33 | n37);
            }
        }
        boolean b7;
        boolean b8;
        boolean b9;
        float n38;
        if ((n31 & 0x5B6DB6DB) == 0x12492492 && (n36 & 0x5B) == 0x12 && s.c()) {
            s.k();
            final boolean b6 = b;
            b7 = b2;
            b8 = b6;
            b9 = b3;
            n38 = n2;
            n2 = n3;
        }
        else {
            s.v0();
            if ((n4 & 0x1) != 0x0 && !s.Y()) {
                s.k();
                int n39 = n31;
                if ((n6 & 0x40) != 0x0) {
                    n39 = (n31 & 0xFFC7FFFF);
                }
                int n40 = n39;
                if ((n6 & 0x80) != 0x0) {
                    n40 = (n39 & 0xFE3FFFFF);
                }
                int n41 = n40;
                if ((n6 & 0x100) != 0x0) {
                    n41 = (n40 & 0xF1FFFFFF);
                }
                final float n42 = n3;
                n31 = n41;
                n3 = n2;
                n2 = n42;
            }
            else {
                if (n11 != 0) {
                    f = (d)d.a.f;
                }
                if (n15 != 0) {
                    b = true;
                }
                if (n19 != 0) {
                    b2 = false;
                }
                if (n22 != 0) {
                    b3 = true;
                }
                if ((n6 & 0x40) != 0x0) {
                    h = r.u((z0.d)s).h();
                    n31 &= 0xFFC7FFFF;
                }
                if ((n6 & 0x80) != 0x0) {
                    b4 = ColorsKt.b(h, (z0.d)s);
                    n31 &= 0xFE3FFFFF;
                }
                if ((n6 & 0x100) != 0x0) {
                    final u0.a a2 = ((n)s.u((o0)ShapesKt.a)).a;
                    final u0.d c2 = a.c(50);
                    a2.getClass();
                    a = (l0)a2.a(c2, c2, c2, c2);
                    n31 &= 0xF1FFFFFF;
                }
                float n43;
                if (n28 != 0) {
                    n43 = 16;
                }
                else {
                    n43 = n2;
                }
                if (n32 != 0) {
                    b5 = false;
                }
                if (n35 != 0) {
                    n2 = 6;
                }
                else {
                    n2 = n3;
                }
                n3 = n43;
            }
            s.S();
            b b10;
            if (b5) {
                b10 = SwipeRefreshIndicatorKt.b;
            }
            else {
                b10 = SwipeRefreshIndicatorKt.a;
            }
            final f1 e = CompositionLocalsKt.e;
            final float m0 = ((u2.b)s.u((o0)e)).M0(n);
            final int w0 = ((u2.b)s.u((o0)e)).w0(b10.a);
            final float m2 = ((u2.b)s.u((o0)e)).M0(n3);
            final float a3 = c.a();
            s.A(-2136847435);
            final float min = Math.min(1.0f, a3 / m0);
            final float n44 = Math.max(min - 0.4f, 0.0f) * 5 / 3;
            final float abs = Math.abs(a3);
            final float n45 = 2;
            final float n46 = Math.max(0.0f, Math.min(abs - m0, m0 * n45) / m0) / 4;
            final float n47 = (n46 - (float)Math.pow(n46, 2)) * n45;
            final int n48 = (int)(min * m0 + m0 * n47 * n45);
            final float n49 = 0.8f;
            float n50 = n44 * 0.8f;
            if (n50 > 0.8f) {
                n50 = n49;
            }
            final float min2 = Math.min(1.0f, n44);
            s.A(-492369756);
            final Object c3 = s.c0();
            final d$a$a a4 = d$a.a;
            ea.a a5;
            if ((a5 = (ea.a)c3) == a4) {
                a5 = new ea.a();
                s.I0((Object)a5);
            }
            s.R(false);
            final ea.a a6 = a5;
            ((SnapshotMutableStateImpl)a6.a).setValue((Object)(n48 + w0 - w0));
            ((SnapshotMutableStateImpl)a6.b).setValue((Object)0.0f);
            ((SnapshotMutableStateImpl)a6.c).setValue((Object)n50);
            ((SnapshotMutableStateImpl)a6.d).setValue((Object)((n47 * n45 + (0.4f * n44 - 0.25f)) * 0.5f));
            ((SnapshotMutableStateImpl)a6.e).setValue((Object)min2);
            s.R(false);
            s.A(-492369756);
            Object o;
            if ((o = s.c0()) == a4) {
                o = bg.d.t0((Object)0.0f);
                s.I0(o);
            }
            s.R(false);
            final h0 h2 = (h0)o;
            s.A(1303400601);
            if (c.c()) {
                h2.setValue((Object)((Number)((SnapshotMutableStateImpl)a6.a).getValue()).intValue());
            }
            else {
                final boolean b11 = c.b();
                s.A(-568225417);
                int i = 0;
                boolean b12 = false;
                while (i < 4) {
                    b12 |= s.m((new Object[] { h2, c, w0, m2 })[i]);
                    ++i;
                }
                final Object c4 = s.c0();
                Object o2;
                if (b12 || (o2 = c4) == d$a.a) {
                    o2 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(c, w0, m2, h2, (lg2.c)null);
                    s.I0(o2);
                }
                s.R(false);
                z0.s.f((Object)b11, (p)o2, (z0.d)s);
            }
            s.R(false);
            float n51 = 0.0f;
            Label_1775: {
                if (!c.b()) {
                    if (b((h0<Float>)h2) <= 0.5f) {
                        n51 = 0;
                        break Label_1775;
                    }
                }
                n51 = n2;
            }
            final d s2 = SizeKt.s(f, b10.a);
            s.A(-568225417);
            int j = 0;
            boolean b13 = false;
            while (j < 5) {
                b13 |= s.m((new Object[] { h2, w0, b2, c, m0 })[j]);
                ++j;
            }
            final Object c5 = s.c0();
            Object o3;
            if (b13 || (o3 = c5) == d$a.a) {
                o3 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1(w0, b2, c, m0, h2);
                s.I0(o3);
            }
            s.R(false);
            SurfaceKt.a(cg.m0.G(s2, (l)o3), a, h, 0L, null, n51, (p<? super z0.d, ? super Integer, j>)aa1.a.R((z0.d)s, 1903298153, (Lambda)new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3(b10, b3, c, b4, b, m0, a6, n31)), (z0.d)s, 0x180000 | (n31 >> 21 & 0x70) | (n31 >> 12 & 0x380), 24);
            b9 = b3;
            final boolean b14 = b2;
            b8 = b;
            n38 = n3;
            b7 = b14;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$4(c, n, f, b8, b7, b9, h, b4, a, n38, b5, n2, n4, n5, n6);
        }
    }
    
    public static final float b(final h0<Float> h0) {
        return ((Number)((e1)h0).getValue()).floatValue();
    }
}
