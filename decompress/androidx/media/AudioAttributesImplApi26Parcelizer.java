// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi26Parcelizer
{
    public static AudioAttributesImplApi26 read(final VersionedParcel versionedParcel) {
        final AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes)versionedParcel.l((Parcelable)audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = versionedParcel.j(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }
    
    public static void write(final AudioAttributesImplApi26 audioAttributesImplApi26, final VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        final AudioAttributes a = audioAttributesImplApi26.a;
        versionedParcel.o(1);
        versionedParcel.u((Parcelable)a);
        versionedParcel.t(audioAttributesImplApi26.b, 2);
    }
}
