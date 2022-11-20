// 
// Decompiled by Procyon v0.6.0
// 

package dg2;

import java.util.Collection;
import java.util.Set;
import ng2.e;
import mg2.l;
import java.util.Map;

public final class b0<K, V> implements a0<K, V>
{
    public final Map<K, V> f;
    public final l<K, V> g;
    
    public b0(final Map<K, V> f, final l<? super K, ? extends V> g) {
        e.f((Object)f, "map");
        e.f((Object)g, "default");
        this.f = f;
        this.g = (l<K, V>)g;
    }
    
    public final void clear() {
        this.f.clear();
    }
    
    public final boolean containsKey(final Object o) {
        return this.f.containsKey(o);
    }
    
    public final boolean containsValue(final Object o) {
        return this.f.containsValue(o);
    }
    
    public final V e(final K k) {
        final Map<K, V> f = this.f;
        Object o2;
        final Object o = o2 = f.get(k);
        if (o == null) {
            o2 = o;
            if (!f.containsKey(k)) {
                o2 = this.g.invoke((Object)k);
            }
        }
        return (V)o2;
    }
    
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f.entrySet();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.f.equals(o);
    }
    
    public final V get(final Object o) {
        return this.f.get(o);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    public final Map<K, V> i() {
        return this.f;
    }
    
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }
    
    public final Set<K> keySet() {
        return this.f.keySet();
    }
    
    public final V put(final K k, final V v) {
        return this.f.put(k, v);
    }
    
    public final void putAll(final Map<? extends K, ? extends V> map) {
        e.f((Object)map, "from");
        this.f.putAll(map);
    }
    
    public final V remove(final Object o) {
        return this.f.remove(o);
    }
    
    public final int size() {
        return this.f.size();
    }
    
    @Override
    public final String toString() {
        return this.f.toString();
    }
    
    public final Collection<V> values() {
        return this.f.values();
    }
}
