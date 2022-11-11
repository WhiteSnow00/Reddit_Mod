// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import X.0GY;
import com.bytedance.covode.number.Covode;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer
{
    static {
        Covode.recordClassIndex(103);
    }
    
    public static AudioAttributesCompat read(final 0GY 0gy) {
        return androidx.media.AudioAttributesCompatParcelizer.read(0gy);
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final 0GY 0gy) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, 0gy);
    }
}
