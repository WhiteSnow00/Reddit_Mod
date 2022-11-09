// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.e;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18j implements 0IF
{
    static {
        Covode.recordClassIndex(1948);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(8626);
        final Resources resources = context.getResources();
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        ((View)relativeLayout).setId(2131370643);
        ((View)relativeLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), -2);
        final C9i c9i = new C9i(context);
        ((View)c9i).setId(2131363120);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 131.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            relativeLayout$LayoutParams.addRule(20, -1);
        }
        new e().LIZ("app:tux_buttonVariant", (a)new a.c("const_secondary"), c9i, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        CTM.LIZ((Object)c9i, (Object)relativeLayout$LayoutParams);
        b.LIZ((View)c9i);
        if (((View)c9i).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)c9i, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        final 50S 50S = new 50S(context);
        ((View)50S).setId(2131363088);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 131.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(21, -1);
        }
        b.LIZ((View)50S);
        if (((View)50S).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)50S, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        }
        b.LIZ((View)relativeLayout);
        ((View)relativeLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)relativeLayout);
        }
        MethodCollector.o(8626);
        return (View)relativeLayout;
    }
}
