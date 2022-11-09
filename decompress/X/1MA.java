// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.covode.number.Covode;

public interface 1ma extends GpW
{
    default static {
        Covode.recordClassIndex(9931);
    }
    
    void LIZ(final LinkMicBattleMessage p0);
    
    boolean LIZ(final BattleInfoResponse p0, final int p1);
}
