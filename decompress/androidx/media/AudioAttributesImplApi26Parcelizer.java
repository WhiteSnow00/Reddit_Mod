// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;
import X.0GY;
import com.bytedance.covode.number.Covode;

public class AudioAttributesImplApi26Parcelizer
{
    static {
        Covode.recordClassIndex(1344);
    }
    
    public static AudioAttributesImplApi26 read(final 0GY 0gy) {
        final AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.LIZ = 0gy.LIZIZ(audioAttributesImplApi26.LIZ, 1);
        audioAttributesImplApi26.LIZIZ = 0gy.LIZIZ(audioAttributesImplApi26.LIZIZ, 2);
        return audioAttributesImplApi26;
    }
    
    public static void write(final AudioAttributesImplApi26 audioAttributesImplApi26, final 0GY 0gy) {
        0gy.LIZ((Parcelable)audioAttributesImplApi26.LIZ, 1);
        0gy.LIZ(audioAttributesImplApi26.LIZIZ, 2);
    }
}
