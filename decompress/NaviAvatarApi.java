// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.navi.service;

import X.1LJ;
import X.7B9;
import X.1LE;
import X.FBF;
import X.7Ay;
import com.bytedance.covode.number.Covode;

public interface NaviAvatarApi
{
    default static {
        Covode.recordClassIndex(6528);
    }
    
    @7B9(LIZ = "/tiktok/v1/navi/candidates/")
    FBF<1LE> getCandidateList(@7Ay(LIZ = "transparent_candidates_required") final boolean p0, @7Ay(LIZ = "scenario") final int p1);
    
    @7B9(LIZ = "/tiktok/v1/navi/list/")
    FBF<1LJ> getNaviList(@7Ay(LIZ = "offset") final int p0, @7Ay(LIZ = "count") final int p1);
}
