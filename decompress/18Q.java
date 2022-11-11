// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperiment;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18q implements 0IF
{
    static {
        Covode.recordClassIndex(1955);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(8632);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131370507);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(liz)) {
            ((RelativeLayout$LayoutParams)liz).addRule(21, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(liz)) {
            ((RelativeLayout$LayoutParams)liz).addRule(12, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.bottomMargin = (int)TypedValue.applyDimension(1, 78.0f, resources.getDisplayMetrics());
        }
        linearLayout.setGravity(8388613);
        final 0RZ 0rz = new 0RZ(context);
        0rz.setId(2131374309);
        0rz.setInflatedId(2131362004);
        0rz.setLayoutResource(2131559426);
        0rz.setExperimentImplementation((0RZ.a)new ViewStubOptExperiment());
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        b.LIZ(0rz);
        if (0rz.getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)0rz, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final 2uk 2uk = new 2uk(context, (byte)0);
        ((View)2uk).setId(2131362593);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-2, -2);
        b.LIZ((View)2uk);
        if (((View)2uk).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)2uk, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final 2uk 2uk2 = new 2uk(context, (byte)0);
        ((View)2uk2).setId(2131364348);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        b.LIZ((View)2uk2);
        if (((View)2uk2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)2uk2, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final 2uk 2uk3 = new 2uk(context, (byte)0);
        ((View)2uk3).setId(2131363726);
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-2, -2);
        b.LIZ((View)2uk3);
        if (((View)2uk3).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)2uk3, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        final 2uk 2uk4 = new 2uk(context, (byte)0);
        ((View)2uk4).setId(2131365089);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams(-2, -2);
        b.LIZ((View)2uk4);
        if (((View)2uk4).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)2uk4, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        final 2uk 2uk5 = new 2uk(context, (byte)0);
        ((View)2uk5).setId(2131371169);
        final LinearLayout$LayoutParams linearLayout$LayoutParams6 = new LinearLayout$LayoutParams(-2, -2);
        b.LIZ((View)2uk5);
        if (((View)2uk5).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)2uk5, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        }
        final 2uk 2uk6 = new 2uk(context, (byte)0);
        ((View)2uk6).setId(2131368324);
        final LinearLayout$LayoutParams linearLayout$LayoutParams7 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams7).setMarginEnd((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        b.LIZ((View)2uk6);
        if (((View)2uk6).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)2uk6, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(8632);
        return (View)linearLayout;
    }
}
