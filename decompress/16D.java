// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;

public class 16d extends 0DJ
{
    public static boolean LIZ;
    
    static {
        Covode.recordClassIndex(1476);
        16d.LIZ = true;
    }
    
    @Override
    public float LIZ(final View view) {
        if (16d.LIZ) {
            try {
                return view.getTransitionAlpha();
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                16d.LIZ = false;
            }
        }
        return view.getAlpha();
    }
    
    @Override
    public void LIZ(final View view, final float n) {
        if (16d.LIZ) {
            try {
                view.setTransitionAlpha(n);
                return;
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                16d.LIZ = false;
            }
        }
        view.setAlpha(n);
    }
    
    @Override
    public final void LIZIZ(final View view) {
    }
    
    @Override
    public final void LIZJ(final View view) {
    }
}
