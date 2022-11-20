// 
// Decompiled by Procyon v0.6.0
// 

package fg2;

import java.util.Comparator;

public final class b<T> implements Comparator
{
    public final Comparator<? super T> f;
    
    public b() {
        this.f = (Comparator<? super T>)d.f;
    }
    
    @Override
    public final int compare(final T t, final T t2) {
        int compare;
        if (t == t2) {
            compare = 0;
        }
        else if (t == null) {
            compare = 1;
        }
        else if (t2 == null) {
            compare = -1;
        }
        else {
            compare = this.f.compare((Object)t, (Object)t2);
        }
        return compare;
    }
}
