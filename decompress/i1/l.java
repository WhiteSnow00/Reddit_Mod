// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import d1.c;
import java.util.Set;
import b1.d;
import cg2.j;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Map;
import b1.b;
import java.util.Iterator;
import java.util.Collection;
import ng2.e;

public final class l<K, V> extends k<K, V, V>
{
    public l(final o<K, V> o) {
        e.f((Object)o, "map");
        super((o)o);
    }
    
    public final boolean add(final Object o) {
        p.a();
        throw null;
    }
    
    public final boolean addAll(final Collection collection) {
        e.f((Object)collection, "elements");
        p.a();
        throw null;
    }
    
    public final boolean contains(final Object o) {
        return super.f.containsValue(o);
    }
    
    public final boolean containsAll(final Collection<?> collection) {
        e.f((Object)collection, "elements");
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
    
    public final Iterator iterator() {
        final o f = super.f;
        return new v(f, (Iterator<? extends Map.Entry<?, ?>>)((Set<Object>)((o.a)f.b()).c.entrySet()).iterator());
    }
    
    public final boolean remove(Object o) {
        final o f = super.f;
        final Iterator iterator = f.g.iterator();
        while (true) {
            while (((t)iterator).hasNext()) {
                final Object next = ((s)iterator).next();
                if (e.a(((Map.Entry<K, Object>)next).getValue(), o)) {
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
    
    public final boolean removeAll(final Collection<?> collection) {
        e.f((Object)collection, "elements");
        final Set m5 = CollectionsKt___CollectionsKt.M5((Iterable)collection);
        final o f = super.f;
        boolean b = false;
        while (true) {
            Object o = p.a;
            synchronized (o) {
                final o.a f2 = f.f;
                e.d((Object)f2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final o.a a = (o.a)SnapshotKt.h((x)f2);
                final d<K, ? extends V> c = a.c;
                final int d = a.d;
                final j a2 = j.a;
                monitorexit(o);
                e.c((Object)c);
                o = c.builder();
                final Iterator iterator = f.g.iterator();
                boolean b2 = true;
                boolean b3 = b;
                while (((t)iterator).hasNext()) {
                    final Map.Entry entry = (Map.Entry)((s)iterator).next();
                    if (m5.contains(entry.getValue())) {
                        ((d1.e)o).remove(entry.getKey());
                        b3 = true;
                    }
                }
                final j a3 = j.a;
                final c f3 = ((d1.e)o).f();
                if (!e.a((Object)f3, (Object)c)) {
                    synchronized (p.a) {
                        final o.a f4 = f.f;
                        e.d((Object)f4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (SnapshotKt.c) {
                            final f j = SnapshotKt.j();
                            final o.a a4 = (o.a)SnapshotKt.u((x)f4, (w)f, j);
                            if (a4.d == d) {
                                a4.c((d)f3);
                                ++a4.d;
                            }
                            else {
                                b2 = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.n(j, (w)f);
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
    
    public final boolean retainAll(final Collection<?> collection) {
        e.f((Object)collection, "elements");
        final Set m5 = CollectionsKt___CollectionsKt.M5((Iterable)collection);
        final o f = super.f;
        boolean b = false;
        while (true) {
            Object o = p.a;
            synchronized (o) {
                final o.a f2 = f.f;
                e.d((Object)f2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final o.a a = (o.a)SnapshotKt.h((x)f2);
                final d<K, ? extends V> c = a.c;
                final int d = a.d;
                final j a2 = j.a;
                monitorexit(o);
                e.c((Object)c);
                o = c.builder();
                final Iterator iterator = f.g.iterator();
                boolean b2 = true;
                boolean b3 = b;
                while (((t)iterator).hasNext()) {
                    final Map.Entry entry = (Map.Entry)((s)iterator).next();
                    if (m5.contains(entry.getValue()) ^ true) {
                        ((d1.e)o).remove(entry.getKey());
                        b3 = true;
                    }
                }
                final j a3 = j.a;
                o = ((d1.e)o).f();
                if (!e.a(o, (Object)c)) {
                    synchronized (p.a) {
                        final o.a f3 = f.f;
                        e.d((Object)f3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (SnapshotKt.c) {
                            final f j = SnapshotKt.j();
                            final o.a a4 = (o.a)SnapshotKt.u((x)f3, (w)f, j);
                            if (a4.d == d) {
                                a4.c((d)o);
                                ++a4.d;
                            }
                            else {
                                b2 = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.n(j, (w)f);
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
