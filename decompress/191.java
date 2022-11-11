// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 191 implements 0IF
{
    static {
        Covode.recordClassIndex(1966);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(10597);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131369968);
        ((View)linearLayout).setBackgroundResource(2131231703);
        linearLayout.setOrientation(0);
        ((View)linearLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.topMargin = (int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        linearLayout.setGravity(17);
        if (ConstraintLayout.a.class.isInstance(liz)) {
            ((ConstraintLayout.a)liz).endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(liz)) {
            ((ConstraintLayout.a)liz).startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(liz)) {
            ((ConstraintLayout.a)liz).topToBottom = 2131365742;
        }
        final 4fg 4fg = new 4fg(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 17;
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755688", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_tintColor", (a)new a.b("2131099685", "color"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((TextView)tuxTextView).setText(2131832951);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("P1_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(10597);
        return (View)linearLayout;
    }
}
