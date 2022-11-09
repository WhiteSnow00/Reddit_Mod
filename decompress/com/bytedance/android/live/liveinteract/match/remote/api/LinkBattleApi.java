// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.remote.api;

import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import X.7Ay;
import X.0yd;
import com.bytedance.android.live.liveinteract.match.model.BattleFinishResult;
import X.7B9;
import X.7BB;
import X.5zP;
import X.1dl;
import X.FBF;
import X.7Aw;
import com.bytedance.covode.number.Covode;

public interface LinkBattleApi
{
    default static {
        Covode.recordClassIndex(7896);
    }
    
    @5zP
    @7BB(LIZ = "/webcast/battle/cancel/")
    FBF<1dl<Void>> cancel(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "channel_id") final long p1, @7Aw(LIZ = "battle_id") final long p2);
    
    @7B9(LIZ = "/webcast/battle/check_permission/")
    FBF<1dl<Void>> checkPermission();
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @5zP
    @7BB(LIZ = "/webcast/battle/finish/")
    FBF<1dl<BattleFinishResult.ResponseData>> finish(@7Aw(LIZ = "channel_id") final long p0, @7Aw(LIZ = "battle_id") final long p1, @7Aw(LIZ = "cut_short") final boolean p2, @7Aw(LIZ = "other_party_left") final boolean p3, @7Aw(LIZ = "other_party_user_id") final long p4);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/battle/info/")
    FBF<1dl<BattleInfoResponse>> getInfo(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "channel_id") final long p1, @7Ay(LIZ = "anchor_id") final long p2);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/battle/info/")
    FBF<1dl<BattleInfoResponse>> getInfo(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "channel_id") final long p1, @7Ay(LIZ = "battle_id") final long p2, @7Ay(LIZ = "anchor_id") final long p3);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/battle/info/")
    FBF<1dl<BattleInfoResponse>> getInfo(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "channel_id") final long p1, @7Ay(LIZ = "battle_id") final long p2, @7Ay(LIZ = "anchor_id") final long p3, @7Aw(LIZ = "scene") final int p4);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @5zP
    @7BB(LIZ = "/webcast/battle/invite/")
    FBF<1dl<BattleInviteResult.ResponseData>> invite(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "channel_id") final long p1, @7Aw(LIZ = "target_user_id") final long p2, @7Aw(LIZ = "invite_type") final int p3);
    
    @5zP
    @7BB(LIZ = "/webcast/battle/open/")
    FBF<1dl<Void>> open(@7Aw(LIZ = "channel_id") final long p0, @7Aw(LIZ = "battle_id") final long p1, @7Aw(LIZ = "duration") final long p2, @7Aw(LIZ = "actual_duration") final long p3, @7Aw(LIZ = "scene") final int p4);
    
    @5zP
    @7BB(LIZ = "/webcast/battle/punish/finish/")
    FBF<1dl<Void>> punish(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "channel_id") final long p1, @7Aw(LIZ = "cut_short") final boolean p2, @7Aw(LIZ = "scene") final int p3, @7Aw(LIZ = "battle_id") final long p4);
    
    @5zP
    @7BB(LIZ = "/webcast/battle/reject/")
    FBF<1dl<Void>> reject(@7Aw(LIZ = "channel_id") final long p0, @7Aw(LIZ = "battle_id") final long p1, @7Aw(LIZ = "invite_type") final int p2, @7Aw(LIZ = "scene") final int p3);
}
