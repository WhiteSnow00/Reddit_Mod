// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import android.view.ViewGroup$LayoutParams;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1A0 implements 0IF
{
    static {
        Covode.recordClassIndex(2027);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(9187);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131368509);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        linearLayout.setGravity(17);
        if (LinearLayout$LayoutParams.class.isInstance(liz)) {
            ((LinearLayout$LayoutParams)liz).gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz)) {
            ((FrameLayout$LayoutParams)liz).gravity = 16;
        }
        if (092.d.class.isInstance(liz)) {
            ((092.d)liz).LIZ = 16;
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((AppCompatTextView)tuxTextView).setTextSize(1, 13.0f);
        ((View)tuxTextView).setId(2131373092);
        ((View)tuxTextView).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).rightMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).setMarginEnd((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.weight = 1.0f;
        }
        ((TextView)tuxTextView).setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 17;
        }
        linearLayout2.setGravity(17);
        final C7v c7v = new C7v(context);
        ((View)c7v).setId(2131370329);
        ((View)c7v).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            linearLayout$LayoutParams3.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams3).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams3)) {
            ((092.d)linearLayout$LayoutParams3).LIZ = 16;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams3).setMarginEnd((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)c7v);
        if (((View)c7v).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)c7v, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((AppCompatTextView)tuxTextView2).setTextSize(1, 13.0f);
        ((View)tuxTextView2).setId(2131373088);
        ((TextView)tuxTextView2).setEllipsize(TextUtils$TruncateAt.END);
        ((TextView)tuxTextView2).setMaxLines(1);
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginEnd((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).rightMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            linearLayout$LayoutParams4.weight = 1.0f;
        }
        new k().LIZ("android:breakStrategy", (a)new a.c("simple"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            linearLayout$LayoutParams4.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams4).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams4)) {
            ((092.d)linearLayout$LayoutParams4).LIZ = 16;
        }
        ((TextView)tuxTextView2).setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams4);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        final C7v c7v2 = new C7v(context);
        ((View)c7v2).setId(2131370328);
        ((View)c7v2).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            linearLayout$LayoutParams5.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams5).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams5)) {
            ((092.d)linearLayout$LayoutParams5).LIZ = 16;
        }
        b.LIZ((View)c7v2);
        if (((View)c7v2).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)c7v2, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)linearLayout2, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final C7v c7v3 = new C7v(context);
        ((View)c7v3).setId(2131370330);
        ((View)c7v3).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams6 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            linearLayout$LayoutParams6.gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams6).gravity = 1;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams6)) {
            ((092.d)linearLayout$LayoutParams6).LIZ = 1;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams6).topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)c7v3);
        if (((View)c7v3).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)c7v3, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(9187);
        return (View)linearLayout;
    }
}
