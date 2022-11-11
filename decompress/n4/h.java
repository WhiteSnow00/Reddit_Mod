// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import android.graphics.Rect;
import m4.a;
import android.view.View;
import android.text.method.TransformationMethod;

public final class h implements TransformationMethod
{
    public final TransformationMethod f;
    
    public h(final TransformationMethod f) {
        this.f = f;
    }
    
    public final CharSequence getTransformation(CharSequence f, final View view) {
        if (view.isInEditMode()) {
            return f;
        }
        final TransformationMethod f2 = this.f;
        CharSequence transformation = f;
        if (f2 != null) {
            transformation = f2.getTransformation(f, view);
        }
        if ((f = transformation) != null) {
            if (a.a().b() != 1) {
                f = transformation;
            }
            else {
                final a a = m4.a.a();
                a.getClass();
                f = a.f(0, transformation.length(), transformation, Integer.MAX_VALUE, 0);
            }
        }
        return f;
    }
    
    public final void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
        final TransformationMethod f = this.f;
        if (f != null) {
            f.onFocusChanged(view, charSequence, b, n, rect);
        }
    }
}
