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
import r0.i;
import ej2.b0;
import kotlin.coroutines.EmptyCoroutineContext;
import z0.e1;
import z0.s;
import lg2.c;
import z0.h0;
import lg.e0;
import i1.f;
import z0.d$a;
import p0.a0;
import sg2.e;
import hg2.j;
import r0.q;
import rg2.l;
import androidx.compose.foundation.layout.a$d;
import androidx.compose.foundation.layout.a$k;
import p0.z;
import java.util.List;
import u2.a;
import u2.b;
import rg2.p;
import j1.d;

public final class LazyGridKt
{
    public static final void a(d f, final LazyGridState lazyGridState, final p<? super b, ? super a, ? extends List<Integer>> p15, z z, boolean b, final boolean b2, n0.d d, final boolean b3, final a$k a$k, final a$d a$d, final l<? super q, j> l, z0.d d2, final int n, final int n2, final int n3) {
        e.f((Object)lazyGridState, "state");
        e.f((Object)p15, "slotSizesSums");
        e.f((Object)a$k, "verticalArrangement");
        e.f((Object)a$d, "horizontalArrangement");
        e.f((Object)l, "content");
        final ComposerImpl s = d2.s(152645664);
        final int n4 = n3 & 0x1;
        int n5;
        if (n4 != 0) {
            n5 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n6;
            if (s.m((Object)f)) {
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
                if (s.m((Object)lazyGridState)) {
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
                if (s.m((Object)p15)) {
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
                if (s.m((Object)z)) {
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
                if (s.n(b)) {
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
                if (s.n(b2)) {
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
            if ((n3 & 0x40) == 0x0 && s.m((Object)d)) {
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
                if (s.n(b3)) {
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
                if (s.m((Object)a$k)) {
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
                if (s.m((Object)a$d)) {
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
            if (s.m((Object)l)) {
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
            if ((n25 & 0x5B6DB6DB) == 0x12492492 && (n26 & 0xB) == 0x2 && s.c()) {
                s.k();
                d2 = (z0.d)f;
                final n0.d d3 = d;
                final Object o = d2;
                break Label_1984;
            }
            s.v0();
            final boolean b4 = false;
            n0.d d3;
            Object o;
            if ((n & 0x1) != 0x0 && !s.Y()) {
                s.k();
                int n28 = n25;
                if ((n3 & 0x40) != 0x0) {
                    n28 = (n25 & 0xFFC7FFFF);
                }
                final d d4 = f;
                d3 = d;
                n25 = n28;
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
                    d = (n0.d)ml0.a.D((z0.d)s);
                    n25 &= 0xFFC7FFFF;
                }
                final d d5 = f;
                d3 = d;
                o = d5;
            }
            s.S();
            final m0.p n30 = ml0.a.n0((z0.d)s);
            s.A(1895482293);
            final h0 x0 = bg.d.x0((Object)l, (z0.d)s);
            s.A(1157296644);
            final boolean m = s.m((Object)lazyGridState);
            Object o2 = s.c0();
            Label_1025: {
                if (!m && (d2 = (z0.d)o2) != d$a.a) {
                    break Label_1025;
                }
                d2 = (z0.d)i1.f.a.a();
                try {
                    o2 = ((f)d2).i();
                    try {
                        final int n31 = lazyGridState.e() / 90 * 90;
                        final yg2.i v0 = e0.v0(Math.max(n31 - 200, 0), n31 + 90 + 200);
                        f.o((f)o2);
                        ((f)d2).c();
                        d2 = (z0.d)bg.d.t0((Object)v0);
                        s.I0((Object)d2);
                        s.R(false);
                        final h0 h0 = (h0)d2;
                        z0.s.f((Object)h0, (p)new LazyGridItemProviderImplKt$rememberItemProvider$1(lazyGridState, h0, (c)null), (z0.d)s);
                        s.A(1157296644);
                        final boolean i = s.m((Object)h0);
                        o2 = s.c0();
                        if (i || (d2 = (z0.d)o2) == d$a.a) {
                            d2 = (z0.d)new LazyGridItemProviderImpl(bg.d.V((rg2.a)new LazyGridItemProviderImplKt$rememberItemProvider$2$1((e1)x0, h0)));
                            s.I0((Object)d2);
                        }
                        s.R(false);
                        final LazyGridItemProviderImpl lazyGridItemProviderImpl = (LazyGridItemProviderImpl)d2;
                        s.R(false);
                        s.A(773894976);
                        s.A(-492369756);
                        o2 = s.c0();
                        final d$a$a a = d$a.a;
                        if ((d2 = (z0.d)o2) == a) {
                            d2 = (z0.d)android.support.v4.media.a.o(z0.s.i(EmptyCoroutineContext.INSTANCE, (z0.d)s), s);
                        }
                        s.R(false);
                        o2 = ((z0.l)d2).f;
                        s.R(false);
                        s.A(511388516);
                        final boolean j = s.m((Object)lazyGridState);
                        final boolean k = s.m((Object)b2);
                        final Object c0 = s.c0();
                        if ((k | j) || (d2 = (z0.d)c0) == a) {
                            d2 = (z0.d)new LazyGridItemPlacementAnimator((b0)o2, b2);
                            s.I0((Object)d2);
                        }
                        s.R(false);
                        final LazyGridItemPlacementAnimator value = (LazyGridItemPlacementAnimator)d2;
                        ((SnapshotMutableStateImpl)lazyGridState.q).setValue((Object)value);
                        final int n32 = n25 & 0x70;
                        s.A(1958911962);
                        int n33 = 0;
                        final int n34 = 1;
                        s.A(-568225417);
                        boolean b5 = false;
                        while (n33 < 9) {
                            b5 |= s.m((new Object[] { lazyGridState, n30, p15, z, b, b2, a$d, a$k, value })[n33]);
                            ++n33;
                        }
                        d2 = (z0.d)s.c0();
                        if (b5 || d2 == d$a.a) {
                            d2 = (z0.d)new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(b2, z, b, lazyGridState, (i)lazyGridItemProviderImpl, (p)p15, a$k, a$d, value, n30);
                            s.I0((Object)d2);
                        }
                        final m0.p p16 = n30;
                        final z0.d d6 = (z0.d)s;
                        ((ComposerImpl)d6).R(false);
                        final p p17 = (p)d2;
                        ((ComposerImpl)d6).R(false);
                        ((SnapshotMutableStateImpl)lazyGridState.g).setValue((Object)b2);
                        b((i)lazyGridItemProviderImpl, lazyGridState, d6, n32);
                        if (b2) {
                            d2 = (z0.d)Orientation.Vertical;
                        }
                        else {
                            d2 = (z0.d)Orientation.Horizontal;
                        }
                        final d j2 = ((d)o).j0((d)lazyGridState.n).j0((d)lazyGridState.o);
                        e.f((Object)j2, "<this>");
                        e.f((Object)lazyGridItemProviderImpl, "itemProvider");
                        e.f(o2, "coroutineScope");
                        ((ComposerImpl)d6).A(1364424801);
                        ((ComposerImpl)d6).A(-568225417);
                        boolean b6;
                        for (int n35 = (b6 = false) ? 1 : 0; n35 < 5; ++n35) {
                            b6 |= ((ComposerImpl)d6).m((new Object[] { lazyGridItemProviderImpl, lazyGridState, b2, b, b3 })[n35]);
                        }
                        Object o3 = ((ComposerImpl)d6).c0();
                        if (b6 || o3 == d$a.a) {
                            final LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1 lazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1 = new LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1((i)lazyGridItemProviderImpl);
                            final h h2 = new h(b, (rg2.a)new LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$1(lazyGridState), (rg2.a)new LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$2(lazyGridState, (i)lazyGridItemProviderImpl));
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
                            o3 = SemanticsModifierKt.b((d)j1.d.a.f, false, (l<? super h2.q, j>)new LazySemanticsKt$lazyGridSemantics$1$1((l)lazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1, b2, h2, (p)o4, (l)o2, new h2.b(-1, -1)));
                            ((ComposerImpl)d6).I0(o3);
                        }
                        ((ComposerImpl)d6).R(false);
                        final d j3 = j2.j0((d)o3);
                        ((ComposerImpl)d6).R(false);
                        final d g1 = yg.a.g1(m0.e.a(j3, (Orientation)d2), p16);
                        ((ComposerImpl)d6).A(-1163690407);
                        final boolean b7 = b ^ true;
                        int n36;
                        if (((ComposerImpl)d6).u((o0)CompositionLocalsKt.k) == LayoutDirection.Rtl) {
                            n36 = n34;
                        }
                        else {
                            n36 = 0;
                        }
                        boolean b8 = b7;
                        if (n36 != 0) {
                            b8 = b7;
                            if (!b2) {
                                b8 = (b7 ^ true);
                            }
                        }
                        ((ComposerImpl)d6).R(false);
                        LazyLayoutKt.a((s0.d)lazyGridItemProviderImpl, ScrollableKt.b(g1, (k)lazyGridState, (Orientation)d2, p16, b3, b8, d3, (o0.j)lazyGridState.c), lazyGridState.t, p17, d6, 0, 0);
                        d2 = (z0.d)s.U();
                        if (d2 != null) {
                            ((r0)d2).d = (p)new LazyGridKt$LazyGrid$2((d)o, lazyGridState, (p)p15, z, b, b2, d3, b3, a$k, a$d, (l)l, n, n2, n3);
                        }
                    }
                    finally {
                        f.o((f)o2);
                    }
                }
                finally {
                    ((f)d2).c();
                }
            }
        }
    }
    
    public static final void b(final i i, final LazyGridState lazyGridState, final z0.d d, final int n) {
        final ComposerImpl s = d.s(950944068);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (s.m((Object)i)) {
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
            if (s.m((Object)lazyGridState)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && s.c()) {
            s.k();
        }
        else if (((s0.d)i).C0() > 0) {
            lazyGridState.f(i);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new LazyGridKt$ScrollPositionUpdater$1(i, lazyGridState, n);
        }
    }
}
