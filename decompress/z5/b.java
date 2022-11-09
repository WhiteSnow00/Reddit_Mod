// 
// Decompiled by Procyon v0.6.0
// 

package z5;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup$MarginLayoutParams;

public final class b
{
    public static final ViewGroup$MarginLayoutParams b;
    public LinearLayoutManager a;
    
    static {
        (b = new ViewGroup$MarginLayoutParams(-1, -1)).setMargins(0, 0, 0, 0);
    }
    
    public b(final LinearLayoutManager a) {
        this.a = a;
    }
    
    public static boolean a(final View view) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                if (a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
