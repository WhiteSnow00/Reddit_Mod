// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _EnlargeScreenManageResponse_ResponseData_ProtoDecoder implements 0TU<EnlargeScreenManageResponse.ResponseData>
{
    static {
        Covode.recordClassIndex(9798);
    }
    
    public static EnlargeScreenManageResponse.ResponseData LIZ(final 0Ta 0Ta) {
        final EnlargeScreenManageResponse.ResponseData responseData = new EnlargeScreenManageResponse.ResponseData();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                0Tb.LIZJ(0Ta);
            }
            else {
                responseData.LIZ = 0Ta.LIZLLL();
            }
        }
        0Ta.LIZ(liz);
        return responseData;
    }
}
