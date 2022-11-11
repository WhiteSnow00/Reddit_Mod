// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.b;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1A8 implements 0IF
{
    static {
        Covode.recordClassIndex(2035);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(6918);
        context.getResources();
        if (viewGroup != null && b) {
            final 7fS 7fS = new 7fS(context);
            ((View)7fS).setId(2131364548);
            final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
            b.LIZ((View)7fS);
            if (((View)7fS).getParent() == null) {
                viewGroup.addView((View)7fS, (ViewGroup$LayoutParams)liz);
            }
            final 7fi 7fi = new 7fi(context);
            ((View)7fi).setId(2131372583);
            final ViewGroup$MarginLayoutParams liz2 = b.LIZ(viewGroup, -1, -2);
            b.LIZ((View)7fi);
            if (((View)7fi).getParent() == null) {
                viewGroup.addView((View)7fi, (ViewGroup$LayoutParams)liz2);
            }
            MethodCollector.o(6918);
            return (View)viewGroup;
        }
        final IllegalStateException ex = new IllegalStateException("merge tag container should not be null attach should not be false");
        MethodCollector.o(6918);
        throw ex;
    }
}
