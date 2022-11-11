// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.android.livesdk.chatroom.model.interact._ListReachEnhancementUser_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._LinkPlayerInfo_ProtoDecoder;
import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _MultiLiveGuestInfoList_ProtoDecoder implements 0TU<MultiLiveGuestInfoList>
{
    static {
        Covode.recordClassIndex(9812);
    }
    
    public static MultiLiveGuestInfoList LIZ(final 0Ta 0Ta) {
        final MultiLiveGuestInfoList list = new MultiLiveGuestInfoList();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                0Ta.LIZ(liz);
                return list;
            }
            switch (liziz) {
                default: {
                    0Tb.LIZJ(0Ta);
                    continue;
                }
                case 1: {
                    list.LIZ.add(_LinkPlayerInfo_ProtoDecoder.LIZ(0Ta));
                    continue;
                }
                case 2: {
                    list.LIZIZ.add(_LinkPlayerInfo_ProtoDecoder.LIZ(0Ta));
                    continue;
                }
                case 3: {
                    list.LIZJ.add(_LinkPlayerInfo_ProtoDecoder.LIZ(0Ta));
                    continue;
                }
                case 4: {
                    list.LIZLLL.add(_LinkPlayerInfo_ProtoDecoder.LIZ(0Ta));
                    continue;
                }
                case 5: {
                    list.LJ.add(_ListReachEnhancementUser_ProtoDecoder.LIZ(0Ta));
                    continue;
                }
                case 6: {
                    list.LJI.add(_LinkPlayerInfo_ProtoDecoder.LIZ(0Ta));
                    continue;
                }
                case 7: {
                    final long liz2 = 0Ta.LIZ();
                    String lizlll = null;
                    String lizlll2 = null;
                    while (true) {
                        final int liziz2 = 0Ta.LIZIZ();
                        if (liziz2 == -1) {
                            break;
                        }
                        if (liziz2 != 1) {
                            if (liziz2 != 2) {
                                continue;
                            }
                            lizlll2 = 0Ta.LIZLLL();
                        }
                        else {
                            lizlll = 0Ta.LIZLLL();
                        }
                    }
                    0Ta.LIZ(liz2);
                    if (lizlll == null) {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                    if (lizlll2 != null) {
                        list.LJFF.put(lizlll, lizlll2);
                        continue;
                    }
                    throw new IllegalStateException("Map value must not be null!");
                }
                case 8: {
                    list.LJII = 0Ta.LJ();
                    continue;
                }
            }
        }
    }
}
