// 
// Decompiled by Procyon v0.6.0
// 

package ge2;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Calendar;
import android.content.res.TypedArray;
import androidx.fragment.app.r;
import android.animation.PropertyValuesHolder;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.view.View;
import android.graphics.Color;

public final class d
{
    public static int a(final int n) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        array[2] *= 0.8f;
        return Color.HSVToColor(array);
    }
    
    public static ObjectAnimator b(final View view, final float n, final float n2) {
        final Keyframe ofFloat = Keyframe.ofFloat(0.0f, 1.0f);
        final Keyframe ofFloat2 = Keyframe.ofFloat(0.275f, n);
        final Keyframe ofFloat3 = Keyframe.ofFloat(0.69f, n2);
        final Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[] { ofFloat, ofFloat2, ofFloat3, ofFloat4 }), PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[] { ofFloat, ofFloat2, ofFloat3, ofFloat4 }) });
        ofPropertyValuesHolder.setDuration(544L);
        return ofPropertyValuesHolder;
    }
    
    public static boolean c(final r r, final boolean b) {
        final TypedArray obtainStyledAttributes = ((Context)r).getTheme().obtainStyledAttributes(new int[] { 2130969407 });
        try {
            return obtainStyledAttributes.getBoolean(0, b);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public static void d(final Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }
    
    public static void e(final ViewGroup viewGroup, final String s) {
        if (viewGroup != null && s != null) {
            ((View)viewGroup).announceForAccessibility((CharSequence)s);
        }
    }
}
