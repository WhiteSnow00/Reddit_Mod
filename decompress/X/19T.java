// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19t implements 0IF
{
    static {
        Covode.recordClassIndex(2020);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(3641);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ((View)constraintLayout).setPadding(((View)constraintLayout).getPaddingLeft(), ((View)constraintLayout).getPaddingTop(), ((View)constraintLayout).getPaddingRight(), (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        constraintLayout.setId(2131370643);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final View liz2 = 0I8.LIZ(context, 2131560342, constraintLayout, false, 2131560339);
        liz2.setId(2131365957);
        final ConstraintLayout.a a = new ConstraintLayout.a(-1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.setMarginStart((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.leftMargin = (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.setMarginEnd((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.rightMargin = (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (liz2.getParent() == null) {
            constraintLayout.addView(liz2, (ViewGroup$LayoutParams)a);
        }
        final 052 052 = new 052(context);
        ((View)052).setId(2131374025);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 376.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 376.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.bottomToTop = 2131371640;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.leftToLeft = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.rightToRight = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToBottom = 2131365957;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.verticalBias = 0.4f;
        }
        b.LIZ((View)052);
        if (((View)052).getParent() == null) {
            constraintLayout.addView((View)052, (ViewGroup$LayoutParams)a2);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131371640);
        ((AppCompatTextView)tuxTextView).setBackgroundResource(2131231388);
        ((TextView)tuxTextView).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView).setText(2131828049);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        ((View)tuxTextView).setVisibility(4);
        final ConstraintLayout.a a3 = new ConstraintLayout.a(-1, (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(a3)) {
            ((LinearLayout$LayoutParams)a3).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a3)) {
            ((FrameLayout$LayoutParams)a3).gravity = 17;
        }
        if (092.d.class.isInstance(a3)) {
            ((092.d)a3).LIZ = 17;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginStart((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginEnd((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.rightMargin = (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView).setGravity(17);
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.bottomToBottom = 0;
        }
        new k().LIZ("app:tux_font", (a)new a.c("H4_Bold"), tuxTextView, (ViewGroup$LayoutParams)a3);
        CTM.LIZ((Object)tuxTextView, (Object)a3);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout.addView((View)tuxTextView, (ViewGroup$LayoutParams)a3);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(3641);
        return (View)constraintLayout;
    }
}
