// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import rg2.p;
import z0.r0;
import z0.f1;
import l0.e;
import x0.c;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.foundation.b;
import z0.e1;
import androidx.compose.foundation.layout.SizeKt;
import j1.a$a;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import h2.g;
import y0.i;
import l0.s;
import l0.q;
import cg.m0;
import al0.g7;
import z0.d$a;
import x0.l;
import j1.d;
import hg2.j;
import rg2.a;

public final class RadioButtonKt
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    
    static {
        a = 24;
        final float f2 = b = 2;
        d = (c = 20) / f2;
        e = 12;
        f = f2;
    }
    
    public static final void a(final boolean b, final a<j> a, d f, boolean b2, o0.j j, final l l, final z0.d d, final int n, final int n2) {
        final ComposerImpl s = d.s(1314435585);
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
        Label_0195: {
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
                    if (s.n(b2)) {
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
        final int n15 = n2 & 0x10;
        int n18 = 0;
        Label_0339: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0x6000);
            }
            else {
                n16 = n14;
                if ((0xE000 & n) == 0x0) {
                    int n17;
                    if (s.m((Object)j)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n14 | n17);
                    break Label_0339;
                }
            }
            n18 = n16;
        }
        if ((0x70000 & n) == 0x0) {
            int n19;
            if ((n2 & 0x20) == 0x0 && s.m((Object)l)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 |= n19;
        }
        o0.j i;
        l k = null;
        if ((n18 & 0x5B6DB) == 0x12492 && s.c()) {
            s.k();
            i = j;
            k = l;
        }
        else {
            s.v0();
            d d2 = null;
            o0.j m = null;
            Label_0577: {
                if ((n & 0x1) != 0x0 && !s.Y()) {
                    s.k();
                }
                else {
                    if (n7 != 0) {
                        f = (d)d.a.f;
                    }
                    if (n11 != 0) {
                        b2 = true;
                    }
                    if (n15 != 0) {
                        s.A(-492369756);
                        Object o;
                        if ((o = s.c0()) == d$a.a) {
                            o = g7.o(s);
                        }
                        s.R(false);
                        j = (o0.j)o;
                    }
                    if ((n2 & 0x20) != 0x0) {
                        final c w = m0.w(0L, 0L, 0L, (z0.d)s, 7);
                        d2 = f;
                        m = j;
                        k = (l)w;
                        break Label_0577;
                    }
                }
                final d d3 = f;
                m = j;
                k = l;
                d2 = d3;
            }
            s.S();
            float n20;
            if (b) {
                n20 = RadioButtonKt.e / 2;
            }
            else {
                n20 = 0;
            }
            final e a2 = androidx.compose.animation.core.a.a(n20, (s)aa1.a.p1(100, 0, (q)null, 6), (z0.d)s, 48);
            final e1 a3 = k.a(b2, b, (z0.d)s);
            s.A(1941632354);
            Object o2;
            if (a != null) {
                o2 = androidx.compose.foundation.selection.a.a((d)d.a.f, b, m, y0.i.a(false, RadioButtonKt.a, 0L, (z0.d)s, 54, 4), b2, new g(3), a);
            }
            else {
                o2 = d.a.f;
            }
            final z0.d d4 = (z0.d)s;
            ((ComposerImpl)d4).R(false);
            d d5;
            final d.a a4 = (d.a)(d5 = (d)d.a.f);
            if (a != null) {
                final f1 a5 = TouchTargetKt.a;
                d5 = ComposedModifierKt.a((d)a4, InspectableValueKt.a, (rg2.q)TouchTargetKt$minimumTouchTargetSize$2.INSTANCE);
            }
            final d o3 = SizeKt.o(aa1.a.N0(SizeKt.B(d2.j0(d5).j0((d)o2), a$a.e, false, 2), RadioButtonKt.b), RadioButtonKt.c);
            ((ComposerImpl)d4).A(511388516);
            final boolean m2 = ((ComposerImpl)d4).m((Object)a3);
            final boolean m3 = ((ComposerImpl)d4).m((Object)a2);
            final Object c0 = ((ComposerImpl)d4).c0();
            Object o4;
            if ((m2 | m3) || (o4 = c0) == d$a.a) {
                o4 = new RadioButtonKt$RadioButton$2.RadioButtonKt$RadioButton$2$1(a3, (e1)a2);
                ((ComposerImpl)d4).I0(o4);
            }
            ((ComposerImpl)d4).R(false);
            b.a(0, d4, o3, (rg2.l)o4);
            i = m;
            f = d2;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new RadioButtonKt$RadioButton.RadioButtonKt$RadioButton$3(b, (a)a, f, b2, i, k, n, n2);
        }
    }
}
