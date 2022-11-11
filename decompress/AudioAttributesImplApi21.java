// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import com.bytedance.covode.number.Covode;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl
{
    public AudioAttributes LIZ;
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(1339);
    }
    
    public AudioAttributesImplApi21() {
        this.LIZIZ = -1;
    }
    
    public AudioAttributesImplApi21(final AudioAttributes audioAttributes) {
        this(audioAttributes, (byte)0);
    }
    
    public AudioAttributesImplApi21(final AudioAttributes liz, final byte b) {
        this.LIZIZ = -1;
        this.LIZ = liz;
        this.LIZIZ = -1;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof AudioAttributesImplApi21 && this.LIZ.equals((Object)((AudioAttributesImplApi21)o).LIZ);
    }
    
    @Override
    public int hashCode() {
        return this.LIZ.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        sb.append(this.LIZ);
        return sb.toString();
    }
}
