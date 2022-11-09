// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.f;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19p implements 0IF
{
    static {
        Covode.recordClassIndex(2016);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(9159);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131367442);
        ((View)frameLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.setMarginStart((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        final Cfg cfg = new Cfg(context);
        ((View)cfg).setId(2131363336);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            frameLayout$LayoutParams.gravity = 17;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams)) {
            ((092.d)frameLayout$LayoutParams).LIZ = 17;
        }
        final f f = new f();
        f.LIZ("app:tux_checkBoxShape", (a)new a.c("circle"), cfg, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        f.LIZ("app:tux_checkBoxSize", (a)new a.c("small"), cfg, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        CTM.LIZ((Object)cfg, (Object)frameLayout$LayoutParams);
        b.LIZ((View)cfg);
        if (((View)cfg).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)cfg, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(9159);
        return (View)frameLayout;
    }
}
