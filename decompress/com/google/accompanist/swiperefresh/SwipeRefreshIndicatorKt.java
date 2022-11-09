// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.swiperefresh;

import pg2.j;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.r0;
import z0.d$a$a;
import z0.f1;
import androidx.compose.runtime.ComposerImpl;
import m0.e;
import androidx.compose.material.SurfaceKt;
import kotlin.jvm.internal.Lambda;
import zg2.l;
import androidx.compose.foundation.layout.SizeKt;
import z0.s;
import zg2.p;
import z0.h0;
import fa.a;
import z0.d$a;
import androidx.compose.ui.platform.CompositionLocalsKt;
import z0.o0;
import androidx.compose.material.ShapesKt;
import x0.n;
import androidx.compose.material.ColorsKt;
import ah2.f;
import o1.l0;
import j1.d;
import fa.c;
import fa.b;

public final class SwipeRefreshIndicatorKt
{
    public static final b a;
    public static final b b;
    
    static {
        a = new b((float)40, (float)7.5, (float)2.5, (float)10, (float)5);
        b = new b((float)56, (float)11, (float)3, (float)12, (float)6);
    }
    
    public static final void a(final c c, final float n, d f, boolean b, boolean b2, boolean b3, long h, long b4, l0 a, float n2, boolean b5, float n3, final z0.d d, final int n4, final int n5, final int n6) {
        f.f((Object)c, "state");
        final ComposerImpl r = d.r(373456677);
        int n7;
        if ((n6 & 0x1) != 0x0) {
            n7 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n8;
            if (r.l((Object)c)) {
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
                if (r.n(n)) {
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
                    if (r.l((Object)f)) {
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
                    if (r.m(b)) {
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
                if (r.m(b2)) {
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
                if (r.m(b3)) {
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
            if ((n6 & 0x40) == 0x0 && r.K(h)) {
                n25 = 1048576;
            }
            else {
                n25 = 524288;
            }
            n23 |= n25;
        }
        if ((n4 & 0x1C00000) == 0x0) {
            int n26;
            if ((n6 & 0x80) == 0x0 && r.K(b4)) {
                n26 = 8388608;
            }
            else {
                n26 = 4194304;
            }
            n23 |= n26;
        }
        if ((0xE000000 & n4) == 0x0) {
            int n27;
            if ((n6 & 0x100) == 0x0 && r.l((Object)a)) {
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
                    if (r.n(n2)) {
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
            if (r.m(b5)) {
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
                if (r.n(n3)) {
                    n37 = 32;
                }
                else {
                    n37 = 16;
                }
                n36 = (n33 | n37);
            }
        }
        float n38;
        if ((n31 & 0x5B6DB6DB) == 0x12492492 && (n36 & 0x5B) == 0x12 && r.b()) {
            r.j();
            n38 = n3;
        }
        else {
            r.v0();
            if ((n4 & 0x1) != 0x0 && !r.Y()) {
                r.j();
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
                    h = wq2.b.a((z0.d)r).h();
                    n31 &= 0xFFC7FFFF;
                }
                if ((n6 & 0x80) != 0x0) {
                    b4 = ColorsKt.b(h, (z0.d)r);
                    n31 &= 0xFE3FFFFF;
                }
                if ((n6 & 0x100) != 0x0) {
                    final u0.a a2 = ((n)r.t((o0)ShapesKt.a)).a;
                    final u0.d d2 = wi.b.d(50);
                    a2.getClass();
                    a = (l0)a2.a(d2, d2, d2, d2);
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
            r.S();
            b b6;
            if (b5) {
                b6 = SwipeRefreshIndicatorKt.b;
            }
            else {
                b6 = SwipeRefreshIndicatorKt.a;
            }
            final f1 e = CompositionLocalsKt.e;
            final float m0 = ((u2.b)r.t((o0)e)).M0(n);
            final int s0 = ((u2.b)r.t((o0)e)).s0(b6.a);
            final float m2 = ((u2.b)r.t((o0)e)).M0(n3);
            final float a3 = c.a();
            r.A(-2136847435);
            final float min = Math.min(1.0f, a3 / m0);
            final float n44 = Math.max(min - 0.4f, 0.0f) * 5 / 3;
            final float abs = Math.abs(a3);
            final float n45 = 2;
            final float n46 = Math.max(0.0f, Math.min(abs - m0, m0 * n45) / m0) / 4;
            final float n47 = (n46 - (float)Math.pow(n46, 2)) * n45;
            final int n48 = (int)(min * m0 + m0 * n47 * n45);
            float n49 = 0.8f;
            final float n50 = n44 * 0.8f;
            if (n50 <= 0.8f) {
                n49 = n50;
            }
            final float min2 = Math.min(1.0f, n44);
            r.A(-492369756);
            final Object c2 = r.c0();
            final d$a$a a4 = d$a.a;
            Object o = c2;
            if (c2 == a4) {
                o = new a();
                r.I0(o);
            }
            r.R(false);
            final a a5 = (a)o;
            ((SnapshotMutableStateImpl<Integer>)a5.a).setValue(Integer.valueOf(n48 + s0 - s0));
            ((SnapshotMutableStateImpl<Float>)a5.b).setValue(Float.valueOf(0.0f));
            ((SnapshotMutableStateImpl<Float>)a5.c).setValue(Float.valueOf(n49));
            ((SnapshotMutableStateImpl<Float>)a5.d).setValue(Float.valueOf((n47 * n45 + (0.4f * n44 - 0.25f)) * 0.5f));
            ((SnapshotMutableStateImpl<Float>)a5.e).setValue(Float.valueOf(min2));
            r.R(false);
            r.A(-492369756);
            Object o2;
            if ((o2 = r.c0()) == a4) {
                o2 = a80.a.n0(0.0f);
                r.I0(o2);
            }
            r.R(false);
            final h0 h2 = (h0)o2;
            r.A(1303400601);
            if (c.c()) {
                h2.setValue(((SnapshotMutableStateImpl<Number>)a5.a).getValue().intValue());
            }
            else {
                final boolean b7 = c.b();
                r.A(-568225417);
                int i = 0;
                boolean b8 = false;
                while (i < 4) {
                    b8 |= r.l((new Object[] { h2, c, s0, m2 })[i]);
                    ++i;
                }
                final Object c3 = r.c0();
                Object o3;
                if (b8 || (o3 = c3) == d$a.a) {
                    o3 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(c, s0, m2, h2, (tg2.c)null);
                    r.I0(o3);
                }
                r.R(false);
                s.f(b7, (p)o3, (z0.d)r);
            }
            r.R(false);
            float n51 = 0.0f;
            Label_1757: {
                if (!c.b()) {
                    if (b(h2) <= 0.5f) {
                        n51 = 0;
                        break Label_1757;
                    }
                }
                n51 = n2;
            }
            final d s2 = SizeKt.s(f, b6.a);
            r.A(-568225417);
            int j = 0;
            boolean b9 = false;
            while (j < 5) {
                b9 |= r.l((new Object[] { h2, s0, b2, c, m0 })[j]);
                ++j;
            }
            final Object c4 = r.c0();
            Object o4;
            if (b9 || (o4 = c4) == d$a.a) {
                o4 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1(s0, b2, c, m0, h2);
                r.I0(o4);
            }
            r.R(false);
            SurfaceKt.a(a80.a.T(s2, (l)o4), a, h, 0L, (e)null, n51, (p)at1.a.a0((z0.d)r, 1903298153, (Lambda)new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3(b6, b3, c, b4, b, m0, a5, n31)), (z0.d)r, 0x180000 | (n31 >> 21 & 0x70) | (n31 >> 12 & 0x380), 24);
            n38 = n2;
            n2 = n3;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$4(c, n, f, b, b2, b3, h, b4, a, n2, b5, n38, n4, n5, n6);
        }
    }
    
    public static final float b(final h0<Float> h0) {
        return h0.getValue().floatValue();
    }
}
