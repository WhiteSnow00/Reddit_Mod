// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import a4.x0;
import ah2.f;
import android.graphics.Typeface;

public final class v
{
    public static final v a;
    
    static {
        a = new v();
    }
    
    public final Typeface a(Typeface a, final int n, final boolean b) {
        f.f((Object)a, "typeface");
        a = x0.a(a, n, b);
        f.e((Object)a, "create(typeface, finalFontWeight, finalFontStyle)");
        return a;
    }
}
