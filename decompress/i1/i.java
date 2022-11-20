// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.Set;
import cg2.j;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.Pair;
import java.util.LinkedHashMap;
import cg.d;
import dg2.m;
import b1.b;
import java.util.Iterator;
import og2.d$a;
import og2.a;
import java.util.Collection;
import ng2.e;
import java.util.Map;

public final class i<K, V> extends k<K, V, Map.Entry<K, V>>
{
    public i(final o<K, V> o) {
        e.f((Object)o, "map");
        super((o)o);
    }
    
    public final boolean add(final Object o) {
        e.f((Object)o, "element");
        p.a();
        throw null;
    }
    
    public final boolean addAll(final Collection collection) {
        e.f((Object)collection, "elements");
        p.a();
        throw null;
    }
    
    public final boolean contains(final Object o) {
        if (!(o instanceof Map.Entry) || (o instanceof a && !(o instanceof d$a))) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        e.f((Object)entry, "element");
        return e.a(super.f.get(entry.getKey()), entry.getValue());
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
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    public final Iterator<Map.Entry<K, V>> iterator() {
        final o f = super.f;
        return new s<K, V>(f, (Iterator<? extends Map.Entry<?, ?>>)((Set<Object>)((o.a)f.b()).c.entrySet()).iterator());
    }
    
    public final boolean remove(final Object o) {
        final boolean b = o instanceof Map.Entry;
        boolean b2 = true;
        if (!b || (o instanceof a && !(o instanceof d$a))) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        e.f((Object)entry, "element");
        if (super.f.remove(entry.getKey()) == null) {
            b2 = false;
        }
        return b2;
    }
    
    public final boolean removeAll(final Collection<?> collection) {
        e.f((Object)collection, "elements");
        final Iterator<?> iterator = collection.iterator();
        boolean b = false;
    Label_0013:
        while (true) {
            b = false;
            while (iterator.hasNext()) {
                if (super.f.remove(((Map.Entry<Object, V>)iterator.next()).getKey()) == null && !b) {
                    continue Label_0013;
                }
                b = true;
            }
            break;
        }
        return b;
    }
    
    public final boolean retainAll(final Collection<?> collection) {
        e.f((Object)collection, "elements");
        int p;
        if ((p = d.p3(m.u4((Iterable)collection, 10))) < 16) {
            p = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(p);
        for (final Map.Entry entry : collection) {
            final Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        final o f = super.f;
        boolean b = false;
        while (true) {
            Object o = i1.p.a;
            synchronized (o) {
                final o.a f2 = f.f;
                e.d((Object)f2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final o.a a = (o.a)SnapshotKt.h((x)f2);
                final b1.d<K, ? extends V> c = a.c;
                final int d = a.d;
                final j a2 = j.a;
                monitorexit(o);
                e.c((Object)c);
                o = c.builder();
                final Iterator iterator2 = f.g.iterator();
                final int n = 1;
                boolean b2 = b;
                while (((t)iterator2).hasNext()) {
                    final Map.Entry entry2 = (Map.Entry)((s)iterator2).next();
                    if (!linkedHashMap.containsKey(entry2.getKey()) || !e.a(linkedHashMap.get(entry2.getKey()), (Object)entry2.getValue())) {
                        ((d1.e)o).remove(entry2.getKey());
                        b2 = true;
                    }
                }
                final j a3 = j.a;
                o = ((d1.e)o).f();
                if (!e.a(o, (Object)c)) {
                    synchronized (i1.p.a) {
                        final o.a f3 = f.f;
                        e.d((Object)f3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (SnapshotKt.c) {
                            final f j = SnapshotKt.j();
                            final o.a a4 = (o.a)SnapshotKt.u((x)f3, (w)f, j);
                            int n2;
                            if (a4.d == d) {
                                a4.c((b1.d)o);
                                ++a4.d;
                                n2 = n;
                            }
                            else {
                                n2 = 0;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.n(j, (w)f);
                            monitorexit(i1.p.a);
                            b = b2;
                            if (n2 != 0) {
                                return b2;
                            }
                            continue;
                        }
                    }
                }
                return b2;
            }
        }
    }
}
