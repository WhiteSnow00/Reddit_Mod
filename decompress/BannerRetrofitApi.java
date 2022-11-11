// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.banner;

import X.7B9;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import X.1dl;
import X.FBF;
import X.7Ay;
import com.bytedance.covode.number.Covode;

public interface BannerRetrofitApi
{
    default static {
        Covode.recordClassIndex(4890);
    }
    
    @7B9(LIZ = "/webcast/room/in_room_banner/")
    FBF<1dl<BannerInRoomCollection>> queryLiveRoomBanner(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "user_type") final int p1);
}
