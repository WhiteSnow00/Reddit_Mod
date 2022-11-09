// 
// Decompiled by Procyon v0.6.0
// 

package xc;

import android.os.BaseBundle;
import java.util.AbstractCollection;
import com.google.common.collect.h$a;
import java.util.Arrays;
import android.view.accessibility.CaptioningManager;
import android.os.Looper;
import java.util.HashMap;
import com.google.android.exoplayer2.f$a;
import android.content.Context;
import bd.b;
import com.google.common.primitives.Ints;
import android.os.Bundle;
import java.util.Iterator;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Locale;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.exoplayer2.m;
import bc.t;
import bc.u;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import android.util.Pair;
import bd.o;
import android.util.SparseArray;
import bd.c0;
import android.text.TextUtils;
import com.google.android.exoplayer2.n;
import wb.d;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicReference;
import com.google.common.collect.Ordering;

public final class e extends xc.h
{
    public static final Ordering<Integer> e;
    public static final Ordering<Integer> f;
    public final xc.f.b c;
    public final AtomicReference<c> d;
    
    static {
        e = Ordering.from((Comparator)new zb.f(2));
        f = Ordering.from((Comparator)new wb.d(1));
    }
    
    public e(final c c, final xc.a.b c2) {
        this.c = c2;
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
    
    public static void e(final SparseArray sparseArray, final k.a a, final int n) {
        if (a == null) {
            return;
        }
        final int i = o.i(a.f.h[0].q);
        final Pair pair = (Pair)sparseArray.get(i);
        if (pair == null || ((AbstractCollection)((k.a)pair.first).g).isEmpty()) {
            sparseArray.put(i, (Object)Pair.create((Object)a, (Object)n));
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
    
    public static Pair g(int i, final xc.h.a a, final int[][][] array, final g.a a2, final Comparator comparator) {
        final ArrayList list = new ArrayList();
        int n;
        for (int a3 = a.a, j = 0; j < a3; ++j, a3 = n) {
            n = a3;
            if (i == a.b[j]) {
                final u u = a.c[j];
                int n2 = 0;
                while (true) {
                    n = a3;
                    if (n2 >= u.f) {
                        break;
                    }
                    final t a4 = u.a(n2);
                    final ImmutableList c = a2.c(j, a4, array[j][n2]);
                    final boolean[] array2 = new boolean[a4.f];
                    for (int k = 0; k < a4.f; ++k) {
                        final g g = ((List<g>)c).get(k);
                        final int a5 = g.a();
                        if (!array2[k]) {
                            if (a5 != 0) {
                                Object of;
                                if (a5 == 1) {
                                    of = ImmutableList.of((Object)g);
                                }
                                else {
                                    of = new ArrayList<g>();
                                    ((ArrayList<g>)of).add(g);
                                    for (int l = k + 1; l < a4.f; ++l) {
                                        final g g2 = ((List<g>)c).get(l);
                                        if (g2.a() == 2 && g.b(g2)) {
                                            ((ArrayList<g>)of).add(g2);
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
            array3[i] = ((g)list2.get(i)).h;
        }
        final g g3 = (g)list2.get(0);
        return Pair.create((Object)new xc.f.a(0, g3.g, array3), (Object)g3.f);
    }
    
    public final void h(final c c) {
        if (!this.d.getAndSet(c).equals(c)) {
            final n.a a = super.a;
            if (a != null) {
                ((m)a).m.k(10);
            }
        }
    }
    
    public static final class a extends g<a> implements Comparable<a>
    {
        public final boolean A;
        public final int j;
        public final boolean k;
        public final String l;
        public final c m;
        public final boolean n;
        public final int o;
        public final int p;
        public final int q;
        public final boolean r;
        public final int s;
        public final int t;
        public final boolean u;
        public final int v;
        public final int w;
        public final int x;
        public final int y;
        public final boolean z;
        
        public a(int i, final t t, int n, final c m, final int n2, final boolean b) {
            super(i, n, t);
            this.m = m;
            this.l = xc.e.f(super.i.h);
            final int n3 = 0;
            this.n = xc.e.d(n2, false);
            i = 0;
            int n4;
            while (true) {
                n = ((AbstractCollection)m.s).size();
                n4 = Integer.MAX_VALUE;
                if (i >= n) {
                    n = 0;
                    i = Integer.MAX_VALUE;
                    break;
                }
                n = xc.e.c(super.i, ((List<String>)m.s).get(i), false);
                if (n > 0) {
                    break;
                }
                ++i;
            }
            this.p = i;
            this.o = n;
            n = super.i.j;
            i = m.t;
            if (n != 0 && n == i) {
                i = Integer.MAX_VALUE;
            }
            else {
                i = Integer.bitCount(n & i);
            }
            this.q = i;
            final com.google.android.exoplayer2.n j = super.i;
            i = j.j;
            this.r = (i == 0 || (i & 0x1) != 0x0);
            this.u = ((j.i & 0x1) != 0x0);
            n = j.D;
            this.v = n;
            this.w = j.E;
            i = j.m;
            this.x = i;
            this.k = ((i == -1 || i <= m.v) && (n == -1 || n <= m.u));
            final Configuration configuration = Resources.getSystem().getConfiguration();
            i = c0.a;
            String[] split;
            if (i >= 24) {
                split = configuration.getLocales().toLanguageTags().split(",", -1);
            }
            else {
                final Locale locale = configuration.locale;
                String s;
                if (i >= 21) {
                    s = locale.toLanguageTag();
                }
                else {
                    s = locale.toString();
                }
                split = new String[] { s };
            }
            for (i = 0; i < split.length; ++i) {
                split[i] = c0.K(split[i]);
            }
            while (true) {
                String q;
                c k;
                for (i = 0; i < split.length; ++i) {
                    n = xc.e.c(super.i, split[i], false);
                    if (n > 0) {
                        this.s = i;
                        this.t = n;
                        i = 0;
                        while (true) {
                            n = n4;
                            if (i >= ((AbstractCollection)m.w).size()) {
                                break;
                            }
                            q = super.i.q;
                            if (q != null && q.equals(((List<Object>)m.w).get(i))) {
                                n = i;
                                break;
                            }
                            ++i;
                        }
                        this.y = n;
                        this.z = ((n2 & 0x80) == 0x80);
                        this.A = ((n2 & 0x40) == 0x40);
                        Label_0650: {
                            if (!xc.e.d(n2, this.m.P)) {
                                i = n3;
                            }
                            else if (!this.k && !this.m.K) {
                                i = n3;
                            }
                            else {
                                if (xc.e.d(n2, false) && this.k && super.i.m != -1) {
                                    k = this.m;
                                    if (!k.B && !k.A && (k.R || !b)) {
                                        i = 2;
                                        break Label_0650;
                                    }
                                }
                                i = 1;
                            }
                        }
                        this.j = i;
                        return;
                    }
                }
                n = 0;
                i = Integer.MAX_VALUE;
                continue;
            }
        }
        
        @Override
        public final int a() {
            return this.j;
        }
        
        @Override
        public final boolean b(final g g) {
            final a a = (a)g;
            final c m = this.m;
            if (!m.N) {
                final int d = super.i.D;
                if (d == -1 || d != a.i.D) {
                    return false;
                }
            }
            if (!m.L) {
                final String q = super.i.q;
                if (q == null || !TextUtils.equals((CharSequence)q, (CharSequence)a.i.q)) {
                    return false;
                }
            }
            final c i = this.m;
            if (!i.M) {
                final int e = super.i.E;
                if (e == -1 || e != a.i.E) {
                    return false;
                }
            }
            if (i.O || (this.z == a.z && this.A == a.A)) {
                return true;
            }
            return false;
        }
        
        public final int c(final a a) {
            Ordering ordering;
            if (this.k && this.n) {
                ordering = xc.e.e;
            }
            else {
                ordering = xc.e.e.reverse();
            }
            final com.google.common.collect.h b = com.google.common.collect.h.a.c(this.n, a.n).b((Comparator)Ordering.natural().reverse(), (Object)this.p, (Object)a.p).a(this.o, a.o).a(this.q, a.q).c(this.u, a.u).c(this.r, a.r).b((Comparator)Ordering.natural().reverse(), (Object)this.s, (Object)a.s).a(this.t, a.t).c(this.k, a.k).b((Comparator)Ordering.natural().reverse(), (Object)this.y, (Object)a.y);
            final int x = this.x;
            final int x2 = a.x;
            Ordering ordering2;
            if (this.m.A) {
                ordering2 = xc.e.e.reverse();
            }
            else {
                ordering2 = xc.e.f;
            }
            final com.google.common.collect.h b2 = b.b((Comparator)ordering2, (Object)x, (Object)x2).c(this.z, a.z).c(this.A, a.A).b((Comparator)ordering, (Object)this.v, (Object)a.v).b((Comparator)ordering, (Object)this.w, (Object)a.w);
            final int x3 = this.x;
            final int x4 = a.x;
            if (!c0.a(this.l, a.l)) {
                ordering = xc.e.f;
            }
            return b2.b((Comparator)ordering, (Object)x3, (Object)x4).e();
        }
    }
    
    public static final class b implements Comparable<b>
    {
        public final boolean f;
        public final boolean g;
        
        public b(final int n, final com.google.android.exoplayer2.n n2) {
            final int i = n2.i;
            boolean f = true;
            if ((i & 0x1) == 0x0) {
                f = false;
            }
            this.f = f;
            this.g = xc.e.d(n, false);
        }
        
        @Override
        public final int compareTo(final Object o) {
            final b b = (b)o;
            return com.google.common.collect.h.a.c(this.g, b.g).c(this.f, b.f).e();
        }
    }
    
    public static final class c extends l
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
        public final SparseArray<Map<u, e>> S;
        public final SparseBooleanArray T;
        
        static {
            U = new d().e();
        }
        
        public c(final d d) {
            super((l.a)d);
            this.G = d.z;
            this.H = d.A;
            this.I = d.B;
            this.J = d.C;
            this.K = d.D;
            this.L = d.E;
            this.M = d.F;
            this.N = d.G;
            this.O = d.H;
            this.F = d.I;
            this.P = d.J;
            this.Q = d.K;
            this.R = d.L;
            this.S = d.M;
            this.T = d.N;
        }
        
        public static String a(final int n) {
            return Integer.toString(n, 36);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && c.class == o.getClass()) {
                final c c = (c)o;
                if (super.equals(c) && this.G == c.G && this.H == c.H && this.I == c.I && this.J == c.J && this.K == c.K && this.L == c.L && this.M == c.M && this.N == c.N && this.O == c.O && this.F == c.F && this.P == c.P && this.Q == c.Q && this.R == c.R) {
                    final SparseBooleanArray t = this.T;
                    final SparseBooleanArray t2 = c.T;
                    final int size = t.size();
                    boolean b2 = false;
                    Label_0250: {
                        Label_0208: {
                            if (t2.size() == size) {
                                for (int i = 0; i < size; ++i) {
                                    if (t2.indexOfKey(t.keyAt(i)) < 0) {
                                        break Label_0208;
                                    }
                                }
                                b2 = true;
                                break Label_0250;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        final SparseArray<Map<u, e>> s = this.S;
                        final SparseArray<Map<u, e>> s2 = c.S;
                        final int size2 = s.size();
                        boolean b4 = false;
                        Label_0467: {
                            Label_0282: {
                                if (s2.size() == size2) {
                                    for (int j = 0; j < size2; ++j) {
                                        final int indexOfKey = s2.indexOfKey(s.keyAt(j));
                                        if (indexOfKey < 0) {
                                            break Label_0282;
                                        }
                                        final Map map = (Map)s.valueAt(j);
                                        final Map map2 = (Map)s2.valueAt(indexOfKey);
                                        boolean b3 = false;
                                        Label_0450: {
                                            Label_0441: {
                                                if (map2.size() == map.size()) {
                                                    for (final Map.Entry<u, V> entry : map.entrySet()) {
                                                        final u u = entry.getKey();
                                                        if (!map2.containsKey(u) || !c0.a(entry.getValue(), map2.get(u))) {
                                                            break Label_0441;
                                                        }
                                                    }
                                                    b3 = true;
                                                    break Label_0450;
                                                }
                                            }
                                            b3 = false;
                                        }
                                        if (!b3) {
                                            break Label_0282;
                                        }
                                    }
                                    b4 = true;
                                    break Label_0467;
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
        
        @Override
        public final int hashCode() {
            return (((((((((((((super.hashCode() + 31) * 31 + (this.G ? 1 : 0)) * 31 + (this.H ? 1 : 0)) * 31 + (this.I ? 1 : 0)) * 31 + (this.J ? 1 : 0)) * 31 + (this.K ? 1 : 0)) * 31 + (this.L ? 1 : 0)) * 31 + (this.M ? 1 : 0)) * 31 + (this.N ? 1 : 0)) * 31 + (this.O ? 1 : 0)) * 31 + this.F) * 31 + (this.P ? 1 : 0)) * 31 + (this.Q ? 1 : 0)) * 31 + (this.R ? 1 : 0);
        }
        
        @Override
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
            final SparseArray<Map<u, e>> s = this.S;
            final ArrayList list = new ArrayList();
            final ArrayList list2 = new ArrayList();
            final SparseArray sparseArray = new SparseArray();
            final int n = 0;
            for (int i = 0; i < s.size(); ++i) {
                final int key = s.keyAt(i);
                for (final Map.Entry<K, e> entry : ((Map)s.valueAt(i)).entrySet()) {
                    final e e = entry.getValue();
                    if (e != null) {
                        sparseArray.put(list2.size(), (Object)e);
                    }
                    list2.add(entry.getKey());
                    list.add(key);
                }
                ((BaseBundle)bundle).putIntArray(a(1011), Ints.v2((Collection)list));
                bundle.putParcelableArrayList(a(1012), (ArrayList)bd.b.d((Collection<com.google.android.exoplayer2.f>)list2));
                final String a = a(1013);
                final SparseArray sparseArray2 = new SparseArray(sparseArray.size());
                for (int j = 0; j < sparseArray.size(); ++j) {
                    sparseArray2.put(sparseArray.keyAt(j), (Object)((com.google.android.exoplayer2.f)sparseArray.valueAt(j)).toBundle());
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
    
    public static final class d extends l.a
    {
        public boolean A;
        public boolean B;
        public boolean C;
        public boolean D;
        public boolean E;
        public boolean F;
        public boolean G;
        public boolean H;
        public int I;
        public boolean J;
        public boolean K;
        public boolean L;
        public final SparseArray<Map<u, e>> M;
        public final SparseBooleanArray N;
        public boolean z;
        
        @Deprecated
        public d() {
            this.M = (SparseArray<Map<u, e>>)new SparseArray();
            this.N = new SparseBooleanArray();
            this.f();
        }
        
        public d(final Context context) {
            this.g(context);
            super.d(context);
            this.M = (SparseArray<Map<u, e>>)new SparseArray();
            this.N = new SparseBooleanArray();
            this.f();
        }
        
        public d(final Bundle bundle) {
            super(bundle);
            final c u = c.U;
            this.z = ((BaseBundle)bundle).getBoolean(c.a(1000), u.G);
            this.A = ((BaseBundle)bundle).getBoolean(c.a(1001), u.H);
            this.B = ((BaseBundle)bundle).getBoolean(c.a(1002), u.I);
            this.C = ((BaseBundle)bundle).getBoolean(c.a(1015), u.J);
            this.D = ((BaseBundle)bundle).getBoolean(c.a(1003), u.K);
            this.E = ((BaseBundle)bundle).getBoolean(c.a(1004), u.L);
            this.F = ((BaseBundle)bundle).getBoolean(c.a(1005), u.M);
            this.G = ((BaseBundle)bundle).getBoolean(c.a(1006), u.N);
            this.H = ((BaseBundle)bundle).getBoolean(c.a(1016), u.O);
            this.I = ((BaseBundle)bundle).getInt(c.a(1007), u.F);
            this.J = ((BaseBundle)bundle).getBoolean(c.a(1008), u.P);
            this.K = ((BaseBundle)bundle).getBoolean(c.a(1009), u.Q);
            this.L = ((BaseBundle)bundle).getBoolean(c.a(1010), u.R);
            this.M = (SparseArray<Map<u, e>>)new SparseArray();
            final int[] intArray = ((BaseBundle)bundle).getIntArray(c.a(1011));
            final List b = bd.b.b((f$a)bc.u.j, bundle.getParcelableArrayList(c.a(1012)), ImmutableList.of());
            final sa.k i = xc.e.e.i;
            final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(c.a(1013));
            SparseArray sparseArray = new SparseArray();
            final int n = 0;
            if (sparseParcelableArray != null) {
                final SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                int n2 = 0;
                while (true) {
                    sparseArray = sparseArray2;
                    if (n2 >= sparseParcelableArray.size()) {
                        break;
                    }
                    sparseArray2.put(sparseParcelableArray.keyAt(n2), (Object)i.a((Bundle)sparseParcelableArray.valueAt(n2)));
                    ++n2;
                }
            }
            if (intArray != null) {
                if (intArray.length == b.size()) {
                    for (int j = 0; j < intArray.length; ++j) {
                        final int n3 = intArray[j];
                        final u u2 = b.get(j);
                        final e e = (e)sparseArray.get(j);
                        Map map;
                        if ((map = (Map)this.M.get(n3)) == null) {
                            map = new HashMap();
                            this.M.put(n3, (Object)map);
                        }
                        if (!map.containsKey(u2) || !c0.a(map.get(u2), e)) {
                            map.put(u2, e);
                        }
                    }
                }
            }
            final int[] intArray2 = ((BaseBundle)bundle).getIntArray(c.a(1014));
            SparseBooleanArray n4;
            if (intArray2 == null) {
                n4 = new SparseBooleanArray();
            }
            else {
                n4 = new SparseBooleanArray(intArray2.length);
                for (int length = intArray2.length, k = n; k < length; ++k) {
                    n4.append(intArray2[k], true);
                }
            }
            this.N = n4;
        }
        
        public d(final c c) {
            super(c);
            this.I = c.F;
            this.z = c.G;
            this.A = c.H;
            this.B = c.I;
            this.C = c.J;
            this.D = c.K;
            this.E = c.L;
            this.F = c.M;
            this.G = c.N;
            this.H = c.O;
            this.J = c.P;
            this.K = c.Q;
            this.L = c.R;
            final SparseArray<Map<u, e>> s = c.S;
            final SparseArray m = new SparseArray();
            for (int i = 0; i < s.size(); ++i) {
                m.put(s.keyAt(i), (Object)new HashMap((Map<?, ?>)s.valueAt(i)));
            }
            this.M = (SparseArray<Map<u, e>>)m;
            this.N = c.T.clone();
        }
        
        @Override
        public final l.a c(final int n, final int n2, final boolean b) {
            super.c(n, n2, true);
            return this;
        }
        
        public final c e() {
            return new c(this);
        }
        
        public final void f() {
            this.z = true;
            this.A = false;
            this.B = true;
            this.C = false;
            this.D = true;
            this.E = false;
            this.F = false;
            this.G = false;
            this.H = false;
            this.I = 0;
            this.J = true;
            this.K = false;
            this.L = true;
        }
        
        public final void g(final Context context) {
            final int a = c0.a;
            if (a >= 19) {
                if (a >= 23 || Looper.myLooper() != null) {
                    final CaptioningManager captioningManager = (CaptioningManager)context.getSystemService("captioning");
                    if (captioningManager != null) {
                        if (captioningManager.isEnabled()) {
                            super.t = 1088;
                            final Locale locale = captioningManager.getLocale();
                            if (locale != null) {
                                String s;
                                if (a >= 21) {
                                    s = locale.toLanguageTag();
                                }
                                else {
                                    s = locale.toString();
                                }
                                super.s = ImmutableList.of((Object)s);
                            }
                        }
                    }
                }
            }
        }
        
        public final void h(final int n, final int n2) {
            super.c(n, n2, false);
        }
        
        public final void i(final Context context) {
            super.d(context);
        }
    }
    
    public static final class e implements com.google.android.exoplayer2.f
    {
        public static final sa.k i;
        public final int f;
        public final int[] g;
        public final int h;
        
        static {
            i = new sa.k(11);
        }
        
        public e() {
            throw null;
        }
        
        public e(final int f, final int h, int[] copy) {
            this.f = f;
            copy = Arrays.copyOf(copy, copy.length);
            this.g = copy;
            this.h = h;
            Arrays.sort(copy);
        }
        
        public static String a(final int n) {
            return Integer.toString(n, 36);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && e.class == o.getClass()) {
                final e e = (e)o;
                if (this.f != e.f || !Arrays.equals(this.g, e.g) || this.h != e.h) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return (Arrays.hashCode(this.g) + this.f * 31) * 31 + this.h;
        }
        
        public final Bundle toBundle() {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt(a(0), this.f);
            ((BaseBundle)bundle).putIntArray(a(1), this.g);
            ((BaseBundle)bundle).putInt(a(2), this.h);
            return bundle;
        }
    }
    
    public static final class f extends g<f> implements Comparable<f>
    {
        public final int j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final int n;
        public final int o;
        public final int p;
        public final int q;
        public final boolean r;
        
        public f(int n, final t t, int n2, final c c, final int n3, final String s) {
            super(n, n2, t);
            final int n4 = 0;
            this.k = xc.e.d(n3, false);
            n = (super.i.i & ~c.F);
            this.l = ((n & 0x1) != 0x0);
            this.m = ((n & 0x2) != 0x0);
            ImmutableList list;
            if (((AbstractCollection)c.x).isEmpty()) {
                list = ImmutableList.of((Object)"");
            }
            else {
                list = c.x;
            }
            n = 0;
            int n5;
            while (true) {
                n2 = ((AbstractCollection)list).size();
                n5 = Integer.MAX_VALUE;
                if (n >= n2) {
                    n2 = 0;
                    n = Integer.MAX_VALUE;
                    break;
                }
                n2 = xc.e.c(super.i, ((List<String>)list).get(n), c.z);
                if (n2 > 0) {
                    break;
                }
                ++n;
            }
            this.n = n;
            this.o = n2;
            n = super.i.j;
            final int y = c.y;
            if (n != 0 && n == y) {
                n = n5;
            }
            else {
                n = Integer.bitCount(n & y);
            }
            this.p = n;
            this.r = ((super.i.j & 0x440) != 0x0);
            final int c2 = xc.e.c(super.i, s, xc.e.f(s) == null);
            this.q = c2;
            if (n2 <= 0 && (!((AbstractCollection)c.x).isEmpty() || n <= 0) && !this.l && (!this.m || c2 <= 0)) {
                n = 0;
            }
            else {
                n = 1;
            }
            n2 = n4;
            if (xc.e.d(n3, c.P)) {
                n2 = n4;
                if (n != 0) {
                    n2 = 1;
                }
            }
            this.j = n2;
        }
        
        @Override
        public final int a() {
            return this.j;
        }
        
        public final int c(final f f) {
            final com.google.common.collect.h c = com.google.common.collect.h.a.c(this.k, f.k).b((Comparator)Ordering.natural().reverse(), (Object)this.n, (Object)f.n).a(this.o, f.o).a(this.p, f.p).c(this.l, f.l);
            final boolean m = this.m;
            final boolean i = f.m;
            Ordering ordering;
            if (this.o == 0) {
                ordering = Ordering.natural();
            }
            else {
                ordering = Ordering.natural().reverse();
            }
            com.google.common.collect.h h = c.b((Comparator)ordering, (Object)m, (Object)i).a(this.q, f.q);
            if (this.p == 0) {
                h = h.d(this.r, f.r);
            }
            return h.e();
        }
    }
    
    public abstract static class g<T extends g<T>>
    {
        public final int f;
        public final t g;
        public final int h;
        public final com.google.android.exoplayer2.n i;
        
        public g(final int f, final int h, final t g) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = g.h[h];
        }
        
        public abstract int a();
        
        public abstract boolean b(final T p0);
        
        public interface a<T extends g<T>>
        {
            ImmutableList c(final int p0, final t p1, final int[] p2);
        }
    }
    
    public static final class h extends g<h>
    {
        public final boolean j;
        public final c k;
        public final boolean l;
        public final boolean m;
        public final int n;
        public final int o;
        public final int p;
        public final int q;
        public final boolean r;
        public final boolean s;
        public final int t;
        public final boolean u;
        public final boolean v;
        public final int w;
        
        public h(int t, final t t2, int n, final c k, final int n2, int n3, final boolean b) {
            super(t, n, t2);
            this.k = k;
            int n4;
            if (k.I) {
                n4 = 24;
            }
            else {
                n4 = 16;
            }
            final boolean h = k.H;
            final int n5 = 0;
            this.s = (h && (n3 & n4) != 0x0);
            boolean j = false;
            Label_0172: {
                if (b) {
                    final com.google.android.exoplayer2.n i = super.i;
                    t = i.v;
                    if (t == -1 || t <= k.f) {
                        t = i.w;
                        if (t == -1 || t <= k.g) {
                            final float x = i.x;
                            if (x == -1.0f || x <= k.h) {
                                t = i.m;
                                if (t == -1 || t <= k.i) {
                                    j = true;
                                    break Label_0172;
                                }
                            }
                        }
                    }
                }
                j = false;
            }
            this.j = j;
            boolean m = false;
            Label_0280: {
                if (b) {
                    final com.google.android.exoplayer2.n l = super.i;
                    t = l.v;
                    if (t == -1 || t >= k.j) {
                        t = l.w;
                        if (t == -1 || t >= k.k) {
                            final float x2 = l.x;
                            if (x2 == -1.0f || x2 >= k.l) {
                                t = l.m;
                                if (t == -1 || t >= k.m) {
                                    m = true;
                                    break Label_0280;
                                }
                            }
                        }
                    }
                }
                m = false;
            }
            this.l = m;
            this.m = xc.e.d(n2, false);
            final com.google.android.exoplayer2.n i2 = super.i;
            this.n = i2.m;
            t = i2.v;
            Label_0341: {
                if (t != -1) {
                    n = i2.w;
                    if (n != -1) {
                        t *= n;
                        break Label_0341;
                    }
                }
                t = -1;
            }
            this.o = t;
            t = i2.j;
            n = k.r;
            n3 = Integer.MAX_VALUE;
            if (t != 0 && t == n) {
                t = Integer.MAX_VALUE;
            }
            else {
                t = Integer.bitCount(t & n);
            }
            this.q = t;
            t = super.i.j;
            this.r = (t == 0 || (t & 0x1) != 0x0);
            t = 0;
            while (true) {
                n = n3;
                if (t >= ((AbstractCollection)k.q).size()) {
                    break;
                }
                final String q = super.i.q;
                if (q != null && q.equals(((List<Object>)k.q).get(t))) {
                    n = t;
                    break;
                }
                ++t;
            }
            this.p = n;
            this.u = ((n2 & 0x80) == 0x80);
            this.v = ((n2 & 0x40) == 0x40);
            final com.google.android.exoplayer2.n i3 = super.i;
            final String q2 = i3.q;
            n = 3;
            Label_0725: {
                if (q2 != null) {
                    Label_0678: {
                        switch (q2) {
                            case "video/x-vnd.on2.vp9": {
                                t = 3;
                                break Label_0678;
                            }
                            case "video/avc": {
                                t = 2;
                                break Label_0678;
                            }
                            case "video/hevc": {
                                t = 1;
                                break Label_0678;
                            }
                            case "video/av01": {
                                t = 0;
                                break Label_0678;
                            }
                            default:
                                break;
                        }
                        t = -1;
                    }
                    switch (t) {
                        case 1: {
                            break Label_0725;
                        }
                        case 3: {
                            n = 2;
                            break Label_0725;
                        }
                        case 2: {
                            n = 1;
                            break Label_0725;
                        }
                        case 0: {
                            n = 4;
                            break Label_0725;
                        }
                    }
                }
                n = 0;
            }
            this.w = n;
            Label_0860: {
                if ((i3.j & 0x4000) != 0x0) {
                    t = n5;
                }
                else if (!xc.e.d(n2, this.k.P)) {
                    t = n5;
                }
                else if (!this.j && !this.k.G) {
                    t = n5;
                }
                else {
                    if (xc.e.d(n2, false) && this.l && this.j && super.i.m != -1) {
                        final c k2 = this.k;
                        if (!k2.B && !k2.A && (n4 & n2) != 0x0) {
                            t = 2;
                            break Label_0860;
                        }
                    }
                    t = 1;
                }
            }
            this.t = t;
        }
        
        public static int c(final h h, final h h2) {
            com.google.common.collect.h h4;
            final com.google.common.collect.h h3 = h4 = com.google.common.collect.h.a.c(h.m, h2.m).a(h.q, h2.q).c(h.r, h2.r).c(h.j, h2.j).c(h.l, h2.l).b((Comparator)Ordering.natural().reverse(), (Object)h.p, (Object)h2.p).c(h.u, h2.u).c(h.v, h2.v);
            if (h.u) {
                h4 = h3;
                if (h.v) {
                    h4 = h3.a(h.w, h2.w);
                }
            }
            return h4.e();
        }
        
        public static int d(final h h, final h h2) {
            Ordering ordering;
            if (h.j && h.m) {
                ordering = xc.e.e;
            }
            else {
                ordering = xc.e.e.reverse();
            }
            final h$a a = com.google.common.collect.h.a;
            final int n = h.n;
            final int n2 = h2.n;
            Ordering ordering2;
            if (h.k.A) {
                ordering2 = xc.e.e.reverse();
            }
            else {
                ordering2 = xc.e.f;
            }
            return a.b((Comparator)ordering2, (Object)n, (Object)n2).b((Comparator)ordering, (Object)h.o, (Object)h2.o).b((Comparator)ordering, (Object)h.n, (Object)h2.n).e();
        }
        
        @Override
        public final int a() {
            return this.t;
        }
        
        @Override
        public final boolean b(final g g) {
            final h h = (h)g;
            return (this.s || c0.a(super.i.q, h.i.q)) && (this.k.J || (this.u == h.u && this.v == h.v));
        }
    }
}
