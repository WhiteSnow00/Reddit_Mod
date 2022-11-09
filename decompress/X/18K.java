// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18k implements 0IF
{
    static {
        Covode.recordClassIndex(1949);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(11243);
        final Resources resources = context.getResources();
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        ((View)relativeLayout).setId(2131363862);
        ((View)relativeLayout).setClickable(true);
        ((View)relativeLayout).setFocusable(true);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, (int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
            liz.topMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        relativeLayout.setGravity(17);
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setBackgroundResource(2131231699);
        ((View)appCompatImageView).setPadding((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        ((View)appCompatImageView).setId(2131368322);
        ((View)appCompatImageView).setClickable(false);
        appCompatImageView.setImageResource(2131231753);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams((int)resources.getDimension(2131165457), (int)resources.getDimension(2131165454));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            relativeLayout$LayoutParams.addRule(13, -1);
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)appCompatImageView, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        b.LIZ((View)relativeLayout);
        ((View)relativeLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)relativeLayout);
        }
        MethodCollector.o(11243);
        return (View)relativeLayout;
    }
}
