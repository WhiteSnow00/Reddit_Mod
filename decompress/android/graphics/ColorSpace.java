// 
// Decompiled by Procyon v0.6.0
// 

package android.graphics;

import android.annotation.NonNull;

public class ColorSpace
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @NonNull
    public static native ColorSpace get(@NonNull final ColorSpace$Named p0);
    
    public abstract boolean isWideGamut();
}
