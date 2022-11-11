// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _RoomHostMultiGuestPermissionInfo_ProtoDecoder implements 0TU<RoomHostMultiGuestPermissionInfo>
{
    static {
        Covode.recordClassIndex(9816);
    }
    
    public static RoomHostMultiGuestPermissionInfo LIZ(final 0Ta 0Ta) {
        final RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo = new RoomHostMultiGuestPermissionInfo();
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
                    roomHostMultiGuestPermissionInfo.LIZIZ = _MultiGuestPermissionInfo_ProtoDecoder.LIZ(0Ta);
                }
            }
            else {
                roomHostMultiGuestPermissionInfo.LIZ = 0Tb.LIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        return roomHostMultiGuestPermissionInfo;
    }
}
