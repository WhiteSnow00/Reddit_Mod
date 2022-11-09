// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.util.TypedValue;
import android.widget.FrameLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import android.view.b;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18r implements 0IF
{
    static {
        Covode.recordClassIndex(1956);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(13150);
        final Resources resources = context.getResources();
        final SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = new SwipeUpGuideStrengthenLayout(context);
        ((View)swipeUpGuideStrengthenLayout).setId(2131372001);
        ((View)swipeUpGuideStrengthenLayout).setAlpha(0.5f);
        ((View)swipeUpGuideStrengthenLayout).setBackgroundColor(resources.getColor(2131099734));
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)swipeUpGuideStrengthenLayout, -1, -1);
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, -1);
        final LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-1, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            relativeLayout$LayoutParams.addRule(13, -1);
        }
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams).gravity = 17;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams)) {
            ((092.d)relativeLayout$LayoutParams).LIZ = 17;
        }
        final VJn vJn = new VJn(context);
        ((View)vJn).setId(2131366929);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 17;
        }
        b.LIZ((View)vJn);
        if (((View)vJn).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)vJn, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final 4Gb 4Gb = new 4Gb(context);
        ((View)4Gb).setId(2131366930);
        ((View)4Gb).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            linearLayout$LayoutParams3.gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams3).gravity = 1;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams3)) {
            ((092.d)linearLayout$LayoutParams3).LIZ = 1;
        }
        b.LIZ((View)4Gb);
        if (((View)4Gb).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)4Gb, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setPadding(((View)frameLayout).getPaddingLeft(), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), ((View)frameLayout).getPaddingRight(), ((View)frameLayout).getPaddingBottom());
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).leftMargin = (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).rightMargin = (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373581);
        ((TextView)tuxTextView).setText(2131835140);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("H1_Bold"), tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        CTM.LIZ((Object)tuxTextView, (Object)frameLayout$LayoutParams);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        if (((View)frameLayout).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)frameLayout, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        final FrameLayout frameLayout2 = new FrameLayout(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams(-1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams5).leftMargin = (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams5).rightMargin = (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131373582);
        ((TextView)tuxTextView2).setText(2131835140);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099685));
        ((View)tuxTextView2).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -2);
        ((TextView)tuxTextView2).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("H2_Bold"), tuxTextView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView2, (Object)frameLayout$LayoutParams2);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)frameLayout2).addView((View)tuxTextView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        b.LIZ((View)frameLayout2);
        if (((View)frameLayout2).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)frameLayout2, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)linearLayout2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        b.LIZ((View)relativeLayout);
        if (((View)relativeLayout).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)relativeLayout, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            ((ViewGroup)swipeUpGuideStrengthenLayout).addView((View)linearLayout, (ViewGroup$LayoutParams)liz2);
        }
        b.LIZ((View)swipeUpGuideStrengthenLayout);
        ((View)swipeUpGuideStrengthenLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)swipeUpGuideStrengthenLayout);
        }
        MethodCollector.o(13150);
        return (View)swipeUpGuideStrengthenLayout;
    }
}
