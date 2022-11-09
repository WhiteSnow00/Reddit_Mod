// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.publicscreen.impl.api;

import X.7BB;
import X.5zP;
import com.bytedance.android.livesdk.game.model.CreateHighLightResult;
import X.1dl;
import X.FBF;
import X.7Aw;
import com.bytedance.covode.number.Covode;

public interface HighLightApi
{
    default static {
        Covode.recordClassIndex(10757);
    }
    
    @5zP
    @7BB(LIZ = "/webcast/game/live_fragment/cut/")
    FBF<1dl<CreateHighLightResult>> createHighLightVideo(@7Aw(LIZ = "fragment_id") final Long p0, @7Aw(LIZ = "room_id") final long p1, @7Aw(LIZ = "start_time") final long p2, @7Aw(LIZ = "end_time") final long p3, @7Aw(LIZ = "title") final String p4, @7Aw(LIZ = "cut_case") final int p5);
}
