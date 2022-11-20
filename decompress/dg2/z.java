// 
// Decompiled by Procyon v0.6.0
// 

package dg2;

import java.util.Iterator;
import java.util.ArrayList;
import cg.d;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import java.util.List;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ng2.e;
import java.util.Map;
import kotlin.collections.c;

public final class z extends c
{
    public static final q I4(final Map map) {
        e.f((Object)map, "<this>");
        return CollectionsKt___CollectionsKt.I4((Iterable)map.entrySet());
    }
    
    public static final List J4(final LinkedHashMap linkedHashMap) {
        e.f((Object)linkedHashMap, "<this>");
        if (linkedHashMap.size() == 0) {
            return (List)EmptyList.INSTANCE;
        }
        final Iterator iterator = linkedHashMap.entrySet().iterator();
        if (!iterator.hasNext()) {
            return (List)EmptyList.INSTANCE;
        }
        final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
        if (!iterator.hasNext()) {
            return d.l3((Object)new Pair(entry.getKey(), (Object)entry.getValue()));
        }
        final ArrayList list = new ArrayList(linkedHashMap.size());
        list.add(new Pair(entry.getKey(), (Object)entry.getValue()));
        do {
            final Map.Entry<Object, V> entry2 = (Map.Entry<Object, V>)iterator.next();
            list.add(new Pair(entry2.getKey(), (Object)entry2.getValue()));
        } while (iterator.hasNext());
        return list;
    }
}
