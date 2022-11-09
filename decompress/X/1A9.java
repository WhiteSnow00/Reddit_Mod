// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1A9 implements 0IF
{
    static {
        Covode.recordClassIndex(2036);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(7272);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        final C9P c9P = new C9P(context);
        ((View)c9P).setId(2131369269);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 1;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 1;
        }
        ((LinearLayout)c9P).setGravity(16);
        b.LIZ((View)c9P);
        if (((View)c9P).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)c9P, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(7272);
        return (View)linearLayout;
    }
}
