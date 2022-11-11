// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplBaseParcelizer
{
    public static AudioAttributesImplBase read(final VersionedParcel versionedParcel) {
        final AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = versionedParcel.j(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = versionedParcel.j(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = versionedParcel.j(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = versionedParcel.j(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }
    
    public static void write(final AudioAttributesImplBase audioAttributesImplBase, final VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.t(audioAttributesImplBase.a, 1);
        versionedParcel.t(audioAttributesImplBase.b, 2);
        versionedParcel.t(audioAttributesImplBase.c, 3);
        versionedParcel.t(audioAttributesImplBase.d, 4);
    }
}
