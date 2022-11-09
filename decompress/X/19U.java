// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.view.b;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19u implements 0IF
{
    static {
        Covode.recordClassIndex(2021);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(9156);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingTop(), ((View)linearLayout).getPaddingRight(), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding(((View)linearLayout).getPaddingLeft(), ((View)linearLayout).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding(((View)linearLayout).getPaddingLeft(), ((View)linearLayout).getPaddingTop(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingTop(), ((View)linearLayout).getPaddingRight(), ((View)linearLayout).getPaddingBottom());
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        linearLayout.setGravity(8388613);
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131372326);
        ((TextView)tuxTextView).setMaxLines(3);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099750));
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).topMargin = (int)TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView).setGravity(8388611);
        new k().LIZ("app:tux_font", (a)new a.c("H1_Bold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131370950);
        ((TextView)tuxTextView2).setMaxLines(3);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099757));
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).topMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView2).setGravity(8388611);
        new k().LIZ("app:tux_font", (a)new a.c("H2_Regular"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
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
        MethodCollector.o(9156);
        return (View)linearLayout;
    }
}
