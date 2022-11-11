// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.widget.LinearLayout;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
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

public final class 19d implements 0IF
{
    static {
        Covode.recordClassIndex(2004);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(13156);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ((View)constraintLayout).setPadding(((View)constraintLayout).getPaddingLeft(), ((View)constraintLayout).getPaddingTop(), ((View)constraintLayout).getPaddingRight(), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        ((View)constraintLayout).setPadding(((View)constraintLayout).getPaddingLeft(), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), ((View)constraintLayout).getPaddingRight(), ((View)constraintLayout).getPaddingBottom());
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final 05Y 05Y = new 05Y(context);
        05Y.setId(2131362587);
        final ConstraintLayout.a a = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.orientation = 1;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.guideEnd = (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
        }
        b.LIZ(05Y);
        if (05Y.getParent() == null) {
            constraintLayout.addView((View)05Y, (ViewGroup$LayoutParams)a);
        }
        final View liz2 = 0I8.LIZ(context, 2131560123, constraintLayout, false, 2131560068);
        liz2.setId(2131367386);
        if (liz2.getParent() == null) {
            constraintLayout.addView(liz2);
        }
        final OQg oQg = new OQg(context);
        ((View)oQg).setId(2131362592);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.leftMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginEnd((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.rightMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginEnd((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToTop = 2131373895;
        }
        b.LIZ((View)oQg);
        if (((View)oQg).getParent() == null) {
            constraintLayout.addView((View)oQg, (ViewGroup$LayoutParams)a2);
        }
        final View liz3 = 0I8.LIZ(context, 2131560125, constraintLayout, false, 2131560068);
        liz3.setId(2131373895);
        final ConstraintLayout.a a3 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.endToStart = 2131362587;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToBottom = 2131367386;
        }
        if (liz3.getParent() == null) {
            constraintLayout.addView(liz3, (ViewGroup$LayoutParams)a3);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373580);
        ((View)tuxTextView).setVisibility(8);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968679 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final ConstraintLayout.a a4 = new ConstraintLayout.a(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView, (ViewGroup$LayoutParams)a4);
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.endToStart = 2131362587;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.topToBottom = 2131373895;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.bottomToTop = 2131363954;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a4)) {
            a4.bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        CTM.LIZ((Object)tuxTextView, (Object)a4);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout.addView((View)tuxTextView, (ViewGroup$LayoutParams)a4);
        }
        final View liz4 = 0I8.LIZ(context, 2131560050, constraintLayout, false, 2131560068);
        liz4.setId(2131363954);
        final ConstraintLayout.a a5 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 180.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 320.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.endToStart = 2131362587;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.topToBottom = 2131373580;
        }
        if (liz4.getParent() == null) {
            constraintLayout.addView(liz4, (ViewGroup$LayoutParams)a5);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131370655);
        final ConstraintLayout.a a6 = new ConstraintLayout.a(-2, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.topToTop = 2131363954;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.bottomToBottom = 2131363954;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.endToStart = 2131363954;
        }
        final 4fg 4fg = new 4fg(context);
        ((ImageView)4fg).setScaleType(ImageView$ScaleType.FIT_XY);
        ((ImageView)4fg).setVisibility(8);
        ((View)4fg).setId(2131371663);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).setMarginEnd((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        0I8.LIZ(context, 2131559978, (ViewGroup)linearLayout, true, 0);
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            constraintLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)a6);
        }
        final View liz5 = 0I8.LIZ(context, 2131560103, constraintLayout, false, 2131560068);
        final ConstraintLayout.a a7 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.startToStart = 2131363954;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.topToBottom = 2131363954;
        }
        if (liz5.getParent() == null) {
            constraintLayout.addView(liz5, (ViewGroup$LayoutParams)a7);
        }
        final View liz6 = 0I8.LIZ(context, 2131560104, constraintLayout, false, 2131560068);
        final ConstraintLayout.a a8 = new ConstraintLayout.a(-2, (int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a8)) {
            a8.setMarginEnd((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.endToEnd = 2131363954;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.topToBottom = 2131367836;
        }
        if (liz6.getParent() == null) {
            constraintLayout.addView(liz6, (ViewGroup$LayoutParams)a8);
        }
        final JTE jte = new JTE(context);
        ((View)jte).setId(2131368216);
        ((View)jte).setVisibility(8);
        final ConstraintLayout.a a9 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.endToEnd = 2131363954;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.topToBottom = 2131367837;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a9)) {
            a9.topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)jte);
        if (((View)jte).getParent() == null) {
            constraintLayout.addView((View)jte, (ViewGroup$LayoutParams)a9);
        }
        final View liz7 = 0I8.LIZ(context, 2131560140, constraintLayout, false, 2131560068);
        final ConstraintLayout.a a10 = new ConstraintLayout.a(-2, (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a10)) {
            a10.setMarginStart((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a10)) {
            a10.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a10)) {
            a10.topToTop = 2131373895;
        }
        if (liz7.getParent() == null) {
            constraintLayout.addView(liz7, (ViewGroup$LayoutParams)a10);
        }
        final View liz8 = 0I8.LIZ(context, 2131560122, constraintLayout, false, 2131560068);
        final ConstraintLayout.a a11 = new ConstraintLayout.a(-1, -2);
        if (ConstraintLayout.a.class.isInstance(a11)) {
            a11.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a11)) {
            a11.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a11)) {
            a11.topToBottom = 2131367836;
        }
        if (liz8.getParent() == null) {
            constraintLayout.addView(liz8, (ViewGroup$LayoutParams)a11);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(13156);
        return (View)constraintLayout;
    }
}
