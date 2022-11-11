// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import a4.u0;
import sg2.e;
import android.graphics.Typeface;

public final class v
{
    public static final v a;
    
    static {
        a = new v();
    }
    
    public final Typeface a(Typeface c, final int n, final boolean b) {
        e.f((Object)c, "typeface");
        c = u0.c(c, n, b);
        e.e((Object)c, "create(typeface, finalFontWeight, finalFontStyle)");
        return c;
    }
}
