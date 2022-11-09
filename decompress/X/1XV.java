// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class 1xv extends F5g implements SRT<ConstraintLayout, 1si, 2P9>
{
    public final /* synthetic */ 0op LIZ;
    
    static {
        Covode.recordClassIndex(8034);
    }
    
    public 1xv(final 0op liz) {
        this.LIZ = liz;
        super(2);
    }
    
    public final void LIZ(final ConstraintLayout constraintLayout, final 1si 1si) {
        CTM.LIZ((Object)constraintLayout, (Object)1si);
        final int id = constraintLayout.getId();
        final ConstraintLayout constraintLayout2 = (ConstraintLayout)this.LIZ.LIZ(2131367367);
        n.LIZIZ((Object)constraintLayout2, "");
        String s;
        if (id == constraintLayout2.getId()) {
            s = 2Bo.LIZLLL.LIZIZ("tiktok_live_watch_resource", "ttlive_bg_gradient_pink_3.png");
        }
        else {
            s = 2Bo.LIZLLL.LIZIZ("tiktok_live_watch_resource", "ttlive_bg_gradient_blue_3.png");
        }
        final ViewGroup$LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.width = 0cB.LIZ(152.0f);
        constraintLayout.setLayoutParams(layoutParams);
        0cb.LIZ((View)1si, s);
    }
}
