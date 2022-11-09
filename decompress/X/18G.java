// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.business.a.c;
import android.view.ViewGroup$MarginLayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import android.util.TypedValue;
import android.text.TextUtils$TruncateAt;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18g implements 0IF
{
    static {
        Covode.recordClassIndex(1945);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(10191);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131364273);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131364293);
        linearLayout2.setOrientation(1);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-2, -2);
        final AmF amF = new AmF(context);
        ((View)amF).setId(2131364263);
        ((TextView)amF).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)amF).setIncludeFontPadding(false);
        ((View)amF).setVerticalFadingEdgeEnabled(true);
        ((TextView)amF).setMaxLines(4);
        ((TextView)amF).setShadowLayer(((TextView)amF).getShadowRadius(), ((TextView)amF).getShadowDx(), ((TextView)amF).getShadowDy(), resources.getColor(2131100041));
        ((TextView)amF).setShadowLayer(((TextView)amF).getShadowRadius(), ((TextView)amF).getShadowDx(), 1.0f, ((TextView)amF).getShadowColor());
        ((TextView)amF).setShadowLayer(1.0f, ((TextView)amF).getShadowDx(), ((TextView)amF).getShadowDy(), ((TextView)amF).getShadowColor());
        ((View)amF).setTextAlignment(5);
        ((TextView)amF).setTextColor(resources.getColorStateList(2131099686));
        ((AppCompatTextView)amF).setTextSize(2, 15.0f);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 16;
        }
        ((TextView)amF).setGravity(8388611);
        ((View)amF).setFadingEdgeLength((int)resources.getDimension(2131165453));
        ((TextView)amF).setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        b.LIZ((View)amF);
        if (((View)amF).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)amF, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final View view = new View(context);
        view.setId(2131372406);
        view.setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        b.LIZ(view);
        if (view.getParent() == null) {
            ((ViewGroup)linearLayout2).addView(view, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)linearLayout2, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373660);
        ((TextView)tuxTextView).setText(2131825411);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099686));
        ((View)tuxTextView).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams2).gravity = 8388693;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            frameLayout$LayoutParams2.gravity = 8388693;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams2)) {
            ((092.d)frameLayout$LayoutParams2).LIZ = 8388693;
        }
        new k().LIZ("app:tux_font", (a)new a.c("H3_Semibold"), tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)frameLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        b.LIZ((View)frameLayout);
        if (((View)frameLayout).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)frameLayout, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131369100);
        ((AppCompatTextView)tuxTextView2).setTextSize(2, 15.0f);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099686));
        ((TextView)tuxTextView2).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView2).setMaxLines(1);
        ((View)tuxTextView2).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        final PIQ piq = new PIQ(context);
        ((View)piq).setId(2131369101);
        ((View)piq).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            linearLayout$LayoutParams5.gravity = 8388627;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams5).gravity = 8388627;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams5)) {
            ((092.d)linearLayout$LayoutParams5).LIZ = 8388627;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams5).topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams5).bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)piq);
        if (((View)piq).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)piq, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131369868);
        ((TextView)tuxTextView3).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView3).getPaddingTop(), ((View)tuxTextView3).getPaddingRight(), ((View)tuxTextView3).getPaddingBottom());
        ((TextView)tuxTextView3).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView3).getPaddingTop(), ((View)tuxTextView3).getPaddingRight(), ((View)tuxTextView3).getPaddingBottom());
        ((TextView)tuxTextView3).setPadding(((View)tuxTextView3).getPaddingLeft(), ((View)tuxTextView3).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView3).getPaddingBottom());
        ((TextView)tuxTextView3).setPadding(((View)tuxTextView3).getPaddingLeft(), ((View)tuxTextView3).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView3).getPaddingBottom());
        ((TextView)tuxTextView3).setPadding(((View)tuxTextView3).getPaddingLeft(), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), ((View)tuxTextView3).getPaddingRight(), ((View)tuxTextView3).getPaddingBottom());
        ((TextView)tuxTextView3).setPadding(((View)tuxTextView3).getPaddingLeft(), ((View)tuxTextView3).getPaddingTop(), ((View)tuxTextView3).getPaddingRight(), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        ((View)tuxTextView3).setVisibility(8);
        ((TextView)tuxTextView3).setMaxLines(1);
        ((TextView)tuxTextView3).setEllipsize(TextUtils$TruncateAt.END);
        ((View)tuxTextView3).setClickable(false);
        final LinearLayout$LayoutParams linearLayout$LayoutParams6 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams6).topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (a)new a.c("SmallText2_Semibold"), tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        CTM.LIZ((Object)tuxTextView3, (Object)linearLayout$LayoutParams6);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        }
        final C9f c9f = new C9f(context);
        ((View)c9f).setId(2131372586);
        ((TextView)c9f).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)c9f).getPaddingTop(), ((View)c9f).getPaddingRight(), ((View)c9f).getPaddingBottom());
        ((TextView)c9f).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)c9f).getPaddingTop(), ((View)c9f).getPaddingRight(), ((View)c9f).getPaddingBottom());
        ((TextView)c9f).setPadding(((View)c9f).getPaddingLeft(), ((View)c9f).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)c9f).getPaddingBottom());
        ((TextView)c9f).setPadding(((View)c9f).getPaddingLeft(), ((View)c9f).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)c9f).getPaddingBottom());
        ((TextView)c9f).setPadding(((View)c9f).getPaddingLeft(), (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), ((View)c9f).getPaddingRight(), ((View)c9f).getPaddingBottom());
        ((TextView)c9f).setPadding(((View)c9f).getPaddingLeft(), ((View)c9f).getPaddingTop(), ((View)c9f).getPaddingRight(), (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        ((View)c9f).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams7 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams7).topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        final c c = new c();
        c.LIZ("app:tux_tagIsHollow", (a)new a.c("true"), c9f, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        c.LIZ("app:tux_tagSize", (a)new a.c("tiny"), c9f, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams7).bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        c.LIZ("app:tux_tagTextColor", (a)new a.b("2131099677", "color"), c9f, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        c.LIZ("app:tux_tagIconColor", (a)new a.b("2131099677", "color"), c9f, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        CTM.LIZ((Object)c9f, (Object)linearLayout$LayoutParams7);
        b.LIZ((View)c9f);
        if (((View)c9f).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)c9f, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        }
        final AnP anP = new AnP(context);
        ((View)anP).setId(2131372612);
        ((View)anP).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams8 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams8).topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)anP);
        if (((View)anP).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)anP, (ViewGroup$LayoutParams)linearLayout$LayoutParams8);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(10191);
        return (View)linearLayout;
    }
}
