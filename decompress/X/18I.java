// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ImageView$ScaleType;
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

public final class 18i implements 0IF
{
    static {
        Covode.recordClassIndex(1947);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(10581);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131365091);
        linearLayout.setOrientation(1);
        ((View)linearLayout).setFocusable(false);
        ((ViewGroup)linearLayout).setClipChildren(true);
        ((View)linearLayout).setFocusableInTouchMode(false);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setBackgroundResource(2131231699);
        ((View)frameLayout).setPadding((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        ((View)frameLayout).setId(2131365084);
        ((View)frameLayout).setFocusable(false);
        ((View)frameLayout).setFocusableInTouchMode(false);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        final AX3 ax3 = new AX3(context);
        ((View)ax3).setId(2131365081);
        ((View)ax3).setFocusable(false);
        ((View)ax3).setFocusableInTouchMode(false);
        ((ImageView)ax3).setScaleType(ImageView$ScaleType.CENTER_INSIDE);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            frameLayout$LayoutParams.gravity = 17;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams)) {
            ((092.d)frameLayout$LayoutParams).LIZ = 17;
        }
        b.LIZ((View)ax3);
        if (((View)ax3).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)ax3, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        if (((View)frameLayout).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)frameLayout, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((TextView)tuxTextView).setShadowLayer(2.0f, ((TextView)tuxTextView).getShadowDx(), ((TextView)tuxTextView).getShadowDy(), ((TextView)tuxTextView).getShadowColor());
        ((TextView)tuxTextView).setShadowLayer(((TextView)tuxTextView).getShadowRadius(), ((TextView)tuxTextView).getShadowDx(), 2.0f, ((TextView)tuxTextView).getShadowColor());
        ((TextView)tuxTextView).setShadowLayer(((TextView)tuxTextView).getShadowRadius(), ((TextView)tuxTextView).getShadowDx(), ((TextView)tuxTextView).getShadowDy(), resources.getColor(2131100041));
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099686));
        ((View)tuxTextView).setId(2131365085);
        ((View)tuxTextView).setFocusable(false);
        ((View)tuxTextView).setFocusableInTouchMode(false);
        ((View)tuxTextView).setImportantForAccessibility(2);
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
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
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).topMargin = (int)TypedValue.applyDimension(1, -3.4f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(10581);
        return (View)linearLayout;
    }
}
