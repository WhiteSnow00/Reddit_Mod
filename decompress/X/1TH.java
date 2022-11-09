// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Set;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class 1th extends Str
{
    public final DataChannel LIZ;
    
    static {
        Covode.recordClassIndex(6570);
    }
    
    public 1th(final 0Gh 0Gh, final DataChannel liz) {
        CTM.LIZ((Object)0Gh);
        super(0Gh);
        this.LIZ = liz;
    }
    
    public final void LIZ(final T0r t0r) {
        super.LIZ(t0r);
        0ht.LIZIZ(t0r);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_pm_live_beauty_tab_change");
        liz.LIZ();
        final 1Lm 1Lm = null;
        Object liz2;
        if (t0r != null) {
            liz2 = t0r.LIZ;
        }
        else {
            liz2 = null;
        }
        Object o = liz2;
        if (!(liz2 instanceof 1Lm)) {
            o = null;
        }
        final 1Lm 1Lm2 = (1Lm)o;
        String liziz;
        if (1Lm2 != null) {
            liziz = 1Lm2.LIZIZ;
        }
        else {
            liziz = null;
        }
        liz.LIZ("tab", liziz);
        liz.LIZLLL();
        Object liz3;
        if (t0r != null) {
            liz3 = t0r.LIZ;
        }
        else {
            liz3 = null;
        }
        if (!(liz3 instanceof 1Lm)) {
            liz3 = 1Lm;
        }
        final 1Lm 1Lm3 = (1Lm)liz3;
        if (1Lm3 != null) {
            final String liziz2 = 1Lm3.LIZIZ;
            final DataChannel liz4 = this.LIZ;
            CTM.LIZ((Object)liziz2);
            final 44V llllz = GST.LLLLZ;
            n.LIZIZ((Object)llllz, "");
            ((Set)((44T)llllz).LIZ()).remove(liziz2);
            if (liz4 != null) {
                liz4.LIZJ((Class)2C0.class);
            }
        }
    }
    
    public final void LIZIZ(final T0r t0r) {
        super.LIZIZ(t0r);
        0ht.LIZ(t0r);
    }
}
