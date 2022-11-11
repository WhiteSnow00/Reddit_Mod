// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import java.util.Set;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 1gm<K, V> implements Map<K, V>, 5kU
{
    public final /* synthetic */ Map LIZ;
    
    static {
        Covode.recordClassIndex(1823);
    }
    
    public 1gm(final boolean b) {
        Serializable s;
        if (b) {
            s = new ConcurrentHashMap<Object, Object>();
        }
        else {
            s = new LinkedHashMap<Object, Object>(0, 0.75f, true);
        }
        this.LIZ = (Map)s;
    }
    
    @Override
    public final void clear() {
        this.LIZ.clear();
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.LIZ.containsKey(o);
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.LIZ.containsValue(o);
    }
    
    @Override
    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return this.LIZ.entrySet();
    }
    
    @Override
    public final V get(final Object o) {
        return this.LIZ.get(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.LIZ.isEmpty();
    }
    
    @Override
    public final /* bridge */ Set<K> keySet() {
        return this.LIZ.keySet();
    }
    
    @Override
    public final V put(final K k, final V v) {
        return this.LIZ.put(k, v);
    }
    
    @Override
    public final void putAll(final Map<? extends K, ? extends V> map) {
        CTM.LIZ((Object)map);
        this.LIZ.putAll(map);
    }
    
    @Override
    public final V remove(final Object o) {
        return this.LIZ.remove(o);
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.LIZ.size();
    }
    
    @Override
    public final /* bridge */ Collection<V> values() {
        return this.LIZ.values();
    }
}
