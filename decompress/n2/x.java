// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import a4.n0;
import ng2.e;
import android.graphics.Typeface;

public final class x
{
    public static final x a;
    
    static {
        a = new x();
    }
    
    public final Typeface a(Typeface b, final int n, final boolean b2) {
        e.f((Object)b, "typeface");
        b = n0.b(b, n, b2);
        e.e((Object)b, "create(typeface, finalFontWeight, finalFontStyle)");
        return b;
    }
}
