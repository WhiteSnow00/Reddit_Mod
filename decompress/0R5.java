// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;

public final class 0r5 implements Runnable
{
    public final /* synthetic */ 10r LIZ;
    public final /* synthetic */ LinkMicAudienceNoticeMessage LIZIZ;
    
    static {
        Covode.recordClassIndex(8521);
    }
    
    public 0r5(final 10r liz, final LinkMicAudienceNoticeMessage liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        this.LIZ.LJIJI.LIZ((H31)this.LIZIZ, true);
    }
}
