// 
// Decompiled by Procyon v0.6.0
// 

package xc;

import android.os.BaseBundle;
import java.util.AbstractCollection;
import com.google.android.exoplayer2.f;
import bd.b;
import com.google.common.primitives.Ints;
import android.os.Bundle;
import java.util.Iterator;
import android.util.SparseBooleanArray;
import java.util.Map;
import com.google.android.exoplayer2.m;
import bc.s;
import bc.t;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import android.util.Pair;
import bd.p;
import android.util.SparseArray;
import bd.c0;
import android.text.TextUtils;
import e2.n;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicReference;
import com.google.common.collect.Ordering;

public final class d extends g
{
    public static final Ordering<Integer> e;
    public static final Ordering<Integer> f;
    public final e$b c;
    public final AtomicReference<c> d;
    
    static {
        e = Ordering.from((Comparator)new w3.d(2));
        f = Ordering.from((Comparator)new n(4));
    }
    
    public d(final c c, final a$b c2) {
        this.c = (e$b)c2;
        this.d = new AtomicReference<c>(c);
    }
    
    public static int c(final com.google.android.exoplayer2.n n, String f, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)f) && f.equals(n.h)) {
            return 4;
        }
        f = f(f);
        final String f2 = f(n.h);
        final boolean b2 = false;
        if (f2 == null || f == null) {
            int n2 = b2 ? 1 : 0;
            if (b) {
                n2 = (b2 ? 1 : 0);
                if (f2 == null) {
                    n2 = 1;
                }
            }
            return n2;
        }
        if (f2.startsWith(f) || f.startsWith(f2)) {
            return 3;
        }
        final int a = c0.a;
        if (f2.split("-", 2)[0].equals(f.split("-", 2)[0])) {
            return 2;
        }
        return 0;
    }
    
    public static boolean d(int n, final boolean b) {
        n &= 0x7;
        return n == 4 || (b && n == 3);
    }
    
    public static void e(final SparseArray sparseArray, final j$a j$a, final int n) {
        if (j$a == null) {
            return;
        }
        final int i = p.i(j$a.f.h[0].q);
        final Pair pair = (Pair)sparseArray.get(i);
        if (pair == null || ((AbstractCollection)((j$a)pair.first).g).isEmpty()) {
            sparseArray.put(i, (Object)Pair.create((Object)j$a, (Object)n));
        }
    }
    
    public static String f(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final String s2 = s;
            if (!TextUtils.equals((CharSequence)s, (CharSequence)"und")) {
                return s2;
            }
        }
        return null;
    }
    
    public static Pair g(int i, final g$a g$a, final int[][][] array, final d$g$a d$g$a, final Comparator comparator) {
        final ArrayList list = new ArrayList();
        int n;
        for (int a = g$a.a, j = 0; j < a; ++j, a = n) {
            n = a;
            if (i == g$a.b[j]) {
                final t t = g$a.c[j];
                int n2 = 0;
                while (true) {
                    n = a;
                    if (n2 >= t.f) {
                        break;
                    }
                    final s a2 = t.a(n2);
                    final ImmutableList e = d$g$a.e(j, a2, array[j][n2]);
                    final boolean[] array2 = new boolean[a2.f];
                    for (int k = 0; k < a2.f; ++k) {
                        final d.d$g d$g = ((List<d.d$g>)e).get(k);
                        final int a3 = d$g.a();
                        if (!array2[k]) {
                            if (a3 != 0) {
                                Object of;
                                if (a3 == 1) {
                                    of = ImmutableList.of((Object)d$g);
                                }
                                else {
                                    of = new ArrayList<d.d$g>();
                                    ((ArrayList<d.d$g>)of).add(d$g);
                                    for (int l = k + 1; l < a2.f; ++l) {
                                        final d.d$g d$g2 = ((List<d.d$g>)e).get(l);
                                        if (d$g2.a() == 2 && d$g.c(d$g2)) {
                                            ((ArrayList<d.d$g>)of).add(d$g2);
                                            array2[l] = true;
                                        }
                                    }
                                }
                                list.add(of);
                            }
                        }
                    }
                    ++n2;
                }
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        final List list2 = Collections.max((Collection<? extends List>)list, (Comparator<? super List>)comparator);
        final int[] array3 = new int[list2.size()];
        for (i = 0; i < list2.size(); ++i) {
            array3[i] = ((d.d$g)list2.get(i)).h;
        }
        final d.d$g d$g3 = (d.d$g)list2.get(0);
        return Pair.create((Object)new e$a(0, d$g3.g, array3), (Object)d$g3.f);
    }
    
    public final void h(final c c) {
        if (!this.d.getAndSet(c).equals(c)) {
            final m$a a = ((xc.m)this).a;
            if (a != null) {
                ((m)a).m.k(10);
            }
        }
    }
    
    public static final class c extends k
    {
        public static final c U;
        public final int F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final boolean N;
        public final boolean O;
        public final boolean P;
        public final boolean Q;
        public final boolean R;
        public final SparseArray<Map<t, d$e>> S;
        public final SparseBooleanArray T;
        
        static {
            U = new d$d().e();
        }
        
        public c(final d$d d$d) {
            super((k$a)d$d);
            this.G = d$d.z;
            this.H = d$d.A;
            this.I = d$d.B;
            this.J = d$d.C;
            this.K = d$d.D;
            this.L = d$d.E;
            this.M = d$d.F;
            this.N = d$d.G;
            this.O = d$d.H;
            this.F = d$d.I;
            this.P = d$d.J;
            this.Q = d$d.K;
            this.R = d$d.L;
            this.S = (SparseArray<Map<t, d$e>>)d$d.M;
            this.T = d$d.N;
        }
        
        public static String a(final int n) {
            return Integer.toString(n, 36);
        }
        
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && c.class == o.getClass()) {
                final c c = (c)o;
                if (super.equals((Object)c) && this.G == c.G && this.H == c.H && this.I == c.I && this.J == c.J && this.K == c.K && this.L == c.L && this.M == c.M && this.N == c.N && this.O == c.O && this.F == c.F && this.P == c.P && this.Q == c.Q && this.R == c.R) {
                    final SparseBooleanArray t = this.T;
                    final SparseBooleanArray t2 = c.T;
                    final int size = t.size();
                    boolean b2 = false;
                    Label_0259: {
                        Label_0223: {
                            if (t2.size() == size) {
                                for (int i = 0; i < size; ++i) {
                                    if (t2.indexOfKey(t.keyAt(i)) < 0) {
                                        break Label_0223;
                                    }
                                }
                                b2 = true;
                                break Label_0259;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        final SparseArray<Map<t, d$e>> s = this.S;
                        final SparseArray<Map<t, d$e>> s2 = c.S;
                        final int size2 = s.size();
                        boolean b4 = false;
                        Label_0466: {
                            Label_0291: {
                                if (s2.size() == size2) {
                                    for (int j = 0; j < size2; ++j) {
                                        final int indexOfKey = s2.indexOfKey(s.keyAt(j));
                                        if (indexOfKey < 0) {
                                            break Label_0291;
                                        }
                                        final Map map = (Map)s.valueAt(j);
                                        final Map map2 = (Map)s2.valueAt(indexOfKey);
                                        boolean b3 = false;
                                        Label_0451: {
                                            Label_0444: {
                                                if (map2.size() == map.size()) {
                                                    for (final Map.Entry<t, V> entry : map.entrySet()) {
                                                        final t t3 = entry.getKey();
                                                        if (!map2.containsKey(t3) || !c0.a((Object)entry.getValue(), map2.get(t3))) {
                                                            break Label_0444;
                                                        }
                                                    }
                                                    b3 = true;
                                                    break Label_0451;
                                                }
                                            }
                                            b3 = false;
                                        }
                                        if (!b3) {
                                            break Label_0291;
                                        }
                                    }
                                    b4 = true;
                                    break Label_0466;
                                }
                            }
                            b4 = false;
                        }
                        if (b4) {
                            return b;
                        }
                    }
                }
                b = false;
                return b;
            }
            return false;
        }
        
        public final int hashCode() {
            return (((((((((((((super.hashCode() + 31) * 31 + (this.G ? 1 : 0)) * 31 + (this.H ? 1 : 0)) * 31 + (this.I ? 1 : 0)) * 31 + (this.J ? 1 : 0)) * 31 + (this.K ? 1 : 0)) * 31 + (this.L ? 1 : 0)) * 31 + (this.M ? 1 : 0)) * 31 + (this.N ? 1 : 0)) * 31 + (this.O ? 1 : 0)) * 31 + this.F) * 31 + (this.P ? 1 : 0)) * 31 + (this.Q ? 1 : 0)) * 31 + (this.R ? 1 : 0);
        }
        
        public final Bundle toBundle() {
            final Bundle bundle = super.toBundle();
            ((BaseBundle)bundle).putBoolean(a(1000), this.G);
            ((BaseBundle)bundle).putBoolean(a(1001), this.H);
            ((BaseBundle)bundle).putBoolean(a(1002), this.I);
            ((BaseBundle)bundle).putBoolean(a(1015), this.J);
            ((BaseBundle)bundle).putBoolean(a(1003), this.K);
            ((BaseBundle)bundle).putBoolean(a(1004), this.L);
            ((BaseBundle)bundle).putBoolean(a(1005), this.M);
            ((BaseBundle)bundle).putBoolean(a(1006), this.N);
            ((BaseBundle)bundle).putBoolean(a(1016), this.O);
            ((BaseBundle)bundle).putInt(a(1007), this.F);
            ((BaseBundle)bundle).putBoolean(a(1008), this.P);
            ((BaseBundle)bundle).putBoolean(a(1009), this.Q);
            ((BaseBundle)bundle).putBoolean(a(1010), this.R);
            final SparseArray<Map<t, d$e>> s = this.S;
            final ArrayList list = new ArrayList();
            final ArrayList list2 = new ArrayList();
            final SparseArray sparseArray = new SparseArray();
            final int n = 0;
            for (int i = 0; i < s.size(); ++i) {
                final int key = s.keyAt(i);
                for (final Map.Entry<K, d$e> entry : ((Map)s.valueAt(i)).entrySet()) {
                    final d$e d$e = entry.getValue();
                    if (d$e != null) {
                        sparseArray.put(list2.size(), (Object)d$e);
                    }
                    list2.add(entry.getKey());
                    list.add(key);
                }
                ((BaseBundle)bundle).putIntArray(a(1011), Ints.v0((Collection)list));
                bundle.putParcelableArrayList(a(1012), b.d((Collection)list2));
                final String a = a(1013);
                final SparseArray sparseArray2 = new SparseArray(sparseArray.size());
                for (int j = 0; j < sparseArray.size(); ++j) {
                    sparseArray2.put(sparseArray.keyAt(j), (Object)((f)sparseArray.valueAt(j)).toBundle());
                }
                bundle.putSparseParcelableArray(a, sparseArray2);
            }
            final String a2 = a(1014);
            final SparseBooleanArray t = this.T;
            final int[] array = new int[t.size()];
            for (int k = n; k < t.size(); ++k) {
                array[k] = t.keyAt(k);
            }
            ((BaseBundle)bundle).putIntArray(a2, array);
            return bundle;
        }
    }
}
