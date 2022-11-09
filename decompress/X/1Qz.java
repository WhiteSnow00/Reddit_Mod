// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 1Qz implements F7Q
{
    public final /* synthetic */ 1lM LIZ;
    
    static {
        Covode.recordClassIndex(7828);
    }
    
    public 1Qz(final 1lM liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ() {
        0ba.LIZ(4, "LinkPKPresenterTag", "startPunishCountDown, finish");
        final DataChannel ljjijl = this.LIZ.LJJIJL;
        if (ljjijl != null) {
            ljjijl.LIZIZ((Class)2F9.class, (Object)0L);
        }
        if (this.LIZ.LIZJ) {
            0xt.LIZIZ.LIZIZ(0xt.a.TIME_OUT);
            1lM.LIZIZ(this.LIZ, 102, false);
            return;
        }
        this.LIZ.LIZ("punish_count_down", false);
    }
}
