// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import com.bytedance.covode.number.Covode;

public abstract class 17O<T> extends 0GJ
{
    static {
        Covode.recordClassIndex(1677);
    }
    
    public 17O(final 0GE 0ge) {
        super(0ge);
    }
    
    public final int LIZ(final Iterable<? extends T> iterable) {
        final 168 liziz = this.LIZIZ();
        int n = 0;
        try {
            final Iterator<? extends T> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.LIZ(liziz, iterator.next());
                n += liziz.LIZ();
            }
            return n;
        }
        finally {
            this.LIZ(liziz);
        }
    }
    
    @Override
    public abstract String LIZ();
    
    public abstract void LIZ(final 168 p0, final T p1);
}
