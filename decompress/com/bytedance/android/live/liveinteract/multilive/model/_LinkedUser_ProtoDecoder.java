// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _LinkedUser_ProtoDecoder implements 0TU<LinkedUser>
{
    static {
        Covode.recordClassIndex(9808);
    }
    
    public static LinkedUser LIZ(final 0Ta 0Ta) {
        final LinkedUser linkedUser = new LinkedUser((byte)0);
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
                            if (liziz != 5) {
                                0Tb.LIZJ(0Ta);
                            }
                            else {
                                linkedUser.LJ = 0Ta.LJ();
                            }
                        }
                        else {
                            linkedUser.LIZLLL = 0Ta.LJ();
                        }
                    }
                    else {
                        linkedUser.LIZJ = 0Ta.LJ();
                    }
                }
                else {
                    linkedUser.LIZIZ = 0Ta.LIZLLL();
                }
            }
            else {
                linkedUser.LIZ = 0Ta.LJFF();
            }
        }
        0Ta.LIZ(liz);
        return linkedUser;
    }
}
