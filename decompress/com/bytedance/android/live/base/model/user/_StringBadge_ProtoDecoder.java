// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _StringBadge_ProtoDecoder implements 0TU<StringBadge>
{
    static {
        Covode.recordClassIndex(4985);
    }
    
    public static StringBadge LIZ(final 0Ta 0Ta) {
        final StringBadge stringBadge = new StringBadge();
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
                    stringBadge.LIZIZ = 0Ta.LIZLLL();
                }
            }
            else {
                stringBadge.LIZ = 0Ta.LJ();
            }
        }
        0Ta.LIZ(liz);
        return stringBadge;
    }
}
