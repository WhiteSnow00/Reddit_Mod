// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import qg2.v;
import androidx.appcompat.widget.s0;
import ah2.f;
import gh2.h;
import gh2.g;
import java.util.List;
import java.util.Collection;
import qg2.j;
import qg2.m;
import yl.a;
import gh2.i;
import ah2.c;
import o1.b0;
import java.util.ArrayList;

public final class e
{
    public final ArrayList a;
    public final b b;
    public final b c;
    public final b d;
    public final b e;
    
    public e() {
        this.a = new ArrayList();
        this.b = new b(0);
        this.c = new b(0);
        this.d = new b(0);
        this.e = new b(0);
    }
    
    public static void b(final b0 b0, double n, double n2, double n3, double sqrt, final double n4, double n5, double sin, final boolean b2, final boolean b3) {
        final double n6 = sin / 180 * 3.141592653589793;
        final double cos = Math.cos(n6);
        final double sin2 = Math.sin(n6);
        final double n7 = (n2 * sin2 + n * cos) / n4;
        final double n8 = (n2 * cos + -n * sin2) / n5;
        final double n9 = (sqrt * sin2 + n3 * cos) / n4;
        final double n10 = (sqrt * cos + -n3 * sin2) / n5;
        final double n11 = n7 - n9;
        final double n12 = n8 - n10;
        final double n13 = 2;
        final double n14 = (n7 + n9) / n13;
        final double n15 = (n8 + n10) / n13;
        final double n16 = n12 * n12 + n11 * n11;
        if (n16 == 0.0) {
            return;
        }
        final double n17 = 1.0 / n16 - 0.25;
        if (n17 < 0.0) {
            final double n18 = (float)(Math.sqrt(n16) / 1.99999);
            b(b0, n, n2, n3, sqrt, n4 * n18, n5 * n18, sin, b2, b3);
            return;
        }
        sqrt = Math.sqrt(n17);
        n3 = n11 * sqrt;
        sqrt *= n12;
        if (b2 == b3) {
            sin = n14 - sqrt;
            sqrt = n15 + n3;
        }
        else {
            sin = n14 + sqrt;
            sqrt = n15 - n3;
        }
        double atan2 = Math.atan2(n8 - sqrt, n7 - sin);
        final double n19 = Math.atan2(n10 - sqrt, n9 - sin) - atan2;
        final double n20 = dcmpl(n19, 0.0);
        final boolean b4 = n20 >= 0;
        n3 = n19;
        if (b3 != b4) {
            if (n20 > 0) {
                n3 = n19 - 6.283185307179586;
            }
            else {
                n3 = n19 + 6.283185307179586;
            }
        }
        final double n21 = sin * n4;
        final double n22 = sqrt * n5;
        final double n23 = 4;
        final int n24 = (int)Math.ceil(Math.abs(n3 * n23 / 3.141592653589793));
        final double cos2 = Math.cos(n6);
        final double sin3 = Math.sin(n6);
        final double cos3 = Math.cos(atan2);
        sin = Math.sin(atan2);
        sqrt = -n4;
        final double n25 = sqrt * cos2;
        final double n26 = n5 * sin3;
        final double n27 = sqrt * sin3;
        final double n28 = n5 * cos2;
        final double n29 = n3 / n24;
        sqrt = cos3 * n28 + sin * n27;
        n5 = n25 * sin - n26 * cos3;
        int i = 0;
        double n30 = n2;
        sin = n;
        n = sin3;
        n3 = n27;
        n2 = n29;
        while (i < n24) {
            final double n31 = atan2 + n2;
            final double sin4 = Math.sin(n31);
            final double cos4 = Math.cos(n31);
            final double n32 = n4 * cos2 * cos4 + (n21 * cos - n22 * sin2) - n26 * sin4;
            final double n33 = n28 * sin4 + (n4 * n * cos4 + (n22 * cos + n21 * sin2));
            final double n34 = n25 * sin4 - n26 * cos4;
            final double n35 = cos4 * n28 + sin4 * n3;
            final double n36 = n31 - atan2;
            final double tan = Math.tan(n36 / n13);
            final double n37 = (Math.sqrt(3.0 * tan * tan + n23) - 1) * Math.sin(n36) / 3;
            b0.c((float)(n5 * n37 + sin), (float)(sqrt * n37 + n30), (float)(n32 - n37 * n34), (float)(n33 - n37 * n35), (float)n32, (float)n33);
            ++i;
            sin = n32;
            n30 = n33;
            atan2 = n31;
            sqrt = n35;
            n5 = n34;
        }
    }
    
    public final void a(final char c, final float[] array) {
        final ArrayList a = this.a;
        boolean b = false;
        Label_0029: {
            if (c != 'z') {
                if (c != 'Z') {
                    b = false;
                    break Label_0029;
                }
            }
            b = true;
        }
        List x;
        if (b) {
            x = c.X((Object)d$b.c);
        }
        else if (c == 'm') {
            final g o1 = yl.a.o1(new i(0, array.length - 2), 2);
            final ArrayList list = new ArrayList<Object>(m.P0((Iterable)o1, 10));
            final h g = o1.g();
            while (true) {
                x = list;
                if (!g.h) {
                    break;
                }
                final int nextInt = ((v)g).nextInt();
                final float[] o2 = j.o1(nextInt, nextInt + 2, array);
                final float n = o2[0];
                final float n2 = o2[1];
                Object o3 = new d$n(n, n2);
                if (o3 instanceof d$f && nextInt > 0) {
                    o3 = new d$e(n, n2);
                }
                else if (nextInt > 0) {
                    o3 = new d$m(n, n2);
                }
                list.add(o3);
            }
        }
        else if (c == 'M') {
            final g o4 = yl.a.o1(new i(0, array.length - 2), 2);
            final ArrayList list2 = new ArrayList<Object>(m.P0((Iterable)o4, 10));
            final h g2 = o4.g();
            while (true) {
                x = list2;
                if (!g2.h) {
                    break;
                }
                final int nextInt2 = ((v)g2).nextInt();
                final float[] o5 = j.o1(nextInt2, nextInt2 + 2, array);
                final float n3 = o5[0];
                final float n4 = o5[1];
                final d$f d$f = new d$f(n3, n4);
                Object o6;
                if (nextInt2 > 0) {
                    o6 = new d$e(n3, n4);
                }
                else {
                    o6 = d$f;
                    if (d$f instanceof d$n) {
                        o6 = d$f;
                        if (nextInt2 > 0) {
                            o6 = new d$m(n3, n4);
                        }
                    }
                }
                list2.add(o6);
            }
        }
        else if (c == 'l') {
            final g o7 = yl.a.o1(new i(0, array.length - 2), 2);
            final ArrayList list3 = new ArrayList<Object>(m.P0((Iterable)o7, 10));
            final h g3 = o7.g();
            while (true) {
                x = list3;
                if (!g3.h) {
                    break;
                }
                final int nextInt3 = ((v)g3).nextInt();
                final float[] o8 = j.o1(nextInt3, nextInt3 + 2, array);
                final float n5 = o8[0];
                final float n6 = o8[1];
                final d$m d$m = new d$m(n5, n6);
                Object o9;
                if (d$m instanceof d$f && nextInt3 > 0) {
                    o9 = new d$e(n5, n6);
                }
                else {
                    o9 = d$m;
                    if (d$m instanceof d$n) {
                        o9 = d$m;
                        if (nextInt3 > 0) {
                            o9 = new d$m(n5, n6);
                        }
                    }
                }
                list3.add(o9);
            }
        }
        else if (c == 'L') {
            final g o10 = yl.a.o1(new i(0, array.length - 2), 2);
            final ArrayList list4 = new ArrayList<Object>(m.P0((Iterable)o10, 10));
            final h g4 = o10.g();
            while (true) {
                x = list4;
                if (!g4.h) {
                    break;
                }
                final int nextInt4 = ((v)g4).nextInt();
                final float[] o11 = j.o1(nextInt4, nextInt4 + 2, array);
                final float n7 = o11[0];
                final float n8 = o11[1];
                final d$e d$e = new d$e(n7, n8);
                Object o12;
                if (d$e instanceof d$f && nextInt4 > 0) {
                    o12 = new d$e(n7, n8);
                }
                else {
                    o12 = d$e;
                    if (d$e instanceof d$n) {
                        o12 = d$e;
                        if (nextInt4 > 0) {
                            o12 = new d$m(n7, n8);
                        }
                    }
                }
                list4.add(o12);
            }
        }
        else if (c == 'h') {
            final g o13 = yl.a.o1(new i(0, array.length - 1), 1);
            final ArrayList list5 = new ArrayList<Object>(m.P0((Iterable)o13, 10));
            final h g5 = o13.g();
            while (true) {
                x = list5;
                if (!g5.h) {
                    break;
                }
                final int nextInt5 = ((v)g5).nextInt();
                final float[] o14 = j.o1(nextInt5, nextInt5 + 1, array);
                final float n9 = o14[0];
                final d$l d$l = new d$l(n9);
                Object o15;
                if (d$l instanceof d$f && nextInt5 > 0) {
                    o15 = new d$e(n9, o14[1]);
                }
                else {
                    o15 = d$l;
                    if (d$l instanceof d$n) {
                        o15 = d$l;
                        if (nextInt5 > 0) {
                            o15 = new d$m(n9, o14[1]);
                        }
                    }
                }
                list5.add(o15);
            }
        }
        else if (c == 'H') {
            final g o16 = yl.a.o1(new i(0, array.length - 1), 1);
            final ArrayList list6 = new ArrayList<Object>(m.P0((Iterable)o16, 10));
            final h g6 = o16.g();
            while (true) {
                x = list6;
                if (!g6.h) {
                    break;
                }
                final int nextInt6 = ((v)g6).nextInt();
                final float[] o17 = j.o1(nextInt6, nextInt6 + 1, array);
                final float n10 = o17[0];
                final d$d d$d = new d$d(n10);
                Object o18;
                if (d$d instanceof d$f && nextInt6 > 0) {
                    o18 = new d$e(n10, o17[1]);
                }
                else {
                    o18 = d$d;
                    if (d$d instanceof d$n) {
                        o18 = d$d;
                        if (nextInt6 > 0) {
                            o18 = new d$m(n10, o17[1]);
                        }
                    }
                }
                list6.add(o18);
            }
        }
        else if (c == 'v') {
            final g o19 = yl.a.o1(new i(0, array.length - 1), 1);
            final ArrayList list7 = new ArrayList<Object>(m.P0((Iterable)o19, 10));
            final h g7 = o19.g();
            while (true) {
                x = list7;
                if (!g7.h) {
                    break;
                }
                final int nextInt7 = ((v)g7).nextInt();
                final float[] o20 = j.o1(nextInt7, nextInt7 + 1, array);
                final float n11 = o20[0];
                final d$r d$r = new d$r(n11);
                Object o21;
                if (d$r instanceof d$f && nextInt7 > 0) {
                    o21 = new d$e(n11, o20[1]);
                }
                else {
                    o21 = d$r;
                    if (d$r instanceof d$n) {
                        o21 = d$r;
                        if (nextInt7 > 0) {
                            o21 = new d$m(n11, o20[1]);
                        }
                    }
                }
                list7.add(o21);
            }
        }
        else if (c == 'V') {
            final g o22 = yl.a.o1(new i(0, array.length - 1), 1);
            final ArrayList list8 = new ArrayList<Object>(m.P0((Iterable)o22, 10));
            final h g8 = o22.g();
            while (true) {
                x = list8;
                if (!g8.h) {
                    break;
                }
                final int nextInt8 = ((v)g8).nextInt();
                final float[] o23 = j.o1(nextInt8, nextInt8 + 1, array);
                final float n12 = o23[0];
                final d$s d$s = new d$s(n12);
                Object o24;
                if (d$s instanceof d$f && nextInt8 > 0) {
                    o24 = new d$e(n12, o23[1]);
                }
                else {
                    o24 = d$s;
                    if (d$s instanceof d$n) {
                        o24 = d$s;
                        if (nextInt8 > 0) {
                            o24 = new d$m(n12, o23[1]);
                        }
                    }
                }
                list8.add(o24);
            }
        }
        else if (c == 'c') {
            final g o25 = yl.a.o1(new i(0, array.length - 6), 6);
            final ArrayList list9 = new ArrayList<Object>(m.P0((Iterable)o25, 10));
            final h g9 = o25.g();
            while (true) {
                x = list9;
                if (!g9.h) {
                    break;
                }
                final int nextInt9 = ((v)g9).nextInt();
                final float[] o26 = j.o1(nextInt9, nextInt9 + 6, array);
                final float n13 = o26[0];
                final float n14 = o26[1];
                Object o27 = new d$k(n13, n14, o26[2], o26[3], o26[4], o26[5]);
                if (o27 instanceof d$f && nextInt9 > 0) {
                    o27 = new d$e(n13, n14);
                }
                else if (o27 instanceof d$n && nextInt9 > 0) {
                    o27 = new d$m(n13, n14);
                }
                list9.add(o27);
            }
        }
        else if (c == 'C') {
            final g o28 = yl.a.o1(new i(0, array.length - 6), 6);
            final ArrayList list10 = new ArrayList<Object>(m.P0((Iterable)o28, 10));
            final h g10 = o28.g();
            while (true) {
                x = list10;
                if (!g10.h) {
                    break;
                }
                final int nextInt10 = ((v)g10).nextInt();
                final float[] o29 = j.o1(nextInt10, nextInt10 + 6, array);
                final float n15 = o29[0];
                final float n16 = o29[1];
                final d$c d$c = new d$c(n15, n16, o29[2], o29[3], o29[4], o29[5]);
                Object o30;
                if (d$c instanceof d$f && nextInt10 > 0) {
                    o30 = new d$e(n15, n16);
                }
                else {
                    o30 = d$c;
                    if (d$c instanceof d$n) {
                        o30 = d$c;
                        if (nextInt10 > 0) {
                            o30 = new d$m(n15, n16);
                        }
                    }
                }
                list10.add(o30);
            }
        }
        else if (c == 's') {
            final g o31 = yl.a.o1(new i(0, array.length - 4), 4);
            final ArrayList list11 = new ArrayList<Object>(m.P0((Iterable)o31, 10));
            final h g11 = o31.g();
            while (true) {
                x = list11;
                if (!g11.h) {
                    break;
                }
                final int nextInt11 = ((v)g11).nextInt();
                final float[] o32 = j.o1(nextInt11, nextInt11 + 4, array);
                final float n17 = o32[0];
                final float n18 = o32[1];
                final d$p d$p = new d$p(n17, n18, o32[2], o32[3]);
                Object o33;
                if (d$p instanceof d$f && nextInt11 > 0) {
                    o33 = new d$e(n17, n18);
                }
                else {
                    o33 = d$p;
                    if (d$p instanceof d$n) {
                        o33 = d$p;
                        if (nextInt11 > 0) {
                            o33 = new d$m(n17, n18);
                        }
                    }
                }
                list11.add(o33);
            }
        }
        else if (c == 'S') {
            final g o34 = yl.a.o1(new i(0, array.length - 4), 4);
            final ArrayList list12 = new ArrayList<Object>(m.P0((Iterable)o34, 10));
            final h g12 = o34.g();
            while (true) {
                x = list12;
                if (!g12.h) {
                    break;
                }
                final int nextInt12 = ((v)g12).nextInt();
                final float[] o35 = j.o1(nextInt12, nextInt12 + 4, array);
                final float n19 = o35[0];
                final float n20 = o35[1];
                final d$h d$h = new d$h(n19, n20, o35[2], o35[3]);
                Object o36;
                if (d$h instanceof d$f && nextInt12 > 0) {
                    o36 = new d$e(n19, n20);
                }
                else {
                    o36 = d$h;
                    if (d$h instanceof d$n) {
                        o36 = d$h;
                        if (nextInt12 > 0) {
                            o36 = new d$m(n19, n20);
                        }
                    }
                }
                list12.add(o36);
            }
        }
        else if (c == 'q') {
            final g o37 = yl.a.o1(new i(0, array.length - 4), 4);
            final ArrayList list13 = new ArrayList<Object>(m.P0((Iterable)o37, 10));
            final h g13 = o37.g();
            while (true) {
                x = list13;
                if (!g13.h) {
                    break;
                }
                final int nextInt13 = ((v)g13).nextInt();
                final float[] o38 = j.o1(nextInt13, nextInt13 + 4, array);
                final float n21 = o38[0];
                final float n22 = o38[1];
                final d$o d$o = new d$o(n21, n22, o38[2], o38[3]);
                Object o39;
                if (d$o instanceof d$f && nextInt13 > 0) {
                    o39 = new d$e(n21, n22);
                }
                else {
                    o39 = d$o;
                    if (d$o instanceof d$n) {
                        o39 = d$o;
                        if (nextInt13 > 0) {
                            o39 = new d$m(n21, n22);
                        }
                    }
                }
                list13.add(o39);
            }
        }
        else if (c == 'Q') {
            final g o40 = yl.a.o1(new i(0, array.length - 4), 4);
            final ArrayList list14 = new ArrayList<Object>(m.P0((Iterable)o40, 10));
            final h g14 = o40.g();
            while (true) {
                x = list14;
                if (!g14.h) {
                    break;
                }
                final int nextInt14 = ((v)g14).nextInt();
                final float[] o41 = j.o1(nextInt14, nextInt14 + 4, array);
                final float n23 = o41[0];
                final float n24 = o41[1];
                final d$g d$g = new d$g(n23, n24, o41[2], o41[3]);
                Object o42;
                if (d$g instanceof d$f && nextInt14 > 0) {
                    o42 = new d$e(n23, n24);
                }
                else {
                    o42 = d$g;
                    if (d$g instanceof d$n) {
                        o42 = d$g;
                        if (nextInt14 > 0) {
                            o42 = new d$m(n23, n24);
                        }
                    }
                }
                list14.add(o42);
            }
        }
        else if (c == 't') {
            final g o43 = yl.a.o1(new i(0, array.length - 2), 2);
            final ArrayList list15 = new ArrayList<Object>(m.P0((Iterable)o43, 10));
            final h g15 = o43.g();
            while (true) {
                x = list15;
                if (!g15.h) {
                    break;
                }
                final int nextInt15 = ((v)g15).nextInt();
                final float[] o44 = j.o1(nextInt15, nextInt15 + 2, array);
                final float n25 = o44[0];
                final float n26 = o44[1];
                final d$q d$q = new d$q(n25, n26);
                Object o45;
                if (d$q instanceof d$f && nextInt15 > 0) {
                    o45 = new d$e(n25, n26);
                }
                else {
                    o45 = d$q;
                    if (d$q instanceof d$n) {
                        o45 = d$q;
                        if (nextInt15 > 0) {
                            o45 = new d$m(n25, n26);
                        }
                    }
                }
                list15.add(o45);
            }
        }
        else if (c == 'T') {
            final g o46 = yl.a.o1(new i(0, array.length - 2), 2);
            final ArrayList list16 = new ArrayList<Object>(m.P0((Iterable)o46, 10));
            final h g16 = o46.g();
            while (true) {
                x = list16;
                if (!g16.h) {
                    break;
                }
                final int nextInt16 = ((v)g16).nextInt();
                final float[] o47 = j.o1(nextInt16, nextInt16 + 2, array);
                final float n27 = o47[0];
                final float n28 = o47[1];
                final d$i d$i = new d$i(n27, n28);
                Object o48;
                if (d$i instanceof d$f && nextInt16 > 0) {
                    o48 = new d$e(n27, n28);
                }
                else {
                    o48 = d$i;
                    if (d$i instanceof d$n) {
                        o48 = d$i;
                        if (nextInt16 > 0) {
                            o48 = new d$m(n27, n28);
                        }
                    }
                }
                list16.add(o48);
            }
        }
        else if (c == 'a') {
            final g o49 = yl.a.o1(new i(0, array.length - 7), 7);
            final ArrayList list17 = new ArrayList<Object>(m.P0((Iterable)o49, 10));
            final h g17 = o49.g();
            while (true) {
                x = list17;
                if (!g17.h) {
                    break;
                }
                final int nextInt17 = ((v)g17).nextInt();
                final float[] o50 = j.o1(nextInt17, nextInt17 + 7, array);
                Object o51 = new d$j(o50[0], o50[1], o50[2], Float.compare(o50[3], 0.0f) != 0, Float.compare(o50[4], 0.0f) != 0, o50[5], o50[6]);
                if (o51 instanceof d$f && nextInt17 > 0) {
                    o51 = new d$e(o50[0], o50[1]);
                }
                else if (o51 instanceof d$n && nextInt17 > 0) {
                    o51 = new d$m(o50[0], o50[1]);
                }
                list17.add(o51);
            }
        }
        else {
            if (c != 'A') {
                throw new IllegalArgumentException(b.g("Unknown command for: ", c));
            }
            final g o52 = yl.a.o1(new i(0, array.length - 7), 7);
            final ArrayList list18 = new ArrayList<Object>(m.P0((Iterable)o52, 10));
            final h g18 = o52.g();
            while (true) {
                x = list18;
                if (!g18.h) {
                    break;
                }
                final int nextInt18 = ((v)g18).nextInt();
                final float[] o53 = j.o1(nextInt18, nextInt18 + 7, array);
                Object o54 = new d$a(o53[0], o53[1], o53[2], Float.compare(o53[3], 0.0f) != 0, Float.compare(o53[4], 0.0f) != 0, o53[5], o53[6]);
                if (o54 instanceof d$f && nextInt18 > 0) {
                    o54 = new d$e(o53[0], o53[1]);
                }
                else if (o54 instanceof d$n && nextInt18 > 0) {
                    o54 = new d$m(o53[0], o53[1]);
                }
                list18.add(o54);
            }
        }
        a.addAll(x);
    }
    
    public final void c(final b0 b0) {
        f.f((Object)b0, "target");
        b0.reset();
        this.b.a();
        this.c.a();
        this.d.a();
        this.e.a();
        final ArrayList a = this.a;
        final int size = a.size();
        Object o = null;
        e e = this;
        d d;
        for (int i = 0; i < size; ++i, o = d) {
            d = (d)a.get(i);
            d d2;
            if ((d2 = (d)o) == null) {
                d2 = d;
            }
            if (d instanceof d$b) {
                final b b2 = e.b;
                final b d3 = e.d;
                b2.a = d3.a;
                b2.b = d3.b;
                final b c = e.c;
                c.a = d3.a;
                c.b = d3.b;
                b0.close();
                final b b3 = e.b;
                b0.a(b3.a, b3.b);
            }
            else if (d instanceof d$n) {
                final d$n d$n = (d$n)d;
                final b b4 = e.b;
                final float a2 = b4.a;
                final float c2 = d$n.c;
                b4.a = a2 + c2;
                final float b5 = b4.b;
                final float d4 = d$n.d;
                b4.b = b5 + d4;
                b0.d(c2, d4);
                final b d5 = e.d;
                final b b6 = e.b;
                d5.a = b6.a;
                d5.b = b6.b;
            }
            else if (d instanceof d$f) {
                final d$f d$f = (d$f)d;
                final b b7 = e.b;
                b0.a(b7.a = d$f.c, b7.b = d$f.d);
                final b d6 = e.d;
                final b b8 = e.b;
                d6.a = b8.a;
                d6.b = b8.b;
            }
            else if (d instanceof d$m) {
                final d$m d$m = (d$m)d;
                b0.m(d$m.c, d$m.d);
                final b b9 = e.b;
                b9.a += d$m.c;
                b9.b += d$m.d;
            }
            else if (d instanceof d$e) {
                final d$e d$e = (d$e)d;
                b0.b(d$e.c, d$e.d);
                final b b10 = e.b;
                b10.a = d$e.c;
                b10.b = d$e.d;
            }
            else if (d instanceof d$l) {
                final d$l d$l = (d$l)d;
                b0.m(d$l.c, 0.0f);
                final b b11 = e.b;
                b11.a += d$l.c;
            }
            else if (d instanceof d$d) {
                final d$d d$d = (d$d)d;
                b0.b(d$d.c, e.b.b);
                e.b.a = d$d.c;
            }
            else if (d instanceof d$r) {
                final d$r d$r = (d$r)d;
                b0.m(0.0f, d$r.c);
                final b b12 = e.b;
                b12.b += d$r.c;
            }
            else if (d instanceof d$s) {
                final d$s d$s = (d$s)d;
                b0.b(e.b.a, d$s.c);
                e.b.b = d$s.c;
            }
            else if (d instanceof d$k) {
                final d$k d$k = (d$k)d;
                b0.e(d$k.c, d$k.d, d$k.e, d$k.f, d$k.g, d$k.h);
                final b c3 = e.c;
                final b b13 = e.b;
                c3.a = b13.a + d$k.e;
                c3.b = b13.b + d$k.f;
                b13.a += d$k.g;
                b13.b += d$k.h;
            }
            else if (d instanceof d$c) {
                final d$c d$c = (d$c)d;
                b0.c(d$c.c, d$c.d, d$c.e, d$c.f, d$c.g, d$c.h);
                final b c4 = e.c;
                c4.a = d$c.e;
                c4.b = d$c.f;
                final b b14 = e.b;
                b14.a = d$c.g;
                b14.b = d$c.h;
            }
            else if (d instanceof d$p) {
                final d$p d$p = (d$p)d;
                f.c((Object)d2);
                if (d2.a) {
                    final b e2 = e.e;
                    final b b15 = e.b;
                    final float a3 = b15.a;
                    final b c5 = e.c;
                    e2.a = a3 - c5.a;
                    e2.b = b15.b - c5.b;
                }
                else {
                    e.e.a();
                }
                final b e3 = e.e;
                b0.e(e3.a, e3.b, d$p.c, d$p.d, d$p.e, d$p.f);
                final b c6 = e.c;
                final b b16 = e.b;
                c6.a = b16.a + d$p.c;
                c6.b = b16.b + d$p.d;
                b16.a += d$p.e;
                b16.b += d$p.f;
            }
            else if (d instanceof d$h) {
                final d$h d$h = (d$h)d;
                f.c((Object)d2);
                if (d2.a) {
                    final b e4 = e.e;
                    final float n = 2;
                    final b b17 = e.b;
                    final float a4 = b17.a;
                    final b c7 = e.c;
                    e4.a = a4 * n - c7.a;
                    e4.b = n * b17.b - c7.b;
                }
                else {
                    final b e5 = e.e;
                    final b b18 = e.b;
                    e5.a = b18.a;
                    e5.b = b18.b;
                }
                final b e6 = e.e;
                b0.c(e6.a, e6.b, d$h.c, d$h.d, d$h.e, d$h.f);
                final b c8 = e.c;
                c8.a = d$h.c;
                c8.b = d$h.d;
                final b b19 = e.b;
                b19.a = d$h.e;
                b19.b = d$h.f;
            }
            else if (d instanceof d$o) {
                final d$o d$o = (d$o)d;
                b0.f(d$o.c, d$o.d, d$o.e, d$o.f);
                final b c9 = e.c;
                final b b20 = e.b;
                c9.a = b20.a + d$o.c;
                c9.b = b20.b + d$o.d;
                b20.a += d$o.e;
                b20.b += d$o.f;
            }
            else if (d instanceof d$g) {
                final d$g d$g = (d$g)d;
                b0.l(d$g.c, d$g.d, d$g.e, d$g.f);
                final b c10 = e.c;
                c10.a = d$g.c;
                c10.b = d$g.d;
                final b b21 = e.b;
                b21.a = d$g.e;
                b21.b = d$g.f;
            }
            else if (d instanceof d$q) {
                final d$q d$q = (d$q)d;
                f.c((Object)d2);
                if (d2.b) {
                    final b e7 = e.e;
                    final b b22 = e.b;
                    final float a5 = b22.a;
                    final b c11 = e.c;
                    e7.a = a5 - c11.a;
                    e7.b = b22.b - c11.b;
                }
                else {
                    e.e.a();
                }
                final b e8 = e.e;
                b0.f(e8.a, e8.b, d$q.c, d$q.d);
                final b c12 = e.c;
                final b b23 = e.b;
                final float a6 = b23.a;
                final b e9 = e.e;
                c12.a = a6 + e9.a;
                c12.b = b23.b + e9.b;
                b23.a += d$q.c;
                b23.b += d$q.d;
            }
            else if (d instanceof d$i) {
                final d$i d$i = (d$i)d;
                f.c((Object)d2);
                if (d2.b) {
                    final b e10 = e.e;
                    final float n2 = 2;
                    final b b24 = e.b;
                    final float a7 = b24.a;
                    final b c13 = e.c;
                    e10.a = a7 * n2 - c13.a;
                    e10.b = n2 * b24.b - c13.b;
                }
                else {
                    final b e11 = e.e;
                    final b b25 = e.b;
                    e11.a = b25.a;
                    e11.b = b25.b;
                }
                final b e12 = e.e;
                b0.l(e12.a, e12.b, d$i.c, d$i.d);
                final b c14 = e.c;
                final b e13 = e.e;
                c14.a = e13.a;
                c14.b = e13.b;
                final b b26 = e.b;
                b26.a = d$i.c;
                b26.b = d$i.d;
            }
            else {
                if (d instanceof d$j) {
                    final d$j d$j = (d$j)d;
                    final float h = d$j.h;
                    final b b27 = e.b;
                    final float a8 = b27.a;
                    final float n3 = h + a8;
                    final float j = d$j.i;
                    final float b28 = b27.b;
                    final float n4 = j + b28;
                    b(b0, a8, b28, n3, n4, d$j.c, d$j.d, d$j.e, d$j.f, d$j.g);
                    final b b29 = this.b;
                    b29.a = n3;
                    b29.b = n4;
                    final b c15 = this.c;
                    c15.a = n3;
                    c15.b = n4;
                }
                else {
                    if (!(d instanceof d$a)) {
                        continue;
                    }
                    final d$a d$a = (d$a)d;
                    final b b30 = e.b;
                    b(b0, b30.a, b30.b, d$a.h, d$a.i, d$a.c, d$a.d, d$a.e, d$a.f, d$a.g);
                    final b b31 = this.b;
                    final float h2 = d$a.h;
                    b31.a = h2;
                    final float k = d$a.i;
                    b31.b = k;
                    final b c16 = this.c;
                    c16.a = h2;
                    c16.b = k;
                }
                e = this;
            }
        }
    }
    
    public static final class a
    {
        public int a;
        public boolean b;
        
        public a() {
            this(0);
        }
        
        public a(final int n) {
            this.a = 0;
            this.b = false;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = Integer.hashCode(this.a);
            int b;
            if ((b = (this.b ? 1 : 0)) != 0) {
                b = 1;
            }
            return hashCode * 31 + b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("ExtractFloatResult(endPosition=");
            k.append(this.a);
            k.append(", endWithNegativeOrDot=");
            return s0.o(k, this.b, ')');
        }
    }
    
    public static final class b
    {
        public float a;
        public float b;
        
        public b() {
            this(0);
        }
        
        public b(final int n) {
            this.a = 0.0f;
            this.b = 0.0f;
        }
        
        public final void a() {
            this.a = 0.0f;
            this.b = 0.0f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return f.a((Object)this.a, (Object)b.a) && f.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("PathPoint(x=");
            k.append(this.a);
            k.append(", y=");
            return androidx.viewpager.widget.c.j(k, this.b, ')');
        }
    }
}
