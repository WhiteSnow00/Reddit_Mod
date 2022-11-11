// 
// Decompiled by Procyon v0.6.0
// 

package jg2;

import java.util.Iterator;
import java.util.Collection;
import sg2.e;
import kotlin.collections.builders.MapBuilder;
import ig2.b;

public final class c<V> extends b<V>
{
    public final MapBuilder<?, V> f;
    
    public c(final MapBuilder<?, V> f) {
        e.f((Object)f, "backing");
        this.f = f;
    }
    
    public final int a() {
        return this.f.size();
    }
    
    public final boolean add(final V v) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(final Collection<? extends V> collection) {
        e.f((Object)collection, "elements");
        throw new UnsupportedOperationException();
    }
    
    public final void clear() {
        this.f.clear();
    }
    
    public final boolean contains(final Object o) {
        return this.f.containsValue(o);
    }
    
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }
    
    public final Iterator<V> iterator() {
        return (Iterator<V>)this.f.valuesIterator$kotlin_stdlib();
    }
    
    public final boolean remove(final Object o) {
        return this.f.removeValue$kotlin_stdlib(o);
    }
    
    public final boolean removeAll(final Collection<?> collection) {
        e.f((Object)collection, "elements");
        this.f.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }
    
    public final boolean retainAll(final Collection<?> collection) {
        e.f((Object)collection, "elements");
        this.f.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
