// 
// Decompiled by Procyon v0.6.0
// 

package sf;

import android.util.Log;
import android.os.Build$VERSION;
import q3.e;
import android.graphics.Color;
import android.content.res.ColorStateList;

public final class a
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final String e;
    
    static {
        a = new int[] { 16842919 };
        b = new int[] { 16842913, 16842919 };
        c = new int[] { 16842913 };
        d = new int[] { 16842910, 16842919 };
        e = a.class.getSimpleName();
    }
    
    public static int a(final ColorStateList list, final int[] array) {
        int colorForState;
        if (list != null) {
            colorForState = list.getColorForState(array, list.getDefaultColor());
        }
        else {
            colorForState = 0;
        }
        return q3.e.h(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
    
    public static ColorStateList b(final ColorStateList list) {
        if (list != null) {
            if (Build$VERSION.SDK_INT <= 27 && Color.alpha(list.getDefaultColor()) == 0 && Color.alpha(list.getColorForState(sf.a.d, 0)) != 0) {
                Log.w(sf.a.e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return list;
        }
        return ColorStateList.valueOf(0);
    }
    
    public static boolean c(final int[] array) {
        final int length = array.length;
        final boolean b = false;
        int i = 0;
        int n2;
        int n = n2 = 0;
        while (i < length) {
            final int n3 = array[i];
            int n4 = 0;
            Label_0076: {
                if (n3 == 16842910) {
                    n4 = 1;
                }
                else {
                    if (n3 != 16842908) {
                        if (n3 != 16842919) {
                            n4 = n;
                            if (n3 != 16843623) {
                                break Label_0076;
                            }
                        }
                    }
                    n2 = 1;
                    n4 = n;
                }
            }
            ++i;
            n = n4;
        }
        boolean b2 = b;
        if (n != 0) {
            b2 = b;
            if (n2 != 0) {
                b2 = true;
            }
        }
        return b2;
    }
}
