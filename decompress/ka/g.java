// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import java.util.Map;
import java.util.HashMap;
import di.b;
import fi.e$a;
import fi.e;

public abstract class g
{
    public static final e a;
    
    static {
        final e$a e$a = new e$a();
        ka.a.a.configure((b<?>)e$a);
        a = new e(new HashMap(e$a.a), new HashMap(e$a.b), e$a.c);
    }
    
    public abstract oa.a a();
}
