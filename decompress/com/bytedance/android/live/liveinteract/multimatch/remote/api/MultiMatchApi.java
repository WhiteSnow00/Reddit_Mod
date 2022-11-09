// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multimatch.remote.api;

import X.7B9;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import X.7Ay;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiBattleFinishResponse;
import X.7BB;
import X.5zP;
import X.2P9;
import X.1dl;
import X.FBF;
import X.7Aw;
import com.bytedance.covode.number.Covode;

public interface MultiMatchApi
{
    default static {
        Covode.recordClassIndex(10225);
    }
    
    @5zP
    @7BB(LIZ = "/webcast/battle/accept/")
    FBF<1dl<2P9>> acceptInvite(@7Aw(LIZ = "battle_id") final long p0, @7Aw(LIZ = "channel_id") final long p1, @7Aw(LIZ = "duration") final long p2, @7Aw(LIZ = "actual_duration") final long p3, @7Aw(LIZ = "accept_scene") final int p4);
    
    @5zP
    @7BB(LIZ = "/webcast/battle/approval_quit/")
    FBF<1dl<2P9>> approvalQuit(@7Aw(LIZ = "channel_id") final long p0, @7Aw(LIZ = "battle_id") final long p1, @7Aw(LIZ = "action") final int p2);
    
    @5zP
    @7BB(LIZ = "/webcast/battle/cancel/")
    FBF<1dl<2P9>> cancel(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "channel_id") final long p1, @7Aw(LIZ = "battle_id") final long p2, @7Aw(LIZ = "scene") final int p3);
    
    @5zP
    @7BB(LIZ = "/webcast/battle/multi_finish/")
    FBF<1dl<MultiBattleFinishResponse>> multiFinish(@7Aw(LIZ = "channel_id") final long p0, @7Aw(LIZ = "battle_id") final long p1, @7Aw(LIZ = "cut_short_by_user") final long p2);
    
    @5zP
    @7BB(LIZ = "/webcast/battle/multi_invite/")
    FBF<1dl<MultiInviteResponse>> multiInvite(@7Aw(LIZ = "channel_id") final long p0, @7Aw(LIZ = "invite_type") final int p1, @7Aw(LIZ = "teammate_users") final String p2, @7Aw(LIZ = "rival_users") final String p3);
    
    @7B9(LIZ = "/webcast/battle/prepare_multi_battle/")
    FBF<1dl<MultiMatchPrepareResponse>> prepareMultiMatch(@7Ay(LIZ = "channel_id") final long p0);
    
    @5zP
    @7BB(LIZ = "/webcast/battle/quit/")
    FBF<1dl<2P9>> quit(@7Aw(LIZ = "battle_id") final long p0, @7Aw(LIZ = "channel_id") final long p1);
}
