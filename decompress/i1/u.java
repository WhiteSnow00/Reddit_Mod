// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import ng2.e;
import java.util.Map;
import og2.a;
import java.util.Iterator;

public final class u<K, V> extends t<K, V> implements Iterator<K>, a
{
    public u(final o<K, V> o, final Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        e.f((Object)o, "map");
        e.f((Object)iterator, "iterator");
        super((o)o, (Iterator)iterator);
    }
    
    public final K next() {
        final Map.Entry j = super.j;
        if (j != null) {
            this.a();
            return j.getKey();
        }
        throw new IllegalStateException();
    }
}
