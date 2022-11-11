// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _SubscribeBadge_ProtoDecoder implements 0TU<SubscribeBadge>
{
    static {
        Covode.recordClassIndex(4986);
    }
    
    public static SubscribeBadge LIZ(final 0Ta 0Ta) {
        final SubscribeBadge subscribeBadge = new SubscribeBadge();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 3) {
                if (liziz != 4) {
                    0Tb.LIZJ(0Ta);
                }
                else {
                    subscribeBadge.previewImage = _ImageModel_ProtoDecoder.LIZ(0Ta);
                }
            }
            else {
                subscribeBadge.originImage = _ImageModel_ProtoDecoder.LIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        return subscribeBadge;
    }
}
