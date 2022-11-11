// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.api;

import X.7BN;
import X.5zN;
import X.1JY;
import X.7BB;
import X.5zP;
import X.2P9;
import X.7Aw;
import X.7B9;
import X.0gp;
import X.1dl;
import X.FBF;
import X.7Ay;
import com.bytedance.covode.number.Covode;

public interface EffectRelatedApi
{
    default static {
        Covode.recordClassIndex(6170);
    }
    
    @7B9(LIZ = "/webcast/room/sound_effect/")
    FBF<1dl<0gp>> fetchSoundEffect(@7Ay(LIZ = "room_id") final long p0);
    
    @5zP
    @7BB(LIZ = "/webcast/live_center/task/event_report/")
    FBF<1dl<2P9>> finishEffectTask(@7Aw(LIZ = "event_type") final int p0);
    
    @5zP
    @7BB(LIZ = "/webcast/room/internal_ci_info/")
    FBF<1dl<Void>> uploadBeautyParams(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "filter_name") final String p1, @7Aw(LIZ = "brightening") final int p2, @7Aw(LIZ = "beauty_skin") final int p3, @7Aw(LIZ = "big_eyes") final int p4, @7Aw(LIZ = "face_lift") final int p5, @7Aw(LIZ = "use_filter") final boolean p6);
    
    @7BB(LIZ = "/webcast/room/modification/upload/")
    @7BN(LIZ = { "Content-Type: application/json" })
    FBF<1dl<Void>> uploadEffectRelatedUseLog(@5zN final 1JY p0);
}
