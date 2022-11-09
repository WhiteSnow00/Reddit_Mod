// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import zm2.e;
import j0.f;
import android.util.SparseArray;
import j0.b;
import java.util.HashMap;
import java.util.ArrayList;

public final class m0
{
    public Object a;
    public Object b;
    public Cloneable c;
    public Object d;
    
    public m0(final int n) {
        if (n != 1) {
            this.a = new ArrayList();
            this.b = new HashMap();
            this.c = new HashMap<Object, Object>();
            return;
        }
        this.a = new b();
        this.b = new SparseArray();
        this.c = (Cloneable)new f();
        this.d = new b();
    }
    
    public m0(final zm2.b a, e f) {
        this.a = a;
        this.b = f;
        final int[] c = f.c;
        final int length = c.length;
        final int n = -1;
        int n2;
        if (c[n2 = length - 1] == 0) {
            n2 = -1;
        }
        this.c = new e[n2];
        int j;
        for (int i = 0; i < (j = n2 >> 1); ++i) {
            final int n3 = i << 1;
            final int[] array = new int[n3 + 1];
            array[n3] = 1;
            ((e[])(Object)this.c)[i] = new e((zm2.b)this.a, array);
        }
        while (j < n2) {
            final int n4 = j << 1;
            final int[] array2 = new int[n4 + 1];
            array2[n4] = 1;
            final e e = new e((zm2.b)this.a, array2);
            final e[] array3 = (Object)this.c;
            final e e2 = (e)this.b;
            final int[] c2 = e.c;
            final int[] c3 = e2.c;
            final int k = zm2.e.b(c3);
            if (k == -1) {
                throw new ArithmeticException("Division by zero");
            }
            final int length2 = c2.length;
            int[] a2 = new int[length2];
            final int b = zm2.e.b(c3);
            int n5;
            if (b == -1) {
                n5 = 0;
            }
            else {
                n5 = c3[b];
            }
            final int a3 = e.a.a(n5);
            System.arraycopy(c2, 0, a2, 0, length2);
            while (k <= zm2.e.b(a2)) {
                final zm2.b a4 = e.a;
                final int b2 = zm2.e.b(a2);
                int n6;
                if (b2 == -1) {
                    n6 = 0;
                }
                else {
                    n6 = a2[b2];
                }
                final int c4 = a4.c(n6, a3);
                final int n7 = zm2.e.b(a2) - k;
                final int b3 = zm2.e.b(c3);
                int[] array4;
                if (b3 == -1) {
                    array4 = new int[] { 0 };
                }
                else {
                    array4 = new int[b3 + n7 + 1];
                    System.arraycopy(c3, 0, array4, n7, b3 + 1);
                }
                a2 = e.a(e.g(c4, array4), a2);
            }
            array3[j] = new e(e.a, a2);
            ++j;
        }
        final int[] c5 = ((e)this.b).c;
        int n8 = c5.length - 1;
        if (c5[n8] == 0) {
            n8 = n;
        }
        final e[] array5 = new e[n8];
        int n9;
        int l;
        for (l = (n9 = n8 - 1); n9 >= 0; --n9) {
            array5[n9] = new e(((e[])(Object)this.c)[n9]);
        }
        this.d = new e[n8];
        while (l >= 0) {
            ((e[])this.d)[l] = new e((zm2.b)this.a, l);
            --l;
        }
        for (int n10 = 0; n10 < n8; ++n10) {
            if (array5[n10].d(n10) == 0) {
                int n11 = n10 + 1;
                boolean b4 = false;
                while (n11 < n8) {
                    int n12 = n11;
                    if (array5[n11].d(n10) != 0) {
                        f = array5[n10];
                        array5[n10] = array5[n11];
                        array5[n11] = f;
                        final e[] array6 = (e[])this.d;
                        f = array6[n10];
                        array6[n10] = array6[n11];
                        array6[n11] = f;
                        n12 = n8;
                        b4 = true;
                    }
                    n11 = n12 + 1;
                }
                if (!b4) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            final int a5 = ((zm2.b)this.a).a(array5[n10].d(n10));
            f = array5[n10];
            if (!f.a.b(a5)) {
                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
            }
            f.c = f.g(a5, f.c);
            f.c();
            f = ((e[])this.d)[n10];
            if (!f.a.b(a5)) {
                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
            }
            f.c = f.g(a5, f.c);
            f.c();
            for (int n13 = 0; n13 < n8; ++n13) {
                if (n13 != n10) {
                    final int d = array5[n13].d(n10);
                    if (d != 0) {
                        final e f2 = array5[n10].f(d);
                        f = ((e[])this.d)[n10].f(d);
                        final e e3 = array5[n13];
                        e3.c = e3.a(e3.c, f2.c);
                        e3.c();
                        final e e4 = ((e[])this.d)[n13];
                        e4.c = e4.a(e4.c, f.c);
                        e4.c();
                    }
                }
            }
        }
    }
    
    public final void a(final Fragment fragment) {
        if (!((ArrayList)this.a).contains(fragment)) {
            synchronized ((ArrayList)this.a) {
                ((ArrayList)this.a).add(fragment);
                monitorexit((ArrayList)this.a);
                fragment.mAdded = true;
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void b() {
        ((HashMap)this.b).values().removeAll(Collections.singleton((Object)null));
    }
    
    public final Fragment c(final String s) {
        final l0 l0 = ((HashMap)this.b).get(s);
        if (l0 != null) {
            return l0.c;
        }
        return null;
    }
    
    public final Fragment d(final String s) {
        for (final l0 l0 : ((HashMap)this.b).values()) {
            if (l0 != null) {
                final Fragment fragmentByWho = l0.c.findFragmentByWho(s);
                if (fragmentByWho != null) {
                    return fragmentByWho;
                }
                continue;
            }
        }
        return null;
    }
    
    public final ArrayList e() {
        final ArrayList list = new ArrayList();
        for (final l0 l0 : ((HashMap)this.b).values()) {
            if (l0 != null) {
                list.add(l0);
            }
        }
        return list;
    }
    
    public final ArrayList f() {
        final ArrayList list = new ArrayList();
        for (final l0 l0 : ((HashMap)this.b).values()) {
            if (l0 != null) {
                list.add(l0.c);
            }
            else {
                list.add(null);
            }
        }
        return list;
    }
    
    public final List g() {
        if (((ArrayList)this.a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized ((ArrayList)this.a) {
            return new ArrayList((Collection)this.a);
        }
    }
    
    public final void h(final l0 l0) {
        final Fragment c = l0.c;
        if (((HashMap)this.b).get(c.mWho) != null) {
            return;
        }
        ((HashMap)this.b).put(c.mWho, l0);
        if (c.mRetainInstanceChangedWhileDetached) {
            if (c.mRetainInstance) {
                ((g0)this.d).c(c);
            }
            else {
                ((g0)this.d).f(c);
            }
            c.mRetainInstanceChangedWhileDetached = false;
        }
        if (d0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(c);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final void i(final l0 l0) {
        final Fragment c = l0.c;
        if (c.mRetainInstance) {
            ((g0)this.d).f(c);
        }
        if (((HashMap)this.b).put(c.mWho, null) == null) {
            return;
        }
        if (d0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(c);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final k0 j(final String s, final k0 k0) {
        if (k0 != null) {
            return ((HashMap)this.c).put(s, k0);
        }
        return ((HashMap)this.c).remove(s);
    }
}
