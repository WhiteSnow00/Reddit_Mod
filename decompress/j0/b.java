// 
// Decompiled by Procyon v0.6.0
// 

package j0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class b<K, V> extends i<K, V> implements Map<K, V>
{
    public a m;
    
    public b() {
    }
    
    public b(final int n) {
        super(n);
    }
    
    public b(final b b) {
        if (b != null) {
            this.k(b);
        }
    }
    
    public final Set<Entry<K, V>> entrySet() {
        if (this.m == null) {
            this.m = new a(this);
        }
        final a m = this.m;
        if (m.a == null) {
            m.a = new h$b((h)m);
        }
        return (Set<Entry<K, V>>)m.a;
    }
    
    public final Set<K> keySet() {
        if (this.m == null) {
            this.m = new a(this);
        }
        final a m = this.m;
        if (m.b == null) {
            m.b = new h$c((h)m);
        }
        return (Set<K>)m.b;
    }
    
    public final void putAll(final Map<? extends K, ? extends V> map) {
        this.c(map.size() + super.h);
        for (final Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey(), (Object)entry.getValue());
        }
    }
    
    public final Collection<V> values() {
        if (this.m == null) {
            this.m = new a(this);
        }
        final a m = this.m;
        if (m.c == null) {
            m.c = new h$e((h)m);
        }
        return (Collection<V>)m.c;
    }
}
