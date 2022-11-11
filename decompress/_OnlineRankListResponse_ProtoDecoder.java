// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.roomcomponents;

import com.bytedance.android.livesdk.rank.api.model._RankItem_ProtoDecoder;
import X.0Tb;
import com.bytedance.android.livesdk.rank.api.model.RankItem;
import java.util.ArrayList;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _OnlineRankListResponse_ProtoDecoder implements 0TU<OnlineRankListResponse>
{
    static {
        Covode.recordClassIndex(4959);
    }
    
    public static OnlineRankListResponse LIZ(final 0Ta 0Ta) {
        final OnlineRankListResponse onlineRankListResponse = new OnlineRankListResponse();
        onlineRankListResponse.ranks = new ArrayList<RankItem>();
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
                            if (liziz != 6) {
                                if (liziz != 8) {
                                    0Tb.LIZJ(0Ta);
                                }
                                else {
                                    onlineRankListResponse.config = _OnlineRankConfig_ProtoDecoder.LIZ(0Ta);
                                }
                            }
                            else {
                                onlineRankListResponse.total = (int)0Tb.LIZIZ(0Ta);
                            }
                        }
                        else {
                            onlineRankListResponse.isBroadcastMENAT = 0Tb.LIZ(0Ta);
                        }
                    }
                    else {
                        onlineRankListResponse.currency = 0Ta.LIZLLL();
                    }
                }
                else {
                    onlineRankListResponse.selfInfo = _RankItem_ProtoDecoder.LIZ(0Ta);
                }
            }
            else {
                onlineRankListResponse.ranks.add(_RankItem_ProtoDecoder.LIZ(0Ta));
            }
        }
        0Ta.LIZ(liz);
        return onlineRankListResponse;
    }
}
