// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

public final class 0bX<K, V> extends LinkedHashMap<K, V>
{
    public final int LIZ;
    
    static {
        Covode.recordClassIndex(5648);
    }
    
    public 0bX(final int liz) {
        super(liz, 0.75f, true);
        this.LIZ = liz;
    }
    
    public final boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() > this.LIZ;
    }
}
