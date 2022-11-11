// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.TypedValue;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18d implements 0IF
{
    static {
        Covode.recordClassIndex(1942);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(11228);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131370382);
        ((View)frameLayout).setVisibility(4);
        ((View)frameLayout).setBackgroundResource(2131231711);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final 4fg 4fg = new 4fg(context);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            frameLayout$LayoutParams.gravity = 17;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams)) {
            ((092.d)frameLayout$LayoutParams).LIZ = 17;
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755461", "raw"), 4fg, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        i.LIZ("app:tux_tintColor", (a)new a.b("2131099688", "color"), 4fg, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        CTM.LIZ((Object)4fg, (Object)frameLayout$LayoutParams);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)4fg, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(11228);
        return (View)frameLayout;
    }
}
