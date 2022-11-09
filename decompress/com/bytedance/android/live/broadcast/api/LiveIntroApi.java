// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.api;

import X.7B9;
import X.FmM;
import X.1dl;
import X.FBF;
import com.bytedance.covode.number.Covode;

public interface LiveIntroApi
{
    default static {
        Covode.recordClassIndex(5013);
    }
    
    @7B9(LIZ = "/webcast/room/live_intro/")
    FBF<1dl<FmM>> getLiveIntroData();
}
