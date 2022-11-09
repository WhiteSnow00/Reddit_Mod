// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.text.method.TransformationMethod;

public final class 09m implements TransformationMethod
{
    public final TransformationMethod LIZ;
    
    static {
        Covode.recordClassIndex(1019);
    }
    
    public 09m(final TransformationMethod liz) {
        this.LIZ = liz;
    }
    
    public final CharSequence getTransformation(CharSequence liz, final View view) {
        if (view.isInEditMode()) {
            return liz;
        }
        final TransformationMethod liz2 = this.LIZ;
        CharSequence transformation = liz;
        if (liz2 != null) {
            transformation = liz2.getTransformation(liz, view);
        }
        if ((liz = transformation) != null) {
            if (09K.LIZ().LIZJ() != 1) {
                liz = transformation;
            }
            else {
                liz = 09K.LIZ().LIZ(transformation);
            }
        }
        return liz;
    }
    
    public final void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
        final TransformationMethod liz = this.LIZ;
        if (liz != null) {
            liz.onFocusChanged(view, charSequence, b, n, rect);
        }
    }
}
