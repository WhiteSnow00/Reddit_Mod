// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.util.TypedValue;

public final class 041
{
    public static final int[] LIZ;
    public static final int[] LIZIZ;
    public static final int[] LIZJ;
    public static final int[] LIZLLL;
    public static final int[] LJ;
    public static final ThreadLocal<TypedValue> LJFF;
    public static final int[] LJI;
    
    static {
        Covode.recordClassIndex(498);
        LJFF = new ThreadLocal<TypedValue>();
        LIZ = new int[] { -16842910 };
        LIZIZ = new int[] { 16842908 };
        LIZJ = new int[] { 16842919 };
        LIZLLL = new int[] { 16842912 };
        LJ = new int[0];
        LJI = new int[1];
    }
    
    public static int LIZ(Context liz, int color) {
        final int[] lji = 041.LJI;
        lji[0] = color;
        liz = (Context)043.LIZ(liz, null, lji);
        try {
            color = ((043)liz).LIZ.getColor(0, 0);
            return color;
        }
        finally {
            ((043)liz).LIZ.recycle();
        }
    }
    
    public static int LIZ(final Context context, int liz, final float n) {
        liz = LIZ(context, liz);
        return 08O.LIZIZ(liz, Math.round(Color.alpha(liz) * n));
    }
    
    public static TypedValue LIZ() {
        final ThreadLocal<TypedValue> ljff = 041.LJFF;
        TypedValue typedValue;
        if ((typedValue = ljff.get()) == null) {
            typedValue = new TypedValue();
            ljff.set(typedValue);
        }
        return typedValue;
    }
    
    public static ColorStateList LIZIZ(Context liz, final int n) {
        final int[] lji = 041.LJI;
        lji[0] = n;
        liz = (Context)043.LIZ(liz, null, lji);
        try {
            return ((043)liz).LJ(0);
        }
        finally {
            ((043)liz).LIZ.recycle();
        }
    }
    
    public static int LIZJ(final Context context, final int n) {
        final ColorStateList liziz = LIZIZ(context, n);
        if (liziz != null && liziz.isStateful()) {
            return liziz.getColorForState(041.LIZ, liziz.getDefaultColor());
        }
        final TypedValue liz = LIZ();
        context.getTheme().resolveAttribute(16842803, liz, true);
        return LIZ(context, n, liz.getFloat());
    }
}
