// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.emoji;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _EmoteModel_ProtoDecoder implements 0TU<EmoteModel>
{
    static {
        Covode.recordClassIndex(4926);
    }
    
    public static EmoteModel LIZ(final 0Ta 0Ta) {
        final EmoteModel emoteModel = new EmoteModel();
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
                            emoteModel.LJIIIIZZ = 0Ta.LIZLLL();
                        }
                    }
                    else {
                        emoteModel.LJII = 0Ta.LJ();
                    }
                }
                else {
                    emoteModel.LJI = _ImageModel_ProtoDecoder.LIZ(0Ta);
                }
            }
            else {
                emoteModel.LJFF = 0Ta.LIZLLL();
            }
        }
        0Ta.LIZ(liz);
        return emoteModel;
    }
}
