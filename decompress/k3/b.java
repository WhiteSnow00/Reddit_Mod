// 
// Decompiled by Procyon v0.6.0
// 

package k3;

import android.view.View;
import android.view.ViewParent;
import android.graphics.RectF;
import android.graphics.Matrix;

public final class b
{
    public static final ThreadLocal<Matrix> a;
    public static final ThreadLocal<RectF> b;
    
    static {
        a = new ThreadLocal<Matrix>();
        b = new ThreadLocal<RectF>();
    }
    
    public static void a(final ViewParent viewParent, final View view, final Matrix matrix) {
        final ViewParent parent = view.getParent();
        if (parent instanceof View && parent != viewParent) {
            final View view2 = (View)parent;
            a(viewParent, view2, matrix);
            matrix.preTranslate((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
        }
        matrix.preTranslate((float)view.getLeft(), (float)view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
