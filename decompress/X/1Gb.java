// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Matrix;
import android.view.View;
import com.bytedance.covode.number.Covode;

public class 1gb extends 16d
{
    public static boolean LIZ;
    public static boolean LIZIZ;
    
    static {
        Covode.recordClassIndex(1477);
        1gb.LIZ = true;
        1gb.LIZIZ = true;
    }
    
    @Override
    public void LIZ(final View view, final Matrix matrix) {
        if (1gb.LIZ) {
            try {
                view.transformMatrixToGlobal(matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                1gb.LIZ = false;
            }
        }
    }
    
    @Override
    public void LIZIZ(final View view, final Matrix matrix) {
        if (1gb.LIZIZ) {
            try {
                view.transformMatrixToLocal(matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                1gb.LIZIZ = false;
            }
        }
    }
}
