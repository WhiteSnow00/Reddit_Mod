// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.os.Handler;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

public final class EGLSurfaceTexture implements SurfaceTexture$OnFrameAvailableListener, Runnable
{
    public static final int[] l;
    public final Handler f;
    public final int[] g;
    public EGLDisplay h;
    public EGLContext i;
    public EGLSurface j;
    public SurfaceTexture k;
    
    static {
        l = new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344 };
    }
    
    public EGLSurfaceTexture(final Handler f) {
        this.f = f;
        this.g = new int[1];
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.f.post((Runnable)this);
    }
    
    public final void run() {
        final SurfaceTexture k = this.k;
        if (k == null) {
            return;
        }
        try {
            k.updateTexImage();
        }
        catch (final RuntimeException ex) {}
    }
    
    public static final class GlException extends RuntimeException
    {
        public GlException(final String s, final EGLSurfaceTexture$a object) {
            super(s);
        }
    }
}
