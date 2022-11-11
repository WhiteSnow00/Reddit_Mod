// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.f1;
import z0.h0;
import ej2.b0;
import z0.d$a$a;
import androidx.compose.runtime.ComposerImpl;
import p0.f;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import z0.e1;
import z0.o0;
import u2.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import z0.l;
import z0.s;
import kotlin.coroutines.EmptyCoroutineContext;
import z0.d$a;
import p0.a0;
import j1.a$a;
import sg2.e;
import rg2.p;
import rg2.r;
import p0.z;
import j1.d;
import hg2.j;
import rg2.a;
import ea.c;

public final class SwipeRefreshKt
{
    public static final void a(final c c, final a<j> a, final d d, boolean i, float n, j1.a a2, final z z, final r<? super c, ? super u2.d, ? super z0.d, ? super Integer, j> r, boolean b, final p<? super z0.d, ? super Integer, j> p13, final z0.d d2, final int n2, final int n3) {
        e.f((Object)c, "state");
        e.f((Object)a, "onRefresh");
        e.f((Object)p13, "content");
        final ComposerImpl s = d2.s(2017402940);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (s.m((Object)c)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n2);
        }
        else {
            n4 = n2;
        }
        int n6;
        if ((n3 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n2 & 0x70) == 0x0) {
                int n7;
                if (s.m((Object)a)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        final int n8 = n3 & 0x4;
        int n11 = 0;
        Label_0214: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x180);
            }
            else {
                n9 = n6;
                if ((n2 & 0x380) == 0x0) {
                    int n10;
                    if (s.m((Object)d)) {
                        n10 = 256;
                    }
                    else {
                        n10 = 128;
                    }
                    n11 = (n6 | n10);
                    break Label_0214;
                }
            }
            n11 = n9;
        }
        final int n12 = n3 & 0x8;
        int n15 = 0;
        Label_0286: {
            int n13;
            if (n12 != 0) {
                n13 = (n11 | 0xC00);
            }
            else {
                n13 = n11;
                if ((n2 & 0x1C00) == 0x0) {
                    int n14;
                    if (s.n(i)) {
                        n14 = 2048;
                    }
                    else {
                        n14 = 1024;
                    }
                    n15 = (n11 | n14);
                    break Label_0286;
                }
            }
            n15 = n13;
        }
        final int n16 = n3 & 0x10;
        int n19 = 0;
        Label_0358: {
            int n17;
            if (n16 != 0) {
                n17 = (n15 | 0x6000);
            }
            else {
                n17 = n15;
                if ((0xE000 & n2) == 0x0) {
                    int n18;
                    if (s.o(n)) {
                        n18 = 16384;
                    }
                    else {
                        n18 = 8192;
                    }
                    n19 = (n15 | n18);
                    break Label_0358;
                }
            }
            n19 = n17;
        }
        final int n20 = n3 & 0x20;
        int n21;
        if (n20 != 0) {
            n21 = (n19 | 0x30000);
        }
        else {
            n21 = n19;
            if ((0x70000 & n2) == 0x0) {
                int n22;
                if (s.m((Object)a2)) {
                    n22 = 131072;
                }
                else {
                    n22 = 65536;
                }
                n21 = (n19 | n22);
            }
        }
        final int n23 = n3 & 0x40;
        int n24;
        if (n23 != 0) {
            n24 = (n21 | 0x180000);
        }
        else {
            n24 = n21;
            if ((n2 & 0x380000) == 0x0) {
                int n25;
                if (s.m((Object)z)) {
                    n25 = 1048576;
                }
                else {
                    n25 = 524288;
                }
                n24 = (n21 | n25);
            }
        }
        final int n26 = n3 & 0x80;
        int n27;
        if (n26 != 0) {
            n27 = (n24 | 0xC00000);
        }
        else {
            n27 = n24;
            if ((n2 & 0x1C00000) == 0x0) {
                int n28;
                if (s.m((Object)r)) {
                    n28 = 8388608;
                }
                else {
                    n28 = 4194304;
                }
                n27 = (n24 | n28);
            }
        }
        final int n29 = n3 & 0x100;
        int n30;
        if (n29 != 0) {
            n30 = (n27 | 0x6000000);
        }
        else {
            n30 = n27;
            if ((n2 & 0xE000000) == 0x0) {
                int n31;
                if (s.n(b)) {
                    n31 = 67108864;
                }
                else {
                    n31 = 33554432;
                }
                n30 = (n27 | n31);
            }
        }
        int n33 = 0;
        Label_0667: {
            int n32;
            if ((n3 & 0x200) != 0x0) {
                n32 = 805306368;
            }
            else {
                n33 = n30;
                if ((0x70000000 & n2) != 0x0) {
                    break Label_0667;
                }
                if (s.m((Object)p13)) {
                    n32 = 536870912;
                }
                else {
                    n32 = 268435456;
                }
            }
            n33 = (n30 | n32);
        }
        z z2;
        Object a3;
        Object f;
        if ((0x5B6DB6DB & n33) == 0x12492492 && s.c()) {
            s.k();
            z2 = z;
            a3 = r;
            f = d;
        }
        else {
            if (n8 != 0) {
                f = d.a.f;
            }
            else {
                f = d;
            }
            if (n12 != 0) {
                i = true;
            }
            if (n16 != 0) {
                n = 80;
            }
            Object b2;
            if (n20 != 0) {
                b2 = a$a.b;
            }
            else {
                b2 = a2;
            }
            Object o;
            if (n23 != 0) {
                final float n34 = 0;
                o = new a0(n34, n34, n34, n34);
            }
            else {
                o = z;
            }
            if (n26 != 0) {
                a3 = ComposableSingletons$SwipeRefreshKt.a;
            }
            else {
                a3 = r;
            }
            if (n29 != 0) {
                b = true;
            }
            final Object h = a.h(s, 773894976, -492369756);
            final d$a$a a4 = d$a.a;
            l o2;
            if ((o2 = (l)h) == a4) {
                o2 = android.support.v4.media.a.o(z0.s.i(EmptyCoroutineContext.INSTANCE, (z0.d)s), s);
            }
            s.R(false);
            final b0 f2 = o2.f;
            s.R(false);
            final h0 x0 = bg.d.x0((Object)a, (z0.d)s);
            final boolean c2 = c.c();
            s.A(1157296644);
            final boolean m = s.m((Object)c);
            final Object c3 = s.c0();
            Object o3;
            if (m || (o3 = c3) == a4) {
                o3 = new SwipeRefreshKt$SwipeRefresh$1$1(c, (lg2.c)null);
                s.I0(o3);
            }
            s.R(false);
            z0.s.f((Object)c2, (p)o3, (z0.d)s);
            final f1 e = CompositionLocalsKt.e;
            final float m2 = ((b)s.u((o0)e)).M0(n);
            s.A(511388516);
            final boolean j = s.m((Object)c);
            final boolean k = s.m((Object)f2);
            final Object c4 = s.c0();
            SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection;
            if ((j | k) || (swipeRefreshNestedScrollConnection = (SwipeRefreshNestedScrollConnection)c4) == a4) {
                swipeRefreshNestedScrollConnection = new SwipeRefreshNestedScrollConnection(c, f2, (a)new SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1((e1)x0));
                s.I0((Object)swipeRefreshNestedScrollConnection);
            }
            s.R(false);
            final SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection2 = swipeRefreshNestedScrollConnection;
            swipeRefreshNestedScrollConnection2.i = i;
            swipeRefreshNestedScrollConnection2.j = m2;
            final j a5 = hg2.j.a;
            final d a6 = NestedScrollModifierKt.a((d)f, (y1.a)swipeRefreshNestedScrollConnection2, (NestedScrollDispatcher)null);
            s.A(733328855);
            final j1.b a7 = a$a.a;
            final c2.s c5 = BoxKt.c((j1.a)a7, false, (z0.d)s);
            s.A(-1323940314);
            final b b3 = (b)s.u((o0)e);
            final f1 l = CompositionLocalsKt.k;
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)l);
            final f1 o4 = CompositionLocalsKt.o;
            final h1 h2 = (h1)s.u((o0)o4);
            ComposeUiNode.u2.getClass();
            final a b4 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b5 = LayoutKt.b(a6);
            if (!(s.a instanceof z0.c)) {
                bg.d.k0();
                throw null;
            }
            s.j();
            if (s.K) {
                s.E(b4);
            }
            else {
                s.f();
            }
            s.x = false;
            final p e2 = ComposeUiNode$Companion.e;
            Updater.b((z0.d)s, c5, e2);
            final p d3 = ComposeUiNode$Companion.d;
            Updater.b((z0.d)s, b3, d3);
            final p f3 = ComposeUiNode$Companion.f;
            Updater.b((z0.d)s, layoutDirection, f3);
            final p g = ComposeUiNode$Companion.g;
            a81.e.w(0, b5, d.v(s, h2, g, s), s, 2058660585, -2137368960);
            final f a8 = p0.f.a;
            p13.invoke((Object)s, Integer.valueOf(n33 >> 27 & 0xE));
            final d.a f4 = d.a.f;
            Object p14;
            if (!b) {
                p14 = aa1.a.P((d)f4);
            }
            else {
                p14 = f4;
            }
            d d4 = a8.c(aa1.a.M0((d)p14, (z)o));
            if (b) {
                d4 = aa1.a.P(d4);
            }
            final c2.s f5 = al0.b.f(s, 733328855, a7, false, s, -1323940314);
            final b b6 = (b)s.u((o0)e);
            final LayoutDirection layoutDirection2 = (LayoutDirection)s.u((o0)l);
            final h1 h3 = (h1)s.u((o0)o4);
            final ComposableLambdaImpl b7 = LayoutKt.b(d4);
            if (!(s.a instanceof z0.c)) {
                bg.d.k0();
                throw null;
            }
            s.j();
            if (s.K) {
                s.E(b4);
            }
            else {
                s.f();
            }
            s.x = false;
            a81.e.w(0, b7, a.t(s, f5, e2, s, b6, d3, s, layoutDirection2, f3, s, h3, g, s), s, 2058660585, -2137368960);
            final d e3 = a8.e((d)f4, (j1.a)b2);
            final c2.s f6 = al0.b.f(s, 733328855, a7, false, s, -1323940314);
            final b b8 = (b)s.u((o0)e);
            final LayoutDirection layoutDirection3 = (LayoutDirection)s.u((o0)l);
            final h1 h4 = (h1)s.u((o0)o4);
            final ComposableLambdaImpl b9 = LayoutKt.b(e3);
            if (!(s.a instanceof z0.c)) {
                bg.d.k0();
                throw null;
            }
            s.j();
            if (s.K) {
                s.E(b4);
            }
            else {
                s.f();
            }
            s.x = false;
            b9.invoke((Object)a.t(s, f6, e2, s, b8, d3, s, layoutDirection3, f3, s, h4, g, s), (Object)s, (Object)0);
            s.A(2058660585);
            s.A(-2137368960);
            ((r<c, u2.d, ComposerImpl, Integer, Object>)a3).invoke(c, new u2.d(n), s, Integer.valueOf((n33 & 0xE) | (n33 >> 9 & 0x70) | (n33 >> 15 & 0x380)));
            s.R(false);
            aw.b.r(s, false, true, false, false);
            aw.b.r(s, false, false, true, false);
            aw.b.r(s, false, false, false, true);
            s.R(false);
            s.R(false);
            z2 = (z)o;
            a2 = (j1.a)b2;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new SwipeRefreshKt$SwipeRefresh$3(c, (a)a, (d)f, i, n, a2, z2, (r)a3, b, (p)p13, n2, n3);
        }
    }
    
    public static final c b(final boolean b, final z0.d d) {
        Object i;
        if ((i = a.i(d, -1963273955, -492369756)) == d$a.a) {
            i = new c(b);
            d.w(i);
        }
        d.I();
        final c c = (c)i;
        ((SnapshotMutableStateImpl)c.c).setValue((Object)b);
        d.I();
        return c;
    }
}
