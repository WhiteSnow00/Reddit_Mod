// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import java.util.ArrayList;
import dg2.m;
import kotlin.Pair;
import xd.a;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import java.util.Set;
import java.util.LinkedHashMap;
import yh2.e;
import yh2.c;
import java.util.Map;

public final class d
{
    public static final Map<c, e> a;
    public static final LinkedHashMap b;
    public static final Set<c> c;
    public static final Set<e> d;
    
    static {
        final yh2.d j = e$a.j;
        final Pair pair = new Pair((Object)xd.a.p(j, "name"), (Object)e.g("name"));
        final Pair pair2 = new Pair((Object)xd.a.p(j, "ordinal"), (Object)e.g("ordinal"));
        final Pair pair3 = new Pair((Object)e$a.B.c(e.g("size")), (Object)e.g("size"));
        final c f = e$a.F;
        final Set<Map.Entry<c, e>> entrySet = (a = kotlin.collections.c.w4(new Pair[] { pair, pair2, pair3, new Pair((Object)f.c(e.g("size")), (Object)e.g("size")), new Pair((Object)xd.a.p(e$a.e, "length"), (Object)e.g("length")), new Pair((Object)f.c(e.g("keys")), (Object)e.g("keySet")), new Pair((Object)f.c(e.g("values")), (Object)e.g("values")), new Pair((Object)f.c(e.g("entries")), (Object)e.g("entrySet")) })).entrySet();
        final ArrayList list = new ArrayList<Pair>(m.u4((Iterable)entrySet, 10));
        for (final Map.Entry<c, V> entry : entrySet) {
            list.add(new Pair((Object)entry.getKey().f(), (Object)entry.getValue()));
        }
        final LinkedHashMap<Object, List<Object>> linkedHashMap = (LinkedHashMap<Object, List<Object>>)new LinkedHashMap<e, List<Object>>();
        for (final Pair pair4 : list) {
            final e e = (e)pair4.getSecond();
            List<Object> value;
            if ((value = linkedHashMap.get(e)) == null) {
                value = new ArrayList<Object>();
                linkedHashMap.put(e, value);
            }
            value.add(pair4.getFirst());
        }
        final LinkedHashMap b2 = new LinkedHashMap(cg.d.p3(linkedHashMap.size()));
        for (final Map.Entry<Object, V> entry2 : linkedHashMap.entrySet()) {
            b2.put(entry2.getKey(), (Object)CollectionsKt___CollectionsKt.L4((Iterable)entry2.getValue()));
        }
        b = b2;
        final Set<c> set = c = kh2.d.a.keySet();
        final ArrayList list2 = new ArrayList<e>(m.u4((Iterable)set, 10));
        final Iterator<Object> iterator4 = set.iterator();
        while (iterator4.hasNext()) {
            list2.add(iterator4.next().f());
        }
        d = CollectionsKt___CollectionsKt.M5((Iterable)list2);
    }
}
