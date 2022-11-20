// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import ng2.e;
import java.util.Map;
import og2.a;
import java.util.Iterator;

public final class v<K, V> extends t<K, V> implements Iterator<V>, a
{
    public v(final o<K, V> o, final Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        e.f((Object)o, "map");
        e.f((Object)iterator, "iterator");
        super((o)o, (Iterator)iterator);
    }
    
    public final V next() {
        final Map.Entry j = super.j;
        if (j != null) {
            this.a();
            return j.getValue();
        }
        throw new IllegalStateException();
    }
}
