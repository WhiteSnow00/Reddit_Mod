// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18x implements 0IF
{
    static {
        Covode.recordClassIndex(1962);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(6908);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz)) {
            ((LinearLayout$LayoutParams)liz).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz)) {
            ((FrameLayout$LayoutParams)liz).gravity = 80;
        }
        if (092.d.class.isInstance(liz)) {
            ((092.d)liz).LIZ = 80;
        }
        final 4B0 4b0 = new 4B0(context);
        ((View)4b0).setId(2131362516);
        ((View)4b0).setAlpha(0.0f);
        4b0.setForegroundColor(resources.getColor(2131099736));
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            frameLayout$LayoutParams.gravity = 80;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams)) {
            ((092.d)frameLayout$LayoutParams).LIZ = 80;
        }
        b.LIZ((View)4b0);
        if (((View)4b0).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)4b0, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final CK0 ck0 = new CK0(context);
        ((View)ck0).setId(2131367613);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)ck0);
        if (((View)ck0).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)ck0, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        final 4B8 4b2 = new 4B8(context);
        ((View)4b2).setId(2131374078);
        4b2.setReachedBarColor(resources.getColor(2131099686));
        4b2.setReachedProgressBarHeight(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)4b2);
        if (((View)4b2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)4b2, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(6908);
        return (View)frameLayout;
    }
}
