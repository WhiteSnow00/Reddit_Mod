// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import dg2.w;
import tg2.h;
import tg2.g;
import java.util.List;
import java.util.Collection;
import aq2.a;
import dg2.j;
import dg2.m;
import zd.b;
import tg2.i;
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
    
    public static void b(final b0 b0, double n, double n2, double n3, double n4, final double n5, double n6, double sin, final boolean b2, final boolean b3) {
        final double n7 = sin / 180 * 3.141592653589793;
        final double cos = Math.cos(n7);
        final double sin2 = Math.sin(n7);
        final double n8 = (n2 * sin2 + n * cos) / n5;
        final double n9 = (n2 * cos + -n * sin2) / n6;
        final double n10 = (n4 * sin2 + n3 * cos) / n5;
        final double n11 = (n4 * cos + -n3 * sin2) / n6;
        final double n12 = n8 - n10;
        final double n13 = n9 - n11;
        final double n14 = 2;
        final double n15 = (n8 + n10) / n14;
        final double n16 = (n9 + n11) / n14;
        final double n17 = n13 * n13 + n12 * n12;
        if (n17 == 0.0) {
            return;
        }
        final double n18 = 1.0 / n17 - 0.25;
        if (n18 < 0.0) {
            final double n19 = (float)(Math.sqrt(n17) / 1.99999);
            b(b0, n, n2, n3, n4, n5 * n19, n6 * n19, sin, b2, b3);
            return;
        }
        n4 = Math.sqrt(n18);
        n3 = n12 * n4;
        n4 *= n13;
        if (b2 == b3) {
            sin = n15 - n4;
            n4 = n16 + n3;
        }
        else {
            sin = n15 + n4;
            n4 = n16 - n3;
        }
        double atan2 = Math.atan2(n9 - n4, n8 - sin);
        final double n20 = Math.atan2(n11 - n4, n10 - sin) - atan2;
        final double n21 = dcmpl(n20, 0.0);
        final boolean b4 = n21 >= 0;
        n3 = n20;
        if (b3 != b4) {
            if (n21 > 0) {
                n3 = n20 - 6.283185307179586;
            }
            else {
                n3 = n20 + 6.283185307179586;
            }
        }
        final double n22 = sin * n5;
        final double n23 = n4 * n6;
        final double n24 = 4;
        final int n25 = (int)Math.ceil(Math.abs(n3 * n24 / 3.141592653589793));
        final double cos2 = Math.cos(n7);
        final double sin3 = Math.sin(n7);
        n4 = Math.cos(atan2);
        sin = Math.sin(atan2);
        final double n26 = -n5;
        final double n27 = n26 * cos2;
        final double n28 = n6 * sin3;
        final double n29 = n26 * sin3;
        final double n30 = n6 * cos2;
        final double n31 = n3 / n25;
        n3 = n4 * n30 + sin * n29;
        sin = n27 * sin - n28 * n4;
        int i = 0;
        double n32 = n2;
        n4 = n;
        n = sin3;
        n6 = n29;
        n2 = n31;
        while (i < n25) {
            final double n33 = atan2 + n2;
            final double sin4 = Math.sin(n33);
            final double cos3 = Math.cos(n33);
            final double n34 = n5 * cos2 * cos3 + (n22 * cos - n23 * sin2) - n28 * sin4;
            final double n35 = n30 * sin4 + (n5 * n * cos3 + (n23 * cos + n22 * sin2));
            final double n36 = n27 * sin4 - n28 * cos3;
            final double n37 = cos3 * n30 + sin4 * n6;
            final double n38 = n33 - atan2;
            final double tan = Math.tan(n38 / n14);
            final double n39 = (Math.sqrt(3.0 * tan * tan + n24) - 1) * Math.sin(n38) / 3;
            b0.c((float)(sin * n39 + n4), (float)(n3 * n39 + n32), (float)(n34 - n39 * n36), (float)(n35 - n39 * n37), (float)n34, (float)n35);
            ++i;
            n4 = n34;
            n32 = n35;
            atan2 = n33;
            n3 = n37;
            sin = n36;
        }
    }
    
    public final void a(final char c, final float[] array) {
        final ArrayList a = this.a;
        boolean b = false;
        Label_0030: {
            if (c != 'z') {
                if (c != 'Z') {
                    b = false;
                    break Label_0030;
                }
            }
            b = true;
        }
        List l3;
        if (b) {
            l3 = cg.d.l3((Object)s1.d.b.c);
        }
        else {
            ArrayList list2;
            if (c == 'm') {
                final g f1 = zd.b.f1(new i(0, array.length - 2), 2);
                final ArrayList list = new ArrayList<d>(m.u4((Iterable)f1, 10));
                final h f2 = f1.f();
                while (true) {
                    list2 = list;
                    if (!f2.h) {
                        break;
                    }
                    final int nextInt = ((w)f2).nextInt();
                    final float[] t1 = j.T1(nextInt, nextInt + 2, array);
                    final float n = t1[0];
                    final float n2 = t1[1];
                    d d = new d.n(n, n2);
                    if (d instanceof d.f && nextInt > 0) {
                        d = new d.e(n, n2);
                    }
                    else if (nextInt > 0) {
                        d = new d.m(n, n2);
                    }
                    list.add((Object)d);
                }
            }
            else if (c == 'M') {
                final g f3 = zd.b.f1(new i(0, array.length - 2), 2);
                final ArrayList list3 = new ArrayList<d>(m.u4((Iterable)f3, 10));
                final h f4 = f3.f();
                while (true) {
                    list2 = list3;
                    if (!f4.h) {
                        break;
                    }
                    final int nextInt2 = ((w)f4).nextInt();
                    final float[] t2 = j.T1(nextInt2, nextInt2 + 2, array);
                    final float n3 = t2[0];
                    final float n4 = t2[1];
                    final d.f f5 = new d.f(n3, n4);
                    d d2;
                    if (nextInt2 > 0) {
                        d2 = new d.e(n3, n4);
                    }
                    else {
                        d2 = f5;
                        if (f5 instanceof d.n) {
                            d2 = f5;
                            if (nextInt2 > 0) {
                                d2 = new d.m(n3, n4);
                            }
                        }
                    }
                    list3.add((Object)d2);
                }
            }
            else if (c == 'l') {
                final g f6 = zd.b.f1(new i(0, array.length - 2), 2);
                final ArrayList list4 = new ArrayList<d>(m.u4((Iterable)f6, 10));
                final h f7 = f6.f();
                while (true) {
                    list2 = list4;
                    if (!f7.h) {
                        break;
                    }
                    final int nextInt3 = ((w)f7).nextInt();
                    final float[] t3 = j.T1(nextInt3, nextInt3 + 2, array);
                    final float n5 = t3[0];
                    final float n6 = t3[1];
                    final d.m m = new d.m(n5, n6);
                    d d3;
                    if (m instanceof d.f && nextInt3 > 0) {
                        d3 = new d.e(n5, n6);
                    }
                    else {
                        d3 = m;
                        if (m instanceof d.n) {
                            d3 = m;
                            if (nextInt3 > 0) {
                                d3 = new d.m(n5, n6);
                            }
                        }
                    }
                    list4.add((Object)d3);
                }
            }
            else if (c == 'L') {
                final g f8 = zd.b.f1(new i(0, array.length - 2), 2);
                final ArrayList list5 = new ArrayList<d>(m.u4((Iterable)f8, 10));
                final h f9 = f8.f();
                while (true) {
                    list2 = list5;
                    if (!f9.h) {
                        break;
                    }
                    final int nextInt4 = ((w)f9).nextInt();
                    final float[] t4 = j.T1(nextInt4, nextInt4 + 2, array);
                    final float n7 = t4[0];
                    final float n8 = t4[1];
                    final d.e e = new d.e(n7, n8);
                    d d4;
                    if (e instanceof d.f && nextInt4 > 0) {
                        d4 = new d.e(n7, n8);
                    }
                    else {
                        d4 = e;
                        if (e instanceof d.n) {
                            d4 = e;
                            if (nextInt4 > 0) {
                                d4 = new d.m(n7, n8);
                            }
                        }
                    }
                    list5.add((Object)d4);
                }
            }
            else if (c == 'h') {
                final g f10 = zd.b.f1(new i(0, array.length - 1), 1);
                final ArrayList list6 = new ArrayList<d>(m.u4((Iterable)f10, 10));
                final h f11 = f10.f();
                while (true) {
                    list2 = list6;
                    if (!f11.h) {
                        break;
                    }
                    final int nextInt5 = ((w)f11).nextInt();
                    final float[] t5 = j.T1(nextInt5, nextInt5 + 1, array);
                    final float n9 = t5[0];
                    final d.l i = new d.l(n9);
                    d d5;
                    if (i instanceof d.f && nextInt5 > 0) {
                        d5 = new d.e(n9, t5[1]);
                    }
                    else {
                        d5 = i;
                        if (i instanceof d.n) {
                            d5 = i;
                            if (nextInt5 > 0) {
                                d5 = new d.m(n9, t5[1]);
                            }
                        }
                    }
                    list6.add((Object)d5);
                }
            }
            else if (c == 'H') {
                final g f12 = zd.b.f1(new i(0, array.length - 1), 1);
                final ArrayList list7 = new ArrayList<d>(m.u4((Iterable)f12, 10));
                final h f13 = f12.f();
                while (true) {
                    list2 = list7;
                    if (!f13.h) {
                        break;
                    }
                    final int nextInt6 = ((w)f13).nextInt();
                    final float[] t6 = j.T1(nextInt6, nextInt6 + 1, array);
                    final float n10 = t6[0];
                    final d.d d6 = new d.d(n10);
                    d d7;
                    if (d6 instanceof d.f && nextInt6 > 0) {
                        d7 = new d.e(n10, t6[1]);
                    }
                    else {
                        d7 = d6;
                        if (d6 instanceof d.n) {
                            d7 = d6;
                            if (nextInt6 > 0) {
                                d7 = new d.m(n10, t6[1]);
                            }
                        }
                    }
                    list7.add((Object)d7);
                }
            }
            else if (c == 'v') {
                final g f14 = zd.b.f1(new i(0, array.length - 1), 1);
                final ArrayList list8 = new ArrayList<d>(m.u4((Iterable)f14, 10));
                final h f15 = f14.f();
                while (true) {
                    list2 = list8;
                    if (!f15.h) {
                        break;
                    }
                    final int nextInt7 = ((w)f15).nextInt();
                    final float[] t7 = j.T1(nextInt7, nextInt7 + 1, array);
                    final float n11 = t7[0];
                    final d.r r = new d.r(n11);
                    d d8;
                    if (r instanceof d.f && nextInt7 > 0) {
                        d8 = new d.e(n11, t7[1]);
                    }
                    else {
                        d8 = r;
                        if (r instanceof d.n) {
                            d8 = r;
                            if (nextInt7 > 0) {
                                d8 = new d.m(n11, t7[1]);
                            }
                        }
                    }
                    list8.add((Object)d8);
                }
            }
            else if (c == 'V') {
                final g f16 = zd.b.f1(new i(0, array.length - 1), 1);
                final ArrayList list9 = new ArrayList<d>(m.u4((Iterable)f16, 10));
                final h f17 = f16.f();
                while (true) {
                    list2 = list9;
                    if (!f17.h) {
                        break;
                    }
                    final int nextInt8 = ((w)f17).nextInt();
                    final float[] t8 = j.T1(nextInt8, nextInt8 + 1, array);
                    final float n12 = t8[0];
                    final d.s s = new d.s(n12);
                    d d9;
                    if (s instanceof d.f && nextInt8 > 0) {
                        d9 = new d.e(n12, t8[1]);
                    }
                    else {
                        d9 = s;
                        if (s instanceof d.n) {
                            d9 = s;
                            if (nextInt8 > 0) {
                                d9 = new d.m(n12, t8[1]);
                            }
                        }
                    }
                    list9.add((Object)d9);
                }
            }
            else if (c == 'c') {
                final g f18 = zd.b.f1(new i(0, array.length - 6), 6);
                final ArrayList list10 = new ArrayList<d>(m.u4((Iterable)f18, 10));
                final h f19 = f18.f();
                while (true) {
                    list2 = list10;
                    if (!f19.h) {
                        break;
                    }
                    final int nextInt9 = ((w)f19).nextInt();
                    final float[] t9 = j.T1(nextInt9, nextInt9 + 6, array);
                    final float n13 = t9[0];
                    final float n14 = t9[1];
                    d d10 = new d.k(n13, n14, t9[2], t9[3], t9[4], t9[5]);
                    if (d10 instanceof d.f && nextInt9 > 0) {
                        d10 = new d.e(n13, n14);
                    }
                    else if (d10 instanceof d.n && nextInt9 > 0) {
                        d10 = new d.m(n13, n14);
                    }
                    list10.add((Object)d10);
                }
            }
            else if (c == 'C') {
                final g f20 = zd.b.f1(new i(0, array.length - 6), 6);
                final ArrayList list11 = new ArrayList<d>(m.u4((Iterable)f20, 10));
                final h f21 = f20.f();
                while (true) {
                    list2 = list11;
                    if (!f21.h) {
                        break;
                    }
                    final int nextInt10 = ((w)f21).nextInt();
                    final float[] t10 = j.T1(nextInt10, nextInt10 + 6, array);
                    final float n15 = t10[0];
                    final float n16 = t10[1];
                    final d.c c2 = new d.c(n15, n16, t10[2], t10[3], t10[4], t10[5]);
                    d d11;
                    if (c2 instanceof d.f && nextInt10 > 0) {
                        d11 = new d.e(n15, n16);
                    }
                    else {
                        d11 = c2;
                        if (c2 instanceof d.n) {
                            d11 = c2;
                            if (nextInt10 > 0) {
                                d11 = new d.m(n15, n16);
                            }
                        }
                    }
                    list11.add((Object)d11);
                }
            }
            else if (c == 's') {
                final g f22 = zd.b.f1(new i(0, array.length - 4), 4);
                final ArrayList list12 = new ArrayList<d>(m.u4((Iterable)f22, 10));
                final h f23 = f22.f();
                while (true) {
                    list2 = list12;
                    if (!f23.h) {
                        break;
                    }
                    final int nextInt11 = ((w)f23).nextInt();
                    final float[] t11 = j.T1(nextInt11, nextInt11 + 4, array);
                    final float n17 = t11[0];
                    final float n18 = t11[1];
                    final d.p p2 = new d.p(n17, n18, t11[2], t11[3]);
                    d d12;
                    if (p2 instanceof d.f && nextInt11 > 0) {
                        d12 = new d.e(n17, n18);
                    }
                    else {
                        d12 = p2;
                        if (p2 instanceof d.n) {
                            d12 = p2;
                            if (nextInt11 > 0) {
                                d12 = new d.m(n17, n18);
                            }
                        }
                    }
                    list12.add((Object)d12);
                }
            }
            else if (c == 'S') {
                final g f24 = zd.b.f1(new i(0, array.length - 4), 4);
                final ArrayList list13 = new ArrayList<d>(m.u4((Iterable)f24, 10));
                final h f25 = f24.f();
                while (true) {
                    list2 = list13;
                    if (!f25.h) {
                        break;
                    }
                    final int nextInt12 = ((w)f25).nextInt();
                    final float[] t12 = j.T1(nextInt12, nextInt12 + 4, array);
                    final float n19 = t12[0];
                    final float n20 = t12[1];
                    final d.h h = new d.h(n19, n20, t12[2], t12[3]);
                    d d13;
                    if (h instanceof d.f && nextInt12 > 0) {
                        d13 = new d.e(n19, n20);
                    }
                    else {
                        d13 = h;
                        if (h instanceof d.n) {
                            d13 = h;
                            if (nextInt12 > 0) {
                                d13 = new d.m(n19, n20);
                            }
                        }
                    }
                    list13.add((Object)d13);
                }
            }
            else if (c == 'q') {
                final g f26 = zd.b.f1(new i(0, array.length - 4), 4);
                final ArrayList list14 = new ArrayList<d>(m.u4((Iterable)f26, 10));
                final h f27 = f26.f();
                while (true) {
                    list2 = list14;
                    if (!f27.h) {
                        break;
                    }
                    final int nextInt13 = ((w)f27).nextInt();
                    final float[] t13 = j.T1(nextInt13, nextInt13 + 4, array);
                    final float n21 = t13[0];
                    final float n22 = t13[1];
                    final d.o o = new d.o(n21, n22, t13[2], t13[3]);
                    d d14;
                    if (o instanceof d.f && nextInt13 > 0) {
                        d14 = new d.e(n21, n22);
                    }
                    else {
                        d14 = o;
                        if (o instanceof d.n) {
                            d14 = o;
                            if (nextInt13 > 0) {
                                d14 = new d.m(n21, n22);
                            }
                        }
                    }
                    list14.add((Object)d14);
                }
            }
            else if (c == 'Q') {
                final g f28 = zd.b.f1(new i(0, array.length - 4), 4);
                final ArrayList list15 = new ArrayList<d>(m.u4((Iterable)f28, 10));
                final h f29 = f28.f();
                while (true) {
                    list2 = list15;
                    if (!f29.h) {
                        break;
                    }
                    final int nextInt14 = ((w)f29).nextInt();
                    final float[] t14 = j.T1(nextInt14, nextInt14 + 4, array);
                    final float n23 = t14[0];
                    final float n24 = t14[1];
                    final d.g g = new d.g(n23, n24, t14[2], t14[3]);
                    d d15;
                    if (g instanceof d.f && nextInt14 > 0) {
                        d15 = new d.e(n23, n24);
                    }
                    else {
                        d15 = g;
                        if (g instanceof d.n) {
                            d15 = g;
                            if (nextInt14 > 0) {
                                d15 = new d.m(n23, n24);
                            }
                        }
                    }
                    list15.add((Object)d15);
                }
            }
            else if (c == 't') {
                final g f30 = zd.b.f1(new i(0, array.length - 2), 2);
                final ArrayList list16 = new ArrayList<d>(m.u4((Iterable)f30, 10));
                final h f31 = f30.f();
                while (true) {
                    list2 = list16;
                    if (!f31.h) {
                        break;
                    }
                    final int nextInt15 = ((w)f31).nextInt();
                    final float[] t15 = j.T1(nextInt15, nextInt15 + 2, array);
                    final float n25 = t15[0];
                    final float n26 = t15[1];
                    final d.q q = new d.q(n25, n26);
                    d d16;
                    if (q instanceof d.f && nextInt15 > 0) {
                        d16 = new d.e(n25, n26);
                    }
                    else {
                        d16 = q;
                        if (q instanceof d.n) {
                            d16 = q;
                            if (nextInt15 > 0) {
                                d16 = new d.m(n25, n26);
                            }
                        }
                    }
                    list16.add((Object)d16);
                }
            }
            else if (c == 'T') {
                final g f32 = zd.b.f1(new i(0, array.length - 2), 2);
                final ArrayList list17 = new ArrayList<d>(m.u4((Iterable)f32, 10));
                final h f33 = f32.f();
                while (true) {
                    list2 = list17;
                    if (!f33.h) {
                        break;
                    }
                    final int nextInt16 = ((w)f33).nextInt();
                    final float[] t16 = j.T1(nextInt16, nextInt16 + 2, array);
                    final float n27 = t16[0];
                    final float n28 = t16[1];
                    final d.i j = new d.i(n27, n28);
                    d d17;
                    if (j instanceof d.f && nextInt16 > 0) {
                        d17 = new d.e(n27, n28);
                    }
                    else {
                        d17 = j;
                        if (j instanceof d.n) {
                            d17 = j;
                            if (nextInt16 > 0) {
                                d17 = new d.m(n27, n28);
                            }
                        }
                    }
                    list17.add((Object)d17);
                }
            }
            else if (c == 'a') {
                final g f34 = zd.b.f1(new i(0, array.length - 7), 7);
                final ArrayList list18 = new ArrayList<d>(m.u4((Iterable)f34, 10));
                final h f35 = f34.f();
                while (true) {
                    list2 = list18;
                    if (!f35.h) {
                        break;
                    }
                    final int nextInt17 = ((w)f35).nextInt();
                    final float[] t17 = j.T1(nextInt17, nextInt17 + 7, array);
                    d d18 = new d.j(t17[0], t17[1], t17[2], Float.compare(t17[3], 0.0f) != 0, Float.compare(t17[4], 0.0f) != 0, t17[5], t17[6]);
                    if (d18 instanceof d.f && nextInt17 > 0) {
                        d18 = new d.e(t17[0], t17[1]);
                    }
                    else if (d18 instanceof d.n && nextInt17 > 0) {
                        d18 = new d.m(t17[0], t17[1]);
                    }
                    list18.add((Object)d18);
                }
            }
            else {
                if (c != 'A') {
                    throw new IllegalArgumentException(aq2.a.k("Unknown command for: ", c));
                }
                final g f36 = zd.b.f1(new i(0, array.length - 7), 7);
                final ArrayList list19 = new ArrayList<d>(m.u4((Iterable)f36, 10));
                final h f37 = f36.f();
                while (true) {
                    list2 = list19;
                    if (!f37.h) {
                        break;
                    }
                    final int nextInt18 = ((w)f37).nextInt();
                    final float[] t18 = j.T1(nextInt18, nextInt18 + 7, array);
                    d d19 = new d.a(t18[0], t18[1], t18[2], Float.compare(t18[3], 0.0f) != 0, Float.compare(t18[4], 0.0f) != 0, t18[5], t18[6]);
                    if (d19 instanceof d.f && nextInt18 > 0) {
                        d19 = new d.e(t18[0], t18[1]);
                    }
                    else if (d19 instanceof d.n && nextInt18 > 0) {
                        d19 = new d.m(t18[0], t18[1]);
                    }
                    list19.add((Object)d19);
                }
            }
            l3 = list2;
        }
        a.addAll(l3);
    }
    
    public final void c(final b0 b0) {
        ng2.e.f((Object)b0, "target");
        b0.reset();
        this.b.a();
        this.c.a();
        this.d.a();
        this.e.a();
        final ArrayList a = this.a;
        final int size = a.size();
        d d = null;
        e e = this;
        d d2;
        for (int i = 0; i < size; ++i, d = d2) {
            d2 = (d)a.get(i);
            d d3;
            if ((d3 = d) == null) {
                d3 = d2;
            }
            if (d2 instanceof d.b) {
                final b b2 = e.b;
                final b d4 = e.d;
                b2.a = d4.a;
                b2.b = d4.b;
                final b c = e.c;
                c.a = d4.a;
                c.b = d4.b;
                b0.close();
                final b b3 = e.b;
                b0.a(b3.a, b3.b);
            }
            else if (d2 instanceof d.n) {
                final d.n n = (d.n)d2;
                final b b4 = e.b;
                final float a2 = b4.a;
                final float c2 = n.c;
                b4.a = a2 + c2;
                final float b5 = b4.b;
                final float d5 = n.d;
                b4.b = b5 + d5;
                b0.d(c2, d5);
                final b d6 = e.d;
                final b b6 = e.b;
                d6.a = b6.a;
                d6.b = b6.b;
            }
            else if (d2 instanceof d.f) {
                final d.f f = (d.f)d2;
                final b b7 = e.b;
                b0.a(b7.a = f.c, b7.b = f.d);
                final b d7 = e.d;
                final b b8 = e.b;
                d7.a = b8.a;
                d7.b = b8.b;
            }
            else if (d2 instanceof d.m) {
                final d.m m = (d.m)d2;
                b0.m(m.c, m.d);
                final b b9 = e.b;
                b9.a += m.c;
                b9.b += m.d;
            }
            else if (d2 instanceof d.e) {
                final d.e e2 = (d.e)d2;
                b0.b(e2.c, e2.d);
                final b b10 = e.b;
                b10.a = e2.c;
                b10.b = e2.d;
            }
            else if (d2 instanceof d.l) {
                final d.l l = (d.l)d2;
                b0.m(l.c, 0.0f);
                final b b11 = e.b;
                b11.a += l.c;
            }
            else if (d2 instanceof d.d) {
                final d.d d8 = (d.d)d2;
                b0.b(d8.c, e.b.b);
                e.b.a = d8.c;
            }
            else if (d2 instanceof d.r) {
                final d.r r = (d.r)d2;
                b0.m(0.0f, r.c);
                final b b12 = e.b;
                b12.b += r.c;
            }
            else if (d2 instanceof d.s) {
                final d.s s = (d.s)d2;
                b0.b(e.b.a, s.c);
                e.b.b = s.c;
            }
            else if (d2 instanceof d.k) {
                final d.k k = (d.k)d2;
                b0.e(k.c, k.d, k.e, k.f, k.g, k.h);
                final b c3 = e.c;
                final b b13 = e.b;
                c3.a = b13.a + k.e;
                c3.b = b13.b + k.f;
                b13.a += k.g;
                b13.b += k.h;
            }
            else if (d2 instanceof d.c) {
                final d.c c4 = (d.c)d2;
                b0.c(c4.c, c4.d, c4.e, c4.f, c4.g, c4.h);
                final b c5 = e.c;
                c5.a = c4.e;
                c5.b = c4.f;
                final b b14 = e.b;
                b14.a = c4.g;
                b14.b = c4.h;
            }
            else if (d2 instanceof d.p) {
                final d.p p = (d.p)d2;
                ng2.e.c((Object)d3);
                if (d3.a) {
                    final b e3 = e.e;
                    final b b15 = e.b;
                    final float a3 = b15.a;
                    final b c6 = e.c;
                    e3.a = a3 - c6.a;
                    e3.b = b15.b - c6.b;
                }
                else {
                    e.e.a();
                }
                final b e4 = e.e;
                b0.e(e4.a, e4.b, p.c, p.d, p.e, p.f);
                final b c7 = e.c;
                final b b16 = e.b;
                c7.a = b16.a + p.c;
                c7.b = b16.b + p.d;
                b16.a += p.e;
                b16.b += p.f;
            }
            else if (d2 instanceof d.h) {
                final d.h h = (d.h)d2;
                ng2.e.c((Object)d3);
                if (d3.a) {
                    final b e5 = e.e;
                    final float n2 = 2;
                    final b b17 = e.b;
                    final float a4 = b17.a;
                    final b c8 = e.c;
                    e5.a = a4 * n2 - c8.a;
                    e5.b = n2 * b17.b - c8.b;
                }
                else {
                    final b e6 = e.e;
                    final b b18 = e.b;
                    e6.a = b18.a;
                    e6.b = b18.b;
                }
                final b e7 = e.e;
                b0.c(e7.a, e7.b, h.c, h.d, h.e, h.f);
                final b c9 = e.c;
                c9.a = h.c;
                c9.b = h.d;
                final b b19 = e.b;
                b19.a = h.e;
                b19.b = h.f;
            }
            else if (d2 instanceof d.o) {
                final d.o o = (d.o)d2;
                b0.f(o.c, o.d, o.e, o.f);
                final b c10 = e.c;
                final b b20 = e.b;
                c10.a = b20.a + o.c;
                c10.b = b20.b + o.d;
                b20.a += o.e;
                b20.b += o.f;
            }
            else if (d2 instanceof d.g) {
                final d.g g = (d.g)d2;
                b0.l(g.c, g.d, g.e, g.f);
                final b c11 = e.c;
                c11.a = g.c;
                c11.b = g.d;
                final b b21 = e.b;
                b21.a = g.e;
                b21.b = g.f;
            }
            else if (d2 instanceof d.q) {
                final d.q q = (d.q)d2;
                ng2.e.c((Object)d3);
                if (d3.b) {
                    final b e8 = e.e;
                    final b b22 = e.b;
                    final float a5 = b22.a;
                    final b c12 = e.c;
                    e8.a = a5 - c12.a;
                    e8.b = b22.b - c12.b;
                }
                else {
                    e.e.a();
                }
                final b e9 = e.e;
                b0.f(e9.a, e9.b, q.c, q.d);
                final b c13 = e.c;
                final b b23 = e.b;
                final float a6 = b23.a;
                final b e10 = e.e;
                c13.a = a6 + e10.a;
                c13.b = b23.b + e10.b;
                b23.a += q.c;
                b23.b += q.d;
            }
            else if (d2 instanceof d.i) {
                final d.i j = (d.i)d2;
                ng2.e.c((Object)d3);
                if (d3.b) {
                    final b e11 = e.e;
                    final float n3 = 2;
                    final b b24 = e.b;
                    final float a7 = b24.a;
                    final b c14 = e.c;
                    e11.a = a7 * n3 - c14.a;
                    e11.b = n3 * b24.b - c14.b;
                }
                else {
                    final b e12 = e.e;
                    final b b25 = e.b;
                    e12.a = b25.a;
                    e12.b = b25.b;
                }
                final b e13 = e.e;
                b0.l(e13.a, e13.b, j.c, j.d);
                final b c15 = e.c;
                final b e14 = e.e;
                c15.a = e14.a;
                c15.b = e14.b;
                final b b26 = e.b;
                b26.a = j.c;
                b26.b = j.d;
            }
            else {
                if (d2 instanceof d.j) {
                    final d.j j2 = (d.j)d2;
                    final float h2 = j2.h;
                    final b b27 = e.b;
                    final float a8 = b27.a;
                    final float n4 = h2 + a8;
                    final float i2 = j2.i;
                    final float b28 = b27.b;
                    final float n5 = i2 + b28;
                    b(b0, a8, b28, n4, n5, j2.c, j2.d, j2.e, j2.f, j2.g);
                    final b b29 = this.b;
                    b29.a = n4;
                    b29.b = n5;
                    final b c16 = this.c;
                    c16.a = n4;
                    c16.b = n5;
                }
                else {
                    if (!(d2 instanceof d.a)) {
                        continue;
                    }
                    final d.a a9 = (d.a)d2;
                    final b b30 = e.b;
                    b(b0, b30.a, b30.b, a9.h, a9.i, a9.c, a9.d, a9.e, a9.f, a9.g);
                    final b b31 = this.b;
                    final float h3 = a9.h;
                    b31.a = h3;
                    final float i3 = a9.i;
                    b31.b = i3;
                    final b c17 = this.c;
                    c17.a = h3;
                    c17.b = i3;
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
            final StringBuilder t = a.t("ExtractFloatResult(endPosition=");
            t.append(this.a);
            t.append(", endWithNegativeOrDot=");
            return d.n(t, this.b, ')');
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
            return ng2.e.a((Object)this.a, (Object)b.a) && ng2.e.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("PathPoint(x=");
            t.append(this.a);
            t.append(", y=");
            return aq2.a.n(t, this.b, ')');
        }
    }
}
