// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.LinearLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 196 implements 0IF
{
    static {
        Covode.recordClassIndex(1971);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(14401);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ((View)linearLayout).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingTop(), ((View)linearLayout).getPaddingRight(), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding(((View)linearLayout).getPaddingLeft(), (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingRight(), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding(((View)linearLayout).getPaddingLeft(), ((View)linearLayout).getPaddingTop(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding(((View)linearLayout).getPaddingLeft(), ((View)linearLayout).getPaddingTop(), ((View)linearLayout).getPaddingRight(), (int)TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(liz)) {
            ((RelativeLayout$LayoutParams)liz).addRule(15, -1);
        }
        linearLayout.setGravity(16);
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setAlpha(0.75f);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755572", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_tintColor", (a)new a.b("2131099685", "color"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_iconHeight", (a)new a.d("16", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_iconWidth", (a)new a.d("16", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 17;
        }
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131372974);
        ((AppCompatTextView)tuxTextView).setTextSize(1, 15.0f);
        ((View)tuxTextView).setAlpha(0.75f);
        ((TextView)tuxTextView).setLines(1);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("H4_Regular"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.weight = 1.0f;
        }
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131372975);
        ((AppCompatTextView)tuxTextView2).setBackgroundResource(2131231895);
        ((TextView)tuxTextView2).setPadding((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)tuxTextView2).getPaddingTop(), ((View)tuxTextView2).getPaddingRight(), ((View)tuxTextView2).getPaddingBottom());
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), ((View)tuxTextView2).getPaddingRight(), ((View)tuxTextView2).getPaddingBottom());
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), ((View)tuxTextView2).getPaddingTop(), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), ((View)tuxTextView2).getPaddingBottom());
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), ((View)tuxTextView2).getPaddingTop(), ((View)tuxTextView2).getPaddingRight(), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099685));
        ((TextView)tuxTextView2).setText(2131822161);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("P1_Semibold"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams3);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(14401);
        return (View)linearLayout;
    }
}
