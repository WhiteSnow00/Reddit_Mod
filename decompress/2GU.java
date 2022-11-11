// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 2Gu<E> extends Qrr<E>
{
    public final 1gm<E, Boolean> LIZ;
    
    static {
        Covode.recordClassIndex(1824);
    }
    
    public 2Gu(final boolean b) {
        this.LIZ = new 1gm<E, Boolean>(b);
    }
    
    public final int LIZ() {
        return this.LIZ.keySet().size();
    }
    
    public final boolean add(final E e) {
        final 1gm<E, Boolean> liz = this.LIZ;
        final Boolean value = true;
        return n.LIZ((Object)liz.put(e, value), (Object)value);
    }
    
    public final void clear() {
        this.LIZ.clear();
    }
    
    public final boolean contains(final Object o) {
        return this.LIZ.keySet().contains(o);
    }
    
    public final boolean isEmpty() {
        return this.LIZ.keySet().isEmpty();
    }
    
    public final Iterator<E> iterator() {
        return this.LIZ.keySet().iterator();
    }
    
    public final boolean remove(final Object o) {
        return n.LIZ((Object)this.LIZ.remove(o), (Object)true);
    }
}
