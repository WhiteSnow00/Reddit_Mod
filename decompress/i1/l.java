// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import d1.e;
import b1.d;
import pg2.j;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import ah2.f;

public final class l<K, V> extends k<K, V, V>
{
    public l(final o<K, V> o) {
        ah2.f.f((Object)o, "map");
        super(o);
    }
    
    @Override
    public final boolean add(final Object o) {
        p.a();
        throw null;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        ah2.f.f((Object)collection, "elements");
        p.a();
        throw null;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return super.f.containsValue(o);
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
            } while (super.f.containsValue(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final Iterator iterator() {
        final o<K, V> f = super.f;
        return (Iterator)new v((o)f, (Iterator)((o$a)f.b()).c.entrySet().iterator());
    }
    
    @Override
    public final boolean remove(Object o) {
        final o<K, V> f = super.f;
        final Iterator iterator = f.g.iterator();
        while (true) {
            while (((t)iterator).hasNext()) {
                final Object next = ((s)iterator).next();
                if (ah2.f.a(((Map.Entry<K, Object>)next).getValue(), o)) {
                    o = next;
                    final Map.Entry entry = (Map.Entry)o;
                    boolean b;
                    if (entry != null) {
                        f.remove(entry.getKey());
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    return b;
                }
            }
            o = null;
            continue;
        }
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        ah2.f.f((Object)collection, "elements");
        final Set l2 = CollectionsKt___CollectionsKt.l2((Iterable)collection);
        final o<K, V> f = super.f;
        boolean b = false;
        while (true) {
            Object o = p.a;
            synchronized (o) {
                final o$a o$a = (o$a)SnapshotKt.h((x)f.f, SnapshotKt.i());
                final d c = o$a.c;
                final int d = o$a.d;
                final j a = j.a;
                monitorexit(o);
                ah2.f.c((Object)c);
                o = c.builder();
                final Iterator iterator = f.g.iterator();
                boolean b2 = true;
                boolean b3 = b;
                while (((t)iterator).hasNext()) {
                    final Map.Entry entry = (Map.Entry)((s)iterator).next();
                    if (l2.contains(entry.getValue())) {
                        ((e)o).remove(entry.getKey());
                        b3 = true;
                    }
                }
                final j a2 = j.a;
                o = ((e)o).g();
                if (!ah2.f.a(o, (Object)c)) {
                    synchronized (p.a) {
                        final o.o$a f2 = f.f;
                        synchronized (SnapshotKt.c) {
                            final i1.f i = SnapshotKt.i();
                            final o$a o$a2 = (o$a)SnapshotKt.u((x)f2, (w)f, i);
                            if (o$a2.d == d) {
                                o$a2.c((d)o);
                                ++o$a2.d;
                            }
                            else {
                                b2 = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.m(i, (w)f);
                            monitorexit(p.a);
                            b = b3;
                            if (b2) {
                                return b3;
                            }
                            continue;
                        }
                    }
                }
                return b3;
            }
        }
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        ah2.f.f((Object)collection, "elements");
        final Set l2 = CollectionsKt___CollectionsKt.l2((Iterable)collection);
        final o<K, V> f = super.f;
        boolean b = false;
        while (true) {
            Object o = p.a;
            synchronized (o) {
                final o$a o$a = (o$a)SnapshotKt.h((x)f.f, SnapshotKt.i());
                final d c = o$a.c;
                final int d = o$a.d;
                final j a = j.a;
                monitorexit(o);
                ah2.f.c((Object)c);
                o = c.builder();
                final Iterator iterator = f.g.iterator();
                boolean b2 = true;
                boolean b3 = b;
                while (((t)iterator).hasNext()) {
                    final Map.Entry entry = (Map.Entry)((s)iterator).next();
                    if (l2.contains(entry.getValue()) ^ true) {
                        ((e)o).remove(entry.getKey());
                        b3 = true;
                    }
                }
                final j a2 = j.a;
                o = ((e)o).g();
                if (!ah2.f.a(o, (Object)c)) {
                    synchronized (p.a) {
                        final o.o$a f2 = f.f;
                        synchronized (SnapshotKt.c) {
                            final i1.f i = SnapshotKt.i();
                            final o$a o$a2 = (o$a)SnapshotKt.u((x)f2, (w)f, i);
                            if (o$a2.d == d) {
                                o$a2.c((d)o);
                                ++o$a2.d;
                            }
                            else {
                                b2 = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.m(i, (w)f);
                            monitorexit(p.a);
                            b = b3;
                            if (b2) {
                                return b3;
                            }
                            continue;
                        }
                    }
                }
                return b3;
            }
        }
    }
}