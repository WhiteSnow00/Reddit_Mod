// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.Collection;
import tg2.e;
import java.util.Set;

public abstract class k<K, V, E> implements Set<E>, e
{
    public final o<K, V> f;
    
    public k(final o<K, V> f) {
        sg2.e.f((Object)f, "map");
        this.f = f;
    }
    
    @Override
    public final void clear() {
        this.f.clear();
    }
    
    @Override
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }
    
    @Override
    public final int size() {
        return this.f.size();
    }
    
    @Override
    public final Object[] toArray() {
        return lq0.k.I0((Collection)this);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        sg2.e.f((Object)array, "array");
        return (T[])lq0.k.J0((Collection)this, (Object[])array);
    }
}
