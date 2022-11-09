// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.api.blockword;

import X.1FS;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetExtra;
import X.1FQ;
import X.0z4;
import X.7B9;
import X.1FP;
import X.1dl;
import X.FBF;
import X.7Ay;
import com.bytedance.covode.number.Covode;

public interface BlockWordApi
{
    default static {
        Covode.recordClassIndex(5022);
    }
    
    @7B9(LIZ = "/webcast/room/add_sensitive_word/")
    FBF<1dl<1FP>> addBlockWord(@7Ay(LIZ = "sec_anchor_id") final String p0, @7Ay(LIZ = "room_id") final long p1, @7Ay(LIZ = "word_list") final String p2);
    
    @7B9(LIZ = "/webcast/room/add_sensitive_word/")
    FBF<1dl<1FP>> addBlockWord(@7Ay(LIZ = "word") final String p0, @7Ay(LIZ = "sec_anchor_id") final String p1, @7Ay(LIZ = "room_id") final long p2);
    
    @7B9(LIZ = "/webcast/room/del_sensitive_word/")
    FBF<1dl<Object>> deleteBlockWord(@7Ay(LIZ = "word_id") final int p0, @7Ay(LIZ = "sec_anchor_id") final String p1, @7Ay(LIZ = "room_id") final long p2);
    
    @7B9(LIZ = "/webcast/room/get_sensitive_word/")
    FBF<0z4<1FQ, BlockWordGetExtra>> getBlockWord(@7Ay(LIZ = "sec_anchor_id") final String p0, @7Ay(LIZ = "room_id") final long p1);
    
    @7B9(LIZ = "/webcast/room/recommend_sensitive_word/")
    FBF<1dl<1FS>> recommendBlockWord(@7Ay(LIZ = "content") final String p0, @7Ay(LIZ = "room_id") final long p1);
}
