// 
// Decompiled by Procyon v0.6.0
// 

package android.media;

import android.annotation.NonNull;

public final class ApplicationMediaCapabilities$Builder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @NonNull
    public native ApplicationMediaCapabilities$Builder addSupportedHdrType(@NonNull final String p0);
    
    @NonNull
    public native ApplicationMediaCapabilities$Builder addSupportedVideoMimeType(@NonNull final String p0);
    
    @NonNull
    public native ApplicationMediaCapabilities build();
}
