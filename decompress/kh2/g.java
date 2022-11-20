// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import java.util.ArrayList;
import yh2.b;
import yh2.h;
import yh2.c;
import java.util.Map;
import java.util.LinkedHashMap;

public final class g
{
    public static final LinkedHashMap a;
    public static final Map<c, c> b;
    
    static {
        final LinkedHashMap linkedHashMap = a = new LinkedHashMap();
        b(h.q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(h.r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(h.s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(yh2.b.l(new c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(yh2.b.l(new c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        final ArrayList list = new ArrayList<Pair>(linkedHashMap.size());
        for (final Map.Entry<b, V> entry : linkedHashMap.entrySet()) {
            list.add(new Pair((Object)entry.getKey().b(), (Object)((b)entry.getValue()).b()));
        }
        b = kotlin.collections.c.E4((List)list);
    }
    
    public static ArrayList a(final String... array) {
        final ArrayList list = new ArrayList(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(yh2.b.l(new c(array[i])));
        }
        return list;
    }
    
    public static void b(final b b, final ArrayList list) {
        final LinkedHashMap a = g.a;
        for (final Object next : list) {
            final b b2 = (b)next;
            a.put(next, b);
        }
    }
}
