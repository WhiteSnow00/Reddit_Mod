// 
// Decompiled by Procyon v0.6.0
// 

package sj2;

import java.util.Iterator;
import sg2.e;
import pj2.b;
import java.util.LinkedHashMap;
import java.util.Map;

public final class j0<K, V> extends r0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>>
{
    public final i0 c;
    
    public j0(final b<K> b, final b<V> b2) {
        e.f((Object)b, "kSerializer");
        e.f((Object)b2, "vSerializer");
        super((b)b, (b)b2);
        this.c = new i0(b.getDescriptor(), b2.getDescriptor());
    }
    
    public final Object a() {
        return new LinkedHashMap();
    }
    
    public final int b(final Object o) {
        final LinkedHashMap linkedHashMap = (LinkedHashMap)o;
        e.f((Object)linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }
    
    public final Iterator c(final Object o) {
        final Map map = (Map)o;
        e.f((Object)map, "<this>");
        return map.entrySet().iterator();
    }
    
    public final int d(final Object o) {
        final Map map = (Map)o;
        e.f((Object)map, "<this>");
        return map.size();
    }
    
    public final Object g(final Object o) {
        e.f((Object)null, "<this>");
        throw null;
    }
    
    public final qj2.e getDescriptor() {
        return (qj2.e)this.c;
    }
    
    public final Object h(final Object o) {
        final LinkedHashMap linkedHashMap = (LinkedHashMap)o;
        e.f((Object)linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
