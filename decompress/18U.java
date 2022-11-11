// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.widget.LinearLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.e;
import android.widget.FrameLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18u implements 0IF
{
    static {
        Covode.recordClassIndex(1959);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(4797);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, (int)TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        final C9i c9i = new C9i(context);
        ((View)c9i).setId(2131363158);
        ((TextView)c9i).setText(2131836561);
        ((View)c9i).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        final e e = new e();
        e.LIZ("app:tux_buttonSize", (a)new a.c("medium"), c9i, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        e.LIZ("app:tux_buttonVariant", (a)new a.c("primary"), c9i, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        e.LIZ("app:tux_iconStart", (a)new a.b("2131755832", "raw"), c9i, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        CTM.LIZ((Object)c9i, (Object)frameLayout$LayoutParams);
        b.LIZ((View)c9i);
        if (((View)c9i).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)c9i, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131363157);
        ((View)linearLayout).setVisibility(8);
        linearLayout.setOrientation(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -1);
        linearLayout.setGravity(17);
        final SmartImageView smartImageView = new SmartImageView(context);
        ((View)smartImageView).setId(2131366883);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        b.LIZ((View)smartImageView);
        if (((View)smartImageView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)smartImageView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((TextView)tuxTextView).setText(2131836561);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("P1_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)linearLayout, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(4797);
        return (View)frameLayout;
    }
}
