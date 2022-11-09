// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 0I1
{
    public static final 0I1 LIZ;
    
    static {
        Covode.recordClassIndex(1897);
        LIZ = new 0I1();
    }
    
    public final <T> boolean LIZ(final List<? extends T> list) {
        return list == null || list.isEmpty();
    }
    
    public final boolean LIZ(final Map<?, ?> map) {
        return map == null || map.isEmpty();
    }
}
