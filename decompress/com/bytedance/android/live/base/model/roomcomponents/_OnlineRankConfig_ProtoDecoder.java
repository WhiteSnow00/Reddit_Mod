// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.roomcomponents;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _OnlineRankConfig_ProtoDecoder implements 0TU<OnlineRankConfig>
{
    static {
        Covode.recordClassIndex(4958);
    }
    
    public static OnlineRankConfig LIZ(final 0Ta 0Ta) {
        final OnlineRankConfig onlineRankConfig = new OnlineRankConfig();
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
                            if (liziz != 5) {
                                0Tb.LIZJ(0Ta);
                            }
                            else {
                                onlineRankConfig.scoreShow = 0Tb.LIZ(0Ta);
                            }
                        }
                        else {
                            onlineRankConfig.avatarNumber = (int)0Ta.LJFF();
                        }
                    }
                    else {
                        onlineRankConfig.avatarShow = 0Tb.LIZ(0Ta);
                    }
                }
                else {
                    onlineRankConfig.onlinePanelClick = 0Tb.LIZ(0Ta);
                }
            }
            else {
                onlineRankConfig.onlinePanelShow = 0Tb.LIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        return onlineRankConfig;
    }
}
