// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.bgbroadcast.game.api;

import X.7BB;
import X.5zP;
import X.1dl;
import X.FBF;
import X.7Aw;
import com.bytedance.covode.number.Covode;

public interface GameAutoCoverApi
{
    default static {
        Covode.recordClassIndex(5123);
    }
    
    @5zP
    @7BB(LIZ = "/webcast/room/screenshot_cover/update/")
    FBF<1dl<Void>> updateScreenShotStatus(@7Aw(LIZ = "status") final int p0);
}
