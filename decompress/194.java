// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 194 implements 0IF
{
    static {
        Covode.recordClassIndex(1969);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(9167);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setBackgroundResource(2131231874);
        ((View)frameLayout).setId(2131374030);
        ((View)frameLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(2131231884);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            frameLayout$LayoutParams.gravity = 17;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams)) {
            ((092.d)frameLayout$LayoutParams).LIZ = 17;
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)appCompatImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(9167);
        return (View)frameLayout;
    }
}
