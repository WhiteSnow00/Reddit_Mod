// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _ChannelMessage_ProtoDecoder implements 0TU<ChannelMessage>
{
    static {
        Covode.recordClassIndex(9795);
    }
    
    public static ChannelMessage LIZ(final 0Ta 0Ta) {
        final ChannelMessage channelMessage = new ChannelMessage((byte)0);
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
                            channelMessage.LIZLLL = 0Ta.LJ();
                        }
                    }
                    else {
                        channelMessage.LIZJ = 0Ta.LIZLLL();
                    }
                }
                else {
                    channelMessage.LIZIZ = 0Ta.LJ();
                }
            }
            else {
                channelMessage.LIZ = 0Ta.LJFF();
            }
        }
        0Ta.LIZ(liz);
        return channelMessage;
    }
}
