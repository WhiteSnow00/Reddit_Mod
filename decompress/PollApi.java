// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.poll;

import X.7BB;
import X.5zP;
import com.bytedance.android.livesdk.model.VoteResponseData;
import X.EL0;
import X.7Aw;
import X.GhZ;
import X.GdH;
import X.7B9;
import X.GdI;
import X.1dl;
import X.FBF;
import X.7Ay;
import com.bytedance.covode.number.Covode;

public interface PollApi
{
    default static {
        Covode.recordClassIndex(10609);
    }
    
    @7B9(LIZ = "/webcast/room/poll/end")
    FBF<1dl<GdI>> endPoll(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "poll_id") final long p1, @7Ay(LIZ = "end_type") final int p2);
    
    @7B9(LIZ = "/webcast/room/poll/latest")
    FBF<1dl<GdH>> getPollHistory(@7Ay(LIZ = "room_id") final long p0);
    
    @7B9(LIZ = "/webcast/room/poll/start")
    FBF<1dl<GhZ>> startPoll(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "option_list") final String p1, @7Ay(LIZ = "duration_ms") final long p2, @7Ay(LIZ = "kind") final int p3);
    
    @5zP
    @7BB(LIZ = "/webcast/room/poll/vote")
    EL0<1dl<VoteResponseData>> vote(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "poll_id") final long p1, @7Aw(LIZ = "option_index") final int p2);
}
