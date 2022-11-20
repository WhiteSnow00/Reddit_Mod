// 
// Decompiled by Procyon v0.6.0
// 

package rf;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.y0;
import n3.a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.Context;

public final class c
{
    public static ColorStateList a(final Context context, final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList colorStateList = a.getColorStateList(context, resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
        }
        return typedArray.getColorStateList(n);
    }
    
    public static ColorStateList b(final Context context, final y0 y0, final int n) {
        if (y0.l(n)) {
            final int i = y0.i(n, 0);
            if (i != 0) {
                final ColorStateList colorStateList = a.getColorStateList(context, i);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
        }
        return y0.b(n);
    }
    
    public static Drawable c(final Context context, final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final Drawable u1 = vl.a.U1(context, resourceId);
                if (u1 != null) {
                    return u1;
                }
            }
        }
        return typedArray.getDrawable(n);
    }
}
