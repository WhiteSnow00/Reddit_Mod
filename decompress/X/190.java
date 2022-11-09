// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.content.res.Resources;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.util.TypedValue;
import com.bytedance.tux.input.TuxTextView;
import android.view.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 190 implements 0IF
{
    static {
        Covode.recordClassIndex(1965);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(6635);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(2131374306);
        ((View)constraintLayout).setBackgroundColor(resources.getColor(2131099655));
        ((View)constraintLayout).setFocusable(false);
        ((View)constraintLayout).setFocusableInTouchMode(false);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131366448);
        ((View)tuxTextView).setFocusable(false);
        ((View)tuxTextView).setFocusableInTouchMode(false);
        ((TextView)tuxTextView).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView).setText(2131825440);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        final ConstraintLayout.a a = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.bottomToTop = 2131368984;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.topToTop = 0;
        }
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView, (ViewGroup$LayoutParams)a);
        CTM.LIZ((Object)tuxTextView, (Object)a);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout.addView((View)tuxTextView, (ViewGroup$LayoutParams)a);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131368984);
        ((AppCompatTextView)tuxTextView2).setBackgroundResource(2131231708);
        ((TextView)tuxTextView2).setText(2131825444);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099685));
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginStart((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginEnd((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.bottomMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView2).setGravity(17);
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToBottom = 2131366448;
        }
        new k().LIZ("app:tux_font", (a)new a.c("P1_Semibold"), tuxTextView2, (ViewGroup$LayoutParams)a2);
        CTM.LIZ((Object)tuxTextView2, (Object)a2);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            constraintLayout.addView((View)tuxTextView2, (ViewGroup$LayoutParams)a2);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(6635);
        return (View)constraintLayout;
    }
}
