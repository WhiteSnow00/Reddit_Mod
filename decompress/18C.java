// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewStub;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18c implements 0IF
{
    static {
        Covode.recordClassIndex(1941);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(5564);
        context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final ViewStub viewStub = new ViewStub(context);
        ((View)viewStub).setId(2131371836);
        viewStub.setInflatedId(2131367106);
        viewStub.setLayoutResource(2131558950);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)viewStub);
        if (((View)viewStub).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)viewStub, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(5564);
        return (View)frameLayout;
    }
}
