// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import x6.h;
import java.util.ArrayList;

public abstract class v
{
    public final ArrayList a;
    
    public v() {
        this.a = new ArrayList();
    }
    
    public abstract o a(final String p0, final h p1, final ArrayList p2);
    
    public final void b(final String s) {
        if (this.a.contains(f4.e(s))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(s)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
