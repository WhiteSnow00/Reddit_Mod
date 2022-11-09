// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import a4.c2;
import android.graphics.Matrix;
import android.view.View;

public class z extends y
{
    public static boolean A0 = true;
    public static boolean z0 = true;
    
    public void S2(final View view, final Matrix matrix) {
        if (z.z0) {
            try {
                androidx.appcompat.widget.z.i(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                z.z0 = false;
            }
        }
    }
    
    public void T2(final View view, final Matrix matrix) {
        if (z.A0) {
            try {
                c2.j(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                z.A0 = false;
            }
        }
    }
}
