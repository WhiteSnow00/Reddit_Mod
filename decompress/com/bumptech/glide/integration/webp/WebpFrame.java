// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.webp;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

@Keep
public class WebpFrame
{
    public static final int FRAME_DURATION_MS_FOR_MIN = 100;
    public static final int MIN_FRAME_DURATION_MS = 20;
    public boolean blendPreviousFrame;
    public int delay;
    public boolean disposeBackgroundColor;
    public int ih;
    public int iw;
    public int ix;
    public int iy;
    @Keep
    private long mNativePtr;
    
    public WebpFrame(final long mNativePtr, final int ix, final int iy, final int iw, final int ih, final int delay, final boolean blendPreviousFrame, final boolean disposeBackgroundColor) {
        this.mNativePtr = mNativePtr;
        this.ix = ix;
        this.iy = iy;
        this.iw = iw;
        this.ih = ih;
        this.delay = delay;
        this.blendPreviousFrame = blendPreviousFrame;
        this.disposeBackgroundColor = disposeBackgroundColor;
        this.fixFrameDuration();
    }
    
    private void fixFrameDuration() {
        if (this.delay < 20) {
            this.delay = 100;
        }
    }
    
    private native void nativeDispose();
    
    private native void nativeFinalize();
    
    private native void nativeRenderFrame(final int p0, final int p1, final Bitmap p2);
    
    public void dispose() {
        this.nativeDispose();
    }
    
    public void finalize() throws Throwable {
        this.nativeFinalize();
    }
    
    public int getDurationMs() {
        return this.delay;
    }
    
    public int getHeight() {
        return this.ih;
    }
    
    public int getWidth() {
        return this.iw;
    }
    
    public int getXOffest() {
        return this.ix;
    }
    
    public int getYOffest() {
        return this.iy;
    }
    
    public boolean isBlendWithPreviousFrame() {
        return this.blendPreviousFrame;
    }
    
    public void renderFrame(final int n, final int n2, final Bitmap bitmap) {
        this.nativeRenderFrame(n, n2, bitmap);
    }
    
    public boolean shouldDisposeToBackgroundColor() {
        return this.disposeBackgroundColor;
    }
}
