// 
// Decompiled by Procyon v0.6.0
// 

package android.view;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import android.content.res.TypedArray;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class b extends View
{
    static {
        Covode.recordClassIndex(185);
    }
    
    public static int LIZ(final Context context) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968661 });
        final int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }
    
    public static ViewGroup$MarginLayoutParams LIZ(final ViewGroup viewGroup, final int n, final int n2) {
        if (viewGroup instanceof RelativeLayout) {
            return (ViewGroup$MarginLayoutParams)new RelativeLayout$LayoutParams(n, n2);
        }
        if (viewGroup instanceof LinearLayout) {
            return (ViewGroup$MarginLayoutParams)new LinearLayout$LayoutParams(n, n2);
        }
        if (viewGroup instanceof FrameLayout) {
            return (ViewGroup$MarginLayoutParams)new FrameLayout$LayoutParams(n, n2);
        }
        if (viewGroup instanceof ConstraintLayout) {
            return new ConstraintLayout.a(n, n2);
        }
        return new ViewGroup$MarginLayoutParams(n, n2);
    }
    
    public static void LIZ(final View view) {
        view.onFinishInflate();
    }
    
    public static void LIZ(final View view, final int minWidth) {
        ((TextView)view).setMinWidth(minWidth);
    }
    
    public static void LIZIZ(final View view, final int minHeight) {
        ((TextView)view).setMinHeight(minHeight);
    }
}
