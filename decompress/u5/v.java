// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import androidx.appcompat.widget.z;
import android.os.Build$VERSION;
import android.view.ViewGroup;

public final class v
{
    public static boolean a = true;
    
    public static void a(final ViewGroup viewGroup, final boolean b) {
        if (Build$VERSION.SDK_INT >= 29) {
            z.k(viewGroup, b);
        }
        else if (v.a) {
            try {
                z.k(viewGroup, b);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                v.a = false;
            }
        }
    }
}
