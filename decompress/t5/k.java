// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import java.util.WeakHashMap;
import android.graphics.Rect;
import android.view.View;
import a4.l0$e;
import a4.l0;
import android.view.ViewGroup;
import android.support.v4.media.b;

public final class k extends b
{
    public static final String[] h;
    public int g;
    
    static {
        h = new String[] { "android:visibilityPropagation:visibility", "android:visibilityPropagation:center" };
    }
    
    public k() {
        this.g = 80;
    }
    
    public final /* bridge */ void F1() {
    }
    
    public final long I1(final ViewGroup viewGroup, final m m, final t t, final t t2) {
        t t3 = t;
        if (t3 == null && t2 == null) {
            return 0L;
        }
        final m.c z = m.z;
        Rect a;
        if (z == null) {
            a = null;
        }
        else {
            a = z.a();
        }
        final int n = 1;
        final int n2 = 1;
        int n3 = -1;
        int n5 = 0;
        Label_0111: {
            if (t2 != null) {
                int intValue = 8;
                if (t3 != null) {
                    final Integer n4 = t3.a.get("android:visibilityPropagation:visibility");
                    if (n4 != null) {
                        intValue = n4;
                    }
                }
                if (intValue != 0) {
                    n5 = 1;
                    t3 = t2;
                    break Label_0111;
                }
            }
            n5 = -1;
        }
        int n6 = 0;
        Label_0151: {
            if (t3 != null) {
                final int[] array = t3.a.get("android:visibilityPropagation:center");
                if (array != null) {
                    n6 = array[0];
                    break Label_0151;
                }
            }
            n6 = -1;
        }
        if (t3 != null) {
            final int[] array2 = t3.a.get("android:visibilityPropagation:center");
            if (array2 != null) {
                n3 = array2[1];
            }
        }
        final int[] array3 = new int[2];
        ((View)viewGroup).getLocationOnScreen(array3);
        final int n7 = Math.round(((View)viewGroup).getTranslationX()) + array3[0];
        final int n8 = Math.round(((View)viewGroup).getTranslationY()) + array3[1];
        final int n9 = ((View)viewGroup).getWidth() + n7;
        final int n10 = ((View)viewGroup).getHeight() + n8;
        int centerX;
        int centerY;
        if (a != null) {
            centerX = a.centerX();
            centerY = a.centerY();
        }
        else {
            centerX = (n7 + n9) / 2;
            centerY = (n8 + n10) / 2;
        }
        final int g = this.g;
        int n12 = 0;
        Label_0380: {
            Label_0377: {
                if (g == 8388611) {
                    final WeakHashMap a2 = l0.a;
                    int n11;
                    if (l0$e.d((View)viewGroup) == 1) {
                        n11 = n2;
                    }
                    else {
                        n11 = 0;
                    }
                    if (n11 != 0) {
                        break Label_0377;
                    }
                }
                else {
                    if ((n12 = g) != 8388613) {
                        break Label_0380;
                    }
                    final WeakHashMap a3 = l0.a;
                    int n13;
                    if (l0$e.d((View)viewGroup) == 1) {
                        n13 = n;
                    }
                    else {
                        n13 = 0;
                    }
                    if (n13 == 0) {
                        break Label_0377;
                    }
                }
                n12 = 3;
                break Label_0380;
            }
            n12 = 5;
        }
        int n14;
        if (n12 != 3) {
            if (n12 != 5) {
                if (n12 != 48) {
                    if (n12 != 80) {
                        n14 = 0;
                    }
                    else {
                        n14 = Math.abs(centerX - n6) + (n3 - n8);
                    }
                }
                else {
                    n14 = Math.abs(centerX - n6) + (n10 - n3);
                }
            }
            else {
                n14 = Math.abs(centerY - n3) + (n6 - n7);
            }
        }
        else {
            n14 = Math.abs(centerY - n3) + (n9 - n6);
        }
        final float n15 = (float)n14;
        final int g2 = this.g;
        int n16;
        if (g2 != 3 && g2 != 5 && g2 != 8388611 && g2 != 8388613) {
            n16 = ((View)viewGroup).getHeight();
        }
        else {
            n16 = ((View)viewGroup).getWidth();
        }
        final float n17 = n15 / n16;
        long h;
        if ((h = m.h) < 0L) {
            h = 300L;
        }
        return Math.round(h * n5 / 3.0f * n17);
    }
    
    public final void h1(final t t) {
        final View b = t.b;
        Integer value;
        if ((value = t.a.get("android:visibility:visibility")) == null) {
            value = b.getVisibility();
        }
        t.a.put("android:visibilityPropagation:visibility", value);
        final int[] array = new int[2];
        b.getLocationOnScreen(array);
        final int n = Math.round(b.getTranslationX()) + array[0];
        array[0] = n;
        array[0] = b.getWidth() / 2 + n;
        final int n2 = Math.round(b.getTranslationY()) + array[1];
        array[1] = n2;
        array[1] = b.getHeight() / 2 + n2;
        t.a.put("android:visibilityPropagation:center", array);
    }
}
