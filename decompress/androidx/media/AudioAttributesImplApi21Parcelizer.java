// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;
import X.0GY;
import com.bytedance.covode.number.Covode;

public class AudioAttributesImplApi21Parcelizer
{
    static {
        Covode.recordClassIndex(1341);
    }
    
    public static AudioAttributesImplApi21 read(final 0GY 0gy) {
        final AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.LIZ = 0gy.LIZIZ(audioAttributesImplApi21.LIZ, 1);
        audioAttributesImplApi21.LIZIZ = 0gy.LIZIZ(audioAttributesImplApi21.LIZIZ, 2);
        return audioAttributesImplApi21;
    }
    
    public static void write(final AudioAttributesImplApi21 audioAttributesImplApi21, final 0GY 0gy) {
        0gy.LIZ((Parcelable)audioAttributesImplApi21.LIZ, 1);
        0gy.LIZ(audioAttributesImplApi21.LIZIZ, 2);
    }
}
