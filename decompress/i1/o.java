// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.Collection;
import java.util.Set;
import d1.c;
import androidx.compose.runtime.snapshots.SnapshotKt;
import ng2.e;
import mg.d0;
import og2.d;
import java.util.Map;

public final class o<K, V> implements Map<K, V>, w, d
{
    public a f;
    public final i g;
    public final j h;
    public final l i;
    
    public o() {
        this.f = new a((b1.d<K, ? extends V>)d0.C0());
        this.g = new i((o<K, V>)this);
        this.h = new j((o<K, V>)this);
        this.i = new l((o<K, V>)this);
    }
    
    public final a<K, V> b() {
        final a f = this.f;
        e.d((Object)f, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a)SnapshotKt.r((x)f, (w)this);
    }
    
    @Override
    public final void clear() {
        final a f = this.f;
        e.d((Object)f, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        final a a = (a)SnapshotKt.h((x)f);
        final c c0 = d0.C0();
        if (c0 != a.c) {
            synchronized (p.a) {
                final a f2 = this.f;
                e.d((Object)f2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (SnapshotKt.c) {
                    final f j = SnapshotKt.j();
                    final a a2 = (a)SnapshotKt.u((x)f2, (w)this, j);
                    a2.c = (b1.d<K, ? extends V>)c0;
                    ++a2.d;
                    monitorexit(SnapshotKt.c);
                    SnapshotKt.n(j, (w)this);
                }
            }
        }
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return ((Map)this.b().c).containsKey(o);
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return ((Map)this.b().c).containsValue(o);
    }
    
    @Override
    public final Set<Entry<K, V>> entrySet() {
        return (Set<Entry<K, V>>)this.g;
    }
    
    @Override
    public final V get(final Object o) {
        return (V)this.b().c.get(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return ((Map)this.b().c).isEmpty();
    }
    
    @Override
    public final Set<K> keySet() {
        return (Set<K>)this.h;
    }
    
    @Override
    public final V put(final K k, final V v) {
        while (true) {
            synchronized (p.a) {
                final a f = this.f;
                e.d((Object)f, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final a a = (a)SnapshotKt.h((x)f);
                final b1.d<K, ? extends V> c = a.c;
                final int d = a.d;
                final cg2.j a2 = cg2.j.a;
                monitorexit(p.a);
                e.c((Object)c);
                final d1.e builder = c.builder();
                final Object put = builder.put((Object)k, (Object)v);
                final c f2 = builder.f();
                if (!e.a((Object)f2, (Object)c)) {
                    synchronized (p.a) {
                        final a f3 = this.f;
                        e.d((Object)f3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (SnapshotKt.c) {
                            final f j = SnapshotKt.j();
                            final a a3 = (a)SnapshotKt.u((x)f3, (w)this, j);
                            final int d2 = a3.d;
                            boolean b = true;
                            if (d2 == d) {
                                a3.c((b1.d)f2);
                                ++a3.d;
                            }
                            else {
                                b = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.n(j, (w)this);
                            monitorexit(p.a);
                            if (b) {
                                return (V)put;
                            }
                            continue;
                        }
                    }
                }
                return (V)put;
            }
        }
    }
    
    @Override
    public final void putAll(final Map<? extends K, ? extends V> map) {
        e.f((Object)map, "from");
        while (true) {
            synchronized (p.a) {
                final a f = this.f;
                e.d((Object)f, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final a a = (a)SnapshotKt.h((x)f);
                final b1.d<K, ? extends V> c = a.c;
                final int d = a.d;
                final cg2.j a2 = cg2.j.a;
                monitorexit(p.a);
                e.c((Object)c);
                final d1.e builder = c.builder();
                builder.putAll((Map)map);
                final c f2 = builder.f();
                if (!e.a((Object)f2, (Object)c)) {
                    monitorenter(p.a);
                    try {
                        final a f3 = this.f;
                        e.d((Object)f3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (SnapshotKt.c) {
                            final f j = SnapshotKt.j();
                            final a a3 = (a)SnapshotKt.u((x)f3, (w)this, j);
                            final int d2 = a3.d;
                            boolean b = true;
                            if (d2 == d) {
                                a3.c((b1.d)f2);
                                ++a3.d;
                            }
                            else {
                                b = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.n(j, (w)this);
                            monitorexit(p.a);
                            if (b) {
                                return;
                            }
                            continue;
                        }
                    }
                    finally {}
                }
            }
        }
    }
    
    public final x q() {
        return this.f;
    }
    
    @Override
    public final V remove(final Object o) {
        while (true) {
            synchronized (p.a) {
                final a f = this.f;
                e.d((Object)f, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                final a a = (a)SnapshotKt.h((x)f);
                final b1.d<K, ? extends V> c = a.c;
                final int d = a.d;
                final cg2.j a2 = cg2.j.a;
                monitorexit(p.a);
                e.c((Object)c);
                final d1.e builder = c.builder();
                final Object remove = builder.remove(o);
                final c f2 = builder.f();
                if (!e.a((Object)f2, (Object)c)) {
                    synchronized (p.a) {
                        final a f3 = this.f;
                        e.d((Object)f3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (SnapshotKt.c) {
                            final f j = SnapshotKt.j();
                            final a a3 = (a)SnapshotKt.u((x)f3, (w)this, j);
                            final int d2 = a3.d;
                            boolean b = true;
                            if (d2 == d) {
                                a3.c((b1.d)f2);
                                ++a3.d;
                            }
                            else {
                                b = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.n(j, (w)this);
                            monitorexit(p.a);
                            if (b) {
                                return (V)remove;
                            }
                            continue;
                        }
                    }
                }
                return (V)remove;
            }
        }
    }
    
    @Override
    public final int size() {
        return ((Map)this.b().c).size();
    }
    
    public final void u(final x x) {
        this.f = (a)x;
    }
    
    @Override
    public final Collection<V> values() {
        return (Collection<V>)this.i;
    }
    
    public static final class a<K, V> extends x
    {
        public b1.d<K, ? extends V> c;
        public int d;
        
        public a(final b1.d<K, ? extends V> c) {
            e.f((Object)c, "map");
            this.c = c;
        }
        
        public final void a(final x x) {
            e.f((Object)x, "value");
            final a a = (a)x;
            synchronized (p.a) {
                this.c = a.c;
                this.d = a.d;
                final cg2.j a2 = cg2.j.a;
            }
        }
        
        public final x b() {
            return new a<Object, Object>(this.c);
        }
        
        public final void c(final b1.d<K, ? extends V> c) {
            e.f((Object)c, "<set-?>");
            this.c = c;
        }
    }
}
