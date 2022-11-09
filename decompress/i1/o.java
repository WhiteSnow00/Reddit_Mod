// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.Collection;
import d1.e;
import java.util.Set;
import androidx.compose.runtime.snapshots.SnapshotKt;
import d1.c;
import bh2.d;
import java.util.Map;

public final class o<K, V> implements Map<K, V>, w, d
{
    public o.o$a f;
    public final i g;
    public final j h;
    public final l i;
    
    public o() {
        this.f = new o.o$a((b1.d)c.h);
        this.g = new i((o<K, V>)this);
        this.h = new j((o<K, V>)this);
        this.i = new l((o<K, V>)this);
    }
    
    public final o.o$a<K, V> b() {
        return (o.o$a<K, V>)SnapshotKt.q((x)this.f, (w)this);
    }
    
    @Override
    public final void clear() {
        final o.o$a o$a = (o.o$a)SnapshotKt.h((x)this.f, SnapshotKt.i());
        final c h = c.h;
        if (h != o$a.c) {
            synchronized (p.a) {
                final o.o$a f = this.f;
                synchronized (SnapshotKt.c) {
                    final f i = SnapshotKt.i();
                    final o.o$a o$a2 = (o.o$a)SnapshotKt.u((x)f, (w)this, i);
                    o$a2.c((b1.d)h);
                    ++o$a2.d;
                    monitorexit(SnapshotKt.c);
                    SnapshotKt.m(i, (w)this);
                }
            }
        }
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.b().c.containsKey(o);
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.b().c.containsValue(o);
    }
    
    @Override
    public final Set<Entry<K, V>> entrySet() {
        return this.g;
    }
    
    @Override
    public final V get(final Object o) {
        return (V)this.b().c.get(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.b().c.isEmpty();
    }
    
    @Override
    public final Set<K> keySet() {
        return this.h;
    }
    
    @Override
    public final V put(final K k, final V v) {
        while (true) {
            synchronized (p.a) {
                final o.o$a o$a = (o.o$a)SnapshotKt.h((x)this.f, SnapshotKt.i());
                final b1.d c = o$a.c;
                final int d = o$a.d;
                final pg2.j a = pg2.j.a;
                monitorexit(p.a);
                ah2.f.c((Object)c);
                final e builder = c.builder();
                final Object put = builder.put(k, v);
                final c g = builder.g();
                if (!ah2.f.a((Object)g, (Object)c)) {
                    synchronized (p.a) {
                        final o.o$a f = this.f;
                        synchronized (SnapshotKt.c) {
                            final f i = SnapshotKt.i();
                            final o.o$a o$a2 = (o.o$a)SnapshotKt.u((x)f, (w)this, i);
                            final int d2 = o$a2.d;
                            boolean b = true;
                            if (d2 == d) {
                                o$a2.c((b1.d)g);
                                ++o$a2.d;
                            }
                            else {
                                b = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.m(i, (w)this);
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
        ah2.f.f((Object)map, "from");
        while (true) {
            synchronized (p.a) {
                final o.o$a o$a = (o.o$a)SnapshotKt.h((x)this.f, SnapshotKt.i());
                final b1.d c = o$a.c;
                final int d = o$a.d;
                final pg2.j a = pg2.j.a;
                monitorexit(p.a);
                ah2.f.c((Object)c);
                final e builder = c.builder();
                builder.putAll(map);
                final c g = builder.g();
                if (!ah2.f.a((Object)g, (Object)c)) {
                    monitorenter(p.a);
                    try {
                        final o.o$a f = this.f;
                        synchronized (SnapshotKt.c) {
                            final f i = SnapshotKt.i();
                            final o.o$a o$a2 = (o.o$a)SnapshotKt.u((x)f, (w)this, i);
                            final int d2 = o$a2.d;
                            boolean b = true;
                            if (d2 == d) {
                                o$a2.c((b1.d)g);
                                ++o$a2.d;
                            }
                            else {
                                b = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.m(i, (w)this);
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
    
    @Override
    public final V remove(final Object o) {
        while (true) {
            synchronized (p.a) {
                final o.o$a o$a = (o.o$a)SnapshotKt.h((x)this.f, SnapshotKt.i());
                final b1.d c = o$a.c;
                final int d = o$a.d;
                final pg2.j a = pg2.j.a;
                monitorexit(p.a);
                ah2.f.c((Object)c);
                final e builder = c.builder();
                final Object remove = builder.remove(o);
                final c g = builder.g();
                if (!ah2.f.a((Object)g, (Object)c)) {
                    synchronized (p.a) {
                        final o.o$a f = this.f;
                        synchronized (SnapshotKt.c) {
                            final f i = SnapshotKt.i();
                            final o.o$a o$a2 = (o.o$a)SnapshotKt.u((x)f, (w)this, i);
                            final int d2 = o$a2.d;
                            boolean b = true;
                            if (d2 == d) {
                                o$a2.c((b1.d)g);
                                ++o$a2.d;
                            }
                            else {
                                b = false;
                            }
                            monitorexit(SnapshotKt.c);
                            SnapshotKt.m(i, (w)this);
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
        return this.b().c.size();
    }
    
    public final x u() {
        return (x)this.f;
    }
    
    @Override
    public final Collection<V> values() {
        return this.i;
    }
    
    public final void z(final x x) {
        this.f = (o.o$a)x;
    }
}
