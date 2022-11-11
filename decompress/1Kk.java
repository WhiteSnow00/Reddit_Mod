// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public abstract class 1kK extends GpV<0qw.b>
{
    public 1cu LIZ;
    public 1Tr LIZIZ;
    public final Room LIZJ;
    
    static {
        Covode.recordClassIndex(7605);
    }
    
    public 1kK(final Room lizj, final DataChannel dataChannel) {
        CTM.LIZ((Object)lizj, (Object)dataChannel);
        this.LIZJ = lizj;
    }
    
    public abstract void LIZ(final int p0, final 1ZS p1);
    
    public abstract void LIZ(final 0qw.a p0);
    
    public abstract void LIZ(final String p0, final String p1, final int p2);
    
    public abstract void LIZ(final String p0, final boolean p1, final int p2);
    
    public final boolean LIZ(final Integer n) {
        return n != null && n == 4;
    }
    
    public 1cu LIZIZ() {
        final 1cu liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz;
    }
    
    public 1Tr LIZJ() {
        final 1Tr liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        return liziz;
    }
    
    public abstract void LJFF(final String p0);
    
    public abstract FIw<1dl<MultiLiveGuestInfoList>> LJI();
    
    public abstract GbZ LJII();
}
