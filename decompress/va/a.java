// 
// Decompiled by Procyon v0.6.0
// 

package va;

import ak0.n;
import java.util.Iterator;
import java.util.HashMap;
import com.google.android.datatransport.Priority;
import android.util.SparseArray;

public final class a
{
    public static SparseArray<Priority> a;
    public static HashMap<Priority, Integer> b;
    
    static {
        va.a.a = (SparseArray<Priority>)new SparseArray();
        (va.a.b = new HashMap<Priority, Integer>()).put(Priority.DEFAULT, 0);
        va.a.b.put(Priority.VERY_LOW, 1);
        va.a.b.put(Priority.HIGHEST, 2);
        for (final Priority priority : va.a.b.keySet()) {
            va.a.a.append((int)va.a.b.get(priority), (Object)priority);
        }
    }
    
    public static int a(final Priority priority) {
        final Integer n = va.a.b.get(priority);
        if (n != null) {
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("PriorityMapping is missing known Priority value ");
        sb.append(priority);
        throw new IllegalStateException(sb.toString());
    }
    
    public static Priority b(final int n) {
        final Priority priority = (Priority)va.a.a.get(n);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(n.k("Unknown Priority for value ", n));
    }
}
