// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _BattleInviteResult_ResponseData_ProtoDecoder implements 0TU<BattleInviteResult.ResponseData>
{
    static {
        Covode.recordClassIndex(7893);
    }
    
    public static BattleInviteResult.ResponseData LIZ(final 0Ta 0Ta) {
        final BattleInviteResult.ResponseData responseData = new BattleInviteResult.ResponseData();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    0Tb.LIZJ(0Ta);
                }
                else {
                    responseData.LIZIZ = 0Ta.LJ();
                }
            }
            else {
                responseData.LIZ = 0Ta.LJFF();
            }
        }
        0Ta.LIZ(liz);
        return responseData;
    }
}
