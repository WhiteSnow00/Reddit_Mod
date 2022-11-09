// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.publicscreen.impl.api;

import X.7BB;
import X.5zP;
import X.1dl;
import X.FBF;
import X.7Aw;
import com.bytedance.covode.number.Covode;

public interface GiftListHistoryApi
{
    default static {
        Covode.recordClassIndex(10756);
    }
    
    @5zP
    @7BB(LIZ = "/webcast/gift/history/")
    FBF<1dl<Object>> fetchGiftHistory(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "cursor") final String p1, @7Aw(LIZ = "count") final Long p2);
}
