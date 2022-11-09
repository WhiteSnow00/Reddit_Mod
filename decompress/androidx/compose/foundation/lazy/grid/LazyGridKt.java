// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.r0;
import z0.d$a$a;
import androidx.compose.runtime.ComposerImpl;
import c2.t;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import n0.k;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import h2.h;
import androidx.compose.foundation.gestures.Orientation;
import mj2.b0;
import kotlin.coroutines.EmptyCoroutineContext;
import z0.e1;
import z0.s;
import tg2.c;
import gh2.i;
import z0.h0;
import i1.f$a;
import z0.d$a;
import mk2.e;
import p0.a0;
import ah2.f;
import pg2.j;
import r0.q;
import zg2.l;
import p0.z;
import java.util.List;
import u2.a;
import u2.b;
import zg2.p;
import j1.d;

public final class LazyGridKt
{
    public static final void a(d f, final LazyGridState lazyGridState, final p<? super b, ? super a, ? extends List<Integer>> p15, z z, boolean b, final boolean b2, n0.d x, final boolean b3, final androidx.compose.foundation.layout.a.k k, final androidx.compose.foundation.layout.a.d d, final l<? super q, j> l, z0.d d2, final int n, final int n2, final int n3) {
        f.f((Object)lazyGridState, "state");
        f.f((Object)p15, "slotSizesSums");
        f.f((Object)k, "verticalArrangement");
        f.f((Object)d, "horizontalArrangement");
        f.f((Object)l, "content");
        final ComposerImpl r = d2.r(152645664);
        final int n4 = n3 & 0x1;
        int n5;
        if (n4 != 0) {
            n5 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n6;
            if (r.l((Object)f)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n);
        }
        else {
            n5 = n;
        }
        int n7;
        if ((n3 & 0x2) != 0x0) {
            n7 = (n5 | 0x30);
        }
        else {
            n7 = n5;
            if ((n & 0x70) == 0x0) {
                int n8;
                if (r.l((Object)lazyGridState)) {
                    n8 = 32;
                }
                else {
                    n8 = 16;
                }
                n7 = (n5 | n8);
            }
        }
        int n9;
        if ((n3 & 0x4) != 0x0) {
            n9 = (n7 | 0x180);
        }
        else {
            n9 = n7;
            if ((n & 0x380) == 0x0) {
                int n10;
                if (r.l((Object)p15)) {
                    n10 = 256;
                }
                else {
                    n10 = 128;
                }
                n9 = (n7 | n10);
            }
        }
        final int n11 = n3 & 0x8;
        int n12;
        if (n11 != 0) {
            n12 = (n9 | 0xC00);
        }
        else {
            n12 = n9;
            if ((n & 0x1C00) == 0x0) {
                int n13;
                if (r.l((Object)z)) {
                    n13 = 2048;
                }
                else {
                    n13 = 1024;
                }
                n12 = (n9 | n13);
            }
        }
        final int n14 = n3 & 0x10;
        int n15;
        if (n14 != 0) {
            n15 = (n12 | 0x6000);
        }
        else {
            n15 = n12;
            if ((n & 0xE000) == 0x0) {
                int n16;
                if (r.m(b)) {
                    n16 = 16384;
                }
                else {
                    n16 = 8192;
                }
                n15 = (n12 | n16);
            }
        }
        int n18 = 0;
        Label_0409: {
            int n17;
            if ((n3 & 0x20) != 0x0) {
                n17 = 196608;
            }
            else {
                n18 = n15;
                if ((n & 0x70000) != 0x0) {
                    break Label_0409;
                }
                if (r.m(b2)) {
                    n17 = 131072;
                }
                else {
                    n17 = 65536;
                }
            }
            n18 = (n15 | n17);
        }
        if ((n & 0x380000) == 0x0) {
            int n19;
            if ((n3 & 0x40) == 0x0 && r.l((Object)x)) {
                n19 = 1048576;
            }
            else {
                n19 = 524288;
            }
            n18 |= n19;
        }
        int n21 = 0;
        Label_0512: {
            int n20;
            if ((n3 & 0x80) != 0x0) {
                n20 = 12582912;
            }
            else {
                n21 = n18;
                if ((0x1C00000 & n) != 0x0) {
                    break Label_0512;
                }
                if (r.m(b3)) {
                    n20 = 8388608;
                }
                else {
                    n20 = 4194304;
                }
            }
            n21 = (n18 | n20);
        }
        int n23 = 0;
        Label_0568: {
            int n22;
            if ((n3 & 0x100) != 0x0) {
                n22 = 100663296;
            }
            else {
                n23 = n21;
                if ((0xE000000 & n) != 0x0) {
                    break Label_0568;
                }
                if (r.l((Object)k)) {
                    n22 = 67108864;
                }
                else {
                    n22 = 33554432;
                }
            }
            n23 = (n21 | n22);
        }
        int n25 = 0;
        Label_0624: {
            int n24;
            if ((n3 & 0x200) != 0x0) {
                n24 = 805306368;
            }
            else {
                n25 = n23;
                if ((0x70000000 & n) != 0x0) {
                    break Label_0624;
                }
                if (r.l((Object)d)) {
                    n24 = 536870912;
                }
                else {
                    n24 = 268435456;
                }
            }
            n25 = (n23 | n24);
        }
        int n26;
        if ((n3 & 0x400) != 0x0) {
            n26 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n27;
            if (r.l((Object)l)) {
                n27 = 4;
            }
            else {
                n27 = 2;
            }
            n26 = (n2 | n27);
        }
        else {
            n26 = n2;
        }
        Label_1984: {
            if ((n25 & 0x5B6DB6DB) == 0x12492492 && (n26 & 0xB) == 0x2 && r.b()) {
                r.j();
                d2 = (z0.d)x;
                final d d3 = f;
                final Object o = d2;
                break Label_1984;
            }
            r.v0();
            final boolean b4 = false;
            d d3;
            Object o;
            if ((n & 0x1) != 0x0 && !r.Y()) {
                r.j();
                int n28 = n25;
                if ((n3 & 0x40) != 0x0) {
                    n28 = (n25 & 0xFFC7FFFF);
                }
                final n0.d d4 = x;
                n25 = n28;
                d3 = f;
                o = d4;
            }
            else {
                if (n4 != 0) {
                    f = (d)j1.d.a.f;
                }
                if (n11 != 0) {
                    final float n29 = 0;
                    z = (z)new a0(n29, n29, n29, n29);
                }
                if (n14 != 0) {
                    b = b4;
                }
                if ((n3 & 0x40) != 0x0) {
                    x = e.x((z0.d)r);
                    n25 &= 0xFFC7FFFF;
                }
                final n0.d d5 = x;
                d3 = f;
                o = d5;
            }
            r.S();
            final m0.q i = e.I((z0.d)r);
            r.A(1895482293);
            final h0 v0 = a80.a.v0(l, (z0.d)r);
            r.A(1157296644);
            final boolean j = r.l((Object)lazyGridState);
            Object o2 = r.c0();
            Label_1025: {
                if (!j && (d2 = (z0.d)o2) != d$a.a) {
                    break Label_1025;
                }
                d2 = (z0.d)f$a.a();
                try {
                    o2 = ((i1.f)d2).i();
                    try {
                        final int n30 = lazyGridState.e() / 90 * 90;
                        final i c1 = yl.a.C1(Math.max(n30 - 200, 0), n30 + 90 + 200);
                        i1.f.o((i1.f)o2);
                        ((i1.f)d2).c();
                        d2 = (z0.d)a80.a.n0(c1);
                        r.I0((Object)d2);
                        r.R(false);
                        final h0 h0 = (h0)d2;
                        s.f(h0, (p)new LazyGridItemProviderImplKt$rememberItemProvider$1(lazyGridState, h0, null), (z0.d)r);
                        r.A(1157296644);
                        final boolean m = r.l((Object)h0);
                        o2 = r.c0();
                        if (m || (d2 = (z0.d)o2) == d$a.a) {
                            d2 = (z0.d)new LazyGridItemProviderImpl(a80.a.D((zg2.a)new LazyGridItemProviderImplKt$rememberItemProvider$2$1(v0, h0)));
                            r.I0((Object)d2);
                        }
                        r.R(false);
                        final LazyGridItemProviderImpl lazyGridItemProviderImpl = (LazyGridItemProviderImpl)d2;
                        r.R(false);
                        r.A(773894976);
                        r.A(-492369756);
                        o2 = r.c0();
                        final d$a$a a = d$a.a;
                        if ((d2 = (z0.d)o2) == a) {
                            d2 = (z0.d)d.s(s.i(EmptyCoroutineContext.INSTANCE, (z0.d)r), r);
                        }
                        r.R(false);
                        o2 = ((z0.l)d2).f;
                        r.R(false);
                        r.A(511388516);
                        final boolean l2 = r.l((Object)lazyGridState);
                        final boolean l3 = r.l((Object)b2);
                        final Object c2 = r.c0();
                        if ((l3 | l2) || (d2 = (z0.d)c2) == a) {
                            d2 = (z0.d)new LazyGridItemPlacementAnimator((b0)o2, b2);
                            r.I0((Object)d2);
                        }
                        r.R(false);
                        final LazyGridItemPlacementAnimator value = (LazyGridItemPlacementAnimator)d2;
                        ((SnapshotMutableStateImpl<LazyGridItemPlacementAnimator>)lazyGridState.q).setValue(value);
                        final int n31 = n25 & 0x70;
                        r.A(1958911962);
                        int n32 = 0;
                        final int n33 = 1;
                        r.A(-568225417);
                        boolean b5 = false;
                        while (n32 < 9) {
                            b5 |= r.l((new Object[] { lazyGridState, i, p15, z, b, b2, d, k, value })[n32]);
                            ++n32;
                        }
                        d2 = (z0.d)r.c0();
                        if (b5 || d2 == d$a.a) {
                            d2 = (z0.d)new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(b2, z, b, lazyGridState, (r0.i)lazyGridItemProviderImpl, p15, k, d, value, i);
                            r.I0((Object)d2);
                        }
                        final m0.q q = i;
                        final z0.d d6 = (z0.d)r;
                        ((ComposerImpl)d6).R(false);
                        final p p16 = (p)d2;
                        ((ComposerImpl)d6).R(false);
                        ((SnapshotMutableStateImpl<Boolean>)lazyGridState.g).setValue(Boolean.valueOf(b2));
                        b((r0.i)lazyGridItemProviderImpl, lazyGridState, d6, n31);
                        if (b2) {
                            d2 = (z0.d)Orientation.Vertical;
                        }
                        else {
                            d2 = (z0.d)Orientation.Horizontal;
                        }
                        final d f2 = d3.f0((d)lazyGridState.n).f0((d)lazyGridState.o);
                        f.f((Object)f2, "<this>");
                        f.f((Object)lazyGridItemProviderImpl, "itemProvider");
                        f.f(o2, "coroutineScope");
                        ((ComposerImpl)d6).A(1364424801);
                        ((ComposerImpl)d6).A(-568225417);
                        boolean b6;
                        for (int n34 = (b6 = false) ? 1 : 0; n34 < 5; ++n34) {
                            b6 |= ((ComposerImpl)d6).l((new Object[] { lazyGridItemProviderImpl, lazyGridState, b2, b, b3 })[n34]);
                        }
                        Object o3 = ((ComposerImpl)d6).c0();
                        if (b6 || o3 == d$a.a) {
                            final LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1 lazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1 = new LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1((r0.i)lazyGridItemProviderImpl);
                            final h h2 = new h(b, (zg2.a)new LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$1(lazyGridState), (zg2.a)new LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$2(lazyGridState, (r0.i)lazyGridItemProviderImpl));
                            Object o4;
                            if (b3) {
                                o4 = new LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1(b2, (b0)o2, lazyGridState);
                            }
                            else {
                                o4 = null;
                            }
                            if (b3) {
                                o2 = new LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1(lazyGridState, (b0)o2);
                            }
                            else {
                                o2 = null;
                            }
                            o3 = SemanticsModifierKt.b((d)j1.d.a.f, false, (l<? super h2.q, j>)new LazySemanticsKt$lazyGridSemantics$1$1((l<Object, Integer>)lazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1, b2, h2, (p<? super Float, ? super Float, Boolean>)o4, (l<? super Integer, Boolean>)o2, new h2.b(-1, -1)));
                            ((ComposerImpl)d6).I0(o3);
                        }
                        ((ComposerImpl)d6).R(false);
                        final d f3 = f2.f0((d)o3);
                        ((ComposerImpl)d6).R(false);
                        final d k2 = gn.a.K1(m0.f.a(f3, (Orientation)d2), q);
                        ((ComposerImpl)d6).A(-1163690407);
                        final boolean b7 = b ^ true;
                        int n35;
                        if (((ComposerImpl)d6).t(CompositionLocalsKt.k) == LayoutDirection.Rtl) {
                            n35 = n33;
                        }
                        else {
                            n35 = 0;
                        }
                        boolean b8 = b7;
                        if (n35 != 0) {
                            b8 = b7;
                            if (!b2) {
                                b8 = (b7 ^ true);
                            }
                        }
                        ((ComposerImpl)d6).R(false);
                        LazyLayoutKt.a((s0.d)lazyGridItemProviderImpl, ScrollableKt.b(k2, (k)lazyGridState, (Orientation)d2, q, b3, b8, (n0.d)o, lazyGridState.c), lazyGridState.t, (p<? super s0.f, ? super a, ? extends t>)p16, d6, 0, 0);
                        d2 = (z0.d)r.U();
                        if (d2 != null) {
                            ((r0)d2).d = (p<? super z0.d, ? super Integer, j>)new LazyGridKt$LazyGrid.LazyGridKt$LazyGrid$2(d3, lazyGridState, (p)p15, z, b, b2, (n0.d)o, b3, k, d, (l)l, n, n2, n3);
                        }
                    }
                    finally {
                        i1.f.o((i1.f)o2);
                    }
                }
                finally {
                    ((i1.f)d2).c();
                }
            }
        }
    }
    
    public static final void b(final r0.i i, final LazyGridState lazyGridState, final z0.d d, final int n) {
        final ComposerImpl r = d.r(950944068);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (r.l((Object)i)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (r.l((Object)lazyGridState)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && r.b()) {
            r.j();
        }
        else if (i.K0() > 0) {
            lazyGridState.f(i);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new LazyGridKt$ScrollPositionUpdater.LazyGridKt$ScrollPositionUpdater$1(i, lazyGridState, n);
        }
    }
}
