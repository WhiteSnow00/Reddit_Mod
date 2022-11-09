// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19g implements 0IF
{
    static {
        Covode.recordClassIndex(2007);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(5903);
        final Resources resources = context.getResources();
        final TuxAlertBadgeLayout tuxAlertBadgeLayout = new TuxAlertBadgeLayout(context);
        ((View)tuxAlertBadgeLayout).setId(2131364898);
        ((View)tuxAlertBadgeLayout).setPadding(((View)tuxAlertBadgeLayout).getPaddingLeft(), ((View)tuxAlertBadgeLayout).getPaddingTop(), ((View)tuxAlertBadgeLayout).getPaddingRight(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(liz)) {
            ((RelativeLayout$LayoutParams)liz).addRule(21, -1);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131373321);
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)tuxAlertBadgeLayout, (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz2)) {
            ((LinearLayout$LayoutParams)liz2).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz2)) {
            ((FrameLayout$LayoutParams)liz2).gravity = 17;
        }
        if (092.d.class.isInstance(liz2)) {
            ((092.d)liz2).LIZ = 17;
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755641", "raw"), 4fg, (ViewGroup$LayoutParams)liz2);
        i.LIZ("app:tux_iconShadow", (a)new a.c("true"), 4fg, (ViewGroup$LayoutParams)liz2);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)liz2);
        CTM.LIZ((Object)4fg, (Object)liz2);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)tuxAlertBadgeLayout).addView((View)4fg, (ViewGroup$LayoutParams)liz2);
        }
        b.LIZ((View)tuxAlertBadgeLayout);
        ((View)tuxAlertBadgeLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)tuxAlertBadgeLayout);
        }
        MethodCollector.o(5903);
        return (View)tuxAlertBadgeLayout;
    }
}
