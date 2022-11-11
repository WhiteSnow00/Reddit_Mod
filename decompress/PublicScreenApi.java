// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.publicscreen.impl.api;

import X.7BB;
import X.5zP;
import X.10u;
import X.1dl;
import X.FBF;
import X.7Aw;
import com.bytedance.covode.number.Covode;

public interface PublicScreenApi
{
    default static {
        Covode.recordClassIndex(10758);
    }
    
    @5zP
    @7BB(LIZ = "/webcast/room/comment_translate/")
    FBF<1dl<10u>> translateComment(@7Aw(LIZ = "comment_content") final String p0, @7Aw(LIZ = "anchor_id") final long p1);
}
