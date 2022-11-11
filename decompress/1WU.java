// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.LinkDialog;
import android.view.View;

public final class 1wU extends F5g implements SRS<View, 2P9>
{
    public final /* synthetic */ LinkDialog LIZ;
    
    static {
        Covode.recordClassIndex(7496);
    }
    
    public 1wU(final LinkDialog liz) {
        this.LIZ = liz;
        super(1);
    }
    
    public final void LIZ(final View view) {
        MethodCollector.i(12094);
        final View liziz = this.LIZ.LIZIZ;
        if (liziz != null) {
            final ViewGroup viewGroup = (ViewGroup)liziz.findViewById(2131367484);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                if (view != null) {
                    viewGroup.addView(view);
                }
                MethodCollector.o(12094);
                return;
            }
        }
        MethodCollector.o(12094);
    }
}
