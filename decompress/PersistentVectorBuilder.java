// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.AbstractList;
import java.util.ListIterator;
import c1.i;
import c1.g;
import c1.d;
import c1.h;
import java.util.Collection;
import qg2.j;
import java.util.Arrays;
import java.util.ArrayList;
import zg2.l;
import qg2.u;
import java.util.Iterator;
import ah2.f;
import gn.a;
import bh2.b;
import qg2.c;

public final class PersistentVectorBuilder<E> extends c<E> implements b
{
    public b1.c<? extends E> f;
    public Object[] g;
    public Object[] h;
    public int i;
    public a j;
    public Object[] k;
    public Object[] l;
    public int m;
    
    public PersistentVectorBuilder(final b1.c<? extends E> f, final Object[] array, final Object[] array2, final int i) {
        ah2.f.f((Object)f, "vector");
        ah2.f.f((Object)array2, "vectorTail");
        this.f = f;
        this.g = array;
        this.h = array2;
        this.i = i;
        this.j = new a();
        this.k = array;
        this.l = array2;
        this.m = f.size();
    }
    
    public static void b(final Object[] array, int n, final Iterator iterator) {
        while (n < 32 && iterator.hasNext()) {
            array[n] = iterator.next();
            ++n;
        }
    }
    
    public final Object[] C(Object[] array, int n, int n2, final Iterator<Object[]> iterator) {
        if (!iterator.hasNext()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (n2 < 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (n2 == 0) {
            return iterator.next();
        }
        final Object[] m = this.m(array);
        final int n3 = n >> n2 & 0x1F;
        array = (Object[])m[n3];
        n2 -= 5;
        m[n3] = this.C(array, n, n2, iterator);
        n = n3;
        while (++n < 32 && iterator.hasNext()) {
            m[n] = this.C((Object[])m[n], 0, n2, iterator);
        }
        return m;
    }
    
    public final Object[] D(Object[] array, int i, final Object[][] array2) {
        final u i2 = yl.a.I0((Object[])array2);
        final int j = this.i;
        if (i >> 5 < 1 << j) {
            array = this.C(array, i, j, (Iterator<Object[]>)i2);
        }
        else {
            array = this.m(array);
        }
        while (i2.hasNext()) {
            this.i += 5;
            array = this.p(array);
            i = this.i;
            this.C(array, 1 << i, i, (Iterator<Object[]>)i2);
        }
        return array;
    }
    
    public final void E(Object[] p3, final Object[] k, final Object[] l) {
        final int size = this.size();
        final int i = this.i;
        if (size >> 5 > 1 << i) {
            p3 = this.p(p3);
            this.k = this.G(this.i + 5, p3, k);
            this.l = l;
            this.i += 5;
            this.m = this.size() + 1;
        }
        else if (p3 == null) {
            this.k = k;
            this.l = l;
            this.m = this.size() + 1;
        }
        else {
            this.k = this.G(i, p3, k);
            this.l = l;
            this.m = this.size() + 1;
        }
    }
    
    public final Object[] G(final int n, Object[] m, final Object[] array) {
        final int n2 = this.size() - 1 >> n & 0x1F;
        m = this.m(m);
        if (n == 5) {
            m[n2] = array;
        }
        else {
            m[n2] = this.G(n - 5, (Object[])m[n2], array);
        }
        return m;
    }
    
    public final int I(final l l, final Object[] array, final int n, int n2, final c1.c c, final ArrayList list, final ArrayList list2) {
        if (this.j(array)) {
            list.add(array);
        }
        final Object f = c.f;
        if (f != null) {
            Object[] o;
            final Object[] array2 = o = (Object[])f;
            Object[] array3;
            int n3;
            for (int i = 0; i < n; ++i, o = array3, n2 = n3) {
                final Object o2 = array[i];
                array3 = o;
                n3 = n2;
                if (!(boolean)l.invoke(o2)) {
                    if ((n3 = n2) == 32) {
                        if (list.isEmpty() ^ true) {
                            o = list.remove(list.size() - 1);
                        }
                        else {
                            o = this.o();
                        }
                        n3 = 0;
                    }
                    o[n3] = o2;
                    ++n3;
                    array3 = o;
                }
            }
            if (array2 != (c.f = o)) {
                list2.add(array2);
            }
            return n2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
    
    public final int J(final l<? super E, Boolean> l, final Object[] array, final int n, final c1.c c) {
        int i = 0;
        Object[] f = array;
        int n2 = n;
        int n3 = 0;
        while (i < n) {
            final Object o = array[i];
            int n4;
            Object[] m;
            int n5;
            if (l.invoke(o)) {
                n4 = n3;
                m = f;
                n5 = n2;
                if (n3 == 0) {
                    m = this.m(array);
                    n4 = 1;
                    n5 = i;
                }
            }
            else {
                n4 = n3;
                m = f;
                n5 = n2;
                if (n3 != 0) {
                    f[n2] = o;
                    n5 = n2 + 1;
                    m = f;
                    n4 = n3;
                }
            }
            ++i;
            n3 = n4;
            f = m;
            n2 = n5;
        }
        c.f = f;
        return n2;
    }
    
    public final int K(final l<? super E, Boolean> l, final int n, final c1.c c) {
        final int j = this.J(l, this.l, n, c);
        if (j == n) {
            return n;
        }
        final Object f = c.f;
        if (f != null) {
            final Object[] i = (Object[])f;
            Arrays.fill(i, j, n, null);
            this.l = i;
            this.m = this.size() - (n - j);
            return j;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
    
    public final boolean L(final l<? super E, Boolean> l) {
        final int w = this.W();
        final Object[] array = null;
        final c1.c c = new c1.c((Object)null);
        final Object[] k = this.k;
        boolean b = false;
        Label_0450: {
            if (k == null) {
                if (this.K(l, w, c) == w) {
                    break Label_0450;
                }
            }
            else {
                final c1.a i = this.l(0);
                final int n = 32;
                int j;
                for (j = 32; j == 32 && i.hasNext(); j = this.J(l, (Object[])i.next(), 32, c)) {}
                if (j == 32) {
                    final int m = this.K(l, w, c);
                    if (m == 0) {
                        this.z(this.size(), this.i, this.k);
                    }
                    if (m == w) {
                        break Label_0450;
                    }
                }
                else {
                    final int n2 = i.f - 1 << 5;
                    final ArrayList list = new ArrayList();
                    final ArrayList list2 = new ArrayList();
                    int i2 = j;
                    final int n3 = n;
                    final int n4 = n2;
                    while (i.hasNext()) {
                        i2 = this.I(l, (Object[])i.next(), 32, i2, c, list2, list);
                    }
                    final int i3 = this.I(l, this.l, w, i2, c, list2, list);
                    final Object f = c.f;
                    if (f == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    }
                    final Object[] l2 = (Object[])f;
                    Arrays.fill(l2, i3, n3, null);
                    Object[] array2;
                    if (list.isEmpty()) {
                        array2 = this.k;
                        ah2.f.c((Object)array2);
                    }
                    else {
                        array2 = this.C(this.k, n4, this.i, list.iterator());
                    }
                    final int n5 = n4 + (list.size() << 5);
                    if ((n5 & 0x1F) != 0x0) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    Object[] q;
                    if (n5 == 0) {
                        this.i = 0;
                        q = array;
                    }
                    else {
                        final int n6 = n5 - 1;
                        while (true) {
                            final int i4 = this.i;
                            if (n6 >> i4 != 0) {
                                q = this.q(n6, i4, array2);
                                break;
                            }
                            this.i = i4 - 5;
                            final Object o = array2[0];
                            if (o == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                            }
                            array2 = (Object[])o;
                        }
                    }
                    this.k = q;
                    this.l = l2;
                    this.m = n5 + i3;
                }
            }
            b = true;
        }
        if (b) {
            ++((AbstractList)this).modCount;
        }
        return b;
    }
    
    public final Object[] M(Object[] m, int n, final int n2, final c1.c c) {
        int n3 = 31;
        final int n4 = n2 >> n & 0x1F;
        if (n == 0) {
            final Object f = m[n4];
            final Object[] i = this.m(m);
            qg2.j.j1(m, n4, i, n4 + 1, 32);
            i[31] = c.f;
            c.f = f;
            return i;
        }
        if (m[31] == null) {
            n3 = (0x1F & this.S() - 1 >> n);
        }
        m = this.m(m);
        final int n5 = n - 5;
        n = n4 + 1;
        if (n <= n3) {
            while (true) {
                final Object o = m[n3];
                if (o == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                m[n3] = this.M((Object[])o, n5, 0, c);
                if (n3 == n) {
                    break;
                }
                --n3;
            }
        }
        final Object o2 = m[n4];
        if (o2 != null) {
            m[n4] = this.M((Object[])o2, n5, n2, c);
            return m;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
    
    public final Object Q(final Object[] k, final int n, final int i, final int n2) {
        final int n3 = this.size() - n;
        Object o2;
        if (n3 == 1) {
            final Object o = this.l[0];
            this.z(n, i, k);
            o2 = o;
        }
        else {
            final Object[] l = this.l;
            final Object o3 = l[n2];
            final Object[] m = this.m(l);
            qg2.j.j1(l, n2, m, n2 + 1, n3);
            m[n3 - 1] = null;
            this.k = k;
            this.l = m;
            this.m = n + n3 - 1;
            this.i = i;
            o2 = o3;
        }
        return o2;
    }
    
    public final int S() {
        if (this.size() <= 32) {
            return 0;
        }
        return this.size() - 1 & 0xFFFFFFE0;
    }
    
    public final Object[] T(final Object[] array, final int n, final int n2, final E e, final c1.c c) {
        final int n3 = n2 >> n & 0x1F;
        final Object[] m = this.m(array);
        if (n == 0) {
            if (m != array) {
                ++((AbstractList)this).modCount;
            }
            c.f = m[n3];
            m[n3] = e;
            return m;
        }
        final Object o = m[n3];
        if (o != null) {
            m[n3] = this.T((Object[])o, n - 5, n2, e, c);
            return m;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
    
    public final void U(final Collection<? extends E> collection, int i, Object[] array, final int n, final Object[][] array2, int n2, Object[] array3) {
        final int n3 = 1;
        if (n2 >= 1) {
            final Object[] m = this.m(array);
            array2[0] = m;
            final int n4 = i & 0x1F;
            i = (collection.size() + i - 1 & 0x1F);
            final int n5 = n - n4 + i;
            if (n5 < 32) {
                qg2.j.j1(m, i + 1, array3, n4, n);
            }
            else {
                if (n2 == 1) {
                    array = m;
                }
                else {
                    array = this.o();
                    --n2;
                    array2[n2] = array;
                }
                final int n6 = n - (n5 - 32 + 1);
                qg2.j.j1(m, 0, array3, n6, n);
                qg2.j.j1(m, i + 1, array, n4, n6);
                array3 = array;
            }
            final Iterator iterator = collection.iterator();
            b(m, n4, iterator);
            for (i = n3; i < n2; ++i) {
                array = this.o();
                b(array, 0, iterator);
                array2[i] = array;
            }
            b(array3, 0, iterator);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final int W() {
        int size = this.size();
        if (size > 32) {
            size -= (size - 1 & 0xFFFFFFE0);
        }
        return size;
    }
    
    public final b1.c<E> a() {
        final Object[] k = this.k;
        Object f;
        if (k == this.g && this.l == this.h) {
            f = this.f;
        }
        else {
            this.j = new a();
            this.g = k;
            final Object[] l = this.l;
            this.h = l;
            if (k == null) {
                if (l.length == 0) {
                    f = c1.h.g;
                }
                else {
                    final Object[] copy = Arrays.copyOf(this.l, this.size());
                    ah2.f.e((Object)copy, "copyOf(this, newSize)");
                    f = new h(copy);
                }
            }
            else {
                ah2.f.c((Object)k);
                f = new d(this.size(), this.i, k, this.l);
            }
        }
        return (b1.c<E>)(this.f = (b1.c<? extends E>)f);
    }
    
    public final void add(final int n, final E e) {
        at1.a.T(n, this.size());
        if (n == this.size()) {
            this.add(e);
            return;
        }
        ++((AbstractList)this).modCount;
        final int s = this.S();
        if (n >= s) {
            this.i(n - s, e, this.k);
            return;
        }
        final c1.c c = new c1.c((Object)null);
        final Object[] k = this.k;
        ah2.f.c((Object)k);
        this.i(0, c.f, this.g(k, this.i, n, e, c));
    }
    
    public final boolean add(final E e) {
        ++((AbstractList)this).modCount;
        final int w = this.W();
        if (w < 32) {
            final Object[] m = this.m(this.l);
            m[w] = e;
            this.l = m;
            this.m = this.size() + 1;
        }
        else {
            this.E(this.k, this.l, this.p(e));
        }
        return true;
    }
    
    public final boolean addAll(int n, final Collection<? extends E> collection) {
        ah2.f.f((Object)collection, "elements");
        at1.a.T(n, this.size());
        if (n == this.size()) {
            return this.addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ++((AbstractList)this).modCount;
        final int n2 = n >> 5 << 5;
        int n3 = (collection.size() + (this.size() - n2) - 1) / 32;
        if (n3 == 0) {
            this.S();
            final int n4 = n & 0x1F;
            final int size = collection.size();
            final Object[] l = this.l;
            final Object[] m = this.m(l);
            qg2.j.j1(l, (size + n - 1 & 0x1F) + 1, m, n4, this.W());
            b(m, n4, collection.iterator());
            this.l = m;
            n = this.size();
            this.m = collection.size() + n;
            return true;
        }
        final Object[][] array = new Object[n3][];
        final int w = this.W();
        int n5 = collection.size() + this.size();
        if (n5 > 32) {
            n5 -= (n5 - 1 & 0xFFFFFFE0);
        }
        Object[] i;
        if (n >= this.S()) {
            i = this.o();
            this.U(collection, n, this.l, w, array, n3, i);
        }
        else if (n5 > w) {
            final int n6 = n5 - w;
            i = this.n(n6, this.l);
            this.d(collection, n, n6, array, n3, i);
        }
        else {
            final Object[] j = this.l;
            i = this.o();
            final int n7 = w - n5;
            qg2.j.j1(j, 0, i, n7, w);
            final int n8 = 32 - n7;
            final Object[] n9 = this.n(n8, this.l);
            --n3;
            this.d(collection, n, n8, array, n3, array[n3] = n9);
        }
        this.k = this.D(this.k, n2, array);
        this.l = i;
        n = this.size();
        this.m = collection.size() + n;
        return true;
    }
    
    public final boolean addAll(final Collection<? extends E> collection) {
        ah2.f.f((Object)collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ++((AbstractList)this).modCount;
        final int w = this.W();
        final Iterator iterator = collection.iterator();
        if (32 - w >= collection.size()) {
            final Object[] m = this.m(this.l);
            b(m, w, iterator);
            this.l = m;
            this.m = collection.size() + this.size();
        }
        else {
            final int n = (collection.size() + w - 1) / 32;
            final Object[][] array = new Object[n][];
            final Object[] i = this.m(this.l);
            b(i, w, iterator);
            array[0] = i;
            for (int j = 1; j < n; ++j) {
                final Object[] o = this.o();
                b(o, 0, iterator);
                array[j] = o;
            }
            this.k = this.D(this.k, this.S(), array);
            final Object[] o2 = this.o();
            b(o2, 0, iterator);
            this.l = o2;
            this.m = collection.size() + this.size();
        }
        return true;
    }
    
    public final int c() {
        return ((AbstractList)this).modCount;
    }
    
    public final void d(final Collection<? extends E> collection, final int n, int n2, final Object[][] array, final int n3, Object[] array2) {
        if (this.k != null) {
            final int n4 = n >> 5;
            final c1.a l = this.l(this.S() >> 5);
            int n5 = n3;
            Object[] n6 = array2;
            while (l.f - 1 != n4) {
                final Object[] array3 = (Object[])l.previous();
                qg2.j.j1(array3, 0, n6, 32 - n2, 32);
                n6 = this.n(n2, array3);
                --n5;
                array[n5] = n6;
            }
            final Object[] array4 = (Object[])l.previous();
            n2 = n3 - ((this.S() >> 5) - 1 - n4);
            if (n2 < n3) {
                array2 = array[n2];
                ah2.f.c((Object)array2);
            }
            this.U(collection, n, array4, 32, array, n2, array2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
    
    public final Object[] g(Object[] m, int n, final int n2, Object o, final c1.c c) {
        final int n3 = n2 >> n & 0x1F;
        if (n == 0) {
            c.f = m[31];
            final Object[] i = this.m(m);
            qg2.j.j1(m, n3 + 1, i, n3, 31);
            i[n3] = o;
            return i;
        }
        m = this.m(m);
        final int n4 = n - 5;
        final Object o2 = m[n3];
        if (o2 != null) {
            m[n3] = this.g((Object[])o2, n4, n2, o, c);
            n = n3;
            while (++n < 32) {
                o = m[n];
                if (o == null) {
                    break;
                }
                m[n] = this.g((Object[])o, n4, 0, c.f, c);
            }
            return m;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
    
    public final E get(final int n) {
        at1.a.S(n, this.size());
        Object[] l;
        if (this.S() <= n) {
            l = this.l;
        }
        else {
            Object[] k = this.k;
            ah2.f.c((Object)k);
            int i = this.i;
            while (true) {
                l = k;
                if (i <= 0) {
                    break;
                }
                final Object o = k[n >> i & 0x1F];
                if (o == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                k = (Object[])o;
                i -= 5;
            }
        }
        return (E)l[n & 0x1F];
    }
    
    public final int getSize() {
        return this.m;
    }
    
    public final void i(final int n, final Object o, final Object[] k) {
        final int w = this.W();
        final Object[] m = this.m(this.l);
        if (w < 32) {
            qg2.j.j1(this.l, n + 1, m, n, w);
            m[n] = o;
            this.k = k;
            this.l = m;
            this.m = this.size() + 1;
        }
        else {
            final Object[] l = this.l;
            final Object o2 = l[31];
            qg2.j.j1(l, n + 1, m, n, 31);
            m[n] = o;
            this.E(k, m, this.p(o2));
        }
    }
    
    public final Iterator<E> iterator() {
        return this.listIterator(0);
    }
    
    public final boolean j(final Object[] array) {
        return array.length == 33 && array[32] == this.j;
    }
    
    public final c1.a l(final int n) {
        if (this.k == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        final int n2 = this.S() >> 5;
        at1.a.T(n, n2);
        final int i = this.i;
        if (i == 0) {
            final Object[] k = this.k;
            ah2.f.c((Object)k);
            return new g(k, n);
        }
        final int n3 = i / 5;
        final Object[] j = this.k;
        ah2.f.c((Object)j);
        return new i(j, n, n2, n3);
    }
    
    public final ListIterator<E> listIterator() {
        return this.listIterator(0);
    }
    
    public final ListIterator<E> listIterator(final int n) {
        at1.a.T(n, this.size());
        return new c1.f<E>(this, n);
    }
    
    public final Object[] m(final Object[] array) {
        if (array == null) {
            return this.o();
        }
        if (this.j(array)) {
            return array;
        }
        final Object[] o = this.o();
        int length = array.length;
        if (length > 32) {
            length = 32;
        }
        qg2.j.m1(array, o, 0, 0, length, 6);
        return o;
    }
    
    public final Object[] n(final int n, final Object[] array) {
        if (this.j(array)) {
            qg2.j.j1(array, n, array, 0, 32 - n);
            return array;
        }
        final Object[] o = this.o();
        qg2.j.j1(array, n, o, 0, 32 - n);
        return o;
    }
    
    public final Object[] o() {
        return new Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.j };
    }
    
    public final Object[] p(final Object o) {
        return new Object[] { o, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.j };
    }
    
    public final Object[] q(int n, final int n2, Object[] m) {
        if (n2 < 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (n2 == 0) {
            return m;
        }
        final int n3 = n >> n2 & 0x1F;
        final Object o = m[n3];
        if (o != null) {
            final Object[] q = this.q(n, n2 - 5, (Object[])o);
            Object[] o2 = m;
            if (n3 < 31) {
                n = n3 + 1;
                o2 = m;
                if (m[n] != null) {
                    if (this.j(m)) {
                        Arrays.fill(m, n, 32, null);
                    }
                    o2 = this.o();
                    qg2.j.j1(m, 0, o2, 0, n);
                }
            }
            m = o2;
            if (q != o2[n3]) {
                m = this.m(o2);
                m[n3] = q;
            }
            return m;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
    
    public final boolean removeAll(final Collection<?> collection) {
        ah2.f.f((Object)collection, "elements");
        return this.L((l<? super E, Boolean>)new PersistentVectorBuilder$removeAll.PersistentVectorBuilder$removeAll$1((Collection)collection));
    }
    
    public final E removeAt(final int n) {
        at1.a.S(n, this.size());
        ++((AbstractList)this).modCount;
        final int s = this.S();
        if (n >= s) {
            return (E)this.Q(this.k, s, this.i, n - s);
        }
        final c1.c c = new c1.c(this.l[0]);
        final Object[] k = this.k;
        ah2.f.c((Object)k);
        this.Q(this.M(k, this.i, n, c), s, this.i, 0);
        return (E)c.f;
    }
    
    public final E set(int n, final E e) {
        at1.a.S(n, this.size());
        if (this.S() <= n) {
            final Object[] m = this.m(this.l);
            if (m != this.l) {
                ++((AbstractList)this).modCount;
            }
            n &= 0x1F;
            final Object o = m[n];
            m[n] = e;
            this.l = m;
            return (E)o;
        }
        final c1.c c = new c1.c((Object)null);
        final Object[] k = this.k;
        ah2.f.c((Object)k);
        this.k = this.T(k, this.i, n, e, c);
        return (E)c.f;
    }
    
    public final Object[] u(Object[] m, final int n, final int n2, final c1.c c) {
        final int n3 = n2 - 1 >> n & 0x1F;
        Object u;
        if (n == 5) {
            c.f = m[n3];
            u = null;
        }
        else {
            final Object o = m[n3];
            if (o == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            u = this.u((Object[])o, n - 5, n2, c);
        }
        if (u == null && n3 == 0) {
            return null;
        }
        m = this.m(m);
        m[n3] = u;
        return m;
    }
    
    public final void z(final int n, final int n2, Object[] u) {
        if (n2 == 0) {
            this.k = null;
            Object[] l;
            if ((l = u) == null) {
                l = new Object[0];
            }
            this.l = l;
            this.m = n;
            this.i = n2;
            return;
        }
        final c1.c c = new c1.c((Object)null);
        ah2.f.c((Object)u);
        u = this.u(u, n2, n, c);
        ah2.f.c((Object)u);
        final Object f = c.f;
        if (f != null) {
            this.l = (Object[])f;
            this.m = n;
            if (u[1] == null) {
                this.k = (Object[])u[0];
                this.i = n2 - 5;
            }
            else {
                this.k = u;
                this.i = n2;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
}
