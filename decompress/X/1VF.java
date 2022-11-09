// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class 1Vf implements 0s7
{
    public DataChannel LIZ;
    
    static {
        Covode.recordClassIndex(8800);
    }
    
    public 1Vf(final DataChannel liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    @Override
    public final boolean LIZ() {
        final Room room = (Room)this.LIZ.LIZIZ((Class)G69.class);
        if (room != null && room.getMosaicStatus() == 1) {
            Hf4.LIZ(0cB.LJ(), 2131835948);
            return true;
        }
        return false;
    }
}
