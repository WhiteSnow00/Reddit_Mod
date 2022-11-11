// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$MarginLayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18l implements 0IF
{
    static {
        Covode.recordClassIndex(1950);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(11836);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131364350);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        linearLayout.setGravity(17);
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(2131371157);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), -2);
        final Rhi rhi = new Rhi(context);
        ((View)rhi).setId(2131371168);
        ((SE3)rhi).setImageResource(2131233103);
        final ConstraintLayout.a a = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.topToTop = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.endToEnd = 0;
        }
        b.LIZ((View)rhi);
        if (((View)rhi).getParent() == null) {
            constraintLayout.addView((View)rhi, (ViewGroup$LayoutParams)a);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131364445);
        ((View)4fg).setTranslationY(TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        ((View)4fg).setPadding((int)TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), ((View)4fg).getPaddingTop(), ((View)4fg).getPaddingRight(), ((View)4fg).getPaddingBottom());
        ((View)4fg).setPadding(((View)4fg).getPaddingLeft(), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), ((View)4fg).getPaddingRight(), ((View)4fg).getPaddingBottom());
        ((ImageView)4fg).setVisibility(8);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.bottomToBottom = 2131371168;
        }
        final i i = new i();
        i.LIZ("app:tux_iconWidth", (a)new a.d("12", "dp"), 4fg, (ViewGroup$LayoutParams)a2);
        i.LIZ("app:tux_iconHeight", (a)new a.d("12", "dp"), 4fg, (ViewGroup$LayoutParams)a2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginEnd((int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968654", "attr"), 4fg, (ViewGroup$LayoutParams)a2);
        i.LIZ("app:tux_icon", (a)new a.b("2131755642", "raw"), 4fg, (ViewGroup$LayoutParams)a2);
        CTM.LIZ((Object)4fg, (Object)a2);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            constraintLayout.addView((View)4fg, (ViewGroup$LayoutParams)a2);
        }
        b.LIZ((View)constraintLayout);
        if (((View)constraintLayout).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)constraintLayout, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((TextView)tuxTextView).setShadowLayer(2.0f, ((TextView)tuxTextView).getShadowDx(), ((TextView)tuxTextView).getShadowDy(), ((TextView)tuxTextView).getShadowColor());
        ((TextView)tuxTextView).setShadowLayer(((TextView)tuxTextView).getShadowRadius(), ((TextView)tuxTextView).getShadowDx(), 2.0f, ((TextView)tuxTextView).getShadowColor());
        ((TextView)tuxTextView).setShadowLayer(((TextView)tuxTextView).getShadowRadius(), ((TextView)tuxTextView).getShadowDx(), ((TextView)tuxTextView).getShadowDy(), resources.getColor(2131100041));
        ((TextView)tuxTextView).setTextColor(resources.getColorStateList(2131099686));
        ((View)tuxTextView).setId(2131371160);
        ((TextView)tuxTextView).setMaxLines(1);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).topMargin = (int)TypedValue.applyDimension(1, -1.4f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
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
        MethodCollector.o(11836);
        return (View)linearLayout;
    }
}
