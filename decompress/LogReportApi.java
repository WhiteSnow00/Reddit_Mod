// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.platform.common.api;

import X.7BB;
import X.1dl;
import X.FBF;
import X.5zN;
import X.7Ay;
import com.bytedance.covode.number.Covode;

public interface LogReportApi
{
    default static {
        Covode.recordClassIndex(10262);
    }
    
    @7BB(LIZ = "/webcast/stats/")
    FBF<1dl<Object>> logReport(@7Ay(LIZ = "ssmix") final String p0, @5zN final Object p1);
}
