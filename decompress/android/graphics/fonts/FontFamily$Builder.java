// 
// Decompiled by Procyon v0.6.0
// 

package android.graphics.fonts;

import android.annotation.NonNull;

public final class FontFamily$Builder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public FontFamily$Builder(@NonNull final Font font) {
    }
    
    @NonNull
    public native FontFamily$Builder addFont(@NonNull final Font p0);
    
    @NonNull
    public native FontFamily build();
}
