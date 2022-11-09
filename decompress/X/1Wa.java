// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 1Wa extends 9Mp
{
    public final List<Vwg> LIZ;
    public final List<Vwg> LIZIZ;
    public final List<Vwg> LIZJ;
    
    static {
        Covode.recordClassIndex(8901);
    }
    
    public 1Wa(final List<Vwg> liz, final List<Vwg> liziz, final List<Vwg> lizj) {
        CTM.LIZ((Object)liz, (Object)liziz, (Object)lizj);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ };
    }
}
