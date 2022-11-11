// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18v implements 0IF
{
    static {
        Covode.recordClassIndex(1960);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(6703);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131363320);
        ((View)linearLayout).setBackgroundResource(2131231720);
        linearLayout.setOrientation(0);
        ((View)linearLayout).setPadding((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.leftMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.topMargin = (int)TypedValue.applyDimension(1, 94.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.rightMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        linearLayout.setGravity(16);
        final 4fg 4fg = new 4fg(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755442", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131363322);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).leftMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).rightMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.weight = 1.0f;
        }
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setId(2131363321);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        final i j = new i();
        j.LIZ("app:tux_icon", (a)new a.b("2131755853", "raw"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        j.LIZ("app:tux_tintColor", (a)new a.b("2130968630", "attr"), 4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        CTM.LIZ((Object)4fg2, (Object)linearLayout$LayoutParams3);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg2, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(6703);
        return (View)linearLayout;
    }
}
