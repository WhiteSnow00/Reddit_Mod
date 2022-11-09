// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.content.res.TypedArray;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.widget.FrameLayout$LayoutParams;
import android.util.TypedValue;
import com.bytedance.tux.input.TuxTextView;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19m implements 0IF
{
    static {
        Covode.recordClassIndex(2013);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(8660);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131367386);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373825);
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), (int)TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView).setText(2131826453);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968631 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((View)tuxTextView).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        CTM.LIZ((Object)tuxTextView, (Object)frameLayout$LayoutParams);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        ((View)tuxTextView2).setId(2131368344);
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView2).getPaddingRight(), ((View)tuxTextView2).getPaddingBottom());
        ((TextView)tuxTextView2).setPadding(((View)tuxTextView2).getPaddingLeft(), ((View)tuxTextView2).getPaddingTop(), ((View)tuxTextView2).getPaddingRight(), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968679 });
        ((TextView)tuxTextView2).setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        ((View)tuxTextView2).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -2);
        ((TextView)tuxTextView2).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P3_Regular"), tuxTextView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView2, (Object)frameLayout$LayoutParams2);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(8660);
        return (View)frameLayout;
    }
}
