// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import rg2.p;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import pd.r;
import z0.d;

public final class a
{
    public static final void a(float n, float n2, final int n3, final int n4, long b, final d d, j1.d d2) {
        final ComposerImpl s = d.s(-1249392198);
        final int n5 = n4 & 0x1;
        int n6;
        if (n5 != 0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (s.m((Object)d2)) {
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
        if ((n3 & 0x70) == 0x0) {
            int n8;
            if ((n4 & 0x2) == 0x0 && s.K(b)) {
                n8 = 32;
            }
            else {
                n8 = 16;
            }
            n6 |= n8;
        }
        final int n9 = n4 & 0x4;
        int n12 = 0;
        Label_0181: {
            int n10;
            if (n9 != 0) {
                n10 = (n6 | 0x180);
            }
            else {
                n10 = n6;
                if ((n3 & 0x380) == 0x0) {
                    int n11;
                    if (s.o(n)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n6 | n11);
                    break Label_0181;
                }
            }
            n12 = n10;
        }
        final int n13 = n4 & 0x8;
        int n14;
        if (n13 != 0) {
            n14 = (n12 | 0xC00);
        }
        else {
            n14 = n12;
            if ((n3 & 0x1C00) == 0x0) {
                int n15;
                if (s.o(n2)) {
                    n15 = 2048;
                }
                else {
                    n15 = 1024;
                }
                n14 = (n12 | n15);
            }
        }
        j1.d d3;
        if ((n14 & 0x16DB) == 0x492 && s.c()) {
            s.k();
            d3 = d2;
        }
        else {
            s.v0();
            boolean b2 = true;
            long n16;
            if ((n3 & 0x1) != 0x0 && !s.Y()) {
                s.k();
                d3 = d2;
                n16 = b;
            }
            else {
                if (n5 != 0) {
                    d2 = (j1.d)j1.d.a.f;
                }
                if ((n4 & 0x2) != 0x0) {
                    b = o1.r.b(r.u((d)s).d(), 0.12f);
                }
                float n17 = n;
                if (n9 != 0) {
                    n17 = 1;
                }
                d3 = d2;
                n16 = b;
                n = n17;
                if (n13 != 0) {
                    n2 = 0;
                    n = n17;
                    n16 = b;
                    d3 = d2;
                }
            }
            s.S();
            if (n2 != 0.0f) {
                b2 = false;
            }
            if (!b2) {
                d2 = aa1.a.R0((j1.d)j1.d.a.f, n2, 0.0f, 0.0f, 0.0f, 14);
            }
            else {
                d2 = (j1.d)j1.d.a.f;
            }
            s.A(1228914189);
            float n18;
            if (u2.d.a(n, 0.0f)) {
                n18 = 1.0f / ((b)s.u((o0)CompositionLocalsKt.e)).getDensity();
            }
            else {
                n18 = n;
            }
            s.R(false);
            BoxKt.a(vl.a.t(SizeKt.k(SizeKt.j(d3.j0(d2)), n18), n16), (d)s, 0);
            b = n16;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new DividerKt$Divider$1(d3, b, n, n2, n3, n4);
        }
    }
}
