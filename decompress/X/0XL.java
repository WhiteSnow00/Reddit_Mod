// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;

@0kX(LIZ = "LINKER_MANAGER")
public final class 0xL
{
    public boolean LIZ;
    public boolean LIZIZ;
    public List<0xJ> LIZJ;
    public HashMap<0xG.a, 0xJ> LIZLLL;
    public 0xG.a LJ;
    
    static {
        Covode.recordClassIndex(10251);
    }
    
    public 0xL() {
        this.LIZJ = new ArrayList<0xJ>();
        new ArrayList();
        new ArrayList();
        this.LIZLLL = new HashMap<0xG.a, 0xJ>();
        this.LJ = 0xG.a.NONE;
    }
    
    private final 0xJ LIZ(final long n, final DataChannel dataChannel, final 0xG.a a) {
        final int n2 = 0xM.LIZIZ[a.ordinal()];
        if (n2 == 1) {
            return new 1Np(dataChannel);
        }
        if (n2 != 2) {
            return null;
        }
        return new 1TT(dataChannel);
    }
    
    public final 0xJ LIZ() {
        return this.LIZLLL.get(this.LJ);
    }
    
    public final void LIZ(final long n, final 0xG.a lj, final DataChannel dataChannel, final 1cm 1cm) {
        CTM.LIZ((Object)lj);
        if (!this.LIZLLL.containsKey(lj) || this.LIZLLL.get(lj) == null) {
            this.LIZLLL.put(lj, this.LIZ(n, dataChannel, lj));
        }
        final 0xJ 0xJ = this.LIZLLL.get(lj);
        if (0xJ != null) {
            this.LIZJ.clear();
            final List<0xJ> lizj = this.LIZJ;
            n.LIZIZ((Object)0xJ, "");
            lizj.add(0xJ);
            0xJ.LJI = 1cm.LIZ;
        }
        this.LJ = lj;
    }
    
    public final void LIZ(final 0xG.a a) {
        CTM.LIZ((Object)a);
        if (this.LIZLLL.containsKey(a)) {
            this.LIZLLL.remove(a);
            if (this.LJ == a) {
                this.LJ = 0xG.a.NONE;
            }
        }
    }
    
    public final 0xJ LIZIZ(final 0xG.a a) {
        CTM.LIZ((Object)a);
        return this.LIZLLL.get(a);
    }
}
