// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 2I2
{
    public final 51z LIZ;
    public final 527 LIZIZ;
    
    static {
        Covode.recordClassIndex(82619);
    }
    
    public 2I2(final 51z liz, final 527 liziz) {
        CTM.LIZ((Object)liz, (Object)liziz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final String LIZ() {
        final 2Hq ca_ = this.LIZIZ.ca_();
        if (ca_ == null) {
            return "no story list viewholder";
        }
        n.LIZIZ((Object)ca_, "");
        if (ca_.LJJIZ() == null) {
            return "no story viewholder";
        }
        final 51z liz = this.LIZ;
        final 2Hq ljjiz = ca_.LJJIZ();
        n.LIZIZ((Object)ljjiz, "");
        final String liz2 = liz.LIZ(ljjiz.LIZIZ(), false, ca_.LJJIZ());
        n.LIZIZ((Object)liz2, "");
        return liz2;
    }
}
