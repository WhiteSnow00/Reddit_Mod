// 
// Decompiled by Procyon v0.6.0
// 

package pg;

import java.util.Collections;
import java.util.Map;

public final class b
{
    public Integer a;
    public Map<String, Integer> b;
    
    public final c a() {
        final Map<String, Integer> b = this.b;
        if (b == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        final Map<Object, Object> unmodifiableMap = (Map<Object, Object>)Collections.unmodifiableMap((Map<? extends String, ? extends Integer>)b);
        if (unmodifiableMap != null) {
            this.b = (Map<String, Integer>)unmodifiableMap;
            return new c(this.a, (Map)unmodifiableMap);
        }
        throw new NullPointerException("Null splitInstallErrorCodeByModule");
    }
}
