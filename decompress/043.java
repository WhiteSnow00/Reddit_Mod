// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import android.util.TypedValue;
import android.content.Context;
import android.content.res.TypedArray;

public final class 043
{
    public final TypedArray LIZ;
    public final Context LIZIZ;
    public TypedValue LIZJ;
    
    static {
        Covode.recordClassIndex(502);
    }
    
    public 043(final Context liziz, final TypedArray liz) {
        this.LIZIZ = liziz;
        this.LIZ = liz;
    }
    
    public static 043 LIZ(final Context context, final int n, final int[] array) {
        return new 043(context, context.obtainStyledAttributes(n, array));
    }
    
    public static 043 LIZ(final Context context, final AttributeSet set, final int[] array) {
        return new 043(context, context.obtainStyledAttributes(set, array));
    }
    
    public static 043 LIZ(final Context context, final AttributeSet set, final int[] array, final int n, final int n2) {
        return new 043(context, context.obtainStyledAttributes(set, array, n, n2));
    }
    
    public final float LIZ(final int n, final float n2) {
        return this.LIZ.getFloat(n, n2);
    }
    
    public final int LIZ(final int n, final int n2) {
        return this.LIZ.getInt(n, n2);
    }
    
    public final Typeface LIZ(int resourceId, final int n, final 06s.a a) {
        resourceId = this.LIZ.getResourceId(resourceId, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new TypedValue();
        }
        return 06s.LIZ(this.LIZIZ, resourceId, this.LIZJ, n, a);
    }
    
    public final Drawable LIZ(final int n) {
        if (this.LIZ.hasValue(n)) {
            final int resourceId = this.LIZ.getResourceId(n, 0);
            if (resourceId != 0) {
                return 01s.LIZIZ(this.LIZIZ, resourceId);
            }
        }
        return this.LIZ.getDrawable(n);
    }
    
    public final boolean LIZ(final int n, final boolean b) {
        return this.LIZ.getBoolean(n, b);
    }
    
    public final int LIZIZ(final int n, final int n2) {
        return this.LIZ.getInteger(n, n2);
    }
    
    public final Drawable LIZIZ(int resourceId) {
        if (this.LIZ.hasValue(resourceId)) {
            resourceId = this.LIZ.getResourceId(resourceId, 0);
            if (resourceId != 0) {
                return 04M.LIZIZ().LIZIZ(this.LIZIZ, resourceId);
            }
        }
        return null;
    }
    
    public final int LIZJ(final int n, final int n2) {
        return this.LIZ.getDimensionPixelOffset(n, n2);
    }
    
    public final CharSequence LIZJ(final int n) {
        return this.LIZ.getText(n);
    }
    
    public final int LIZLLL(final int n, final int n2) {
        return this.LIZ.getDimensionPixelSize(n, n2);
    }
    
    public final String LIZLLL(final int n) {
        return this.LIZ.getString(n);
    }
    
    public final int LJ(final int n, final int n2) {
        return this.LIZ.getLayoutDimension(n, n2);
    }
    
    public final ColorStateList LJ(final int n) {
        if (this.LIZ.hasValue(n)) {
            final int resourceId = this.LIZ.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList liz = 01s.LIZ(this.LIZIZ, resourceId);
                if (liz != null) {
                    return liz;
                }
            }
        }
        return this.LIZ.getColorStateList(n);
    }
    
    public final int LJFF(final int n, final int n2) {
        return this.LIZ.getResourceId(n, n2);
    }
    
    public final boolean LJFF(final int n) {
        return this.LIZ.hasValue(n);
    }
}
