// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _WaitUser_ProtoDecoder implements 0TU<WaitUser>
{
    static {
        Covode.recordClassIndex(9817);
    }
    
    public static WaitUser LIZ(final 0Ta 0Ta) {
        final WaitUser waitUser = new WaitUser((byte)0);
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
                    waitUser.LIZIZ = 0Ta.LIZLLL();
                }
            }
            else {
                waitUser.LIZ = 0Ta.LJFF();
            }
        }
        0Ta.LIZ(liz);
        return waitUser;
    }
}
