// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1Ap implements 0IF
{
    static {
        Covode.recordClassIndex(2078);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(6554);
        context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final DNq dNq = new DNq(context);
        ((View)dNq).setId(2131369686);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        b.LIZ((View)dNq);
        if (((View)dNq).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)dNq, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final DNq dNq2 = new DNq(context);
        ((View)dNq2).setId(2131369684);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -2);
        b.LIZ((View)dNq2);
        if (((View)dNq2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)dNq2, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(6554);
        return (View)frameLayout;
    }
}
