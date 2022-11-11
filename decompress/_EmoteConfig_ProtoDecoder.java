// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.emoji;

import X.0Tb;
import java.util.ArrayList;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _EmoteConfig_ProtoDecoder implements 0TU<EmoteConfig>
{
    static {
        Covode.recordClassIndex(4925);
    }
    
    public static EmoteConfig LIZ(final 0Ta 0Ta) {
        final EmoteConfig emoteConfig = new EmoteConfig();
        emoteConfig.LIZIZ = new ArrayList<EmoteModel>();
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
                    emoteConfig.LIZIZ.add(_EmoteModel_ProtoDecoder.LIZ(0Ta));
                }
            }
            else {
                emoteConfig.LIZ = 0Ta.LJ();
            }
        }
        0Ta.LIZ(liz);
        return emoteConfig;
    }
}
