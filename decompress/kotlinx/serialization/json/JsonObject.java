// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.json;

import java.util.Collection;
import mg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Set;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.LinkedHashMap;
import pj2.c;
import lj2.e;
import og2.a;
import java.util.Map;
import pj2.g;

@e(with = c.class)
public final class JsonObject extends g implements Map<String, g>, a
{
    public final Map<String, g> f;
    
    public JsonObject(final LinkedHashMap f) {
        ng2.e.f((Object)f, "content");
        this.f = f;
    }
    
    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ Object compute(final Object o, final BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ Object computeIfAbsent(final Object o, final Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ Object computeIfPresent(final Object o, final BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        if (!(o instanceof String)) {
            return false;
        }
        final String s = (String)o;
        ng2.e.f((Object)s, "key");
        return this.f.containsKey(s);
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        ng2.e.f((Object)g, "value");
        return this.f.containsValue(g);
    }
    
    @Override
    public final Set<Entry<String, g>> entrySet() {
        return this.f.entrySet();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return ng2.e.a((Object)this.f, o);
    }
    
    @Override
    public final Object get(final Object o) {
        if (!(o instanceof String)) {
            return null;
        }
        final String s = (String)o;
        ng2.e.f((Object)s, "key");
        return this.f.get(s);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }
    
    @Override
    public final Set<String> keySet() {
        return this.f.keySet();
    }
    
    @Override
    public final /* bridge */ Object merge(final Object o, final Object o2, final BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ Object put(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void putAll(final Map<? extends String, ? extends g> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ Object putIfAbsent(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final Object remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean remove(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ Object replace(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ boolean replace(final Object o, final Object o2, final Object o3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void replaceAll(final BiFunction<? super String, ? super g, ? extends g> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final int size() {
        return this.f.size();
    }
    
    public final String toString() {
        return CollectionsKt___CollectionsKt.a5((Iterable)this.f.entrySet(), (CharSequence)",", "{", "}", (l)JsonObject$toString$1.INSTANCE, 24);
    }
    
    @Override
    public final Collection<g> values() {
        return this.f.values();
    }
}
