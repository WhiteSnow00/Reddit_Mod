// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.f;
import android.widget.ImageView$ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ui.b.c;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.LinearLayout$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.widget.RelativeLayout$LayoutParams;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19o implements 0IF
{
    static {
        Covode.recordClassIndex(2015);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(7216);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131363909);
        ((ViewGroup)frameLayout).setClipChildren(false);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(2131367431);
        ((View)constraintLayout).setBackgroundResource(2131231091);
        constraintLayout.setClipChildren(false);
        ((View)constraintLayout).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)constraintLayout).getPaddingTop(), ((View)constraintLayout).getPaddingRight(), ((View)constraintLayout).getPaddingBottom());
        ((View)constraintLayout).setPadding(((View)constraintLayout).getPaddingLeft(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)constraintLayout).getPaddingRight(), ((View)constraintLayout).getPaddingBottom());
        ((View)constraintLayout).setPadding(((View)constraintLayout).getPaddingLeft(), ((View)constraintLayout).getPaddingTop(), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), ((View)constraintLayout).getPaddingBottom());
        ((View)constraintLayout).setPadding(((View)constraintLayout).getPaddingLeft(), ((View)constraintLayout).getPaddingTop(), ((View)constraintLayout).getPaddingRight(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        final View view = new View(context);
        view.setId(2131365906);
        final ConstraintLayout.a a = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), -1);
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.endToEnd = 0;
        }
        b.LIZ(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, (ViewGroup$LayoutParams)a);
        }
        final ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(2131370360);
        ((View)constraintLayout2).setVisibility(8);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToStart = 2131365906;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.startToStart = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToBottom = 2131367592;
        }
        final View view2 = new View(context);
        view2.setId(2131370362);
        view2.setBackgroundResource(2131233070);
        if (TextView.class.isInstance(view2)) {
            b.LIZIZ(view2, (int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        }
        else {
            view2.setMinimumHeight((int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        }
        final ConstraintLayout.a a3 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToTop = 0;
        }
        b.LIZ(view2);
        if (view2.getParent() == null) {
            constraintLayout2.addView(view2, (ViewGroup$LayoutParams)a3);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131370372);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setMaxLines(1);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968678 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final ConstraintLayout.a a4 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout$LayoutParams.class.isInstance(a4)) {
            ((RelativeLayout$LayoutParams)a4).addRule(20, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(a4)) {
            ((RelativeLayout$LayoutParams)a4).addRule(9, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a4)) {
            a4.setMarginStart((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a4)) {
            a4.leftMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.endToStart = 2131370358;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.horizontalBias = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.horizontalChainStyle = 2;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.startToEnd = 2131370362;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.topToTop = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.matchConstraintDefaultWidth = 1;
        }
        final k k = new k();
        k.LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView, (ViewGroup$LayoutParams)a4);
        k.LIZ(tuxTextView, (ViewGroup$LayoutParams)a4);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout2.addView((View)tuxTextView, (ViewGroup$LayoutParams)a4);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131370358);
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968678 });
        ((TextView)tuxTextView2).setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        ((View)tuxTextView2).setVisibility(8);
        final ConstraintLayout.a a5 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.bottomToBottom = 2131370372;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.endToStart = 2131370359;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.startToEnd = 2131370372;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.topToTop = 2131370372;
        }
        final k i = new k();
        i.LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView2, (ViewGroup$LayoutParams)a5);
        i.LIZ(tuxTextView2, (ViewGroup$LayoutParams)a5);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            constraintLayout2.addView((View)tuxTextView2, (ViewGroup$LayoutParams)a5);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((TextView)tuxTextView3).setPadding((int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), ((View)tuxTextView3).getPaddingTop(), ((View)tuxTextView3).getPaddingRight(), ((View)tuxTextView3).getPaddingBottom());
        ((AppCompatTextView)tuxTextView3).setTextSize(2, 12.0f);
        ((TextView)tuxTextView3).setPadding((int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), ((View)tuxTextView3).getPaddingTop(), ((View)tuxTextView3).getPaddingRight(), ((View)tuxTextView3).getPaddingBottom());
        final TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[] { 2130968654 });
        ((TextView)tuxTextView3).setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        ((View)tuxTextView3).setId(2131370359);
        final ConstraintLayout.a a6 = new ConstraintLayout.a(-2, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(a6)) {
            ((RelativeLayout$LayoutParams)a6).addRule(10, -1);
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.bottomToBottom = 2131370372;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.endToStart = 2131373469;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.startToEnd = 2131370358;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.topToTop = 2131370372;
        }
        final k j = new k();
        j.LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView3, (ViewGroup$LayoutParams)a6);
        ((TextView)tuxTextView3).setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        j.LIZ(tuxTextView3, (ViewGroup$LayoutParams)a6);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            constraintLayout2.addView((View)tuxTextView3, (ViewGroup$LayoutParams)a6);
        }
        final AmF amF = new AmF(context);
        ((AppCompatTextView)amF).setTextSize(2, 15.0f);
        ((View)amF).setId(2131370361);
        final TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[] { 2130968672 });
        ((TextView)amF).setTextColor(obtainStyledAttributes4.getColor(0, 0));
        obtainStyledAttributes4.recycle();
        final ConstraintLayout.a a7 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout$LayoutParams.class.isInstance(a7)) {
            ((RelativeLayout$LayoutParams)a7).addRule(3, 2131370372);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a7)) {
            a7.topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.horizontalBias = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.startToStart = 2131370372;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.topToBottom = 2131370372;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.matchConstraintDefaultWidth = 1;
        }
        ((TextView)amF).setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        b.LIZ((View)amF);
        if (((View)amF).getParent() == null) {
            constraintLayout2.addView((View)amF, (ViewGroup$LayoutParams)a7);
        }
        final TuxTextView tuxTextView4 = new TuxTextView(context);
        ((AppCompatTextView)tuxTextView4).setTextSize(2, 10.0f);
        ((TextView)tuxTextView4).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView4).setPadding((int)TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()), ((View)tuxTextView4).getPaddingTop(), ((View)tuxTextView4).getPaddingRight(), ((View)tuxTextView4).getPaddingBottom());
        ((TextView)tuxTextView4).setPadding(((View)tuxTextView4).getPaddingLeft(), ((View)tuxTextView4).getPaddingTop(), (int)TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()), ((View)tuxTextView4).getPaddingBottom());
        ((TextView)tuxTextView4).setMaxLines(1);
        ((TextView)tuxTextView4).setMaxWidth((int)TypedValue.applyDimension(1, 97.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView4).setTextColor(resources.getColorStateList(2131100280));
        ((View)tuxTextView4).setId(2131373469);
        ((AppCompatTextView)tuxTextView4).setBackgroundResource(2131233081);
        ((View)tuxTextView4).setVisibility(8);
        final ConstraintLayout.a a8 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a8)) {
            a8.setMarginStart((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.bottomToBottom = 2131370372;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.startToEnd = 2131370359;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.topToTop = 2131370372;
        }
        final k l = new k();
        l.LIZ("app:tux_font", (a)new a.c("SmallText2_Regular"), tuxTextView4, (ViewGroup$LayoutParams)a8);
        l.LIZ(tuxTextView4, (ViewGroup$LayoutParams)a8);
        b.LIZ((View)tuxTextView4);
        if (((View)tuxTextView4).getParent() == null) {
            constraintLayout2.addView((View)tuxTextView4, (ViewGroup$LayoutParams)a8);
        }
        b.LIZ((View)constraintLayout2);
        if (((View)constraintLayout2).getParent() == null) {
            constraintLayout.addView((View)constraintLayout2, (ViewGroup$LayoutParams)a2);
        }
        final View view3 = new View(context);
        view3.setId(2131367336);
        final ConstraintLayout.a a9 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.bottomToBottom = 2131373106;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.endToEnd = 2131373106;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.startToStart = 2131366865;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.topToTop = 2131366865;
        }
        b.LIZ(view3);
        if (view3.getParent() == null) {
            constraintLayout.addView(view3, (ViewGroup$LayoutParams)a9);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131366865);
        ((View)4fg).setPadding((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), ((View)4fg).getPaddingTop(), ((View)4fg).getPaddingRight(), ((View)4fg).getPaddingBottom());
        ((View)4fg).setPadding(((View)4fg).getPaddingLeft(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)4fg).getPaddingRight(), ((View)4fg).getPaddingBottom());
        final ConstraintLayout.a a10 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(a10)) {
            ((LinearLayout$LayoutParams)a10).gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a10)) {
            ((FrameLayout$LayoutParams)a10).gravity = 1;
        }
        if (092.d.class.isInstance(a10)) {
            ((092.d)a10).LIZ = 1;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a10)) {
            a10.setMarginEnd((int)TypedValue.applyDimension(1, 82.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a10)) {
            a10.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a10)) {
            a10.bottomToBottom = 2131363779;
        }
        final i m = new i();
        m.LIZ("app:tux_icon", (a)new a.b("2131755494", "raw"), 4fg, (ViewGroup$LayoutParams)a10);
        m.LIZ("app:tux_tintColor", (a)new a.b("2130968681", "attr"), 4fg, (ViewGroup$LayoutParams)a10);
        m.LIZ(4fg, (ViewGroup$LayoutParams)a10);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            constraintLayout.addView((View)4fg, (ViewGroup$LayoutParams)a10);
        }
        final TuxTextView tuxTextView5 = new TuxTextView(context);
        ((View)tuxTextView5).setId(2131373106);
        ((TextView)tuxTextView5).setPadding(((View)tuxTextView5).getPaddingLeft(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView5).getPaddingRight(), ((View)tuxTextView5).getPaddingBottom());
        if (TextView.class.isInstance(tuxTextView5)) {
            b.LIZ((View)tuxTextView5, (int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        else {
            ((View)tuxTextView5).setMinimumWidth((int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        final TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[] { 2130968681 });
        ((TextView)tuxTextView5).setTextColor(obtainStyledAttributes5.getColor(0, 0));
        obtainStyledAttributes5.recycle();
        final ConstraintLayout.a a11 = new ConstraintLayout.a(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(a11)) {
            ((LinearLayout$LayoutParams)a11).gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a11)) {
            ((FrameLayout$LayoutParams)a11).gravity = 1;
        }
        if (092.d.class.isInstance(a11)) {
            ((092.d)a11).LIZ = 1;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a11)) {
            a11.setMarginStart((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        ((TextView)tuxTextView5).setGravity(3);
        if (ConstraintLayout.a.class.isInstance(a11)) {
            a11.topToTop = 2131366865;
        }
        if (ConstraintLayout.a.class.isInstance(a11)) {
            a11.bottomToBottom = 2131366865;
        }
        if (ConstraintLayout.a.class.isInstance(a11)) {
            a11.horizontalBias = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a11)) {
            a11.horizontalChainStyle = 2;
        }
        if (ConstraintLayout.a.class.isInstance(a11)) {
            a11.startToEnd = 2131366865;
        }
        if (ConstraintLayout.a.class.isInstance(a11)) {
            a11.matchConstraintDefaultWidth = 1;
        }
        final k k2 = new k();
        k2.LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView5, (ViewGroup$LayoutParams)a11);
        k2.LIZ(tuxTextView5, (ViewGroup$LayoutParams)a11);
        b.LIZ((View)tuxTextView5);
        if (((View)tuxTextView5).getParent() == null) {
            constraintLayout.addView((View)tuxTextView5, (ViewGroup$LayoutParams)a11);
        }
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setId(2131366866);
        ((View)4fg2).setPadding(((View)4fg2).getPaddingLeft(), ((View)4fg2).getPaddingTop(), ((View)4fg2).getPaddingRight(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        ((View)4fg2).setPadding((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), ((View)4fg2).getPaddingTop(), ((View)4fg2).getPaddingRight(), ((View)4fg2).getPaddingBottom());
        ((View)4fg2).setPadding(((View)4fg2).getPaddingLeft(), ((View)4fg2).getPaddingTop(), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), ((View)4fg2).getPaddingBottom());
        ((View)4fg2).setRotation(180.0f);
        final ConstraintLayout.a a12 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a12)) {
            a12.setMarginEnd((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a12)) {
            a12.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a12)) {
            a12.topToTop = 2131366865;
        }
        if (ConstraintLayout.a.class.isInstance(a12)) {
            a12.bottomToBottom = 2131366865;
        }
        final i i2 = new i();
        i2.LIZ("app:tux_icon", (a)new a.b("2131755801", "raw"), 4fg2, (ViewGroup$LayoutParams)a12);
        i2.LIZ("app:tux_tintColor", (a)new a.b("2130968681", "attr"), 4fg2, (ViewGroup$LayoutParams)a12);
        i2.LIZ(4fg2, (ViewGroup$LayoutParams)a12);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            constraintLayout.addView((View)4fg2, (ViewGroup$LayoutParams)a12);
        }
        final TuxTextView tuxTextView6 = new TuxTextView(context);
        ((View)tuxTextView6).setId(2131372326);
        ((TextView)tuxTextView6).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView6).setMaxLines(1);
        final TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[] { 2130968681 });
        ((TextView)tuxTextView6).setTextColor(obtainStyledAttributes6.getColor(0, 0));
        obtainStyledAttributes6.recycle();
        final ConstraintLayout.a a13 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(a13)) {
            a13.endToStart = 2131363757;
        }
        if (ConstraintLayout.a.class.isInstance(a13)) {
            a13.horizontalBias = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a13)) {
            a13.horizontalChainStyle = 2;
        }
        if (ConstraintLayout.a.class.isInstance(a13)) {
            a13.startToEnd = 2131365289;
        }
        if (ConstraintLayout.a.class.isInstance(a13)) {
            a13.topToTop = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a13)) {
            a13.matchConstraintDefaultWidth = 1;
        }
        final k k3 = new k();
        k3.LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView6, (ViewGroup$LayoutParams)a13);
        k3.LIZ(tuxTextView6, (ViewGroup$LayoutParams)a13);
        b.LIZ((View)tuxTextView6);
        if (((View)tuxTextView6).getParent() == null) {
            constraintLayout.addView((View)tuxTextView6, (ViewGroup$LayoutParams)a13);
        }
        final TuxTextView tuxTextView7 = new TuxTextView(context);
        ((View)tuxTextView7).setId(2131363757);
        final TypedArray obtainStyledAttributes7 = context.getTheme().obtainStyledAttributes(new int[] { 2130968678 });
        ((TextView)tuxTextView7).setTextColor(obtainStyledAttributes7.getColor(0, 0));
        obtainStyledAttributes7.recycle();
        ((View)tuxTextView7).setVisibility(8);
        final ConstraintLayout.a a14 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a14)) {
            a14.setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a14)) {
            a14.leftMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a14)) {
            a14.bottomToBottom = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a14)) {
            a14.endToStart = 2131363771;
        }
        if (ConstraintLayout.a.class.isInstance(a14)) {
            a14.startToEnd = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a14)) {
            a14.topToTop = 2131372326;
        }
        final k k4 = new k();
        k4.LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView7, (ViewGroup$LayoutParams)a14);
        k4.LIZ(tuxTextView7, (ViewGroup$LayoutParams)a14);
        b.LIZ((View)tuxTextView7);
        if (((View)tuxTextView7).getParent() == null) {
            constraintLayout.addView((View)tuxTextView7, (ViewGroup$LayoutParams)a14);
        }
        final TuxTextView tuxTextView8 = new TuxTextView(context);
        ((TextView)tuxTextView8).setPadding((int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), ((View)tuxTextView8).getPaddingTop(), ((View)tuxTextView8).getPaddingRight(), ((View)tuxTextView8).getPaddingBottom());
        ((AppCompatTextView)tuxTextView8).setTextSize(2, 12.0f);
        ((TextView)tuxTextView8).setPadding((int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), ((View)tuxTextView8).getPaddingTop(), ((View)tuxTextView8).getPaddingRight(), ((View)tuxTextView8).getPaddingBottom());
        final TypedArray obtainStyledAttributes8 = context.getTheme().obtainStyledAttributes(new int[] { 2130968654 });
        ((TextView)tuxTextView8).setTextColor(obtainStyledAttributes8.getColor(0, 0));
        obtainStyledAttributes8.recycle();
        ((View)tuxTextView8).setId(2131363771);
        final ConstraintLayout.a a15 = new ConstraintLayout.a(-2, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(a15)) {
            ((RelativeLayout$LayoutParams)a15).addRule(10, -1);
        }
        if (ConstraintLayout.a.class.isInstance(a15)) {
            a15.bottomToBottom = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a15)) {
            a15.endToStart = 2131372304;
        }
        if (ConstraintLayout.a.class.isInstance(a15)) {
            a15.startToEnd = 2131363757;
        }
        if (ConstraintLayout.a.class.isInstance(a15)) {
            a15.topToTop = 2131372326;
        }
        final k k5 = new k();
        k5.LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView8, (ViewGroup$LayoutParams)a15);
        ((TextView)tuxTextView8).setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        k5.LIZ(tuxTextView8, (ViewGroup$LayoutParams)a15);
        b.LIZ((View)tuxTextView8);
        if (((View)tuxTextView8).getParent() == null) {
            constraintLayout.addView((View)tuxTextView8, (ViewGroup$LayoutParams)a15);
        }
        final TuxTextView tuxTextView9 = new TuxTextView(context);
        ((View)tuxTextView9).setId(2131372304);
        final TypedArray obtainStyledAttributes9 = context.getTheme().obtainStyledAttributes(new int[] { 2130968673 });
        ((TextView)tuxTextView9).setTextColor(obtainStyledAttributes9.getColor(0, 0));
        obtainStyledAttributes9.recycle();
        final ConstraintLayout.a a16 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a16)) {
            a16.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a16)) {
            a16.bottomToBottom = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a16)) {
            a16.endToStart = 2131366372;
        }
        if (ConstraintLayout.a.class.isInstance(a16)) {
            a16.startToEnd = 2131363771;
        }
        if (ConstraintLayout.a.class.isInstance(a16)) {
            a16.topToTop = 2131372326;
        }
        final k k6 = new k();
        k6.LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView9, (ViewGroup$LayoutParams)a16);
        k6.LIZ(tuxTextView9, (ViewGroup$LayoutParams)a16);
        b.LIZ((View)tuxTextView9);
        if (((View)tuxTextView9).getParent() == null) {
            constraintLayout.addView((View)tuxTextView9, (ViewGroup$LayoutParams)a16);
        }
        final 4fg 4fg3 = new 4fg(context);
        ((View)4fg3).setId(2131366372);
        ((ImageView)4fg3).setVisibility(8);
        final ConstraintLayout.a a17 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a17)) {
            a17.setMarginStart((int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a17)) {
            a17.bottomToBottom = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a17)) {
            a17.endToStart = 2131373465;
        }
        if (ConstraintLayout.a.class.isInstance(a17)) {
            a17.startToEnd = 2131372304;
        }
        if (ConstraintLayout.a.class.isInstance(a17)) {
            a17.topToTop = 2131372326;
        }
        final i i3 = new i();
        i3.LIZ("app:tux_icon", (a)new a.b("2131755677", "raw"), 4fg3, (ViewGroup$LayoutParams)a17);
        i3.LIZ("app:tux_tintColor", (a)new a.b("2130968673", "attr"), 4fg3, (ViewGroup$LayoutParams)a17);
        i3.LIZ(4fg3, (ViewGroup$LayoutParams)a17);
        b.LIZ((View)4fg3);
        if (((View)4fg3).getParent() == null) {
            constraintLayout.addView((View)4fg3, (ViewGroup$LayoutParams)a17);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131363779);
        linearLayout.setOrientation(0);
        final ConstraintLayout.a a18 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a18)) {
            a18.topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a18)) {
            a18.startToStart = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a18)) {
            a18.topToBottom = 2131363920;
        }
        final TuxTextView tuxTextView10 = new TuxTextView(context);
        ((View)tuxTextView10).setId(2131363778);
        final TypedArray obtainStyledAttributes10 = context.getTheme().obtainStyledAttributes(new int[] { 2130968681 });
        ((TextView)tuxTextView10).setTextColor(obtainStyledAttributes10.getColor(0, 0));
        obtainStyledAttributes10.recycle();
        ((View)tuxTextView10).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).setMarginEnd((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        final k k7 = new k();
        k7.LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView10, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        k7.LIZ(tuxTextView10, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        b.LIZ((View)tuxTextView10);
        if (((View)tuxTextView10).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView10, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView11 = new TuxTextView(context);
        ((View)tuxTextView11).setId(2131363743);
        ((TextView)tuxTextView11).setText(2131823041);
        final TypedArray obtainStyledAttributes11 = context.getTheme().obtainStyledAttributes(new int[] { 2130968681 });
        ((TextView)tuxTextView11).setTextColor(obtainStyledAttributes11.getColor(0, 0));
        obtainStyledAttributes11.recycle();
        ((View)tuxTextView11).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginEnd((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams2)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams2).startToEnd = 2131363778;
        }
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams2)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams2).topToTop = 2131363778;
        }
        final k k8 = new k();
        k8.LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView11, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        k8.LIZ(tuxTextView11, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView11);
        if (((View)tuxTextView11).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView11, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final A1A a1A = new A1A(context);
        ((View)a1A).setId(2131372613);
        ((View)a1A).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams3)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams3).topToTop = 2131363743;
        }
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams3)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams3).startToEnd = 2131363743;
        }
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams3)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams3).topToBottom = 2131363920;
        }
        b.LIZ((View)a1A);
        if (((View)a1A).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)a1A, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final TuxTextView tuxTextView12 = new TuxTextView(context);
        ((View)tuxTextView12).setId(2131363688);
        ((TextView)tuxTextView12).setText(2131822950);
        final TypedArray obtainStyledAttributes12 = context.getTheme().obtainStyledAttributes(new int[] { 2130968681 });
        ((TextView)tuxTextView12).setTextColor(obtainStyledAttributes12.getColor(0, 0));
        obtainStyledAttributes12.recycle();
        ((View)tuxTextView12).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginEnd((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams4)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams4).startToEnd = 2131363778;
        }
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams4)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams4).topToTop = 2131363778;
        }
        final k k9 = new k();
        k9.LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView12, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        k9.LIZ(tuxTextView12, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        b.LIZ((View)tuxTextView12);
        if (((View)tuxTextView12).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView12, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            constraintLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)a18);
        }
        final FrameLayout frameLayout2 = new FrameLayout(context);
        ((View)frameLayout2).setId(2131367580);
        ((View)frameLayout2).setVisibility(8);
        final ConstraintLayout.a a19 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a19)) {
            a19.setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a19)) {
            a19.startToEnd = 2131363779;
        }
        if (ConstraintLayout.a.class.isInstance(a19)) {
            a19.topToTop = 2131363779;
        }
        if (ConstraintLayout.a.class.isInstance(a19)) {
            a19.bottomToBottom = 2131363779;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ((View)frameLayout3).setId(2131367581);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams2).setMarginEnd((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        final SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        ((View)smartAvatarImageView).setId(2131367579);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams3).setMarginEnd((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams3).gravity = 8388659;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            frameLayout$LayoutParams3.gravity = 8388659;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams3)) {
            ((092.d)frameLayout$LayoutParams3).LIZ = 8388659;
        }
        final c c = new c();
        c.LIZ("app:placeholderImage", (a)new a.b("2131099653", "color"), (SmartImageView)smartAvatarImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        c.LIZ("app:placeholderImageScaleType", (a)new a.c("centerCrop"), (SmartImageView)smartAvatarImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        c.LIZ("app:roundAsCircle", (a)new a.c("true"), (SmartImageView)smartAvatarImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        c.LIZ((SmartImageView)smartAvatarImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        b.LIZ((View)smartAvatarImageView);
        if (((View)smartAvatarImageView).getParent() == null) {
            ((ViewGroup)frameLayout3).addView((View)smartAvatarImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        ((View)appCompatImageView).setId(2131367582);
        appCompatImageView.setImageResource(2131231107);
        final FrameLayout$LayoutParams frameLayout$LayoutParams4 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams4)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams4).gravity = 8388659;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams4)) {
            frameLayout$LayoutParams4.gravity = 8388659;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams4)) {
            ((092.d)frameLayout$LayoutParams4).LIZ = 8388659;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams4).setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams4).topMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            ((ViewGroup)frameLayout3).addView((View)appCompatImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        }
        b.LIZ((View)frameLayout3);
        if (((View)frameLayout3).getParent() == null) {
            ((ViewGroup)frameLayout2).addView((View)frameLayout3, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        b.LIZ((View)frameLayout2);
        if (((View)frameLayout2).getParent() == null) {
            constraintLayout.addView((View)frameLayout2, (ViewGroup$LayoutParams)a19);
        }
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131365756);
        ((View)linearLayout2).setVisibility(8);
        linearLayout2.setOrientation(0);
        final ConstraintLayout.a a20 = new ConstraintLayout.a(-2, (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(a20)) {
            ((LinearLayout$LayoutParams)a20).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a20)) {
            ((FrameLayout$LayoutParams)a20).gravity = 17;
        }
        if (092.d.class.isInstance(a20)) {
            ((092.d)a20).LIZ = 17;
        }
        if (ConstraintLayout.a.class.isInstance(a20)) {
            a20.startToStart = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a20)) {
            a20.topToBottom = 2131372612;
        }
        final TuxTextView tuxTextView13 = new TuxTextView(context);
        ((View)tuxTextView13).setId(2131365758);
        ((AppCompatTextView)tuxTextView13).setBackgroundResource(2131231105);
        ((TextView)tuxTextView13).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)tuxTextView13).getPaddingTop(), ((View)tuxTextView13).getPaddingRight(), ((View)tuxTextView13).getPaddingBottom());
        ((TextView)tuxTextView13).setPadding(((View)tuxTextView13).getPaddingLeft(), ((View)tuxTextView13).getPaddingTop(), (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), ((View)tuxTextView13).getPaddingBottom());
        ((TextView)tuxTextView13).setText(2131836772);
        final TypedArray obtainStyledAttributes13 = context.getTheme().obtainStyledAttributes(new int[] { 2130968672 });
        ((TextView)tuxTextView13).setTextColor(obtainStyledAttributes13.getColor(0, 0));
        obtainStyledAttributes13.recycle();
        ((TextView)tuxTextView13).setMaxLines(1);
        ((TextView)tuxTextView13).setEllipsize(TextUtils$TruncateAt.END);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView13).setGravity(17);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams5).topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams5).bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        final k k10 = new k();
        k10.LIZ("app:tux_font", (a)new a.c("P1_Semibold"), tuxTextView13, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        k10.LIZ(tuxTextView13, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        b.LIZ((View)tuxTextView13);
        if (((View)tuxTextView13).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView13, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        final SmartImageView smartImageView = new SmartImageView(context);
        ((View)smartImageView).setId(2131365757);
        ((View)smartImageView).setBackgroundColor(resources.getColor(2131099763));
        ((ImageView)smartImageView).setScaleType(ImageView$ScaleType.CENTER_INSIDE);
        final LinearLayout$LayoutParams linearLayout$LayoutParams6 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams6).setMarginStart((int)TypedValue.applyDimension(1, -24.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)smartImageView);
        if (((View)smartImageView).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)smartImageView, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            constraintLayout.addView((View)linearLayout2, (ViewGroup$LayoutParams)a20);
        }
        final TuxTextView tuxTextView14 = new TuxTextView(context);
        ((TextView)tuxTextView14).setText(2131827094);
        ((AppCompatTextView)tuxTextView14).setTextSize(2, 11.0f);
        ((TextView)tuxTextView14).setPadding((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)tuxTextView14).getPaddingTop(), ((View)tuxTextView14).getPaddingRight(), ((View)tuxTextView14).getPaddingBottom());
        ((TextView)tuxTextView14).setPadding(((View)tuxTextView14).getPaddingLeft(), ((View)tuxTextView14).getPaddingTop(), (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)tuxTextView14).getPaddingBottom());
        final TypedArray obtainStyledAttributes14 = context.getTheme().obtainStyledAttributes(new int[] { 2130968681 });
        ((TextView)tuxTextView14).setTextColor(obtainStyledAttributes14.getColor(0, 0));
        obtainStyledAttributes14.recycle();
        ((AppCompatTextView)tuxTextView14).setBackgroundResource(2131231089);
        ((View)tuxTextView14).setVisibility(8);
        ((View)tuxTextView14).setId(2131367592);
        final ConstraintLayout.a a21 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a21)) {
            a21.topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView14).setGravity(16);
        if (ConstraintLayout.a.class.isInstance(a21)) {
            a21.startToStart = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a21)) {
            a21.topToBottom = 2131365756;
        }
        final k k11 = new k();
        k11.LIZ("app:tux_font", (a)new a.c("P3_Semibold"), tuxTextView14, (ViewGroup$LayoutParams)a21);
        ((TextView)tuxTextView14).setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        k11.LIZ(tuxTextView14, (ViewGroup$LayoutParams)a21);
        b.LIZ((View)tuxTextView14);
        if (((View)tuxTextView14).getParent() == null) {
            constraintLayout.addView((View)tuxTextView14, (ViewGroup$LayoutParams)a21);
        }
        final TuxTextView tuxTextView15 = new TuxTextView(context);
        ((View)tuxTextView15).setId(2131369558);
        final TypedArray obtainStyledAttributes15 = context.getTheme().obtainStyledAttributes(new int[] { 2130968681 });
        ((TextView)tuxTextView15).setTextColor(obtainStyledAttributes15.getColor(0, 0));
        obtainStyledAttributes15.recycle();
        ((View)tuxTextView15).setVisibility(8);
        final ConstraintLayout.a a22 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a22)) {
            a22.topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a22)) {
            a22.startToEnd = 2131363779;
        }
        if (ConstraintLayout.a.class.isInstance(a22)) {
            a22.topToBottom = 2131370360;
        }
        final k k12 = new k();
        k12.LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView15, (ViewGroup$LayoutParams)a22);
        k12.LIZ(tuxTextView15, (ViewGroup$LayoutParams)a22);
        b.LIZ((View)tuxTextView15);
        if (((View)tuxTextView15).getParent() == null) {
            constraintLayout.addView((View)tuxTextView15, (ViewGroup$LayoutParams)a22);
        }
        final Cfg cfg = new Cfg(context);
        ((View)cfg).setId(2131368137);
        ((View)cfg).setVisibility(8);
        final ConstraintLayout.a a23 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a23)) {
            a23.topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a23)) {
            a23.bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        final f f = new f();
        f.LIZ("app:tux_checkBoxCheckedColor", (a)new a.b("2130968654", "attr"), cfg, (ViewGroup$LayoutParams)a23);
        f.LIZ("app:tux_checkBoxUncheckedColor", (a)new a.b("2130968643", "attr"), cfg, (ViewGroup$LayoutParams)a23);
        if (ConstraintLayout.a.class.isInstance(a23)) {
            a23.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a23)) {
            a23.topToTop = 0;
        }
        f.LIZ(cfg, (ViewGroup$LayoutParams)a23);
        b.LIZ((View)cfg);
        if (((View)cfg).getParent() == null) {
            constraintLayout.addView((View)cfg, (ViewGroup$LayoutParams)a23);
        }
        final FrameLayout frameLayout4 = new FrameLayout(context);
        ((View)frameLayout4).setId(2131365289);
        final ConstraintLayout.a a24 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a24)) {
            a24.startToEnd = 2131368137;
        }
        if (ConstraintLayout.a.class.isInstance(a24)) {
            a24.topToTop = 0;
        }
        final SmartAvatarImageView smartAvatarImageView2 = new SmartAvatarImageView(context);
        ((View)smartAvatarImageView2).setId(2131362570);
        final FrameLayout$LayoutParams frameLayout$LayoutParams5 = new FrameLayout$LayoutParams((int)resources.getDimension(2131165430), (int)resources.getDimension(2131165430));
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams5).setMarginEnd((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams5)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams5).gravity = 8388659;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams5)) {
            frameLayout$LayoutParams5.gravity = 8388659;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams5)) {
            ((092.d)frameLayout$LayoutParams5).LIZ = 8388659;
        }
        final c c2 = new c();
        c2.LIZ("app:placeholderImage", (a)new a.b("2131099653", "color"), (SmartImageView)smartAvatarImageView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        c2.LIZ("app:placeholderImageScaleType", (a)new a.c("centerCrop"), (SmartImageView)smartAvatarImageView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        c2.LIZ("app:roundAsCircle", (a)new a.c("true"), (SmartImageView)smartAvatarImageView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        c2.LIZ("app:roundingBorderWidth", (a)new a.d("0.5", "dp"), (SmartImageView)smartAvatarImageView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        c2.LIZ("app:roundingBorderColor", (a)new a.b("2130968641", "attr"), (SmartImageView)smartAvatarImageView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        c2.LIZ((SmartImageView)smartAvatarImageView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        b.LIZ((View)smartAvatarImageView2);
        if (((View)smartAvatarImageView2).getParent() == null) {
            ((ViewGroup)frameLayout4).addView((View)smartAvatarImageView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        }
        final SEM sem = new SEM(context);
        ((View)sem).setId(2131367184);
        ((ImageView)sem).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams6 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams6)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams6).gravity = 8388693;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams6)) {
            frameLayout$LayoutParams6.gravity = 8388693;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams6)) {
            ((092.d)frameLayout$LayoutParams6).LIZ = 8388693;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams6).setMarginEnd((int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams6).bottomMargin = (int)TypedValue.applyDimension(1, -1.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)sem);
        if (((View)sem).getParent() == null) {
            ((ViewGroup)frameLayout4).addView((View)sem, (ViewGroup$LayoutParams)frameLayout$LayoutParams6);
        }
        b.LIZ((View)frameLayout4);
        if (((View)frameLayout4).getParent() == null) {
            constraintLayout.addView((View)frameLayout4, (ViewGroup$LayoutParams)a24);
        }
        final 4fZ 4fZ = new 4fZ(context);
        ((View)4fZ).setId(2131372612);
        ((View)4fZ).setVisibility(8);
        final ConstraintLayout.a a25 = new ConstraintLayout.a(-2, (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a25)) {
            a25.topMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a25)) {
            a25.goneBottomMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a25)) {
            a25.startToStart = 2131363920;
        }
        if (ConstraintLayout.a.class.isInstance(a25)) {
            a25.topToBottom = 2131363779;
        }
        b.LIZ((View)4fZ);
        if (((View)4fZ).getParent() == null) {
            constraintLayout.addView((View)4fZ, (ViewGroup$LayoutParams)a25);
        }
        final View view4 = new View(context);
        view4.setId(2131374213);
        final ConstraintLayout.a a26 = new ConstraintLayout.a(-1, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a26)) {
            a26.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a26)) {
            a26.endToEnd = 0;
        }
        b.LIZ(view4);
        if (view4.getParent() == null) {
            constraintLayout.addView(view4, (ViewGroup$LayoutParams)a26);
        }
        final AmF amF2 = new AmF(context);
        ((AppCompatTextView)amF2).setTextSize(2, 15.0f);
        ((View)amF2).setId(2131363920);
        final TypedArray obtainStyledAttributes16 = context.getTheme().obtainStyledAttributes(new int[] { 2130968672 });
        ((TextView)amF2).setTextColor(obtainStyledAttributes16.getColor(0, 0));
        obtainStyledAttributes16.recycle();
        final ConstraintLayout.a a27 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a27)) {
            a27.topMargin = (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a27)) {
            a27.endToStart = 2131365906;
        }
        if (ConstraintLayout.a.class.isInstance(a27)) {
            a27.horizontalBias = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a27)) {
            a27.startToStart = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a27)) {
            a27.topToBottom = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a27)) {
            a27.matchConstraintDefaultWidth = 1;
        }
        ((TextView)amF2).setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        b.LIZ((View)amF2);
        if (((View)amF2).getParent() == null) {
            constraintLayout.addView((View)amF2, (ViewGroup$LayoutParams)a27);
        }
        final TuxTextView tuxTextView16 = new TuxTextView(context);
        ((AppCompatTextView)tuxTextView16).setTextSize(2, 10.0f);
        ((TextView)tuxTextView16).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView16).setPadding((int)TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()), ((View)tuxTextView16).getPaddingTop(), ((View)tuxTextView16).getPaddingRight(), ((View)tuxTextView16).getPaddingBottom());
        ((TextView)tuxTextView16).setPadding(((View)tuxTextView16).getPaddingLeft(), ((View)tuxTextView16).getPaddingTop(), (int)TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()), ((View)tuxTextView16).getPaddingBottom());
        ((TextView)tuxTextView16).setMaxLines(1);
        ((TextView)tuxTextView16).setMaxWidth((int)TypedValue.applyDimension(1, 97.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView16).setTextColor(resources.getColorStateList(2131100280));
        ((View)tuxTextView16).setId(2131373465);
        ((AppCompatTextView)tuxTextView16).setBackgroundResource(2131233081);
        ((View)tuxTextView16).setVisibility(8);
        final ConstraintLayout.a a28 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a28)) {
            a28.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a28)) {
            a28.bottomToBottom = 2131372326;
        }
        if (ConstraintLayout.a.class.isInstance(a28)) {
            a28.endToStart = 2131365906;
        }
        if (ConstraintLayout.a.class.isInstance(a28)) {
            a28.startToEnd = 2131366372;
        }
        if (ConstraintLayout.a.class.isInstance(a28)) {
            a28.topToTop = 2131372326;
        }
        final k k13 = new k();
        k13.LIZ("app:tux_font", (a)new a.c("SmallText2_Regular"), tuxTextView16, (ViewGroup$LayoutParams)a28);
        k13.LIZ(tuxTextView16, (ViewGroup$LayoutParams)a28);
        b.LIZ((View)tuxTextView16);
        if (((View)tuxTextView16).getParent() == null) {
            constraintLayout.addView((View)tuxTextView16, (ViewGroup$LayoutParams)a28);
        }
        b.LIZ((View)constraintLayout);
        if (((View)constraintLayout).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)constraintLayout, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(7216);
        return (View)frameLayout;
    }
}
