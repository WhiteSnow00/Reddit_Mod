// 
// Decompiled by Procyon v0.6.0
// 

package android.graphics;

import android.annotation.NonNull;
import android.annotation.Nullable;

public final class RenderNode
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public RenderNode(@Nullable final String s) {
    }
    
    @NonNull
    public native RecordingCanvas beginRecording();
    
    public native void discardDisplayList();
    
    public native void endRecording();
    
    public native float getAlpha();
    
    public native int getBottom();
    
    public native boolean getClipToBounds();
    
    public native boolean getClipToOutline();
    
    public native float getElevation();
    
    public native int getHeight();
    
    public native int getLeft();
    
    public native void getMatrix(@NonNull final Matrix p0);
    
    public native int getRight();
    
    public native int getTop();
    
    public native int getWidth();
    
    public native boolean hasDisplayList();
    
    public native boolean offsetLeftAndRight(final int p0);
    
    public native boolean offsetTopAndBottom(final int p0);
    
    public native boolean setAlpha(final float p0);
    
    public native boolean setAmbientShadowColor(final int p0);
    
    public native boolean setCameraDistance(final float p0);
    
    public native boolean setClipToBounds(final boolean p0);
    
    public native boolean setClipToOutline(final boolean p0);
    
    public native boolean setElevation(final float p0);
    
    public native boolean setHasOverlappingRendering(final boolean p0);
    
    public native boolean setOutline(@Nullable final Outline p0);
    
    public native boolean setPivotX(final float p0);
    
    public native boolean setPivotY(final float p0);
    
    public native boolean setPosition(final int p0, final int p1, final int p2, final int p3);
    
    public native boolean setRotationX(final float p0);
    
    public native boolean setRotationY(final float p0);
    
    public native boolean setRotationZ(final float p0);
    
    public native boolean setScaleX(final float p0);
    
    public native boolean setScaleY(final float p0);
    
    public native boolean setSpotShadowColor(final int p0);
    
    public native boolean setTranslationX(final float p0);
    
    public native boolean setTranslationY(final float p0);
}
