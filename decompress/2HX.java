// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.PortalMessage$PortalFinish;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.PortalMessage;

public final class 2HX extends 2Gk<PortalMessage>
{
    static {
        Covode.recordClassIndex(10873);
    }
    
    public 2HX(final PortalMessage portalMessage) {
        super((H31)portalMessage);
    }
    
    @Override
    public final User LIZIZ() {
        if (((PortalMessage)super.LJIILIIL).LJI instanceof PortalMessage$PortalFinish) {
            return ((PortalMessage$PortalFinish)((PortalMessage)super.LJIILIIL).LJI).LIZ;
        }
        return null;
    }
    
    @Override
    public final CharSequence p_() {
        return null;
    }
}
