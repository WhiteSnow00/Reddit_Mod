// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class 12E<K, V> extends 01b<K, V>
{
    public HashMap<K, c<K, V>> LIZ;
    
    static {
        Covode.recordClassIndex(192);
    }
    
    public 12E() {
        this.LIZ = new HashMap<K, c<K, V>>();
    }
    
    @Override
    public final c<K, V> LIZ(final K k) {
        return this.LIZ.get(k);
    }
    
    @Override
    public final V LIZ(final K k, final V v) {
        final c<K, Object> liz = this.LIZ(k);
        if (liz != null) {
            return (V)liz.LIZIZ;
        }
        this.LIZ.put(k, this.LIZIZ(k, v));
        return null;
    }
    
    @Override
    public final V LIZIZ(final K k) {
        final V liziz = super.LIZIZ(k);
        this.LIZ.remove(k);
        return liziz;
    }
    
    public final boolean LIZJ(final K k) {
        return this.LIZ.containsKey(k);
    }
}
