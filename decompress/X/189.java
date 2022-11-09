// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 189 implements 0IF
{
    static {
        Covode.recordClassIndex(1912);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(5778);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131363821);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        final D90 d90 = new D90(context);
        ((ConstraintLayout)d90).setId(2131370999);
        ((View)d90).setPadding(((View)d90).getPaddingLeft(), (int)resources.getDimension(2131165442), ((View)d90).getPaddingRight(), ((View)d90).getPaddingBottom());
        ((View)d90).setPadding(((View)d90).getPaddingLeft(), ((View)d90).getPaddingTop(), ((View)d90).getPaddingRight(), (int)resources.getDimension(2131165442));
        ((View)d90).setPadding((int)resources.getDimension(2131165442), ((View)d90).getPaddingTop(), ((View)d90).getPaddingRight(), ((View)d90).getPaddingBottom());
        ((View)d90).setPadding((int)resources.getDimension(2131165442), ((View)d90).getPaddingTop(), ((View)d90).getPaddingRight(), ((View)d90).getPaddingBottom());
        ((View)d90).setPadding(((View)d90).getPaddingLeft(), ((View)d90).getPaddingTop(), (int)resources.getDimension(2131165442), ((View)d90).getPaddingBottom());
        ((View)d90).setPadding(((View)d90).getPaddingLeft(), ((View)d90).getPaddingTop(), (int)resources.getDimension(2131165442), ((View)d90).getPaddingBottom());
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        b.LIZ((View)d90);
        if (((View)d90).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)d90, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(5778);
        return (View)frameLayout;
    }
}
