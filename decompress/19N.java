// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.b;
import android.util.TypedValue;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19n implements 0IF
{
    static {
        Covode.recordClassIndex(2014);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(31);
        final Resources resources = context.getResources();
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131373895);
        ((TextView)tuxTextView).setMaxWidth((int)TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView).setPadding((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setMaxLines(1);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968679 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((View)tuxTextView).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        new k().LIZ("app:tux_font", (a)new a.c("SmallText1_Regular"), tuxTextView, (ViewGroup$LayoutParams)liz);
        CTM.LIZ((Object)tuxTextView, (Object)liz);
        b.LIZ((View)tuxTextView);
        ((View)tuxTextView).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)tuxTextView);
        }
        MethodCollector.o(31);
        return (View)tuxTextView;
    }
}
