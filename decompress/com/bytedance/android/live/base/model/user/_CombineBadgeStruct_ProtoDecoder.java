// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _CombineBadgeStruct_ProtoDecoder implements 0TU<CombineBadgeStruct>
{
    static {
        Covode.recordClassIndex(4981);
    }
    
    public static CombineBadgeStruct LIZ(final 0Ta 0Ta) {
        final CombineBadgeStruct combineBadgeStruct = new CombineBadgeStruct();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        if (liziz != 4) {
                            switch (liziz) {
                                default: {
                                    0Tb.LIZJ(0Ta);
                                    continue;
                                }
                                case 11: {
                                    combineBadgeStruct.LJ = _CombineBadgeBackground_ProtoDecoder.LIZ(0Ta);
                                    continue;
                                }
                                case 12: {
                                    combineBadgeStruct.LJFF = _CombineBadgeBackground_ProtoDecoder.LIZ(0Ta);
                                    continue;
                                }
                                case 13: {
                                    combineBadgeStruct.LJIIJ = 0Tb.LIZ(0Ta);
                                    continue;
                                }
                                case 14: {
                                    combineBadgeStruct.LJIIJJI = 0Tb.LIZ(0Ta);
                                    continue;
                                }
                                case 15: {
                                    combineBadgeStruct.LJI = 0Ta.LJ();
                                    continue;
                                }
                                case 16: {
                                    combineBadgeStruct.LJII = 0Ta.LJ();
                                    continue;
                                }
                                case 17: {
                                    combineBadgeStruct.LJIIIIZZ = 0Ta.LJ();
                                    continue;
                                }
                                case 18: {
                                    combineBadgeStruct.LJIIIZ = 0Ta.LJ();
                                    continue;
                                }
                            }
                        }
                        else {
                            combineBadgeStruct.LIZLLL = 0Ta.LIZLLL();
                        }
                    }
                    else {
                        combineBadgeStruct.LIZJ = _BadgeText_ProtoDecoder.LIZ(0Ta);
                    }
                }
                else {
                    combineBadgeStruct.LIZIZ = _ImageModel_ProtoDecoder.LIZ(0Ta);
                }
            }
            else {
                combineBadgeStruct.LIZ = 0Ta.LJ();
            }
        }
        0Ta.LIZ(liz);
        return combineBadgeStruct;
    }
}
