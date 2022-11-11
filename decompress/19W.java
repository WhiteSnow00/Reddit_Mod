// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.j;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.view.b;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19w implements 0IF
{
    static {
        Covode.recordClassIndex(2023);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(5048);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setPadding((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), ((View)frameLayout).getPaddingTop(), ((View)frameLayout).getPaddingRight(), ((View)frameLayout).getPaddingBottom());
        ((View)frameLayout).setPadding(((View)frameLayout).getPaddingLeft(), ((View)frameLayout).getPaddingTop(), (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), ((View)frameLayout).getPaddingBottom());
        ((View)frameLayout).setId(2131371441);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131371440);
        ((View)tuxTextView).setAlpha(0.0f);
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099750));
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            frameLayout$LayoutParams.gravity = 80;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams)) {
            ((092.d)frameLayout$LayoutParams).LIZ = 80;
        }
        new k().LIZ("app:tux_font", (a)new a.c("H1_Bold"), tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        CTM.LIZ((Object)tuxTextView, (Object)frameLayout$LayoutParams);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(2131232493);
        ((View)appCompatImageView).setId(2131368048);
        ((View)appCompatImageView).setAlpha(0.0f);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 104.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 101.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams2).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams2)) {
            frameLayout$LayoutParams2.gravity = 80;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams2)) {
            ((092.d)frameLayout$LayoutParams2).LIZ = 80;
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)appCompatImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        final P1c p1c = new P1c(context);
        ((View)p1c).setId(2131371669);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(-1, -1);
        new j().LIZ("app:tux_layoutVariant", (a)new a.c("fixed_height"), p1c, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        CTM.LIZ((Object)p1c, (Object)frameLayout$LayoutParams3);
        b.LIZ((View)p1c);
        if (((View)p1c).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)p1c, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(5048);
        return (View)frameLayout;
    }
}
