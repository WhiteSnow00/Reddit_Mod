// 
// Decompiled by Procyon v0.6.0
// 

package fg2;

import java.util.Comparator;

public final class e implements Comparator<Comparable<? super Object>>
{
    public static final e f;
    
    static {
        f = new e();
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final Comparable comparable = (Comparable)o;
        final Comparable comparable2 = (Comparable)o2;
        ng2.e.f((Object)comparable, "a");
        ng2.e.f((Object)comparable2, "b");
        return comparable2.compareTo(comparable);
    }
    
    @Override
    public final Comparator<Comparable<Object>> reversed() {
        return (Comparator<Comparable<Object>>)d.f;
    }
}
