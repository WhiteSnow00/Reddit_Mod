// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19s implements 0IF
{
    static {
        Covode.recordClassIndex(2019);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(4694);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131363949);
        linearLayout.setOrientation(1);
        ((View)linearLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        linearLayout.setGravity(17);
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131363947);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755560", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968673", "attr"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131363948);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968678 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMargins((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
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
        MethodCollector.o(4694);
        return (View)linearLayout;
    }
}
