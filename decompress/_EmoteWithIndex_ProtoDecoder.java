// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.emoji;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _EmoteWithIndex_ProtoDecoder implements 0TU<EmoteWithIndex>
{
    static {
        Covode.recordClassIndex(4927);
    }
    
    public static EmoteWithIndex LIZ(final 0Ta 0Ta) {
        final EmoteWithIndex emoteWithIndex = new EmoteWithIndex();
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
                    emoteWithIndex.emoteModel = _EmoteModel_ProtoDecoder.LIZ(0Ta);
                }
            }
            else {
                emoteWithIndex.index = (int)0Ta.LJFF();
            }
        }
        0Ta.LIZ(liz);
        return emoteWithIndex;
    }
}
