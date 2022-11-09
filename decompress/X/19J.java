// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.b;
import android.util.TypedValue;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19j implements 0IF
{
    static {
        Covode.recordClassIndex(2010);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(9190);
        final Resources resources = context.getResources();
        if (viewGroup != null && b) {
            final View view = new View(context);
            view.setId(2131364429);
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968637 });
            view.setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
            obtainStyledAttributes.recycle();
            final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, (int)TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
                liz.leftMargin = (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
            }
            if (ViewGroup$MarginLayoutParams.class.isInstance(liz)) {
                liz.rightMargin = (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
            }
            b.LIZ(view);
            if (view.getParent() == null) {
                viewGroup.addView(view, (ViewGroup$LayoutParams)liz);
            }
            MethodCollector.o(9190);
            return (View)viewGroup;
        }
        final IllegalStateException ex = new IllegalStateException("merge tag container should not be null attach should not be false");
        MethodCollector.o(9190);
        throw ex;
    }
}
