// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.widget.FrameLayout$LayoutParams;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18s implements 0IF
{
    static {
        Covode.recordClassIndex(1957);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(13131);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ((View)linearLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.bottomMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131372378);
        linearLayout2.setOrientation(0);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).setMarginStart((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).setMarginEnd((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131372339);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setMaxLines(2);
        ((TextView)tuxTextView).setText(2131833154);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968627 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.weight = 1.0f;
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
        new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131363560);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            linearLayout$LayoutParams3.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams3).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams3)) {
            ((092.d)linearLayout$LayoutParams3).LIZ = 16;
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755853", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        i.LIZ("app:tux_iconHeight", (a)new a.d("24", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        i.LIZ("app:tux_iconWidth", (a)new a.d("24", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968630", "attr"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams3);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)linearLayout2, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final FX4 fx4 = new FX4(context);
        ((View)fx4).setId(2131373853);
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-1, -2);
        b.LIZ((View)fx4);
        if (((View)fx4).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)fx4, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(13131);
        return (View)linearLayout;
    }
}
