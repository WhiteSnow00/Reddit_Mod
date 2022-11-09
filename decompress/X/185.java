// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.b;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 185 implements 0IF
{
    static {
        Covode.recordClassIndex(1908);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(14390);
        final Resources resources = context.getResources();
        if (viewGroup != null && b) {
            final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            ((View)appCompatImageView).setId(2131362650);
            08l.LIZ(appCompatImageView, resources.getColorStateList(2131099752));
            appCompatImageView.setImageResource(2131231603);
            final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics()));
            if (ConstraintLayout.a.class.isInstance(liz)) {
                ((ConstraintLayout.a)liz).bottomToBottom = 2131371007;
            }
            if (ConstraintLayout.a.class.isInstance(liz)) {
                ((ConstraintLayout.a)liz).endToEnd = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz)) {
                ((ConstraintLayout.a)liz).topToTop = 0;
            }
            b.LIZ((View)appCompatImageView);
            if (((View)appCompatImageView).getParent() == null) {
                viewGroup.addView((View)appCompatImageView, (ViewGroup$LayoutParams)liz);
            }
            final TuxTextView tuxTextView = new TuxTextView(context);
            ((View)tuxTextView).setId(2131371000);
            ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
            ((TextView)tuxTextView).setMaxLines(1);
            ((View)tuxTextView).setTextAlignment(6);
            ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099758));
            final ViewGroup$MarginLayoutParams liz2 = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
            if (LinearLayout$LayoutParams.class.isInstance(liz2)) {
                ((LinearLayout$LayoutParams)liz2).gravity = 8388613;
            }
            if (FrameLayout$LayoutParams.class.isInstance(liz2)) {
                ((FrameLayout$LayoutParams)liz2).gravity = 8388613;
            }
            if (092.d.class.isInstance(liz2)) {
                ((092.d)liz2).LIZ = 8388613;
            }
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz2)) {
                liz2.setMarginEnd((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
            }
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz2)) {
                liz2.leftMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
            }
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz2)) {
                liz2.rightMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
            }
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz2)) {
                liz2.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
            }
            if (LinearLayout$LayoutParams.class.isInstance(liz2)) {
                ((LinearLayout$LayoutParams)liz2).weight = 1.0f;
            }
            if (ConstraintLayout.a.class.isInstance(liz2)) {
                ((ConstraintLayout.a)liz2).bottomToBottom = 2131371007;
            }
            if (ConstraintLayout.a.class.isInstance(liz2)) {
                ((ConstraintLayout.a)liz2).endToStart = 2131371002;
            }
            if (ConstraintLayout.a.class.isInstance(liz2)) {
                ((ConstraintLayout.a)liz2).leftToRight = 2131371007;
            }
            if (ConstraintLayout.a.class.isInstance(liz2)) {
                ((ConstraintLayout.a)liz2).rightToLeft = 2131371002;
            }
            if (ConstraintLayout.a.class.isInstance(liz2)) {
                ((ConstraintLayout.a)liz2).startToEnd = 2131371007;
            }
            if (ConstraintLayout.a.class.isInstance(liz2)) {
                ((ConstraintLayout.a)liz2).topToTop = 2131371007;
            }
            new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView, (ViewGroup$LayoutParams)liz2);
            CTM.LIZ((Object)tuxTextView, (Object)liz2);
            b.LIZ((View)tuxTextView);
            if (((View)tuxTextView).getParent() == null) {
                viewGroup.addView((View)tuxTextView, (ViewGroup$LayoutParams)liz2);
            }
            final TuxTextView tuxTextView2 = new TuxTextView(context);
            ((View)tuxTextView2).setId(2131371002);
            ((TextView)tuxTextView2).setMaxWidth((int)TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()));
            ((TextView)tuxTextView2).setEllipsize(TextUtils$TruncateAt.END);
            ((TextView)tuxTextView2).setMaxLines(1);
            ((View)tuxTextView2).setTextAlignment(6);
            ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099750));
            ((View)tuxTextView2).setVisibility(8);
            final ViewGroup$MarginLayoutParams liz3 = b.LIZ(viewGroup, -2, -2);
            if (LinearLayout$LayoutParams.class.isInstance(liz3)) {
                ((LinearLayout$LayoutParams)liz3).gravity = 8388613;
            }
            if (FrameLayout$LayoutParams.class.isInstance(liz3)) {
                ((FrameLayout$LayoutParams)liz3).gravity = 8388613;
            }
            if (092.d.class.isInstance(liz3)) {
                ((092.d)liz3).LIZ = 8388613;
            }
            if (LinearLayout$LayoutParams.class.isInstance(liz3)) {
                ((LinearLayout$LayoutParams)liz3).weight = 1.0f;
            }
            if (ConstraintLayout.a.class.isInstance(liz3)) {
                ((ConstraintLayout.a)liz3).endToStart = 2131362650;
            }
            if (ConstraintLayout.a.class.isInstance(liz3)) {
                ((ConstraintLayout.a)liz3).leftToRight = 2131371000;
            }
            if (ConstraintLayout.a.class.isInstance(liz3)) {
                ((ConstraintLayout.a)liz3).rightToLeft = 2131362650;
            }
            if (ConstraintLayout.a.class.isInstance(liz3)) {
                ((ConstraintLayout.a)liz3).startToEnd = 2131371000;
            }
            if (ConstraintLayout.a.class.isInstance(liz3)) {
                ((ConstraintLayout.a)liz3).bottomToBottom = 2131371007;
            }
            if (ConstraintLayout.a.class.isInstance(liz3)) {
                ((ConstraintLayout.a)liz3).topToTop = 2131371007;
            }
            new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), tuxTextView2, (ViewGroup$LayoutParams)liz3);
            CTM.LIZ((Object)tuxTextView2, (Object)liz3);
            b.LIZ((View)tuxTextView2);
            if (((View)tuxTextView2).getParent() == null) {
                viewGroup.addView((View)tuxTextView2, (ViewGroup$LayoutParams)liz3);
            }
            final TuxTextView tuxTextView3 = new TuxTextView(context);
            ((View)tuxTextView3).setId(2131371007);
            ((TextView)tuxTextView3).setTextColor(resources.getColorStateList(2131099750));
            final ViewGroup$MarginLayoutParams liz4 = b.LIZ(viewGroup, -2, -2);
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz4)) {
                liz4.setMarginEnd((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
            }
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz4)) {
                liz4.rightMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
            }
            new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), tuxTextView3, (ViewGroup$LayoutParams)liz4);
            if (ConstraintLayout.a.class.isInstance(liz4)) {
                ((ConstraintLayout.a)liz4).startToStart = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz4)) {
                ((ConstraintLayout.a)liz4).topToTop = 0;
            }
            CTM.LIZ((Object)tuxTextView3, (Object)liz4);
            b.LIZ((View)tuxTextView3);
            if (((View)tuxTextView3).getParent() == null) {
                viewGroup.addView((View)tuxTextView3, (ViewGroup$LayoutParams)liz4);
            }
            final TuxTextView tuxTextView4 = new TuxTextView(context);
            ((View)tuxTextView4).setId(2131371006);
            ((TextView)tuxTextView4).setTextColor(resources.getColorStateList(2131099758));
            ((View)tuxTextView4).setVisibility(8);
            final ViewGroup$MarginLayoutParams liz5 = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz5)) {
                liz5.topMargin = (int)TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
            }
            if (ConstraintLayout.a.class.isInstance(liz5)) {
                ((ConstraintLayout.a)liz5).endToEnd = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz5)) {
                ((ConstraintLayout.a)liz5).rightToRight = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz5)) {
                ((ConstraintLayout.a)liz5).startToStart = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz5)) {
                ((ConstraintLayout.a)liz5).topToBottom = 2131371007;
            }
            new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView4, (ViewGroup$LayoutParams)liz5);
            CTM.LIZ((Object)tuxTextView4, (Object)liz5);
            b.LIZ((View)tuxTextView4);
            if (((View)tuxTextView4).getParent() == null) {
                viewGroup.addView((View)tuxTextView4, (ViewGroup$LayoutParams)liz5);
            }
            final TuxTextView tuxTextView5 = new TuxTextView(context);
            ((View)tuxTextView5).setId(2131371005);
            ((TextView)tuxTextView5).setTextColor(resources.getColorStateList(2131099757));
            ((View)tuxTextView5).setVisibility(8);
            ((TextView)tuxTextView5).setPadding((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
            ((AppCompatTextView)tuxTextView5).setBackgroundResource(2131231556);
            final ViewGroup$MarginLayoutParams liz6 = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz6)) {
                liz6.topMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
            }
            if (ConstraintLayout.a.class.isInstance(liz6)) {
                ((ConstraintLayout.a)liz6).endToEnd = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz6)) {
                ((ConstraintLayout.a)liz6).rightToRight = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz6)) {
                ((ConstraintLayout.a)liz6).startToStart = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz6)) {
                ((ConstraintLayout.a)liz6).topToBottom = 2131371006;
            }
            new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView5, (ViewGroup$LayoutParams)liz6);
            CTM.LIZ((Object)tuxTextView5, (Object)liz6);
            b.LIZ((View)tuxTextView5);
            if (((View)tuxTextView5).getParent() == null) {
                viewGroup.addView((View)tuxTextView5, (ViewGroup$LayoutParams)liz6);
            }
            final TuxTextView tuxTextView6 = new TuxTextView(context);
            ((View)tuxTextView6).setId(2131371001);
            ((TextView)tuxTextView6).setTextColor(resources.getColorStateList(2131099758));
            ((View)tuxTextView6).setVisibility(8);
            final ViewGroup$MarginLayoutParams liz7 = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz7)) {
                liz7.topMargin = (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
            }
            if (ConstraintLayout.a.class.isInstance(liz7)) {
                ((ConstraintLayout.a)liz7).endToEnd = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz7)) {
                ((ConstraintLayout.a)liz7).rightToRight = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz7)) {
                ((ConstraintLayout.a)liz7).startToStart = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz7)) {
                ((ConstraintLayout.a)liz7).topToBottom = 2131371005;
            }
            new k().LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView6, (ViewGroup$LayoutParams)liz7);
            CTM.LIZ((Object)tuxTextView6, (Object)liz7);
            b.LIZ((View)tuxTextView6);
            if (((View)tuxTextView6).getParent() == null) {
                viewGroup.addView((View)tuxTextView6, (ViewGroup$LayoutParams)liz7);
            }
            final 43K 43K = new 43K(context);
            ((View)43K).setId(2131371004);
            ((View)43K).setVisibility(8);
            final ViewGroup$MarginLayoutParams liz8 = b.LIZ(viewGroup, -1, -2);
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz8)) {
                liz8.topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
            }
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz8)) {
                liz8.bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
            }
            if (ConstraintLayout.a.class.isInstance(liz8)) {
                ((ConstraintLayout.a)liz8).startToStart = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz8)) {
                ((ConstraintLayout.a)liz8).endToEnd = 0;
            }
            if (ConstraintLayout.a.class.isInstance(liz8)) {
                ((ConstraintLayout.a)liz8).topToBottom = 2131371007;
            }
            b.LIZ((View)43K);
            if (((View)43K).getParent() == null) {
                viewGroup.addView((View)43K, (ViewGroup$LayoutParams)liz8);
            }
            MethodCollector.o(14390);
            return (View)viewGroup;
        }
        final IllegalStateException ex = new IllegalStateException("merge tag container should not be null attach should not be false");
        MethodCollector.o(14390);
        throw ex;
    }
}
