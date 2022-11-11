// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewStub;
import android.widget.LinearLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.b;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1A3 implements 0IF
{
    static {
        Covode.recordClassIndex(2030);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(11216);
        final Resources resources = context.getResources();
        if (viewGroup != null && b) {
            final 7iO 7iO = new 7iO(context);
            ((View)7iO).setId(2131363423);
            final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
            b.LIZ((View)7iO);
            if (((View)7iO).getParent() == null) {
                viewGroup.addView((View)7iO, (ViewGroup$LayoutParams)liz);
            }
            final LinearLayout linearLayout = new LinearLayout(context);
            ((View)linearLayout).setId(2131365553);
            ((ViewGroup)linearLayout).setClipChildren(false);
            final ViewGroup$MarginLayoutParams liz2 = b.LIZ(viewGroup, -1, (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
            linearLayout.setGravity(16);
            if (RelativeLayout$LayoutParams.class.isInstance(liz2)) {
                ((RelativeLayout$LayoutParams)liz2).addRule(15, -1);
            }
            final 7iM 7iM = new 7iM(context);
            ((View)7iM).setId(2131366629);
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, -1);
            b.LIZ((View)7iM);
            if (((View)7iM).getParent() == null) {
                ((ViewGroup)linearLayout).addView((View)7iM, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
            }
            b.LIZ((View)linearLayout);
            if (((View)linearLayout).getParent() == null) {
                viewGroup.addView((View)linearLayout, (ViewGroup$LayoutParams)liz2);
            }
            final ViewStub viewStub = new ViewStub(context);
            ((View)viewStub).setId(2131374308);
            viewStub.setLayoutResource(2131560481);
            viewStub.setVisibility(8);
            final ViewGroup$MarginLayoutParams liz3 = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
            if (RelativeLayout$LayoutParams.class.isInstance(liz3)) {
                ((RelativeLayout$LayoutParams)liz3).addRule(18, 2131365553);
            }
            if (RelativeLayout$LayoutParams.class.isInstance(liz3)) {
                ((RelativeLayout$LayoutParams)liz3).addRule(19, 2131365553);
            }
            viewStub.setInflatedId(-1);
            b.LIZ((View)viewStub);
            if (((View)viewStub).getParent() == null) {
                viewGroup.addView((View)viewStub, (ViewGroup$LayoutParams)liz3);
            }
            final 7kD 7kD = new 7kD(context);
            ((View)7kD).setId(2131365544);
            ((View)7kD).setVisibility(8);
            final ViewGroup$MarginLayoutParams liz4 = b.LIZ(viewGroup, -1, -1);
            b.LIZ((View)7kD);
            if (((View)7kD).getParent() == null) {
                viewGroup.addView((View)7kD, (ViewGroup$LayoutParams)liz4);
            }
            MethodCollector.o(11216);
            return (View)viewGroup;
        }
        final IllegalStateException ex = new IllegalStateException("merge tag container should not be null attach should not be false");
        MethodCollector.o(11216);
        throw ex;
    }
}
