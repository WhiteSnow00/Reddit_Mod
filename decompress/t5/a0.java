// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import a4.u0;
import a4.v0;
import android.view.View;
import cg.d;

public class a0 extends d
{
    public static boolean t = true;
    
    public float u4(final View view) {
        if (a0.t) {
            try {
                return v0.a(view);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                a0.t = false;
            }
        }
        return view.getAlpha();
    }
    
    public void v4(final View view, final float alpha) {
        if (a0.t) {
            try {
                u0.j(view, alpha);
                return;
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                a0.t = false;
            }
        }
        view.setAlpha(alpha);
    }
}
