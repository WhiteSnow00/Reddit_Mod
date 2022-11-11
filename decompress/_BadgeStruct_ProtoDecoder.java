// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _BadgeStruct_ProtoDecoder implements 0TU<BadgeStruct>
{
    static {
        Covode.recordClassIndex(4978);
    }
    
    public static BadgeStruct LIZ(final 0Ta 0Ta) {
        final BadgeStruct badgeStruct = new BadgeStruct();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        switch (liziz) {
                            default: {
                                switch (liziz) {
                                    default: {
                                        0Tb.LIZJ(0Ta);
                                        continue;
                                    }
                                    case 20: {
                                        badgeStruct.LIZLLL = _ImageBadge_ProtoDecoder.LIZ(0Ta);
                                        continue;
                                    }
                                    case 21: {
                                        badgeStruct.LJ = _TextBadge_ProtoDecoder.LIZ(0Ta);
                                        continue;
                                    }
                                    case 22: {
                                        badgeStruct.LJFF = _StringBadge_ProtoDecoder.LIZ(0Ta);
                                        continue;
                                    }
                                    case 23: {
                                        badgeStruct.LJI = _CombineBadgeStruct_ProtoDecoder.LIZ(0Ta);
                                        continue;
                                    }
                                }
                                break;
                            }
                            case 10: {
                                badgeStruct.LJII = 0Ta.LIZLLL();
                                continue;
                            }
                            case 11: {
                                badgeStruct.LJIIIIZZ = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 12: {
                                badgeStruct.LJIIIZ = _PrivilegeLogExtra_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                        }
                    }
                    else {
                        badgeStruct.LIZJ = 0Ta.LJ();
                    }
                }
                else {
                    badgeStruct.LIZIZ = 0Ta.LJ();
                }
            }
            else {
                badgeStruct.LIZ = 0Ta.LJ();
            }
        }
        0Ta.LIZ(liz);
        return badgeStruct;
    }
}
