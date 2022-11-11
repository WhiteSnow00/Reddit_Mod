// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.flowlayout;

import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.ComposerImpl;
import a40.f;
import androidx.compose.runtime.Updater;
import yl.a;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import pg2.j;
import zg2.p;
import j1.d;

public final class FlowKt
{
    public static final void a(final d d, final LayoutOrientation layoutOrientation, final SizeMode sizeMode, final MainAxisAlignment mainAxisAlignment, final float n, final FlowCrossAxisAlignment flowCrossAxisAlignment, final float n2, final MainAxisAlignment mainAxisAlignment2, final p<? super z0.d, ? super Integer, j> p11, final z0.d d2, final int n3) {
        final ComposerImpl r = d2.r(-1567419051);
        int n5;
        if ((n3 & 0xE) == 0x0) {
            int n4;
            if (r.l((Object)d)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n3);
        }
        else {
            n5 = n3;
        }
        int n6 = n5;
        if ((n3 & 0x70) == 0x0) {
            int n7;
            if (r.l((Object)layoutOrientation)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n3 & 0x380) == 0x0) {
            int n9;
            if (r.l((Object)sizeMode)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n3 & 0x1C00) == 0x0) {
            int n11;
            if (r.l((Object)mainAxisAlignment)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((0xE000 & n3) == 0x0) {
            int n13;
            if (r.n(n)) {
                n13 = 16384;
            }
            else {
                n13 = 8192;
            }
            n12 = (n10 | n13);
        }
        int n14 = n12;
        if ((0x70000 & n3) == 0x0) {
            int n15;
            if (r.l((Object)flowCrossAxisAlignment)) {
                n15 = 131072;
            }
            else {
                n15 = 65536;
            }
            n14 = (n12 | n15);
        }
        int n16 = n14;
        if ((0x380000 & n3) == 0x0) {
            int n17;
            if (r.n(n2)) {
                n17 = 1048576;
            }
            else {
                n17 = 524288;
            }
            n16 = (n14 | n17);
        }
        if ((0x1C00000 & n3) == 0x0) {
            int n18;
            if (r.l((Object)mainAxisAlignment2)) {
                n18 = 8388608;
            }
            else {
                n18 = 4194304;
            }
            n16 |= n18;
        }
        int n19 = n16;
        if ((0xE000000 & n3) == 0x0) {
            int n20;
            if (r.l((Object)p11)) {
                n20 = 67108864;
            }
            else {
                n20 = 33554432;
            }
            n19 = (n16 | n20);
        }
        if ((0xB6DB6DB & n19) == 0x2492492 && r.b()) {
            r.j();
        }
        else {
            final FlowKt$Flow$1 flowKt$Flow$1 = new FlowKt$Flow$1(layoutOrientation, n, sizeMode, n2, mainAxisAlignment, mainAxisAlignment2, flowCrossAxisAlignment);
            r.A(-1323940314);
            final b b = (b)r.t((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
            final k1 k1 = (k1)r.t((o0)CompositionLocalsKt.o);
            ComposeUiNode.w2.getClass();
            final zg2.a b2 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b3 = LayoutKt.b(d);
            final int n21 = (((n19 << 3 & 0x70) | (n19 >> 24 & 0xE)) << 9 & 0x1C00) | 0x6;
            if (!(r.a instanceof c)) {
                a.B0();
                throw null;
            }
            r.h();
            if (r.K) {
                r.i(b2);
            }
            else {
                r.e();
            }
            r.x = false;
            Updater.b((z0.d)r, (Object)flowKt$Flow$1, ComposeUiNode$Companion.e);
            Updater.b((z0.d)r, (Object)b, ComposeUiNode$Companion.d);
            Updater.b((z0.d)r, (Object)layoutDirection, ComposeUiNode$Companion.f);
            f.v(n21 >> 3 & 0x70, b3, a.m(r, k1, ComposeUiNode$Companion.g, r), r, 2058660585);
            androidx.viewpager.widget.c.o(n21 >> 9 & 0xE, p11, r, false, true, false);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new FlowKt$Flow$2(d, layoutOrientation, sizeMode, mainAxisAlignment, n, flowCrossAxisAlignment, n2, mainAxisAlignment2, (p)p11, n3);
        }
    }
    
    public static final void b(d f, SizeMode wrap, MainAxisAlignment start, float n, FlowCrossAxisAlignment start2, float n2, MainAxisAlignment mainAxisAlignment, final p<? super z0.d, ? super Integer, j> p11, final z0.d d, final int n3, final int n4) {
        ah2.f.f((Object)p11, "content");
        final ComposerImpl r = d.r(-137566119);
        final int n5 = n4 & 0x1;
        int n6;
        if (n5 != 0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (r.l((Object)f)) {
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
        final int n8 = n4 & 0x2;
        int n11 = 0;
        Label_0146: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x30);
            }
            else {
                n9 = n6;
                if ((n3 & 0x70) == 0x0) {
                    int n10;
                    if (r.l((Object)wrap)) {
                        n10 = 32;
                    }
                    else {
                        n10 = 16;
                    }
                    n11 = (n6 | n10);
                    break Label_0146;
                }
            }
            n11 = n9;
        }
        final int n12 = n4 & 0x4;
        int n15 = 0;
        Label_0217: {
            int n13;
            if (n12 != 0) {
                n13 = (n11 | 0x180);
            }
            else {
                n13 = n11;
                if ((n3 & 0x380) == 0x0) {
                    int n14;
                    if (r.l((Object)start)) {
                        n14 = 256;
                    }
                    else {
                        n14 = 128;
                    }
                    n15 = (n11 | n14);
                    break Label_0217;
                }
            }
            n15 = n13;
        }
        final int n16 = n4 & 0x8;
        int n19 = 0;
        Label_0289: {
            int n17;
            if (n16 != 0) {
                n17 = (n15 | 0xC00);
            }
            else {
                n17 = n15;
                if ((n3 & 0x1C00) == 0x0) {
                    int n18;
                    if (r.n(n)) {
                        n18 = 2048;
                    }
                    else {
                        n18 = 1024;
                    }
                    n19 = (n15 | n18);
                    break Label_0289;
                }
            }
            n19 = n17;
        }
        final int n20 = n4 & 0x10;
        int n21;
        if (n20 != 0) {
            n21 = (n19 | 0x6000);
        }
        else {
            n21 = n19;
            if ((n3 & 0xE000) == 0x0) {
                int n22;
                if (r.l((Object)start2)) {
                    n22 = 16384;
                }
                else {
                    n22 = 8192;
                }
                n21 = (n19 | n22);
            }
        }
        final int n23 = n4 & 0x20;
        int n24;
        if (n23 != 0) {
            n24 = (n21 | 0x30000);
        }
        else {
            n24 = n21;
            if ((n3 & 0x70000) == 0x0) {
                int n25;
                if (r.n(n2)) {
                    n25 = 131072;
                }
                else {
                    n25 = 65536;
                }
                n24 = (n21 | n25);
            }
        }
        int n27;
        if ((n3 & 0x380000) == 0x0) {
            int n26;
            if ((n4 & 0x40) == 0x0 && r.l((Object)mainAxisAlignment)) {
                n26 = 1048576;
            }
            else {
                n26 = 524288;
            }
            n27 = (n24 | n26);
        }
        else {
            n27 = n24;
        }
        int n29 = 0;
        Label_0526: {
            int n28;
            if ((n4 & 0x80) != 0x0) {
                n28 = 12582912;
            }
            else {
                n29 = n27;
                if ((n3 & 0x1C00000) != 0x0) {
                    break Label_0526;
                }
                if (r.l((Object)p11)) {
                    n28 = 8388608;
                }
                else {
                    n28 = 4194304;
                }
            }
            n29 = (n27 | n28);
        }
        d d2;
        SizeMode sizeMode;
        MainAxisAlignment mainAxisAlignment3;
        FlowCrossAxisAlignment flowCrossAxisAlignment2;
        MainAxisAlignment mainAxisAlignment4;
        if ((0x16DB6DB & n29) == 0x492492 && r.b()) {
            r.j();
            final MainAxisAlignment mainAxisAlignment2 = start;
            final float n30 = n2;
            final FlowCrossAxisAlignment flowCrossAxisAlignment = start2;
            d2 = f;
            sizeMode = wrap;
            mainAxisAlignment3 = mainAxisAlignment2;
            n2 = n;
            flowCrossAxisAlignment2 = flowCrossAxisAlignment;
            n = n30;
            mainAxisAlignment4 = mainAxisAlignment;
        }
        else {
            r.v0();
            int n31;
            MainAxisAlignment mainAxisAlignment5;
            FlowCrossAxisAlignment flowCrossAxisAlignment3;
            SizeMode sizeMode3;
            if ((n3 & 0x1) != 0x0 && !r.Y()) {
                r.j();
                n31 = n29;
                if ((n4 & 0x40) != 0x0) {
                    n31 = (n29 & 0xFFC7FFFF);
                }
                final SizeMode sizeMode2 = wrap;
                mainAxisAlignment5 = mainAxisAlignment;
                final MainAxisAlignment mainAxisAlignment6 = start;
                final float n32 = n;
                n = n2;
                flowCrossAxisAlignment3 = start2;
                sizeMode3 = sizeMode2;
                mainAxisAlignment3 = mainAxisAlignment6;
                n2 = n32;
            }
            else {
                if (n5 != 0) {
                    f = (d)j1.d.a.f;
                }
                if (n8 != 0) {
                    wrap = SizeMode.Wrap;
                }
                if (n12 != 0) {
                    start = MainAxisAlignment.Start;
                }
                if (n16 != 0) {
                    n = 0;
                }
                if (n20 != 0) {
                    start2 = FlowCrossAxisAlignment.Start;
                }
                if (n23 != 0) {
                    n2 = 0;
                }
                if ((n4 & 0x40) != 0x0) {
                    n29 &= 0xFFC7FFFF;
                    mainAxisAlignment = start;
                }
                final SizeMode sizeMode4 = wrap;
                mainAxisAlignment5 = mainAxisAlignment;
                final float n33 = n;
                mainAxisAlignment = start;
                flowCrossAxisAlignment3 = start2;
                n = n2;
                n2 = n33;
                mainAxisAlignment3 = mainAxisAlignment;
                sizeMode3 = sizeMode4;
                n31 = n29;
            }
            r.S();
            final LayoutOrientation horizontal = LayoutOrientation.Horizontal;
            final int n34 = n31 << 3;
            a(f, horizontal, sizeMode3, mainAxisAlignment3, n2, flowCrossAxisAlignment3, n, mainAxisAlignment5, p11, (z0.d)r, (n31 & 0xE) | 0x30 | (n34 & 0x380) | (n34 & 0x1C00) | (0xE000 & n34) | (n34 & 0x70000) | (n34 & 0x380000) | (n34 & 0x1C00000) | (n34 & 0xE000000));
            final d d3 = f;
            mainAxisAlignment4 = mainAxisAlignment5;
            flowCrossAxisAlignment2 = flowCrossAxisAlignment3;
            sizeMode = sizeMode3;
            d2 = d3;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new FlowKt$FlowRow$1(d2, sizeMode, mainAxisAlignment3, n2, flowCrossAxisAlignment2, n, mainAxisAlignment4, (p)p11, n3, n4);
        }
    }
}
