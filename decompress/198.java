// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 198 implements 0IF
{
    static {
        Covode.recordClassIndex(1973);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(948);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131367363);
        linearLayout.setOrientation(0);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        if (RelativeLayout$LayoutParams.class.isInstance(liz)) {
            ((RelativeLayout$LayoutParams)liz).addRule(15, -1);
        }
        linearLayout.setGravity(16);
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131374129);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.weight = 1.0f;
        }
        b.LIZ((View)frameLayout);
        if (((View)frameLayout).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)frameLayout, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final FrameLayout frameLayout2 = new FrameLayout(context);
        ((View)frameLayout2).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)frameLayout2).getPaddingTop(), ((View)frameLayout2).getPaddingRight(), ((View)frameLayout2).getPaddingBottom());
        ((View)frameLayout2).setPadding(((View)frameLayout2).getPaddingLeft(), ((View)frameLayout2).getPaddingTop(), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), ((View)frameLayout2).getPaddingBottom());
        ((View)frameLayout2).setId(2131373206);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.weight = 1.0f;
        }
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131366530);
        linearLayout2.setOrientation(0);
        ((View)linearLayout2).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-2, -1);
        linearLayout2.setGravity(16);
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setAlpha(0.75f);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755572", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        i.LIZ("app:tux_iconHeight", (a)new a.d("16", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        i.LIZ("app:tux_iconWidth", (a)new a.d("16", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        i.LIZ("app:tux_tintColor", (a)new a.b("2131099685", "color"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams3);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373205);
        ((View)tuxTextView).setAlpha(0.75f);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setLines(1);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginStart((int)TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("H4_Regular"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams4);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)frameLayout2).addView((View)linearLayout2, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final LinearLayout linearLayout3 = new LinearLayout(context);
        ((View)linearLayout3).setId(2131366529);
        linearLayout3.setOrientation(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-2, -1);
        linearLayout3.setGravity(16);
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setAlpha(0.75f);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        final i j = new i();
        j.LIZ("app:tux_icon", (a)new a.b("2131755681", "raw"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        j.LIZ("app:tux_iconHeight", (a)new a.d("16", "dp"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        j.LIZ("app:tux_iconWidth", (a)new a.d("16", "dp"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            linearLayout$LayoutParams5.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams5).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams5)) {
            ((092.d)linearLayout$LayoutParams5).LIZ = 17;
        }
        j.LIZ("app:tux_tintColor", (a)new a.b("2131099685", "color"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        CTM.LIZ((Object)4fg2, (Object)linearLayout$LayoutParams5);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131366527);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099687));
        final LinearLayout$LayoutParams linearLayout$LayoutParams6 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams6).setMarginStart((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("H4_Regular"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams6);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        }
        final 4fg 4fg3 = new 4fg(context);
        ((View)4fg3).setAlpha(0.75f);
        final LinearLayout$LayoutParams linearLayout$LayoutParams7 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams7).setMarginStart((int)TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        final i k = new i();
        k.LIZ("app:tux_icon", (a)new a.b("2131755213", "raw"), 4fg3, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams7)) {
            linearLayout$LayoutParams7.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams7)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams7).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams7)) {
            ((092.d)linearLayout$LayoutParams7).LIZ = 17;
        }
        k.LIZ("app:tux_iconHeight", (a)new a.d("16", "dp"), 4fg3, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        k.LIZ("app:tux_iconWidth", (a)new a.d("16", "dp"), 4fg3, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        k.LIZ("app:tux_tintColor", (a)new a.b("2131099685", "color"), 4fg3, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        CTM.LIZ((Object)4fg3, (Object)linearLayout$LayoutParams7);
        b.LIZ((View)4fg3);
        if (((View)4fg3).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)4fg3, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131366528);
        ((TextView)tuxTextView3).setTextColor(resources.getColorStateList(2131099687));
        final LinearLayout$LayoutParams linearLayout$LayoutParams8 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams8).setMarginStart((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("H4_Regular"), tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams8);
        CTM.LIZ((Object)tuxTextView3, (Object)linearLayout$LayoutParams8);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams8);
        }
        final 4fg 4fg4 = new 4fg(context);
        ((View)4fg4).setId(2131366526);
        ((View)4fg4).setAlpha(0.75f);
        ((ImageView)4fg4).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams9 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams9)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams9).setMarginStart((int)TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        final i l = new i();
        l.LIZ("app:tux_icon", (a)new a.b("2131755245", "raw"), 4fg4, (ViewGroup$LayoutParams)linearLayout$LayoutParams9);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams9)) {
            linearLayout$LayoutParams9.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams9)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams9).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams9)) {
            ((092.d)linearLayout$LayoutParams9).LIZ = 17;
        }
        l.LIZ("app:tux_iconHeight", (a)new a.d("16", "dp"), 4fg4, (ViewGroup$LayoutParams)linearLayout$LayoutParams9);
        l.LIZ("app:tux_iconWidth", (a)new a.d("16", "dp"), 4fg4, (ViewGroup$LayoutParams)linearLayout$LayoutParams9);
        l.LIZ("app:tux_tintColor", (a)new a.b("2131099685", "color"), 4fg4, (ViewGroup$LayoutParams)linearLayout$LayoutParams9);
        CTM.LIZ((Object)4fg4, (Object)linearLayout$LayoutParams9);
        b.LIZ((View)4fg4);
        if (((View)4fg4).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)4fg4, (ViewGroup$LayoutParams)linearLayout$LayoutParams9);
        }
        final TuxTextView tuxTextView4 = new TuxTextView(context);
        ((View)tuxTextView4).setId(2131366525);
        ((TextView)tuxTextView4).setTextColor(resources.getColorStateList(2131099687));
        ((View)tuxTextView4).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams10 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams10)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams10).setMarginStart((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("H4_Regular"), tuxTextView4, (ViewGroup$LayoutParams)linearLayout$LayoutParams10);
        CTM.LIZ((Object)tuxTextView4, (Object)linearLayout$LayoutParams10);
        b.LIZ((View)tuxTextView4);
        if (((View)tuxTextView4).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)tuxTextView4, (ViewGroup$LayoutParams)linearLayout$LayoutParams10);
        }
        b.LIZ((View)linearLayout3);
        if (((View)linearLayout3).getParent() == null) {
            ((ViewGroup)frameLayout2).addView((View)linearLayout3, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        b.LIZ((View)frameLayout2);
        if (((View)frameLayout2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)frameLayout2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ((View)frameLayout3).setId(2131363915);
        final LinearLayout$LayoutParams linearLayout$LayoutParams11 = new LinearLayout$LayoutParams(-2, -1);
        final LinearLayout linearLayout4 = new LinearLayout(context);
        ((View)linearLayout4).setBackgroundResource(2131231900);
        linearLayout4.setOrientation(0);
        ((View)linearLayout4).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)linearLayout4).getPaddingTop(), ((View)linearLayout4).getPaddingRight(), ((View)linearLayout4).getPaddingBottom());
        ((View)linearLayout4).setPadding(((View)linearLayout4).getPaddingLeft(), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), ((View)linearLayout4).getPaddingRight(), ((View)linearLayout4).getPaddingBottom());
        ((View)linearLayout4).setPadding(((View)linearLayout4).getPaddingLeft(), ((View)linearLayout4).getPaddingTop(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)linearLayout4).getPaddingBottom());
        ((View)linearLayout4).setPadding(((View)linearLayout4).getPaddingLeft(), ((View)linearLayout4).getPaddingTop(), ((View)linearLayout4).getPaddingRight(), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams3).setMarginEnd((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams3).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            frameLayout$LayoutParams3.gravity = 16;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams3)) {
            ((092.d)frameLayout$LayoutParams3).LIZ = 16;
        }
        final 4fg 4fg5 = new 4fg(context);
        ((View)4fg5).setId(2131366155);
        ((ImageView)4fg5).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams12 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams12)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams12).setMarginEnd((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        final i m = new i();
        m.LIZ("app:tux_icon", (a)new a.b("2131755572", "raw"), 4fg5, (ViewGroup$LayoutParams)linearLayout$LayoutParams12);
        m.LIZ("app:tux_tintColor", (a)new a.b("2131099685", "color"), 4fg5, (ViewGroup$LayoutParams)linearLayout$LayoutParams12);
        CTM.LIZ((Object)4fg5, (Object)linearLayout$LayoutParams12);
        b.LIZ((View)4fg5);
        if (((View)4fg5).getParent() == null) {
            ((ViewGroup)linearLayout4).addView((View)4fg5, (ViewGroup$LayoutParams)linearLayout$LayoutParams12);
        }
        final 3fU 3fU = new 3fU(context);
        ((View)3fU).setId(2131373207);
        ((TextView)3fU).setText(2131827604);
        ((TextView)3fU).setTextColor(resources.getColorStateList(2131099685));
        final LinearLayout$LayoutParams linearLayout$LayoutParams13 = new LinearLayout$LayoutParams(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("P1_Semibold"), (TuxTextView)3fU, (ViewGroup$LayoutParams)linearLayout$LayoutParams13);
        CTM.LIZ((Object)3fU, (Object)linearLayout$LayoutParams13);
        b.LIZ((View)3fU);
        if (((View)3fU).getParent() == null) {
            ((ViewGroup)linearLayout4).addView((View)3fU, (ViewGroup$LayoutParams)linearLayout$LayoutParams13);
        }
        b.LIZ((View)linearLayout4);
        if (((View)linearLayout4).getParent() == null) {
            ((ViewGroup)frameLayout3).addView((View)linearLayout4, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        b.LIZ((View)frameLayout3);
        if (((View)frameLayout3).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)frameLayout3, (ViewGroup$LayoutParams)linearLayout$LayoutParams11);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(948);
        return (View)linearLayout;
    }
}
