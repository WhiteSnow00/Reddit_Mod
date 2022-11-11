// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.i;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.util.TypedValue;
import android.view.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1An implements 0IF
{
    static {
        Covode.recordClassIndex(2076);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(13140);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ((View)constraintLayout).setBackgroundColor(resources.getColor(2131099677));
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final View view = new View(context);
        final ConstraintLayout.a a = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(a)) {
            ((RelativeLayout$LayoutParams)a).addRule(13, -1);
        }
        a.dimensionRatio = "h,375:210";
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.topToTop = 0;
        }
        b.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, (ViewGroup$LayoutParams)a);
        }
        final Vhq vhq = new Vhq(context);
        ((View)vhq).setId(2131372847);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(a2)) {
            ((RelativeLayout$LayoutParams)a2).addRule(13, -1);
        }
        a2.dimensionRatio = "h,375:210";
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToTop = 0;
        }
        b.LIZ((View)vhq);
        if (((View)vhq).getParent() == null) {
            constraintLayout.addView((View)vhq, (ViewGroup$LayoutParams)a2);
        }
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131374206);
        ((View)frameLayout).setBackgroundResource(2131231564);
        ((View)frameLayout).setVisibility(8);
        final ConstraintLayout.a a3 = new ConstraintLayout.a(-1, (int)TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(a3)) {
            ((LinearLayout$LayoutParams)a3).gravity = 81;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a3)) {
            ((FrameLayout$LayoutParams)a3).gravity = 81;
        }
        if (092.d.class.isInstance(a3)) {
            ((092.d)a3).LIZ = 81;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.bottomToBottom = 0;
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams).gravity = 81;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            frameLayout$LayoutParams.gravity = 81;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams)) {
            ((092.d)frameLayout$LayoutParams).LIZ = 81;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams).bottomMargin = (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099750));
        ((TextView)tuxTextView).setText(2131824728);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("P1_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final 4fg 4fg = new 4fg(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755270", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        i.LIZ("app:tux_tintColor", (a)new a.b("2131099758", "color"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)linearLayout, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        if (((View)frameLayout).getParent() == null) {
            constraintLayout.addView((View)frameLayout, (ViewGroup$LayoutParams)a3);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(13140);
        return (View)constraintLayout;
    }
}
