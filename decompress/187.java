// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.widget.LinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 187 implements 0IF
{
    static {
        Covode.recordClassIndex(1910);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(6534);
        final Resources resources = context.getResources();
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.setMarginStart((int)resources.getDimension(2131165442));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.leftMargin = (int)resources.getDimension(2131165442);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.setMarginEnd((int)resources.getDimension(2131165442));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.rightMargin = (int)resources.getDimension(2131165442);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.bottomMargin = (int)resources.getDimension(2131165442);
        }
        final View liz2 = 0I8.LIZ(context, 2131559211, (ViewGroup)linearLayout, false, 2131559177);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, -2);
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams).leftToLeft = 0;
        }
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams).topToTop = 0;
        }
        if (ConstraintLayout.a.class.isInstance(linearLayout$LayoutParams)) {
            ((ConstraintLayout.a)linearLayout$LayoutParams).rightToRight = 0;
        }
        if (liz2.getParent() == null) {
            ((ViewGroup)linearLayout).addView(liz2, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final View liz3 = 0I8.LIZ(context, 2131559208, (ViewGroup)linearLayout, false, 2131559177);
        if (liz3.getParent() == null) {
            ((ViewGroup)linearLayout).addView(liz3);
        }
        b.LIZ((View)linearLayout);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)linearLayout);
        }
        MethodCollector.o(6534);
        return (View)linearLayout;
    }
}
