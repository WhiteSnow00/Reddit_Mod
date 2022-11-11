// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1A2 implements 0IF
{
    static {
        Covode.recordClassIndex(2029);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(3466);
        context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        final 4yr 4yr = new 4yr(context);
        ((View)4yr).setId(2131365156);
        ((View)4yr).setClickable(true);
        ((View)4yr).setFocusable(true);
        ((View)4yr).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        b.LIZ((View)4yr);
        if (((View)4yr).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4yr, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(3466);
        return (View)linearLayout;
    }
}
