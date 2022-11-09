// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;

public final class 1n3 extends 1H8 implements 10c<GiftCollectionUpdateMessage>
{
    public final DataChannel LIZLLL;
    public 0b7 LJ;
    
    static {
        Covode.recordClassIndex(10778);
    }
    
    public 1n3(final DataChannel lizlll) {
        CTM.LIZ((Object)lizlll);
        this.LIZLLL = lizlll;
        final 0b7 lj = new 0b7(lizlll, (SRS<? super Boolean, 2P9>)super.LIZJ);
        lj.LIZ(new 1H7());
        this.LJ = lj;
    }
    
    @Override
    public final 0b7 LIZ() {
        return this.LJ;
    }
    
    @Override
    public final void LJ() {
        this.LJ.LIZJ();
    }
}
