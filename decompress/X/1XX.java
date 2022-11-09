// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import kotlin.jvm.internal.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import com.bytedance.covode.number.Covode;

public final class 1xx extends F5g implements SRS<7wT, 2P9>
{
    public final /* synthetic */ 0op LIZ;
    
    static {
        Covode.recordClassIndex(8036);
    }
    
    public 1xx(final 0op liz) {
        this.LIZ = liz;
        super(1);
    }
    
    public final void LIZ(final 7wT 7wT) {
        CTM.LIZ((Object)7wT);
        final ViewGroup$LayoutParams layoutParams = 7wT.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        final ConstraintLayout.a layoutParams2 = (ConstraintLayout.a)layoutParams;
        final int id = 7wT.getId();
        final 7wT 7wT2 = (7wT)this.LIZ.LIZ(2131366982);
        n.LIZIZ((Object)7wT2, "");
        if (id == 7wT2.getId()) {
            layoutParams2.rightMargin = 0cB.LIZ(28.0f);
        }
        else {
            layoutParams2.leftMargin = 0cB.LIZ(28.0f);
        }
        7wT.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
    }
}
