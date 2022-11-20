// 
// Decompiled by Procyon v0.6.0
// 

package android.media;

import android.annotation.NonNull;

public final class AudioFocusRequest$Builder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public AudioFocusRequest$Builder(final int n) {
    }
    
    public AudioFocusRequest$Builder(@NonNull final AudioFocusRequest audioFocusRequest) {
    }
    
    public native AudioFocusRequest build();
    
    @NonNull
    public native AudioFocusRequest$Builder setAcceptsDelayedFocusGain(final boolean p0);
    
    @NonNull
    public native AudioFocusRequest$Builder setAudioAttributes(@NonNull final AudioAttributes p0);
    
    @NonNull
    public native AudioFocusRequest$Builder setOnAudioFocusChangeListener(@NonNull final AudioManager$OnAudioFocusChangeListener p0);
    
    @NonNull
    public native AudioFocusRequest$Builder setWillPauseWhenDucked(final boolean p0);
}
