// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import X.0GY;
import com.bytedance.covode.number.Covode;

public class AudioAttributesImplBaseParcelizer
{
    static {
        Covode.recordClassIndex(1347);
    }
    
    public static AudioAttributesImplBase read(final 0GY 0gy) {
        final AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.LIZ = 0gy.LIZIZ(audioAttributesImplBase.LIZ, 1);
        audioAttributesImplBase.LIZIZ = 0gy.LIZIZ(audioAttributesImplBase.LIZIZ, 2);
        audioAttributesImplBase.LIZJ = 0gy.LIZIZ(audioAttributesImplBase.LIZJ, 3);
        audioAttributesImplBase.LIZLLL = 0gy.LIZIZ(audioAttributesImplBase.LIZLLL, 4);
        return audioAttributesImplBase;
    }
    
    public static void write(final AudioAttributesImplBase audioAttributesImplBase, final 0GY 0gy) {
        0gy.LIZ(audioAttributesImplBase.LIZ, 1);
        0gy.LIZ(audioAttributesImplBase.LIZIZ, 2);
        0gy.LIZ(audioAttributesImplBase.LIZJ, 3);
        0gy.LIZ(audioAttributesImplBase.LIZLLL, 4);
    }
}
