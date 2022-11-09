// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.Iterator;
import ah2.f;
import kotlin.collections.AbstractCollection;

public final class q<K, V> extends AbstractCollection<V>
{
    public final c<K, V> f;
    
    public q(final c<K, V> f) {
        ah2.f.f((Object)f, "map");
        this.f = f;
    }
    
    public final int a() {
        final c<K, V> f = this.f;
        f.getClass();
        return f.g;
    }
    
    public final boolean contains(final Object o) {
        return this.f.containsValue(o);
    }
    
    public final Iterator<V> iterator() {
        return (Iterator<V>)new r((d1.s<Object, Object>)this.f.f);
    }
}
