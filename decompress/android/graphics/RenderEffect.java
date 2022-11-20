// 
// Decompiled by Procyon v0.6.0
// 

package android.graphics;

import android.annotation.NonNull;

public final class RenderEffect
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @NonNull
    public static native RenderEffect createBlurEffect(final float p0, final float p1, @NonNull final RenderEffect p2, @NonNull final Shader$TileMode p3);
    
    @NonNull
    public static native RenderEffect createBlurEffect(final float p0, final float p1, @NonNull final Shader$TileMode p2);
    
    @NonNull
    public static native RenderEffect createOffsetEffect(final float p0, final float p1);
    
    @NonNull
    public static native RenderEffect createOffsetEffect(final float p0, final float p1, @NonNull final RenderEffect p2);
}
