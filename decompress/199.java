// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.g;
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

public final class 199 implements 0IF
{
    static {
        Covode.recordClassIndex(1974);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(5062);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz)) {
            ((LinearLayout$LayoutParams)liz).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz)) {
            ((FrameLayout$LayoutParams)liz).gravity = 80;
        }
        if (092.d.class.isInstance(liz)) {
            ((092.d)liz).LIZ = 80;
        }
        final SZe sZe = new SZe(context);
        ((View)sZe).setId(2131374098);
        ((ImageView)sZe).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 99.0f, resources.getDisplayMetrics()));
        final g g = new g();
        g.LIZ("app:tux_shadeColor", (a)new a.b("2130968612", "attr"), sZe, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        g.LIZ("app:tux_beginShadeOpacity", (a)new a.c("0"), sZe, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        g.LIZ("app:tux_endShadeOpacity", (a)new a.c("0.18"), sZe, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        g.LIZ("app:tux_shader", (a)new a.c("ease_in_out"), sZe, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        g.LIZ("app:tux_style", (a)new a.c("vertical"), sZe, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        CTM.LIZ((Object)sZe, (Object)frameLayout$LayoutParams);
        b.LIZ((View)sZe);
        if (((View)sZe).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)sZe, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final 7ji 7ji = new 7ji(context);
        ((View)7ji).setId(2131374099);
        ((ImageView)7ji).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 140.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams2).gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            frameLayout$LayoutParams2.gravity = 1;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams2)) {
            ((092.d)frameLayout$LayoutParams2).LIZ = 1;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams2).bottomMargin = (int)TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)7ji);
        if (((View)7ji).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)7ji, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        ((View)relativeLayout).setId(2131374097);
        ((View)relativeLayout).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams3).bottomMargin = (int)TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics());
        }
        final SZe sZe2 = new SZe(context);
        ((View)sZe2).setId(2131363294);
        ((ImageView)sZe2).setVisibility(0);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()));
        final g g2 = new g();
        g2.LIZ("app:tux_shadeColor", (a)new a.b("2130968612", "attr"), sZe2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        g2.LIZ("app:tux_beginShadeOpacity", (a)new a.c("0"), sZe2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        g2.LIZ("app:tux_endShadeOpacity", (a)new a.c("0.8"), sZe2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        g2.LIZ("app:tux_shader", (a)new a.c("ease_in_out"), sZe2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        g2.LIZ("app:tux_style", (a)new a.c("vertical"), sZe2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        CTM.LIZ((Object)sZe2, (Object)relativeLayout$LayoutParams);
        b.LIZ((View)sZe2);
        if (((View)sZe2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)sZe2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131363290);
        ((TextView)tuxTextView).setMaxLines(3);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((View)tuxTextView).setVisibility(0);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams(-1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).setMarginEnd((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("H2_Bold"), tuxTextView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        ((TextView)tuxTextView).setGravity(1);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(2, 2131364127);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).bottomMargin = (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        CTM.LIZ((Object)tuxTextView, (Object)relativeLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        }
        final View view = new View(context);
        view.setId(2131362935);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 0.1f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(12, -1);
        }
        b.LIZ(view);
        if (view.getParent() == null) {
            ((ViewGroup)relativeLayout).addView(view, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131364127);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968627 });
        ((TextView)tuxTextView2).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout$LayoutParams(-2, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(16, 2131364126);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(2, 2131362935);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams4).bottomMargin = (int)TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (a)new a.c("H1_Semibold"), tuxTextView2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        CTM.LIZ((Object)tuxTextView2, (Object)relativeLayout$LayoutParams4);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131364126);
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968627 });
        ((TextView)tuxTextView3).setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        ((TextView)tuxTextView3).setText((CharSequence)"/");
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            relativeLayout$LayoutParams5.addRule(14, -1);
        }
        ((TextView)tuxTextView3).setGravity(17);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            relativeLayout$LayoutParams5.addRule(6, 2131364127);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            relativeLayout$LayoutParams5.addRule(8, 2131364127);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams5).setMarginStart((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams5).setMarginEnd((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("H3_Semibold"), tuxTextView3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams5);
        CTM.LIZ((Object)tuxTextView3, (Object)relativeLayout$LayoutParams5);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)tuxTextView3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams5);
        }
        final TuxTextView tuxTextView4 = new TuxTextView(context);
        ((View)tuxTextView4).setId(2131372579);
        final TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[] { 2130968629 });
        ((TextView)tuxTextView4).setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout$LayoutParams(-2, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            relativeLayout$LayoutParams6.addRule(17, 2131364126);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            relativeLayout$LayoutParams6.addRule(6, 2131364127);
        }
        new k().LIZ("app:tux_font", (a)new a.c("H1_Semibold"), tuxTextView4, (ViewGroup$LayoutParams)relativeLayout$LayoutParams6);
        CTM.LIZ((Object)tuxTextView4, (Object)relativeLayout$LayoutParams6);
        b.LIZ((View)tuxTextView4);
        if (((View)tuxTextView4).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)tuxTextView4, (ViewGroup$LayoutParams)relativeLayout$LayoutParams6);
        }
        b.LIZ((View)relativeLayout);
        if (((View)relativeLayout).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)relativeLayout, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        final SRd sRd = new SRd(context);
        ((View)sRd).setId(2131374096);
        ((View)sRd).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams4 = new FrameLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        b.LIZ((View)sRd);
        if (((View)sRd).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)sRd, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(5062);
        return (View)frameLayout;
    }
}
