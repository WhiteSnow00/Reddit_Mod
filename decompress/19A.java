// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.a.a.a.a.a;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19a implements 0IF
{
    static {
        Covode.recordClassIndex(2001);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(10208);
        final Resources resources = context.getResources();
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        ((View)relativeLayout).setId(2131363188);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 180.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 75.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(liz)) {
            ((RelativeLayout$LayoutParams)liz).addRule(12, -1);
        }
        final Rhi rhi = new Rhi(context);
        ((View)rhi).setId(2131366207);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-1, -1);
        final a a = new a();
        a.LIZ("fresco:placeholderImage", new com.a.b.a.a.b("2131232869", "drawable"), (SE3)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        a.LIZ((SE3)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        b.LIZ((View)rhi);
        if (((View)rhi).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        final CfY cfY = new CfY(context);
        ((View)cfY).setId(2131371783);
        cfY.setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams(-2, -2);
        final com.ss.android.ugc.aweme.tux.business.a.a a2 = new com.ss.android.ugc.aweme.tux.business.a.a();
        a2.LIZ("app:brand_mode", (com.a.b.a.a)new com.a.b.a.a.c("guide_background"), cfY, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        a2.LIZ("android:paddingHorizontal", (com.a.b.a.a)new com.a.b.a.a.d("5", "dp"), cfY, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        a2.LIZ("android:paddingVertical", (com.a.b.a.a)new com.a.b.a.a.d("2", "dp"), cfY, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        a2.LIZ("android:layout_marginHorizontal", (com.a.b.a.a)new com.a.b.a.a.d("12", "dp"), cfY, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(2, 2131363959);
        }
        a2.LIZ("app:radius", (com.a.b.a.a)new com.a.b.a.a.d("2", "dp"), cfY, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)cfY, -2, -2);
        linearLayout.setGravity(17);
        final 4fg 4fg = new 4fg(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        final i i = new i();
        i.LIZ("app:tux_icon", (com.a.b.a.a)new com.a.b.a.a.b("2131755767", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_iconWidth", (com.a.b.a.a)new com.a.b.a.a.d("12", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_iconHeight", (com.a.b.a.a)new com.a.b.a.a.d("12", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_tintColor", (com.a.b.a.a)new com.a.b.a.a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((TextView)tuxTextView).setText(2131836600);
        ((View)tuxTextView).setTextAlignment(4);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968627 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((TextView)tuxTextView).setMaxLines(1);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("P2_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            ((ViewGroup)cfY).addView((View)linearLayout, (ViewGroup$LayoutParams)liz2);
        }
        CTM.LIZ((Object)cfY, (Object)relativeLayout$LayoutParams2);
        b.LIZ((View)cfY);
        if (((View)cfY).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)cfY, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        }
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131363959);
        linearLayout2.setOrientation(0);
        ((View)linearLayout2).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout$LayoutParams(-1, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(12, -1);
        }
        linearLayout2.setGravity(16);
        final OQg oQg = new OQg(context);
        ((View)oQg).setId(2131363935);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        b.LIZ((View)oQg);
        if (((View)oQg).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)oQg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131363961);
        ((TextView)tuxTextView2).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView2).setMaxLines(1);
        ((View)tuxTextView2).setTextAlignment(5);
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968627 });
        ((TextView)tuxTextView2).setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        ((TextView)tuxTextView2).setGravity(8388627);
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("P2_Semibold"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams4);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)linearLayout2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        }
        b.LIZ((View)relativeLayout);
        ((View)relativeLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)relativeLayout);
        }
        MethodCollector.o(10208);
        return (View)relativeLayout;
    }
}
