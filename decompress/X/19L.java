// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.TypedValue;
import com.bytedance.tux.input.TuxTextView;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19l implements 0IF
{
    static {
        Covode.recordClassIndex(2012);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(13803);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131367384);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131368743);
        ((AppCompatTextView)tuxTextView).setBackgroundResource(2131232870);
        ((TextView)tuxTextView).setMaxWidth((int)TypedValue.applyDimension(1, 255.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        ((TextView)tuxTextView).setPadding((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), (int)TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968679 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ((View)tuxTextView).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            linearLayout$LayoutParams.gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams).gravity = 17;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams)) {
            ((092.d)linearLayout$LayoutParams).LIZ = 17;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams).topMargin = (int)TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P2_Regular"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(13803);
        return (View)linearLayout;
    }
}
