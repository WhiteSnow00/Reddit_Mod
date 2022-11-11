// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.Iterator;
import ig2.e;

public final class i<K, V> extends e<K>
{
    public final d1.e<K, V> f;
    
    public i(final d1.e<K, V> f) {
        sg2.e.f((Object)f, "builder");
        this.f = f;
    }
    
    public final boolean add(final K k) {
        throw new UnsupportedOperationException();
    }
    
    public final void clear() {
        this.f.clear();
    }
    
    public final boolean contains(final Object o) {
        return this.f.containsKey(o);
    }
    
    public final int getSize() {
        return this.f.d();
    }
    
    public final Iterator<K> iterator() {
        return (Iterator<K>)new j((d1.e)this.f);
    }
    
    public final boolean remove(final Object o) {
        if (this.f.containsKey(o)) {
            this.f.remove(o);
            return true;
        }
        return false;
    }
}
