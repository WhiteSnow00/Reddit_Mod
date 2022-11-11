// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.cohost.ui.fragment.CoHostBeInvitedFragment;

public final class 1wV extends F5g implements SRT<Integer, Integer, 2P9>
{
    public final /* synthetic */ Fld LIZ;
    public final /* synthetic */ CoHostBeInvitedFragment LIZIZ;
    
    static {
        Covode.recordClassIndex(7517);
    }
    
    public 1wV(final Fld liz, final CoHostBeInvitedFragment liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        super(2);
    }
    
    public final void LIZ(final int n, final int n2) {
        MethodCollector.i(10963);
        if (((ViewGroup)CoHostBeInvitedFragment.LIZ(this.LIZIZ)).indexOfChild((View)this.LIZ) == -1) {
            final FrameLayout liz = CoHostBeInvitedFragment.LIZ(this.LIZIZ);
            final Fld liz2 = this.LIZ;
            final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
            frameLayout$LayoutParams.gravity = 17;
            liz.addView((View)liz2, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        this.LIZ.LIZ(n, n2);
        MethodCollector.o(10963);
    }
}
