// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;

public final class 1ll extends 1H8 implements 10c<LinkMicAudienceNoticeMessage>
{
    public 0b7 LIZLLL;
    
    static {
        Covode.recordClassIndex(8520);
    }
    
    public 1ll(final DataChannel dataChannel) {
        CTM.LIZ((Object)dataChannel);
        final 0b7 lizlll = new 0b7(dataChannel, (SRS<? super Boolean, 2P9>)super.LIZJ);
        lizlll.LIZ(new 1H7());
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final 0b7 LIZ() {
        return this.LIZLLL;
    }
    
    @Override
    public final void LJ() {
        this.LIZLLL.LIZJ();
    }
}
