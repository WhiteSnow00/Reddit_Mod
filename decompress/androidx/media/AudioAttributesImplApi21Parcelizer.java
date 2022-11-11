// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi21Parcelizer
{
    public static AudioAttributesImplApi21 read(final VersionedParcel versionedParcel) {
        final AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes)versionedParcel.l((Parcelable)audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = versionedParcel.j(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }
    
    public static void write(final AudioAttributesImplApi21 audioAttributesImplApi21, final VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        final AudioAttributes a = audioAttributesImplApi21.a;
        versionedParcel.o(1);
        versionedParcel.u((Parcelable)a);
        versionedParcel.t(audioAttributesImplApi21.b, 2);
    }
}
