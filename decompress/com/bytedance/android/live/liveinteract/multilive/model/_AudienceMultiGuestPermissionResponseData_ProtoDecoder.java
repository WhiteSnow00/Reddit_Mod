// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.android.livesdk.model.linksetting._MultiGuestPermissionInfoAudienceSide_ProtoDecoder;
import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _AudienceMultiGuestPermissionResponseData_ProtoDecoder implements 0TU<AudienceMultiGuestPermissionResponseData>
{
    static {
        Covode.recordClassIndex(9793);
    }
    
    public static AudienceMultiGuestPermissionResponseData LIZ(final 0Ta 0Ta) {
        final AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData = new AudienceMultiGuestPermissionResponseData('\0');
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
                audienceMultiGuestPermissionResponseData.LIZ = _MultiGuestPermissionInfoAudienceSide_ProtoDecoder.LIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        return audienceMultiGuestPermissionResponseData;
    }
}
