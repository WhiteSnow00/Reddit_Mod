// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.jvm.internal.Lambda;
import wu.a;
import aw.b;
import z0.p0;
import z0.o0;
import pd.r;
import o1.f0;
import sg2.e;
import hg2.j;
import rg2.p;
import o1.l0;
import j1.d;

public final class SurfaceKt
{
    public static final void a(d f, final l0 l0, long n, long n2, m0.d d, float n3, final p<? super z0.d, ? super Integer, j> p10, final z0.d d2, final int n4, final int n5) {
        e.f((Object)p10, "content");
        final ComposerImpl s = d2.s(1412203386);
        final int n6 = n5 & 0x1;
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n8;
            if (s.m((Object)f)) {
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
        final int n9 = n5 & 0x2;
        int n12 = 0;
        Label_0146: {
            int n10;
            if (n9 != 0) {
                n10 = (n7 | 0x30);
            }
            else {
                n10 = n7;
                if ((n4 & 0x70) == 0x0) {
                    int n11;
                    if (s.m((Object)l0)) {
                        n11 = 32;
                    }
                    else {
                        n11 = 16;
                    }
                    n12 = (n7 | n11);
                    break Label_0146;
                }
            }
            n12 = n10;
        }
        if ((n4 & 0x380) == 0x0) {
            int n13;
            if ((n5 & 0x4) == 0x0 && s.K(n)) {
                n13 = 256;
            }
            else {
                n13 = 128;
            }
            n12 |= n13;
        }
        if ((n4 & 0x1C00) == 0x0) {
            int n14;
            if ((n5 & 0x8) == 0x0 && s.K(n2)) {
                n14 = 2048;
            }
            else {
                n14 = 1024;
            }
            n12 |= n14;
        }
        final int n15 = n5 & 0x10;
        int n18 = 0;
        Label_0316: {
            int n16;
            if (n15 != 0) {
                n16 = (n12 | 0x6000);
            }
            else {
                n16 = n12;
                if ((0xE000 & n4) == 0x0) {
                    int n17;
                    if (s.m((Object)d)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n12 | n17);
                    break Label_0316;
                }
            }
            n18 = n16;
        }
        final int n19 = n5 & 0x20;
        int n20;
        if (n19 != 0) {
            n20 = (n18 | 0x30000);
        }
        else {
            n20 = n18;
            if ((0x70000 & n4) == 0x0) {
                int n21;
                if (s.o(n3)) {
                    n21 = 131072;
                }
                else {
                    n21 = 65536;
                }
                n20 = (n18 | n21);
            }
        }
        int n23 = 0;
        Label_0436: {
            int n22;
            if ((n5 & 0x40) != 0x0) {
                n22 = 1572864;
            }
            else {
                n23 = n20;
                if ((n4 & 0x380000) != 0x0) {
                    break Label_0436;
                }
                if (s.m((Object)p10)) {
                    n22 = 1048576;
                }
                else {
                    n22 = 524288;
                }
            }
            n23 = (n20 | n22);
        }
        l0 l2;
        if ((n23 & 0x2DB6DB) == 0x92492 && s.c()) {
            s.k();
            final long n24 = n2;
            l2 = l0;
            n2 = n;
            n = n24;
        }
        else {
            s.v0();
            int n25 = 0;
            d d3 = null;
            l0 l3 = null;
            Label_0739: {
                l0 l4;
                if ((n4 & 0x1) != 0x0 && !s.Y()) {
                    s.k();
                    n25 = n23;
                    if ((n5 & 0x4) != 0x0) {
                        n25 = (n23 & 0xFFFFFC7F);
                    }
                    if ((n5 & 0x8) != 0x0) {
                        final long n26 = n2;
                        n2 = n;
                        n25 &= 0xFFFFE3FF;
                        n = n26;
                        d3 = f;
                        l3 = l0;
                        break Label_0739;
                    }
                    l4 = l0;
                    d3 = f;
                }
                else {
                    if (n6 != 0) {
                        f = (d)j1.d.a.f;
                    }
                    l0 a;
                    if (n9 != 0) {
                        a = f0.a;
                    }
                    else {
                        a = l0;
                    }
                    int n27 = n23;
                    long h = n;
                    if ((n5 & 0x4) != 0x0) {
                        h = r.u((z0.d)s).h();
                        n27 = (n23 & 0xFFFFFC7F);
                    }
                    int n28 = n27;
                    long b = n2;
                    if ((n5 & 0x8) != 0x0) {
                        b = ColorsKt.b(h, (z0.d)s);
                        n28 = (n27 & 0xFFFFE3FF);
                    }
                    m0.d d4 = d;
                    if (n15 != 0) {
                        d4 = null;
                    }
                    d3 = f;
                    l4 = a;
                    n25 = n28;
                    n = h;
                    n2 = b;
                    d = d4;
                    if (n19 != 0) {
                        n3 = 0;
                        d = d4;
                        n2 = b;
                        n = h;
                        n25 = n28;
                        l4 = a;
                        d3 = f;
                    }
                }
                l3 = l4;
                final long n29 = n2;
                n2 = n;
                n = n29;
            }
            s.S();
            final z0.r b2 = ElevationOverlayKt.b;
            final float n30 = ((u2.d)s.u((o0)b2)).f + n3;
            CompositionLocalKt.a((p0<?>[])new p0[] { b.n(n, ContentColorKt.a), a.d(n30, b2) }, (p<? super z0.d, ? super Integer, j>)aa1.a.R((z0.d)s, -1822160838, (Lambda)new SurfaceKt$Surface.SurfaceKt$Surface$1(d3, l3, n2, n30, n25, d, n3, (p)p10)), (z0.d)s, 56);
            l2 = l3;
            f = d3;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new SurfaceKt$Surface.SurfaceKt$Surface$2(f, l2, n2, n, d, n3, (p)p10, n4, n5);
        }
    }
}
