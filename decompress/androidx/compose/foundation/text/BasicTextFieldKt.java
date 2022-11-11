// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import z0.e1;
import z0.d$a$a;
import z0.h0;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import o1.m0;
import o1.r;
import al0.g7;
import z0.d$a;
import sg2.e;
import rg2.q;
import i2.n;
import o2.y;
import v0.f;
import v0.g;
import i2.p;
import j1.d;
import hg2.j;
import rg2.l;
import androidx.compose.ui.text.input.TextFieldValue;

public final class BasicTextFieldKt
{
    public static final void a(final TextFieldValue textFieldValue, final l<? super TextFieldValue, j> l, final d d, boolean b, boolean b2, p c, final g g, final f f, boolean b3, int n, y y, final l<? super n, j> i, final o0.j j, final o1.n n2, final q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q, final z0.d d2, final int n3, final int n4, final int n5) {
        e.f((Object)textFieldValue, "value");
        e.f((Object)l, "onValueChange");
        final ComposerImpl s = d2.s(-560482651);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (s.m((Object)textFieldValue)) {
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
        int n8;
        if ((n5 & 0x2) != 0x0) {
            n8 = (n6 | 0x30);
        }
        else {
            n8 = n6;
            if ((n3 & 0x70) == 0x0) {
                int n9;
                if (s.m((Object)l)) {
                    n9 = 32;
                }
                else {
                    n9 = 16;
                }
                n8 = (n6 | n9);
            }
        }
        final int n10 = n5 & 0x4;
        int n13 = 0;
        Label_0207: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0x180);
            }
            else {
                n11 = n8;
                if ((n3 & 0x380) == 0x0) {
                    int n12;
                    if (s.m((Object)d)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n8 | n12);
                    break Label_0207;
                }
            }
            n13 = n11;
        }
        final int n14 = n5 & 0x8;
        int n15;
        if (n14 != 0) {
            n15 = (n13 | 0xC00);
        }
        else {
            n15 = n13;
            if ((n3 & 0x1C00) == 0x0) {
                int n16;
                if (s.n(b)) {
                    n16 = 2048;
                }
                else {
                    n16 = 1024;
                }
                n15 = (n13 | n16);
            }
        }
        final int n17 = n5 & 0x10;
        final int n18 = 8192;
        int n19;
        if (n17 != 0) {
            n19 = (n15 | 0x6000);
        }
        else {
            n19 = n15;
            if ((n3 & 0xE000) == 0x0) {
                int n20;
                if (s.n(b2)) {
                    n20 = 16384;
                }
                else {
                    n20 = 8192;
                }
                n19 = (n15 | n20);
            }
        }
        final int n21 = n5 & 0x20;
        int n22;
        if (n21 != 0) {
            n22 = (n19 | 0x30000);
        }
        else {
            n22 = n19;
            if ((n3 & 0x70000) == 0x0) {
                int n23;
                if (s.m((Object)c)) {
                    n23 = 131072;
                }
                else {
                    n23 = 65536;
                }
                n22 = (n19 | n23);
            }
        }
        final int n24 = n5 & 0x40;
        int n25;
        if (n24 != 0) {
            n25 = (n22 | 0x180000);
        }
        else {
            n25 = n22;
            if ((n3 & 0x380000) == 0x0) {
                int n26;
                if (s.m((Object)g)) {
                    n26 = 1048576;
                }
                else {
                    n26 = 524288;
                }
                n25 = (n22 | n26);
            }
        }
        final int n27 = n5 & 0x80;
        int n28;
        if (n27 != 0) {
            n28 = (n25 | 0xC00000);
        }
        else {
            n28 = n25;
            if ((n3 & 0x1C00000) == 0x0) {
                int n29;
                if (s.m((Object)f)) {
                    n29 = 8388608;
                }
                else {
                    n29 = 4194304;
                }
                n28 = (n25 | n29);
            }
        }
        final int n30 = n5 & 0x100;
        int n31;
        if (n30 != 0) {
            n31 = (n28 | 0x6000000);
        }
        else {
            n31 = n28;
            if ((n3 & 0xE000000) == 0x0) {
                int n32;
                if (s.n(b3)) {
                    n32 = 67108864;
                }
                else {
                    n32 = 33554432;
                }
                n31 = (n28 | n32);
            }
        }
        final int n33 = n5 & 0x200;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x30000000);
        }
        else {
            n34 = n31;
            if ((n3 & 0x70000000) == 0x0) {
                int n35;
                if (s.q(n)) {
                    n35 = 536870912;
                }
                else {
                    n35 = 268435456;
                }
                n34 = (n31 | n35);
            }
        }
        final int n36 = n5 & 0x400;
        int n37;
        if (n36 != 0) {
            n37 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n38;
            if (s.m((Object)y)) {
                n38 = 4;
            }
            else {
                n38 = 2;
            }
            n37 = (n4 | n38);
        }
        else {
            n37 = n4;
        }
        final int n39 = n5 & 0x800;
        int n40;
        if (n39 != 0) {
            n40 = (n37 | 0x30);
        }
        else {
            n40 = n37;
            if ((n4 & 0x70) == 0x0) {
                int n41;
                if (s.m((Object)i)) {
                    n41 = 32;
                }
                else {
                    n41 = 16;
                }
                n40 = (n37 | n41);
            }
        }
        final int n42 = n40;
        final int n43 = n5 & 0x1000;
        int n44;
        if (n43 != 0) {
            n44 = (n42 | 0x180);
        }
        else {
            n44 = n42;
            if ((n4 & 0x380) == 0x0) {
                int n45;
                if (s.m((Object)j)) {
                    n45 = 256;
                }
                else {
                    n45 = 128;
                }
                n44 = (n42 | n45);
            }
        }
        if ((n4 & 0x1C00) == 0x0) {
            int n46;
            if ((n5 & 0x2000) == 0x0 && s.m((Object)n2)) {
                n46 = 2048;
            }
            else {
                n46 = 1024;
            }
            n44 |= n46;
        }
        final int n47 = n5 & 0x4000;
        int n48;
        if (n47 != 0) {
            n48 = (n44 | 0x6000);
        }
        else {
            n48 = n44;
            if ((n4 & 0xE000) == 0x0) {
                int n49 = n18;
                if (s.m((Object)q)) {
                    n49 = 16384;
                }
                n48 = (n44 | n49);
            }
        }
        boolean b5;
        o0.j k;
        o1.n n50;
        d d3;
        boolean b6;
        boolean b7;
        p p19;
        g g2;
        f f2;
        y y3;
        l<? super n, j> m;
        q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q2;
        if ((n34 & 0x5B6DB6DB) == 0x12492492 && (0xB6DB & n48) == 0x2492 && s.c()) {
            s.k();
            final boolean b4 = b2;
            b5 = b3;
            final y y2 = y;
            k = j;
            n50 = n2;
            d3 = d;
            b6 = b;
            b7 = b4;
            p19 = c;
            g2 = g;
            f2 = f;
            y3 = y2;
            m = i;
            q2 = q;
        }
        else {
            s.v0();
            boolean b9;
            l<? super n, j> l2;
            o0.j j2;
            o1.n n52;
            q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q3;
            if ((n3 & 0x1) != 0x0 && !s.Y()) {
                s.k();
                int n51 = n48;
                if ((n5 & 0x2000) != 0x0) {
                    n51 = (n48 & 0xFFFFE3FF);
                }
                final boolean b8 = b;
                b9 = b3;
                n48 = n51;
                g2 = g;
                d3 = d;
                b6 = b8;
                p19 = c;
                f2 = f;
                l2 = i;
                j2 = j;
                n52 = n2;
                q3 = q;
            }
            else {
                Object f3;
                if (n10 != 0) {
                    f3 = d.a.f;
                }
                else {
                    f3 = d;
                }
                if (n14 != 0) {
                    b = true;
                }
                if (n17 != 0) {
                    b2 = false;
                }
                if (n21 != 0) {
                    c = p.c;
                }
                g e;
                if (n24 != 0) {
                    e = g.e;
                }
                else {
                    e = g;
                }
                f g3;
                if (n27 != 0) {
                    g3 = f.g;
                }
                else {
                    g3 = f;
                }
                if (n30 != 0) {
                    b3 = false;
                }
                if (n33 != 0) {
                    n = Integer.MAX_VALUE;
                }
                Object a;
                if (n36 != 0) {
                    a = o2.y.a.a;
                }
                else {
                    a = y;
                }
                Object instance;
                if (n39 != 0) {
                    instance = BasicTextFieldKt$BasicTextField$5.INSTANCE;
                }
                else {
                    instance = i;
                }
                o0.j j3;
                if (n43 != 0) {
                    s.A(-492369756);
                    Object o;
                    if ((o = s.c0()) == d$a.a) {
                        o = g7.o(s);
                    }
                    s.R(false);
                    j3 = (o0.j)o;
                }
                else {
                    j3 = j;
                }
                o1.n n53;
                if ((n5 & 0x2000) != 0x0) {
                    n53 = new m0(r.b);
                    n48 &= 0xFFFFE3FF;
                }
                else {
                    n53 = n2;
                }
                Object b10;
                if (n47 != 0) {
                    b10 = ComposableSingletons$BasicTextFieldKt.b;
                }
                else {
                    b10 = q;
                }
                d3 = (d)f3;
                final boolean b11 = b;
                final Object o2 = b10;
                b9 = b3;
                final Object o3 = a;
                l2 = (l<? super n, j>)instance;
                final p p20 = c;
                final f f4 = g3;
                j2 = j3;
                n52 = n53;
                final g g4 = e;
                q3 = (q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j>)o2;
                y = (y)o3;
                f2 = f4;
                p19 = p20;
                b6 = b11;
                g2 = g4;
            }
            s.S();
            final o2.j j4 = new o2.j(b9, g2.a, g2.b, g2.c, g2.d);
            int n54;
            if (b9) {
                n54 = 1;
            }
            else {
                n54 = n;
            }
            s.A(511388516);
            final boolean m2 = s.m((Object)textFieldValue);
            final boolean m3 = s.m((Object)l);
            final Object c2 = s.c0();
            Object o4;
            if ((m2 | m3) || (o4 = c2) == d$a.a) {
                o4 = new BasicTextFieldKt$BasicTextField$7$1(textFieldValue, (l)l);
                s.I0(o4);
            }
            s.R(false);
            final l l3 = (l)o4;
            final int n55 = n48 << 12;
            final int n56 = n34 >> 3;
            CoreTextFieldKt.a(textFieldValue, l3, d3, p19, y, l2, j2, n52, b9 ^ true, n54, j4, f2, b6, b2, q3, (z0.d)s, (n34 & 0xE) | (n34 & 0x380) | (n34 >> 6 & 0x1C00) | (n55 & 0xE000) | (n55 & 0x70000) | (n55 & 0x380000) | (n55 & 0x1C00000), (n34 >> 18 & 0x70) | (n56 & 0x380) | (n56 & 0x1C00) | (0xE000 & n48), 0);
            final boolean b12 = b2;
            final y y4 = y;
            final o0.j j5 = j2;
            q2 = q3;
            n50 = n52;
            k = j5;
            m = l2;
            y3 = y4;
            b5 = b9;
            b7 = b12;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (rg2.p)new BasicTextFieldKt$BasicTextField$8(textFieldValue, (l)l, d3, b6, b7, p19, g2, f2, b5, n, y3, (l)m, k, n50, (q)q2, n3, n4, n5);
        }
    }
    
    public static final void b(final String s, final l<? super String, j> l, d d, boolean b, boolean b2, final p p19, g e, final f f, boolean b3, int n, final y y, final l<? super n, j> i, final o0.j j, final o1.n n2, q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q, final z0.d d2, final int n3, final int n4, final int n5) {
        e.f((Object)s, "value");
        e.f((Object)l, "onValueChange");
        final ComposerImpl s2 = d2.s(-454732590);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n7;
            if (s2.m((Object)s)) {
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
        int n8;
        if ((n5 & 0x2) != 0x0) {
            n8 = (n6 | 0x30);
        }
        else {
            n8 = n6;
            if ((n3 & 0x70) == 0x0) {
                int n9;
                if (s2.m((Object)l)) {
                    n9 = 32;
                }
                else {
                    n9 = 16;
                }
                n8 = (n6 | n9);
            }
        }
        final int n10 = n5 & 0x4;
        int n13 = 0;
        Label_0207: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0x180);
            }
            else {
                n11 = n8;
                if ((n3 & 0x380) == 0x0) {
                    int n12;
                    if (s2.m((Object)d)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n8 | n12);
                    break Label_0207;
                }
            }
            n13 = n11;
        }
        final int n14 = n5 & 0x8;
        int n15;
        if (n14 != 0) {
            n15 = (n13 | 0xC00);
        }
        else {
            n15 = n13;
            if ((n3 & 0x1C00) == 0x0) {
                int n16;
                if (s2.n(b)) {
                    n16 = 2048;
                }
                else {
                    n16 = 1024;
                }
                n15 = (n13 | n16);
            }
        }
        final int n17 = n5 & 0x10;
        final int n18 = 8192;
        int n19;
        if (n17 != 0) {
            n19 = (n15 | 0x6000);
        }
        else {
            n19 = n15;
            if ((n3 & 0xE000) == 0x0) {
                int n20;
                if (s2.n(b2)) {
                    n20 = 16384;
                }
                else {
                    n20 = 8192;
                }
                n19 = (n15 | n20);
            }
        }
        final int n21 = n5 & 0x20;
        int n22;
        if (n21 != 0) {
            n22 = (n19 | 0x30000);
        }
        else {
            n22 = n19;
            if ((n3 & 0x70000) == 0x0) {
                int n23;
                if (s2.m((Object)p19)) {
                    n23 = 131072;
                }
                else {
                    n23 = 65536;
                }
                n22 = (n19 | n23);
            }
        }
        final int n24 = n5 & 0x40;
        int n25;
        if (n24 != 0) {
            n25 = (n22 | 0x180000);
        }
        else {
            n25 = n22;
            if ((n3 & 0x380000) == 0x0) {
                int n26;
                if (s2.m((Object)e)) {
                    n26 = 1048576;
                }
                else {
                    n26 = 524288;
                }
                n25 = (n22 | n26);
            }
        }
        final int n27 = n5 & 0x80;
        int n28;
        if (n27 != 0) {
            n28 = (n25 | 0xC00000);
        }
        else {
            n28 = n25;
            if ((n3 & 0x1C00000) == 0x0) {
                int n29;
                if (s2.m((Object)f)) {
                    n29 = 8388608;
                }
                else {
                    n29 = 4194304;
                }
                n28 = (n25 | n29);
            }
        }
        final int n30 = n5 & 0x100;
        int n31;
        if (n30 != 0) {
            n31 = (n28 | 0x6000000);
        }
        else {
            n31 = n28;
            if ((n3 & 0xE000000) == 0x0) {
                int n32;
                if (s2.n(b3)) {
                    n32 = 67108864;
                }
                else {
                    n32 = 33554432;
                }
                n31 = (n28 | n32);
            }
        }
        final int n33 = n5 & 0x200;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x30000000);
        }
        else {
            n34 = n31;
            if ((n3 & 0x70000000) == 0x0) {
                int n35;
                if (s2.q(n)) {
                    n35 = 536870912;
                }
                else {
                    n35 = 268435456;
                }
                n34 = (n31 | n35);
            }
        }
        final int n36 = n5 & 0x400;
        int n37;
        if (n36 != 0) {
            n37 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n38;
            if (s2.m((Object)y)) {
                n38 = 4;
            }
            else {
                n38 = 2;
            }
            n37 = (n4 | n38);
        }
        else {
            n37 = n4;
        }
        final int n39 = n5 & 0x800;
        int n40;
        if (n39 != 0) {
            n40 = (n37 | 0x30);
        }
        else {
            n40 = n37;
            if ((n4 & 0x70) == 0x0) {
                int n41;
                if (s2.m((Object)i)) {
                    n41 = 32;
                }
                else {
                    n41 = 16;
                }
                n40 = (n37 | n41);
            }
        }
        final int n42 = n40;
        final int n43 = n5 & 0x1000;
        int n44;
        if (n43 != 0) {
            n44 = (n42 | 0x180);
        }
        else {
            n44 = n42;
            if ((n4 & 0x380) == 0x0) {
                int n45;
                if (s2.m((Object)j)) {
                    n45 = 256;
                }
                else {
                    n45 = 128;
                }
                n44 = (n42 | n45);
            }
        }
        if ((n4 & 0x1C00) == 0x0) {
            int n46;
            if ((n5 & 0x2000) == 0x0 && s2.m((Object)n2)) {
                n46 = 2048;
            }
            else {
                n46 = 1024;
            }
            n44 |= n46;
        }
        final int n47 = n5 & 0x4000;
        int n48;
        if (n47 != 0) {
            n48 = (n44 | 0x6000);
        }
        else {
            n48 = n44;
            if ((n4 & 0xE000) == 0x0) {
                int n49 = n18;
                if (s2.m((Object)q)) {
                    n49 = 16384;
                }
                n48 = (n44 | n49);
            }
        }
        f f2;
        boolean b4;
        d d4;
        boolean b5;
        p p20;
        y y2;
        l<? super n, j> k;
        o0.j m;
        o1.n n50;
        q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q3;
        if ((n34 & 0x5B6DB6DB) == 0x12492492 && (0xB6DB & n48) == 0x2492 && s2.c()) {
            s2.k();
            final d d3 = d;
            f2 = f;
            b4 = b3;
            final q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q2 = q;
            d4 = d3;
            b5 = b2;
            p20 = p19;
            y2 = y;
            k = i;
            m = j;
            n50 = n2;
            q3 = q2;
        }
        else {
            s2.v0();
            o0.j j2;
            o1.n n52;
            boolean b7;
            boolean b8;
            Object instance;
            f f3;
            if ((n3 & 0x1) != 0x0 && !s2.Y()) {
                s2.k();
                int n51 = n48;
                if ((n5 & 0x2000) != 0x0) {
                    n51 = (n48 & 0xFFFFE3FF);
                }
                final boolean b6 = b2;
                j2 = j;
                n52 = n2;
                n48 = n51;
                b7 = b;
                b8 = b3;
                b5 = b6;
                y2 = y;
                instance = i;
                p20 = p19;
                f3 = f;
            }
            else {
                Object f4;
                if (n10 != 0) {
                    f4 = d.a.f;
                }
                else {
                    f4 = d;
                }
                if (n14 != 0) {
                    b = true;
                }
                if (n17 != 0) {
                    b2 = false;
                }
                p c;
                if (n21 != 0) {
                    c = p.c;
                }
                else {
                    c = p19;
                }
                if (n24 != 0) {
                    e = g.e;
                }
                f g;
                if (n27 != 0) {
                    g = f.g;
                }
                else {
                    g = f;
                }
                if (n30 != 0) {
                    b3 = false;
                }
                if (n33 != 0) {
                    n = Integer.MAX_VALUE;
                }
                Object a;
                if (n36 != 0) {
                    a = o2.y.a.a;
                }
                else {
                    a = y;
                }
                if (n39 != 0) {
                    instance = BasicTextFieldKt$BasicTextField$1.INSTANCE;
                }
                else {
                    instance = i;
                }
                o0.j j3;
                if (n43 != 0) {
                    s2.A(-492369756);
                    Object o;
                    if ((o = s2.c0()) == d$a.a) {
                        o = g7.o(s2);
                    }
                    s2.R(false);
                    j3 = (o0.j)o;
                }
                else {
                    j3 = j;
                }
                o1.n n53;
                if ((n5 & 0x2000) != 0x0) {
                    n53 = new m0(r.b);
                    n48 &= 0xFFFFE3FF;
                }
                else {
                    n53 = n2;
                }
                Object a2;
                if (n47 != 0) {
                    a2 = ComposableSingletons$BasicTextFieldKt.a;
                }
                else {
                    a2 = q;
                }
                final o0.j j4 = j3;
                final o1.n n54 = n53;
                final boolean b9 = b;
                b8 = b3;
                q = (q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j>)a2;
                f3 = g;
                p20 = c;
                y2 = (y)a;
                b5 = b2;
                n52 = n54;
                j2 = j4;
                b7 = b9;
                d = (d)f4;
            }
            s2.S();
            s2.A(-492369756);
            Object o2 = s2.c0();
            final d$a$a a3 = d$a.a;
            if (o2 == a3) {
                o2 = bg.d.t0((Object)new TextFieldValue(s, 0L, 6));
                s2.I0(o2);
            }
            s2.R(false);
            final h0 h0 = (h0)o2;
            final TextFieldValue b10 = TextFieldValue.b((TextFieldValue)((e1)h0).getValue(), s, 0L, 6);
            s2.A(1157296644);
            final boolean m2 = s2.m((Object)s);
            final Object c2 = s2.c0();
            Object t0;
            if (m2 || (t0 = c2) == a3) {
                t0 = bg.d.t0((Object)s);
                s2.I0(t0);
            }
            s2.R(false);
            final h0 h2 = (h0)t0;
            final o2.j j5 = new o2.j(b8, e.a, e.b, e.c, e.d);
            int n55;
            if (b8) {
                n55 = 1;
            }
            else {
                n55 = n;
            }
            s2.A(1618982084);
            final boolean m3 = s2.m((Object)h0);
            final boolean m4 = s2.m((Object)h2);
            final boolean m5 = s2.m((Object)l);
            final Object c3 = s2.c0();
            Object o3;
            if ((m3 | m4 | m5) || (o3 = c3) == a3) {
                o3 = new BasicTextFieldKt$BasicTextField$3$1((l)l, h0, h2);
                s2.I0(o3);
            }
            s2.R(false);
            final l l2 = (l)o3;
            final int n56 = n48 << 12;
            final int n57 = n34 >> 3;
            CoreTextFieldKt.a(b10, l2, d, p20, y2, (l<? super n, j>)instance, j2, n52, b8 ^ true, n55, j5, f3, b7, b5, q, (z0.d)s2, (n34 & 0x380) | (n34 >> 6 & 0x1C00) | (n56 & 0xE000) | (n56 & 0x70000) | (n56 & 0x380000) | (n56 & 0x1C00000), (n57 & 0x1C00) | ((n34 >> 18 & 0x70) | (n57 & 0x380)) | (n48 & 0xE000), 0);
            final l<? super n, j> l3 = (l<? super n, j>)instance;
            final f f5 = f3;
            m = j2;
            final d d5 = d;
            q3 = q;
            n50 = n52;
            k = l3;
            b4 = b8;
            f2 = f5;
            b = b7;
            d4 = d5;
        }
        final r0 u = s2.U();
        if (u != null) {
            u.d = (rg2.p)new BasicTextFieldKt$BasicTextField$4(s, (l)l, d4, b, b5, p20, e, f2, b4, n, y2, (l)k, m, n50, (q)q3, n3, n4, n5);
        }
    }
}
