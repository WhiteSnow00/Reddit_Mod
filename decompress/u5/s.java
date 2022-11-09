// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import android.os.Build$VERSION;

public final class s
{
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean c2 = true;
        a = true;
        b = true;
        if (sdk_INT < 28) {
            c2 = false;
        }
        c = c2;
    }
}
