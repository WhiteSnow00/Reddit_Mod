// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.base.ui.b.c;
import com.bytedance.lighten.loader.SmartImageView;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1A7 implements 0IF
{
    static {
        Covode.recordClassIndex(2034);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(5722);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((ViewGroup)frameLayout).setClipChildren(false);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(2131368423);
        constraintLayout.setClipChildren(false);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        final FrameLayout frameLayout2 = new FrameLayout(context);
        ((View)frameLayout2).setId(2131368433);
        final ConstraintLayout.a a = new ConstraintLayout.a(-1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(a)) {
            ((LinearLayout$LayoutParams)a).gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a)) {
            ((FrameLayout$LayoutParams)a).gravity = 1;
        }
        if (092.d.class.isInstance(a)) {
            ((092.d)a).LIZ = 1;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.topMargin = (int)TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics());
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
        final SmartImageView smartImageView = new SmartImageView(context);
        ((View)smartImageView).setId(2131368439);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -2);
        final c c = new c();
        c.LIZ("app:roundedCornerRadius", (a)new a.d("6", "dp"), smartImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        c.LIZ("app:viewAspectRatio", (a)new a.c("1.0"), smartImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        c.LIZ(smartImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        b.LIZ((View)smartImageView);
        if (((View)smartImageView).getParent() == null) {
            ((ViewGroup)frameLayout2).addView((View)smartImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131368442);
        ((ImageView)4fg).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams3).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            frameLayout$LayoutParams3.gravity = 17;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams3)) {
            ((092.d)frameLayout$LayoutParams3).LIZ = 17;
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755681", "raw"), 4fg, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        i.LIZ("app:tux_iconHeight", (a)new a.d("32", "dp"), 4fg, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        i.LIZ("app:tux_iconWidth", (a)new a.d("32", "dp"), 4fg, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        CTM.LIZ((Object)4fg, (Object)frameLayout$LayoutParams3);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)frameLayout2).addView((View)4fg, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        b.LIZ((View)frameLayout2);
        if (((View)frameLayout2).getParent() == null) {
            constraintLayout.addView((View)frameLayout2, (ViewGroup$LayoutParams)a);
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ((View)frameLayout3).setId(2131368434);
        ((ViewGroup)frameLayout3).setClipChildren(false);
        ((View)frameLayout3).setVisibility(8);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.bottomToBottom = 2131368436;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToEnd = 2131368441;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.startToStart = 2131368441;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToTop = 2131368436;
        }
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setId(2131368443);
        final FrameLayout$LayoutParams frameLayout$LayoutParams4 = new FrameLayout$LayoutParams(-1, -1);
        final i j = new i();
        j.LIZ("app:tux_icon", (a)new a.b("2131755096", "raw"), 4fg2, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        j.LIZ("app:tux_iconHeight", (a)new a.d("35", "dp"), 4fg2, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        j.LIZ("app:tux_iconWidth", (a)new a.d("35", "dp"), 4fg2, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        j.LIZ("app:tux_tintColor", (a)new a.b("2130968630", "attr"), 4fg2, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        CTM.LIZ((Object)4fg2, (Object)frameLayout$LayoutParams4);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            ((ViewGroup)frameLayout3).addView((View)4fg2, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        }
        final 4fg 4fg3 = new 4fg(context);
        ((View)4fg3).setId(2131368438);
        final FrameLayout$LayoutParams frameLayout$LayoutParams5 = new FrameLayout$LayoutParams(-1, -1);
        final i k = new i();
        k.LIZ("app:tux_icon", (a)new a.b("2131755096", "raw"), 4fg3, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        k.LIZ("app:tux_iconHeight", (a)new a.d("35", "dp"), 4fg3, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        k.LIZ("app:tux_iconWidth", (a)new a.d("35", "dp"), 4fg3, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        k.LIZ("app:tux_tintColor", (a)new a.b("2130968630", "attr"), 4fg3, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        CTM.LIZ((Object)4fg3, (Object)frameLayout$LayoutParams5);
        b.LIZ((View)4fg3);
        if (((View)4fg3).getParent() == null) {
            ((ViewGroup)frameLayout3).addView((View)4fg3, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        }
        b.LIZ((View)frameLayout3);
        if (((View)frameLayout3).getParent() == null) {
            constraintLayout.addView((View)frameLayout3, (ViewGroup$LayoutParams)a2);
        }
        final 4fg 4fg4 = new 4fg(context);
        ((View)4fg4).setId(2131368441);
        ((ImageView)4fg4).setVisibility(8);
        final ConstraintLayout.a a3 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.topMargin = (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginEnd((int)TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToBottom = 2131368434;
        }
        final i l = new i();
        l.LIZ("app:tux_icon", (a)new a.b("2131755432", "raw"), 4fg4, (ViewGroup$LayoutParams)a3);
        l.LIZ("app:tux_iconHeight", (a)new a.d("35", "dp"), 4fg4, (ViewGroup$LayoutParams)a3);
        l.LIZ("app:tux_iconWidth", (a)new a.d("35", "dp"), 4fg4, (ViewGroup$LayoutParams)a3);
        l.LIZ("app:tux_tintColor", (a)new a.b("2130968630", "attr"), 4fg4, (ViewGroup$LayoutParams)a3);
        CTM.LIZ((Object)4fg4, (Object)a3);
        b.LIZ((View)4fg4);
        if (((View)4fg4).getParent() == null) {
            constraintLayout.addView((View)4fg4, (ViewGroup$LayoutParams)a3);
        }
        final FrameLayout frameLayout4 = new FrameLayout(context);
        ((View)frameLayout4).setId(2131368436);
        final ConstraintLayout.a a4 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 31.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a4)) {
            a4.setMarginStart((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a4)) {
            a4.topMargin = (int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a4)) {
            a4.setMarginEnd((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.endToStart = 2131368434;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.topToBottom = 2131368433;
        }
        b.LIZ((View)frameLayout4);
        if (((View)frameLayout4).getParent() == null) {
            constraintLayout.addView((View)frameLayout4, (ViewGroup$LayoutParams)a4);
        }
        final SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        ((View)smartAvatarImageView).setId(2131368437);
        ((ImageView)smartAvatarImageView).setVisibility(8);
        final ConstraintLayout.a a5 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a5)) {
            a5.setMarginStart((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.bottomToBottom = 2131368441;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.topToTop = 2131368441;
        }
        b.LIZ((View)smartAvatarImageView);
        if (((View)smartAvatarImageView).getParent() == null) {
            constraintLayout.addView((View)smartAvatarImageView, (ViewGroup$LayoutParams)a5);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131368444);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setMaxLines(1);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968629 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final ConstraintLayout.a a6 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a6)) {
            a6.setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        ((TextView)tuxTextView).setGravity(16);
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.bottomToBottom = 2131368441;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.endToStart = 2131368435;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.horizontalBias = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.horizontalChainStyle = 2;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.startToEnd = 2131368437;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.topToTop = 2131368441;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.matchConstraintDefaultWidth = 1;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.goneStartMargin = (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (a)new a.c("H3_Semibold"), tuxTextView, (ViewGroup$LayoutParams)a6);
        CTM.LIZ((Object)tuxTextView, (Object)a6);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout.addView((View)tuxTextView, (ViewGroup$LayoutParams)a6);
        }
        final FrameLayout frameLayout5 = new FrameLayout(context);
        ((View)frameLayout5).setId(2131368435);
        final ConstraintLayout.a a7 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.bottomToBottom = 2131368441;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.endToEnd = 2131368436;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.startToEnd = 2131368444;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            a7.topToTop = 2131368441;
        }
        final VJn vJn = new VJn(context);
        ((View)vJn).setId(2131368440);
        final FrameLayout$LayoutParams frameLayout$LayoutParams6 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams6)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams6).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams6)) {
            frameLayout$LayoutParams6.gravity = 17;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams6)) {
            ((092.d)frameLayout$LayoutParams6).LIZ = 17;
        }
        b.LIZ((View)vJn);
        if (((View)vJn).getParent() == null) {
            ((ViewGroup)frameLayout5).addView((View)vJn, (ViewGroup$LayoutParams)frameLayout$LayoutParams6);
        }
        b.LIZ((View)frameLayout5);
        if (((View)frameLayout5).getParent() == null) {
            constraintLayout.addView((View)frameLayout5, (ViewGroup$LayoutParams)a7);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131368426);
        linearLayout.setOrientation(0);
        final ConstraintLayout.a a8 = new ConstraintLayout.a(-1, (int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a8)) {
            a8.bottomMargin = (int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a8)) {
            a8.setMarginStart((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a8)) {
            a8.setMarginEnd((int)TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            a8.startToStart = 0;
        }
        final 4fg 4fg5 = new 4fg(context);
        ((View)4fg5).setId(2131368425);
        ((ImageView)4fg5).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 8388627;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 8388627;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 8388627;
        }
        final i m = new i();
        m.LIZ("app:tux_icon", (a)new a.b("2131755681", "raw"), 4fg5, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        m.LIZ("app:tux_iconHeight", (a)new a.d("25", "dp"), 4fg5, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        m.LIZ("app:tux_iconWidth", (a)new a.d("25", "dp"), 4fg5, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).setMarginEnd((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        m.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg5, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)4fg5, (Object)linearLayout$LayoutParams);
        b.LIZ((View)4fg5);
        if (((View)4fg5).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg5, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final FrameLayout frameLayout6 = new FrameLayout(context);
        ((View)frameLayout6).setId(2131368427);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-1, -1);
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131368424);
        ((TextView)tuxTextView2).setShadowLayer(((TextView)tuxTextView2).getShadowRadius(), ((TextView)tuxTextView2).getShadowDx(), ((TextView)tuxTextView2).getShadowDy(), b.LIZ(context));
        ((TextView)tuxTextView2).setShadowLayer(((TextView)tuxTextView2).getShadowRadius(), 0.0f, ((TextView)tuxTextView2).getShadowDy(), ((TextView)tuxTextView2).getShadowColor());
        ((TextView)tuxTextView2).setShadowLayer(((TextView)tuxTextView2).getShadowRadius(), ((TextView)tuxTextView2).getShadowDx(), 2.0f, ((TextView)tuxTextView2).getShadowColor());
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968629 });
        ((TextView)tuxTextView2).setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        final FrameLayout$LayoutParams frameLayout$LayoutParams7 = new FrameLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams7)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams7).gravity = 8388659;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams7)) {
            frameLayout$LayoutParams7.gravity = 8388659;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams7)) {
            ((092.d)frameLayout$LayoutParams7).LIZ = 8388659;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams7).topMargin = (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams7).setMarginStart((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("SmallText2_Regular"), tuxTextView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams7);
        CTM.LIZ((Object)tuxTextView2, (Object)frameLayout$LayoutParams7);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)frameLayout6).addView((View)tuxTextView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams7);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131368428);
        ((TextView)tuxTextView3).setShadowLayer(((TextView)tuxTextView3).getShadowRadius(), ((TextView)tuxTextView3).getShadowDx(), ((TextView)tuxTextView3).getShadowDy(), b.LIZ(context));
        ((TextView)tuxTextView3).setShadowLayer(((TextView)tuxTextView3).getShadowRadius(), 0.0f, ((TextView)tuxTextView3).getShadowDy(), ((TextView)tuxTextView3).getShadowColor());
        ((TextView)tuxTextView3).setShadowLayer(((TextView)tuxTextView3).getShadowRadius(), ((TextView)tuxTextView3).getShadowDx(), 2.0f, ((TextView)tuxTextView3).getShadowColor());
        final TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[] { 2130968629 });
        ((TextView)tuxTextView3).setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        final FrameLayout$LayoutParams frameLayout$LayoutParams8 = new FrameLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams8).gravity = 8388661;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            frameLayout$LayoutParams8.gravity = 8388661;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams8)) {
            ((092.d)frameLayout$LayoutParams8).LIZ = 8388661;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams8).topMargin = (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams8).setMarginEnd((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("SmallText2_Regular"), tuxTextView3, (ViewGroup$LayoutParams)frameLayout$LayoutParams8);
        CTM.LIZ((Object)tuxTextView3, (Object)frameLayout$LayoutParams8);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)frameLayout6).addView((View)tuxTextView3, (ViewGroup$LayoutParams)frameLayout$LayoutParams8);
        }
        b.LIZ((View)frameLayout6);
        if (((View)frameLayout6).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)frameLayout6, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            constraintLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)a8);
        }
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131368430);
        linearLayout2.setOrientation(0);
        ((View)linearLayout2).setVisibility(8);
        final ConstraintLayout.a a9 = new ConstraintLayout.a(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(a9)) {
            ((LinearLayout$LayoutParams)a9).gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(a9)) {
            ((FrameLayout$LayoutParams)a9).gravity = 1;
        }
        if (092.d.class.isInstance(a9)) {
            ((092.d)a9).LIZ = 1;
        }
        linearLayout2.setGravity(17);
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.bottomToTop = 2131368426;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.endToEnd = 2131368426;
        }
        if (ConstraintLayout.a.class.isInstance(a9)) {
            a9.startToStart = 2131368426;
        }
        final TuxTextView tuxTextView4 = new TuxTextView(context);
        ((View)tuxTextView4).setId(2131368429);
        final TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[] { 2130968627 });
        ((TextView)tuxTextView4).setTextColor(obtainStyledAttributes4.getColor(0, 0));
        obtainStyledAttributes4.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("H1_Bold"), tuxTextView4, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        CTM.LIZ((Object)tuxTextView4, (Object)linearLayout$LayoutParams3);
        b.LIZ((View)tuxTextView4);
        if (((View)tuxTextView4).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView4, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final TuxTextView tuxTextView5 = new TuxTextView(context);
        ((View)tuxTextView5).setId(2131368431);
        final TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[] { 2130968627 });
        ((TextView)tuxTextView5).setTextColor(obtainStyledAttributes5.getColor(0, 0));
        obtainStyledAttributes5.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginStart((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginEnd((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("H3_Semibold"), tuxTextView5, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        CTM.LIZ((Object)tuxTextView5, (Object)linearLayout$LayoutParams4);
        b.LIZ((View)tuxTextView5);
        if (((View)tuxTextView5).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView5, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        final TuxTextView tuxTextView6 = new TuxTextView(context);
        ((View)tuxTextView6).setId(2131368432);
        final TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[] { 2130968629 });
        ((TextView)tuxTextView6).setTextColor(obtainStyledAttributes6.getColor(0, 0));
        obtainStyledAttributes6.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("H1_Bold"), tuxTextView6, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        CTM.LIZ((Object)tuxTextView6, (Object)linearLayout$LayoutParams5);
        b.LIZ((View)tuxTextView6);
        if (((View)tuxTextView6).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView6, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            constraintLayout.addView((View)linearLayout2, (ViewGroup$LayoutParams)a9);
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
        MethodCollector.o(5722);
        return (View)frameLayout;
    }
}
