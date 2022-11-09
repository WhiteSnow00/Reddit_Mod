// 
// Decompiled by Procyon v0.6.0
// 

package pg;

import java.util.Map;
import java.util.HashMap;

public abstract class k
{
    public static final c a;
    
    static {
        final b b = new b();
        b.b = new HashMap<String, Integer>();
        a = b.a();
    }
    
    public abstract Integer a();
    
    public abstract Map<String, Integer> b();
}
