// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _GuestClientList_ProtoDecoder implements 0TU<GuestClientList>
{
    static {
        Covode.recordClassIndex(9800);
    }
    
    public static GuestClientList LIZ(final 0Ta 0Ta) {
        final GuestClientList list = new GuestClientList((byte)0);
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
                            0Tb.LIZJ(0Ta);
                        }
                        else {
                            list.LIZLLL = 0Ta.LJ();
                        }
                    }
                    else {
                        list.LIZJ = 0Ta.LJ();
                    }
                }
                else {
                    list.LIZIZ = 0Ta.LIZLLL();
                }
            }
            else {
                list.LIZ = 0Ta.LJFF();
            }
        }
        0Ta.LIZ(liz);
        return list;
    }
}
