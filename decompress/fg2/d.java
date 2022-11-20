// 
// Decompiled by Procyon v0.6.0
// 

package fg2;

import ng2.e;
import java.util.Comparator;

public final class d implements Comparator<Comparable<? super Object>>
{
    public static final d f;
    
    static {
        f = new d();
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final Comparable comparable = (Comparable)o;
        final Comparable comparable2 = (Comparable)o2;
        e.f((Object)comparable, "a");
        e.f((Object)comparable2, "b");
        return comparable.compareTo(comparable2);
    }
    
    @Override
    public final Comparator<Comparable<Object>> reversed() {
        return (Comparator<Comparable<Object>>)fg2.e.f;
    }
}
