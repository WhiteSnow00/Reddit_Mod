// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.adminsetting;

import X.7BB;
import X.5zP;
import X.1dl;
import X.FBF;
import X.7Aw;
import com.bytedance.covode.number.Covode;

public interface ChatApproveApi
{
    default static {
        Covode.recordClassIndex(4829);
    }
    
    @5zP
    @7BB(LIZ = "/webcast/room/chat/approve")
    FBF<1dl<Object>> chatApprove(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "msg_id") final long p1);
}
