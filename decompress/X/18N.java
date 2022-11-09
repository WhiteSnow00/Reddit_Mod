// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18n implements 0IF
{
    static {
        Covode.recordClassIndex(1952);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(13810);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        linearLayout.setGravity(16);
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131368483);
        linearLayout2.setOrientation(0);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        linearLayout2.setGravity(16);
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131368450);
        ((View)4fg).setAlpha(0.9f);
        ((ImageView)4fg).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 80;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 80;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).bottomMargin = (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755628", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131368459);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setMaxWidth((int)TypedValue.applyDimension(1, 149.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView).setMaxLines(1);
        ((TextView)tuxTextView).setShadowLayer(((TextView)tuxTextView).getShadowRadius(), ((TextView)tuxTextView).getShadowDx(), ((TextView)tuxTextView).getShadowDy(), resources.getColor(2131099738));
        ((TextView)tuxTextView).setShadowLayer(((TextView)tuxTextView).getShadowRadius(), 0.0f, ((TextView)tuxTextView).getShadowDy(), ((TextView)tuxTextView).getShadowColor());
        ((TextView)tuxTextView).setShadowLayer(((TextView)tuxTextView).getShadowRadius(), ((TextView)tuxTextView).getShadowDx(), 2.0f, ((TextView)tuxTextView).getShadowColor());
        ((TextView)tuxTextView).setShadowLayer(2.0f, ((TextView)tuxTextView).getShadowDx(), ((TextView)tuxTextView).getShadowDy(), ((TextView)tuxTextView).getShadowColor());
        ((TextView)tuxTextView).setText(2131828658);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099736));
        ((View)tuxTextView).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("H4_Bold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams3);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final CQP cqp = new CQP(context);
        ((View)cqp).setId(2131368485);
        cqp.setSpeed((int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        cqp.setTextColor(resources.getColor(2131099685));
        cqp.setTextShadow(resources.getColor(2131099735));
        cqp.setTextSize((int)TypedValue.applyDimension(2, 15.0f, resources.getDisplayMetrics()));
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)cqp);
        if (((View)cqp).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)cqp, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131368487);
        ((TextView)tuxTextView2).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView2).setMaxWidth((int)TypedValue.applyDimension(1, 360.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView2).setMaxLines(1);
        ((TextView)tuxTextView2).setShadowLayer(((TextView)tuxTextView2).getShadowRadius(), ((TextView)tuxTextView2).getShadowDx(), ((TextView)tuxTextView2).getShadowDy(), resources.getColor(2131099735));
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099685));
        ((View)tuxTextView2).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams5).setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("H4_Regular"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams5);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)linearLayout2, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final LinearLayout linearLayout3 = new LinearLayout(context);
        ((View)linearLayout3).setId(2131362454);
        linearLayout3.setOrientation(0);
        final LinearLayout$LayoutParams linearLayout$LayoutParams6 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            linearLayout$LayoutParams6.gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams6).gravity = 80;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams6)) {
            ((092.d)linearLayout$LayoutParams6).LIZ = 80;
        }
        linearLayout3.setGravity(16);
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setId(2131362452);
        ((View)4fg2).setPadding(((View)4fg2).getPaddingLeft(), ((View)4fg2).getPaddingTop(), (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)4fg2).getPaddingBottom());
        ((View)4fg2).setPadding((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)4fg2).getPaddingTop(), ((View)4fg2).getPaddingRight(), ((View)4fg2).getPaddingBottom());
        final LinearLayout$LayoutParams linearLayout$LayoutParams7 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        final i j = new i();
        j.LIZ("app:tux_iconHeight", (a)new a.d("10", "dp"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        j.LIZ("app:tux_iconWidth", (a)new a.d("10", "dp"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        j.LIZ("app:tux_tintColor", (a)new a.b("2131099690", "color"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        j.LIZ("app:tux_icon", (a)new a.b("2131755718", "raw"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        CTM.LIZ((Object)4fg2, (Object)linearLayout$LayoutParams7);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131362451);
        ((TextView)tuxTextView3).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView3).setMaxLines(1);
        ((TextView)tuxTextView3).setShadowLayer(((TextView)tuxTextView3).getShadowRadius(), ((TextView)tuxTextView3).getShadowDx(), ((TextView)tuxTextView3).getShadowDy(), resources.getColor(2131099735));
        ((TextView)tuxTextView3).setTextColor(resources.getColorStateList(2131099685));
        final LinearLayout$LayoutParams linearLayout$LayoutParams8 = new LinearLayout$LayoutParams(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams8);
        CTM.LIZ((Object)tuxTextView3, (Object)linearLayout$LayoutParams8);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams8);
        }
        b.LIZ((View)linearLayout3);
        if (((View)linearLayout3).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)linearLayout3, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(13810);
        return (View)linearLayout;
    }
}
