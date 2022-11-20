// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import ng2.e;
import og2.a;
import java.util.Map;
import java.util.Iterator;

public final class s<K, V> extends t<K, V> implements Iterator<Map.Entry<K, V>>, a
{
    public s(final o<K, V> o, final Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        e.f((Object)o, "map");
        e.f((Object)iterator, "iterator");
        super((o)o, (Iterator)iterator);
    }
    
    public final Object next() {
        this.a();
        if (super.i != null) {
            return new r((s<Object, Object>)this);
        }
        throw new IllegalStateException();
    }
}
