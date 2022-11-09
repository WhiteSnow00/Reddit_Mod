// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import ah2.f;
import gn.a;
import qg2.d;

public final class e<K, V> extends d<K, V>
{
    public c<K, V> f;
    public a g;
    public s<K, V> h;
    public V i;
    public int j;
    public int k;
    
    public e(final c<K, V> f) {
        ah2.f.f((Object)f, "map");
        this.f = f;
        this.g = new a();
        this.h = f.f;
        this.k = f.g;
    }
    
    public final Set<Map.Entry<K, V>> a() {
        return (Set<Map.Entry<K, V>>)new g((e<Object, Object>)this);
    }
    
    public final Set<K> b() {
        return (Set<K>)new i((e<Object, Object>)this);
    }
    
    public final int c() {
        return this.k;
    }
    
    public final void clear() {
        final s e = s.e;
        this.h = (s<K, V>)s.e;
        this.h(0);
    }
    
    public final boolean containsKey(final Object o) {
        final s<K, V> h = this.h;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return h.d(hashCode, 0, o);
    }
    
    public final Collection<V> d() {
        return (Collection<V>)new k((e<Object, Object>)this);
    }
    
    public final c<K, V> g() {
        final s<K, V> h = this.h;
        c<K, V> f = this.f;
        if (h != f.f) {
            this.g = new a();
            f = new c<K, V>(this.h, this.c());
        }
        return this.f = f;
    }
    
    public final V get(final Object o) {
        final s<K, V> h = this.h;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (V)h.g(hashCode, 0, o);
    }
    
    public final void h(final int k) {
        this.k = k;
        ++this.j;
    }
    
    public final V put(final K k, final V v) {
        this.i = null;
        final s<K, V> h = this.h;
        int hashCode;
        if (k != null) {
            hashCode = k.hashCode();
        }
        else {
            hashCode = 0;
        }
        this.h = (s<K, V>)h.l(hashCode, (Object)k, (Object)v, 0, this);
        return this.i;
    }
    
    public final void putAll(final Map<? extends K, ? extends V> map) {
        ah2.f.f((Object)map, "from");
        final boolean b = map instanceof c;
        final c c = null;
        c g;
        if (b) {
            g = (c)map;
        }
        else {
            g = null;
        }
        if (g == null) {
            e e;
            if (map instanceof e) {
                e = (e)map;
            }
            else {
                e = null;
            }
            g = c;
            if (e != null) {
                g = e.g();
            }
        }
        if (g != null) {
            final f1.a a = new f1.a(0);
            final int k = this.k;
            this.h = (s<K, V>)this.h.m((s)g.f, 0, a, this);
            final int n = g.g + k - a.a;
            if (k != n) {
                this.h(n);
            }
        }
        else {
            this.putAll(map);
        }
    }
    
    public final V remove(final Object o) {
        this.i = null;
        final s<K, V> h = this.h;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        s h2;
        if ((h2 = h.n(hashCode, o, 0, this)) == null) {
            final s e = s.e;
            h2 = s.e;
        }
        this.h = (s<K, V>)h2;
        return this.i;
    }
    
    public final boolean remove(final Object o, final Object o2) {
        final int c = this.c();
        final s<K, V> h = this.h;
        boolean b = false;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        s h2;
        if ((h2 = h.o(hashCode, o, o2, 0, this)) == null) {
            final s e = s.e;
            h2 = s.e;
        }
        this.h = (s<K, V>)h2;
        if (c != this.c()) {
            b = true;
        }
        return b;
    }
}
