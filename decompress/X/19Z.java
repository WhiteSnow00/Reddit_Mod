// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.util.TypedValue;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19z implements 0IF
{
    static {
        Covode.recordClassIndex(2026);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(5111);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131369834);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz)) {
            ((LinearLayout$LayoutParams)liz).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz)) {
            ((FrameLayout$LayoutParams)liz).gravity = 17;
        }
        if (092.d.class.isInstance(liz)) {
            ((092.d)liz).LIZ = 17;
        }
        final I88 i88 = new I88(context);
        ((View)i88).setId(2131364489);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            frameLayout$LayoutParams.gravity = 17;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams)) {
            ((092.d)frameLayout$LayoutParams).LIZ = 17;
        }
        b.LIZ((View)i88);
        if (((View)i88).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)i88, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(5111);
        return (View)frameLayout;
    }
}
