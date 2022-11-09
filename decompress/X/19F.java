// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.widget.ImageView$ScaleType;
import android.widget.FrameLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
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

public final class 19f implements 0IF
{
    static {
        Covode.recordClassIndex(2006);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(10168);
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
        final 05Y 05Y2 = new 05Y(context);
        05Y2.setId(2131363946);
        final ConstraintLayout.a a2 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.orientation = 1;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.guidePercent = 0.17866667f;
        }
        b.LIZ(05Y2);
        if (05Y2.getParent() == null) {
            constraintLayout.addView((View)05Y2, (ViewGroup$LayoutParams)a2);
        }
        final View liz2 = 0I8.LIZ(context, 2131560123, constraintLayout, false, 2131560074);
        liz2.setId(2131367386);
        if (liz2.getParent() == null) {
            constraintLayout.addView(liz2);
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
            a3.setMarginEnd((int)resources.getDimension(2131165750));
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToTop = 2131363920;
        }
        b.LIZ((View)oQg);
        if (((View)oQg).getParent() == null) {
            constraintLayout.addView((View)oQg, (ViewGroup$LayoutParams)a3);
        }
        final View liz3 = 0I8.LIZ(context, 2131560125, constraintLayout, false, 2131560074);
        final ConstraintLayout.a a4 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a4)) {
            a4.bottomMargin = (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.endToStart = 2131362587;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.topToBottom = 2131367386;
        }
        if (liz3.getParent() == null) {
            constraintLayout.addView(liz3, (ViewGroup$LayoutParams)a4);
        }
        final ViewStub viewStub = new ViewStub(context);
        ((View)viewStub).setId(2131370366);
        viewStub.setInflatedId(2131370366);
        viewStub.setLayoutResource(2131560134);
        ((View)viewStub).setBackgroundResource(2131232854);
        ((View)viewStub).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)viewStub).getPaddingTop(), ((View)viewStub).getPaddingRight(), ((View)viewStub).getPaddingBottom());
        ((View)viewStub).setPadding(((View)viewStub).getPaddingLeft(), (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), ((View)viewStub).getPaddingRight(), ((View)viewStub).getPaddingBottom());
        ((View)viewStub).setPadding(((View)viewStub).getPaddingLeft(), ((View)viewStub).getPaddingTop(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)viewStub).getPaddingBottom());
        ((View)viewStub).setPadding(((View)viewStub).getPaddingLeft(), ((View)viewStub).getPaddingTop(), ((View)viewStub).getPaddingRight(), (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        final ConstraintLayout.a a5 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.setMarginStart((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.constrainedWidth = true;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.endToStart = 2131362587;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.horizontalBias = 1.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.startToStart = 2131363946;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.topToBottom = 2131373895;
        }
        b.LIZ((View)viewStub);
        if (((View)viewStub).getParent() == null) {
            constraintLayout.addView((View)viewStub, (ViewGroup$LayoutParams)a5);
        }
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        ((View)appCompatImageView).setId(2131368343);
        appCompatImageView.setVisibility(8);
        ((View)appCompatImageView).setRotationY(180.0f);
        appCompatImageView.setImageResource(2131232900);
        final ConstraintLayout.a a6 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.bottomToBottom = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.startToEnd = 2131363920;
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            constraintLayout.addView((View)appCompatImageView, (ViewGroup$LayoutParams)a6);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131363920);
        ((View)linearLayout).setBackgroundResource(2131232855);
        linearLayout.setOrientation(1);
        final ConstraintLayout.a a7 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a7)) {
            a7.topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.goneTopMargin = (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.constrainedWidth = true;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.endToStart = 2131362587;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.horizontalBias = 1.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.startToStart = 2131363946;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.topToBottom = 2131370366;
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
            constraintLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)a7);
        }
        final View liz4 = 0I8.LIZ(context, 2131560103, constraintLayout, false, 2131560074);
        final ConstraintLayout.a a8 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.startToStart = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.topToBottom = 2131363920;
        }
        if (liz4.getParent() == null) {
            constraintLayout.addView(liz4, (ViewGroup$LayoutParams)a8);
        }
        final View liz5 = 0I8.LIZ(context, 2131560104, constraintLayout, false, 2131560074);
        final ConstraintLayout.a a9 = new ConstraintLayout.a(-2, (int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a9)) {
            a9.setMarginEnd((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(a9)) {
            ((LinearLayout$LayoutParams)a9).gravity = 8388613;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a9)) {
            ((FrameLayout$LayoutParams)a9).gravity = 8388613;
        }
        if (092.d.class.isInstance(a9)) {
            ((092.d)a9).LIZ = 8388613;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.endToEnd = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.topToBottom = 2131367836;
        }
        if (liz5.getParent() == null) {
            constraintLayout.addView(liz5, (ViewGroup$LayoutParams)a9);
        }
        final JTE jte = new JTE(context);
        ((View)jte).setId(2131368216);
        ((View)jte).setVisibility(8);
        final ConstraintLayout.a a10 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a10)) {
            a10.endToEnd = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a10)) {
            a10.topToBottom = 2131367837;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a10)) {
            a10.topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)jte);
        if (((View)jte).getParent() == null) {
            constraintLayout.addView((View)jte, (ViewGroup$LayoutParams)a10);
        }
        final 13t 13t = new 13t(context);
        13t.setId(2131363927);
        final ConstraintLayout.a a11 = new ConstraintLayout.a(-2, -2);
        final a.c c = new a.c("start");
        CTM.LIZ((Object)"app:barrierDirection", (Object)c, (Object)13t, (Object)a11);
        13t.getContext();
        final String liz6 = com.a.b.b.a.LIZ("app:barrierDirection");
        if (liz6.hashCode() == 502579592 && liz6.equals("barrierDirection")) {
            final String liz7 = c.LIZ;
            if (liz7 != null) {
                switch (liz7.hashCode()) {
                    case -1383228885: {
                        if (liz7.equals("bottom")) {
                            13t.setType(3);
                            break;
                        }
                        break;
                    }
                    case 100571: {
                        if (liz7.equals("end")) {
                            13t.setType(6);
                            break;
                        }
                        break;
                    }
                    case 115029: {
                        if (liz7.equals("top")) {
                            13t.setType(2);
                            break;
                        }
                        break;
                    }
                    case 3317767: {
                        if (liz7.equals("left")) {
                            13t.setType(0);
                            break;
                        }
                        break;
                    }
                    case 108511772: {
                        if (liz7.equals("right")) {
                            13t.setType(1);
                            break;
                        }
                        break;
                    }
                    case 109757538: {
                        if (liz7.equals("start")) {
                            13t.setType(5);
                            break;
                        }
                        break;
                    }
                }
            }
        }
        CTM.LIZ((Object)13t, (Object)a11);
        b.LIZ(13t);
        if (13t.getParent() == null) {
            constraintLayout.addView((View)13t, (ViewGroup$LayoutParams)a11);
        }
        final 4fg 4fg = new 4fg(context);
        ((ImageView)4fg).setScaleType(ImageView$ScaleType.FIT_XY);
        ((ImageView)4fg).setVisibility(8);
        ((View)4fg).setId(2131371663);
        final ConstraintLayout.a a12 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(a12)) {
            ((LinearLayout$LayoutParams)a12).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a12)) {
            ((FrameLayout$LayoutParams)a12).gravity = 16;
        }
        if (092.d.class.isInstance(a12)) {
            ((092.d)a12).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a12)) {
            a12.setMarginEnd((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a12)) {
            a12.bottomToBottom = 2131367836;
        }
        if (ConstraintLayout.a.class.isInstance(a12)) {
            a12.endToStart = 2131363927;
        }
        if (ConstraintLayout.a.class.isInstance(a12)) {
            a12.topToTop = 2131373895;
        }
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            constraintLayout.addView((View)4fg, (ViewGroup$LayoutParams)a12);
        }
        final View liz8 = 0I8.LIZ(context, 2131560140, constraintLayout, false, 2131560074);
        final ConstraintLayout.a a13 = new ConstraintLayout.a(-2, (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a13)) {
            a13.setMarginStart((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a13)) {
            a13.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a13)) {
            a13.topToTop = 2131373895;
        }
        if (liz8.getParent() == null) {
            constraintLayout.addView(liz8, (ViewGroup$LayoutParams)a13);
        }
        final View liz9 = 0I8.LIZ(context, 2131560122, constraintLayout, false, 2131560074);
        final ConstraintLayout.a a14 = new ConstraintLayout.a(-1, -2);
        if (ConstraintLayout.a.class.isInstance(a14)) {
            a14.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a14)) {
            a14.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a14)) {
            a14.topToBottom = 2131367836;
        }
        if (liz9.getParent() == null) {
            constraintLayout.addView(liz9, (ViewGroup$LayoutParams)a14);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(10168);
        return (View)constraintLayout;
    }
}
