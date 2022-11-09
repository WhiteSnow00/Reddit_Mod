// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public abstract class 0b6
{
    public final FH6 LIZIZ;
    public DataChannel LIZJ;
    public 0b7 LIZLLL;
    public boolean LJ;
    
    static {
        Covode.recordClassIndex(5608);
    }
    
    public 0b6() {
        this.LJ = false;
        this.LIZIZ = new FH6();
    }
    
    public abstract void LIZ();
    
    public final void LIZ(final boolean lj) {
        if (this.LJ != lj) {
            this.LJ = lj;
            final 0b7 lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.LIZ(lj);
            }
        }
    }
}
