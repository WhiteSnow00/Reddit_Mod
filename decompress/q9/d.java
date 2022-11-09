// 
// Decompiled by Procyon v0.6.0
// 

package q9;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.opengl.GLES20;
import android.opengl.EGL14;
import android.util.Size;
import com.daasuu.mp4compose.Rotation;
import s9.b;
import s9.c;
import r9.a;
import android.view.Surface;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import com.daasuu.mp4compose.FillMode;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

public final class d implements SurfaceTexture$OnFrameAvailableListener
{
    public FillMode A;
    public boolean B;
    public boolean C;
    public EGLDisplay f;
    public EGLContext g;
    public EGLSurface h;
    public Surface i;
    public Object j;
    public boolean k;
    public a l;
    public int m;
    public c n;
    public s9.a o;
    public b p;
    public a q;
    public s9.a r;
    public float[] s;
    public float[] t;
    public float[] u;
    public float[] v;
    public float[] w;
    public Rotation x;
    public Size y;
    public Size z;
    
    public d(a a) {
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.h = EGL14.EGL_NO_SURFACE;
        this.j = new Object();
        this.s = new float[16];
        this.t = new float[16];
        this.u = new float[16];
        this.v = new float[16];
        this.w = new float[16];
        this.x = Rotation.NORMAL;
        this.A = FillMode.PRESERVE_ASPECT_FIT;
        this.B = false;
        this.C = false;
        (this.l = a).d();
        this.r = new s9.a();
        a = new a();
        (this.q = a).d();
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        final int m = array[0];
        this.m = m;
        final c n = new c(m);
        this.n = n;
        n.g = (SurfaceTexture$OnFrameAvailableListener)this;
        this.i = new Surface(this.n.f);
        this.n.getClass();
        GLES20.glBindTexture(36197, this.m);
        this.n.getClass();
        GLES20.glTexParameterf(36197, 10240, (float)9729);
        GLES20.glTexParameterf(36197, 10241, (float)9728);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glBindTexture(3553, 0);
        this.n.getClass();
        ((a)(this.p = new b())).d();
        this.o = new s9.a();
        Matrix.setLookAtM(this.v, 0, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        GLES20.glGetIntegerv(3379, array, 0);
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        synchronized (this.j) {
            if (!this.k) {
                this.k = true;
                this.j.notifyAll();
                return;
            }
            throw new RuntimeException("frameAvailable already set, frame could be dropped");
        }
    }
}
