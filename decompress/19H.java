// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19h implements 0IF
{
    static {
        Covode.recordClassIndex(2008);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(4401);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131367836);
        ((View)linearLayout).setPadding((int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingTop(), ((View)linearLayout).getPaddingRight(), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding(((View)linearLayout).getPaddingLeft(), ((View)linearLayout).getPaddingTop(), (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding(((View)linearLayout).getPaddingLeft(), (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingRight(), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding(((View)linearLayout).getPaddingLeft(), ((View)linearLayout).getPaddingTop(), ((View)linearLayout).getPaddingRight(), (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        linearLayout.setOrientation(0);
        ((View)linearLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz)) {
            ((LinearLayout$LayoutParams)liz).gravity = 8388611;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz)) {
            ((FrameLayout$LayoutParams)liz).gravity = 8388611;
        }
        if (092.d.class.isInstance(liz)) {
            ((092.d)liz).LIZ = 8388611;
        }
        linearLayout.setGravity(16);
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        ((View)appCompatImageView).setId(2131364444);
        appCompatImageView.setImageResource(2131232831);
        appCompatImageView.setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)appCompatImageView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131364490);
        ((TextView)tuxTextView).setText(2131824275);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968679 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((View)tuxTextView).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final RecyclerView recyclerView = new RecyclerView(context);
        ((View)recyclerView).setId(2131370687);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams3).setMarginStart((int)TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)recyclerView);
        if (((View)recyclerView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)recyclerView, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(4401);
        return (View)linearLayout;
    }
}
