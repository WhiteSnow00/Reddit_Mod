// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import android.widget.ImageView$ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import com.ss.android.ugc.aweme.base.ui.b.a;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18o implements 0IF
{
    static {
        Covode.recordClassIndex(1953);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(10589);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(2131368243);
        ((View)constraintLayout).setBackgroundResource(2131231767);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()));
        final Rhg rhg = new Rhg(context);
        ((View)rhg).setId(2131368258);
        final ConstraintLayout.a a = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.leftMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.topToTop = 0;
        }
        final a a2 = new a();
        a2.LIZ("app:placeholderImage", (com.a.b.a.a)new com.a.b.a.a.b("2131099752", "color"), rhg, (ViewGroup$LayoutParams)a);
        a2.LIZ("app:roundedCornerRadius", (com.a.b.a.a)new com.a.b.a.a.d("2", "dp"), rhg, (ViewGroup$LayoutParams)a);
        CTM.LIZ((Object)rhg, (Object)a);
        a2.LIZ.LIZ((SE3)rhg, (ViewGroup$LayoutParams)a);
        b.LIZ((View)rhg);
        if (((View)rhg).getParent() == null) {
            constraintLayout.addView((View)rhg, (ViewGroup$LayoutParams)a);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131368259);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setMaxLines(2);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        final ConstraintLayout.a a3 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.startToEnd = 2131368258;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToTop = 0;
        }
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("P1_Regular"), tuxTextView, (ViewGroup$LayoutParams)a3);
        CTM.LIZ((Object)tuxTextView, (Object)a3);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout.addView((View)tuxTextView, (ViewGroup$LayoutParams)a3);
        }
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        ((View)appCompatImageView).setId(2131368256);
        appCompatImageView.setScaleType(ImageView$ScaleType.CENTER);
        appCompatImageView.setImageResource(2131231759);
        final ConstraintLayout.a a4 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.startToEnd = 2131368259;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.topToTop = 0;
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            constraintLayout.addView((View)appCompatImageView, (ViewGroup$LayoutParams)a4);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131368255);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099758));
        final ConstraintLayout.a a5 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.setMarginStart((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.leftMargin = (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.bottomMargin = (int)TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.startToEnd = 2131368258;
        }
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("SmallText1_Regular"), tuxTextView2, (ViewGroup$LayoutParams)a5);
        CTM.LIZ((Object)tuxTextView2, (Object)a5);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            constraintLayout.addView((View)tuxTextView2, (ViewGroup$LayoutParams)a5);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131368257);
        ((TextView)tuxTextView3).setText(2131825861);
        ((TextView)tuxTextView3).setTextColor(resources.getColorStateList(2131099685));
        final ConstraintLayout.a a6 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a6)) {
            a6.bottomMargin = (int)TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a6)) {
            a6.setMarginEnd((int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a6)) {
            a6.rightMargin = (int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.endToEnd = 0;
        }
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("P3_Regular"), tuxTextView3, (ViewGroup$LayoutParams)a6);
        CTM.LIZ((Object)tuxTextView3, (Object)a6);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            constraintLayout.addView((View)tuxTextView3, (ViewGroup$LayoutParams)a6);
        }
        final AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageResource(2131231758);
        final ConstraintLayout.a a7 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a7)) {
            a7.bottomMargin = (int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a7)) {
            a7.setMarginEnd((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a7)) {
            a7.leftMargin = (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a7)) {
            a7.rightMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a7)) {
            a7.setMarginStart((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.leftToRight = 2131368257;
        }
        b.LIZ((View)appCompatImageView2);
        if (((View)appCompatImageView2).getParent() == null) {
            constraintLayout.addView((View)appCompatImageView2, (ViewGroup$LayoutParams)a7);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(10589);
        return (View)constraintLayout;
    }
}
