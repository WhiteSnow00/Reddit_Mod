// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class p5
{
    public static volatile p5 b;
    public static volatile p5 c;
    public static final p5 d;
    public final Map a;
    
    static {
        d = new p5(0);
    }
    
    public p5() {
        this.a = new HashMap();
    }
    
    public p5(final int n) {
        this.a = Collections.emptyMap();
    }
    
    public static p5 a() {
        final p5 b;
        if ((b = p5.b) == null) {
            synchronized (p5.class) {
                if (p5.b == null) {
                    p5.b = p5.d;
                }
            }
        }
        return b;
    }
    
    public final b6 b(final z6 z6, final int n) {
        return this.a.get(new o5(z6, n));
    }
}
