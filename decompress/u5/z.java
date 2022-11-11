// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import a4.e1;
import a4.b1;
import android.graphics.Matrix;
import android.view.View;

public class z extends y
{
    public static boolean m = true;
    public static boolean n = true;
    
    public void A(final View view, final Matrix matrix) {
        if (z.m) {
            try {
                b1.g(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                z.m = false;
            }
        }
    }
    
    public void B(final View view, final Matrix matrix) {
        if (z.n) {
            try {
                e1.f(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                z.n = false;
            }
        }
    }
}
