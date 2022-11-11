// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _CombineBadgeBackground_ProtoDecoder implements 0TU<CombineBadgeBackground>
{
    static {
        Covode.recordClassIndex(4980);
    }
    
    public static CombineBadgeBackground LIZ(final 0Ta 0Ta) {
        final CombineBadgeBackground combineBadgeBackground = new CombineBadgeBackground();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        0Tb.LIZJ(0Ta);
                    }
                    else {
                        combineBadgeBackground.LIZJ = 0Ta.LIZLLL();
                    }
                }
                else {
                    combineBadgeBackground.LIZIZ = 0Ta.LIZLLL();
                }
            }
            else {
                combineBadgeBackground.LIZ = _ImageModel_ProtoDecoder.LIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        return combineBadgeBackground;
    }
}
