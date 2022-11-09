// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.AbstractList;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.ListIterator;
import qg2.v;
import yl.a;
import java.util.Iterator;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import pg2.j;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotStateList$a;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import ah2.f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import bh2.c;
import java.util.List;

public final class y<T> implements List<T>, c
{
    public final SnapshotStateList<T> f;
    public final int g;
    public int h;
    public int i;
    
    public y(final SnapshotStateList<T> f, final int g, final int n) {
        ah2.f.f((Object)f, "parentList");
        this.f = f;
        this.g = g;
        this.h = f.c();
        this.i = n - g;
    }
    
    public final void a() {
        if (this.f.c() == this.h) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final void add(final int n, final T t) {
        this.a();
        this.f.add(this.g + n, (Object)t);
        ++this.i;
        this.h = this.f.c();
    }
    
    @Override
    public final boolean add(final T t) {
        this.a();
        this.f.add(this.g + this.i, (Object)t);
        ++this.i;
        this.h = this.f.c();
        return true;
    }
    
    @Override
    public final boolean addAll(int i, final Collection<? extends T> collection) {
        ah2.f.f((Object)collection, "elements");
        this.a();
        final boolean addAll = this.f.addAll(i + this.g, (Collection)collection);
        if (addAll) {
            i = this.i;
            this.i = collection.size() + i;
            this.h = this.f.c();
        }
        return addAll;
    }
    
    @Override
    public final boolean addAll(final Collection<? extends T> collection) {
        ah2.f.f((Object)collection, "elements");
        return this.addAll(this.i, collection);
    }
    
    @Override
    public final void clear() {
        if (this.i > 0) {
            this.a();
            final SnapshotStateList<T> f = this.f;
            final int g = this.g;
            final int i = this.i;
            f.getClass();
            while (true) {
                synchronized (n.a) {
                    final SnapshotStateList$a snapshotStateList$a = (SnapshotStateList$a)SnapshotKt.h((x)f.f, SnapshotKt.i());
                    final int d = snapshotStateList$a.d;
                    final b1.c c = snapshotStateList$a.c;
                    final j a = j.a;
                    monitorexit(n.a);
                    ah2.f.c((Object)c);
                    final PersistentVectorBuilder builder = c.builder();
                    ((AbstractList)builder).subList(g, i + g).clear();
                    final b1.c a2 = builder.a();
                    Label_0230: {
                        if (!ah2.f.a((Object)a2, (Object)c)) {
                            synchronized (n.a) {
                                final SnapshotStateList$a f2 = f.f;
                                synchronized (SnapshotKt.c) {
                                    final i1.f j = SnapshotKt.i();
                                    final SnapshotStateList$a snapshotStateList$a2 = (SnapshotStateList$a)SnapshotKt.u((x)f2, (w)f, j);
                                    final int d2 = snapshotStateList$a2.d;
                                    boolean b = true;
                                    if (d2 == d) {
                                        snapshotStateList$a2.c((b1.c)a2);
                                        ++snapshotStateList$a2.d;
                                    }
                                    else {
                                        b = false;
                                    }
                                    monitorexit(SnapshotKt.c);
                                    SnapshotKt.m(j, (w)f);
                                    monitorexit(n.a);
                                    if (b) {
                                        break Label_0230;
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                    this.i = 0;
                    this.h = this.f.c();
                }
                break;
            }
        }
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        ah2.f.f((Object)collection, "elements");
        final boolean empty = collection.isEmpty();
        final boolean b = true;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator iterator = collection.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final T get(final int n) {
        this.a();
        n.a(n, this.i);
        return (T)this.f.get(this.g + n);
    }
    
    @Override
    public final int indexOf(final Object o) {
        this.a();
        final int g = this.g;
        final Iterator<Object> iterator = ((Iterable<Object>)a.C1(g, this.i + g)).iterator();
        while (iterator.hasNext()) {
            final int nextInt = ((v)iterator).nextInt();
            if (ah2.f.a(o, this.f.get(nextInt))) {
                return nextInt - this.g;
            }
        }
        return -1;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.i == 0;
    }
    
    @Override
    public final Iterator<T> iterator() {
        return this.listIterator(0);
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        this.a();
        for (int i = this.g + this.i - 1; i >= this.g; --i) {
            if (ah2.f.a(o, this.f.get(i))) {
                return i - this.g;
            }
        }
        return -1;
    }
    
    @Override
    public final ListIterator<T> listIterator() {
        return this.listIterator(0);
    }
    
    @Override
    public final ListIterator<T> listIterator(final int n) {
        this.a();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = n - 1;
        return (ListIterator<T>)new y$a(ref$IntRef, this);
    }
    
    @Override
    public final T remove(final int n) {
        this.a();
        final Object remove = this.f.remove(this.g + n);
        --this.i;
        this.h = this.f.c();
        return (T)remove;
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int index = this.indexOf(o);
        boolean b;
        if (index >= 0) {
            this.remove(index);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        ah2.f.f((Object)collection, "elements");
        final Iterator<?> iterator = collection.iterator();
        boolean b = false;
    Label_0013:
        while (true) {
            b = false;
            while (iterator.hasNext()) {
                if (!this.remove(iterator.next()) && !b) {
                    continue Label_0013;
                }
                b = true;
            }
            break;
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        ah2.f.f((Object)collection, "elements");
        this.a();
        final SnapshotStateList<T> f = this.f;
        final int g = this.g;
        final int i = this.i;
        f.getClass();
        final int size = f.size();
        while (true) {
            synchronized (n.a) {
                final SnapshotStateList$a snapshotStateList$a = (SnapshotStateList$a)SnapshotKt.h((x)f.f, SnapshotKt.i());
                final int d = snapshotStateList$a.d;
                final b1.c c = snapshotStateList$a.c;
                final j a = j.a;
                monitorexit(n.a);
                ah2.f.c((Object)c);
                final PersistentVectorBuilder builder = c.builder();
                ((AbstractList)builder).subList(g, i + g).retainAll(collection);
                final b1.c a2 = builder.a();
                final boolean a3 = ah2.f.a((Object)a2, (Object)c);
                boolean b = false;
                Label_0242: {
                    if (!a3) {
                        synchronized (n.a) {
                            final SnapshotStateList$a f2 = f.f;
                            synchronized (SnapshotKt.c) {
                                final i1.f j = SnapshotKt.i();
                                final SnapshotStateList$a snapshotStateList$a2 = (SnapshotStateList$a)SnapshotKt.u((x)f2, (w)f, j);
                                boolean b2;
                                if (snapshotStateList$a2.d == d) {
                                    snapshotStateList$a2.c((b1.c)a2);
                                    ++snapshotStateList$a2.d;
                                    b2 = true;
                                }
                                else {
                                    b2 = false;
                                }
                                monitorexit(SnapshotKt.c);
                                SnapshotKt.m(j, (w)f);
                                monitorexit(n.a);
                                if (b2) {
                                    break Label_0242;
                                }
                                continue;
                            }
                        }
                    }
                }
                final int n = size - f.size();
                if (n > 0) {
                    this.h = this.f.c();
                    this.i -= n;
                }
                if (n > 0) {
                    b = true;
                }
                return b;
            }
        }
    }
    
    @Override
    public final T set(final int n, final T t) {
        n.a(n, this.i);
        this.a();
        final Object set = this.f.set(n + this.g, (Object)t);
        this.h = this.f.c();
        return (T)set;
    }
    
    @Override
    public final int size() {
        return this.i;
    }
    
    @Override
    public final List<T> subList(final int n, final int n2) {
        final int n3 = 1;
        int n4;
        if (n >= 0 && n <= n2 && n2 <= this.i) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            this.a();
            final SnapshotStateList<T> f = this.f;
            final int g = this.g;
            return new y((androidx.compose.runtime.snapshots.SnapshotStateList<Object>)f, n + g, n2 + g);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @Override
    public final Object[] toArray() {
        return ah2.c.G0((Collection)this);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        ah2.f.f((Object)array, "array");
        return (T[])ah2.c.H0((Collection)this, (Object[])array);
    }
}
