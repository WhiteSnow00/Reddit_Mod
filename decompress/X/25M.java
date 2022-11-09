// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public class 25M extends 1mC
{
    static {
        Covode.recordClassIndex(9366);
    }
    
    public 25M(final DataChannel dataChannel) {
        CTM.LIZ((Object)dataChannel);
        super(dataChannel);
    }
    
    private final void LIZ(final ViewGroup viewGroup, final ViewGroup viewGroup2, final View view) {
        MethodCollector.i(9719);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, (ViewGroup$LayoutParams)this.LJIJ());
            GlD.LIZ((View)viewGroup2);
        }
        MethodCollector.o(9719);
    }
    
    @Override
    public final int LIZ() {
        return 2131562258;
    }
    
    @Override
    public final int LIZ(final View view, final int n) {
        CTM.LIZ((Object)view);
        final ViewGroup lizj = super.LIZJ;
        if (lizj == null) {
            return -1;
        }
        final int lizj2 = this.LIZJ(n);
        int liz = 3;
        if (lizj2 != 1) {
            if (lizj2 != 2) {
                if (lizj2 != 3) {
                    liz = super.LIZ(view, n);
                }
                else {
                    final FrameLayout frameLayout = (FrameLayout)((View)lizj).findViewById(2131369362);
                    n.LIZIZ((Object)frameLayout, "");
                    final FrameLayout frameLayout2 = (FrameLayout)((View)lizj).findViewById(2131364843);
                    n.LIZIZ((Object)frameLayout2, "");
                    this.LIZ((ViewGroup)frameLayout, (ViewGroup)frameLayout2, view);
                }
            }
            else {
                final FrameLayout frameLayout3 = (FrameLayout)((View)lizj).findViewById(2131369361);
                n.LIZIZ((Object)frameLayout3, "");
                final FrameLayout frameLayout4 = (FrameLayout)((View)lizj).findViewById(2131364842);
                n.LIZIZ((Object)frameLayout4, "");
                this.LIZ((ViewGroup)frameLayout3, (ViewGroup)frameLayout4, view);
                liz = 2;
            }
        }
        else {
            final FrameLayout frameLayout5 = (FrameLayout)((View)lizj).findViewById(2131369360);
            n.LIZIZ((Object)frameLayout5, "");
            final FrameLayout frameLayout6 = (FrameLayout)((View)lizj).findViewById(2131364841);
            n.LIZIZ((Object)frameLayout6, "");
            this.LIZ((ViewGroup)frameLayout5, (ViewGroup)frameLayout6, view);
            liz = 1;
        }
        final String simpleName = 25M.class.getSimpleName();
        n.LIZIZ((Object)simpleName, "");
        final StringBuilder sb = new StringBuilder("add window, position");
        sb.append(n);
        sb.append(' ');
        sb.append(liz);
        0xo.LIZ(simpleName, sb.toString());
        this.LJIJI();
        return liz;
    }
    
    @Override
    public final void LIZ(ViewGroup lizj) {
        CTM.LIZ((Object)lizj);
        super.LIZ(lizj);
        lizj = super.LIZJ;
        if (lizj != null) {
            lizj.post((Runnable)new 0tb(this));
        }
    }
    
    @Override
    public final int LIZIZ() {
        return 0cB.LIZ(100.0f);
    }
    
    @Override
    public final int LIZJ() {
        return 2131562249;
    }
    
    @Override
    public final 0k8 LIZLLL() {
        return 0k8.FLOATING_FIX;
    }
    
    @Override
    public final boolean LJ() {
        return true;
    }
}
