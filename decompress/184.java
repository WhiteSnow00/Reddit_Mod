// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 184 implements 0IF
{
    static {
        Covode.recordClassIndex(1906);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(10584);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131365523);
        ((View)frameLayout).setFitsSystemWindows(true);
        ((View)frameLayout).setBackgroundColor(resources.getColor(2131099659));
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(10584);
        return (View)frameLayout;
    }
}
