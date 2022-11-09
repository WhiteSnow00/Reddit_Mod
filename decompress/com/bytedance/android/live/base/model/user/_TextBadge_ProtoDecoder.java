// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import X.0Tb;
import java.util.ArrayList;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _TextBadge_ProtoDecoder implements 0TU<TextBadge>
{
    static {
        Covode.recordClassIndex(4988);
    }
    
    public static TextBadge LIZ(final 0Ta 0Ta) {
        final TextBadge textBadge = new TextBadge();
        textBadge.LIZLLL = new ArrayList<String>();
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
                            textBadge.LIZLLL.add(0Ta.LIZLLL());
                        }
                    }
                    else {
                        textBadge.LIZJ = 0Ta.LIZLLL();
                    }
                }
                else {
                    textBadge.LIZIZ = 0Ta.LIZLLL();
                }
            }
            else {
                textBadge.LIZ = 0Ta.LJ();
            }
        }
        0Ta.LIZ(liz);
        return textBadge;
    }
}
