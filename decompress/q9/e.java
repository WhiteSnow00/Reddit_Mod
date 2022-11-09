// 
// Decompiled by Procyon v0.6.0
// 

package q9;

import android.opengl.EGLConfig;
import android.opengl.EGL14;
import android.view.Surface;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;

public final class e
{
    public final /* synthetic */ int a;
    public EGLDisplay b;
    public EGLContext c;
    public EGLSurface d;
    public Surface e;
    
    public e(final Surface e) {
        this.a = 1;
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = EGL14.EGL_NO_SURFACE;
        this.e = e;
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.b = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        final int[] array = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
            this.b = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        final EGLConfig[] array2 = { null };
        if (!EGL14.eglChooseConfig(this.b, new int[] { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 }, 0, array2, 0, 1, new int[] { 0 }, 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.c = EGL14.eglCreateContext(this.b, array2[0], EGL14.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
        a("eglCreateContext");
        if (this.c == null) {
            throw new RuntimeException("null context");
        }
        this.d = EGL14.eglCreateWindowSurface(this.b, array2[0], (Object)this.e, new int[] { 12344 }, 0);
        a("eglCreateWindowSurface");
        if (this.d != null) {
            this.c();
            return;
        }
        throw new RuntimeException("surface was null");
    }
    
    public e(final Surface e, EGLContext egl_NO_CONTEXT) {
        this.a = 0;
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = EGL14.EGL_NO_SURFACE;
        e.getClass();
        this.e = e;
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.b = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        final int[] array = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
            this.b = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        final EGLConfig[] array2 = { null };
        if (!EGL14.eglChooseConfig(this.b, new int[] { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 }, 0, array2, 0, 1, new int[] { 0 }, 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        final EGLDisplay b = this.b;
        final EGLConfig eglConfig = array2[0];
        if (egl_NO_CONTEXT == null) {
            egl_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        }
        this.c = EGL14.eglCreateContext(b, eglConfig, egl_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
        b("eglCreateContext");
        if (this.c == null) {
            throw new RuntimeException("null context");
        }
        this.d = EGL14.eglCreateWindowSurface(this.b, array2[0], (Object)this.e, new int[] { 12344 }, 0);
        b("eglCreateWindowSurface");
        if (this.d != null) {
            return;
        }
        throw new RuntimeException("surface was null");
    }
    
    public static void a(final String s) {
        final int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        final StringBuilder q = d.q(s, ": EGL error: 0x");
        q.append(Integer.toHexString(eglGetError));
        throw new RuntimeException(q.toString());
    }
    
    public static void b(final String s) {
        final int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        final StringBuilder q = d.q(s, ": EGL error: 0x");
        q.append(Integer.toHexString(eglGetError));
        throw new RuntimeException(q.toString());
    }
    
    public final void c() {
        switch (this.a) {
            default: {
                final EGLDisplay b = this.b;
                final EGLSurface d = this.d;
                if (EGL14.eglMakeCurrent(b, d, d, this.c)) {
                    return;
                }
                throw new RuntimeException("eglMakeCurrent failed");
            }
            case 0: {
                final EGLDisplay b2 = this.b;
                final EGLSurface d2 = this.d;
                if (EGL14.eglMakeCurrent(b2, d2, d2, this.c)) {
                    return;
                }
                throw new RuntimeException("eglMakeCurrent failed");
            }
        }
    }
    
    public final void d() {
        switch (this.a) {
            default: {
                final EGLDisplay b = this.b;
                if (b != EGL14.EGL_NO_DISPLAY) {
                    EGL14.eglDestroySurface(b, this.d);
                    EGL14.eglDestroyContext(this.b, this.c);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(this.b);
                    this.b = EGL14.EGL_NO_DISPLAY;
                    this.c = EGL14.EGL_NO_CONTEXT;
                    this.d = EGL14.EGL_NO_SURFACE;
                }
                final Surface e = this.e;
                if (e != null) {
                    e.release();
                    this.e = null;
                }
                return;
            }
            case 0: {
                final EGLDisplay b2 = this.b;
                if (b2 != EGL14.EGL_NO_DISPLAY) {
                    EGL14.eglDestroySurface(b2, this.d);
                    EGL14.eglDestroyContext(this.b, this.c);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(this.b);
                }
                this.e.release();
                this.b = EGL14.EGL_NO_DISPLAY;
                this.c = EGL14.EGL_NO_CONTEXT;
                this.d = EGL14.EGL_NO_SURFACE;
                this.e = null;
            }
        }
    }
}
