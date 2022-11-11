// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import com.bytedance.lighten.loader.SmartImageView;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19v implements 0IF
{
    static {
        Covode.recordClassIndex(2022);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(11840);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setBackgroundResource(2131231313);
        ((View)linearLayout).setId(2131366560);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        final SmartImageView smartImageView = new SmartImageView(context);
        ((View)smartImageView).setId(2131366342);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).setMarginStart((int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).leftMargin = (int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).topMargin = (int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).bottomMargin = (int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 17;
        }
        b.LIZ((View)smartImageView);
        if (((View)smartImageView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)smartImageView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131372162);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099750));
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).leftMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).rightMargin = (int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginEnd((int)TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 17;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).topMargin = (int)TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).bottomMargin = (int)TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
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
        MethodCollector.o(11840);
        return (View)linearLayout;
    }
}
