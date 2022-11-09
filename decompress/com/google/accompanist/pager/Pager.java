// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.pager;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyDslKt;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import z0.s;
import zg2.p;
import tg2.c;
import z0.d$a;
import z0.r0;
import zg2.q;
import androidx.compose.runtime.ComposerImpl;
import j1.a$b;
import l0.d0;
import l0.n;
import androidx.compose.ui.unit.LayoutDirection;
import j1.a$a;
import p0.a0;
import ah2.f;
import pg2.j;
import ea.b;
import zg2.r;
import zg2.l;
import j1.a$c;
import p0.z;
import j1.d;

public final class Pager
{
    public static final void a(final int n, final d d, final PagerState pagerState, boolean b, float n2, z z, a$c a$c, final n0.d d2, final l<? super Integer, ?> l, final boolean b2, final r<? super b, ? super Integer, ? super z0.d, ? super Integer, j> r, final z0.d d3, final int n3, final int n4, final int n5) {
        f.f((Object)r, "content");
        final ComposerImpl r2 = d3.r(-131850087);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (r2.p(n)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n3);
        }
        else {
            n6 = n3;
        }
        final int n8 = n5 & 0x2;
        int n11 = 0;
        Label_0142: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x30);
            }
            else {
                n9 = n6;
                if ((n3 & 0x70) == 0x0) {
                    int n10;
                    if (r2.l((Object)d)) {
                        n10 = 32;
                    }
                    else {
                        n10 = 16;
                    }
                    n11 = (n6 | n10);
                    break Label_0142;
                }
            }
            n11 = n9;
        }
        if ((n3 & 0x380) == 0x0) {
            int n12;
            if ((n5 & 0x4) == 0x0 && r2.l((Object)pagerState)) {
                n12 = 256;
            }
            else {
                n12 = 128;
            }
            n11 |= n12;
        }
        final int n13 = n5 & 0x8;
        int n16 = 0;
        Label_0262: {
            int n14;
            if (n13 != 0) {
                n14 = (n11 | 0xC00);
            }
            else {
                n14 = n11;
                if ((n3 & 0x1C00) == 0x0) {
                    int n15;
                    if (r2.m(b)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n11 | n15);
                    break Label_0262;
                }
            }
            n16 = n14;
        }
        final int n17 = n5 & 0x10;
        int n18;
        if (n17 != 0) {
            n18 = (n16 | 0x6000);
        }
        else {
            n18 = n16;
            if ((n3 & 0xE000) == 0x0) {
                int n19;
                if (r2.n(n2)) {
                    n19 = 16384;
                }
                else {
                    n19 = 8192;
                }
                n18 = (n16 | n19);
            }
        }
        final int n20 = n5 & 0x20;
        int n21;
        if (n20 != 0) {
            n21 = (n18 | 0x30000);
        }
        else {
            n21 = n18;
            if ((n3 & 0x70000) == 0x0) {
                int n22;
                if (r2.l((Object)z)) {
                    n22 = 131072;
                }
                else {
                    n22 = 65536;
                }
                n21 = (n18 | n22);
            }
        }
        final int n23 = n5 & 0x40;
        int n24;
        if (n23 != 0) {
            n24 = (n21 | 0x180000);
        }
        else {
            n24 = n21;
            if ((n3 & 0x380000) == 0x0) {
                int n25;
                if (r2.l((Object)a$c)) {
                    n25 = 1048576;
                }
                else {
                    n25 = 524288;
                }
                n24 = (n21 | n25);
            }
        }
        int n27;
        if ((n3 & 0x1C00000) == 0x0) {
            int n26;
            if ((n5 & 0x80) == 0x0 && r2.l((Object)d2)) {
                n26 = 8388608;
            }
            else {
                n26 = 4194304;
            }
            n27 = (n24 | n26);
        }
        else {
            n27 = n24;
        }
        final int n28 = n5 & 0x100;
        int n29;
        if (n28 != 0) {
            n29 = (n27 | 0x6000000);
        }
        else {
            n29 = n27;
            if ((n3 & 0xE000000) == 0x0) {
                int n30;
                if (r2.l((Object)l)) {
                    n30 = 67108864;
                }
                else {
                    n30 = 33554432;
                }
                n29 = (n27 | n30);
            }
        }
        final int n31 = n5 & 0x200;
        int n32;
        if (n31 != 0) {
            n32 = (n29 | 0x30000000);
        }
        else {
            n32 = n29;
            if ((n3 & 0x70000000) == 0x0) {
                int n33;
                if (r2.m(b2)) {
                    n33 = 536870912;
                }
                else {
                    n33 = 268435456;
                }
                n32 = (n29 | n33);
            }
        }
        int n34;
        if ((n5 & 0x400) != 0x0) {
            n34 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n35;
            if (r2.l((Object)r)) {
                n35 = 4;
            }
            else {
                n35 = 2;
            }
            n34 = (n4 | n35);
        }
        else {
            n34 = n4;
        }
        n0.d d4;
        Object o = null;
        PagerState pagerState2 = null;
        boolean b3 = false;
        l<? super Integer, ?> i;
        boolean b4 = false;
        if ((n32 & 0x5B6DB6DB) == 0x12492492 && (n34 & 0xB) == 0x2 && r2.b()) {
            r2.j();
            d4 = d2;
            o = d;
            pagerState2 = pagerState;
            b3 = b;
            i = l;
            b4 = b2;
        }
        else {
            r2.v0();
            Object k = null;
            z z3 = null;
            Object o6 = null;
            l<? super Integer, ?> l3 = null;
            Label_1156: {
                int n38;
                l<? super Integer, ?> j;
                Object o2;
                PagerState pagerState3;
                boolean b5;
                Object o3;
                float n39;
                z z2;
                if ((n3 & 0x1) != 0x0 && !r2.Y()) {
                    r2.j();
                    int n36 = n32;
                    if ((n5 & 0x4) != 0x0) {
                        n36 = (n32 & 0xFFFFFC7F);
                    }
                    int n37 = n36;
                    if ((n5 & 0x80) != 0x0) {
                        n37 = (n36 & 0xFE3FFFFF);
                    }
                    n38 = n37;
                    j = l;
                    o2 = a$c;
                    pagerState3 = pagerState;
                    b5 = b;
                    o3 = d2;
                    n39 = n2;
                    z2 = z;
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
                    PagerState a;
                    if ((n5 & 0x4) != 0x0) {
                        a = com.google.accompanist.pager.a.a(0, 1, (z0.d)r2);
                        n32 &= 0xFFFFFC7F;
                    }
                    else {
                        a = pagerState;
                    }
                    if (n13 != 0) {
                        b = false;
                    }
                    if (n17 != 0) {
                        n2 = 0;
                    }
                    Object o4;
                    if (n20 != 0) {
                        final float n40 = 0;
                        o4 = new a0(n40, n40, n40, n40);
                    }
                    else {
                        o4 = z;
                    }
                    if (n23 != 0) {
                        k = a$a.k;
                    }
                    else {
                        k = a$c;
                    }
                    Object a3;
                    if ((n5 & 0x80) != 0x0) {
                        final q<cf2.b, Integer, Integer, Integer> a2 = PagerDefaults.a;
                        a3 = PagerDefaults.a(a, null, null, at1.a.L((z)o4, LayoutDirection.Ltr), (z0.d)r2, (n32 >> 6 & 0xE) | 0x6000, 6);
                        n32 &= 0xFE3FFFFF;
                    }
                    else {
                        a3 = d2;
                    }
                    l<? super Integer, ?> m;
                    if (n28 != 0) {
                        m = null;
                    }
                    else {
                        m = l;
                    }
                    n38 = n32;
                    j = m;
                    o2 = k;
                    pagerState3 = a;
                    b5 = b;
                    o3 = a3;
                    n39 = n2;
                    z2 = (z)o4;
                    o = f;
                    if (n31 != 0) {
                        final l<? super Integer, ?> l2 = m;
                        pagerState2 = a;
                        final Object o5 = a3;
                        final boolean b6 = true;
                        o = f;
                        b3 = b;
                        z3 = (z)o4;
                        o6 = o5;
                        l3 = l2;
                        b4 = b6;
                        break Label_1156;
                    }
                }
                b4 = b2;
                l3 = j;
                k = o2;
                pagerState2 = pagerState3;
                b3 = b5;
                o6 = o3;
                n2 = n39;
                z3 = z2;
                n32 = n38;
            }
            r2.S();
            final int n41 = n32 >> 3;
            b(n, (d)o, pagerState2, b3, n2, false, (n0.d)o6, l3, z3, b4, (a$c)k, null, r, (z0.d)r2, (n32 & 0xE) | 0x30000 | (n32 & 0x70) | (n32 & 0x380) | (n32 & 0x1C00) | (0xE000 & n32) | (n41 & 0x380000) | (n41 & 0x1C00000) | (n32 << 9 & 0xE000000) | (n32 & 0x70000000), (n32 >> 18 & 0xE) | (n34 << 6 & 0x380), 2048);
            final z z4 = z3;
            final n0.d d5 = (n0.d)o6;
            i = l3;
            d4 = d5;
            a$c = (a$c)k;
            z = z4;
        }
        final r0 u = r2.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new Pager$HorizontalPager$1(n, (d)o, pagerState2, b3, n2, z, a$c, d4, (l)i, b4, (r)r, n3, n4, n5);
        }
    }
    
    public static final void b(final int n, final d d, final PagerState pagerState, final boolean b, final float n2, final boolean b2, final n0.d d2, final l<? super Integer, ?> l, final z z, final boolean b3, a$c k, a$b n3, final r<? super b, ? super Integer, ? super z0.d, ? super Integer, j> r, final z0.d d3, final int n4, final int n5, final int n6) {
        f.f((Object)d, "modifier");
        f.f((Object)pagerState, "state");
        f.f((Object)d2, "flingBehavior");
        f.f((Object)z, "contentPadding");
        f.f((Object)r, "content");
        final ComposerImpl r2 = d3.r(-1072219707);
        int n7;
        if ((n6 & 0x1) != 0x0) {
            n7 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n8;
            if (r2.p(n)) {
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
        final int n9 = 16;
        int n10;
        if ((n6 & 0x2) != 0x0) {
            n10 = (n7 | 0x30);
        }
        else {
            n10 = n7;
            if ((n4 & 0x70) == 0x0) {
                int n11;
                if (r2.l((Object)d)) {
                    n11 = 32;
                }
                else {
                    n11 = 16;
                }
                n10 = (n7 | n11);
            }
        }
        final int n12 = 128;
        int n13;
        if ((n6 & 0x4) != 0x0) {
            n13 = (n10 | 0x180);
        }
        else {
            n13 = n10;
            if ((n4 & 0x380) == 0x0) {
                int n14;
                if (r2.l((Object)pagerState)) {
                    n14 = 256;
                }
                else {
                    n14 = 128;
                }
                n13 = (n10 | n14);
            }
        }
        int n17 = 0;
        Label_0294: {
            int n15;
            if ((n6 & 0x8) != 0x0) {
                n15 = (n13 | 0xC00);
            }
            else {
                n15 = n13;
                if ((n4 & 0x1C00) == 0x0) {
                    int n16;
                    if (r2.m(b)) {
                        n16 = 2048;
                    }
                    else {
                        n16 = 1024;
                    }
                    n17 = (n13 | n16);
                    break Label_0294;
                }
            }
            n17 = n15;
        }
        int n18;
        if ((n6 & 0x10) != 0x0) {
            n18 = (n17 | 0x6000);
        }
        else {
            n18 = n17;
            if ((n4 & 0xE000) == 0x0) {
                int n19;
                if (r2.n(n2)) {
                    n19 = 16384;
                }
                else {
                    n19 = 8192;
                }
                n18 = (n17 | n19);
            }
        }
        int n21 = 0;
        Label_0410: {
            int n20;
            if ((n6 & 0x20) != 0x0) {
                n20 = 196608;
            }
            else {
                n21 = n18;
                if ((n4 & 0x70000) != 0x0) {
                    break Label_0410;
                }
                if (r2.m(b2)) {
                    n20 = 131072;
                }
                else {
                    n20 = 65536;
                }
            }
            n21 = (n18 | n20);
        }
        int n23 = 0;
        Label_0465: {
            int n22;
            if ((n6 & 0x40) != 0x0) {
                n22 = 1572864;
            }
            else {
                n23 = n21;
                if ((n4 & 0x380000) != 0x0) {
                    break Label_0465;
                }
                if (r2.l((Object)d2)) {
                    n22 = 1048576;
                }
                else {
                    n22 = 524288;
                }
            }
            n23 = (n21 | n22);
        }
        int n25 = 0;
        Label_0521: {
            int n24;
            if ((n6 & 0x80) != 0x0) {
                n24 = 12582912;
            }
            else {
                n25 = n23;
                if ((n4 & 0x1C00000) != 0x0) {
                    break Label_0521;
                }
                if (r2.l((Object)l)) {
                    n24 = 8388608;
                }
                else {
                    n24 = 4194304;
                }
            }
            n25 = (n23 | n24);
        }
        int n27 = 0;
        Label_0577: {
            int n26;
            if ((n6 & 0x100) != 0x0) {
                n26 = 100663296;
            }
            else {
                n27 = n25;
                if ((0xE000000 & n4) != 0x0) {
                    break Label_0577;
                }
                if (r2.l((Object)z)) {
                    n26 = 67108864;
                }
                else {
                    n26 = 33554432;
                }
            }
            n27 = (n25 | n26);
        }
        int n28;
        if ((n6 & 0x200) != 0x0) {
            n28 = (n27 | 0x30000000);
        }
        else {
            n28 = n27;
            if ((0x70000000 & n4) == 0x0) {
                int n29;
                if (r2.m(b3)) {
                    n29 = 536870912;
                }
                else {
                    n29 = 268435456;
                }
                n28 = (n27 | n29);
            }
        }
        final int n30 = n6 & 0x400;
        int n31;
        if (n30 != 0) {
            n31 = (n5 | 0x6);
        }
        else if ((n5 & 0xE) == 0x0) {
            int n32;
            if (r2.l((Object)k)) {
                n32 = 4;
            }
            else {
                n32 = 2;
            }
            n31 = (n5 | n32);
        }
        else {
            n31 = n5;
        }
        final int n33 = n6 & 0x800;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x30);
        }
        else {
            n34 = n31;
            if ((n5 & 0x70) == 0x0) {
                int n35 = n9;
                if (r2.l((Object)n3)) {
                    n35 = 32;
                }
                n34 = (n31 | n35);
            }
        }
        int n36;
        if ((n6 & 0x1000) != 0x0) {
            n36 = (n34 | 0x180);
        }
        else {
            n36 = n34;
            if ((n5 & 0x380) == 0x0) {
                int n37 = n12;
                if (r2.l((Object)r)) {
                    n37 = 256;
                }
                n36 = (n34 | n37);
            }
        }
        if ((0x5B6DB6DB & n28) == 0x12492492 && (n36 & 0x2DB) == 0x92 && r2.b()) {
            r2.j();
        }
        else {
            if (n30 != 0) {
                k = (a$c)a$a.k;
            }
            if (n33 != 0) {
                n3 = (a$b)a$a.n;
            }
            if (n < 0) {
                throw new IllegalArgumentException("pageCount must be >= 0".toString());
            }
            final int n38 = n28 >> 18;
            r2.A(1157296644);
            final boolean i = r2.l((Object)d2);
            final Object c0 = r2.c0();
            Object o;
            if (i || (o = c0) == d$a.a) {
                o = new Pager$Pager$2$1(d2);
                r2.I0(o);
            }
            r2.R(false);
            ((SnapshotMutableStateImpl<zg2.a>)pagerState.g).setValue((zg2.a)o);
            final int n39 = n28 >> 6;
            r2.A(511388516);
            final boolean j = r2.l((Object)pagerState);
            final boolean m = r2.l((Object)n);
            final Object c2 = r2.c0();
            Object o2;
            if ((j | m) || (o2 = c2) == d$a.a) {
                o2 = new Pager$Pager$3$1(pagerState, n, (c)null);
                r2.I0(o2);
            }
            r2.R(false);
            s.f(n, (p)o2, (z0.d)r2);
            r2.A(1157296644);
            final boolean l2 = r2.l((Object)pagerState);
            final Object c3 = r2.c0();
            Object o3;
            if (l2 || (o3 = c3) == d$a.a) {
                o3 = new Pager$Pager$4$1(pagerState, (c)null);
                r2.I0(o3);
            }
            r2.R(false);
            s.f(pagerState, (p)o3, (z0.d)r2);
            r2.A(1157296644);
            final boolean l3 = r2.l((Object)pagerState);
            final Object c4 = r2.c0();
            Object o4;
            if (l3 || (o4 = c4) == d$a.a) {
                o4 = new Pager$Pager$5$1(pagerState, (c)null);
                r2.I0(o4);
            }
            r2.R(false);
            s.f(pagerState, (p)o4, (z0.d)r2);
            final u2.b b4 = (u2.b)r2.t((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)r2.t((o0)CompositionLocalsKt.k);
            r2.A(-568225417);
            int n40 = 0;
            boolean b5 = false;
            while (n40 < 6) {
                b5 |= r2.l((new Object[] { b4, pagerState, b2, b, z, layoutDirection })[n40]);
                ++n40;
            }
            final Object c5 = r2.c0();
            Object o5;
            if (b5 || (o5 = c5) == d$a.a) {
                o5 = new Pager$Pager$6$1(b4, pagerState, b2, b, z, layoutDirection, (c)null);
                r2.I0(o5);
            }
            r2.R(false);
            s.g(new Object[] { b4, z, b2, layoutDirection, b, pagerState }, (p)o5, (z0.d)r2);
            r2.A(1157296644);
            final boolean l4 = r2.l((Object)pagerState);
            final Object c6 = r2.c0();
            ea.c c7;
            if (l4 || (c7 = (ea.c)c6) == d$a.a) {
                c7 = new ea.c(pagerState);
                r2.I0((Object)c7);
            }
            r2.R(false);
            final ea.c c8 = c7;
            final ea.a a = new ea.a(b2 ^ true, b2);
            if (b2) {
                r2.A(-510389783);
                final LazyListState a2 = pagerState.a;
                final androidx.compose.foundation.layout.a.a$h i2 = androidx.compose.foundation.layout.a.i(n2, k);
                r2.A(-568225417);
                boolean b6;
                for (int n41 = (b6 = false) ? 1 : 0; n41 < 5; ++n41) {
                    b6 |= r2.l((new Object[] { n, l, a, r, c8 })[n41]);
                }
                Object c9 = r2.c0();
                if (b6 || c9 == d$a.a) {
                    c9 = new Pager$Pager$7$1(n, (l)l, a, (r)r, c8, n36);
                    r2.I0(c9);
                }
                r2.R(false);
                LazyDslKt.a(d, a2, z, b, (androidx.compose.foundation.layout.a.k)i2, n3, d2, b3, (l<? super androidx.compose.foundation.lazy.b, j>)c9, (z0.d)r2, (n28 >> 3 & 0xE) | (n38 & 0x380) | (n28 & 0x1C00) | (n36 << 12 & 0x70000) | (n28 & 0x380000) | (n39 & 0x1C00000), 0);
                r2.R(false);
            }
            else {
                r2.A(-510388576);
                final LazyListState a3 = pagerState.a;
                final androidx.compose.foundation.layout.a.a$h h = androidx.compose.foundation.layout.a.h(n2, n3);
                r2.A(-568225417);
                boolean b7;
                for (int n42 = (b7 = false) ? 1 : 0; n42 < 5; ++n42) {
                    b7 |= r2.l((new Object[] { n, l, a, r, c8 })[n42]);
                }
                Object c10 = r2.c0();
                if (b7 || c10 == d$a.a) {
                    c10 = new Pager$Pager$8$1(n, (l)l, a, (r)r, c8, n36);
                    r2.I0(c10);
                }
                r2.R(false);
                LazyDslKt.b(d, a3, z, b, (androidx.compose.foundation.layout.a.d)h, k, d2, b3, (l<? super androidx.compose.foundation.lazy.b, j>)c10, (z0.d)r2, (n28 >> 3 & 0xE) | (n38 & 0x380) | (n28 & 0x1C00) | (n36 << 15 & 0x70000) | (n28 & 0x380000) | (n39 & 0x1C00000), 0);
                r2.R(false);
            }
        }
        final r0 u = r2.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new Pager$Pager$9(n, d, pagerState, b, n2, b2, d2, (l)l, z, b3, k, n3, (r)r, n4, n5, n6);
        }
    }
    
    public static final void c(final int n, final d d, final PagerState pagerState, boolean b, float n2, final z z, final a$b a$b, final n0.d d2, final l<? super Integer, ?> l, final boolean b2, final r<? super b, ? super Integer, ? super z0.d, ? super Integer, j> r, final z0.d d3, final int n3, final int n4, final int n5) {
        f.f((Object)r, "content");
        final ComposerImpl r2 = d3.r(323934645);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (r2.p(n)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n3);
        }
        else {
            n6 = n3;
        }
        final int n8 = n5 & 0x2;
        int n11 = 0;
        Label_0143: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x30);
            }
            else {
                n9 = n6;
                if ((n3 & 0x70) == 0x0) {
                    int n10;
                    if (r2.l((Object)d)) {
                        n10 = 32;
                    }
                    else {
                        n10 = 16;
                    }
                    n11 = (n6 | n10);
                    break Label_0143;
                }
            }
            n11 = n9;
        }
        if ((n3 & 0x380) == 0x0) {
            int n12;
            if ((n5 & 0x4) == 0x0 && r2.l((Object)pagerState)) {
                n12 = 256;
            }
            else {
                n12 = 128;
            }
            n11 |= n12;
        }
        final int n13 = n5 & 0x8;
        int n16 = 0;
        Label_0263: {
            int n14;
            if (n13 != 0) {
                n14 = (n11 | 0xC00);
            }
            else {
                n14 = n11;
                if ((n3 & 0x1C00) == 0x0) {
                    int n15;
                    if (r2.m(b)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n11 | n15);
                    break Label_0263;
                }
            }
            n16 = n14;
        }
        final int n17 = n5 & 0x10;
        int n18;
        if (n17 != 0) {
            n18 = (n16 | 0x6000);
        }
        else {
            n18 = n16;
            if ((n3 & 0xE000) == 0x0) {
                int n19;
                if (r2.n(n2)) {
                    n19 = 16384;
                }
                else {
                    n19 = 8192;
                }
                n18 = (n16 | n19);
            }
        }
        final int n20 = n5 & 0x20;
        int n21;
        if (n20 != 0) {
            n21 = (n18 | 0x30000);
        }
        else {
            n21 = n18;
            if ((n3 & 0x70000) == 0x0) {
                int n22;
                if (r2.l((Object)z)) {
                    n22 = 131072;
                }
                else {
                    n22 = 65536;
                }
                n21 = (n18 | n22);
            }
        }
        final int n23 = n5 & 0x40;
        int n24;
        if (n23 != 0) {
            n24 = (n21 | 0x180000);
        }
        else {
            n24 = n21;
            if ((n3 & 0x380000) == 0x0) {
                int n25;
                if (r2.l((Object)a$b)) {
                    n25 = 1048576;
                }
                else {
                    n25 = 524288;
                }
                n24 = (n21 | n25);
            }
        }
        int n27;
        if ((n3 & 0x1C00000) == 0x0) {
            int n26;
            if ((n5 & 0x80) == 0x0 && r2.l((Object)d2)) {
                n26 = 8388608;
            }
            else {
                n26 = 4194304;
            }
            n27 = (n24 | n26);
        }
        else {
            n27 = n24;
        }
        final int n28 = n5 & 0x100;
        int n29;
        if (n28 != 0) {
            n29 = (n27 | 0x6000000);
        }
        else {
            n29 = n27;
            if ((n3 & 0xE000000) == 0x0) {
                int n30;
                if (r2.l((Object)l)) {
                    n30 = 67108864;
                }
                else {
                    n30 = 33554432;
                }
                n29 = (n27 | n30);
            }
        }
        final int n31 = n5 & 0x200;
        int n32;
        if (n31 != 0) {
            n32 = (n29 | 0x30000000);
        }
        else {
            n32 = n29;
            if ((n3 & 0x70000000) == 0x0) {
                int n33;
                if (r2.m(b2)) {
                    n33 = 536870912;
                }
                else {
                    n33 = 268435456;
                }
                n32 = (n29 | n33);
            }
        }
        int n34;
        if ((n5 & 0x400) != 0x0) {
            n34 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n35;
            if (r2.l((Object)r)) {
                n35 = 4;
            }
            else {
                n35 = 2;
            }
            n34 = (n4 | n35);
        }
        else {
            n34 = n4;
        }
        l<? super Integer, ?> i = null;
        Object o = null;
        PagerState pagerState2;
        z z2 = null;
        a$b a$b2;
        n0.d d4 = null;
        boolean b3;
        if ((n32 & 0x5B6DB6DB) == 0x12492492 && (n34 & 0xB) == 0x2 && r2.b()) {
            r2.j();
            i = l;
            o = d;
            pagerState2 = pagerState;
            z2 = z;
            a$b2 = a$b;
            d4 = d2;
            b3 = b2;
        }
        else {
            r2.v0();
            Object n41 = null;
            PagerState pagerState4 = null;
            boolean b6 = false;
            boolean b7 = false;
            Label_1164: {
                int n38;
                l<? super Integer, ?> j;
                Object o2;
                PagerState pagerState3;
                boolean b4;
                Object o3;
                float n39;
                z z3;
                if ((n3 & 0x1) != 0x0 && !r2.Y()) {
                    r2.j();
                    int n36 = n32;
                    if ((n5 & 0x4) != 0x0) {
                        n36 = (n32 & 0xFFFFFC7F);
                    }
                    int n37 = n36;
                    if ((n5 & 0x80) != 0x0) {
                        n37 = (n36 & 0xFE3FFFFF);
                    }
                    n38 = n37;
                    j = l;
                    o2 = a$b;
                    pagerState3 = pagerState;
                    b4 = b;
                    o3 = d2;
                    n39 = n2;
                    z3 = z;
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
                    PagerState a;
                    if ((n5 & 0x4) != 0x0) {
                        a = com.google.accompanist.pager.a.a(0, 1, (z0.d)r2);
                        n32 &= 0xFFFFFC7F;
                    }
                    else {
                        a = pagerState;
                    }
                    if (n13 != 0) {
                        b = false;
                    }
                    if (n17 != 0) {
                        n2 = 0;
                    }
                    Object o4;
                    if (n20 != 0) {
                        final float n40 = 0;
                        o4 = new a0(n40, n40, n40, n40);
                    }
                    else {
                        o4 = z;
                    }
                    if (n23 != 0) {
                        n41 = a$a.n;
                    }
                    else {
                        n41 = a$b;
                    }
                    Object a3;
                    if ((n5 & 0x80) != 0x0) {
                        final q<cf2.b, Integer, Integer, Integer> a2 = PagerDefaults.a;
                        a3 = PagerDefaults.a(a, null, null, ((z)o4).a(), (z0.d)r2, (n32 >> 6 & 0xE) | 0x6000, 6);
                        n32 &= 0xFE3FFFFF;
                    }
                    else {
                        a3 = d2;
                    }
                    l<? super Integer, ?> k;
                    if (n28 != 0) {
                        k = null;
                    }
                    else {
                        k = l;
                    }
                    n38 = n32;
                    j = k;
                    o2 = n41;
                    pagerState3 = a;
                    b4 = b;
                    o3 = a3;
                    n39 = n2;
                    z3 = (z)o4;
                    o = f;
                    if (n31 != 0) {
                        final l<? super Integer, ?> m = k;
                        pagerState4 = a;
                        final n0.d d5 = (n0.d)a3;
                        final boolean b5 = true;
                        o = f;
                        b6 = b;
                        z2 = (z)o4;
                        d4 = d5;
                        i = m;
                        b7 = b5;
                        break Label_1164;
                    }
                }
                b7 = b2;
                i = j;
                n41 = o2;
                pagerState4 = pagerState3;
                b6 = b4;
                d4 = (n0.d)o3;
                n2 = n39;
                z2 = z3;
                n32 = n38;
            }
            r2.S();
            final int n42 = n32 >> 3;
            b(n, (d)o, pagerState4, b6, n2, true, d4, i, z2, b7, null, (a$b)n41, r, (z0.d)r2, (n32 & 0xE) | 0x30000 | (n32 & 0x70) | (n32 & 0x380) | (n32 & 0x1C00) | (0xE000 & n32) | (n42 & 0x380000) | (n42 & 0x1C00000) | (n32 << 9 & 0xE000000) | (n32 & 0x70000000), (n32 >> 15 & 0x70) | (n34 << 6 & 0x380), 1024);
            b3 = b7;
            a$b2 = (a$b)n41;
            b = b6;
            pagerState2 = pagerState4;
        }
        final r0 u = r2.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new Pager$VerticalPager$1(n, (d)o, pagerState2, b, n2, z2, a$b2, d4, (l)i, b3, (r)r, n3, n4, n5);
        }
    }
}
