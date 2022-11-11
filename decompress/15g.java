// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import androidx.lifecycle.af;

public final class 15g implements a
{
    public final /* synthetic */ 15i LIZ;
    
    static {
        Covode.recordClassIndex(1226);
    }
    
    public 15g(final 15i liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ() {
        final 15i liz = this.LIZ;
        ++liz.LIZ;
        if (liz.LIZ == 1 && liz.LIZLLL) {
            liz.LJFF.LIZ(0CC.a.ON_START);
            liz.LIZLLL = false;
        }
    }
    
    @Override
    public final void LIZIZ() {
        final 15i liz = this.LIZ;
        ++liz.LIZIZ;
        if (liz.LIZIZ == 1) {
            if (liz.LIZJ) {
                liz.LJFF.LIZ(0CC.a.ON_RESUME);
                liz.LIZJ = false;
                return;
            }
            liz.LJ.removeCallbacks(liz.LJI);
        }
    }
}
