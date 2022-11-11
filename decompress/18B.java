// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.Resources;
import androidx.appcompat.widget.AppCompatImageView;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import com.a.a.a.a.a;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18b implements 0IF
{
    static {
        Covode.recordClassIndex(1940);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(8228);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        linearLayout.setGravity(80);
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131369030);
        linearLayout2.setOrientation(1);
        ((View)linearLayout2).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)linearLayout2).getPaddingTop(), ((View)linearLayout2).getPaddingRight(), ((View)linearLayout2).getPaddingBottom());
        ((View)linearLayout2).setPadding(((View)linearLayout2).getPaddingLeft(), ((View)linearLayout2).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)linearLayout2).getPaddingBottom());
        ((View)linearLayout2).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)linearLayout2).getPaddingTop(), ((View)linearLayout2).getPaddingRight(), ((View)linearLayout2).getPaddingBottom());
        ((View)linearLayout2).setPadding(((View)linearLayout2).getPaddingLeft(), ((View)linearLayout2).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)linearLayout2).getPaddingBottom());
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, -2);
        final LinearLayout linearLayout3 = new LinearLayout(context);
        ((View)linearLayout3).setId(2131366457);
        linearLayout3.setOrientation(0);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        linearLayout3.setGravity(16);
        final OQg oQg = new OQg(context);
        ((View)oQg).setId(2131366933);
        ((View)oQg).setBackgroundResource(2131231269);
        ((View)oQg).setPadding((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        ((ImageView)oQg).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            linearLayout$LayoutParams3.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams3).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams3)) {
            ((092.d)linearLayout$LayoutParams3).LIZ = 16;
        }
        b.LIZ((View)oQg);
        if (((View)oQg).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)oQg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final OQg oQg2 = new OQg(context);
        ((View)oQg2).setId(2131366934);
        ((View)oQg2).setBackgroundResource(2131231269);
        ((View)oQg2).setPadding((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        ((ImageView)oQg2).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            linearLayout$LayoutParams4.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams4).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams4)) {
            ((092.d)linearLayout$LayoutParams4).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).leftMargin = (int)TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginStart((int)TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)oQg2);
        if (((View)oQg2).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)oQg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        final Rhi rhi = new Rhi(context);
        ((View)rhi).setId(2131366935);
        ((ImageView)rhi).setScaleType(ImageView$ScaleType.CENTER_CROP);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        final a a = new a();
        a.LIZ("fresco:roundedCornerRadius", new com.a.b.a.a.d("2", "dp"), (SE3)rhi, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        a.LIZ((SE3)rhi, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        b.LIZ((View)rhi);
        if (((View)rhi).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)rhi, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        final 3Fl 3Fl = new 3Fl(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams6 = new LinearLayout$LayoutParams(-2, -1);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            linearLayout$LayoutParams6.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams6).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams6)) {
            ((092.d)linearLayout$LayoutParams6).LIZ = 16;
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131362291);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setMaxLines(1);
        ((TextView)tuxTextView).setPadding((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099686));
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)3Fl, -2, (int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz2)) {
            ((LinearLayout$LayoutParams)liz2).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz2)) {
            ((FrameLayout$LayoutParams)liz2).gravity = 16;
        }
        if (092.d.class.isInstance(liz2)) {
            ((092.d)liz2).LIZ = 16;
        }
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("P2_Semibold"), tuxTextView, (ViewGroup$LayoutParams)liz2);
        CTM.LIZ((Object)tuxTextView, (Object)liz2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)3Fl).addView((View)tuxTextView, (ViewGroup$LayoutParams)liz2);
        }
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        ((View)appCompatImageView).setId(2131364436);
        ((View)appCompatImageView).setBackgroundColor(resources.getColor(2131099752));
        final ViewGroup$MarginLayoutParams liz3 = b.LIZ((ViewGroup)3Fl, (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz3)) {
            ((LinearLayout$LayoutParams)liz3).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz3)) {
            ((FrameLayout$LayoutParams)liz3).gravity = 16;
        }
        if (092.d.class.isInstance(liz3)) {
            ((092.d)liz3).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz3)) {
            liz3.setMarginEnd((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz3)) {
            liz3.leftMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz3)) {
            liz3.rightMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz3)) {
            liz3.setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            ((ViewGroup)3Fl).addView((View)appCompatImageView, (ViewGroup$LayoutParams)liz3);
        }
        final View view = new View(context);
        view.setId(2131371292);
        view.setAlpha(0.34f);
        view.setBackgroundResource(2131231694);
        view.setVisibility(8);
        final ViewGroup$MarginLayoutParams liz4 = b.LIZ((ViewGroup)3Fl, (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz4)) {
            ((LinearLayout$LayoutParams)liz4).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz4)) {
            ((FrameLayout$LayoutParams)liz4).gravity = 16;
        }
        if (092.d.class.isInstance(liz4)) {
            ((092.d)liz4).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz4)) {
            liz4.leftMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz4)) {
            liz4.rightMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz4)) {
            liz4.setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz4)) {
            liz4.setMarginEnd((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        b.LIZ(view);
        if (view.getParent() == null) {
            ((ViewGroup)3Fl).addView(view, (ViewGroup$LayoutParams)liz4);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131373777);
        ((TextView)tuxTextView2).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView2).setMaxLines(1);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099758));
        final ViewGroup$MarginLayoutParams liz5 = b.LIZ((ViewGroup)3Fl, -2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz5)) {
            ((LinearLayout$LayoutParams)liz5).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz5)) {
            ((FrameLayout$LayoutParams)liz5).gravity = 16;
        }
        if (092.d.class.isInstance(liz5)) {
            ((092.d)liz5).LIZ = 16;
        }
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("SmallText1_Regular"), tuxTextView2, (ViewGroup$LayoutParams)liz5);
        CTM.LIZ((Object)tuxTextView2, (Object)liz5);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)3Fl).addView((View)tuxTextView2, (ViewGroup$LayoutParams)liz5);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131371293);
        ((TextView)tuxTextView3).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView3).setMaxLines(1);
        ((TextView)tuxTextView3).setTextColor(resources.getColorStateList(2131099686));
        final ViewGroup$MarginLayoutParams liz6 = b.LIZ((ViewGroup)3Fl, -2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz6)) {
            ((LinearLayout$LayoutParams)liz6).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz6)) {
            ((FrameLayout$LayoutParams)liz6).gravity = 16;
        }
        if (092.d.class.isInstance(liz6)) {
            ((092.d)liz6).LIZ = 16;
        }
        ((TextView)tuxTextView3).setGravity(17);
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("P2_Regular"), tuxTextView3, (ViewGroup$LayoutParams)liz6);
        CTM.LIZ((Object)tuxTextView3, (Object)liz6);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)3Fl).addView((View)tuxTextView3, (ViewGroup$LayoutParams)liz6);
        }
        final AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        ((View)appCompatImageView2).setId(2131367096);
        appCompatImageView2.setImageResource(2131233111);
        appCompatImageView2.setVisibility(8);
        final ViewGroup$MarginLayoutParams liz7 = b.LIZ((ViewGroup)3Fl, (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz7)) {
            ((LinearLayout$LayoutParams)liz7).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz7)) {
            ((FrameLayout$LayoutParams)liz7).gravity = 16;
        }
        if (092.d.class.isInstance(liz7)) {
            ((092.d)liz7).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz7)) {
            liz7.setMarginStart((int)TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz7)) {
            liz7.leftMargin = (int)TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)appCompatImageView2);
        if (((View)appCompatImageView2).getParent() == null) {
            ((ViewGroup)3Fl).addView((View)appCompatImageView2, (ViewGroup$LayoutParams)liz7);
        }
        final View view2 = new View(context);
        view2.setId(2131369319);
        view2.setBackgroundColor(resources.getColor(2131099763));
        final ViewGroup$MarginLayoutParams liz8 = b.LIZ((ViewGroup)3Fl, (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), -1);
        b.LIZ(view2);
        if (view2.getParent() == null) {
            ((ViewGroup)3Fl).addView(view2, (ViewGroup$LayoutParams)liz8);
        }
        b.LIZ((View)3Fl);
        if (((View)3Fl).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)3Fl, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        }
        b.LIZ((View)linearLayout3);
        if (((View)linearLayout3).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)linearLayout3, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final TuxTextView tuxTextView4 = new TuxTextView(context);
        ((View)tuxTextView4).setId(2131363481);
        ((TextView)tuxTextView4).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView4).setMaxLines(1);
        ((TextView)tuxTextView4).setPadding(((View)tuxTextView4).getPaddingLeft(), ((View)tuxTextView4).getPaddingTop(), ((View)tuxTextView4).getPaddingRight(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView4).setTextColor(resources.getColorStateList(2131099758));
        ((View)tuxTextView4).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams7 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams7).leftMargin = (int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams7).setMarginStart((int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        ((TextView)tuxTextView4).setGravity(17);
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("SmallText1_Regular"), tuxTextView4, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        CTM.LIZ((Object)tuxTextView4, (Object)linearLayout$LayoutParams7);
        b.LIZ((View)tuxTextView4);
        if (((View)tuxTextView4).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView4, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        }
        final LinearLayout linearLayout4 = new LinearLayout(context);
        ((View)linearLayout4).setId(2131362310);
        linearLayout4.setOrientation(0);
        ((View)linearLayout4).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams8 = new LinearLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams8).bottomMargin = (int)TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams8).leftMargin = (int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams8).setMarginStart((int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams8).topMargin = (int)TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        linearLayout4.setGravity(16);
        final 3Fl 3Fl2 = new 3Fl(context);
        ((View)3Fl2).setId(2131372490);
        final LinearLayout$LayoutParams linearLayout$LayoutParams9 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams9)) {
            linearLayout$LayoutParams9.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams9)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams9).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams9)) {
            ((092.d)linearLayout$LayoutParams9).LIZ = 16;
        }
        final TuxTextView tuxTextView5 = new TuxTextView(context);
        ((View)tuxTextView5).setId(2131363480);
        ((TextView)tuxTextView5).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView5).setMaxLines(1);
        ((TextView)tuxTextView5).setTextColor(resources.getColorStateList(2131099687));
        final ViewGroup$MarginLayoutParams liz9 = b.LIZ((ViewGroup)3Fl2, -2, -1);
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz9)) {
            liz9.setMarginEnd((int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz9)) {
            liz9.rightMargin = (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("SmallText1_Regular"), tuxTextView5, (ViewGroup$LayoutParams)liz9);
        CTM.LIZ((Object)tuxTextView5, (Object)liz9);
        b.LIZ((View)tuxTextView5);
        if (((View)tuxTextView5).getParent() == null) {
            ((ViewGroup)3Fl2).addView((View)tuxTextView5, (ViewGroup$LayoutParams)liz9);
        }
        final AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        ((View)appCompatImageView3).setId(2131364414);
        ((View)appCompatImageView3).setBackgroundColor(resources.getColor(2131099690));
        final ViewGroup$MarginLayoutParams liz10 = b.LIZ((ViewGroup)3Fl2, (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz10)) {
            ((LinearLayout$LayoutParams)liz10).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz10)) {
            ((FrameLayout$LayoutParams)liz10).gravity = 16;
        }
        if (092.d.class.isInstance(liz10)) {
            ((092.d)liz10).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz10)) {
            liz10.setMarginEnd((int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz10)) {
            liz10.rightMargin = (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)appCompatImageView3);
        if (((View)appCompatImageView3).getParent() == null) {
            ((ViewGroup)3Fl2).addView((View)appCompatImageView3, (ViewGroup$LayoutParams)liz10);
        }
        final TuxTextView tuxTextView6 = new TuxTextView(context);
        ((View)tuxTextView6).setId(2131366643);
        ((TextView)tuxTextView6).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView6).setMaxLines(1);
        ((TextView)tuxTextView6).setTextColor(resources.getColorStateList(2131099687));
        final ViewGroup$MarginLayoutParams liz11 = b.LIZ((ViewGroup)3Fl2, -2, (int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz11)) {
            liz11.setMarginEnd((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz11)) {
            liz11.rightMargin = (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("SmallText1_Regular"), tuxTextView6, (ViewGroup$LayoutParams)liz11);
        CTM.LIZ((Object)tuxTextView6, (Object)liz11);
        b.LIZ((View)tuxTextView6);
        if (((View)tuxTextView6).getParent() == null) {
            ((ViewGroup)3Fl2).addView((View)tuxTextView6, (ViewGroup$LayoutParams)liz11);
        }
        final LinearLayout linearLayout5 = new LinearLayout(context);
        ((View)linearLayout5).setId(2131364050);
        linearLayout5.setOrientation(0);
        final ViewGroup$MarginLayoutParams liz12 = b.LIZ((ViewGroup)3Fl2, -2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz12)) {
            liz12.setMarginEnd((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz12)) {
            liz12.rightMargin = (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)linearLayout5);
        if (((View)linearLayout5).getParent() == null) {
            ((ViewGroup)3Fl2).addView((View)linearLayout5, (ViewGroup$LayoutParams)liz12);
        }
        b.LIZ((View)3Fl2);
        if (((View)3Fl2).getParent() == null) {
            ((ViewGroup)linearLayout4).addView((View)3Fl2, (ViewGroup$LayoutParams)linearLayout$LayoutParams9);
        }
        b.LIZ((View)linearLayout4);
        if (((View)linearLayout4).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)linearLayout4, (ViewGroup$LayoutParams)linearLayout$LayoutParams8);
        }
        final LinearLayout linearLayout6 = new LinearLayout(context);
        ((View)linearLayout6).setId(2131363811);
        linearLayout6.setOrientation(0);
        ((View)linearLayout6).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams10 = new LinearLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams10)) {
            linearLayout$LayoutParams10.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams10)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams10).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams10)) {
            ((092.d)linearLayout$LayoutParams10).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams10)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams10).bottomMargin = (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams10)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams10).leftMargin = (int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams10)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams10).setMarginStart((int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams10)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams10).topMargin = (int)TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        linearLayout6.setGravity(16);
        final TuxTextView tuxTextView7 = new TuxTextView(context);
        ((View)tuxTextView7).setId(2131370944);
        ((TextView)tuxTextView7).setTextColor(resources.getColorStateList(2131099687));
        ((View)tuxTextView7).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams11 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams11)) {
            linearLayout$LayoutParams11.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams11)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams11).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams11)) {
            ((092.d)linearLayout$LayoutParams11).LIZ = 16;
        }
        ((TextView)tuxTextView7).setGravity(17);
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("SmallText1_Regular"), tuxTextView7, (ViewGroup$LayoutParams)linearLayout$LayoutParams11);
        CTM.LIZ((Object)tuxTextView7, (Object)linearLayout$LayoutParams11);
        b.LIZ((View)tuxTextView7);
        if (((View)tuxTextView7).getParent() == null) {
            ((ViewGroup)linearLayout6).addView((View)tuxTextView7, (ViewGroup$LayoutParams)linearLayout$LayoutParams11);
        }
        final AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        ((View)appCompatImageView4).setId(2131370935);
        ((View)appCompatImageView4).setBackgroundColor(resources.getColor(2131099690));
        final LinearLayout$LayoutParams linearLayout$LayoutParams12 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams12)) {
            linearLayout$LayoutParams12.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams12)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams12).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams12)) {
            ((092.d)linearLayout$LayoutParams12).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams12)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams12).leftMargin = (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams12)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams12).rightMargin = (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams12)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams12).setMarginStart((int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams12)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams12).setMarginEnd((int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams12)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams12).topMargin = (int)TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        }
        b.LIZ((View)appCompatImageView4);
        if (((View)appCompatImageView4).getParent() == null) {
            ((ViewGroup)linearLayout6).addView((View)appCompatImageView4, (ViewGroup$LayoutParams)linearLayout$LayoutParams12);
        }
        final TuxTextView tuxTextView8 = new TuxTextView(context);
        ((View)tuxTextView8).setId(2131370945);
        ((TextView)tuxTextView8).setMaxLines(1);
        ((TextView)tuxTextView8).setTextColor(resources.getColorStateList(2131099687));
        final LinearLayout$LayoutParams linearLayout$LayoutParams13 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams13)) {
            linearLayout$LayoutParams13.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams13)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams13).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams13)) {
            ((092.d)linearLayout$LayoutParams13).LIZ = 16;
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams13)) {
            linearLayout$LayoutParams13.weight = 1.0f;
        }
        ((TextView)tuxTextView8).setGravity(17);
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("SmallText1_Regular"), tuxTextView8, (ViewGroup$LayoutParams)linearLayout$LayoutParams13);
        CTM.LIZ((Object)tuxTextView8, (Object)linearLayout$LayoutParams13);
        b.LIZ((View)tuxTextView8);
        if (((View)tuxTextView8).getParent() == null) {
            ((ViewGroup)linearLayout6).addView((View)tuxTextView8, (ViewGroup$LayoutParams)linearLayout$LayoutParams13);
        }
        b.LIZ((View)linearLayout6);
        if (((View)linearLayout6).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)linearLayout6, (ViewGroup$LayoutParams)linearLayout$LayoutParams10);
        }
        final TuxTextView tuxTextView9 = new TuxTextView(context);
        ((View)tuxTextView9).setId(2131373142);
        ((TextView)tuxTextView9).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView9).setMaxLines(1);
        ((TextView)tuxTextView9).setMaxWidth((int)TypedValue.applyDimension(1, 215.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView9).setPadding((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)tuxTextView9).getPaddingTop(), ((View)tuxTextView9).getPaddingRight(), ((View)tuxTextView9).getPaddingBottom());
        ((TextView)tuxTextView9).setPadding((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)tuxTextView9).getPaddingTop(), ((View)tuxTextView9).getPaddingRight(), ((View)tuxTextView9).getPaddingBottom());
        ((TextView)tuxTextView9).setPadding(((View)tuxTextView9).getPaddingLeft(), ((View)tuxTextView9).getPaddingTop(), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), ((View)tuxTextView9).getPaddingBottom());
        ((TextView)tuxTextView9).setPadding(((View)tuxTextView9).getPaddingLeft(), ((View)tuxTextView9).getPaddingTop(), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), ((View)tuxTextView9).getPaddingBottom());
        ((TextView)tuxTextView9).setTextColor(resources.getColorStateList(2131099648));
        ((View)tuxTextView9).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams14 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams14)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams14).bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams14)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams14).leftMargin = (int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams14)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams14).setMarginStart((int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams14)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams14).topMargin = (int)TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("SmallText1_Regular"), tuxTextView9, (ViewGroup$LayoutParams)linearLayout$LayoutParams14);
        CTM.LIZ((Object)tuxTextView9, (Object)linearLayout$LayoutParams14);
        b.LIZ((View)tuxTextView9);
        if (((View)tuxTextView9).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView9, (ViewGroup$LayoutParams)linearLayout$LayoutParams14);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)linearLayout2, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(8228);
        return (View)linearLayout;
    }
}
