// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.webp;

import java.nio.ByteBuffer;
import ml0.a;
import androidx.annotation.Keep;

@Keep
public class WebpImage
{
    private int mBackgroundColor;
    private int mDurationMs;
    private int mFrameCount;
    private int[] mFrameDurations;
    private int mHeigth;
    private int mLoopCount;
    @Keep
    private long mNativePtr;
    private int mWidth;
    
    static {
        System.loadLibrary("glide-webp");
    }
    
    @Keep
    public WebpImage(final long mNativePtr, final int mWidth, final int mHeigth, final int mFrameCount, final int mDurationMs, final int[] mFrameDurations, final int mLoopCount, final int mBackgroundColor) {
        if (mNativePtr != 0L) {
            this.mWidth = mWidth;
            this.mHeigth = mHeigth;
            this.mFrameCount = mFrameCount;
            this.mDurationMs = mDurationMs;
            this.mFrameDurations = mFrameDurations;
            this.mLoopCount = mLoopCount;
            this.fixFrameDurations(mFrameDurations);
            this.mBackgroundColor = mBackgroundColor;
            this.mNativePtr = mNativePtr;
            return;
        }
        throw new RuntimeException("internal error: native WebpImage is 0");
    }
    
    public static WebpImage create(final byte[] array) {
        a.l((Object)array);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(array.length);
        allocateDirect.put(array);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }
    
    private void fixFrameDurations(final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < 20) {
                array[i] = 100;
            }
        }
    }
    
    private static native WebpImage nativeCreateFromDirectByteBuffer(final ByteBuffer p0);
    
    private native void nativeDispose();
    
    private native void nativeFinalize();
    
    private native WebpFrame nativeGetFrame(final int p0);
    
    private native int nativeGetSizeInBytes();
    
    public void dispose() {
        this.nativeDispose();
    }
    
    public void finalize() throws Throwable {
        this.nativeFinalize();
    }
    
    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }
    
    public int getDuration() {
        return this.mDurationMs;
    }
    
    public WebpFrame getFrame(final int n) {
        return this.nativeGetFrame(n);
    }
    
    public int getFrameCount() {
        return this.mFrameCount;
    }
    
    public int[] getFrameDurations() {
        return this.mFrameDurations;
    }
    
    public m8.a getFrameInfo(final int n) {
        final WebpFrame frame = this.getFrame(n);
        try {
            return new m8.a(n, frame);
        }
        finally {
            frame.dispose();
        }
    }
    
    public int getHeight() {
        return this.mHeigth;
    }
    
    public int getLoopCount() {
        return this.mLoopCount;
    }
    
    public int getSizeInBytes() {
        return this.nativeGetSizeInBytes();
    }
    
    public int getWidth() {
        return this.mWidth;
    }
}
