// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import zg2.p;
import z0.r0;
import androidx.compose.foundation.layout.a$i;
import androidx.compose.runtime.ComposerImpl;
import j1.a$c;
import mk2.e;
import j1.a$a;
import p0.a0;
import ah2.f;
import pg2.j;
import zg2.l;
import j1.a$b;
import androidx.compose.foundation.layout.a;
import p0.z;
import j1.d;

public final class LazyDslKt
{
    public static final void a(d f, LazyListState a, z z, boolean b, a.k k, a$b m, n0.d x, boolean b2, final l<? super b, j> l, final z0.d d, final int n, final int n2) {
        f.f((Object)l, "content");
        final ComposerImpl r = d.r(-740714857);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (r.l((Object)f)) {
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
        if ((n & 0x70) == 0x0) {
            int n6;
            if ((n2 & 0x2) == 0x0 && r.l((Object)a)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n4 |= n6;
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0195: {
            int n8;
            if (n7 != 0) {
                n8 = (n4 | 0x180);
            }
            else {
                n8 = n4;
                if ((n & 0x380) == 0x0) {
                    int n9;
                    if (r.l((Object)z)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n4 | n9);
                    break Label_0195;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0267: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0x1C00) == 0x0) {
                    int n13;
                    if (r.m(b)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0267;
                }
            }
            n14 = n12;
        }
        if ((0xE000 & n) == 0x0) {
            int n15;
            if ((n2 & 0x10) == 0x0 && r.l((Object)k)) {
                n15 = 16384;
            }
            else {
                n15 = 8192;
            }
            n14 |= n15;
        }
        final int n16 = n2 & 0x20;
        int n17;
        if (n16 != 0) {
            n17 = (n14 | 0x30000);
        }
        else {
            n17 = n14;
            if ((n & 0x70000) == 0x0) {
                int n18;
                if (r.l((Object)m)) {
                    n18 = 131072;
                }
                else {
                    n18 = 65536;
                }
                n17 = (n14 | n18);
            }
        }
        if ((n & 0x380000) == 0x0) {
            int n19;
            if ((n2 & 0x40) == 0x0 && r.l((Object)x)) {
                n19 = 1048576;
            }
            else {
                n19 = 524288;
            }
            n17 |= n19;
        }
        final int n20 = n2 & 0x80;
        int n21;
        if (n20 != 0) {
            n21 = (n17 | 0xC00000);
        }
        else {
            n21 = n17;
            if ((n & 0x1C00000) == 0x0) {
                int n22;
                if (r.m(b2)) {
                    n22 = 8388608;
                }
                else {
                    n22 = 4194304;
                }
                n21 = (n17 | n22);
            }
        }
        int n24 = 0;
        Label_0547: {
            int n23;
            if ((n2 & 0x100) != 0x0) {
                n23 = 100663296;
            }
            else {
                n24 = n21;
                if ((n & 0xE000000) != 0x0) {
                    break Label_0547;
                }
                if (r.l((Object)l)) {
                    n23 = 67108864;
                }
                else {
                    n23 = 33554432;
                }
            }
            n24 = (n21 | n23);
        }
        n0.d d3;
        d d4;
        LazyListState lazyListState;
        z z2;
        boolean b4;
        a.k j;
        a$b a$b2;
        boolean b5;
        if ((0xB6DB6DB & n24) == 0x2492492 && r.b()) {
            r.j();
            final d d2 = f;
            final a.k i = k;
            d3 = x;
            final a$b a$b = m;
            final boolean b3 = b2;
            d4 = d2;
            lazyListState = a;
            z2 = z;
            b4 = b;
            j = i;
            a$b2 = a$b;
            b5 = b3;
        }
        else {
            r.v0();
            int n27;
            if ((n & 0x1) != 0x0 && !r.Y()) {
                r.j();
                int n25 = n24;
                if ((n2 & 0x2) != 0x0) {
                    n25 = (n24 & 0xFFFFFF8F);
                }
                int n26 = n25;
                if ((n2 & 0x10) != 0x0) {
                    n26 = (n25 & 0xFFFF1FFF);
                }
                n27 = n26;
                if ((n2 & 0x40) != 0x0) {
                    n27 = (n26 & 0xFFC7FFFF);
                }
                final d d5 = f;
                final boolean b6 = b2;
                final a.k k2 = k;
                d3 = x;
                final a$b a$b3 = m;
                d4 = d5;
                lazyListState = a;
                z2 = z;
                b4 = b;
                j = k2;
                a$b2 = a$b3;
                b5 = b6;
            }
            else {
                if (n3 != 0) {
                    f = (d)d.a.f;
                }
                if ((n2 & 0x2) != 0x0) {
                    a = d.a((z0.d)r);
                    n24 &= 0xFFFFFF8F;
                }
                if (n7 != 0) {
                    final float n28 = 0;
                    z = (z)new a0(n28, n28, n28, n28);
                }
                if (n11 != 0) {
                    b = false;
                }
                if ((n2 & 0x10) != 0x0) {
                    final a$i a2 = a.a;
                    if (!b) {
                        k = (a.k)a.c;
                    }
                    else {
                        k = (a.k)a.d;
                    }
                    n24 &= 0xFFFF1FFF;
                }
                if (n16 != 0) {
                    m = (a$b)a$a.m;
                }
                if ((n2 & 0x40) != 0x0) {
                    x = e.x((z0.d)r);
                    n24 &= 0xFFC7FFFF;
                }
                if (n20 != 0) {
                    b2 = true;
                }
                final d d6 = f;
                final LazyListState lazyListState2 = a;
                final a.k k3 = k;
                z2 = z;
                a$b2 = m;
                final boolean b7 = b;
                d3 = x;
                b5 = b2;
                j = k3;
                b4 = b7;
                lazyListState = lazyListState2;
                d4 = d6;
                n27 = n24;
            }
            r.S();
            final int n29 = n27 >> 3;
            LazyListKt.a(d4, lazyListState, z2, b4, true, d3, b5, a$b2, j, null, null, l, (z0.d)r, (n27 & 0xE) | 0x6000 | (n27 & 0x70) | (n27 & 0x380) | (n27 & 0x1C00) | (0x70000 & n29) | (n29 & 0x380000) | (n27 << 6 & 0x1C00000) | (n27 << 12 & 0xE000000), n27 >> 21 & 0x70, 1536);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new LazyDslKt$LazyColumn.LazyDslKt$LazyColumn$1(d4, lazyListState, z2, b4, j, a$b2, d3, b5, (l)l, n, n2);
        }
    }
    
    public static final void b(d f, LazyListState a, z z, boolean b, a.d d, a$c j, n0.d x, boolean b2, final l<? super b, j> l, final z0.d d2, final int n, final int n2) {
        f.f((Object)l, "content");
        final ComposerImpl r = d2.r(-1724297413);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (r.l((Object)f)) {
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
        if ((n & 0x70) == 0x0) {
            int n6;
            if ((n2 & 0x2) == 0x0 && r.l((Object)a)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n4 |= n6;
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0195: {
            int n8;
            if (n7 != 0) {
                n8 = (n4 | 0x180);
            }
            else {
                n8 = n4;
                if ((n & 0x380) == 0x0) {
                    int n9;
                    if (r.l((Object)z)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n4 | n9);
                    break Label_0195;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0267: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0x1C00) == 0x0) {
                    int n13;
                    if (r.m(b)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0267;
                }
            }
            n14 = n12;
        }
        if ((0xE000 & n) == 0x0) {
            int n15;
            if ((n2 & 0x10) == 0x0 && r.l((Object)d)) {
                n15 = 16384;
            }
            else {
                n15 = 8192;
            }
            n14 |= n15;
        }
        final int n16 = n2 & 0x20;
        int n17;
        if (n16 != 0) {
            n17 = (n14 | 0x30000);
        }
        else {
            n17 = n14;
            if ((n & 0x70000) == 0x0) {
                int n18;
                if (r.l((Object)j)) {
                    n18 = 131072;
                }
                else {
                    n18 = 65536;
                }
                n17 = (n14 | n18);
            }
        }
        if ((n & 0x380000) == 0x0) {
            int n19;
            if ((n2 & 0x40) == 0x0 && r.l((Object)x)) {
                n19 = 1048576;
            }
            else {
                n19 = 524288;
            }
            n17 |= n19;
        }
        final int n20 = n2 & 0x80;
        int n21;
        if (n20 != 0) {
            n21 = (n17 | 0xC00000);
        }
        else {
            n21 = n17;
            if ((n & 0x1C00000) == 0x0) {
                int n22;
                if (r.m(b2)) {
                    n22 = 8388608;
                }
                else {
                    n22 = 4194304;
                }
                n21 = (n17 | n22);
            }
        }
        int n24 = 0;
        Label_0547: {
            int n23;
            if ((n2 & 0x100) != 0x0) {
                n23 = 100663296;
            }
            else {
                n24 = n21;
                if ((0xE000000 & n) != 0x0) {
                    break Label_0547;
                }
                if (r.l((Object)l)) {
                    n23 = 67108864;
                }
                else {
                    n23 = 33554432;
                }
            }
            n24 = (n21 | n23);
        }
        a.d d4;
        n0.d d5;
        d d6;
        LazyListState lazyListState2;
        z z2;
        boolean b3;
        a$c a$c2;
        boolean b4;
        if ((0xB6DB6DB & n24) == 0x2492492 && r.b()) {
            r.j();
            final d d3 = f;
            final LazyListState lazyListState = a;
            d4 = d;
            d5 = x;
            final a$c a$c = j;
            d6 = d3;
            lazyListState2 = lazyListState;
            z2 = z;
            b3 = b;
            a$c2 = a$c;
            b4 = b2;
        }
        else {
            r.v0();
            a.d d8;
            n0.d d9;
            boolean b6;
            a$c a$c4;
            if ((n & 0x1) != 0x0 && !r.Y()) {
                r.j();
                int n25 = n24;
                if ((n2 & 0x2) != 0x0) {
                    n25 = (n24 & 0xFFFFFF8F);
                }
                int n26 = n25;
                if ((n2 & 0x10) != 0x0) {
                    n26 = (n25 & 0xFFFF1FFF);
                }
                n24 = n26;
                if ((n2 & 0x40) != 0x0) {
                    n24 = (n26 & 0xFFC7FFFF);
                }
                final d d7 = f;
                final z z3 = z;
                final boolean b5 = b2;
                d8 = d;
                d9 = x;
                final a$c a$c3 = j;
                d6 = d7;
                lazyListState2 = a;
                z2 = z3;
                b6 = b;
                a$c4 = a$c3;
                b4 = b5;
            }
            else {
                if (n3 != 0) {
                    f = (d)d.a.f;
                }
                if ((n2 & 0x2) != 0x0) {
                    a = d.a((z0.d)r);
                    n24 &= 0xFFFFFF8F;
                }
                if (n7 != 0) {
                    final float n27 = 0;
                    z = (z)new a0(n27, n27, n27, n27);
                }
                if (n11 != 0) {
                    b = false;
                }
                if ((n2 & 0x10) != 0x0) {
                    final a$i a2 = a.a;
                    if (!b) {
                        d = (a.d)a.a;
                    }
                    else {
                        d = (a.d)a.b;
                    }
                    n24 &= 0xFFFF1FFF;
                }
                if (n16 != 0) {
                    j = (a$c)a$a.j;
                }
                if ((n2 & 0x40) != 0x0) {
                    x = e.x((z0.d)r);
                    n24 &= 0xFFC7FFFF;
                }
                if (n20 != 0) {
                    b2 = true;
                }
                final d d10 = f;
                final boolean b7 = b2;
                final LazyListState lazyListState3 = a;
                final a.d d11 = d;
                z2 = z;
                a$c4 = j;
                b6 = b;
                d9 = x;
                b4 = b7;
                d8 = d11;
                lazyListState2 = lazyListState3;
                d6 = d10;
            }
            r.S();
            final int n28 = n24 >> 3;
            LazyListKt.a(d6, lazyListState2, z2, b6, false, d9, b4, null, null, a$c4, d8, l, (z0.d)r, (n24 & 0xE) | 0x6000 | (n24 & 0x70) | (n24 & 0x380) | (n24 & 0x1C00) | (0x70000 & n28) | (n28 & 0x380000) | (0x70000000 & n24 << 12), (n24 >> 12 & 0xE) | (n24 >> 21 & 0x70), 384);
            final a.d d12 = d8;
            a$c2 = a$c4;
            d5 = d9;
            d4 = d12;
            b3 = b6;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new LazyDslKt$LazyRow.LazyDslKt$LazyRow$1(d6, lazyListState2, z2, b3, d4, a$c2, d5, b4, (l)l, n, n2);
        }
    }
}
