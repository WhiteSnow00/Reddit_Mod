// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0ui implements Runnable
{
    public final /* synthetic */ 0uj LIZ;
    
    static {
        Covode.recordClassIndex(9530);
    }
    
    public 0ui(final 0uj liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final 1si 1si = (1si)this.LIZ.LIZ(2131368952);
        n.LIZIZ((Object)1si, "");
        Object layoutParams = 1si.getLayoutParams();
        final boolean b = layoutParams instanceof ConstraintLayout.a;
        final ConstraintLayout.a a = null;
        if (!b) {
            layoutParams = null;
        }
        final ConstraintLayout.a layoutParams2 = (ConstraintLayout.a)layoutParams;
        if (layoutParams2 == null) {
            return;
        }
        if (this.LIZ.getMDataHolder().LJIILL == 0k8.GRID || this.LIZ.getMDataHolder().LJIILL == 0k8.GRID_FIX) {
            layoutParams2.bottomMargin = 0cB.LIZ(0.0f);
            layoutParams2.width = 0cB.LIZ(60.0f);
            layoutParams2.height = 0cB.LIZ(60.0f);
        }
        else {
            layoutParams2.bottomMargin = 0cB.LIZ(30.0f);
            layoutParams2.width = 0cB.LIZ(70.0f);
            layoutParams2.height = 0cB.LIZ(70.0f);
        }
        final 1si 1si2 = (1si)this.LIZ.LIZ(2131368952);
        n.LIZIZ((Object)1si2, "");
        1si2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        final 1ib 1ib = (1ib)this.LIZ.LIZ(2131373049);
        n.LIZIZ((Object)1ib, "");
        Object layoutParams3 = 1ib.getLayoutParams();
        if (!(layoutParams3 instanceof ConstraintLayout.a)) {
            layoutParams3 = a;
        }
        final ConstraintLayout.a layoutParams4 = (ConstraintLayout.a)layoutParams3;
        if (layoutParams4 == null) {
            return;
        }
        layoutParams4.leftToLeft = 2131368952;
        layoutParams4.rightToRight = 2131368952;
        layoutParams4.topToTop = 2131368952;
        layoutParams4.bottomToBottom = 2131368952;
        layoutParams4.width = layoutParams2.width;
        layoutParams4.height = layoutParams2.height;
        final 1ib 1ib2 = (1ib)this.LIZ.LIZ(2131373049);
        n.LIZIZ((Object)1ib2, "");
        1ib2.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
    }
}
