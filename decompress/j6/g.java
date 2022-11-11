// 
// Decompiled by Procyon v0.6.0
// 

package j6;

import android.content.Intent;
import ge.gb;
import ge.g2;
import androidx.lifecycle.w;
import ge.jd;
import ge.ad;
import ge.bc;
import hh.i;
import ge.r5;
import lg.f0;
import lg.c;
import lg.g0;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;
import android.opengl.EGLConfig;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.view.Surface;
import n6.a;
import android.content.Context;
import lg.u;
import ge.ic;

public final class g implements ic, u
{
    public static g j;
    public Object f = f;
    public Object g = g;
    public Object h = h;
    public Object i = i;
    
    public g(final Surface i, EGLContext egl_NO_CONTEXT) {
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.h = EGL14.EGL_NO_SURFACE;
        i.getClass();
        this.i = i;
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        final int[] array = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
            this.f = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        final EGLConfig[] array2 = { null };
        if (!EGL14.eglChooseConfig((EGLDisplay)this.f, new int[] { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 }, 0, array2, 0, 1, new int[] { 0 }, 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        final EGLDisplay eglDisplay = (EGLDisplay)this.f;
        final EGLConfig eglConfig = array2[0];
        if (egl_NO_CONTEXT == null) {
            egl_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        }
        this.g = EGL14.eglCreateContext(eglDisplay, eglConfig, egl_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
        c("eglCreateContext");
        if (this.g == null) {
            throw new RuntimeException("null context");
        }
        this.h = EGL14.eglCreateWindowSurface((EGLDisplay)this.f, array2[0], (Object)this.i, new int[] { 12344 }, 0);
        c("eglCreateWindowSurface");
        if (this.h != null) {
            return;
        }
        throw new RuntimeException("surface was null");
    }
    
    public static void c(final String s) {
        final int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        final StringBuilder q = d.q(s, ": EGL error: 0x");
        q.append(Integer.toHexString(eglGetError));
        throw new RuntimeException(q.toString());
    }
    
    public static g e(final Context context, final a a) {
        synchronized (g.class) {
            if (g.j == null) {
                g.j = new g(context, a);
            }
            return g.j;
        }
    }
    
    public final void a(final int n) {
        final g0 g0 = (g0)this.i;
        g0.g.post((Runnable)new f0(g0, (c)this.f, 6, n));
    }
    
    @Override
    public final void b(final String s) {
        ((r5)this.h).c(hh.i.a(s));
    }
    
    @Override
    public final void d(final bc bc) {
        final ad ad = (ad)bc;
        final jd jd = new jd();
        final String g = ad.g;
        lw0.b.O(g);
        jd.f = g;
        final String g2 = (String)this.f;
        if (g2 == null) {
            jd.i.g.add("EMAIL");
        }
        else {
            jd.g = g2;
        }
        final String h = (String)this.g;
        if (h == null) {
            jd.i.g.add("PASSWORD");
        }
        else {
            jd.h = h;
        }
        final w w = (w)this.i;
        final r5 r5 = (r5)this.h;
        lw0.b.R((Object)r5);
        ((android.support.v4.media.c)w.g).T0(new g2(ad.g), (ic)new gb(w, r5, (ic)this, ad, jd));
    }
    
    public final void s() {
        if (!((Intent)this.g).getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((Intent)this.g).putExtra("triggered_from_app_after_verification", true);
            ((Context)this.h).sendBroadcast((Intent)this.g);
            return;
        }
        ((hg.c)this.i).a.o("Splits copied and verified more than once.", new Object[0]);
    }
    
    public final void zza() {
        final g0 g0 = (g0)this.i;
        g0.g.post((Runnable)new f0(g0, (c)this.f, 5, 0));
    }
}
