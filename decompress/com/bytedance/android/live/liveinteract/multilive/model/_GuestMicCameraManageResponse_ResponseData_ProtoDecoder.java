// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _GuestMicCameraManageResponse_ResponseData_ProtoDecoder implements 0TU<GuestMicCameraManageResponse.ResponseData>
{
    static {
        Covode.recordClassIndex(9803);
    }
    
    public static GuestMicCameraManageResponse.ResponseData LIZ(final 0Ta 0Ta) {
        final GuestMicCameraManageResponse.ResponseData responseData = new GuestMicCameraManageResponse.ResponseData();
        final long liz = 0Ta.LIZ();
        while (0Ta.LIZIZ() != -1) {
            0Tb.LIZJ(0Ta);
        }
        0Ta.LIZ(liz);
        return responseData;
    }
}
