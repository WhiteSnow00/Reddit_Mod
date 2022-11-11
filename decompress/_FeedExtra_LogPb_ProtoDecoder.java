// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.feed;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _FeedExtra_LogPb_ProtoDecoder implements 0TU<FeedExtra.LogPb>
{
    static {
        Covode.recordClassIndex(4935);
    }
    
    public static FeedExtra.LogPb LIZ(final 0Ta 0Ta) {
        final FeedExtra.LogPb logPb = new FeedExtra.LogPb();
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
                    logPb.LIZIZ = 0Ta.LJFF();
                }
            }
            else {
                logPb.LIZ = 0Ta.LIZLLL();
            }
        }
        0Ta.LIZ(liz);
        return logPb;
    }
}
