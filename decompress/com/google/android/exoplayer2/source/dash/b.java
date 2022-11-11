// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.dash;

import cc.i;
import java.io.IOException;
import ac.p;
import va.h0;
import java.util.regex.Matcher;
import ec.g;
import android.util.Pair;
import al0.f0;
import ac.t;
import com.google.android.exoplayer2.n;
import java.util.Arrays;
import com.google.common.primitives.Ints;
import java.util.Collection;
import android.util.SparseArray;
import java.util.ArrayList;
import android.util.SparseIntArray;
import z0.d1;
import dc.e;
import com.google.android.exoplayer2.source.h$a;
import wa.c0;
import com.google.android.exoplayer2.source.j;
import java.util.IdentityHashMap;
import ac.u;
import yc.o;
import com.google.android.exoplayer2.drm.d;
import yc.s;
import ec.f;
import java.util.List;
import ec.c;
import java.util.regex.Pattern;
import cc.h$b;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.h;

public final class b implements h, q.a<cc.h<com.google.android.exoplayer2.source.dash.a>>, h$b<com.google.android.exoplayer2.source.dash.a>
{
    public static final Pattern D;
    public static final Pattern E;
    public c A;
    public int B;
    public List<f> C;
    public final int f;
    public final com.google.android.exoplayer2.source.dash.a.a g;
    public final s h;
    public final d i;
    public final com.google.android.exoplayer2.upstream.h j;
    public final dc.a k;
    public final long l;
    public final o m;
    public final yc.b n;
    public final u o;
    public final a[] p;
    public final dn.a q;
    public final com.google.android.exoplayer2.source.dash.d r;
    public final IdentityHashMap<cc.h<com.google.android.exoplayer2.source.dash.a>, d$c> s;
    public final j.a t;
    public final com.google.android.exoplayer2.drm.c.a u;
    public final c0 v;
    public h$a w;
    public cc.h<com.google.android.exoplayer2.source.dash.a>[] x;
    public e[] y;
    public d1 z;
    
    static {
        D = Pattern.compile("CC([1-4])=(.+)");
        E = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    }
    
    public b(int i, final c a, final dc.a k, int j, final com.google.android.exoplayer2.source.dash.a.a g, final s h, final d l, final com.google.android.exoplayer2.drm.c.a u, final com.google.android.exoplayer2.upstream.h m, final j.a t, final long l2, final o m2, final yc.b n, final dn.a q, final DashMediaSource$c dashMediaSource$c, final c0 v) {
        this.f = i;
        this.A = a;
        this.k = k;
        this.B = j;
        this.g = g;
        this.h = h;
        this.i = l;
        this.u = u;
        this.j = m;
        this.t = t;
        this.l = l2;
        this.m = m2;
        this.n = n;
        this.q = q;
        this.v = v;
        this.r = new com.google.android.exoplayer2.source.dash.d(a, dashMediaSource$c, n);
        final int n2 = 0;
        this.x = new cc.h[0];
        this.y = new e[0];
        this.s = new IdentityHashMap<cc.h<com.google.android.exoplayer2.source.dash.a>, d$c>();
        final cc.h<com.google.android.exoplayer2.source.dash.a>[] x = this.x;
        q.getClass();
        this.z = new d1((Object)x);
        final g b = a.b(j);
        final List d = b.d;
        this.C = d;
        final List c = b.c;
        final int size = c.size();
        final SparseIntArray sparseIntArray = new SparseIntArray(size);
        final ArrayList list = new ArrayList<ArrayList<Integer>>(size);
        final SparseArray sparseArray = new SparseArray(size);
        ArrayList<Integer> list2;
        for (i = 0; i < size; ++i) {
            sparseIntArray.put(c.get(i).a, i);
            list2 = new ArrayList<Integer>();
            list2.add(i);
            list.add(list2);
            sparseArray.put(i, (Object)list2);
        }
        j = n2;
    Label_0296:
        while (true) {
            i = 0;
            if (j < size) {
                final ec.a a2 = c.get(j);
                while (true) {
                    for (List e = a2.e; i < e.size(); ++i) {
                        final ec.e e2 = e.get(i);
                        if ("http://dashif.org/guidelines/trickmode".equals(e2.a)) {
                            ec.e e3 = e2;
                            Label_0427: {
                                if (e2 == null) {
                                    List f;
                                    for (f = a2.f, i = 0; i < f.size(); ++i) {
                                        e3 = (ec.e)f.get(i);
                                        if ("http://dashif.org/guidelines/trickmode".equals(e3.a)) {
                                            break Label_0427;
                                        }
                                    }
                                    e3 = null;
                                }
                            }
                            Label_0456: {
                                if (e3 != null) {
                                    i = sparseIntArray.get(Integer.parseInt(e3.b), -1);
                                    if (i != -1) {
                                        break Label_0456;
                                    }
                                }
                                i = j;
                            }
                            int n3 = i;
                            Label_0603: {
                                if (i == j) {
                                    final List f2 = a2.f;
                                    while (true) {
                                        for (int n4 = 0; n4 < f2.size(); ++n4) {
                                            final ec.e e4 = f2.get(n4);
                                            if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(e4.a)) {
                                                n3 = i;
                                                if (e4 == null) {
                                                    break Label_0603;
                                                }
                                                final String b2 = e4.b;
                                                final int a3 = ad.c0.a;
                                                final String[] split = b2.split(",", -1);
                                                final int length = split.length;
                                                int n5 = 0;
                                                while (true) {
                                                    n3 = i;
                                                    if (n5 >= length) {
                                                        break Label_0603;
                                                    }
                                                    final int value = sparseIntArray.get(Integer.parseInt(split[n5]), -1);
                                                    int min = i;
                                                    if (value != -1) {
                                                        min = Math.min(i, value);
                                                    }
                                                    ++n5;
                                                    i = min;
                                                }
                                            }
                                            else {}
                                        }
                                        final ec.e e4 = null;
                                        continue;
                                    }
                                }
                            }
                            if (n3 != j) {
                                final List list3 = (List)sparseArray.get(j);
                                final List list4 = (List)sparseArray.get(n3);
                                list4.addAll(list3);
                                sparseArray.put(j, (Object)list4);
                                list.remove(list3);
                            }
                            ++j;
                            continue Label_0296;
                        }
                    }
                    final ec.e e2 = null;
                    continue;
                }
            }
            break;
        }
        final int size2 = list.size();
        final int[][] array = new int[size2][];
        for (i = 0; i < size2; ++i) {
            Arrays.sort(array[i] = Ints.g1((Collection)list.get(i)));
        }
        final boolean[] array2 = new boolean[size2];
        final n[][] array3 = new n[size2][];
        int n6 = 0;
        j = 0;
        Label_0730:
    Label_0829_Outer:
        while (n6 < size2) {
            final int[] array4 = array[n6];
            final int length2 = array4.length;
            i = 0;
        Label_0829:
            while (true) {
                while (i < length2) {
                    final List c2 = c.get(array4[i]).c;
                    for (int n7 = 0; n7 < c2.size(); ++n7) {
                        if (!((ec.j)c2.get(n7)).i.isEmpty()) {
                            final boolean b3 = true;
                            break Label_0829;
                        }
                    }
                    ++i;
                    continue Label_0829_Outer;
                    i = j;
                    boolean b3 = false;
                    if (b3) {
                        array2[n6] = true;
                        i = j + 1;
                    }
                    final int[] array5 = array[n6];
                    final int length3 = array5.length;
                    j = 0;
                Label_1130:
                    while (true) {
                        while (j < length3) {
                            final int n8 = array5[j];
                            final ec.a a4 = c.get(n8);
                            final List d2 = c.get(n8).d;
                            for (int n9 = 0; n9 < d2.size(); ++n9) {
                                final ec.e e5 = d2.get(n9);
                                if ("urn:scte:dash:cc:cea-608:2015".equals(e5.a)) {
                                    final n.a a5 = new n.a();
                                    a5.k = "application/cea-608";
                                    j = a4.a;
                                    final StringBuilder sb = new StringBuilder(18);
                                    sb.append(j);
                                    sb.append(":cea608");
                                    a5.a = sb.toString();
                                    final n[] array6 = h(e5, com.google.android.exoplayer2.source.dash.b.D, new n(a5));
                                    break Label_1130;
                                }
                                if ("urn:scte:dash:cc:cea-708:2015".equals(e5.a)) {
                                    final n.a a6 = new n.a();
                                    a6.k = "application/cea-708";
                                    j = a4.a;
                                    final StringBuilder sb2 = new StringBuilder(18);
                                    sb2.append(j);
                                    sb2.append(":cea708");
                                    a6.a = sb2.toString();
                                    final n[] array6 = h(e5, com.google.android.exoplayer2.source.dash.b.E, new n(a6));
                                    break Label_1130;
                                }
                            }
                            ++j;
                            continue Label_0829_Outer;
                            n[] array6 = null;
                            array3[n6] = array6;
                            j = i;
                            if (array6.length != 0) {
                                j = i + 1;
                            }
                            ++n6;
                            continue Label_0730;
                        }
                        final n[] array6 = new n[0];
                        continue Label_1130;
                    }
                }
                final boolean b3 = false;
                continue Label_0829;
            }
        }
        i = d.size() + (j + size2);
        final t[] array7 = new t[i];
        final a[] array8 = new a[i];
        int n10 = 0;
        j = 0;
        final boolean[] array9 = array2;
        final int[][] array10 = array;
        while (n10 < size2) {
            final int[] array11 = array10[n10];
            final ArrayList list5 = new ArrayList();
            int length4;
            for (length4 = array11.length, i = 0; i < length4; ++i) {
                list5.addAll(c.get(array11[i]).c);
            }
            final int size3 = list5.size();
            final n[] array12 = new n[size3];
            n f3;
            for (i = 0; i < size3; ++i) {
                f3 = ((ec.j)list5.get(i)).f;
                array12[i] = f3.b(l.d(f3));
            }
            final ec.a a7 = c.get(array11[0]);
            i = a7.a;
            String s;
            if (i != -1) {
                s = Integer.toString(i);
            }
            else {
                s = f0.f(17, "unset:", n10);
            }
            i = j + 1;
            int n11;
            if (array9[n10]) {
                n11 = i;
                ++i;
            }
            else {
                n11 = -1;
            }
            int n13;
            if (array3[n10].length != 0) {
                final int n12 = i + 1;
                n13 = i;
                i = n12;
            }
            else {
                n13 = -1;
            }
            array7[j] = new t(s, array12);
            array8[j] = new a(a7.b, 0, array11, j, n11, n13, -1);
            if (n11 != -1) {
                final String concat = String.valueOf(s).concat(":emsg");
                final n.a a8 = new n.a();
                a8.a = concat;
                a8.k = "application/x-emsg";
                array7[n11] = new t(concat, new n[] { new n(a8) });
                array8[n11] = new a(5, 1, array11, j, -1, -1, -1);
            }
            if (n13 != -1) {
                array7[n13] = new t(String.valueOf(s).concat(":cc"), array3[n10]);
                array8[n13] = new a(3, 1, array11, j, -1, -1, -1);
            }
            ++n10;
            j = i;
        }
        f f4;
        n.a a9;
        n n14;
        String a10;
        StringBuilder sb3;
        for (i = 0; i < d.size(); ++i, ++j) {
            f4 = d.get(i);
            a9 = new n.a();
            a9.a = f4.a();
            a9.k = "application/x-emsg";
            n14 = new n(a9);
            a10 = f4.a();
            sb3 = new StringBuilder(a81.e.h(a10, 12));
            sb3.append(a10);
            sb3.append(":");
            sb3.append(i);
            array7[j] = new t(sb3.toString(), new n[] { n14 });
            array8[j] = new a(5, 2, new int[0], -1, -1, -1, i);
        }
        final Pair create = Pair.create((Object)new u(array7), (Object)array8);
        this.o = (u)create.first;
        this.p = (a[])create.second;
    }
    
    public static n[] h(final ec.e e, final Pattern pattern, final n n) {
        final String b = e.b;
        if (b == null) {
            return new n[] { n };
        }
        final int a = ad.c0.a;
        final String[] split = b.split(";", -1);
        final n[] array = new n[split.length];
        for (int i = 0; i < split.length; ++i) {
            final Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new n[] { n };
            }
            final int int1 = Integer.parseInt(matcher.group(1));
            final n.a a2 = new n.a(n);
            final String f = n.f;
            final StringBuilder sb = new StringBuilder(a81.e.h(f, 12));
            sb.append(f);
            sb.append(":");
            sb.append(int1);
            a2.a = sb.toString();
            a2.C = int1;
            a2.c = matcher.group(2);
            array[i] = new n(a2);
        }
        return array;
    }
    
    public final boolean a() {
        return this.z.a();
    }
    
    public final int b(int i, final int[] array) {
        i = array[i];
        if (i == -1) {
            return -1;
        }
        final int e = this.p[i].e;
        int n;
        for (i = 0; i < array.length; ++i) {
            n = array[i];
            if (n == e && this.p[n].c == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public final long c(final long n, final h0 h0) {
        for (final cc.h<com.google.android.exoplayer2.source.dash.a> h2 : this.x) {
            if (h2.f == 2) {
                return ((i)h2.j).c(n, h0);
            }
        }
        return n;
    }
    
    public final boolean d(final long n) {
        return this.z.d(n);
    }
    
    public final long e() {
        return this.z.e();
    }
    
    public final void f(final long n) {
        this.z.f(n);
    }
    
    public final long g() {
        return this.z.g();
    }
    
    public final void i(final q q) {
        final cc.h h = (cc.h)q;
        ((q.a<b>)this.w).i(this);
    }
    
    public final long j(final long n) {
        final cc.h<com.google.android.exoplayer2.source.dash.a>[] x = this.x;
        final int length = x.length;
        final int n2 = 0;
        for (int i = 0; i < length; ++i) {
            x[i].B(n);
        }
        final e[] y = this.y;
        for (int length2 = y.length, j = n2; j < length2; ++j) {
            y[j].a(n);
        }
        return n;
    }
    
    public final long n() {
        return -9223372036854775807L;
    }
    
    public final u p() {
        return this.o;
    }
    
    public final void s(final h$a w, final long n) {
        (this.w = w).k((h)this);
    }
    
    public final long t(final wc.f[] p0, final boolean[] p1, final p[] p2, final boolean[] p3, final long p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          7
        //     3: aload           7
        //     5: arraylength    
        //     6: newarray        I
        //     8: astore          8
        //    10: iconst_0       
        //    11: istore          9
        //    13: iload           9
        //    15: aload           7
        //    17: arraylength    
        //    18: if_icmpge       67
        //    21: aload           7
        //    23: iload           9
        //    25: aaload         
        //    26: astore          10
        //    28: aload           10
        //    30: ifnull          55
        //    33: aload           8
        //    35: iload           9
        //    37: aload_0        
        //    38: getfield        com/google/android/exoplayer2/source/dash/b.o:Lac/u;
        //    41: aload           10
        //    43: invokeinterface wc/i.h:()Lac/t;
        //    48: invokevirtual   ac/u.b:(Lac/t;)I
        //    51: iastore        
        //    52: goto            61
        //    55: aload           8
        //    57: iload           9
        //    59: iconst_m1      
        //    60: iastore        
        //    61: iinc            9, 1
        //    64: goto            13
        //    67: iconst_0       
        //    68: istore          9
        //    70: iload           9
        //    72: aload           7
        //    74: arraylength    
        //    75: if_icmpge       177
        //    78: aload           7
        //    80: iload           9
        //    82: aaload         
        //    83: ifnull          93
        //    86: aload_2        
        //    87: iload           9
        //    89: baload         
        //    90: ifne            171
        //    93: aload_3        
        //    94: iload           9
        //    96: aaload         
        //    97: astore          10
        //    99: aload           10
        //   101: instanceof      Lcc/h;
        //   104: ifeq            119
        //   107: aload           10
        //   109: checkcast       Lcc/h;
        //   112: aload_0        
        //   113: invokevirtual   cc/h.A:(Lcc/h$b;)V
        //   116: goto            166
        //   119: aload           10
        //   121: instanceof      Lcc/h$a;
        //   124: ifeq            166
        //   127: aload           10
        //   129: checkcast       Lcc/h$a;
        //   132: astore          10
        //   134: aload           10
        //   136: getfield        cc/h$a.j:Lcc/h;
        //   139: getfield        cc/h.i:[Z
        //   142: aload           10
        //   144: getfield        cc/h$a.h:I
        //   147: baload         
        //   148: invokestatic    ad/d0.f:(Z)V
        //   151: aload           10
        //   153: getfield        cc/h$a.j:Lcc/h;
        //   156: getfield        cc/h.i:[Z
        //   159: aload           10
        //   161: getfield        cc/h$a.h:I
        //   164: iconst_0       
        //   165: bastore        
        //   166: aload_3        
        //   167: iload           9
        //   169: aconst_null    
        //   170: aastore        
        //   171: iinc            9, 1
        //   174: goto            70
        //   177: iconst_0       
        //   178: istore          9
        //   180: aload           7
        //   182: arraylength    
        //   183: istore          11
        //   185: iconst_1       
        //   186: istore          12
        //   188: iload           9
        //   190: iload           11
        //   192: if_icmpge       335
        //   195: aload_3        
        //   196: iload           9
        //   198: aaload         
        //   199: astore_2       
        //   200: aload_2        
        //   201: instanceof      Lac/f;
        //   204: ifne            214
        //   207: aload_2        
        //   208: instanceof      Lcc/h$a;
        //   211: ifeq            329
        //   214: aload_0        
        //   215: iload           9
        //   217: aload           8
        //   219: invokevirtual   com/google/android/exoplayer2/source/dash/b.b:(I[I)I
        //   222: istore          11
        //   224: iload           11
        //   226: iconst_m1      
        //   227: if_icmpne       242
        //   230: aload_3        
        //   231: iload           9
        //   233: aaload         
        //   234: instanceof      Lac/f;
        //   237: istore          12
        //   239: goto            274
        //   242: aload_3        
        //   243: iload           9
        //   245: aaload         
        //   246: astore_2       
        //   247: aload_2        
        //   248: instanceof      Lcc/h$a;
        //   251: ifeq            271
        //   254: aload_2        
        //   255: checkcast       Lcc/h$a;
        //   258: getfield        cc/h$a.f:Lcc/h;
        //   261: aload_3        
        //   262: iload           11
        //   264: aaload         
        //   265: if_acmpne       271
        //   268: goto            274
        //   271: iconst_0       
        //   272: istore          12
        //   274: iload           12
        //   276: ifne            329
        //   279: aload_3        
        //   280: iload           9
        //   282: aaload         
        //   283: astore_2       
        //   284: aload_2        
        //   285: instanceof      Lcc/h$a;
        //   288: ifeq            324
        //   291: aload_2        
        //   292: checkcast       Lcc/h$a;
        //   295: astore_2       
        //   296: aload_2        
        //   297: getfield        cc/h$a.j:Lcc/h;
        //   300: getfield        cc/h.i:[Z
        //   303: aload_2        
        //   304: getfield        cc/h$a.h:I
        //   307: baload         
        //   308: invokestatic    ad/d0.f:(Z)V
        //   311: aload_2        
        //   312: getfield        cc/h$a.j:Lcc/h;
        //   315: getfield        cc/h.i:[Z
        //   318: aload_2        
        //   319: getfield        cc/h$a.h:I
        //   322: iconst_0       
        //   323: bastore        
        //   324: aload_3        
        //   325: iload           9
        //   327: aconst_null    
        //   328: aastore        
        //   329: iinc            9, 1
        //   332: goto            180
        //   335: aload_3        
        //   336: astore          7
        //   338: iconst_0       
        //   339: istore          11
        //   341: aload           8
        //   343: astore_2       
        //   344: aload_1        
        //   345: astore          8
        //   347: iload           11
        //   349: aload           8
        //   351: arraylength    
        //   352: if_icmpge       918
        //   355: aload           8
        //   357: iload           11
        //   359: aaload         
        //   360: astore          13
        //   362: aload           13
        //   364: ifnonnull       374
        //   367: aload           7
        //   369: astore          8
        //   371: goto            908
        //   374: aload           7
        //   376: iload           11
        //   378: aaload         
        //   379: astore          10
        //   381: aload           10
        //   383: ifnonnull       874
        //   386: aload           4
        //   388: iload           11
        //   390: iconst_1       
        //   391: bastore        
        //   392: aload_2        
        //   393: iload           11
        //   395: iaload         
        //   396: istore          9
        //   398: aload_0        
        //   399: getfield        com/google/android/exoplayer2/source/dash/b.p:[Lcom/google/android/exoplayer2/source/dash/b$a;
        //   402: iload           9
        //   404: aaload         
        //   405: astore          10
        //   407: aload           10
        //   409: getfield        com/google/android/exoplayer2/source/dash/b$a.c:I
        //   412: istore          9
        //   414: iload           9
        //   416: ifne            809
        //   419: aload           10
        //   421: getfield        com/google/android/exoplayer2/source/dash/b$a.f:I
        //   424: istore          9
        //   426: iload           9
        //   428: iconst_m1      
        //   429: if_icmpeq       438
        //   432: iconst_1       
        //   433: istore          12
        //   435: goto            441
        //   438: iconst_0       
        //   439: istore          12
        //   441: iload           12
        //   443: ifeq            463
        //   446: aload_0        
        //   447: getfield        com/google/android/exoplayer2/source/dash/b.o:Lac/u;
        //   450: iload           9
        //   452: invokevirtual   ac/u.a:(I)Lac/t;
        //   455: astore          7
        //   457: iconst_1       
        //   458: istore          9
        //   460: goto            469
        //   463: iconst_0       
        //   464: istore          9
        //   466: aconst_null    
        //   467: astore          7
        //   469: aload           10
        //   471: getfield        com/google/android/exoplayer2/source/dash/b$a.g:I
        //   474: istore          14
        //   476: iload           14
        //   478: iconst_m1      
        //   479: if_icmpeq       488
        //   482: iconst_1       
        //   483: istore          15
        //   485: goto            491
        //   488: iconst_0       
        //   489: istore          15
        //   491: iload           15
        //   493: ifeq            520
        //   496: aload_0        
        //   497: getfield        com/google/android/exoplayer2/source/dash/b.o:Lac/u;
        //   500: iload           14
        //   502: invokevirtual   ac/u.a:(I)Lac/t;
        //   505: astore          8
        //   507: iload           9
        //   509: aload           8
        //   511: getfield        ac/t.f:I
        //   514: iadd           
        //   515: istore          9
        //   517: goto            523
        //   520: aconst_null    
        //   521: astore          8
        //   523: iload           9
        //   525: anewarray       Lcom/google/android/exoplayer2/n;
        //   528: astore          16
        //   530: iload           9
        //   532: newarray        I
        //   534: astore          17
        //   536: iload           12
        //   538: ifeq            563
        //   541: aload           16
        //   543: iconst_0       
        //   544: aload           7
        //   546: getfield        ac/t.h:[Lcom/google/android/exoplayer2/n;
        //   549: iconst_0       
        //   550: aaload         
        //   551: aastore        
        //   552: aload           17
        //   554: iconst_0       
        //   555: iconst_5       
        //   556: iastore        
        //   557: iconst_1       
        //   558: istore          9
        //   560: goto            566
        //   563: iconst_0       
        //   564: istore          9
        //   566: new             Ljava/util/ArrayList;
        //   569: dup            
        //   570: invokespecial   java/util/ArrayList.<init>:()V
        //   573: astore          18
        //   575: iload           15
        //   577: ifeq            633
        //   580: iconst_0       
        //   581: istore          15
        //   583: iload           15
        //   585: aload           8
        //   587: getfield        ac/t.f:I
        //   590: if_icmpge       633
        //   593: aload           8
        //   595: getfield        ac/t.h:[Lcom/google/android/exoplayer2/n;
        //   598: iload           15
        //   600: aaload         
        //   601: astore          7
        //   603: aload           16
        //   605: iload           9
        //   607: aload           7
        //   609: aastore        
        //   610: aload           17
        //   612: iload           9
        //   614: iconst_3       
        //   615: iastore        
        //   616: aload           18
        //   618: aload           7
        //   620: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   623: pop            
        //   624: iinc            9, 1
        //   627: iinc            15, 1
        //   630: goto            583
        //   633: aload_0        
        //   634: getfield        com/google/android/exoplayer2/source/dash/b.A:Lec/c;
        //   637: getfield        ec/c.d:Z
        //   640: ifeq            673
        //   643: iload           12
        //   645: ifeq            673
        //   648: aload_0        
        //   649: getfield        com/google/android/exoplayer2/source/dash/b.r:Lcom/google/android/exoplayer2/source/dash/d;
        //   652: astore          7
        //   654: new             Lcom/google/android/exoplayer2/source/dash/d$c;
        //   657: dup            
        //   658: aload           7
        //   660: aload           7
        //   662: getfield        com/google/android/exoplayer2/source/dash/d.f:Lyc/b;
        //   665: invokespecial   com/google/android/exoplayer2/source/dash/d$c.<init>:(Lcom/google/android/exoplayer2/source/dash/d;Lyc/b;)V
        //   668: astore          7
        //   670: goto            676
        //   673: aconst_null    
        //   674: astore          7
        //   676: aload_0        
        //   677: getfield        com/google/android/exoplayer2/source/dash/b.g:Lcom/google/android/exoplayer2/source/dash/a$a;
        //   680: aload_0        
        //   681: getfield        com/google/android/exoplayer2/source/dash/b.m:Lyc/o;
        //   684: aload_0        
        //   685: getfield        com/google/android/exoplayer2/source/dash/b.A:Lec/c;
        //   688: aload_0        
        //   689: getfield        com/google/android/exoplayer2/source/dash/b.k:Ldc/a;
        //   692: aload_0        
        //   693: getfield        com/google/android/exoplayer2/source/dash/b.B:I
        //   696: aload           10
        //   698: getfield        com/google/android/exoplayer2/source/dash/b$a.a:[I
        //   701: aload           13
        //   703: aload           10
        //   705: getfield        com/google/android/exoplayer2/source/dash/b$a.b:I
        //   708: aload_0        
        //   709: getfield        com/google/android/exoplayer2/source/dash/b.l:J
        //   712: iload           12
        //   714: aload           18
        //   716: aload           7
        //   718: aload_0        
        //   719: getfield        com/google/android/exoplayer2/source/dash/b.h:Lyc/s;
        //   722: aload_0        
        //   723: getfield        com/google/android/exoplayer2/source/dash/b.v:Lwa/c0;
        //   726: invokeinterface com/google/android/exoplayer2/source/dash/a$a.a:(Lyc/o;Lec/c;Ldc/a;I[ILwc/f;IJZLjava/util/ArrayList;Lcom/google/android/exoplayer2/source/dash/d$c;Lyc/s;Lwa/c0;)Lcom/google/android/exoplayer2/source/dash/c;
        //   731: astore          8
        //   733: new             Lcc/h;
        //   736: dup            
        //   737: aload           10
        //   739: getfield        com/google/android/exoplayer2/source/dash/b$a.b:I
        //   742: aload           17
        //   744: aload           16
        //   746: aload           8
        //   748: aload_0        
        //   749: aload_0        
        //   750: getfield        com/google/android/exoplayer2/source/dash/b.n:Lyc/b;
        //   753: lload           5
        //   755: aload_0        
        //   756: getfield        com/google/android/exoplayer2/source/dash/b.i:Lcom/google/android/exoplayer2/drm/d;
        //   759: aload_0        
        //   760: getfield        com/google/android/exoplayer2/source/dash/b.u:Lcom/google/android/exoplayer2/drm/c$a;
        //   763: aload_0        
        //   764: getfield        com/google/android/exoplayer2/source/dash/b.j:Lcom/google/android/exoplayer2/upstream/h;
        //   767: aload_0        
        //   768: getfield        com/google/android/exoplayer2/source/dash/b.t:Lcom/google/android/exoplayer2/source/j$a;
        //   771: invokespecial   cc/h.<init>:(I[I[Lcom/google/android/exoplayer2/n;Lcc/i;Lcom/google/android/exoplayer2/source/q$a;Lyc/b;JLcom/google/android/exoplayer2/drm/d;Lcom/google/android/exoplayer2/drm/c$a;Lcom/google/android/exoplayer2/upstream/h;Lcom/google/android/exoplayer2/source/j$a;)V
        //   774: astore          8
        //   776: aload_0        
        //   777: monitorenter   
        //   778: aload_0        
        //   779: getfield        com/google/android/exoplayer2/source/dash/b.s:Ljava/util/IdentityHashMap;
        //   782: aload           8
        //   784: aload           7
        //   786: invokevirtual   java/util/IdentityHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   789: pop            
        //   790: aload_0        
        //   791: monitorexit    
        //   792: aload_3        
        //   793: iload           11
        //   795: aload           8
        //   797: aastore        
        //   798: aload_3        
        //   799: astore          8
        //   801: goto            908
        //   804: astore_1       
        //   805: aload_0        
        //   806: monitorexit    
        //   807: aload_1        
        //   808: athrow         
        //   809: aload           7
        //   811: astore          8
        //   813: iload           9
        //   815: iconst_2       
        //   816: if_icmpne       908
        //   819: aload           7
        //   821: iload           11
        //   823: new             Ldc/e;
        //   826: dup            
        //   827: aload_0        
        //   828: getfield        com/google/android/exoplayer2/source/dash/b.C:Ljava/util/List;
        //   831: aload           10
        //   833: getfield        com/google/android/exoplayer2/source/dash/b$a.d:I
        //   836: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   841: checkcast       Lec/f;
        //   844: aload           13
        //   846: invokeinterface wc/i.h:()Lac/t;
        //   851: getfield        ac/t.h:[Lcom/google/android/exoplayer2/n;
        //   854: iconst_0       
        //   855: aaload         
        //   856: aload_0        
        //   857: getfield        com/google/android/exoplayer2/source/dash/b.A:Lec/c;
        //   860: getfield        ec/c.d:Z
        //   863: invokespecial   dc/e.<init>:(Lec/f;Lcom/google/android/exoplayer2/n;Z)V
        //   866: aastore        
        //   867: aload           7
        //   869: astore          8
        //   871: goto            908
        //   874: aload           7
        //   876: astore          8
        //   878: aload           10
        //   880: instanceof      Lcc/h;
        //   883: ifeq            908
        //   886: aload           10
        //   888: checkcast       Lcc/h;
        //   891: getfield        cc/h.j:Lcc/i;
        //   894: checkcast       Lcom/google/android/exoplayer2/source/dash/a;
        //   897: aload           13
        //   899: invokeinterface com/google/android/exoplayer2/source/dash/a.a:(Lwc/f;)V
        //   904: aload           7
        //   906: astore          8
        //   908: iinc            11, 1
        //   911: aload           8
        //   913: astore          7
        //   915: goto            344
        //   918: iconst_0       
        //   919: istore          9
        //   921: iload           9
        //   923: aload_1        
        //   924: arraylength    
        //   925: if_icmpge       1127
        //   928: aload           7
        //   930: iload           9
        //   932: aaload         
        //   933: ifnonnull       1121
        //   936: aload_1        
        //   937: iload           9
        //   939: aaload         
        //   940: ifnull          1121
        //   943: aload_2        
        //   944: iload           9
        //   946: iaload         
        //   947: istore          11
        //   949: aload_0        
        //   950: getfield        com/google/android/exoplayer2/source/dash/b.p:[Lcom/google/android/exoplayer2/source/dash/b$a;
        //   953: iload           11
        //   955: aaload         
        //   956: astore_3       
        //   957: aload_3        
        //   958: getfield        com/google/android/exoplayer2/source/dash/b$a.c:I
        //   961: iconst_1       
        //   962: if_icmpne       1118
        //   965: aload_0        
        //   966: iload           9
        //   968: aload_2        
        //   969: invokevirtual   com/google/android/exoplayer2/source/dash/b.b:(I[I)I
        //   972: istore          11
        //   974: iload           11
        //   976: iconst_m1      
        //   977: if_icmpne       995
        //   980: aload           7
        //   982: iload           9
        //   984: new             Lac/f;
        //   987: dup            
        //   988: invokespecial   ac/f.<init>:()V
        //   991: aastore        
        //   992: goto            1121
        //   995: aload           7
        //   997: iload           11
        //   999: aaload         
        //  1000: checkcast       Lcc/h;
        //  1003: astore          4
        //  1005: aload_3        
        //  1006: getfield        com/google/android/exoplayer2/source/dash/b$a.b:I
        //  1009: istore          15
        //  1011: iconst_0       
        //  1012: istore          11
        //  1014: iload           11
        //  1016: aload           4
        //  1018: getfield        cc/h.s:[Lcom/google/android/exoplayer2/source/p;
        //  1021: arraylength    
        //  1022: if_icmpge       1110
        //  1025: aload           4
        //  1027: getfield        cc/h.g:[I
        //  1030: iload           11
        //  1032: iaload         
        //  1033: iload           15
        //  1035: if_icmpne       1104
        //  1038: aload           4
        //  1040: getfield        cc/h.i:[Z
        //  1043: iload           11
        //  1045: baload         
        //  1046: iconst_1       
        //  1047: ixor           
        //  1048: invokestatic    ad/d0.f:(Z)V
        //  1051: aload           4
        //  1053: getfield        cc/h.i:[Z
        //  1056: iload           11
        //  1058: iconst_1       
        //  1059: bastore        
        //  1060: aload           4
        //  1062: getfield        cc/h.s:[Lcom/google/android/exoplayer2/source/p;
        //  1065: iload           11
        //  1067: aaload         
        //  1068: lload           5
        //  1070: iconst_1       
        //  1071: invokevirtual   com/google/android/exoplayer2/source/p.y:(JZ)Z
        //  1074: pop            
        //  1075: aload           7
        //  1077: iload           9
        //  1079: new             Lcc/h$a;
        //  1082: dup            
        //  1083: aload           4
        //  1085: aload           4
        //  1087: aload           4
        //  1089: getfield        cc/h.s:[Lcom/google/android/exoplayer2/source/p;
        //  1092: iload           11
        //  1094: aaload         
        //  1095: iload           11
        //  1097: invokespecial   cc/h$a.<init>:(Lcc/h;Lcc/h;Lcom/google/android/exoplayer2/source/p;I)V
        //  1100: aastore        
        //  1101: goto            1121
        //  1104: iinc            11, 1
        //  1107: goto            1014
        //  1110: new             Ljava/lang/IllegalStateException;
        //  1113: dup            
        //  1114: invokespecial   java/lang/IllegalStateException.<init>:()V
        //  1117: athrow         
        //  1118: goto            1121
        //  1121: iinc            9, 1
        //  1124: goto            921
        //  1127: new             Ljava/util/ArrayList;
        //  1130: dup            
        //  1131: invokespecial   java/util/ArrayList.<init>:()V
        //  1134: astore_2       
        //  1135: new             Ljava/util/ArrayList;
        //  1138: dup            
        //  1139: invokespecial   java/util/ArrayList.<init>:()V
        //  1142: astore_1       
        //  1143: aload           7
        //  1145: arraylength    
        //  1146: istore          11
        //  1148: iconst_0       
        //  1149: istore          9
        //  1151: iload           9
        //  1153: iload           11
        //  1155: if_icmpge       1205
        //  1158: aload           7
        //  1160: iload           9
        //  1162: aaload         
        //  1163: astore_3       
        //  1164: aload_3        
        //  1165: instanceof      Lcc/h;
        //  1168: ifeq            1183
        //  1171: aload_2        
        //  1172: aload_3        
        //  1173: checkcast       Lcc/h;
        //  1176: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1179: pop            
        //  1180: goto            1199
        //  1183: aload_3        
        //  1184: instanceof      Ldc/e;
        //  1187: ifeq            1199
        //  1190: aload_1        
        //  1191: aload_3        
        //  1192: checkcast       Ldc/e;
        //  1195: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1198: pop            
        //  1199: iinc            9, 1
        //  1202: goto            1151
        //  1205: aload_2        
        //  1206: invokevirtual   java/util/ArrayList.size:()I
        //  1209: anewarray       Lcc/h;
        //  1212: astore_3       
        //  1213: aload_0        
        //  1214: aload_3        
        //  1215: putfield        com/google/android/exoplayer2/source/dash/b.x:[Lcc/h;
        //  1218: aload_2        
        //  1219: aload_3        
        //  1220: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  1223: pop            
        //  1224: aload_1        
        //  1225: invokevirtual   java/util/ArrayList.size:()I
        //  1228: anewarray       Ldc/e;
        //  1231: astore_2       
        //  1232: aload_0        
        //  1233: aload_2        
        //  1234: putfield        com/google/android/exoplayer2/source/dash/b.y:[Ldc/e;
        //  1237: aload_1        
        //  1238: aload_2        
        //  1239: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  1242: pop            
        //  1243: aload_0        
        //  1244: getfield        com/google/android/exoplayer2/source/dash/b.q:Ldn/a;
        //  1247: astore_1       
        //  1248: aload_0        
        //  1249: getfield        com/google/android/exoplayer2/source/dash/b.x:[Lcc/h;
        //  1252: astore_2       
        //  1253: aload_1        
        //  1254: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1257: pop            
        //  1258: aload_0        
        //  1259: new             Lz0/d1;
        //  1262: dup            
        //  1263: aload_2        
        //  1264: invokespecial   z0/d1.<init>:(Ljava/lang/Object;)V
        //  1267: putfield        com/google/android/exoplayer2/source/dash/b.z:Lz0/d1;
        //  1270: lload           5
        //  1272: lreturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  778    792    804    809    Any
        //  805    807    804    809    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void v() throws IOException {
        this.m.b();
    }
    
    public final void y(final long n, final boolean b) {
        final cc.h<com.google.android.exoplayer2.source.dash.a>[] x = this.x;
        for (int length = x.length, i = 0; i < length; ++i) {
            x[i].y(n, b);
        }
    }
    
    public static final class a
    {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        
        public a(final int b, final int c, final int[] a, final int e, final int f, final int g, final int d) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.e = e;
            this.f = f;
            this.g = g;
            this.d = d;
        }
    }
}
