// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _HostMultiGuestPermissionResponse_ResponseData_ProtoDecoder implements 0TU<HostMultiGuestPermissionResponse.ResponseData>
{
    static {
        Covode.recordClassIndex(9807);
    }
    
    public static HostMultiGuestPermissionResponse.ResponseData LIZ(final 0Ta 0Ta) {
        final HostMultiGuestPermissionResponse.ResponseData responseData = new HostMultiGuestPermissionResponse.ResponseData('\0');
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
                responseData.LIZ = _MultiGuestPermissionInfo_ProtoDecoder.LIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        return responseData;
    }
}
