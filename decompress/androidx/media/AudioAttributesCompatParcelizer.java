// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import w5.c;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesCompatParcelizer
{
    public static AudioAttributesCompat read(final VersionedParcel versionedParcel) {
        final AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        final AudioAttributesImpl a = audioAttributesCompat.a;
        Object n;
        if (!versionedParcel.h(1)) {
            n = a;
        }
        else {
            n = versionedParcel.n();
        }
        audioAttributesCompat.a = (AudioAttributesImpl)n;
        return audioAttributesCompat;
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        final AudioAttributesImpl a = audioAttributesCompat.a;
        versionedParcel.o(1);
        versionedParcel.w((c)a);
    }
}
