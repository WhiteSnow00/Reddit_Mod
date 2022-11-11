// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.Collection;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArrayList;

public final class 0c7<T> extends CopyOnWriteArrayList<T>
{
    static {
        Covode.recordClassIndex(5694);
    }
    
    @Override
    public final boolean add(final T t) {
        return t != null && !this.contains(t) && super.add(t);
    }
    
    @Override
    public final boolean addAll(final Collection<? extends T> collection) {
        final Iterator<? extends T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
        return true;
    }
    
    @Override
    public final boolean remove(final Object o) {
        return o != null && super.remove(o);
    }
}
