// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.json;

import java.util.Collection;
import rg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Set;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.LinkedHashMap;
import tj2.m;
import pj2.e;
import tg2.a;
import java.util.Map;
import tj2.g;

@e(with = m.class)
public final class JsonObject extends g implements Map<String, g>, a
{
    public final Map<String, g> f;
    
    public JsonObject(final LinkedHashMap f) {
        sg2.e.f((Object)f, "content");
        this.f = f;
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean containsKey(final Object o) {
        if (!(o instanceof String)) {
            return false;
        }
        final String s = (String)o;
        sg2.e.f((Object)s, "key");
        return this.f.containsKey(s);
    }
    
    public final boolean containsValue(final Object o) {
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        sg2.e.f((Object)g, "value");
        return this.f.containsValue(g);
    }
    
    public final Set<Entry<String, g>> entrySet() {
        return this.f.entrySet();
    }
    
    public final boolean equals(final Object o) {
        return sg2.e.a((Object)this.f, o);
    }
    
    public final Object get(final Object o) {
        if (!(o instanceof String)) {
            return null;
        }
        final String s = (String)o;
        sg2.e.f((Object)s, "key");
        return this.f.get(s);
    }
    
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }
    
    public final Set<String> keySet() {
        return this.f.keySet();
    }
    
    public final void putAll(final Map<? extends String, ? extends g> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final Object remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean remove(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void replaceAll(final BiFunction<? super String, ? super g, ? extends g> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final int size() {
        return this.f.size();
    }
    
    public final String toString() {
        return CollectionsKt___CollectionsKt.I3((Iterable)this.f.entrySet(), (CharSequence)",", "{", "}", (l)JsonObject$toString$1.INSTANCE, 24);
    }
    
    public final Collection<g> values() {
        return this.f.values();
    }
}
