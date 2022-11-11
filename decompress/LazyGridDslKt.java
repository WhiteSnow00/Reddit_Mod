// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import z0.r0;
import androidx.compose.foundation.layout.a$i;
import androidx.compose.runtime.ComposerImpl;
import java.util.List;
import zg2.p;
import z0.d$a;
import mk2.e;
import p0.a0;
import ah2.f;
import pg2.j;
import r0.q;
import zg2.l;
import androidx.compose.foundation.layout.a;
import p0.z;
import j1.d;
import r0.b;

public final class LazyGridDslKt
{
    public static final void a(final b b, d f, LazyGridState a, z z, boolean b2, a.k k, a.d a2, n0.d x, boolean b3, final l<? super q, j> l, final z0.d d, final int n, final int n2) {
        f.f((Object)b, "columns");
        f.f((Object)l, "content");
        final ComposerImpl r = d.r(1485410512);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (r.l((Object)b)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0148: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (r.l((Object)f)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0148;
                }
            }
            n8 = n6;
        }
        if ((n & 0x380) == 0x0) {
            int n9;
            if ((n2 & 0x4) == 0x0 && r.l((Object)a)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 |= n9;
        }
        final int n10 = n2 & 0x8;
        int n13 = 0;
        Label_0268: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0xC00);
            }
            else {
                n11 = n8;
                if ((n & 0x1C00) == 0x0) {
                    int n12;
                    if (r.l((Object)z)) {
                        n12 = 2048;
                    }
                    else {
                        n12 = 1024;
                    }
                    n13 = (n8 | n12);
                    break Label_0268;
                }
            }
            n13 = n11;
        }
        final int n14 = n2 & 0x10;
        int n15;
        if (n14 != 0) {
            n15 = (n13 | 0x6000);
        }
        else {
            n15 = n13;
            if ((n & 0xE000) == 0x0) {
                int n16;
                if (r.m(b2)) {
                    n16 = 16384;
                }
                else {
                    n16 = 8192;
                }
                n15 = (n13 | n16);
            }
        }
        if ((0x70000 & n) == 0x0) {
            int n17;
            if ((n2 & 0x20) == 0x0 && r.l((Object)k)) {
                n17 = 131072;
            }
            else {
                n17 = 65536;
            }
            n15 |= n17;
        }
        final int n18 = n2 & 0x40;
        int n19;
        if (n18 != 0) {
            n19 = (n15 | 0x180000);
        }
        else {
            n19 = n15;
            if ((n & 0x380000) == 0x0) {
                int n20;
                if (r.l((Object)a2)) {
                    n20 = 1048576;
                }
                else {
                    n20 = 524288;
                }
                n19 = (n15 | n20);
            }
        }
        int n22;
        if ((n & 0x1C00000) == 0x0) {
            int n21;
            if ((n2 & 0x80) == 0x0 && r.l((Object)x)) {
                n21 = 8388608;
            }
            else {
                n21 = 4194304;
            }
            n22 = (n19 | n21);
        }
        else {
            n22 = n19;
        }
        final int n23 = n2 & 0x100;
        int n24;
        if (n23 != 0) {
            n24 = (n22 | 0x6000000);
        }
        else {
            n24 = n22;
            if ((n & 0xE000000) == 0x0) {
                int n25;
                if (r.m(b3)) {
                    n25 = 67108864;
                }
                else {
                    n25 = 33554432;
                }
                n24 = (n22 | n25);
            }
        }
        int n27 = 0;
        Label_0616: {
            int n26;
            if ((n2 & 0x200) != 0x0) {
                n26 = 805306368;
            }
            else {
                n27 = n24;
                if ((n & 0x70000000) != 0x0) {
                    break Label_0616;
                }
                if (r.l((Object)l)) {
                    n26 = 536870912;
                }
                else {
                    n26 = 268435456;
                }
            }
            n27 = (n24 | n26);
        }
        a.d d2;
        a.k i;
        LazyGridState lazyGridState;
        z z3;
        n0.d d3;
        if ((0x5B6DB6DB & n27) == 0x12492492 && r.b()) {
            r.j();
            final z z2 = z;
            d2 = a2;
            i = k;
            lazyGridState = a;
            z3 = z2;
            d3 = x;
        }
        else {
            r.v0();
            z z4;
            a.k j;
            a.d d5;
            LazyGridState lazyGridState3;
            n0.d d6;
            if ((n & 0x1) != 0x0 && !r.Y()) {
                r.j();
                int n28 = n27;
                if ((n2 & 0x4) != 0x0) {
                    n28 = (n27 & 0xFFFFFC7F);
                }
                int n29 = n28;
                if ((n2 & 0x20) != 0x0) {
                    n29 = (n28 & 0xFFF8FFFF);
                }
                n27 = n29;
                if ((n2 & 0x80) != 0x0) {
                    n27 = (n29 & 0xFE3FFFFF);
                }
                final LazyGridState lazyGridState2 = a;
                final n0.d d4 = x;
                z4 = z;
                j = k;
                d5 = a2;
                lazyGridState3 = lazyGridState2;
                d6 = d4;
            }
            else {
                if (n5 != 0) {
                    f = (d)d.a.f;
                }
                if ((n2 & 0x4) != 0x0) {
                    a = a.a(0, 0, (z0.d)r, 3);
                    n27 &= 0xFFFFFC7F;
                }
                if (n10 != 0) {
                    final float n30 = 0;
                    z = (z)new a0(n30, n30, n30, n30);
                }
                if (n14 != 0) {
                    b2 = false;
                }
                if ((n2 & 0x20) != 0x0) {
                    final a$i a3 = a.a;
                    if (!b2) {
                        k = (a.k)a.c;
                    }
                    else {
                        k = (a.k)a.d;
                    }
                    n27 &= 0xFFF8FFFF;
                }
                if (n18 != 0) {
                    a2 = (a.d)a.a;
                }
                if ((n2 & 0x80) != 0x0) {
                    x = e.x((z0.d)r);
                    n27 &= 0xFE3FFFFF;
                }
                if (n23 != 0) {
                    b3 = true;
                }
                final a.k m = k;
                final z z5 = z;
                final a.d d7 = a2;
                d6 = x;
                j = m;
                lazyGridState3 = a;
                z4 = z5;
                d5 = d7;
            }
            r.S();
            final int n31 = n27 >> 3;
            r.A(-1355301804);
            r.A(1618982084);
            final boolean l2 = r.l((Object)b);
            final boolean l3 = r.l((Object)d5);
            final boolean l4 = r.l((Object)z4);
            final Object c0 = r.c0();
            Object o;
            if ((l2 | l3 | l4) || (o = c0) == d$a.a) {
                o = new LazyGridDslKt$rememberColumnWidthSums$1$1(z4, b, d5);
                r.I0(o);
            }
            r.R(false);
            final p p13 = (p)o;
            r.R(false);
            final int n32 = n27 << 9;
            LazyGridKt.a(f, lazyGridState3, (p<? super u2.b, ? super u2.a, ? extends List<Integer>>)p13, z4, b2, true, d6, b3, j, d5, l, (z0.d)r, (n31 & 0x1C00000) | (0x30000 | (n31 & 0xE) | (n31 & 0x70) | (n27 & 0x1C00) | (0xE000 & n27) | (n31 & 0x380000)) | (n32 & 0xE000000) | (n32 & 0x70000000), n27 >> 27 & 0xE, 0);
            d2 = d5;
            z3 = z4;
            d3 = d6;
            i = j;
            lazyGridState = lazyGridState3;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new LazyGridDslKt$LazyVerticalGrid.LazyGridDslKt$LazyVerticalGrid$1(b, f, lazyGridState, z3, b2, i, d2, d3, b3, (l)l, n, n2);
        }
    }
}
