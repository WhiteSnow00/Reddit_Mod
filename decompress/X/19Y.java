// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.view.b;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19y implements 0IF
{
    static {
        Covode.recordClassIndex(2025);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(4235);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(2131363896);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131366877);
        ((View)4fg).setPadding(((View)4fg).getPaddingLeft(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)4fg).getPaddingRight(), ((View)4fg).getPaddingBottom());
        ((View)4fg).setPadding(((View)4fg).getPaddingLeft(), ((View)4fg).getPaddingTop(), ((View)4fg).getPaddingRight(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ((View)4fg).setPadding(((View)4fg).getPaddingLeft(), ((View)4fg).getPaddingTop(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)4fg).getPaddingBottom());
        ((View)4fg).setPadding((int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), ((View)4fg).getPaddingTop(), ((View)4fg).getPaddingRight(), ((View)4fg).getPaddingBottom());
        final ConstraintLayout.a a = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 39.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755475", "raw"), 4fg, (ViewGroup$LayoutParams)a);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968630", "attr"), 4fg, (ViewGroup$LayoutParams)a);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.setMarginEnd((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.topToTop = 0;
        }
        CTM.LIZ((Object)4fg, (Object)a);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            constraintLayout.addView((View)4fg, (ViewGroup$LayoutParams)a);
        }
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setId(2131366878);
        ((View)4fg2).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        final i j = new i();
        j.LIZ("app:tux_icon", (a)new a.b("2131755681", "raw"), 4fg2, (ViewGroup$LayoutParams)a2);
        j.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg2, (ViewGroup$LayoutParams)a2);
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
            a2.topToTop = 0;
        }
        CTM.LIZ((Object)4fg2, (Object)a2);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            constraintLayout.addView((View)4fg2, (ViewGroup$LayoutParams)a2);
        }
        final 4fg 4fg3 = new 4fg(context);
        ((View)4fg3).setId(2131366880);
        ((View)4fg3).setPadding(((View)4fg3).getPaddingLeft(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)4fg3).getPaddingRight(), ((View)4fg3).getPaddingBottom());
        ((View)4fg3).setPadding(((View)4fg3).getPaddingLeft(), ((View)4fg3).getPaddingTop(), ((View)4fg3).getPaddingRight(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ((View)4fg3).setPadding((int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), ((View)4fg3).getPaddingTop(), ((View)4fg3).getPaddingRight(), ((View)4fg3).getPaddingBottom());
        ((View)4fg3).setPadding(((View)4fg3).getPaddingLeft(), ((View)4fg3).getPaddingTop(), (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), ((View)4fg3).getPaddingBottom());
        final ConstraintLayout.a a3 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 34.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        final i k = new i();
        k.LIZ("app:tux_icon", (a)new a.b("2131755208", "raw"), 4fg3, (ViewGroup$LayoutParams)a3);
        k.LIZ("app:tux_tintColor", (a)new a.b("2130968630", "attr"), 4fg3, (ViewGroup$LayoutParams)a3);
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.endToStart = 2131366879;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToTop = 0;
        }
        CTM.LIZ((Object)4fg3, (Object)a3);
        b.LIZ((View)4fg3);
        if (((View)4fg3).getParent() == null) {
            constraintLayout.addView((View)4fg3, (ViewGroup$LayoutParams)a3);
        }
        final 4fg 4fg4 = new 4fg(context);
        ((View)4fg4).setId(2131366879);
        ((View)4fg4).setPadding(((View)4fg4).getPaddingLeft(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)4fg4).getPaddingRight(), ((View)4fg4).getPaddingBottom());
        ((View)4fg4).setPadding(((View)4fg4).getPaddingLeft(), ((View)4fg4).getPaddingTop(), ((View)4fg4).getPaddingRight(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ((View)4fg4).setPadding((int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), ((View)4fg4).getPaddingTop(), ((View)4fg4).getPaddingRight(), ((View)4fg4).getPaddingBottom());
        ((View)4fg4).setPadding(((View)4fg4).getPaddingLeft(), ((View)4fg4).getPaddingTop(), (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), ((View)4fg4).getPaddingBottom());
        final ConstraintLayout.a a4 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 34.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        final i l = new i();
        l.LIZ("app:tux_icon", (a)new a.b("2131755209", "raw"), 4fg4, (ViewGroup$LayoutParams)a4);
        l.LIZ("app:tux_tintColor", (a)new a.b("2130968630", "attr"), 4fg4, (ViewGroup$LayoutParams)a4);
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.endToStart = 2131366877;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.topToTop = 0;
        }
        CTM.LIZ((Object)4fg4, (Object)a4);
        b.LIZ((View)4fg4);
        if (((View)4fg4).getParent() == null) {
            constraintLayout.addView((View)4fg4, (ViewGroup$LayoutParams)a4);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        final ConstraintLayout.a a5 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.topToTop = 0;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.setMarginStart((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373066);
        if (TextView.class.isInstance(tuxTextView)) {
            b.LIZ((View)tuxTextView, (int)TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()));
        }
        else {
            ((View)tuxTextView).setMinimumWidth((int)TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()));
        }
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968630 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        ((TextView)tuxTextView).setGravity(8388613);
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131373643);
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968630 });
        ((TextView)tuxTextView2).setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginEnd((int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131373666);
        final TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[] { 2130968631 });
        ((TextView)tuxTextView3).setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        CTM.LIZ((Object)tuxTextView3, (Object)linearLayout$LayoutParams3);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
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
        MethodCollector.o(4235);
        return (View)constraintLayout;
    }
}
