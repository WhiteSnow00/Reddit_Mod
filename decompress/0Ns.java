// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 0Ns
{
    static {
        Covode.recordClassIndex(3923);
    }
    
    public static final <T> List<T> LIZ(final List<T> list, final T t) {
        List<T> list2 = list;
        if (list == null) {
            list2 = new LinkedList<T>();
        }
        list2.add(t);
        return list2;
    }
    
    public static final <T> Set<T> LIZ(final Set<T> set, final T t) {
        Set<T> set2 = set;
        if (set == null) {
            set2 = new HashSet<T>();
        }
        set2.add(t);
        return set2;
    }
}
