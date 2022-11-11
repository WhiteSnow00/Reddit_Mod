// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.TypedValue;
import android.text.TextUtils$TruncateAt;
import android.widget.LinearLayout$LayoutParams;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19x implements 0IF
{
    static {
        Covode.recordClassIndex(2024);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(6853);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131364273);
        linearLayout.setOrientation(0);
        ((View)linearLayout).setVisibility(4);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        final 7oT 7oT = new 7oT(context);
        ((View)7oT).setId(2131364287);
        ((LinearLayout)7oT).setOrientation(1);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        final AmR amR = new AmR(context, (byte)0);
        ((View)amR).setId(2131364263);
        ((TextView)amR).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)amR).setIncludeFontPadding(false);
        ((View)amR).setVerticalFadingEdgeEnabled(true);
        ((View)amR).setTextAlignment(5);
        ((TextView)amR).setTextColor(resources.getColorStateList(2131099685));
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)7oT, (int)TypedValue.applyDimension(1, 372.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz2)) {
            ((LinearLayout$LayoutParams)liz2).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz2)) {
            ((FrameLayout$LayoutParams)liz2).gravity = 16;
        }
        if (092.d.class.isInstance(liz2)) {
            ((092.d)liz2).LIZ = 16;
        }
        ((TextView)amR).setGravity(8388611);
        ((View)amR).setFadingEdgeLength((int)resources.getDimension(2131165453));
        ((TextView)amR).setLineSpacing(TypedValue.applyDimension(2, 7.0f, resources.getDisplayMetrics()), 1.0f);
        b.LIZ((View)amR);
        if (((View)amR).getParent() == null) {
            ((ViewGroup)7oT).addView((View)amR, (ViewGroup$LayoutParams)liz2);
        }
        b.LIZ((View)7oT);
        if (((View)7oT).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)7oT, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373660);
        ((TextView)tuxTextView).setMaxLines(1);
        ((TextView)tuxTextView).setText(2131825411);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099687));
        ((View)tuxTextView).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 80;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 80;
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
        MethodCollector.o(6853);
        return (View)linearLayout;
    }
}
