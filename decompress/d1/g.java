// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.Iterator;
import java.util.Map;
import dg2.e;

public final class g<K, V> extends e<Map.Entry<Object, Object>>
{
    public final d1.e<K, V> f;
    
    public g(final d1.e<K, V> f) {
        ng2.e.f((Object)f, "builder");
        this.f = f;
    }
    
    public final boolean a(final Object o) {
        final boolean b = o instanceof Map.Entry;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        ng2.e.f((Object)entry, "element");
        final Object value = this.f.get(entry.getKey());
        boolean a;
        if (value != null) {
            a = ng2.e.a(value, entry.getValue());
        }
        else {
            a = b2;
            if (entry.getValue() == null) {
                a = b2;
                if (this.f.containsKey(entry.getKey())) {
                    a = true;
                }
            }
        }
        return a;
    }
    
    @Override
    public final boolean add(final Object o) {
        ng2.e.f((Object)o, "element");
        throw new UnsupportedOperationException();
    }
    
    public final boolean c(final Object o) {
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        ng2.e.f((Object)entry, "element");
        return this.f.remove(entry.getKey(), entry.getValue());
    }
    
    public final void clear() {
        this.f.clear();
    }
    
    public final /* bridge */ boolean contains(final Object o) {
        return this.a(o);
    }
    
    @Override
    public final int getSize() {
        return this.f.c();
    }
    
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new h(this.f);
    }
    
    public final /* bridge */ boolean remove(final Object o) {
        return this.c(o);
    }
}
