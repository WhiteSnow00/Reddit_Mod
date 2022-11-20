// 
// Decompiled by Procyon v0.6.0
// 

package android.graphics;

import android.graphics.fonts.FontStyle;
import android.annotation.NonNull;
import android.graphics.fonts.FontFamily;

public final class Typeface$CustomFallbackBuilder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public Typeface$CustomFallbackBuilder(@NonNull final FontFamily fontFamily) {
    }
    
    @NonNull
    public native Typeface build();
    
    @NonNull
    public native Typeface$CustomFallbackBuilder setStyle(@NonNull final FontStyle p0);
}
