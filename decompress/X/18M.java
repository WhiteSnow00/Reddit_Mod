// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import android.text.TextUtils$TruncateAt;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18m implements 0IF
{
    static {
        Covode.recordClassIndex(1951);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(9181);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131370656);
        linearLayout.setOrientation(0);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        final 3fV 3fV = new 3fV(context);
        ((View)3fV).setId(2131372326);
        ((TextView)3fV).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)3fV).setIncludeFontPadding(false);
        ((TextView)3fV).setMaxLines(1);
        ((TextView)3fV).setShadowLayer(((TextView)3fV).getShadowRadius(), ((TextView)3fV).getShadowDx(), ((TextView)3fV).getShadowDy(), resources.getColor(2131100041));
        ((TextView)3fV).setShadowLayer(((TextView)3fV).getShadowRadius(), ((TextView)3fV).getShadowDx(), 1.0f, ((TextView)3fV).getShadowColor());
        ((TextView)3fV).setShadowLayer(1.0f, ((TextView)3fV).getShadowDx(), ((TextView)3fV).getShadowDy(), ((TextView)3fV).getShadowColor());
        ((TextView)3fV).setTextColor(resources.getColorStateList(2131099685));
        ((TextView)3fV).setSingleLine(true);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.weight = 1.0f;
        }
        ((TextView)3fV).setGravity(16);
        new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), (TuxTextView)3fV, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)3fV, (Object)linearLayout$LayoutParams);
        b.LIZ((View)3fV);
        if (((View)3fV).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)3fV, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131371479);
        ((View)linearLayout2).setPadding((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), ((View)linearLayout2).getPaddingTop(), ((View)linearLayout2).getPaddingRight(), ((View)linearLayout2).getPaddingBottom());
        ((View)linearLayout2).setPadding(((View)linearLayout2).getPaddingLeft(), ((View)linearLayout2).getPaddingTop(), (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), ((View)linearLayout2).getPaddingBottom());
        ((View)linearLayout2).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        linearLayout2.setGravity(16);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 16;
        }
        final 4fg 4fg = new 4fg(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        final i i = new i();
        i.LIZ("android:layout_marginVertical", (a)new a.d("6", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        i.LIZ("app:tux_icon", (a)new a.b("2131755657", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams3);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131371478);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968627 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginStart((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            linearLayout$LayoutParams4.weight = 1.0f;
        }
        final k k = new k();
        k.LIZ("android:breakStrategy", (a)new a.c("simple"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        k.LIZ("app:tux_font", (a)new a.c("P3_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams4);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        final C7o c7o = new C7o(context);
        ((View)c7o).setId(2131371477);
        ((View)c7o).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams5).setMarginStart((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)c7o);
        if (((View)c7o).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)c7o, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)linearLayout2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131373416);
        ((TextView)tuxTextView2).setShadowLayer(((TextView)tuxTextView2).getShadowRadius(), ((TextView)tuxTextView2).getShadowDx(), ((TextView)tuxTextView2).getShadowDy(), resources.getColor(2131100041));
        ((TextView)tuxTextView2).setShadowLayer(((TextView)tuxTextView2).getShadowRadius(), ((TextView)tuxTextView2).getShadowDx(), 2.0f, ((TextView)tuxTextView2).getShadowColor());
        ((TextView)tuxTextView2).setShadowLayer(2.0f, ((TextView)tuxTextView2).getShadowDx(), ((TextView)tuxTextView2).getShadowDy(), ((TextView)tuxTextView2).getShadowColor());
        ((View)tuxTextView2).setTextAlignment(5);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099689));
        ((View)tuxTextView2).setTextDirection(5);
        final LinearLayout$LayoutParams linearLayout$LayoutParams6 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            linearLayout$LayoutParams6.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams6).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams6)) {
            ((092.d)linearLayout$LayoutParams6).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams6).setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams6).leftMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView2).setGravity(8388611);
        new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams6);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(9181);
        return (View)linearLayout;
    }
}
