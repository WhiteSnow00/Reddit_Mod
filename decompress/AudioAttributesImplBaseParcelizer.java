// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;
import X.0GY;
import com.bytedance.covode.number.Covode;

public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer
{
    static {
        Covode.recordClassIndex(106);
    }
    
    public static AudioAttributesImplBase read(final 0GY 0gy) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(0gy);
    }
    
    public static void write(final AudioAttributesImplBase audioAttributesImplBase, final 0GY 0gy) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, 0gy);
    }
}
