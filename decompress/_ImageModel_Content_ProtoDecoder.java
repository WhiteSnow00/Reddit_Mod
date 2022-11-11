// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _ImageModel_Content_ProtoDecoder implements 0TU<ImageModel.Content>
{
    static {
        Covode.recordClassIndex(4911);
    }
    
    public static ImageModel.Content LIZ(final 0Ta 0Ta) {
        final ImageModel.Content content = new ImageModel.Content();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        0Tb.LIZJ(0Ta);
                    }
                    else {
                        content.LIZJ = 0Ta.LJFF();
                    }
                }
                else {
                    content.LIZIZ = 0Ta.LIZLLL();
                }
            }
            else {
                content.LIZ = 0Ta.LIZLLL();
            }
        }
        0Ta.LIZ(liz);
        return content;
    }
}
