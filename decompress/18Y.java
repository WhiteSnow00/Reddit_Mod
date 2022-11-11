// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.Resources;
import android.widget.LinearLayout;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$MarginLayoutParams;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18y implements 0IF
{
    static {
        Covode.recordClassIndex(1963);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(12529);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, (int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        final Aq5 aq5 = new Aq5(context);
        ((View)aq5).setId(2131368228);
        ((View)aq5).setVisibility(8);
        final ConstraintLayout.a a = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.topToTop = 0;
        }
        b.LIZ((View)aq5);
        if (((View)aq5).getParent() == null) {
            constraintLayout.addView((View)aq5, (ViewGroup$LayoutParams)a);
        }
        final SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        ((View)smartAvatarImageView).setId(2131366771);
        ((ImageView)smartAvatarImageView).setVisibility(8);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToTop = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.bottomToBottom = 0;
        }
        b.LIZ((View)smartAvatarImageView);
        if (((View)smartAvatarImageView).getParent() == null) {
            constraintLayout.addView((View)smartAvatarImageView, (ViewGroup$LayoutParams)a2);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373139);
        ((TextView)tuxTextView).setMaxLines(1);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((View)tuxTextView).setTextAlignment(5);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        ((AppCompatTextView)tuxTextView).setAutoSizeTextTypeWithDefaults(1);
        final ConstraintLayout.a a3 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        ((TextView)tuxTextView).setGravity(8388627);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginEnd((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.goneStartMargin = (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (a)new a.c("H4_Regular"), tuxTextView, (ViewGroup$LayoutParams)a3);
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.startToEnd = 2131366771;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.endToStart = 2131367845;
        }
        ((AppCompatTextView)tuxTextView).setAutoSizeTextTypeUniformWithConfiguration(10, 15, 1, 1);
        CTM.LIZ((Object)tuxTextView, (Object)a3);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout.addView((View)tuxTextView, (ViewGroup$LayoutParams)a3);
        }
        final View view = new View(context);
        view.setId(2131373972);
        final ConstraintLayout.a a4 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.endToEnd = 2131373139;
        }
        b.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, (ViewGroup$LayoutParams)a4);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131367845);
        linearLayout.setOrientation(0);
        final ConstraintLayout.a a5 = new ConstraintLayout.a(-2, -2);
        linearLayout.setGravity(16);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.setMarginEnd((int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.topToTop = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.bottomToBottom = 0;
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            constraintLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)a5);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(12529);
        return (View)constraintLayout;
    }
}
