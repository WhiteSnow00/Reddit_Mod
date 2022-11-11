// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.Set;
import b1.d;
import java.util.Map;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import b1.b;
import java.util.Iterator;
import java.util.Collection;
import sg2.e;

public final class j<K, V> extends k<K, V, K>
{
    public j(final o<K, V> o) {
        sg2.e.f((Object)o, "map");
        super(o);
    }
    
    @Override
    public final boolean add(final Object o) {
        p.a();
        throw null;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        sg2.e.f((Object)collection, "elements");
        p.a();
        throw null;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return ((Map)super.f).containsKey(o);
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        sg2.e.f((Object)collection, "elements");
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
            } while (((Map)super.f).containsKey(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final Iterator iterator() {
        final o<K, V> f = (o<K, V>)super.f;
        return (Iterator)new u((o)f, (Iterator)((Set<Object>)((Map<Object, Object>)f.c().c).entrySet()).iterator());
    }
    
    @Override
    public final boolean remove(final Object o) {
        return super.f.remove(o) != null;
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        sg2.e.f((Object)collection, "elements");
        final Iterator<Object> iterator = collection.iterator();
        boolean b = false;
    Label_0013:
        while (true) {
            b = false;
            while (iterator.hasNext()) {
                if (super.f.remove(iterator.next()) == null && !b) {
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
        sg2.e.f((Object)collection, "elements");
        final Set u4 = CollectionsKt___CollectionsKt.u4((Iterable)collection);
        final o<K, V> f = (o<K, V>)super.f;
        boolean b = false;
        while (true) {
            Object o = p.a;
            synchronized (o) {
                final o$a o$a = SnapshotKt.h(f.f, SnapshotKt.i());
                final d c = o$a.c;
                final int d = o$a.d;
                final hg2.j a = hg2.j.a;
                monitorexit(o);
                sg2.e.c((Object)c);
                o = c.builder();
                final Iterator iterator = f.g.iterator();
                boolean b2 = true;
                boolean b3 = b;
                while (((t)iterator).hasNext()) {
                    final Map.Entry entry = (Map.Entry)((s)iterator).next();
                    if (u4.contains(entry.getKey()) ^ true) {
                        ((d1.e)o).remove(entry.getKey());
                        b3 = true;
                    }
                }
                final hg2.j a2 = hg2.j.a;
                o = ((d1.e)o).g();
                if (!sg2.e.a(o, (Object)c)) {
                    synchronized (p.a) {
                        final o$a f2 = f.f;
                        synchronized (SnapshotKt.c) {
                            final f i = SnapshotKt.i();
                            final o$a o$a2 = SnapshotKt.u(f2, (w)f, i);
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
