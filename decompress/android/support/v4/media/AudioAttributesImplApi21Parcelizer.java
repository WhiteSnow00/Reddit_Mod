// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import androidx.media.AudioAttributesImplApi21;
import X.0GY;
import com.bytedance.covode.number.Covode;

public final class AudioAttributesImplApi21Parcelizer extends androidx.media.AudioAttributesImplApi21Parcelizer
{
    static {
        Covode.recordClassIndex(104);
    }
    
    public static AudioAttributesImplApi21 read(final 0GY 0gy) {
        return androidx.media.AudioAttributesImplApi21Parcelizer.read(0gy);
    }
    
    public static void write(final AudioAttributesImplApi21 audioAttributesImplApi21, final 0GY 0gy) {
        androidx.media.AudioAttributesImplApi21Parcelizer.write(audioAttributesImplApi21, 0gy);
    }
}
