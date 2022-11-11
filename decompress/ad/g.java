// 
// Decompiled by Procyon v0.6.0
// 

package ad;

import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashMap;

public final class g<E> implements Iterable<E>
{
    public final Object f;
    public final HashMap g;
    public Set<E> h;
    public List<E> i;
    
    public g() {
        this.f = new Object();
        this.g = new HashMap();
        this.h = Collections.emptySet();
        this.i = Collections.emptyList();
    }
    
    public final int count(final E e) {
        synchronized (this.f) {
            int intValue;
            if (this.g.containsKey(e)) {
                intValue = this.g.get(e);
            }
            else {
                intValue = 0;
            }
            return intValue;
        }
    }
    
    @Override
    public final Iterator<E> iterator() {
        synchronized (this.f) {
            return this.i.iterator();
        }
    }
}
