// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.n;
import java.util.UUID;
import android.os.Message;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import android.os.Handler;

public final class 0Zt extends Handler
{
    static {
        Covode.recordClassIndex(5461);
    }
    
    public 0Zt(final Looper looper) {
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        CTM.LIZ((Object)message);
        if (message.what == 10087 && message.obj instanceof UUID && n.LIZ(message.obj, (Object)1Gp.LJIIIZ)) {
            DataChannelGlobal.LIZJ.LIZIZ((Class)HQB.class, (Object)GbF.ERROR);
            1Gp.LJIIJ.LJ();
            0Zx.LIZ(0Zx.LIZ, 10088);
        }
    }
}
