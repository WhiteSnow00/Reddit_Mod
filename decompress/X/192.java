// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 192 implements 0IF
{
    static {
        Covode.recordClassIndex(1967);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(13135);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        ((View)constraintLayout).setBackgroundColor(resources.getColor(2131099733));
        ((View)constraintLayout).setClickable(true);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        ((View)appCompatImageView).setId(2131366108);
        appCompatImageView.setImageResource(2131231464);
        final ConstraintLayout.a a = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.bottomToTop = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.verticalBias = 0.4f;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.verticalChainStyle = 2;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.topToTop = 0;
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            constraintLayout.addView((View)appCompatImageView, (ViewGroup$LayoutParams)a);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131372326);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099686));
        ((TextView)tuxTextView).setText(2131825443);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToBottom = 2131366108;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.topMargin = (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.bottomToTop = 2131364263;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginStart((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginEnd((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("H3_Bold"), tuxTextView, (ViewGroup$LayoutParams)a2);
        CTM.LIZ((Object)tuxTextView, (Object)a2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout.addView((View)tuxTextView, (ViewGroup$LayoutParams)a2);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((TextView)tuxTextView2).setText(2131825442);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099687));
        ((View)tuxTextView2).setId(2131364263);
        final ConstraintLayout.a a3 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToBottom = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.bottomToBottom = 0;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginStart((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginEnd((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView2).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P1_Regular"), tuxTextView2, (ViewGroup$LayoutParams)a3);
        CTM.LIZ((Object)tuxTextView2, (Object)a3);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            constraintLayout.addView((View)tuxTextView2, (ViewGroup$LayoutParams)a3);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(13135);
        return (View)constraintLayout;
    }
}
