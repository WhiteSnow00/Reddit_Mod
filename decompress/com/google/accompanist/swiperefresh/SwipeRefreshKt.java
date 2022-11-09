// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import ak0.m;
import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.f1;
import z0.h0;
import mj2.b0;
import z0.d$a$a;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
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
import androidx.appcompat.widget.s0;
import p0.a0;
import j1.a$a;
import ah2.f;
import zg2.p;
import zg2.r;
import p0.z;
import j1.d;
import pg2.j;
import zg2.a;
import fa.c;

public final class SwipeRefreshKt
{
    public static final void a(final c c, final a<j> a, final d d, boolean i, float n, final j1.a a2, final z z, r<? super c, ? super u2.d, ? super z0.d, ? super Integer, j> r, boolean b, final p<? super z0.d, ? super Integer, j> p13, final z0.d d2, final int n2, final int n3) {
        f.f((Object)c, "state");
        f.f((Object)a, "onRefresh");
        f.f((Object)p13, "content");
        final ComposerImpl r2 = d2.r(2017402940);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (r2.l((Object)c)) {
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
                if (r2.l((Object)a)) {
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
                    if (r2.l((Object)d)) {
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
                    if (r2.m(i)) {
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
                    if (r2.n(n)) {
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
                if (r2.l((Object)a2)) {
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
                if (r2.l((Object)z)) {
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
                if (r2.l((Object)r)) {
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
                if (r2.m(b)) {
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
                if (r2.l((Object)p13)) {
                    n32 = 536870912;
                }
                else {
                    n32 = 268435456;
                }
            }
            n33 = (n30 | n32);
        }
        j1.a a3;
        Object o;
        Object f;
        if ((0x5B6DB6DB & n33) == 0x12492492 && r2.b()) {
            r2.j();
            a3 = a2;
            o = z;
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
            if (n23 != 0) {
                final float n34 = 0;
                o = new a0(n34, n34, n34, n34);
            }
            else {
                o = z;
            }
            Object a4;
            if (n26 != 0) {
                a4 = ComposableSingletons$SwipeRefreshKt.a;
            }
            else {
                a4 = r;
            }
            if (n29 != 0) {
                b = true;
            }
            final Object j = s0.j(r2, 773894976, -492369756);
            final d$a$a a5 = d$a.a;
            l s;
            if ((s = (l)j) == a5) {
                s = d.s(z0.s.i(EmptyCoroutineContext.INSTANCE, (z0.d)r2), r2);
            }
            r2.R(false);
            final b0 f2 = s.f;
            r2.R(false);
            final h0 v0 = a80.a.v0(a, (z0.d)r2);
            final boolean c2 = c.c();
            r2.A(1157296644);
            final boolean l = r2.l((Object)c);
            final Object c3 = r2.c0();
            Object o2;
            if (l || (o2 = c3) == a5) {
                o2 = new SwipeRefreshKt$SwipeRefresh$1.SwipeRefreshKt$SwipeRefresh$1$1(c, (tg2.c)null);
                r2.I0(o2);
            }
            r2.R(false);
            z0.s.f(c2, (p)o2, (z0.d)r2);
            final f1 e = CompositionLocalsKt.e;
            final float m0 = ((b)r2.t((o0)e)).M0(n);
            r2.A(511388516);
            final boolean k = r2.l((Object)c);
            final boolean l2 = r2.l((Object)f2);
            final Object c4 = r2.c0();
            SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection;
            if ((k | l2) || (swipeRefreshNestedScrollConnection = (SwipeRefreshNestedScrollConnection)c4) == a5) {
                swipeRefreshNestedScrollConnection = new SwipeRefreshNestedScrollConnection(c, f2, (a)new SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1((e1)v0));
                r2.I0((Object)swipeRefreshNestedScrollConnection);
            }
            r2.R(false);
            final SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection2 = swipeRefreshNestedScrollConnection;
            swipeRefreshNestedScrollConnection2.i = i;
            swipeRefreshNestedScrollConnection2.j = m0;
            final j a6 = pg2.j.a;
            final d a7 = NestedScrollModifierKt.a((d)f, (y1.a)swipeRefreshNestedScrollConnection2, (NestedScrollDispatcher)null);
            r2.A(733328855);
            final j1.b a8 = a$a.a;
            final c2.s c5 = BoxKt.c((j1.a)a8, false, (z0.d)r2);
            r2.A(-1323940314);
            final b b3 = (b)r2.t((o0)e);
            final f1 k2 = CompositionLocalsKt.k;
            final LayoutDirection layoutDirection = (LayoutDirection)r2.t((o0)k2);
            final f1 o3 = CompositionLocalsKt.o;
            final k1 k3 = (k1)r2.t((o0)o3);
            ComposeUiNode.w2.getClass();
            final a b4 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b5 = LayoutKt.b(a7);
            if (!(r2.a instanceof z0.c)) {
                yl.a.B0();
                throw null;
            }
            r2.h();
            if (r2.K) {
                r2.i(b4);
            }
            else {
                r2.e();
            }
            r2.x = false;
            final p e2 = ComposeUiNode$Companion.e;
            Updater.b((z0.d)r2, (Object)c5, e2);
            final p d3 = ComposeUiNode$Companion.d;
            Updater.b((z0.d)r2, (Object)b3, d3);
            final p f3 = ComposeUiNode$Companion.f;
            Updater.b((z0.d)r2, (Object)layoutDirection, f3);
            final p g = ComposeUiNode$Companion.g;
            b.p(0, b5, a.m(r2, k3, g, r2), r2, 2058660585, -2137368960);
            final p0.f a9 = p0.f.a;
            p13.invoke((Object)r2, (Object)(n33 >> 27 & 0xE));
            final d.a f4 = d.a.f;
            Object y;
            if (!b) {
                y = at1.a.Y((d)f4);
            }
            else {
                y = f4;
            }
            d d4 = a9.c(at1.a.o1((d)y, (z)o));
            if (b) {
                d4 = at1.a.Y(d4);
            }
            final c2.s h = ag0.a.h(r2, 733328855, a8, false, r2, -1323940314);
            final b b6 = (b)r2.t((o0)e);
            final LayoutDirection layoutDirection2 = (LayoutDirection)r2.t((o0)k2);
            final k1 k4 = (k1)r2.t((o0)o3);
            final ComposableLambdaImpl b7 = LayoutKt.b(d4);
            if (!(r2.a instanceof z0.c)) {
                yl.a.B0();
                throw null;
            }
            r2.h();
            if (r2.K) {
                r2.i(b4);
            }
            else {
                r2.e();
            }
            r2.x = false;
            b.p(0, b7, a2.b.s(r2, h, e2, r2, b6, d3, r2, layoutDirection2, f3, r2, k4, g, r2), r2, 2058660585, -2137368960);
            final d e3 = a9.e((d)f4, (j1.a)b2);
            final c2.s h2 = ag0.a.h(r2, 733328855, a8, false, r2, -1323940314);
            final b b8 = (b)r2.t((o0)e);
            final LayoutDirection layoutDirection3 = (LayoutDirection)r2.t((o0)k2);
            final k1 k5 = (k1)r2.t((o0)o3);
            final ComposableLambdaImpl b9 = LayoutKt.b(e3);
            if (!(r2.a instanceof z0.c)) {
                yl.a.B0();
                throw null;
            }
            r2.h();
            if (r2.K) {
                r2.i(b4);
            }
            else {
                r2.e();
            }
            r2.x = false;
            b9.invoke((Object)a2.b.s(r2, h2, e2, r2, b8, d3, r2, layoutDirection3, f3, r2, k5, g, r2), (Object)r2, (Object)0);
            r2.A(2058660585);
            r2.A(-2137368960);
            ((r)a4).invoke((Object)c, (Object)new u2.d(n), (Object)r2, (Object)((n33 & 0xE) | (n33 >> 9 & 0x70) | (n33 >> 15 & 0x380)));
            r2.R(false);
            d.x(r2, false, true, false, false);
            d.x(r2, false, false, true, false);
            d.x(r2, false, false, false, true);
            r2.R(false);
            r2.R(false);
            r = (r)a4;
            a3 = (j1.a)b2;
        }
        final r0 u = r2.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new SwipeRefreshKt$SwipeRefresh$3(c, (a)a, (d)f, i, n, a3, (z)o, r, b, (p)p13, n2, n3);
        }
    }
    
    public static final c b(final boolean b, final z0.d d) {
        Object i;
        if ((i = m.i(d, -1963273955, -492369756)) == d$a.a) {
            i = new c(b);
            d.v(i);
        }
        d.I();
        final c c = (c)i;
        ((SnapshotMutableStateImpl<Boolean>)c.c).setValue(Boolean.valueOf(b));
        d.I();
        return c;
    }
}
