// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import X.0GZ;
import X.0GY;
import com.bytedance.covode.number.Covode;

public class AudioAttributesCompatParcelizer
{
    static {
        Covode.recordClassIndex(1336);
    }
    
    public static AudioAttributesCompat read(final 0GY 0gy) {
        final AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.LIZIZ = 0gy.LIZJ(audioAttributesCompat.LIZIZ);
        return audioAttributesCompat;
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final 0GY 0gy) {
        0gy.LIZ(audioAttributesCompat.LIZIZ);
    }
}
