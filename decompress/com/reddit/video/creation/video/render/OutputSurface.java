// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import java.util.concurrent.TimeUnit;
import android.util.Log;
import android.opengl.EGLConfig;
import android.opengl.EGL14;
import com.reddit.video.creation.video.render.models.TextStickerData;
import java.util.List;
import com.reddit.video.creation.models.video.VideoFilter;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;
import android.opengl.EGLContext;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

public class OutputSurface implements SurfaceTexture$OnFrameAvailableListener
{
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private static final String TAG = "OutputSurface";
    private final boolean mCameraOutput;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;
    private EGLSurface mEGLSurface;
    private boolean mFrameAvailable;
    private final Object mFrameSyncObject;
    private final int mHeight;
    private final float mInputHeight;
    private final float mInputWidth;
    private final float mPercentageTopOffset;
    private ByteBuffer mPixelBuf;
    private final float mRotation;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private GPUImageRenderer mTextureRender;
    private final float[] mTransform;
    private final int mWidth;
    
    public OutputSurface(final int mWidth, final int mHeight, final float mInputWidth, final float mInputHeight, final int n, final Bitmap bitmap, final EGLContext eglContext, final boolean mCameraOutput, final float mPercentageTopOffset, final VideoFilter videoFilter, final List<TextStickerData> list) {
        this.mFrameSyncObject = new Object();
        this.mTransform = new float[16];
        if (mWidth > 0 && mHeight > 0) {
            this.mWidth = mWidth;
            this.mHeight = mHeight;
            this.mInputWidth = mInputWidth;
            this.mInputHeight = mInputHeight;
            this.mPercentageTopOffset = mPercentageTopOffset;
            this.mRotation = (float)n;
            this.mCameraOutput = mCameraOutput;
            this.eglSetup(mWidth, mHeight, eglContext);
            this.makeCurrent();
            this.setup(bitmap, list, videoFilter);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    private void checkEglError(final String s) {
        boolean b = false;
        while (true) {
            final int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            Integer.toHexString(eglGetError);
            b = true;
        }
        if (!b) {
            return;
        }
        throw new RuntimeException("EGL error encountered (see log)");
    }
    
    private void eglSetup(final int n, final int n2, final EGLContext eglContext) {
        EGLContext egl_NO_CONTEXT = eglContext;
        if (eglContext == null) {
            egl_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        }
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eglGetDisplay;
        final int[] array = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
            this.mEGLDisplay = null;
            throw new RuntimeException("unable to initialize EGL10");
        }
        final EGLConfig config = this.getConfig();
        if (config == null) {
            throw new RuntimeException("Unable to find a suitable EGLConfig");
        }
        this.mEGLContext = EGL14.eglCreateContext(this.mEGLDisplay, config, egl_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
        this.checkEglError("eglCreateContext");
        if (this.mEGLContext == null) {
            throw new RuntimeException("null context");
        }
        this.mEGLSurface = EGL14.eglCreatePbufferSurface(this.mEGLDisplay, config, new int[] { 12375, n, 12374, n2, 12344 }, 0);
        this.checkEglError("eglCreatePbufferSurface");
        if (this.mEGLSurface != null) {
            return;
        }
        throw new RuntimeException("surface was null");
    }
    
    private EGLConfig getConfig() {
        final EGLConfig[] array = { null };
        if (!EGL14.eglChooseConfig(this.mEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344 }, 0, array, 0, 1, new int[] { 0 }, 0)) {
            return null;
        }
        return array[0];
    }
    
    private void setup(final Bitmap bitmap, final List<TextStickerData> list, final VideoFilter videoFilter) {
        (this.mTextureRender = new GPUImageRenderer(bitmap, list, this.mRotation, videoFilter, this.mPercentageTopOffset)).surfaceCreated();
        this.mTextureRender.surfaceChanged(this.mWidth, this.mHeight, this.mInputWidth, this.mInputHeight);
        this.mTextureRender.getTextureId();
        (this.mSurfaceTexture = new SurfaceTexture(this.mTextureRender.getTextureId())).setDefaultBufferSize((int)this.mInputWidth, (int)this.mInputHeight);
        if (!this.mCameraOutput) {
            this.mSurfaceTexture.setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)this);
        }
        this.mSurface = new Surface(this.mSurfaceTexture);
    }
    
    public void awaitNewImage() throws InterruptedException {
        synchronized (this.mFrameSyncObject) {
            while (!this.mFrameAvailable) {
                this.mFrameSyncObject.wait();
                if (this.mFrameAvailable) {
                    continue;
                }
                throw new RuntimeException("Surface frame wait timed out");
            }
            this.mFrameAvailable = false;
            monitorexit(this.mFrameSyncObject);
            this.mTextureRender.checkGlError("before updateTexImage");
        }
    }
    
    public void drawImage(final boolean b, final boolean b2, final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("drawImage() called with: mirrorImage = [");
        sb.append(b);
        sb.append("], mirrorOverlay = [");
        sb.append(b2);
        sb.append("]");
        Log.d("OutputSurface", sb.toString());
        this.mTextureRender.drawFrame(this.mSurfaceTexture, false, false, b, b2, TimeUnit.NANOSECONDS.toMillis(n));
    }
    
    public EGLContext getEglContext() {
        return this.mEGLContext;
    }
    
    public Surface getSurface() {
        return this.mSurface;
    }
    
    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }
    
    public void makeCurrent() {
        final EGLDisplay meglDisplay = this.mEGLDisplay;
        final EGLDisplay egl_NO_DISPLAY = EGL14.EGL_NO_DISPLAY;
        final EGLSurface meglSurface = this.mEGLSurface;
        if (EGL14.eglMakeCurrent(meglDisplay, meglSurface, meglSurface, this.mEGLContext)) {
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed");
    }
    
    public void onFrameAvailable(SurfaceTexture mFrameSyncObject) {
        mFrameSyncObject = (SurfaceTexture)this.mFrameSyncObject;
        monitorenter(mFrameSyncObject);
        while (true) {
            try {
                this.mFrameAvailable = true;
                this.mFrameSyncObject.notifyAll();
                monitorexit(mFrameSyncObject);
                return;
                monitorexit(mFrameSyncObject);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void release() {
        if (EGL14.eglGetCurrentContext().equals((Object)this.mEGLContext)) {
            final EGLDisplay meglDisplay = this.mEGLDisplay;
            final EGLSurface egl_NO_SURFACE = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(meglDisplay, egl_NO_SURFACE, egl_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
        EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
        this.mSurface.release();
        this.mEGLDisplay = null;
        this.mEGLContext = null;
        this.mEGLSurface = null;
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }
}
