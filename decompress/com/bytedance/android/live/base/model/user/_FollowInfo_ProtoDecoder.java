// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _FollowInfo_ProtoDecoder implements 0TU<FollowInfo>
{
    static {
        Covode.recordClassIndex(4982);
    }
    
    public static FollowInfo LIZ(final 0Ta 0Ta) {
        final FollowInfo followInfo = new FollowInfo();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        if (liziz != 4) {
                            0Tb.LIZJ(0Ta);
                        }
                        else {
                            followInfo.pushStatus = 0Ta.LJFF();
                        }
                    }
                    else {
                        followInfo.followStatus = 0Ta.LJFF();
                    }
                }
                else {
                    followInfo.followerCount = 0Ta.LJFF();
                }
            }
            else {
                followInfo.followingCount = 0Ta.LJFF();
            }
        }
        0Ta.LIZ(liz);
        return followInfo;
    }
}
