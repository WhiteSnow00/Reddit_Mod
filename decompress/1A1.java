// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.tux.a.h.i;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.RelativeLayout;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1A1 implements 0IF
{
    static {
        Covode.recordClassIndex(2028);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(126);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        ((View)relativeLayout).setId(2131365000);
        ((View)relativeLayout).setBackgroundResource(2131231712);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams).topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        final SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        ((View)smartAvatarImageView).setId(2131371243);
        ((ImageView)smartAvatarImageView).setVisibility(0);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams).setMarginStart((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams).leftMargin = (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams).topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams).bottomMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)smartAvatarImageView);
        if (((View)smartAvatarImageView).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)smartAvatarImageView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373531);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setMaxLines(1);
        ((TextView)tuxTextView).setText((CharSequence)"yyggpppjjllLL");
        ((View)tuxTextView).setTextAlignment(5);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(21, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(9, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(11, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(20, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(10, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).setMarginEnd((int)TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).leftMargin = (int)TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).rightMargin = (int)TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView).setGravity(8388611);
        new k().LIZ("app:tux_font", (a)new a.c("H4_Bold"), tuxTextView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)relativeLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131373532);
        ((TextView)tuxTextView2).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView2).setMaxLines(2);
        ((TextView)tuxTextView2).setText(2131820913);
        ((View)tuxTextView2).setTextAlignment(5);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099685));
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout$LayoutParams(-2, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(21, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(9, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(11, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(20, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(10, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams3).bottomMargin = (int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams3).setMarginEnd((int)TypedValue.applyDimension(1, 93.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams3).leftMargin = (int)TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams3).rightMargin = (int)TypedValue.applyDimension(1, 93.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams3).setMarginStart((int)TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams3).topMargin = (int)TypedValue.applyDimension(1, 34.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView2).setGravity(8388611);
        new k().LIZ("app:tux_font", (a)new a.c("SmallText1_Regular"), tuxTextView2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        CTM.LIZ((Object)tuxTextView2, (Object)relativeLayout$LayoutParams3);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        }
        final RelativeLayout relativeLayout2 = new RelativeLayout(context);
        ((View)relativeLayout2).setId(2131373152);
        ((View)relativeLayout2).setBackgroundResource(2131231781);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(11, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(21, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams4).rightMargin = (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams4).setMarginEnd((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(10, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams4).topMargin = (int)TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(15, -1);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131365463);
        ((TextView)tuxTextView3).setMaxLines(1);
        ((TextView)tuxTextView3).setText(2131827709);
        ((TextView)tuxTextView3).setAllCaps(false);
        ((TextView)tuxTextView3).setTextColor(resources.getColorStateList(2131099659));
        ((AppCompatTextView)tuxTextView3).setAutoSizeTextTypeWithDefaults(1);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            relativeLayout$LayoutParams5.addRule(11, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            relativeLayout$LayoutParams5.addRule(21, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams5).rightMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams5).setMarginEnd((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            relativeLayout$LayoutParams5.addRule(10, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams5).topMargin = (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams5)) {
            relativeLayout$LayoutParams5.addRule(15, -1);
        }
        ((TextView)tuxTextView3).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P1_Semibold"), tuxTextView3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams5);
        ((AppCompatTextView)tuxTextView3).setAutoSizeTextTypeUniformWithConfiguration(10, 14, 1, 1);
        CTM.LIZ((Object)tuxTextView3, (Object)relativeLayout$LayoutParams5);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)relativeLayout2).addView((View)tuxTextView3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams5);
        }
        b.LIZ((View)relativeLayout2);
        if (((View)relativeLayout2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)relativeLayout2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        }
        final RelativeLayout relativeLayout3 = new RelativeLayout(context);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 126.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            relativeLayout$LayoutParams6.addRule(21, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            relativeLayout$LayoutParams6.addRule(11, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            relativeLayout$LayoutParams6.addRule(15, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams6).setMarginEnd((int)TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams6).rightMargin = (int)TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics());
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131368516);
        ((View)4fg).setAlpha(0.0f);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams7 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams7)) {
            relativeLayout$LayoutParams7.addRule(21, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams7)) {
            relativeLayout$LayoutParams7.addRule(11, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams7)) {
            relativeLayout$LayoutParams7.addRule(15, -1);
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755277", "raw"), 4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams7);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams7);
        CTM.LIZ((Object)4fg, (Object)relativeLayout$LayoutParams7);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)relativeLayout3).addView((View)4fg, (ViewGroup$LayoutParams)relativeLayout$LayoutParams7);
        }
        b.LIZ((View)relativeLayout3);
        if (((View)relativeLayout3).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)relativeLayout3, (ViewGroup$LayoutParams)relativeLayout$LayoutParams6);
        }
        b.LIZ((View)relativeLayout);
        if (((View)relativeLayout).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)relativeLayout, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final RelativeLayout relativeLayout4 = new RelativeLayout(context);
        ((View)relativeLayout4).setId(2131370093);
        ((View)relativeLayout4).setElevation(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        ((View)relativeLayout4).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        final 39D 39D = new 39D(context);
        ((View)39D).setId(2131370094);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams8 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams8).setMargins((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)39D);
        if (((View)39D).getParent() == null) {
            ((ViewGroup)relativeLayout4).addView((View)39D, (ViewGroup$LayoutParams)relativeLayout$LayoutParams8);
        }
        final TuxTextView tuxTextView4 = new TuxTextView(context);
        ((View)tuxTextView4).setId(2131370095);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968627 });
        ((TextView)tuxTextView4).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((TextView)tuxTextView4).setSingleLine(true);
        ((TextView)tuxTextView4).setEllipsize(TextUtils$TruncateAt.END);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams9 = new RelativeLayout$LayoutParams(-2, -2);
        final k k = new k();
        k.LIZ("app:tux_font", (a)new a.c("H4_Regular"), tuxTextView4, (ViewGroup$LayoutParams)relativeLayout$LayoutParams9);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams9)) {
            relativeLayout$LayoutParams9.addRule(15, -1);
        }
        k.LIZ("app:tux_minTextSize", (a)new a.d("12", "dp"), tuxTextView4, (ViewGroup$LayoutParams)relativeLayout$LayoutParams9);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams9)) {
            relativeLayout$LayoutParams9.addRule(17, 2131370094);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams9)) {
            relativeLayout$LayoutParams9.addRule(16, 2131364805);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams9)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams9).setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        CTM.LIZ((Object)tuxTextView4, (Object)relativeLayout$LayoutParams9);
        b.LIZ((View)tuxTextView4);
        if (((View)tuxTextView4).getParent() == null) {
            ((ViewGroup)relativeLayout4).addView((View)tuxTextView4, (ViewGroup$LayoutParams)relativeLayout$LayoutParams9);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131364805);
        linearLayout.setOrientation(0);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams10 = new RelativeLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams10)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams10).setMarginStart((int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams10)) {
            relativeLayout$LayoutParams10.addRule(21, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams10)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams10).setMarginEnd((int)TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams10)) {
            relativeLayout$LayoutParams10.addRule(15, -1);
        }
        final 4x1 4x1 = new 4x1(context);
        ((View)4x1).setId(2131364794);
        ((AppCompatTextView)4x1).setTextSize(1, 28.0f);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 16;
        }
        b.LIZ((View)4x1);
        if (((View)4x1).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4x1, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final 4x1 4x2 = new 4x1(context);
        ((View)4x2).setId(2131364795);
        ((AppCompatTextView)4x2).setTextSize(1, 28.0f);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 16;
        }
        b.LIZ((View)4x2);
        if (((View)4x2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4x2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            ((ViewGroup)relativeLayout4).addView((View)linearLayout, (ViewGroup$LayoutParams)relativeLayout$LayoutParams10);
        }
        b.LIZ((View)relativeLayout4);
        if (((View)relativeLayout4).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)relativeLayout4, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(126);
        return (View)frameLayout;
    }
}
