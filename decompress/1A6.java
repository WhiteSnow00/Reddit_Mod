// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.e;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.base.ui.b.c;
import com.bytedance.lighten.loader.SmartImageView;
import android.view.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1A6 implements 0IF
{
    static {
        Covode.recordClassIndex(2033);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(5327);
        final Resources resources = context.getResources();
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final SmartImageView smartImageView = new SmartImageView(context);
        ((View)smartImageView).setId(2131366798);
        final ConstraintLayout.a a = new ConstraintLayout.a(-1, -1);
        final c c = new c();
        c.LIZ("app:actualImageScaleType", (a)new a.c("centerCrop"), smartImageView, (ViewGroup$LayoutParams)a);
        c.LIZ("app:overlayImage", (a)new a.b("2131099734", "color"), smartImageView, (ViewGroup$LayoutParams)a);
        c.LIZ(smartImageView, (ViewGroup$LayoutParams)a);
        b.LIZ((View)smartImageView);
        if (((View)smartImageView).getParent() == null) {
            constraintLayout.addView((View)smartImageView, (ViewGroup$LayoutParams)a);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131367092);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.topMargin = (int)TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics());
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
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755714", "raw"), 4fg, (ViewGroup$LayoutParams)a2);
        i.LIZ("app:tux_iconHeight", (a)new a.d("32", "dp"), 4fg, (ViewGroup$LayoutParams)a2);
        i.LIZ("app:tux_iconWidth", (a)new a.d("32", "dp"), 4fg, (ViewGroup$LayoutParams)a2);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)a2);
        CTM.LIZ((Object)4fg, (Object)a2);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            constraintLayout.addView((View)4fg, (ViewGroup$LayoutParams)a2);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373476);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968628 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final ConstraintLayout.a a3 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginStart((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.topMargin = (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginEnd((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        ((TextView)tuxTextView).setGravity(17);
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToBottom = 2131367092;
        }
        new k().LIZ("app:tux_font", (a)new a.c("H3_Semibold"), tuxTextView, (ViewGroup$LayoutParams)a3);
        CTM.LIZ((Object)tuxTextView, (Object)a3);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout.addView((View)tuxTextView, (ViewGroup$LayoutParams)a3);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131373475);
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968629 });
        ((TextView)tuxTextView2).setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        final ConstraintLayout.a a4 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a4)) {
            a4.topMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView2).setGravity(17);
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.endToEnd = 2131373476;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.startToStart = 2131373476;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.topToBottom = 2131373476;
        }
        new k().LIZ("app:tux_font", (a)new a.c("P1_Regular"), tuxTextView2, (ViewGroup$LayoutParams)a4);
        CTM.LIZ((Object)tuxTextView2, (Object)a4);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            constraintLayout.addView((View)tuxTextView2, (ViewGroup$LayoutParams)a4);
        }
        final C9i c9i = new C9i(context);
        ((View)c9i).setId(2131363059);
        final ConstraintLayout.a a5 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.bottomMargin = (int)TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.endToEnd = 2131373476;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.startToStart = 2131373476;
        }
        final e e = new e();
        e.LIZ("app:tux_buttonSize", (a)new a.c("large"), c9i, (ViewGroup$LayoutParams)a5);
        e.LIZ("app:tux_buttonVariant", (a)new a.c("const_secondary"), c9i, (ViewGroup$LayoutParams)a5);
        CTM.LIZ((Object)c9i, (Object)a5);
        b.LIZ((View)c9i);
        if (((View)c9i).getParent() == null) {
            constraintLayout.addView((View)c9i, (ViewGroup$LayoutParams)a5);
        }
        final C9i c9i2 = new C9i(context);
        ((View)c9i2).setId(2131363074);
        final ConstraintLayout.a a6 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a6)) {
            a6.bottomMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.bottomToTop = 2131363059;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.endToEnd = 2131373476;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.startToStart = 2131373476;
        }
        final e e2 = new e();
        e2.LIZ("app:tux_buttonSize", (a)new a.c("large"), c9i2, (ViewGroup$LayoutParams)a6);
        e2.LIZ("app:tux_buttonVariant", (a)new a.c("primary"), c9i2, (ViewGroup$LayoutParams)a6);
        CTM.LIZ((Object)c9i2, (Object)a6);
        b.LIZ((View)c9i2);
        if (((View)c9i2).getParent() == null) {
            constraintLayout.addView((View)c9i2, (ViewGroup$LayoutParams)a6);
        }
        b.LIZ((View)constraintLayout);
        ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)constraintLayout);
        }
        MethodCollector.o(5327);
        return (View)constraintLayout;
    }
}
