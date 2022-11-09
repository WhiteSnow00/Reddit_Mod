// 
// Decompiled by Procyon v0.6.0
// 

package n;

import java.util.HashMap;

public final class a<K, V> extends b<K, V>
{
    public HashMap<K, c<K, V>> j;
    
    public a() {
        this.j = new HashMap<K, c<K, V>>();
    }
    
    @Override
    public final c<K, V> a(final K k) {
        return this.j.get(k);
    }
    
    @Override
    public final V b(final K k, final V v) {
        final c<K, V> a = this.a(k);
        if (a != null) {
            return a.g;
        }
        final HashMap<K, c<K, V>> j = this.j;
        final c c = new c<Object, Object>(k, v);
        ++super.i;
        final c<K, V> g = (c<K, V>)super.g;
        if (g == null) {
            super.f = c;
            super.g = c;
        }
        else {
            g.h = (c<K, V>)c;
            c.i = (c<K, V>)g;
            super.g = c;
        }
        j.put(k, (c<K, V>)c);
        return null;
    }
    
    @Override
    public final V c(final K k) {
        final V c = super.c(k);
        this.j.remove(k);
        return c;
    }
}
