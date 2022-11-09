// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class 1Vt extends 9Mp
{
    public final Room LIZ;
    public final Context LIZIZ;
    public final DataChannel LIZJ;
    
    static {
        Covode.recordClassIndex(8825);
    }
    
    public 1Vt(final Room liz, final Context liziz, final DataChannel lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ };
    }
}
