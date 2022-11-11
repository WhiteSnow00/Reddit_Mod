// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout$LayoutParams;
import android.text.TextUtils$TruncateAt;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.ss.android.ugc.aweme.base.ui.b.c;
import com.bytedance.lighten.loader.SmartImageView;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.challenge.ui.v;
import android.view.b;
import android.util.TypedValue;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 193 implements 0IF
{
    static {
        Covode.recordClassIndex(1968);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(4781);
        final Resources resources = context.getResources();
        final FixedRatioFrameLayout fixedRatioFrameLayout = new FixedRatioFrameLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        final v v = new v();
        v.LIZ("app:frMode", (a)new a.c("fixed_width"), fixedRatioFrameLayout, (ViewGroup$LayoutParams)liz);
        v.LIZ("app:whRatio", (a)new a.c("0.75"), fixedRatioFrameLayout, (ViewGroup$LayoutParams)liz);
        final SmartImageView smartImageView = new SmartImageView(context);
        ((View)smartImageView).setId(2131364063);
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)fixedRatioFrameLayout, -1, -1);
        final c c = new c();
        c.LIZ("app:actualImageScaleType", (a)new a.c("centerCrop"), smartImageView, (ViewGroup$LayoutParams)liz2);
        c.LIZ("app:placeholderImage", (a)new a.b("2131099657", "color"), smartImageView, (ViewGroup$LayoutParams)liz2);
        c.LIZ("app:placeholderImageScaleType", (a)new a.c("centerInside"), smartImageView, (ViewGroup$LayoutParams)liz2);
        c.LIZ(smartImageView, (ViewGroup$LayoutParams)liz2);
        b.LIZ((View)smartImageView);
        if (((View)smartImageView).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)smartImageView, (ViewGroup$LayoutParams)liz2);
        }
        final Rhi rhi = new Rhi(context);
        ((View)rhi).setId(2131366862);
        ((ImageView)rhi).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz3 = b.LIZ((ViewGroup)fixedRatioFrameLayout, (int)TypedValue.applyDimension(1, 31.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz3)) {
            ((LinearLayout$LayoutParams)liz3).gravity = 8388661;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz3)) {
            ((FrameLayout$LayoutParams)liz3).gravity = 8388661;
        }
        if (092.d.class.isInstance(liz3)) {
            ((092.d)liz3).LIZ = 8388661;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz3)) {
            liz3.rightMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz3)) {
            liz3.topMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz3)) {
            liz3.setMarginEnd((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)rhi);
        if (((View)rhi).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)rhi, (ViewGroup$LayoutParams)liz3);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131367145);
        ((TextView)tuxTextView).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setMaxWidth((int)TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        ((View)tuxTextView).setVisibility(8);
        ((TextView)tuxTextView).setSingleLine(true);
        final ViewGroup$MarginLayoutParams liz4 = b.LIZ((ViewGroup)fixedRatioFrameLayout, -2, (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz4)) {
            ((LinearLayout$LayoutParams)liz4).gravity = 8388659;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz4)) {
            ((FrameLayout$LayoutParams)liz4).gravity = 8388659;
        }
        if (092.d.class.isInstance(liz4)) {
            ((092.d)liz4).LIZ = 8388659;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz4)) {
            liz4.leftMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz4)) {
            liz4.setMarginStart((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz4)) {
            liz4.topMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P1_Regular"), tuxTextView, (ViewGroup$LayoutParams)liz4);
        CTM.LIZ((Object)tuxTextView, (Object)liz4);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)liz4);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131367128);
        ((AppCompatTextView)tuxTextView2).setBackgroundResource(2131231887);
        ((TextView)tuxTextView2).setMaxEms(12);
        ((TextView)tuxTextView2).setPadding((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)tuxTextView2).getPaddingTop(), ((View)tuxTextView2).getPaddingRight(), ((View)tuxTextView2).getPaddingBottom());
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), ((View)tuxTextView2).getPaddingTop(), (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)tuxTextView2).getPaddingBottom());
        ((TextView)tuxTextView2).setPadding((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)tuxTextView2).getPaddingTop(), ((View)tuxTextView2).getPaddingRight(), ((View)tuxTextView2).getPaddingBottom());
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), ((View)tuxTextView2).getPaddingTop(), (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)tuxTextView2).getPaddingBottom());
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), ((View)tuxTextView2).getPaddingRight(), ((View)tuxTextView2).getPaddingBottom());
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), ((View)tuxTextView2).getPaddingTop(), ((View)tuxTextView2).getPaddingRight(), (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView2).setText(2131826990);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099685));
        ((View)tuxTextView2).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz5 = b.LIZ((ViewGroup)fixedRatioFrameLayout, -2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz5)) {
            ((LinearLayout$LayoutParams)liz5).gravity = 8388659;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz5)) {
            ((FrameLayout$LayoutParams)liz5).gravity = 8388659;
        }
        if (092.d.class.isInstance(liz5)) {
            ((092.d)liz5).LIZ = 8388659;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz5)) {
            liz5.leftMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz5)) {
            liz5.topMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView2).setGravity(17);
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz5)) {
            liz5.setMarginStart((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("P3_Semibold"), tuxTextView2, (ViewGroup$LayoutParams)liz5);
        CTM.LIZ((Object)tuxTextView2, (Object)liz5);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)liz5);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((View)tuxTextView3).setId(2131367129);
        ((AppCompatTextView)tuxTextView3).setBackgroundResource(2131231887);
        ((TextView)tuxTextView3).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView3).setLines(1);
        ((TextView)tuxTextView3).setSingleLine(true);
        ((TextView)tuxTextView3).setText(2131826992);
        ((TextView)tuxTextView3).setTextColor(resources.getColorStateList(2131099685));
        ((View)tuxTextView3).setVisibility(8);
        ((TextView)tuxTextView3).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView3).getPaddingTop(), ((View)tuxTextView3).getPaddingRight(), ((View)tuxTextView3).getPaddingBottom());
        ((TextView)tuxTextView3).setPadding(((View)tuxTextView3).getPaddingLeft(), ((View)tuxTextView3).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView3).getPaddingBottom());
        final ViewGroup$MarginLayoutParams liz6 = b.LIZ((ViewGroup)fixedRatioFrameLayout, -2, (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz6)) {
            ((LinearLayout$LayoutParams)liz6).gravity = 8388659;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz6)) {
            ((FrameLayout$LayoutParams)liz6).gravity = 8388659;
        }
        if (092.d.class.isInstance(liz6)) {
            ((092.d)liz6).LIZ = 8388659;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz6)) {
            liz6.setMarginStart((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz6)) {
            liz6.leftMargin = (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz6)) {
            liz6.setMarginEnd((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz6)) {
            liz6.rightMargin = (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz6)) {
            liz6.topMargin = (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView3).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P3_Semibold"), tuxTextView3, (ViewGroup$LayoutParams)liz6);
        CTM.LIZ((Object)tuxTextView3, (Object)liz6);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)tuxTextView3, (ViewGroup$LayoutParams)liz6);
        }
        final View view = new View(context);
        view.setId(2131362937);
        view.setVisibility(8);
        final ViewGroup$MarginLayoutParams liz7 = b.LIZ((ViewGroup)fixedRatioFrameLayout, -1, (int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz7)) {
            ((LinearLayout$LayoutParams)liz7).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz7)) {
            ((FrameLayout$LayoutParams)liz7).gravity = 80;
        }
        if (092.d.class.isInstance(liz7)) {
            ((092.d)liz7).LIZ = 80;
        }
        b.LIZ(view);
        if (view.getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView(view, (ViewGroup$LayoutParams)liz7);
        }
        final TuxTextView tuxTextView4 = new TuxTextView(context);
        ((View)tuxTextView4).setId(2131367584);
        ((TextView)tuxTextView4).setCompoundDrawablePadding((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView4).setTextColor(resources.getColorStateList(2131099685));
        ((View)tuxTextView4).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz8 = b.LIZ((ViewGroup)fixedRatioFrameLayout, -2, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(liz8)) {
            ((RelativeLayout$LayoutParams)liz8).addRule(20, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(liz8)) {
            ((RelativeLayout$LayoutParams)liz8).addRule(9, -1);
        }
        if (LinearLayout$LayoutParams.class.isInstance(liz8)) {
            ((LinearLayout$LayoutParams)liz8).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz8)) {
            ((FrameLayout$LayoutParams)liz8).gravity = 80;
        }
        if (092.d.class.isInstance(liz8)) {
            ((092.d)liz8).LIZ = 80;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz8)) {
            liz8.setMarginStart((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz8)) {
            liz8.leftMargin = (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz8)) {
            liz8.bottomMargin = (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView4).setGravity(16);
        new k().LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView4, (ViewGroup$LayoutParams)liz8);
        ((AppCompatTextView)tuxTextView4).setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131233105), null, null, null);
        CTM.LIZ((Object)tuxTextView4, (Object)liz8);
        b.LIZ((View)tuxTextView4);
        if (((View)tuxTextView4).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)tuxTextView4, (ViewGroup$LayoutParams)liz8);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131374168);
        ((ImageView)4fg).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz9 = b.LIZ((ViewGroup)fixedRatioFrameLayout, (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(liz9)) {
            ((RelativeLayout$LayoutParams)liz9).addRule(20, -1);
        }
        if (LinearLayout$LayoutParams.class.isInstance(liz9)) {
            ((LinearLayout$LayoutParams)liz9).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz9)) {
            ((FrameLayout$LayoutParams)liz9).gravity = 80;
        }
        if (092.d.class.isInstance(liz9)) {
            ((092.d)liz9).LIZ = 80;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz9)) {
            liz9.setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz9)) {
            liz9.bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755679", "raw"), 4fg, (ViewGroup$LayoutParams)liz9);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)liz9);
        CTM.LIZ((Object)4fg, (Object)liz9);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)4fg, (ViewGroup$LayoutParams)liz9);
        }
        final TuxTextView tuxTextView5 = new TuxTextView(context);
        ((View)tuxTextView5).setId(2131374167);
        ((TextView)tuxTextView5).setTextColor(resources.getColorStateList(2131099685));
        ((View)tuxTextView5).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz10 = b.LIZ((ViewGroup)fixedRatioFrameLayout, -2, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(liz10)) {
            ((RelativeLayout$LayoutParams)liz10).addRule(20, -1);
        }
        if (LinearLayout$LayoutParams.class.isInstance(liz10)) {
            ((LinearLayout$LayoutParams)liz10).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz10)) {
            ((FrameLayout$LayoutParams)liz10).gravity = 80;
        }
        if (092.d.class.isInstance(liz10)) {
            ((092.d)liz10).LIZ = 80;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz10)) {
            liz10.setMarginStart((int)TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz10)) {
            liz10.bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView5).setGravity(16);
        new k().LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView5, (ViewGroup$LayoutParams)liz10);
        CTM.LIZ((Object)tuxTextView5, (Object)liz10);
        b.LIZ((View)tuxTextView5);
        if (((View)tuxTextView5).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)tuxTextView5, (ViewGroup$LayoutParams)liz10);
        }
        final TuxTextView tuxTextView6 = new TuxTextView(context);
        ((View)tuxTextView6).setId(2131372089);
        ((TextView)tuxTextView6).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView6).setMaxLines(1);
        ((TextView)tuxTextView6).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView6).getPaddingTop(), ((View)tuxTextView6).getPaddingRight(), ((View)tuxTextView6).getPaddingBottom());
        ((TextView)tuxTextView6).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView6).getPaddingTop(), ((View)tuxTextView6).getPaddingRight(), ((View)tuxTextView6).getPaddingBottom());
        ((TextView)tuxTextView6).setPadding(((View)tuxTextView6).getPaddingLeft(), ((View)tuxTextView6).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView6).getPaddingBottom());
        ((TextView)tuxTextView6).setPadding(((View)tuxTextView6).getPaddingLeft(), ((View)tuxTextView6).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView6).getPaddingBottom());
        ((TextView)tuxTextView6).setPadding(((View)tuxTextView6).getPaddingLeft(), (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), ((View)tuxTextView6).getPaddingRight(), ((View)tuxTextView6).getPaddingBottom());
        ((TextView)tuxTextView6).setPadding(((View)tuxTextView6).getPaddingLeft(), ((View)tuxTextView6).getPaddingTop(), ((View)tuxTextView6).getPaddingRight(), (int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968628 });
        ((TextView)tuxTextView6).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((AppCompatTextView)tuxTextView6).setBackgroundResource(2131231875);
        ((View)tuxTextView6).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz11 = b.LIZ((ViewGroup)fixedRatioFrameLayout, -2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz11)) {
            ((LinearLayout$LayoutParams)liz11).gravity = 8388661;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz11)) {
            ((FrameLayout$LayoutParams)liz11).gravity = 8388661;
        }
        if (092.d.class.isInstance(liz11)) {
            ((092.d)liz11).LIZ = 8388661;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz11)) {
            liz11.rightMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz11)) {
            liz11.setMarginEnd((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz11)) {
            liz11.topMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView6, (ViewGroup$LayoutParams)liz11);
        CTM.LIZ((Object)tuxTextView6, (Object)liz11);
        b.LIZ((View)tuxTextView6);
        if (((View)tuxTextView6).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)tuxTextView6, (ViewGroup$LayoutParams)liz11);
        }
        final ViewStub viewStub = new ViewStub(context);
        ((View)viewStub).setId(2131371808);
        viewStub.setInflatedId(2131365015);
        final ViewGroup$MarginLayoutParams liz12 = b.LIZ((ViewGroup)fixedRatioFrameLayout, -1, -1);
        b.LIZ((View)viewStub);
        if (((View)viewStub).getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView((View)viewStub, (ViewGroup$LayoutParams)liz12);
        }
        final View liz13 = 0I8.LIZ(context, 2131559583, (ViewGroup)fixedRatioFrameLayout, false, 2131559563);
        if (liz13.getParent() == null) {
            ((ViewGroup)fixedRatioFrameLayout).addView(liz13);
        }
        CTM.LIZ((Object)fixedRatioFrameLayout, (Object)liz);
        b.LIZ((View)fixedRatioFrameLayout);
        ((View)fixedRatioFrameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)fixedRatioFrameLayout);
        }
        MethodCollector.o(4781);
        return (View)fixedRatioFrameLayout;
    }
}
