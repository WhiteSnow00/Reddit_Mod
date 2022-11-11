// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;

public final class 0v1 implements View$OnClickListener
{
    public final /* synthetic */ 1mP LIZ;
    
    static {
        Covode.recordClassIndex(9600);
    }
    
    public 0v1(final 1mP liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        final 1Uo lizj = this.LIZ.LIZJ;
        if (lizj == null) {
            return;
        }
        if (!lizj.LIZIZ) {
            return;
        }
        if (lizj.LIZLLL) {
            Hf4.LIZ(0cB.LJ(), 2131829785);
        }
        else {
            Hf4.LIZ(0cB.LJ(), 2131829138);
        }
        lizj.LIZLLL ^= true;
        final DataChannel liziz = this.LIZ.LIZIZ;
        if (liziz != null) {
            liziz.LIZJ((Class)2G6.class);
        }
    }
}
