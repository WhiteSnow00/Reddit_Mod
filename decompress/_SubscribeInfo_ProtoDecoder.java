// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _SubscribeInfo_ProtoDecoder implements 0TU<SubscribeInfo>
{
    static {
        Covode.recordClassIndex(4987);
    }
    
    public static SubscribeInfo LIZ(final 0Ta 0Ta) {
        final SubscribeInfo subscribeInfo = new SubscribeInfo();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            switch (liziz) {
                default: {
                    0Tb.LIZJ(0Ta);
                    continue;
                }
                case 1: {
                    subscribeInfo.isAnchorQualified = 0Tb.LIZ(0Ta);
                    continue;
                }
                case 2: {
                    subscribeInfo.isSubscribed = 0Tb.LIZ(0Ta);
                    continue;
                }
                case 3: {
                    subscribeInfo.subscribeBadge = _SubscribeBadge_ProtoDecoder.LIZ(0Ta);
                    continue;
                }
                case 4: {
                    subscribeInfo.anchorEnableSubscription = 0Tb.LIZ(0Ta);
                    continue;
                }
                case 5: {
                    subscribeInfo.subscriberCount = (int)0Ta.LJFF();
                    continue;
                }
                case 6: {
                    subscribeInfo.isInGracePeriod = 0Tb.LIZ(0Ta);
                    continue;
                }
                case 7: {
                    subscribeInfo.isSubscribedToCurrentAnchor = 0Tb.LIZ(0Ta);
                    continue;
                }
            }
        }
        0Ta.LIZ(liz);
        return subscribeInfo;
    }
}
