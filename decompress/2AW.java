// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import android.view.View;
import com.bytedance.covode.number.Covode;

public class 2Aw extends 1nP
{
    public static boolean LIZ;
    
    static {
        Covode.recordClassIndex(1404);
        2Aw.LIZ = true;
    }
    
    @Override
    public void LIZ(final View view, final int transitionVisibility) {
        if (Build$VERSION.SDK_INT == 28) {
            super.LIZ(view, transitionVisibility);
            return;
        }
        if (2Aw.LIZ) {
            try {
                view.setTransitionVisibility(transitionVisibility);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                2Aw.LIZ = false;
            }
        }
    }
}
