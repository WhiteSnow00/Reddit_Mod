// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.AbsSeekBar;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.TypedValue;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18t implements 0IF
{
    static {
        Covode.recordClassIndex(1958);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(3844);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final SQA sqa = new SQA(context);
        ((View)sqa).setId(2131370974);
        ((View)sqa).setPadding((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), ((View)sqa).getPaddingTop(), ((View)sqa).getPaddingRight(), ((View)sqa).getPaddingBottom());
        ((View)sqa).setPadding(((View)sqa).getPaddingLeft(), ((View)sqa).getPaddingTop(), (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), ((View)sqa).getPaddingBottom());
        ((AbsSeekBar)sqa).setMax(10000);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        b.LIZ((View)sqa);
        if (((View)sqa).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)sqa, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(3844);
        return (View)frameLayout;
    }
}
