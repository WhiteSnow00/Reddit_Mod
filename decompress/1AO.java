// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1Ao implements 0IF
{
    static {
        Covode.recordClassIndex(2077);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(7804);
        context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final View liz2 = 0I8.LIZ(context, 2131559149, (ViewGroup)frameLayout, false, 2131559159);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        if (liz2.getParent() == null) {
            ((ViewGroup)frameLayout).addView(liz2, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final View liz3 = 0I8.LIZ(context, 2131559150, (ViewGroup)frameLayout, false, 2131559159);
        liz3.setId(2131369169);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams2).gravity = 48;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            frameLayout$LayoutParams2.gravity = 48;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams2)) {
            ((092.d)frameLayout$LayoutParams2).LIZ = 48;
        }
        if (liz3.getParent() == null) {
            ((ViewGroup)frameLayout).addView(liz3, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        final View view = new View(context);
        view.setId(2131364074);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968672 });
        view.setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        view.setAlpha(0.03f);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ(view);
        if (view.getParent() == null) {
            ((ViewGroup)frameLayout).addView(view, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(7804);
        return (View)frameLayout;
    }
}
