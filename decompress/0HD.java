// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import com.bytedance.covode.number.Covode;

public final class 0hd
{
    static {
        Covode.recordClassIndex(6474);
    }
    
    public static final <T, R> void LIZ(final ConcurrentHashMap<T, List<R>> concurrentHashMap, final T t, final R r) {
        if (t == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        final List list = concurrentHashMap.get(t);
        if (list != null) {
            list.add(r);
            return;
        }
        final ArrayList list2 = new ArrayList();
        list2.add(r);
        concurrentHashMap.put(t, list2);
    }
    
    public static final <T, R> void LIZ(final ConcurrentHashMap<T, List<R>> concurrentHashMap, final T t, final List<? extends R> list) {
        if (t == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        final List list2 = concurrentHashMap.get(t);
        if (list2 != null) {
            list2.addAll(list);
            return;
        }
        final ArrayList list3 = new ArrayList();
        list3.addAll(list);
        concurrentHashMap.put(t, list3);
    }
}
