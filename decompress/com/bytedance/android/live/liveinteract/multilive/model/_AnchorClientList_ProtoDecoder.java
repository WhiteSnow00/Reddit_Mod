// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import java.util.ArrayList;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _AnchorClientList_ProtoDecoder implements 0TU<AnchorClientList>
{
    static {
        Covode.recordClassIndex(9791);
    }
    
    public static AnchorClientList LIZ(final 0Ta 0Ta) {
        final AnchorClientList list = new AnchorClientList((byte)0);
        list.LIZLLL = new ArrayList<WaitUser>();
        list.LIZ = new ArrayList<WaitUser>();
        list.LIZIZ = new ArrayList<WaitUser>();
        list.LIZJ = new ArrayList<WaitUser>();
        list.LJ = new ArrayList<LinkedUser>();
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
                                list.LJ.add(_LinkedUser_ProtoDecoder.LIZ(0Ta));
                            }
                        }
                        else {
                            list.LIZLLL.add(_WaitUser_ProtoDecoder.LIZ(0Ta));
                        }
                    }
                    else {
                        list.LIZJ.add(_WaitUser_ProtoDecoder.LIZ(0Ta));
                    }
                }
                else {
                    list.LIZIZ.add(_WaitUser_ProtoDecoder.LIZ(0Ta));
                }
            }
            else {
                list.LIZ.add(_WaitUser_ProtoDecoder.LIZ(0Ta));
            }
        }
        0Ta.LIZ(liz);
        return list;
    }
}
