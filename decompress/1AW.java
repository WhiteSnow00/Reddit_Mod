// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.TypedValue;
import android.view.b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1AW implements 0IF
{
    static {
        Covode.recordClassIndex(2059);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(8640);
        final Resources resources = context.getResources();
        final TopViewSkipButton topViewSkipButton = new TopViewSkipButton(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final View view = new View(context);
        view.setId(2131373973);
        view.setClickable(true);
        view.setFocusable(true);
        view.setVisibility(8);
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)topViewSkipButton, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(liz2)) {
            ((ConstraintLayout.a)liz2).leftToLeft = 2131373543;
        }
        if (ConstraintLayout.a.class.isInstance(liz2)) {
            ((ConstraintLayout.a)liz2).rightToRight = 0;
        }
        if (ConstraintLayout.a.class.isInstance(liz2)) {
            ((ConstraintLayout.a)liz2).topToTop = 0;
        }
        b.LIZ(view);
        if (view.getParent() == null) {
            ((ViewGroup)topViewSkipButton).addView(view, (ViewGroup$LayoutParams)liz2);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373543);
        ((AppCompatTextView)tuxTextView).setBackgroundResource(2131233734);
        ((TextView)tuxTextView).setPadding((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setText(2131834738);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099667));
        final ViewGroup$MarginLayoutParams liz3 = b.LIZ((ViewGroup)topViewSkipButton, -2, (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz3)) {
            ((LinearLayout$LayoutParams)liz3).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz3)) {
            ((FrameLayout$LayoutParams)liz3).gravity = 17;
        }
        if (092.d.class.isInstance(liz3)) {
            ((092.d)liz3).LIZ = 17;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz3)) {
            liz3.topMargin = (int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz3)) {
            liz3.rightMargin = (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView).setGravity(17);
        if (ConstraintLayout.a.class.isInstance(liz3)) {
            ((ConstraintLayout.a)liz3).rightToRight = 0;
        }
        if (ConstraintLayout.a.class.isInstance(liz3)) {
            ((ConstraintLayout.a)liz3).topToTop = 0;
        }
        new k().LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView, (ViewGroup$LayoutParams)liz3);
        CTM.LIZ((Object)tuxTextView, (Object)liz3);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)topViewSkipButton).addView((View)tuxTextView, (ViewGroup$LayoutParams)liz3);
        }
        final View view2 = new View(context);
        view2.setId(2131362635);
        view2.setClickable(true);
        view2.setFocusable(true);
        final ViewGroup$MarginLayoutParams liz4 = b.LIZ((ViewGroup)topViewSkipButton, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(liz4)) {
            ((ConstraintLayout.a)liz4).startToStart = 2131373543;
        }
        if (ConstraintLayout.a.class.isInstance(liz4)) {
            ((ConstraintLayout.a)liz4).endToEnd = 2131373543;
        }
        if (ConstraintLayout.a.class.isInstance(liz4)) {
            ((ConstraintLayout.a)liz4).bottomToBottom = 2131373543;
        }
        if (ConstraintLayout.a.class.isInstance(liz4)) {
            ((ConstraintLayout.a)liz4).topToTop = 2131373543;
        }
        b.LIZ(view2);
        if (view2.getParent() == null) {
            ((ViewGroup)topViewSkipButton).addView(view2, (ViewGroup$LayoutParams)liz4);
        }
        b.LIZ((View)topViewSkipButton);
        ((View)topViewSkipButton).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)topViewSkipButton);
        }
        MethodCollector.o(8640);
        return (View)topViewSkipButton;
    }
}
