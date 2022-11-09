// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.Iterator;
import b1.b;
import java.util.Map;
import qg2.f;

public final class m<K, V> extends f<Map.Entry<? extends K, ? extends V>> implements b<Map.Entry<? extends K, ? extends V>>
{
    public final c<K, V> f;
    
    public m(final c<K, V> f) {
        ah2.f.f((Object)f, "map");
        this.f = f;
    }
    
    public final int a() {
        final c<K, V> f = this.f;
        f.getClass();
        return f.g;
    }
    
    public final boolean contains(final Object o) {
        final boolean b = o instanceof Map.Entry;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        ah2.f.f((Object)entry, "element");
        final V value = this.f.get(entry.getKey());
        boolean a;
        if (value != null) {
            a = ah2.f.a((Object)value, entry.getValue());
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
    
    public final Iterator<Map.Entry<K, V>> iterator() {
        return (Iterator<Map.Entry<K, V>>)new n((d1.s<Object, Object>)this.f.f);
    }
}
