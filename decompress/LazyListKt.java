// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.r0;
import mj2.b0;
import z0.d$a$a;
import androidx.compose.runtime.ComposerImpl;
import c2.t;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import n0.k;
import androidx.compose.foundation.gestures.ScrollableKt;
import q0.o;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import h2.q;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import h2.h;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.EmptyCoroutineContext;
import androidx.appcompat.widget.s0;
import q0.g;
import gh2.i;
import z0.e1;
import zg2.p;
import z0.s;
import tg2.c;
import z0.h0;
import i1.f$a;
import z0.d$a;
import mk2.e;
import ah2.f;
import pg2.j;
import zg2.l;
import j1.a$c;
import androidx.compose.foundation.layout.a;
import j1.a$b;
import p0.z;
import j1.d;

public final class LazyListKt
{
    public static final void a(final d d, final LazyListState lazyListState, final z z, final boolean b, final boolean b2, final n0.d d2, final boolean b3, a$b a$b, a.k k, a$c a$c, a.d d3, final l<? super b, j> l, final z0.d d4, final int n, final int n2, final int n3) {
        f.f((Object)d, "modifier");
        f.f((Object)lazyListState, "state");
        f.f((Object)z, "contentPadding");
        f.f((Object)d2, "flingBehavior");
        f.f((Object)l, "content");
        final ComposerImpl r = d4.r(955299798);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (r.l((Object)d)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        int n6;
        if ((n3 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (r.l((Object)lazyListState)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        int n8;
        if ((n3 & 0x4) != 0x0) {
            n8 = (n6 | 0x180);
        }
        else {
            n8 = n6;
            if ((n & 0x380) == 0x0) {
                int n9;
                if (r.l((Object)z)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n6 | n9);
            }
        }
        int n10;
        if ((n3 & 0x8) != 0x0) {
            n10 = (n8 | 0xC00);
        }
        else {
            n10 = n8;
            if ((n & 0x1C00) == 0x0) {
                int n11;
                if (r.m(b)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n8 | n11);
            }
        }
        int n12;
        if ((n3 & 0x10) != 0x0) {
            n12 = (n10 | 0x6000);
        }
        else {
            n12 = n10;
            if ((0xE000 & n) == 0x0) {
                int n13;
                if (r.m(b2)) {
                    n13 = 16384;
                }
                else {
                    n13 = 8192;
                }
                n12 = (n10 | n13);
            }
        }
        int n15 = 0;
        Label_0393: {
            int n14;
            if ((n3 & 0x20) != 0x0) {
                n14 = 196608;
            }
            else {
                n15 = n12;
                if ((0x70000 & n) != 0x0) {
                    break Label_0393;
                }
                if (r.l((Object)d2)) {
                    n14 = 131072;
                }
                else {
                    n14 = 65536;
                }
            }
            n15 = (n12 | n14);
        }
        int n17 = 0;
        Label_0448: {
            int n16;
            if ((n3 & 0x40) != 0x0) {
                n16 = 1572864;
            }
            else {
                n17 = n15;
                if ((0x380000 & n) != 0x0) {
                    break Label_0448;
                }
                if (r.m(b3)) {
                    n16 = 1048576;
                }
                else {
                    n16 = 524288;
                }
            }
            n17 = (n15 | n16);
        }
        final int n18 = n3 & 0x80;
        int n21 = 0;
        Label_0518: {
            int n19;
            if (n18 != 0) {
                n19 = (n17 | 0xC00000);
            }
            else {
                n19 = n17;
                if ((0x1C00000 & n) == 0x0) {
                    int n20;
                    if (r.l((Object)a$b)) {
                        n20 = 8388608;
                    }
                    else {
                        n20 = 4194304;
                    }
                    n21 = (n17 | n20);
                    break Label_0518;
                }
            }
            n21 = n19;
        }
        final int n22 = n3 & 0x100;
        int n25 = 0;
        Label_0588: {
            int n23;
            if (n22 != 0) {
                n23 = (n21 | 0x6000000);
            }
            else {
                n23 = n21;
                if ((0xE000000 & n) == 0x0) {
                    int n24;
                    if (r.l((Object)k)) {
                        n24 = 67108864;
                    }
                    else {
                        n24 = 33554432;
                    }
                    n25 = (n21 | n24);
                    break Label_0588;
                }
            }
            n25 = n23;
        }
        final int n26 = n3 & 0x200;
        int n27;
        if (n26 != 0) {
            n27 = (n25 | 0x30000000);
        }
        else {
            n27 = n25;
            if ((n & 0x70000000) == 0x0) {
                int n28;
                if (r.l((Object)a$c)) {
                    n28 = 536870912;
                }
                else {
                    n28 = 268435456;
                }
                n27 = (n25 | n28);
            }
        }
        final int n29 = n3 & 0x400;
        int n30;
        if (n29 != 0) {
            n30 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n31;
            if (r.l((Object)d3)) {
                n31 = 4;
            }
            else {
                n31 = 2;
            }
            n30 = (n2 | n31);
        }
        else {
            n30 = n2;
        }
        int n32;
        if ((n3 & 0x800) != 0x0) {
            n32 = (n30 | 0x30);
        }
        else {
            n32 = n30;
            if ((n2 & 0x70) == 0x0) {
                int n33;
                if (r.l((Object)l)) {
                    n33 = 32;
                }
                else {
                    n33 = 16;
                }
                n32 = (n30 | n33);
            }
        }
        Label_2308: {
            if ((0x5B6DB6DB & n27) == 0x12492492 && (n32 & 0x5B) == 0x12 && r.b()) {
                r.j();
                break Label_2308;
            }
            if (n18 != 0) {
                a$b = null;
            }
            if (n22 != 0) {
                k = null;
            }
            if (n26 != 0) {
                a$c = null;
            }
            if (n29 != 0) {
                d3 = null;
            }
            final m0.q i = e.I((z0.d)r);
            r.A(-619676707);
            final h0 v0 = a80.a.v0(l, (z0.d)r);
            r.A(1157296644);
            final boolean j = r.l((Object)lazyListState);
            Object value = r.c0();
            Label_0989: {
                Object o;
                if (!j && (o = value) != d$a.a) {
                    break Label_0989;
                }
                o = f$a.a();
                try {
                    value = ((i1.f)o).i();
                    try {
                        final int n34 = lazyListState.f() / 30 * 30;
                        final i c1 = yl.a.C1(Math.max(n34 - 100, 0), n34 + 30 + 100);
                        i1.f.o((i1.f)value);
                        ((i1.f)o).c();
                        o = a80.a.n0(c1);
                        r.I0(o);
                        r.R(false);
                        final h0 h0 = (h0)o;
                        s.f(h0, (p)new LazyListItemProviderImplKt$rememberItemProvider$1(lazyListState, h0, (c)null), (z0.d)r);
                        r.A(1157296644);
                        final boolean m = r.l((Object)h0);
                        value = r.c0();
                        if (m || (o = value) == d$a.a) {
                            o = new LazyListItemProviderImpl(a80.a.D((zg2.a)new LazyListItemProviderImplKt$rememberItemProvider$2$1(v0, h0)));
                            r.I0(o);
                        }
                        r.R(false);
                        final LazyListItemProviderImpl lazyListItemProviderImpl = (LazyListItemProviderImpl)o;
                        r.R(false);
                        r.A(-492369756);
                        value = r.c0();
                        final d$a$a a = d$a.a;
                        if ((o = value) == a) {
                            o = new g();
                            r.I0(o);
                        }
                        r.R(false);
                        final g g = (g)o;
                        value = s0.j(r, 773894976, -492369756);
                        if ((o = value) == a) {
                            o = d.s(s.i(EmptyCoroutineContext.INSTANCE, (z0.d)r), r);
                        }
                        r.R(false);
                        final b0 f = ((z0.l)o).f;
                        r.R(false);
                        r.A(511388516);
                        final boolean l2 = r.l((Object)lazyListState);
                        final boolean l3 = r.l((Object)b2);
                        value = r.c0();
                        if ((l3 | l2) || (o = value) == a) {
                            o = new LazyListItemPlacementAnimator(f, b2);
                            r.I0(o);
                        }
                        r.R(false);
                        value = o;
                        ((SnapshotMutableStateImpl<LazyListItemPlacementAnimator>)lazyListState.n).setValue((LazyListItemPlacementAnimator)value);
                        final int n35 = n27 & 0x70;
                        r.A(-1404987696);
                        final int n36 = 1;
                        r.A(-568225417);
                        int n37 = 0;
                        boolean b4 = false;
                        while (n37 < 11) {
                            b4 |= r.l((new Object[] { lazyListState, g, i, z, b, b2, a$b, a$c, d3, k, value })[n37]);
                            ++n37;
                        }
                        o = r.c0();
                        if (b4 || o == d$a.a) {
                            o = new LazyListKt$rememberLazyListMeasurePolicy$1$1(b2, z, b, lazyListState, (q0.l)lazyListItemProviderImpl, k, d3, (LazyListItemPlacementAnimator)value, g, a$b, a$c, i);
                            r.I0(o);
                        }
                        r.R(false);
                        final p p16 = (p)o;
                        r.R(false);
                        b((q0.l)lazyListItemProviderImpl, lazyListState, (z0.d)r, n35);
                        if (b2) {
                            o = Orientation.Vertical;
                        }
                        else {
                            o = Orientation.Horizontal;
                        }
                        final d f2 = d.f0((d)lazyListState.l).f0((d)lazyListState.m);
                        ah2.f.f((Object)f2, "<this>");
                        ah2.f.f((Object)lazyListItemProviderImpl, "itemProvider");
                        ah2.f.f((Object)f, "coroutineScope");
                        r.A(-1728067365);
                        r.A(-568225417);
                        boolean b5;
                        for (int n38 = (b5 = false) ? 1 : 0; n38 < 5; ++n38) {
                            b5 |= r.l((new Object[] { lazyListItemProviderImpl, lazyListState, b2, b, b3 })[n38]);
                        }
                        value = r.c0();
                        if (b5 || value == d$a.a) {
                            final LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1 lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1 = new LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1((q0.l)lazyListItemProviderImpl);
                            final h h2 = new h(b, (zg2.a)new LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1(lazyListState), (zg2.a)new LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2(lazyListState, (q0.l)lazyListItemProviderImpl));
                            if (b3) {
                                value = new LazySemanticsKt$lazyListSemantics$1$scrollByAction$1(b2, f, lazyListState);
                            }
                            else {
                                value = null;
                            }
                            Object o2;
                            if (b3) {
                                o2 = new LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1(lazyListState, f);
                            }
                            else {
                                o2 = null;
                            }
                            int n39;
                            if (b2) {
                                n39 = -1;
                            }
                            else {
                                n39 = 1;
                            }
                            int n40;
                            if (b2) {
                                n40 = 1;
                            }
                            else {
                                n40 = -1;
                            }
                            value = SemanticsModifierKt.b((d)j1.d.a.f, false, (l<? super q, j>)new LazySemanticsKt$lazyListSemantics$1$1((l<Object, Integer>)lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1, b2, h2, (p<? super Float, ? super Float, Boolean>)value, (l<? super Integer, Boolean>)o2, new h2.b(n39, n40)));
                            r.I0(value);
                        }
                        r.R(false);
                        value = f2.f0((d)value);
                        r.R(false);
                        final d a2 = m0.f.a((d)value, (Orientation)o);
                        ah2.f.f((Object)a2, "<this>");
                        ah2.f.f((Object)g, "beyondBoundsInfo");
                        r.A(1245943849);
                        final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
                        r.A(-568225417);
                        int n41 = 0;
                        boolean b6 = false;
                        while (n41 < 4) {
                            b6 |= r.l((new Object[] { lazyListState, g, b, layoutDirection })[n41]);
                            ++n41;
                        }
                        final Object c2 = r.c0();
                        if (b6 || (value = c2) == d$a.a) {
                            value = new q0.h(lazyListState, g, b, layoutDirection);
                            r.I0(value);
                        }
                        r.R(false);
                        final d f3 = a2.f0((d)value);
                        r.R(false);
                        ah2.f.f((Object)f3, "<this>");
                        r.A(854917725);
                        r.A(511388516);
                        final boolean l4 = r.l((Object)lazyListState);
                        final boolean l5 = r.l((Object)g);
                        final Object c3 = r.c0();
                        if ((l4 | l5) || (value = c3) == d$a.a) {
                            value = new o(lazyListState, g);
                            r.I0(value);
                        }
                        r.R(false);
                        value = f3.f0((d)value);
                        r.R(false);
                        value = gn.a.K1((d)value, i);
                        r.A(-908836175);
                        final boolean b7 = b ^ true;
                        int n42;
                        if (r.t((o0)CompositionLocalsKt.k) == LayoutDirection.Rtl) {
                            n42 = n36;
                        }
                        else {
                            n42 = 0;
                        }
                        boolean b8 = b7;
                        if (n42 != 0) {
                            b8 = b7;
                            if (!b2) {
                                b8 = (b7 ^ true);
                            }
                        }
                        r.R(false);
                        LazyLayoutKt.a((s0.d)lazyListItemProviderImpl, ScrollableKt.b((d)value, (k)lazyListState, (Orientation)o, i, b3, b8, d2, lazyListState.c), lazyListState.r, (p<? super s0.f, ? super u2.a, ? extends t>)p16, (z0.d)r, 0, 0);
                        final r0 u = r.U();
                        if (u != null) {
                            u.d = (p<? super z0.d, ? super Integer, j>)new LazyListKt$LazyList.LazyListKt$LazyList$2(d, lazyListState, z, b, b2, d2, b3, a$b, k, a$c, d3, (l)l, n, n2, n3);
                        }
                    }
                    finally {
                        i1.f.o((i1.f)value);
                    }
                }
                finally {
                    ((i1.f)o).c();
                }
            }
        }
    }
    
    public static final void b(final q0.l l, final LazyListState lazyListState, final z0.d d, final int n) {
        final ComposerImpl r = d.r(3173830);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (r.l((Object)l)) {
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
            if (r.l((Object)lazyListState)) {
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
        else if (l.K0() > 0) {
            lazyListState.k(l);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new LazyListKt$ScrollPositionUpdater.LazyListKt$ScrollPositionUpdater$1(l, lazyListState, n);
        }
    }
}
