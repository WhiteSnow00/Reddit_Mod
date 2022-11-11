// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import java.util.AbstractCollection;
import com.google.common.collect.x;
import com.google.common.collect.ImmutableCollection$a;
import com.google.common.collect.ImmutableCollection;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.List;
import com.google.android.exoplayer2.f0$a;
import va.f0;
import com.google.common.collect.MultimapBuilder$b;
import com.google.common.collect.a0;
import lw0.b;
import com.google.common.collect.z;
import com.google.common.collect.Ordering;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;
import com.google.common.primitives.Ints;
import android.util.Pair;
import android.util.SparseArray;
import qa.i;
import java.util.Comparator;
import com.google.android.exoplayer2.e;
import ad.c0;
import ac.t;
import ac.u;
import va.e0;

public abstract class h extends n
{
    @Override
    public final void a(final Object o) {
        final a a = (a)o;
    }
    
    @Override
    public final o b(final e0[] array, u e) throws ExoPlaybackException {
        final int[] array2 = new int[array.length + 1];
        final int n = array.length + 1;
        final t[][] array3 = new t[n][];
        final int[][][] array4 = new int[array.length + 1][][];
        for (int i = 0; i < n; ++i) {
            final int f = e.f;
            array3[i] = new t[f];
            array4[i] = new int[f][];
        }
        final int length = array.length;
        final int[] array5 = new int[length];
        for (int j = 0; j < length; ++j) {
            array5[j] = array[j].w();
        }
        int n2 = 0;
        while (true) {
            final u u = e;
            if (n2 >= u.f) {
                break;
            }
            final t a = u.a(n2);
            final boolean b = ad.o.i(a.h[0].q) == 5;
            int length2 = array.length;
            int n3 = 1;
            int n5;
            int n4 = n5 = 0;
            while (true) {
                int k = 0;
                if (n4 >= array.length) {
                    break;
                }
                final e0 e2 = array[n4];
                int max = 0;
                while (k < a.f) {
                    max = Math.max(max, e2.a(a.h[k]) & 0x7);
                    ++k;
                }
                int n6;
                if (array2[n4] == 0) {
                    n6 = 1;
                }
                else {
                    n6 = 0;
                }
                int n7 = 0;
                int n8 = 0;
                int n9 = 0;
                Label_0341: {
                    if (max <= n5) {
                        n7 = length2;
                        n8 = n5;
                        n9 = n3;
                        if (max != n5) {
                            break Label_0341;
                        }
                        n7 = length2;
                        n8 = n5;
                        n9 = n3;
                        if (!b) {
                            break Label_0341;
                        }
                        n7 = length2;
                        n8 = n5;
                        if ((n9 = n3) != 0) {
                            break Label_0341;
                        }
                        n7 = length2;
                        n8 = n5;
                        n9 = n3;
                        if (n6 == 0) {
                            break Label_0341;
                        }
                    }
                    n7 = n4;
                    n9 = n6;
                    n8 = max;
                }
                ++n4;
                length2 = n7;
                n5 = n8;
                n3 = n9;
            }
            int[] array6;
            if (length2 == array.length) {
                array6 = new int[a.f];
            }
            else {
                final e0 e3 = array[length2];
                array6 = new int[a.f];
                for (int l = 0; l < a.f; ++l) {
                    array6[l] = e3.a(a.h[l]);
                }
            }
            final int n10 = array2[length2];
            array3[length2][n10] = a;
            array4[length2][n10] = array6;
            array2[length2] = n10 + 1;
            ++n2;
        }
        final u[] array7 = new u[array.length];
        final String[] array8 = new String[array.length];
        final int[] array9 = new int[array.length];
        for (int n11 = 0; n11 < array.length; ++n11) {
            final int n12 = array2[n11];
            array7[n11] = new u((t[])c0.L(n12, array3[n11]));
            array4[n11] = (int[][])c0.L(n12, array4[n11]);
            array8[n11] = array[n11].getName();
            array9[n11] = ((e)array[n11]).f;
        }
        final a a2 = new a(array8, array9, array7, array5, array4, new u((t[])c0.L(array2[array.length], array3[array.length])));
        final wc.e e4 = (wc.e)this;
        final e$c e$c = e4.d.get();
        final int a3 = a2.a;
        final f.a[] array10 = new f.a[a3];
        final Pair g = e.g(2, a2, array4, (wc.e.g.a)new qa.f(4, (Object)e$c, (Object)array5), (Comparator)new yb.e(2));
        if (g != null) {
            array10[g.second] = (f.a)g.first;
        }
        while (true) {
        Label_2961_Outer:
            for (int n13 = 0; n13 < a2.a; ++n13) {
                if (2 == a2.b[n13] && a2.c[n13].f > 0) {
                    final boolean b2 = true;
                    final Pair g2 = e.g(1, a2, array4, (wc.e.g.a)new d(e$c, b2), (Comparator)new vb.d(2));
                    if (g2 != null) {
                        array10[g2.second] = (f.a)g2.first;
                    }
                    Object h;
                    if (g2 == null) {
                        h = null;
                    }
                    else {
                        final f.a a4 = (f.a)g2.first;
                        h = a4.a.h[a4.b[0]].h;
                    }
                    final Pair g3 = e.g(3, a2, array4, (wc.e.g.a)new i(4, e$c, h), (Comparator)new c(0));
                    if (g3 != null) {
                        array10[g3.second] = (f.a)g3.first;
                    }
                    for (int n14 = 0; n14 < a3; ++n14) {
                        final int n15 = a2.b[n14];
                        if (n15 != 2 && n15 != 1 && n15 != 3) {
                            final u u2 = a2.c[n14];
                            final int[][] array11 = array4[n14];
                            int n16 = 0;
                            int n17 = 0;
                            t t = null;
                            wc.e.b b3 = null;
                            while (n16 < u2.f) {
                                final t a5 = u2.a(n16);
                                final int[] array12 = array11[n16];
                                wc.e.b b5;
                                for (int n18 = 0; n18 < a5.f; ++n18, b3 = b5) {
                                    if (e.d(array12[n18], e$c.P)) {
                                        final wc.e.b b4 = new wc.e.b(array12[n18], a5.h[n18]);
                                        if (b3 != null) {
                                            b5 = b3;
                                            if (com.google.common.collect.h.a.c(b4.g, b3.g).c(b4.f, b3.f).e() <= 0) {
                                                continue;
                                            }
                                        }
                                        n17 = n18;
                                        b5 = b4;
                                        t = a5;
                                    }
                                    else {
                                        b5 = b3;
                                    }
                                }
                                ++n16;
                            }
                            Object o;
                            if (t == null) {
                                o = null;
                            }
                            else {
                                o = new f.a(0, t, new int[] { n17 });
                            }
                            array10[n14] = (f.a)o;
                        }
                    }
                    final SparseArray sparseArray = new SparseArray();
                    for (int a6 = a2.a, n19 = 0; n19 < a6; ++n19) {
                        final u u3 = a2.c[n19];
                        for (int n20 = 0; n20 < u3.f; ++n20) {
                            e.e(sparseArray, (k$a)((l)e$c).C.f.get((Object)u3.a(n20)), n19);
                        }
                    }
                    e = a2.e;
                    for (int n21 = 0; n21 < e.f; ++n21) {
                        e.e(sparseArray, (k$a)((l)e$c).C.f.get((Object)e.a(n21)), -1);
                    }
                    for (int n22 = 0; n22 < sparseArray.size(); ++n22) {
                        final Pair pair = (Pair)sparseArray.valueAt(n22);
                        final int key = sparseArray.keyAt(n22);
                        final k$a k$a = (k$a)pair.first;
                        final int intValue = (int)pair.second;
                        for (int n23 = 0; n23 < a3; ++n23) {
                            if (intValue == n23) {
                                array10[n23] = new f.a(0, k$a.f, Ints.g1((Collection)k$a.g));
                            }
                            else if (a2.b[n23] == key) {
                                array10[n23] = null;
                            }
                        }
                    }
                    for (int n24 = 0; n24 < a3; ++n24) {
                        e = a2.c[n24];
                        final Map map = (Map)e$c.S.get(n24);
                        if (map != null && map.containsKey(e)) {
                            e = a2.c[n24];
                            final Map map2 = (Map)e$c.S.get(n24);
                            wc.e.e e5;
                            if (map2 != null) {
                                e5 = map2.get(e);
                            }
                            else {
                                e5 = null;
                            }
                            Object o2;
                            if (e5 == null) {
                                o2 = null;
                            }
                            else {
                                o2 = new f.a(e5.h, e.a(e5.f), e5.g);
                            }
                            array10[n24] = (f.a)o2;
                        }
                    }
                    for (int n25 = 0; n25 < a3; ++n25) {
                        final int n26 = a2.b[n25];
                        if (e$c.T.get(n25) || ((ImmutableCollection)((l)e$c).D).contains((Object)n26)) {
                            array10[n25] = null;
                        }
                    }
                    final f.b c = e4.c;
                    yc.d b6 = ((n)e4).b;
                    b6.getClass();
                    ((wc.a.b)c).getClass();
                    final ArrayList<ImmutableList$a> list = new ArrayList<ImmutableList$a>();
                    for (final f.a a7 : array10) {
                        if (a7 != null && a7.b.length > 1) {
                            final ImmutableList$a builder = ImmutableList.builder();
                            ((ImmutableCollection$a)builder).c((Object)new wc.a.a(0L, 0L));
                            list.add(builder);
                        }
                        else {
                            list.add(null);
                        }
                    }
                    final long[][] array13 = new long[a3][];
                    for (int n28 = 0; n28 < a3; ++n28) {
                        final f.a a8 = array10[n28];
                        if (a8 == null) {
                            array13[n28] = new long[0];
                        }
                        else {
                            array13[n28] = new long[a8.b.length];
                            int n29 = 0;
                            while (true) {
                                final int[] b7 = a8.b;
                                if (n29 >= b7.length) {
                                    break;
                                }
                                array13[n28][n29] = a8.a.h[b7[n29]].m;
                                ++n29;
                            }
                            Arrays.sort(array13[n28]);
                        }
                    }
                    final int[] array14 = new int[a3];
                    final long[] array15 = new long[a3];
                    for (int n30 = 0; n30 < a3; ++n30) {
                        final long[] array16 = array13[n30];
                        long n31;
                        if (array16.length == 0) {
                            n31 = 0L;
                        }
                        else {
                            n31 = array16[0];
                        }
                        array15[n30] = n31;
                    }
                    wc.a.v(list, array15);
                    final Ordering natural = Ordering.natural();
                    natural.getClass();
                    final z z = new z(natural);
                    lw0.b.N(2, "expectedValuesPerKey");
                    final com.google.common.collect.u a9 = new a0((MultimapBuilder$b)z).a();
                    int n32 = 0;
                    int[][][] array17 = array4;
                    a a10 = a2;
                    while (n32 < a3) {
                        final long[] array18 = array13[n32];
                        a a11;
                        int[][][] array19;
                        yc.d d2;
                        if (array18.length <= 1) {
                            final yc.d d = b6;
                            a11 = a10;
                            array19 = array17;
                            d2 = d;
                        }
                        else {
                            int length3 = array18.length;
                            final double[] array20 = new double[length3];
                            int n33 = 0;
                            int[][][] array21 = array17;
                            final a a12 = a10;
                            int[][][] array23;
                            while (true) {
                                final long[] array22 = array13[n32];
                                array23 = array21;
                                final int length4 = array22.length;
                                double log = 0.0;
                                if (n33 >= length4) {
                                    break;
                                }
                                final long n34 = array22[n33];
                                if (n34 != -1L) {
                                    log = Math.log((double)n34);
                                }
                                array20[n33] = log;
                                ++n33;
                                array21 = array23;
                            }
                            final a a13 = a12;
                            final yc.d d3 = b6;
                            --length3;
                            final double n35 = array20[length3] - array20[0];
                            int n36 = 0;
                            while (true) {
                                a11 = a13;
                                array19 = array23;
                                d2 = d3;
                                if (n36 >= length3) {
                                    break;
                                }
                                final double n37 = array20[n36];
                                ++n36;
                                final double n38 = array20[n36];
                                double n39;
                                if (n35 == 0.0) {
                                    n39 = 1.0;
                                }
                                else {
                                    n39 = ((n37 + n38) * 0.5 - array20[0]) / n35;
                                }
                                ((x)a9).put((Object)n39, (Object)n32);
                            }
                        }
                        ++n32;
                        a10 = a11;
                        final int[][][] array24 = array19;
                        b6 = d2;
                        array17 = array24;
                    }
                    final ImmutableList copy = ImmutableList.copyOf(((x)a9).values());
                    for (int n40 = 0; n40 < ((AbstractCollection)copy).size(); ++n40) {
                        final int intValue2 = ((List<Integer>)copy).get(n40);
                        final int n41 = array14[intValue2] + 1;
                        array14[intValue2] = n41;
                        array15[intValue2] = array13[intValue2][n41];
                        wc.a.v(list, array15);
                    }
                    for (int n42 = 0; n42 < a3; ++n42) {
                        if (list.get(n42) != null) {
                            array15[n42] *= 2L;
                        }
                    }
                    wc.a.v(list, array15);
                    final ImmutableList$a builder2 = ImmutableList.builder();
                    for (int n43 = 0; n43 < list.size(); ++n43) {
                        final ImmutableList$a immutableList$a = list.get(n43);
                        ImmutableList list2;
                        if (immutableList$a == null) {
                            list2 = ImmutableList.of();
                        }
                        else {
                            list2 = immutableList$a.f();
                        }
                        ((ImmutableCollection$a)builder2).c((Object)list2);
                    }
                    final ImmutableList f2 = builder2.f();
                    final f[] array25 = new f[a3];
                    for (int n44 = 0; n44 < a3; ++n44) {
                        final f.a a14 = array10[n44];
                        if (a14 != null) {
                            final int[] b8 = a14.b;
                            if (b8.length != 0) {
                                wc.b b9;
                                if (b8.length == 1) {
                                    b9 = new g(b8[0], a14.c, a14.a);
                                }
                                else {
                                    final t a15 = a14.a;
                                    final int c2 = a14.c;
                                    final ImmutableList list3 = ((List<ImmutableList>)f2).get(n44);
                                    final long n45 = 10000;
                                    final long n46 = 25000;
                                    b9 = new wc.a(a15, b8, c2, b6, n45, n46, n46, 1279, 719, 0.7f, 0.75f, list3, ad.c.a);
                                }
                                array25[n44] = (f)b9;
                            }
                        }
                    }
                    final f0[] array26 = new f0[a3];
                    for (int n47 = 0; n47 < a3; ++n47) {
                        final int n48 = a10.b[n47];
                        f0 b10;
                        if (!e$c.T.get(n47) && !((ImmutableCollection)((l)e$c).D).contains((Object)n48) && (a10.b[n47] == -2 || array25[n47] != null)) {
                            b10 = f0.b;
                        }
                        else {
                            b10 = null;
                        }
                        array26[n47] = b10;
                    }
                    Label_3014: {
                        if (e$c.Q) {
                            int n49 = -1;
                            int n50 = -1;
                        Label_2961:
                            while (true) {
                            Label_2823:
                                for (int n51 = 0; n51 < a10.a; ++n51) {
                                    final int n52 = a10.b[n51];
                                    final f f3 = array25[n51];
                                    if ((n52 == 1 || n52 == 2) && f3 != null) {
                                        final int[][] array27 = array17[n51];
                                        final int b11 = a10.c[n51].b(f3.h());
                                        int n53 = 0;
                                        boolean b13;
                                        while (true) {
                                            while (n53 < f3.length()) {
                                                if ((array27[b11][f3.c(n53)] & 0x20) != 0x20) {
                                                    final boolean b12 = false;
                                                    if (b12) {
                                                        if (n52 == 1) {
                                                            if (n50 == -1) {
                                                                n50 = n51;
                                                                continue Label_2823;
                                                            }
                                                        }
                                                        else if (n49 == -1) {
                                                            n49 = n51;
                                                            continue Label_2823;
                                                        }
                                                        b13 = false;
                                                        break Label_2961;
                                                    }
                                                    continue Label_2823;
                                                }
                                                else {
                                                    ++n53;
                                                }
                                            }
                                            final boolean b12 = true;
                                            continue Label_2961_Outer;
                                        }
                                        if ((n50 != -1 && n49 != -1) & b13) {
                                            array26[n49] = (array26[n50] = new f0(true));
                                        }
                                        break Label_3014;
                                    }
                                }
                                boolean b13 = true;
                                continue Label_2961;
                            }
                        }
                    }
                    final Pair create = Pair.create((Object)array26, (Object)array25);
                    final wc.i[] array28 = (wc.i[])create.second;
                    final ImmutableList$a immutableList$a2 = new ImmutableList$a();
                    for (int n54 = 0; n54 < a10.a; ++n54) {
                        final u u4 = a10.c[n54];
                        final wc.i m = array28[n54];
                        for (int n55 = 0; n55 < u4.f; ++n55) {
                            final t a16 = u4.a(n55);
                            final int f4 = a16.f;
                            final int[] array29 = new int[f4];
                            final boolean[] array30 = new boolean[f4];
                            for (int n56 = 0; n56 < a16.f; ++n56) {
                                array29[n56] = (a10.d[n54][n55][n56] & 0x7);
                                array30[n56] = (m != null && m.h().equals(a16) && m.g(n56) != -1);
                            }
                            ((ImmutableCollection$a)immutableList$a2).c((Object)new f0$a(a16, array29, a10.b[n54], array30));
                        }
                    }
                    final u e6 = a10.e;
                    for (int n57 = 0; n57 < e6.f; ++n57) {
                        final t a17 = e6.a(n57);
                        final int[] array31 = new int[a17.f];
                        Arrays.fill(array31, 0);
                        ((ImmutableCollection$a)immutableList$a2).c((Object)new f0$a(a17, array31, ad.o.i(a17.h[0].q), new boolean[a17.f]));
                    }
                    return new o((f0[])create.first, (f[])create.second, new com.google.android.exoplayer2.f0((List)immutableList$a2.f()), a10);
                }
            }
            final boolean b2 = false;
            continue;
        }
    }
    
    public static final class a
    {
        public final int a;
        public final int[] b;
        public final u[] c;
        public final int[][][] d;
        public final u e;
        
        public a(final String[] array, final int[] b, final u[] c, final int[] array2, final int[][][] d, final u e) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.a = b.length;
        }
    }
}
