// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.pin.api;

import X.2P9;
import X.7BB;
import X.5zP;
import X.1e6;
import X.1dl;
import X.FBF;
import X.7Aw;
import com.bytedance.covode.number.Covode;

public interface PinApi
{
    default static {
        Covode.recordClassIndex(10566);
    }
    
    @5zP
    @7BB(LIZ = "/webcast/room/pin/")
    FBF<1dl<1e6>> pin(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "method") final String p1, @7Aw(LIZ = "payload") final String p2);
    
    @5zP
    @7BB(LIZ = "/webcast/room/pin_cancel/")
    FBF<1dl<2P9>> unpin(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "content_msg_id") final long p1, @7Aw(LIZ = "pin_msg_id") final long p2, @7Aw(LIZ = "method") final String p3);
}
