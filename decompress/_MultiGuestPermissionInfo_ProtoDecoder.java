// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _MultiGuestPermissionInfo_ProtoDecoder implements 0TU<MultiGuestPermissionInfo>
{
    static {
        Covode.recordClassIndex(9811);
    }
    
    public static MultiGuestPermissionInfo LIZ(final 0Ta 0Ta) {
        final MultiGuestPermissionInfo multiGuestPermissionInfo = new MultiGuestPermissionInfo();
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
                    multiGuestPermissionInfo.LIZIZ = 0Ta.LJFF();
                }
            }
            else {
                multiGuestPermissionInfo.LIZ = 0Tb.LIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        return multiGuestPermissionInfo;
    }
}
