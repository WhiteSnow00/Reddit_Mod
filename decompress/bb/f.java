// 
// Decompiled by Procyon v0.6.0
// 

package bb;

import bd.c0;
import java.util.UUID;
import ab.b;

public final class f implements b
{
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;
    
    static {
        boolean d3 = false;
        Label_0040: {
            if ("Amazon".equals(c0.c)) {
                final String d2 = c0.d;
                if ("AFTM".equals(d2) || "AFTB".equals(d2)) {
                    d3 = true;
                    break Label_0040;
                }
            }
            d3 = false;
        }
        d = d3;
    }
    
    public f(final UUID a, final byte[] b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
