// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Matrix;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 2Gt extends 2Aw
{
    static {
        Covode.recordClassIndex(1405);
    }
    
    @Override
    public final float LIZ(final View view) {
        return view.getTransitionAlpha();
    }
    
    @Override
    public final void LIZ(final View view, final float transitionAlpha) {
        view.setTransitionAlpha(transitionAlpha);
    }
    
    @Override
    public final void LIZ(final View view, final int transitionVisibility) {
        view.setTransitionVisibility(transitionVisibility);
    }
    
    @Override
    public final void LIZ(final View view, final int n, final int n2, final int n3, final int n4) {
        view.setLeftTopRightBottom(n, n2, n3, n4);
    }
    
    @Override
    public final void LIZ(final View view, final Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
    
    @Override
    public final void LIZIZ(final View view, final Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
