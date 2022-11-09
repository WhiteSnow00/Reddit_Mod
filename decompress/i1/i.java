// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import d1.e;
import b1.d;
import pg2.j;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.Pair;
import java.util.LinkedHashMap;
import a4.u1;
import qg2.m;
import java.util.Set;
import java.util.Iterator;
import bh2.d$a;
import bh2.a;
import java.util.Collection;
import ah2.f;
import java.util.Map;

public final class i<K, V> extends k<K, V, Map.Entry<K, V>>
{
    public i(final o<K, V> o) {
        ah2.f.f((Object)o, "map");
        super(o);
    }
    
    @Override
    public final boolean add(final Object o) {
        ah2.f.f((Object)o, "element");
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
        if (!(o instanceof Map.Entry) || (o instanceof a && !(o instanceof d$a))) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        ah2.f.f((Object)entry, "element");
        return ah2.f.a((Object)super.f.get(entry.getKey()), entry.getValue());
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
    public final Iterator<Map.Entry<K, V>> iterator() {
        final o<K, V> f = super.f;
        return (Iterator<Map.Entry<K, V>>)new s((o)f, (Iterator)((o$a)f.b()).c.entrySet().iterator());
    }
    
    @Override
    public final boolean remove(final Object o) {
        final boolean b = o instanceof Map.Entry;
        boolean b2 = true;
        if (!b || (o instanceof a && !(o instanceof d$a))) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        ah2.f.f((Object)entry, "element");
        if (super.f.remove(entry.getKey()) == null) {
            b2 = false;
        }
        return b2;
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
                if (super.f.remove(((Map.Entry<Object, V>)iterator.next()).getKey()) == null && !b) {
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
        int a0;
        if ((a0 = u1.A0(m.P0((Iterable)collection, 10))) < 16) {
            a0 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(a0);
        for (final Map.Entry entry : collection) {
            final Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        final o<K, V> f = super.f;
        boolean b = false;
        while (true) {
            Object o = p.a;
            synchronized (o) {
                final o$a o$a = (o$a)SnapshotKt.h((x)f.f, SnapshotKt.i());
                final d c = o$a.c;
                final int d = o$a.d;
                final j a2 = j.a;
                monitorexit(o);
                ah2.f.c((Object)c);
                o = c.builder();
                final Iterator iterator2 = f.g.iterator();
                final int n = 1;
                boolean b2 = b;
                while (((t)iterator2).hasNext()) {
                    final Map.Entry entry2 = (Map.Entry)((s)iterator2).next();
                    if (!linkedHashMap.containsKey(entry2.getKey()) || !ah2.f.a(linkedHashMap.get(entry2.getKey()), (Object)entry2.getValue())) {
                        ((e)o).remove(entry2.getKey());
                        b2 = true;
                    }
                }
                final j a3 = j.a;
                o = ((e)o).g();
                if (!ah2.f.a(o, (Object)c)) {
                    synchronized (p.a) {
                        final o.o$a f2 = f.f;
                        synchronized (SnapshotKt.c) {
                            final i1.f i = SnapshotKt.i();
                            final o$a o$a2 = (o$a)SnapshotKt.u((x)f2, (w)f, i);
                            int n2;
                            if (o$a2.d == d) {
                                o$a2.c((d)o);
                                ++o$a2.d;
                                n2 = n;
                            }
                            else {
                                n2 = 0;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.m(i, (w)f);
                            monitorexit(p.a);
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
