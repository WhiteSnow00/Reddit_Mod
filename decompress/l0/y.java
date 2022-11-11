// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import rg2.l;
import java.util.Iterator;
import kotlin.Pair;
import java.util.Map;
import java.util.LinkedHashMap;
import bg.d;
import sg2.e;

public final class y<T> implements p<T>
{
    public final y.y$b<T> a;
    
    public y(final y.y$b<T> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof y && e.a((Object)this.a, (Object)((y)o).a);
    }
    
    public final <V extends i> r0<V> f(final g0<T, V> g0) {
        e.f((Object)g0, "converter");
        final LinkedHashMap b = this.a.b;
        final LinkedHashMap linkedHashMap = new LinkedHashMap(d.o0(b.size()));
        for (final Map.Entry<Object, V> entry : b.entrySet()) {
            final Object key = entry.getKey();
            final y.y$a y$a = (y.y$a)entry.getValue();
            final l a = g0.a();
            y$a.getClass();
            e.f((Object)a, "convertToVector");
            linkedHashMap.put(key, (Object)new Pair(a.invoke(y$a.a), (Object)y$a.b));
        }
        return new r0<V>(linkedHashMap, this.a.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
