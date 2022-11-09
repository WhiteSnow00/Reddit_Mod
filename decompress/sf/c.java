// 
// Decompiled by Procyon v0.6.0
// 

package sf;

import eg.n0;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.z0;
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
    
    public static ColorStateList b(final Context context, final z0 z0, final int n) {
        if (z0.l(n)) {
            final int i = z0.i(n, 0);
            if (i != 0) {
                final ColorStateList colorStateList = a.getColorStateList(context, i);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
        }
        return z0.b(n);
    }
    
    public static Drawable c(final Context context, final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final Drawable l = n0.L(context, resourceId);
                if (l != null) {
                    return l;
                }
            }
        }
        return typedArray.getDrawable(n);
    }
}
