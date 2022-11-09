// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model;

import X.0Tb;
import java.util.ArrayList;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _ImageModel_ProtoDecoder implements 0TU<ImageModel>
{
    static {
        Covode.recordClassIndex(4912);
    }
    
    public static ImageModel LIZ(final 0Ta 0Ta) {
        final ImageModel imageModel = new ImageModel();
        imageModel.mUrls = new ArrayList<String>();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            switch (liziz) {
                default: {
                    0Tb.LIZJ(0Ta);
                    continue;
                }
                case 1: {
                    imageModel.mUrls.add(0Ta.LIZLLL());
                    continue;
                }
                case 2: {
                    imageModel.mUri = 0Ta.LIZLLL();
                    continue;
                }
                case 3: {
                    imageModel.height = (int)0Tb.LIZIZ(0Ta);
                    continue;
                }
                case 4: {
                    imageModel.width = (int)0Tb.LIZIZ(0Ta);
                    continue;
                }
                case 5: {
                    imageModel.avgColor = 0Ta.LIZLLL();
                    continue;
                }
                case 6: {
                    imageModel.imageType = 0Ta.LJ();
                    continue;
                }
                case 7: {
                    imageModel.schema = 0Ta.LIZLLL();
                    continue;
                }
                case 8: {
                    imageModel.content = _ImageModel_Content_ProtoDecoder.LIZ(0Ta);
                    continue;
                }
                case 9: {
                    imageModel.isAnimated = 0Tb.LIZ(0Ta);
                    continue;
                }
            }
        }
        0Ta.LIZ(liz);
        return imageModel;
    }
}
