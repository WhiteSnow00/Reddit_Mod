// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.app.Activity;

public final class g
{
    public final Activity a;
    
    public g(final Activity a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Activity must not be null");
    }
}
