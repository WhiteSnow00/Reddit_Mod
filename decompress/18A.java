// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.ss.android.ugc.aweme.base.ui.b.c;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tux.business.a.a;
import android.widget.ImageView$ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18a implements 0IF
{
    static {
        Covode.recordClassIndex(1939);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(6497);
        final Resources resources = context.getResources();
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), -2);
        final RelativeLayout relativeLayout2 = new RelativeLayout(context);
        ((View)relativeLayout2).setId(2131362579);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams).topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        final C4Y c4Y = new C4Y(context);
        ((View)c4Y).setId(2131373859);
        ((ImageView)c4Y).setVisibility(0);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(13, -1);
        }
        b.LIZ((View)c4Y);
        if (((View)c4Y).getParent() == null) {
            ((ViewGroup)relativeLayout2).addView((View)c4Y, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        }
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        ((View)appCompatImageView).setId(2131366896);
        appCompatImageView.setScaleType(ImageView$ScaleType.FIT_XY);
        appCompatImageView.setImageResource(2131231749);
        appCompatImageView.setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(18, 2131373859);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(6, 2131373859);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(19, 2131373859);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(8, 2131373859);
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            ((ViewGroup)relativeLayout2).addView((View)appCompatImageView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        }
        final CfY cfY = new CfY(context);
        ((View)cfY).setId(2131373915);
        cfY.setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(13, -1);
        }
        new a().LIZ("app:ring_width", (com.a.b.a.a)new com.a.b.a.a.d("2.5", "dp"), cfY, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        CTM.LIZ((Object)cfY, (Object)relativeLayout$LayoutParams4);
        b.LIZ((View)cfY);
        if (((View)cfY).getParent() == null) {
            ((ViewGroup)relativeLayout2).addView((View)cfY, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        }
        final 7pS 7pS = new 7pS(context);
        ((View)7pS).setId(2131373862);
        ((View)7pS).setPadding((int)TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        ((View)7pS).setVisibility(8);
        7pS.setStrokeWidth((int)TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics()));
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            relativeLayout$LayoutParams5.addRule(13, -1);
        }
        b.LIZ((View)7pS);
        if (((View)7pS).getParent() == null) {
            ((ViewGroup)relativeLayout2).addView((View)7pS, (ViewGroup$LayoutParams)relativeLayout$LayoutParams5);
        }
        final SmartImageView smartImageView = new SmartImageView(context);
        ((View)smartImageView).setId(2131369811);
        ((ImageView)smartImageView).setScaleType(ImageView$ScaleType.FIT_CENTER);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        final c c = new c();
        c.LIZ("app:actualImageScaleType", (com.a.b.a.a)new com.a.b.a.a.c("fitCenter"), smartImageView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams6);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            relativeLayout$LayoutParams6.addRule(10, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            relativeLayout$LayoutParams6.addRule(14, -1);
        }
        c.LIZ(smartImageView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams6);
        b.LIZ((View)smartImageView);
        if (((View)smartImageView).getParent() == null) {
            ((ViewGroup)relativeLayout2).addView((View)smartImageView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams6);
        }
        final CIJ cij = new CIJ(context);
        ((View)cij).setId(2131373867);
        ((View)cij).setVisibility(4);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams7 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams7)) {
            relativeLayout$LayoutParams7.addRule(13, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams7)) {
            relativeLayout$LayoutParams7.addRule(6, 2131373859);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams7)) {
            relativeLayout$LayoutParams7.addRule(14, -1);
        }
        b.LIZ((View)cij);
        if (((View)cij).getParent() == null) {
            ((ViewGroup)relativeLayout2).addView((View)cij, (ViewGroup$LayoutParams)relativeLayout$LayoutParams7);
        }
        b.LIZ((View)relativeLayout2);
        if (((View)relativeLayout2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)relativeLayout2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        final Rhi rhi = new Rhi(context);
        ((View)rhi).setId(2131362580);
        ((ImageView)rhi).setScaleType(ImageView$ScaleType.FIT_CENTER);
        ((ImageView)rhi).setVisibility(8);
        ((SE3)rhi).setImageResource(2131232575);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams8 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams8)) {
            relativeLayout$LayoutParams8.addRule(14, -1);
        }
        b.LIZ((View)rhi);
        if (((View)rhi).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams8);
        }
        final RelativeLayout relativeLayout3 = new RelativeLayout(context);
        ((View)relativeLayout3).setId(2131365465);
        ((View)relativeLayout3).setPadding(((View)relativeLayout3).getPaddingLeft(), ((View)relativeLayout3).getPaddingTop(), ((View)relativeLayout3).getPaddingRight(), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams9 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams9)) {
            relativeLayout$LayoutParams9.addRule(14, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams9)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams9).topMargin = (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
        }
        final VJn vJn = new VJn(context);
        ((View)vJn).setId(2131365452);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams10 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams10)) {
            relativeLayout$LayoutParams10.addRule(14, -1);
        }
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams10)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams10).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams10)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams10).gravity = 17;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams10)) {
            ((092.d)relativeLayout$LayoutParams10).LIZ = 17;
        }
        b.LIZ((View)vJn);
        if (((View)vJn).getParent() == null) {
            ((ViewGroup)relativeLayout3).addView((View)vJn, (ViewGroup$LayoutParams)relativeLayout$LayoutParams10);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131364441);
        ((View)4fg).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)4fg).getPaddingTop(), ((View)4fg).getPaddingRight(), ((View)4fg).getPaddingBottom());
        ((View)4fg).setPadding(((View)4fg).getPaddingLeft(), ((View)4fg).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)4fg).getPaddingBottom());
        ((View)4fg).setPadding(((View)4fg).getPaddingLeft(), (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)4fg).getPaddingRight(), ((View)4fg).getPaddingBottom());
        ((View)4fg).setPadding(((View)4fg).getPaddingLeft(), ((View)4fg).getPaddingTop(), ((View)4fg).getPaddingRight(), (int)TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        ((ImageView)4fg).setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams11 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams11)) {
            relativeLayout$LayoutParams11.addRule(14, -1);
        }
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams11)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams11).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams11)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams11).gravity = 17;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams11)) {
            ((092.d)relativeLayout$LayoutParams11).LIZ = 17;
        }
        final i i = new i();
        i.LIZ("app:tux_tintColor", (com.a.b.a.a)new com.a.b.a.a.b("2130968654", "attr"), 4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams11);
        i.LIZ("app:tux_iconHeight", (com.a.b.a.a)new com.a.b.a.a.d("12", "dp"), 4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams11);
        i.LIZ("app:tux_iconWidth", (com.a.b.a.a)new com.a.b.a.a.d("12", "dp"), 4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams11);
        i.LIZ("app:tux_icon", (com.a.b.a.a)new com.a.b.a.a.b("2131755642", "raw"), 4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams11);
        CTM.LIZ((Object)4fg, (Object)relativeLayout$LayoutParams11);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)relativeLayout3).addView((View)4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams11);
        }
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setId(2131364411);
        ((ImageView)4fg2).setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams12 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams12)) {
            relativeLayout$LayoutParams12.addRule(14, -1);
        }
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams12)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams12).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams12)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams12).gravity = 17;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams12)) {
            ((092.d)relativeLayout$LayoutParams12).LIZ = 17;
        }
        final i j = new i();
        j.LIZ("app:tux_tintColor", (com.a.b.a.a)new com.a.b.a.a.b("2130968644", "attr"), 4fg2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams12);
        j.LIZ("app:tux_iconHeight", (com.a.b.a.a)new com.a.b.a.a.d("10", "dp"), 4fg2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams12);
        j.LIZ("app:tux_iconWidth", (com.a.b.a.a)new com.a.b.a.a.d("10", "dp"), 4fg2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams12);
        j.LIZ("app:tux_icon", (com.a.b.a.a)new com.a.b.a.a.b("2131755579", "raw"), 4fg2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams12);
        CTM.LIZ((Object)4fg2, (Object)relativeLayout$LayoutParams12);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            ((ViewGroup)relativeLayout3).addView((View)4fg2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams12);
        }
        b.LIZ((View)relativeLayout3);
        if (((View)relativeLayout3).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)relativeLayout3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams9);
        }
        b.LIZ((View)relativeLayout);
        ((View)relativeLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)relativeLayout);
        }
        MethodCollector.o(6497);
        return (View)relativeLayout;
    }
}
