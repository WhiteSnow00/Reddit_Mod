// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import java.util.List;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;

public abstract class 1mi extends 1cg<MultiMatchAudienceWidget>
{
    public final Fhs LJIILIIL;
    
    static {
        Covode.recordClassIndex(10180);
    }
    
    public 1mi() {
        this.LJIILIIL = new Fhs(Looper.getMainLooper(), (Fhr)this);
    }
    
    public abstract void LIZ(final LinkMicBattleMessage p0);
    
    public abstract void LIZ(final List<Vwg> p0, final List<Vwg> p1);
    
    public abstract boolean LIZ(final BattleInfoResponse p0, final int p1);
    
    public abstract void LIZIZ(final String p0);
}
