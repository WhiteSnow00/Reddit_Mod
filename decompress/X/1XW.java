// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import kotlin.jvm.internal.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import com.bytedance.covode.number.Covode;

public final class 1xw extends F5g implements SRS<1ib, 2P9>
{
    public final /* synthetic */ 0op LIZ;
    
    static {
        Covode.recordClassIndex(8035);
    }
    
    public 1xw(final 0op liz) {
        this.LIZ = liz;
        super(1);
    }
    
    public final void LIZ(final 1ib 1ib) {
        CTM.LIZ((Object)1ib);
        final ViewGroup$LayoutParams layoutParams = 1ib.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        final ConstraintLayout.a layoutParams2 = (ConstraintLayout.a)layoutParams;
        final int id = 1ib.getId();
        final 1ib 1ib2 = (1ib)this.LIZ.LIZ(2131373266);
        n.LIZIZ((Object)1ib2, "");
        if (id == 1ib2.getId()) {
            layoutParams2.rightMargin = 0cB.LIZ(12.0f);
        }
        else {
            layoutParams2.leftMargin = 0cB.LIZ(12.0f);
        }
        1ib.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
    }
}
