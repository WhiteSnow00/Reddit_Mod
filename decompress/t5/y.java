// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import a4.t0;
import android.os.Build$VERSION;
import android.view.ViewGroup;

public final class y
{
    public static boolean a = true;
    
    public static void a(final ViewGroup viewGroup, final boolean b) {
        if (Build$VERSION.SDK_INT >= 29) {
            t0.j(viewGroup, b);
        }
        else if (y.a) {
            try {
                t0.j(viewGroup, b);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                y.a = false;
            }
        }
    }
}
