// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.PinMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class 1dq implements OnMessageListener
{
    public final /* synthetic */ Room LIZ;
    
    static {
        Covode.recordClassIndex(10517);
    }
    
    public 1dq(final Room liz) {
        this.LIZ = liz;
    }
    
    public final void onMessage(final IMessage message) {
        if (message instanceof PinMessage) {
            final long id = this.LIZ.getId();
            final 10h 10h = new 10h(this.LIZ.getId());
            final PinMessage lji = (PinMessage)message;
            10h.LIZIZ = lji.LJII;
            10h.LIZJ = false;
            10h.LIZLLL = false;
            10h.LJFF = X.10h.LJIIIZ.LIZ(lji);
            10h.LJI = lji;
            0zY.LIZ(id, 10h);
        }
    }
}
