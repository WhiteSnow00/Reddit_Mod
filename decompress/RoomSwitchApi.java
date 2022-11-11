// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.adminsetting;

import X.5zP;
import X.7Aw;
import X.7BN;
import X.7BB;
import X.1dl;
import X.FBF;
import X.5zN;
import X.1Ew;
import com.bytedance.covode.number.Covode;

public interface RoomSwitchApi
{
    default static {
        Covode.recordClassIndex(4831);
    }
    
    @7BB(LIZ = "/webcast/room/switch/batch_update/")
    @7BN(LIZ = { "Content-Type: application/json" })
    FBF<1dl<Object>> batchUpdateSwitch(@5zN final 1Ew p0);
    
    @5zP
    @7BB(LIZ = "/webcast/room/switch/update/")
    FBF<1dl<Object>> updateSwitch(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "switch_type") final int p1, @7Aw(LIZ = "switch_value") final boolean p2);
}
