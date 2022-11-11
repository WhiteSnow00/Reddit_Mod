// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.pager;

import z0.r0;
import zg2.p;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import c2.s;
import z0.f1;
import androidx.compose.runtime.ComposerImpl;
import eg.n0;
import z0.d$a;
import pg2.j;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import j1.a;
import androidx.compose.foundation.layout.BoxKt;
import j1.a$a;
import u2.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.material.ContentAlphaKt;
import z0.o0;
import androidx.compose.material.ContentColorKt;
import o1.r;
import ah2.f;
import o1.l0;
import zg2.l;
import j1.d;

public final class PagerIndicatorKt
{
    public static final void a(final PagerState pagerState, final d d, int h, final l<? super Integer, Integer> l, long b, long b2, float n, float n2, float n3, l0 l2, final z0.d d2, final int n4, final int n5) {
        f.f((Object)pagerState, "pagerState");
        final ComposerImpl r = d2.r(1678773673);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n7;
            if (r.l((Object)pagerState)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n4);
        }
        else {
            n6 = n4;
        }
        final int n8 = n5 & 0x2;
        int n11 = 0;
        Label_0141: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x30);
            }
            else {
                n9 = n6;
                if ((n4 & 0x70) == 0x0) {
                    int n10;
                    if (r.l((Object)d)) {
                        n10 = 32;
                    }
                    else {
                        n10 = 16;
                    }
                    n11 = (n6 | n10);
                    break Label_0141;
                }
            }
            n11 = n9;
        }
        if ((n4 & 0x380) == 0x0) {
            int n12;
            if ((n5 & 0x4) == 0x0 && r.p(h)) {
                n12 = 256;
            }
            else {
                n12 = 128;
            }
            n11 |= n12;
        }
        final int n13 = n5 & 0x8;
        int n16 = 0;
        Label_0261: {
            int n14;
            if (n13 != 0) {
                n14 = (n11 | 0xC00);
            }
            else {
                n14 = n11;
                if ((n4 & 0x1C00) == 0x0) {
                    int n15;
                    if (r.l((Object)l)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n11 | n15);
                    break Label_0261;
                }
            }
            n16 = n14;
        }
        if ((0xE000 & n4) == 0x0) {
            int n17;
            if ((n5 & 0x10) == 0x0 && r.K(b)) {
                n17 = 16384;
            }
            else {
                n17 = 8192;
            }
            n16 |= n17;
        }
        if ((0x70000 & n4) == 0x0) {
            int n18;
            if ((n5 & 0x20) == 0x0 && r.K(b2)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n16 |= n18;
        }
        final int n19 = n5 & 0x40;
        int n22 = 0;
        Label_0426: {
            int n20;
            if (n19 != 0) {
                n20 = (n16 | 0x180000);
            }
            else {
                n20 = n16;
                if ((0x380000 & n4) == 0x0) {
                    int n21;
                    if (r.n(n)) {
                        n21 = 1048576;
                    }
                    else {
                        n21 = 524288;
                    }
                    n22 = (n16 | n21);
                    break Label_0426;
                }
            }
            n22 = n20;
        }
        if ((n4 & 0x1C00000) == 0x0) {
            int n23;
            if ((n5 & 0x80) == 0x0 && r.n(n2)) {
                n23 = 8388608;
            }
            else {
                n23 = 4194304;
            }
            n22 |= n23;
        }
        if ((n4 & 0xE000000) == 0x0) {
            int n24;
            if ((n5 & 0x100) == 0x0 && r.n(n3)) {
                n24 = 67108864;
            }
            else {
                n24 = 33554432;
            }
            n22 |= n24;
        }
        if ((n4 & 0x70000000) == 0x0) {
            int n25;
            if ((n5 & 0x200) == 0x0 && r.l((Object)l2)) {
                n25 = 536870912;
            }
            else {
                n25 = 268435456;
            }
            n22 |= n25;
        }
        Object o;
        l<? super Integer, Integer> i;
        if ((n22 & 0x5B6DB6DB) == 0x12492492 && r.b()) {
            r.j();
            final float n26 = n;
            n = n2;
            o = d;
            i = l;
            n2 = n26;
        }
        else {
            r.v0();
            Object a;
            Object o2;
            if ((n4 & 0x1) != 0x0 && !r.Y()) {
                r.j();
                int n27 = n22;
                if ((n5 & 0x4) != 0x0) {
                    n27 = (n22 & 0xFFFFFC7F);
                }
                int n28 = n27;
                if ((n5 & 0x10) != 0x0) {
                    n28 = (n27 & 0xFFFF1FFF);
                }
                int n29 = n28;
                if ((n5 & 0x20) != 0x0) {
                    n29 = (n28 & 0xFFF8FFFF);
                }
                int n30 = n29;
                if ((n5 & 0x80) != 0x0) {
                    n30 = (n29 & 0xFE3FFFFF);
                }
                int n31 = n30;
                if ((n5 & 0x100) != 0x0) {
                    n31 = (n30 & 0xF1FFFFFF);
                }
                int n32 = n31;
                if ((n5 & 0x200) != 0x0) {
                    n32 = (n31 & 0x8FFFFFFF);
                }
                a = l2;
                o2 = l;
                n22 = n32;
                o = d;
            }
            else {
                Object f;
                if (n8 != 0) {
                    f = j1.d.a.f;
                }
                else {
                    f = d;
                }
                if ((n5 & 0x4) != 0x0) {
                    h = pagerState.h();
                    n22 &= 0xFFFFFC7F;
                }
                Object instance;
                if (n13 != 0) {
                    instance = PagerIndicatorKt$HorizontalPagerIndicator$1.INSTANCE;
                }
                else {
                    instance = l;
                }
                if ((n5 & 0x10) != 0x0) {
                    b = o1.r.b(((r)r.t((o0)ContentColorKt.a)).a, ((Number)r.t((o0)ContentAlphaKt.a)).floatValue());
                    n22 &= 0xFFFF1FFF;
                }
                if ((n5 & 0x20) != 0x0) {
                    b2 = o1.r.b(b, o72.f.o((z0.d)r, 8));
                    n22 &= 0xFFF8FFFF;
                }
                if (n19 != 0) {
                    n = 8;
                }
                if ((n5 & 0x80) != 0x0) {
                    n22 &= 0xFE3FFFFF;
                    n2 = n;
                }
                if ((n5 & 0x100) != 0x0) {
                    n22 &= 0xF1FFFFFF;
                    n3 = n;
                }
                if ((n5 & 0x200) != 0x0) {
                    a = u0.f.a;
                    n22 &= 0x8FFFFFFF;
                    o = f;
                    o2 = instance;
                }
                else {
                    a = l2;
                    o2 = instance;
                    o = f;
                }
            }
            r.S();
            final f1 e = CompositionLocalsKt.e;
            final int s0 = ((b)r.t((o0)e)).s0(n);
            final int s2 = ((b)r.t((o0)e)).s0(n3);
            final j1.b d3 = a$a.d;
            final int n33 = (n22 >> 3 & 0xE) | 0x30;
            r.A(733328855);
            final s c = BoxKt.c((a)d3, false, (z0.d)r);
            r.A(-1323940314);
            final b b3 = (b)r.t((o0)e);
            final f1 k = CompositionLocalsKt.k;
            final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)k);
            final f1 o3 = CompositionLocalsKt.o;
            final k1 k2 = (k1)r.t((o0)o3);
            ComposeUiNode.w2.getClass();
            final zg2.a b4 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b5 = LayoutKt.b((d)o);
            final int n34 = ((n33 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(r.a instanceof c)) {
                yl.a.B0();
                throw null;
            }
            r.h();
            if (r.K) {
                r.i(b4);
            }
            else {
                r.e();
            }
            r.x = false;
            final p e2 = ComposeUiNode$Companion.e;
            Updater.b((z0.d)r, (Object)c, e2);
            final p d4 = ComposeUiNode$Companion.d;
            Updater.b((z0.d)r, (Object)b3, d4);
            final p f2 = ComposeUiNode$Companion.f;
            Updater.b((z0.d)r, (Object)layoutDirection, f2);
            final p g = ComposeUiNode$Companion.g;
            a40.f.v(n34 >> 3 & 0x70, b5, a.m(r, k2, g, r), r, 2058660585);
            r.A(-2137368960);
            if ((n34 >> 9 & 0xE & 0xB) == 0x2 && r.b()) {
                r.j();
            }
            else if ((((n33 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && r.b()) {
                r.j();
            }
            else {
                final androidx.compose.foundation.layout.a.a$h g2 = androidx.compose.foundation.layout.a.g(n3);
                final j1.b.b j = a$a.k;
                r.A(693286680);
                final d.a f3 = j1.d.a.f;
                final s a2 = RowKt.a((androidx.compose.foundation.layout.a.d)g2, j, (z0.d)r);
                r.A(-1323940314);
                final b b6 = (b)r.t((o0)e);
                final LayoutDirection layoutDirection2 = (LayoutDirection)r.t((o0)k);
                final k1 k3 = (k1)r.t((o0)o3);
                final ComposableLambdaImpl b7 = LayoutKt.b((d)f3);
                if (!(r.a instanceof c)) {
                    yl.a.B0();
                    throw null;
                }
                r.h();
                if (r.K) {
                    r.i(b4);
                }
                else {
                    r.e();
                }
                r.x = false;
                b.p(0, b7, a2.b.s(r, a2, e2, r, b6, d4, r, layoutDirection2, f2, r, k3, g, r), r, 2058660585, -678309503);
                final float n35 = n2;
                final float n36 = n;
                final d t = SizeKt.t((d)f3, n36, n35);
                final l0 l3 = (l0)a;
                final d q = aj2.c.q(t, b2, l3);
                r.A(-29724645);
                final int n37 = h;
                for (int n38 = 0; n38 < n37; ++n38) {
                    BoxKt.a(q, (z0.d)r, 0);
                    final j a3 = pg2.j.a;
                }
                d.x(r, false, false, false, true);
                r.R(false);
                r.R(false);
                final d.a f4 = j1.d.a.f;
                r.A(-568225417);
                int n39 = 0;
                boolean b8 = false;
                while (n39 < 5) {
                    b8 |= r.l((new Object[] { o2, pagerState, n37, s2, s0 })[n39]);
                    ++n39;
                }
                final Object c2 = r.c0();
                Object o4;
                if (b8 || (o4 = c2) == d$a.a) {
                    o4 = new PagerIndicatorKt$HorizontalPagerIndicator$2$2$1((l)o2, pagerState, n37, s2, s0);
                    r.I0(o4);
                }
                r.R(false);
                BoxKt.a(aj2.c.q(SizeKt.t(n0.k0((d)f4, (l)o4), n36, n35), b, l3), (z0.d)r, 0);
            }
            d.x(r, false, false, true, false);
            r.R(false);
            final l m = (l)o2;
            final float n40 = n2;
            n2 = n;
            l2 = (l0)a;
            n = n40;
            i = (l<? super Integer, Integer>)m;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new PagerIndicatorKt$HorizontalPagerIndicator$3(pagerState, (d)o, h, (l)i, b, b2, n2, n, n3, l2, n4, n5);
        }
    }
}
