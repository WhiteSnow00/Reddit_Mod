// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import java.util.List;
import com.tonyodev.fetch2.Download;
import id2.i;
import nd2.a;
import com.tonyodev.fetch2core.Reason;
import java.util.Iterator;
import cg2.j;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.LinkedHashMap;
import ng2.e;
import androidx.compose.ui.platform.k0;
import j0.f;
import android.util.SparseArray;
import j0.b;

public final class u
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    
    public u() {
        this.a = new b();
        this.c = new SparseArray();
        this.d = new f();
        this.b = new b();
    }
    
    public u(final String c, final k0 d) {
        e.g((Object)c, "namespace");
        this.c = c;
        this.d = d;
        this.a = new Object();
        this.b = new LinkedHashMap();
    }
    
    public u(final mm2.b a, mm2.e f) {
        this.a = a;
        this.b = f;
        final int[] c = f.c;
        final int length = c.length;
        final int n = -1;
        int n2;
        if (c[n2 = length - 1] == 0) {
            n2 = -1;
        }
        this.c = new mm2.e[n2];
        int j;
        for (int i = 0; i < (j = n2 >> 1); ++i) {
            final int n3 = i << 1;
            final int[] array = new int[n3 + 1];
            array[n3] = 1;
            ((mm2.e[])this.c)[i] = new mm2.e((mm2.b)this.a, array);
        }
        while (j < n2) {
            final int n4 = j << 1;
            final int[] array2 = new int[n4 + 1];
            array2[n4] = 1;
            final mm2.e e = new mm2.e((mm2.b)this.a, array2);
            final mm2.e[] array3 = (mm2.e[])this.c;
            final mm2.e e2 = (mm2.e)this.b;
            final int[] c2 = e.c;
            final int[] c3 = e2.c;
            final int k = mm2.e.b(c3);
            if (k == -1) {
                throw new ArithmeticException("Division by zero");
            }
            final int length2 = c2.length;
            int[] a2 = new int[length2];
            final int b = mm2.e.b(c3);
            int n5;
            if (b == -1) {
                n5 = 0;
            }
            else {
                n5 = c3[b];
            }
            final int a3 = e.a.a(n5);
            System.arraycopy(c2, 0, a2, 0, length2);
            while (k <= mm2.e.b(a2)) {
                final mm2.b a4 = e.a;
                final int b2 = mm2.e.b(a2);
                int n6;
                if (b2 == -1) {
                    n6 = 0;
                }
                else {
                    n6 = a2[b2];
                }
                final int c4 = a4.c(n6, a3);
                final int n7 = mm2.e.b(a2) - k;
                final int b3 = mm2.e.b(c3);
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
            array3[j] = new mm2.e(e.a, a2);
            ++j;
        }
        final int[] c5 = ((mm2.e)this.b).c;
        int n8 = c5.length - 1;
        if (c5[n8] == 0) {
            n8 = n;
        }
        final mm2.e[] array5 = new mm2.e[n8];
        int n9;
        int l;
        for (l = (n9 = n8 - 1); n9 >= 0; --n9) {
            array5[n9] = new mm2.e(((mm2.e[])this.c)[n9]);
        }
        this.d = new mm2.e[n8];
        while (l >= 0) {
            ((mm2.e[])this.d)[l] = new mm2.e((mm2.b)this.a, l);
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
                        final mm2.e[] array6 = (mm2.e[])this.d;
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
            final int a5 = ((mm2.b)this.a).a(array5[n10].d(n10));
            f = array5[n10];
            if (!f.a.b(a5)) {
                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
            }
            f.c = f.g(a5, f.c);
            f.c();
            f = ((mm2.e[])this.d)[n10];
            if (!f.a.b(a5)) {
                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
            }
            f.c = f.g(a5, f.c);
            f.c();
            for (int n13 = 0; n13 < n8; ++n13) {
                if (n13 != n10) {
                    final int d = array5[n13].d(n10);
                    if (d != 0) {
                        final mm2.e f2 = array5[n10].f(d);
                        f = ((mm2.e[])this.d)[n10].f(d);
                        final mm2.e e3 = array5[n13];
                        e3.c = e3.a(e3.c, f2.c);
                        e3.c();
                        final mm2.e e4 = ((mm2.e[])this.d)[n13];
                        e4.c = e4.a(e4.c, f.c);
                        e4.c();
                    }
                }
            }
        }
    }
    
    public final void a() {
        synchronized (this.a) {
            final Iterator iterator = ((Map)this.b).entrySet().iterator();
            while (iterator.hasNext()) {
                if (((Map.Entry<K, WeakReference>)iterator.next()).getValue().get() == null) {
                    iterator.remove();
                }
            }
            final j a = j.a;
        }
    }
    
    public final a b(final int n, final Reason reason) {
        e.g((Object)reason, "reason");
        synchronized (this.a) {
            final WeakReference weakReference = ((Map)this.b).get(n);
            a a;
            if (weakReference != null) {
                a = (a)weakReference.get();
            }
            else {
                a = null;
            }
            a a2 = a;
            if (a == null) {
                a2 = new a((String)this.c);
                a2.a(((i)((k0)this.d).g).p1(n), (Download)null, reason);
                ((Map)this.b).put(n, new WeakReference(a2));
            }
            return a2;
        }
    }
    
    public final a c(final int n, final Download download, final Reason reason) {
        e.g((Object)download, "download");
        e.g((Object)reason, "reason");
        synchronized (this.a) {
            final a b = this.b(n, reason);
            b.a((List)((k0)this.d).m(n, download), download, reason);
            return b;
        }
    }
    
    public final void d(final int n, final Download download, final Reason reason) {
        e.g((Object)download, "download");
        e.g((Object)reason, "reason");
        synchronized (this.a) {
            final WeakReference weakReference = ((Map)this.b).get(n);
            a a;
            if (weakReference != null) {
                a = (a)weakReference.get();
            }
            else {
                a = null;
            }
            if (a != null) {
                a.a((List)((k0)this.d).m(n, download), download, reason);
                final j a2 = j.a;
            }
        }
    }
}
