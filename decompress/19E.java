// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.widget.FrameLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tux.input.TuxTextView;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.view.ViewStub;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19e implements 0IF
{
    static {
        Covode.recordClassIndex(2005);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(10182);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ((View)constraintLayout).setPadding(((View)constraintLayout).getPaddingLeft(), ((View)constraintLayout).getPaddingTop(), ((View)constraintLayout).getPaddingRight(), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        ((View)constraintLayout).setPadding(((View)constraintLayout).getPaddingLeft(), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), ((View)constraintLayout).getPaddingRight(), ((View)constraintLayout).getPaddingBottom());
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final 05Y 05Y = new 05Y(context);
        05Y.setId(2131363946);
        final ConstraintLayout.a a = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.orientation = 1;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.guidePercent = 0.82133335f;
        }
        b.LIZ(05Y);
        if (05Y.getParent() == null) {
            constraintLayout.addView((View)05Y, (ViewGroup$LayoutParams)a);
        }
        final View liz2 = 0I8.LIZ(context, 2131560123, constraintLayout, false, 2131560073);
        liz2.setId(2131367386);
        if (liz2.getParent() == null) {
            constraintLayout.addView(liz2);
        }
        final View liz3 = 0I8.LIZ(context, 2131560139, constraintLayout, false, 2131560073);
        liz3.setId(2131367442);
        final ConstraintLayout.a a2 = new ConstraintLayout.a(-2, (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginStart((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToTop = 2131373895;
        }
        if (liz3.getParent() == null) {
            constraintLayout.addView(liz3, (ViewGroup$LayoutParams)a2);
        }
        final OQg oQg = new OQg(context);
        ((View)oQg).setId(2131362592);
        final ConstraintLayout.a a3 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginEnd((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.rightMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginStart((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.startToEnd = 2131367442;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToTop = 2131363920;
        }
        b.LIZ((View)oQg);
        if (((View)oQg).getParent() == null) {
            constraintLayout.addView((View)oQg, (ViewGroup$LayoutParams)a3);
        }
        final View liz4 = 0I8.LIZ(context, 2131560125, constraintLayout, false, 2131560073);
        final ConstraintLayout.a a4 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a4)) {
            a4.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.startToStart = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.topToBottom = 2131367386;
        }
        if (liz4.getParent() == null) {
            constraintLayout.addView(liz4, (ViewGroup$LayoutParams)a4);
        }
        final ViewStub viewStub = new ViewStub(context);
        ((View)viewStub).setId(2131370366);
        viewStub.setInflatedId(2131370366);
        viewStub.setLayoutResource(2131560133);
        ((View)viewStub).setBackgroundResource(2131232853);
        ((View)viewStub).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)viewStub).getPaddingTop(), ((View)viewStub).getPaddingRight(), ((View)viewStub).getPaddingBottom());
        ((View)viewStub).setPadding(((View)viewStub).getPaddingLeft(), (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), ((View)viewStub).getPaddingRight(), ((View)viewStub).getPaddingBottom());
        ((View)viewStub).setPadding(((View)viewStub).getPaddingLeft(), ((View)viewStub).getPaddingTop(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)viewStub).getPaddingBottom());
        ((View)viewStub).setPadding(((View)viewStub).getPaddingLeft(), ((View)viewStub).getPaddingTop(), ((View)viewStub).getPaddingRight(), (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        final ConstraintLayout.a a5 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.setMarginEnd((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.constrainedWidth = true;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.endToEnd = 2131363946;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.horizontalBias = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.startToEnd = 2131362592;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.topToBottom = 2131373895;
        }
        b.LIZ((View)viewStub);
        if (((View)viewStub).getParent() == null) {
            constraintLayout.addView((View)viewStub, (ViewGroup$LayoutParams)a5);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131363920);
        ((View)linearLayout).setBackgroundResource(2131232853);
        linearLayout.setOrientation(1);
        final ConstraintLayout.a a6 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a6)) {
            a6.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a6)) {
            a6.topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.goneTopMargin = (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.constrainedWidth = true;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.endToEnd = 2131363946;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.horizontalBias = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.startToEnd = 2131362592;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.topToBottom = 2131370366;
        }
        final 4x1 4x1 = new 4x1(context);
        ((View)4x1).setId(2131368345);
        ((TextView)4x1).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968672 });
        ((TextView)4x1).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((View)4x1).setLongClickable(false);
        ((View)4x1).setClickable(false);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("H3_Regular"), (TuxTextView)4x1, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)4x1, (Object)linearLayout$LayoutParams);
        b.LIZ((View)4x1);
        if (((View)4x1).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4x1, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            constraintLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)a6);
        }
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        ((View)appCompatImageView).setId(2131368343);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageResource(2131232900);
        final ConstraintLayout.a a7 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.bottomToBottom = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.endToStart = 2131363920;
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            constraintLayout.addView((View)appCompatImageView, (ViewGroup$LayoutParams)a7);
        }
        final View liz5 = 0I8.LIZ(context, 2131560103, constraintLayout, false, 2131560073);
        final ConstraintLayout.a a8 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a8)) {
            a8.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.startToEnd = 2131362592;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.topToBottom = 2131363920;
        }
        if (liz5.getParent() == null) {
            constraintLayout.addView(liz5, (ViewGroup$LayoutParams)a8);
        }
        final View liz6 = 0I8.LIZ(context, 2131560104, constraintLayout, false, 2131560073);
        final ConstraintLayout.a a9 = new ConstraintLayout.a(-2, (int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a9)) {
            a9.setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(a9)) {
            ((LinearLayout$LayoutParams)a9).gravity = 8388611;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a9)) {
            ((FrameLayout$LayoutParams)a9).gravity = 8388611;
        }
        if (092.d.class.isInstance(a9)) {
            ((092.d)a9).LIZ = 8388611;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.startToStart = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.topToBottom = 2131363920;
        }
        if (liz6.getParent() == null) {
            constraintLayout.addView(liz6, (ViewGroup$LayoutParams)a9);
        }
        final View liz7 = 0I8.LIZ(context, 2131560122, constraintLayout, false, 2131560073);
        final ConstraintLayout.a a10 = new ConstraintLayout.a(-1, -2);
        if (ConstraintLayout.a.class.isInstance(a10)) {
            a10.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a10)) {
            a10.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a10)) {
            a10.topToBottom = 2131367836;
        }
        if (liz7.getParent() == null) {
            constraintLayout.addView(liz7, (ViewGroup$LayoutParams)a10);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(10182);
        return (View)constraintLayout;
    }
}
