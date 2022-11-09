// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.AbstractMap;
import java.util.Iterator;
import ah2.f;
import qg2.b;

public final class k<K, V> extends b<V>
{
    public final e<K, V> f;
    
    public k(final e<K, V> f) {
        ah2.f.f((Object)f, "builder");
        this.f = f;
    }
    
    public final int a() {
        return this.f.c();
    }
    
    public final boolean add(final V v) {
        throw new UnsupportedOperationException();
    }
    
    public final void clear() {
        this.f.clear();
    }
    
    public final boolean contains(final Object o) {
        return ((AbstractMap)this.f).containsValue(o);
    }
    
    public final Iterator<V> iterator() {
        return (Iterator<V>)new l((e<Object, Object>)this.f);
    }
}
