// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;

public final class 0nP implements Runnable
{
    public final /* synthetic */ 10r LIZ;
    public final /* synthetic */ LinkMicBattleNoticeMessage LIZIZ;
    
    static {
        Covode.recordClassIndex(7878);
    }
    
    public 0nP(final 10r liz, final LinkMicBattleNoticeMessage liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        this.LIZ.LJIJI.LIZ((H31)this.LIZIZ, true);
    }
}
