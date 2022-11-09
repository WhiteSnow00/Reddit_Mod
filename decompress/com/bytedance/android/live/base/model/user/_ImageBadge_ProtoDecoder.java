// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _ImageBadge_ProtoDecoder implements 0TU<ImageBadge>
{
    static {
        Covode.recordClassIndex(4983);
    }
    
    public static ImageBadge LIZ(final 0Ta 0Ta) {
        final ImageBadge imageBadge = new ImageBadge();
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
                    imageBadge.LIZIZ = _ImageModel_ProtoDecoder.LIZ(0Ta);
                }
            }
            else {
                imageBadge.LIZ = 0Ta.LJ();
            }
        }
        0Ta.LIZ(liz);
        return imageBadge;
    }
}
