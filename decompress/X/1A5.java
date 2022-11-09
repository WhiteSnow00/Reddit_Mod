// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import com.a.a.a.a.a;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1A5 implements 0IF
{
    static {
        Covode.recordClassIndex(2032);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(2766);
        final Resources resources = context.getResources();
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        ((View)relativeLayout).setId(2131368280);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, (int)TypedValue.applyDimension(1, 101.0f, resources.getDisplayMetrics()));
        final Rhi rhi = new Rhi(context);
        ((View)rhi).setId(2131364073);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 85.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams).setMarginStart((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            relativeLayout$LayoutParams.addRule(15, -1);
        }
        final a a = new a();
        a.LIZ("app:roundedCornerRadius", new com.a.b.a.a.d("2", "dp"), (SE3)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        a.LIZ("fresco:failureImage", new com.a.b.a.a.b("2131099675", "color"), (SE3)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        a.LIZ("fresco:placeholderImage", new com.a.b.a.a.b("2131099675", "color"), (SE3)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        a.LIZ((SE3)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        b.LIZ((View)rhi);
        if (((View)rhi).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)rhi, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        final RelativeLayout relativeLayout2 = new RelativeLayout(context);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams(-1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).leftMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(15, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).setMarginEnd((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).rightMargin = (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(17, 2131364073);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131368278);
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView).setMaxLines(3);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968672 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((View)tuxTextView).setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout$LayoutParams(-1, -2);
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("H4_Regular"), tuxTextView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        CTM.LIZ((Object)tuxTextView, (Object)relativeLayout$LayoutParams3);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)relativeLayout2).addView((View)tuxTextView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131368279);
        ((TextView)tuxTextView2).setTextColor(resources.getColorStateList(2131099758));
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout$LayoutParams(-2, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(3, 2131368278);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams4).topMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (com.a.b.a.a)new com.a.b.a.a.c("P2_Regular"), tuxTextView2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        CTM.LIZ((Object)tuxTextView2, (Object)relativeLayout$LayoutParams4);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)relativeLayout2).addView((View)tuxTextView2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        }
        b.LIZ((View)relativeLayout2);
        if (((View)relativeLayout2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)relativeLayout2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        }
        b.LIZ((View)relativeLayout);
        ((View)relativeLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)relativeLayout);
        }
        MethodCollector.o(2766);
        return (View)relativeLayout;
    }
}
