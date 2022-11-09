// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.Iterator;
import ah2.f;
import java.util.Map;
import qg2.e;

public final class g<K, V> extends e<Map.Entry<Object, Object>>
{
    public final d1.e<K, V> f;
    
    public g(final d1.e<K, V> f) {
        ah2.f.f((Object)f, "builder");
        this.f = f;
    }
    
    public final boolean a(Object value) {
        final boolean b = value instanceof Map.Entry;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)value;
        ah2.f.f((Object)entry, "element");
        value = this.f.get(entry.getKey());
        boolean a;
        if (value != null) {
            a = ah2.f.a(value, entry.getValue());
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
    
    public final boolean add(final Object o) {
        ah2.f.f((Object)o, "element");
        throw new UnsupportedOperationException();
    }
    
    public final boolean b(final Object o) {
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        ah2.f.f((Object)entry, "element");
        return this.f.remove(entry.getKey(), entry.getValue());
    }
    
    public final void clear() {
        this.f.clear();
    }
    
    public final int getSize() {
        return this.f.c();
    }
    
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new h<K, V>(this.f);
    }
}
