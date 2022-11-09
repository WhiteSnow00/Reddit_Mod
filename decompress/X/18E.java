// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import android.view.ViewGroup$MarginLayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18e implements 0IF
{
    static {
        Covode.recordClassIndex(1943);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(5985);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131363781);
        ((View)linearLayout).setFocusable(false);
        ((View)linearLayout).setFocusableInTouchMode(false);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setBackgroundResource(2131231699);
        ((View)frameLayout).setPadding((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        ((View)frameLayout).setId(2131363700);
        ((View)frameLayout).setFocusable(false);
        ((View)frameLayout).setFocusableInTouchMode(false);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 8388613;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 8388613;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 8388613;
        }
        final FrameLayout frameLayout2 = new FrameLayout(context);
        ((View)frameLayout2).setId(2131363719);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        ((View)appCompatImageView).setId(2131363718);
        ((View)appCompatImageView).setFocusable(false);
        ((View)appCompatImageView).setFocusableInTouchMode(false);
        appCompatImageView.setImageResource(2131233099);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams2).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            frameLayout$LayoutParams2.gravity = 17;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams2)) {
            ((092.d)frameLayout$LayoutParams2).LIZ = 17;
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            ((ViewGroup)frameLayout2).addView((View)appCompatImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        final AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        ((View)appCompatImageView2).setId(2131363714);
        appCompatImageView2.setImageResource(2131232389);
        appCompatImageView2.setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams3).gravity = 8388613;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            frameLayout$LayoutParams3.gravity = 8388613;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams3)) {
            ((092.d)frameLayout$LayoutParams3).LIZ = 8388613;
        }
        b.LIZ((View)appCompatImageView2);
        if (((View)appCompatImageView2).getParent() == null) {
            ((ViewGroup)frameLayout2).addView((View)appCompatImageView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        b.LIZ((View)frameLayout2);
        if (((View)frameLayout2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)frameLayout2, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131363709);
        ((View)tuxTextView).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams4 = new FrameLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams4)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams4).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams4)) {
            frameLayout$LayoutParams4.gravity = 17;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams4)) {
            ((092.d)frameLayout$LayoutParams4).LIZ = 17;
        }
        ((TextView)tuxTextView).setGravity(17);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        }
        b.LIZ((View)frameLayout);
        if (((View)frameLayout).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)frameLayout, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((TextView)tuxTextView2).setShadowLayer(2.0f, ((TextView)tuxTextView2).getShadowDx(), ((TextView)tuxTextView2).getShadowDy(), ((TextView)tuxTextView2).getShadowColor());
        ((TextView)tuxTextView2).setShadowLayer(((TextView)tuxTextView2).getShadowRadius(), ((TextView)tuxTextView2).getShadowDx(), 2.0f, ((TextView)tuxTextView2).getShadowColor());
        ((TextView)tuxTextView2).setShadowLayer(((TextView)tuxTextView2).getShadowRadius(), ((TextView)tuxTextView2).getShadowDx(), ((TextView)tuxTextView2).getShadowDy(), resources.getColor(2131100041));
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099686));
        ((View)tuxTextView2).setId(2131363702);
        ((TextView)tuxTextView2).setMaxWidth((int)TypedValue.applyDimension(1, 70.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView2).setMaxLines(1);
        ((View)tuxTextView2).setFocusable(false);
        ((View)tuxTextView2).setFocusableInTouchMode(false);
        ((View)tuxTextView2).setImportantForAccessibility(2);
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), ((View)tuxTextView2).getPaddingTop(), ((View)tuxTextView2).getPaddingRight(), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        ((View)tuxTextView2).setVisibility(0);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        final k k = new k();
        k.LIZ("app:tux_minTextSize", (a)new a.d("10", "dp"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 1;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 1;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).topMargin = (int)TypedValue.applyDimension(1, -6.4f, resources.getDisplayMetrics());
        }
        k.LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(5985);
        return (View)linearLayout;
    }
}
