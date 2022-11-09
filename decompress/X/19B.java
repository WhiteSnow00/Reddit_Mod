// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.ImageView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$MarginLayoutParams;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.ImageView$ScaleType;
import com.a.a.a.a.a;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19b implements 0IF
{
    static {
        Covode.recordClassIndex(2002);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(2870);
        final Resources resources = context.getResources();
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        ((View)relativeLayout).setId(2131363954);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 180.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 320.0f, resources.getDisplayMetrics()));
        final Rhi rhi = new Rhi(context);
        ((View)rhi).setId(2131363937);
        ((View)rhi).setBackgroundResource(2131232951);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-1, -1);
        b.LIZ((View)rhi);
        if (((View)rhi).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        final V5a v5a = new V5a(context);
        ((View)v5a).setId(2131374061);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams(-1, -1);
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams2).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams2).gravity = 17;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams2)) {
            ((092.d)relativeLayout$LayoutParams2).LIZ = 17;
        }
        b.LIZ((View)v5a);
        if (((View)v5a).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)v5a, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        }
        final Rhi rhi2 = new Rhi(context);
        ((View)rhi2).setId(2131363945);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout$LayoutParams(-1, -1);
        final a a = new a();
        a.LIZ("app:actualImageScaleType", new com.a.b.a.a.c("centerCrop"), (SE3)rhi2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        a.LIZ("app:roundedCornerRadius", new com.a.b.a.a.b("2131165753", "dimen"), (SE3)rhi2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        a.LIZ((SE3)rhi2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        b.LIZ((View)rhi2);
        if (((View)rhi2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)rhi2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        }
        final View liz2 = 0I8.LIZ(context, 2131560152, (ViewGroup)relativeLayout, false, 2131560050);
        if (liz2.getParent() == null) {
            ((ViewGroup)relativeLayout).addView(liz2);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131373302);
        ((View)4fg).setPadding((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        ((ImageView)4fg).setScaleType(ImageView$ScaleType.CENTER);
        ((ImageView)4fg).setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(13, -1);
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (com.a.b.a.a)new com.a.b.a.a.b("2131755749", "raw"), 4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        i.LIZ("app:tux_tintColor", (com.a.b.a.a)new com.a.b.a.a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        CTM.LIZ((Object)4fg, (Object)relativeLayout$LayoutParams4);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        }
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setId(2131363963);
        ((ImageView)4fg2).setScaleType(ImageView$ScaleType.CENTER_INSIDE);
        ((ImageView)4fg2).setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams5).gravity = 8388613;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams5).gravity = 8388613;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams5)) {
            ((092.d)relativeLayout$LayoutParams5).LIZ = 8388613;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams5).setMargins((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        final i j = new i();
        j.LIZ("app:tux_iconShadow", (com.a.b.a.a)new com.a.b.a.a.c("true"), 4fg2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams5);
        j.LIZ("app:tux_icon", (com.a.b.a.a)new com.a.b.a.a.b("2131755509", "raw"), 4fg2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams5);
        j.LIZ("app:tux_tintColor", (com.a.b.a.a)new com.a.b.a.a.b("2130968627", "attr"), 4fg2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams5);
        CTM.LIZ((Object)4fg2, (Object)relativeLayout$LayoutParams5);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)4fg2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams5);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131363958);
        ((AppCompatTextView)tuxTextView).setBackgroundResource(2131232867);
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView).setText(2131826322);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968600 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((View)tuxTextView).setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams6).gravity = 8388613;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams6).gravity = 8388613;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams6)) {
            ((092.d)relativeLayout$LayoutParams6).LIZ = 8388613;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams6).setMargins((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("P3_Regular"), tuxTextView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams6);
        CTM.LIZ((Object)tuxTextView, (Object)relativeLayout$LayoutParams6);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams6);
        }
        final Rhi rhi3 = new Rhi(context);
        ((View)rhi3).setId(2131369334);
        ((View)rhi3).setBackgroundResource(2131232952);
        ((ImageView)rhi3).setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams7 = new RelativeLayout$LayoutParams(-1, -1);
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams7)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams7).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams7)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams7).gravity = 17;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams7)) {
            ((092.d)relativeLayout$LayoutParams7).LIZ = 17;
        }
        b.LIZ((View)rhi3);
        if (((View)rhi3).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)rhi3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams7);
        }
        final 4fg 4fg3 = new 4fg(context);
        ((View)4fg3).setId(2131367062);
        ((ImageView)4fg3).setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams8 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams8)) {
            relativeLayout$LayoutParams8.addRule(13, -1);
        }
        final i k = new i();
        k.LIZ("app:tux_icon", (com.a.b.a.a)new com.a.b.a.a.b("2131755681", "raw"), 4fg3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams8);
        k.LIZ("app:tux_iconShadow", (com.a.b.a.a)new com.a.b.a.a.c("true"), 4fg3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams8);
        k.LIZ("app:tux_tintColor", (com.a.b.a.a)new com.a.b.a.a.b("2131099685", "color"), 4fg3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams8);
        CTM.LIZ((Object)4fg3, (Object)relativeLayout$LayoutParams8);
        b.LIZ((View)4fg3);
        if (((View)4fg3).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)4fg3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams8);
        }
        final View liz3 = 0I8.LIZ(context, 2131560049, (ViewGroup)relativeLayout, false, 2131560050);
        if (liz3.getParent() == null) {
            ((ViewGroup)relativeLayout).addView(liz3);
        }
        b.LIZ((View)relativeLayout);
        ((View)relativeLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)relativeLayout);
        }
        MethodCollector.o(2870);
        return (View)relativeLayout;
    }
}
