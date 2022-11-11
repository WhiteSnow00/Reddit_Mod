// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import al0.g7;
import p0.c0;
import z0.r0;
import z0.d$a$a;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import kotlin.jvm.internal.Lambda;
import rg2.p;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import z0.h0;
import o1.q0;
import l0.z;
import z0.d$a;
import p0.i;
import rg2.q;
import w2.e;
import j1.d;
import hg2.j;
import rg2.a;

public final class AndroidMenu_androidKt
{
    public static final void a(final boolean b, final a<j> a, d f, long b2, final e e, final q<? super i, ? super z0.d, ? super Integer, j> q, final z0.d d, final int n, final int n2) {
        sg2.e.f((Object)a, "onDismissRequest");
        sg2.e.f((Object)q, "content");
        final ComposerImpl s = d.s(-840283139);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (s.n(b)) {
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
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (s.m((Object)a)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0208: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x180);
            }
            else {
                n8 = n5;
                if ((n & 0x380) == 0x0) {
                    int n9;
                    if (s.m((Object)f)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n5 | n9);
                    break Label_0208;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n12;
        if (n11 != 0) {
            n12 = (n10 | 0xC00);
        }
        else {
            n12 = n10;
            if ((n & 0x1C00) == 0x0) {
                int n13;
                if (s.K(b2)) {
                    n13 = 2048;
                }
                else {
                    n13 = 1024;
                }
                n12 = (n10 | n13);
            }
        }
        if ((0xE000 & n) == 0x0) {
            int n14;
            if ((n2 & 0x10) == 0x0 && s.m((Object)e)) {
                n14 = 16384;
            }
            else {
                n14 = 8192;
            }
            n12 |= n14;
        }
        int n16 = 0;
        Label_0380: {
            int n15;
            if ((n2 & 0x20) != 0x0) {
                n15 = 196608;
            }
            else {
                n16 = n12;
                if ((0x70000 & n) != 0x0) {
                    break Label_0380;
                }
                if (s.m((Object)q)) {
                    n15 = 131072;
                }
                else {
                    n15 = 65536;
                }
            }
            n16 = (n12 | n15);
        }
        d d2;
        e e2;
        if ((0x5B6DB & n16) == 0x12492 && s.c()) {
            s.k();
            d2 = f;
            e2 = e;
        }
        else {
            s.v0();
            d d3;
            if ((n & 0x1) != 0x0 && !s.Y()) {
                s.k();
                int n17 = n16;
                if ((n2 & 0x10) != 0x0) {
                    n17 = (n16 & 0xFFFF1FFF);
                }
                n16 = n17;
                d3 = f;
                e2 = e;
            }
            else {
                if (n7 != 0) {
                    f = (d)d.a.f;
                }
                if (n11 != 0) {
                    final float n18 = 0;
                    b2 = ml0.a.b(n18, n18);
                }
                if ((n2 & 0x10) != 0x0) {
                    final e e3 = new e(true, false, false, 62);
                    n16 &= 0xFFFF1FFF;
                    d3 = f;
                    e2 = e3;
                }
                else {
                    final d d4 = f;
                    e2 = e;
                    d3 = d4;
                }
            }
            s.S();
            s.A(-492369756);
            final Object c0 = s.c0();
            final d$a$a a2 = d$a.a;
            Object o = c0;
            if (c0 == a2) {
                o = new z((Object)Boolean.FALSE);
                s.I0(o);
            }
            s.R(false);
            final z z = (z)o;
            ((SnapshotMutableStateImpl)z.b).setValue((Object)b);
            if ((boolean)((SnapshotMutableStateImpl)z.a).getValue() || (boolean)((SnapshotMutableStateImpl)z.b).getValue()) {
                s.A(-492369756);
                Object o2;
                if ((o2 = s.c0()) == a2) {
                    o2 = bg.d.t0((Object)new q0(q0.b));
                    s.I0(o2);
                }
                s.R(false);
                final h0 h0 = (h0)o2;
                final b b3 = (b)s.u((o0)CompositionLocalsKt.e);
                s.A(1157296644);
                final boolean m = s.m((Object)h0);
                final Object c2 = s.c0();
                Object o3;
                if (m || (o3 = c2) == a2) {
                    o3 = new AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(h0);
                    s.I0(o3);
                }
                s.R(false);
                AndroidPopup_androidKt.a((w2.d)new x0.e(b2, b3, (p)o3), a, e2, (p<? super z0.d, ? super Integer, j>)aa1.a.R((z0.d)s, 79632374, (Lambda)new AndroidMenu_androidKt$DropdownMenu$1(z, h0, d3, (q)q, n16)), (z0.d)s, (n16 & 0x70) | 0xC00 | (n16 >> 6 & 0x380), 0);
            }
            d2 = d3;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new AndroidMenu_androidKt$DropdownMenu$2(b, (a)a, d2, b2, e2, (q)q, n, n2);
        }
    }
    
    public static final void b(final a<j> a, d f, boolean b, p0.z a2, o0.j j, final q<? super c0, ? super z0.d, ? super Integer, j> q, final z0.d d, final int n, final int n2) {
        sg2.e.f((Object)a, "onClick");
        sg2.e.f((Object)q, "content");
        final ComposerImpl s = d.s(-1988562892);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (s.m((Object)a)) {
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
                    if (s.m((Object)f)) {
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
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0219: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x380) == 0x0) {
                    int n11;
                    if (s.n(b)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0219;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0291: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0x1C00) == 0x0) {
                    int n15;
                    if (s.m((Object)a2)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0291;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0363: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n & 0xE000) == 0x0) {
                    int n19;
                    if (s.m((Object)j)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0363;
                }
            }
            n20 = n18;
        }
        int n22 = 0;
        Label_0418: {
            int n21;
            if ((n2 & 0x20) != 0x0) {
                n21 = 196608;
            }
            else {
                n22 = n20;
                if ((n & 0x70000) != 0x0) {
                    break Label_0418;
                }
                if (s.m((Object)q)) {
                    n21 = 131072;
                }
                else {
                    n21 = 65536;
                }
            }
            n22 = (n20 | n21);
        }
        d d2;
        p0.z z2;
        o0.j i;
        if ((0x5B6DB & n22) == 0x12492 && s.c()) {
            s.k();
            final p0.z z = a2;
            d2 = f;
            z2 = z;
            i = j;
        }
        else {
            if (n5 != 0) {
                f = (d)d.a.f;
            }
            if (n9 != 0) {
                b = true;
            }
            if (n13 != 0) {
                a2 = (p0.z)x0.j.a;
            }
            if (n17 != 0) {
                s.A(-492369756);
                Object o;
                if ((o = s.c0()) == d$a.a) {
                    o = g7.o(s);
                }
                s.R(false);
                j = (o0.j)o;
            }
            MenuKt.b(a, f, b, a2, j, q, (z0.d)s, (n22 & 0xE) | (n22 & 0x70) | (n22 & 0x380) | (n22 & 0x1C00) | (n22 & 0xE000) | (n22 & 0x70000), 0);
            i = j;
            final d d3 = f;
            z2 = a2;
            d2 = d3;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new AndroidMenu_androidKt$DropdownMenuItem$2((a)a, d2, b, z2, i, (q)q, n, n2);
        }
    }
}
