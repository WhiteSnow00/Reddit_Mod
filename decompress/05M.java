// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import android.graphics.RectF;
import android.graphics.Matrix;

public final class 05m
{
    public static final ThreadLocal<Matrix> LIZ;
    public static final ThreadLocal<RectF> LIZIZ;
    
    static {
        Covode.recordClassIndex(656);
        LIZ = new ThreadLocal<Matrix>();
        LIZIZ = new ThreadLocal<RectF>();
    }
    
    public static void LIZ(final ViewParent viewParent, final View view, final Matrix matrix) {
        final ViewParent parent = view.getParent();
        if (parent instanceof View && parent != viewParent) {
            final View view2 = (View)parent;
            LIZ(viewParent, view2, matrix);
            matrix.preTranslate((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
        }
        matrix.preTranslate((float)view.getLeft(), (float)view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
