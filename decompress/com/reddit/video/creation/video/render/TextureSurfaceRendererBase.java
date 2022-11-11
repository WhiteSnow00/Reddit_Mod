// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import java.util.concurrent.Executors;
import android.graphics.SurfaceTexture;
import java.util.concurrent.ExecutorService;

public abstract class TextureSurfaceRendererBase implements Runnable
{
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final String LOG_TAG = "SurfaceTest.GL";
    public static final ExecutorService PERSISTENT_SINGLE_THREAD;
    public boolean mFailed;
    public int mHeight;
    public boolean mRunning;
    public final SurfaceTexture mTexture;
    public int mWidth;
    
    static {
        PERSISTENT_SINGLE_THREAD = Executors.newSingleThreadExecutor();
    }
    
    public TextureSurfaceRendererBase(final SurfaceTexture mTexture, final int mWidth, final int mHeight) {
        this.mTexture = mTexture;
        this.mWidth = mWidth;
        this.mHeight = mHeight;
        this.mRunning = true;
        TextureSurfaceRendererBase.PERSISTENT_SINGLE_THREAD.submit(this);
    }
    
    public abstract void deinitGL();
    
    public abstract void deinitGLComponents();
    
    public abstract boolean draw();
    
    public void finalize() throws Throwable {
        super.finalize();
        this.mRunning = false;
    }
    
    public final boolean hasFailed() {
        return this.mFailed;
    }
    
    public abstract void initGL();
    
    public abstract void initGLComponents();
    
    public void onPause() {
        this.mRunning = false;
    }
    
    @Override
    public void run() {
        this.mFailed = false;
        this.initGL();
        this.initGLComponents();
        while (true) {
            Label_0058: {
                if (!this.mRunning) {
                    break Label_0058;
                }
                final long currentTimeMillis = System.currentTimeMillis();
                if (this.draw()) {
                    this.swapBuffers();
                }
                final long n = 16L - (System.currentTimeMillis() - currentTimeMillis);
                if (n <= 0L) {
                    continue;
                }
                try {
                    Thread.sleep(n);
                    continue;
                    this.deinitGLComponents();
                    this.deinitGL();
                }
                catch (final InterruptedException ex) {}
            }
        }
    }
    
    public abstract void swapBuffers();
}
