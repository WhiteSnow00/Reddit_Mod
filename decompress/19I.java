// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19i implements 0IF
{
    static {
        Covode.recordClassIndex(2009);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(334);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131367837);
        ((View)frameLayout).setTranslationY(TypedValue.applyDimension(1, -6.0f, resources.getDisplayMetrics()));
        ((View)frameLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, (int)TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz)) {
            ((LinearLayout$LayoutParams)liz).gravity = 8388611;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz)) {
            ((FrameLayout$LayoutParams)liz).gravity = 8388611;
        }
        if (092.d.class.isInstance(liz)) {
            ((092.d)liz).LIZ = 8388611;
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131367838);
        ((View)linearLayout).setBackgroundResource(2131232860);
        linearLayout.setOrientation(0);
        ((View)linearLayout).setPadding((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingTop(), ((View)linearLayout).getPaddingRight(), ((View)linearLayout).getPaddingBottom());
        ((View)linearLayout).setPadding(((View)linearLayout).getPaddingLeft(), ((View)linearLayout).getPaddingTop(), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), ((View)linearLayout).getPaddingBottom());
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        linearLayout.setGravity(16);
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131366087);
        ((ImageView)4fg).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        final i i = new i();
        i.LIZ("android:layout_marginVertical", (a)new a.d("2", "dp"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 17;
        }
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968679", "attr"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        i.LIZ("app:tux_icon", (a)new a.b("2131755436", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131368057);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968679 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((View)tuxTextView).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -1);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 17;
        }
        ((TextView)tuxTextView).setGravity(17);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final RecyclerView recyclerView = new RecyclerView(context);
        ((View)recyclerView).setId(2131370184);
        ((View)recyclerView).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        b.LIZ((View)recyclerView);
        if (((View)recyclerView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)recyclerView, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131370178);
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968672 });
        ((TextView)tuxTextView2).setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        ((View)tuxTextView2).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            linearLayout$LayoutParams4.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams4).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams4)) {
            ((092.d)linearLayout$LayoutParams4).LIZ = 17;
        }
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams4);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)linearLayout, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(334);
        return (View)frameLayout;
    }
}
