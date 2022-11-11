// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import android.opengl.EGLExt;
import android.opengl.EGLConfig;
import android.util.Log;
import android.opengl.EGL14;
import android.view.Surface;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;
import android.opengl.EGLContext;

public class InputSurface
{
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private static final String TAG = "InputSurface";
    private static final boolean VERBOSE = false;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;
    private EGLSurface mEGLSurface;
    private Surface mSurface;
    
    public InputSurface(final Surface mSurface, final EGLContext eglContext) {
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        mSurface.getClass();
        this.mSurface = mSurface;
        this.eglSetup(eglContext);
    }
    
    private void checkEglError(final String s) {
        boolean b = false;
        String string = s;
        while (true) {
            final int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            final StringBuilder q = d.q(s, ": EGL error: 0x");
            q.append(Integer.toHexString(eglGetError));
            string = q.toString();
            Log.e("InputSurface", string);
            b = true;
        }
        if (!b) {
            return;
        }
        throw new RuntimeException(string);
    }
    
    private void eglSetup(final EGLContext eglContext) {
        EGLContext egl_NO_CONTEXT = eglContext;
        if (eglContext == null) {
            egl_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        }
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if ((this.mEGLDisplay = eglGetDisplay) == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        final int[] array = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
            this.mEGLDisplay = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        final EGLConfig[] array2 = { null };
        if (!EGL14.eglChooseConfig(this.mEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 }, 0, array2, 0, 1, new int[] { 0 }, 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.mEGLContext = EGL14.eglCreateContext(this.mEGLDisplay, array2[0], egl_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
        this.checkEglError("eglCreateContext");
        if (this.mEGLContext == null) {
            throw new RuntimeException("null context");
        }
        this.mEGLSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, array2[0], (Object)this.mSurface, new int[] { 12344 }, 0);
        this.checkEglError("eglCreateWindowSurface");
        if (this.mEGLSurface != null) {
            return;
        }
        throw new RuntimeException("surface was null");
    }
    
    public EGLContext getEglContext() {
        return this.mEGLContext;
    }
    
    public Surface getSurface() {
        return this.mSurface;
    }
    
    public void makeCurrent() {
        final EGLDisplay meglDisplay = this.mEGLDisplay;
        final EGLSurface meglSurface = this.mEGLSurface;
        if (EGL14.eglMakeCurrent(meglDisplay, meglSurface, meglSurface, this.mEGLContext)) {
            return;
        }
        this.checkEglError("eglMakeCurrent");
        throw new RuntimeException("eglMakeCurrent failed");
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
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLSurface = null;
        this.mSurface = null;
    }
    
    public void setPresentationTime(final long n) {
        EGLExt.eglPresentationTimeANDROID(this.mEGLDisplay, this.mEGLSurface, n);
    }
    
    public boolean swapBuffers() {
        return EGL14.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface);
    }
    
    public void updateSurface(final Surface mSurface) {
        EGL14.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
        this.mSurface = mSurface;
        final EGLConfig[] array = { null };
        if (EGL14.eglChooseConfig(this.mEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 }, 0, array, 0, 1, new int[] { 0 }, 0)) {
            this.mEGLSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, array[0], (Object)this.mSurface, new int[] { 12344 }, 0);
            return;
        }
        throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
    }
}
