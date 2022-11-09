// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.content.res.Resources;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.text.TextUtils$TruncateAt;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 188 implements 0IF
{
    static {
        Covode.recordClassIndex(1911);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(9879);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.rightMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.setMarginEnd((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        final SmartImageView smartImageView = new SmartImageView(context);
        ((View)smartImageView).setId(2131370465);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)smartImageView);
        if (((View)smartImageView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)smartImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131371133);
        ((TextView)tuxTextView).setPadding((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099685));
        ((TextView)tuxTextView).setEllipsize(TextUtils$TruncateAt.END);
        ((View)tuxTextView).setVisibility(8);
        ((AppCompatTextView)tuxTextView).setBackgroundResource(2131231569);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -1);
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)frameLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(9879);
        return (View)frameLayout;
    }
}
