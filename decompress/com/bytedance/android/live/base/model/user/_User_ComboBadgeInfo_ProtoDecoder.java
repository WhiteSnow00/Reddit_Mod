// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _User_ComboBadgeInfo_ProtoDecoder implements 0TU<User.ComboBadgeInfo>
{
    static {
        Covode.recordClassIndex(4989);
    }
    
    public static User.ComboBadgeInfo LIZ(final 0Ta 0Ta) {
        final User.ComboBadgeInfo comboBadgeInfo = new User.ComboBadgeInfo();
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
                    comboBadgeInfo.LIZIZ = 0Ta.LJFF();
                }
            }
            else {
                comboBadgeInfo.LIZ = _ImageModel_ProtoDecoder.LIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        return comboBadgeInfo;
    }
}
