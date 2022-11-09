// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.Build$VERSION;

public final class k0
{
    public static final int a;
    
    static {
        int a2;
        if (Build$VERSION.SDK_INT >= 31) {
            a2 = 33554432;
        }
        else {
            a2 = 0;
        }
        a = a2;
    }
}
