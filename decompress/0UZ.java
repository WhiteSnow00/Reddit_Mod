// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;

public final class 0uz implements View$OnClickListener
{
    public final /* synthetic */ 1mP LIZ;
    
    static {
        Covode.recordClassIndex(9598);
    }
    
    public 0uz(final 1mP liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        final 1Uo lizj = this.LIZ.LIZJ;
        if (lizj == null) {
            return;
        }
        if (!lizj.LIZIZ && lizj.LJJIFFI == 2) {
            Hf4.LIZ(0cB.LJ(), 2131831268);
            return;
        }
        lizj.LIZIZ ^= true;
        this.LIZ.LIZLLL();
        if (lizj.LIZIZ) {
            lizj.LJJI = 1;
        }
        else {
            lizj.LJJI = 2;
        }
        final DataChannel liziz = this.LIZ.LIZIZ;
        if (liziz != null) {
            liziz.LIZJ((Class)2GA.class, (Object)lizj.LIZIZ);
        }
        0uW.LIZJ.LIZ(lizj.LIZIZ, "link_management_panel", lizj.LJJIIZI);
        final 1Uo lizj2 = this.LIZ.LIZJ;
        if (lizj2 == null) {
            return;
        }
        if (lizj2.LIZIZ) {
            1NO.LIZ().LJI = 1;
            return;
        }
        1NO.LIZ().LJI = 2;
    }
}
