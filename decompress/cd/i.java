// 
// Decompiled by Procyon v0.6.0
// 

package cd;

import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import java.nio.IntBuffer;
import com.google.android.exoplayer2.util.GlUtil;
import android.opengl.GLES20;
import java.util.ArrayList;
import ad.s;
import java.util.Arrays;
import android.media.MediaFormat;
import com.google.android.exoplayer2.n;
import android.graphics.SurfaceTexture;
import ad.z;
import java.util.concurrent.atomic.AtomicBoolean;
import bd.j;

public final class i implements j, a
{
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final g h;
    public final c i;
    public final z<Long> j;
    public final z<e> k;
    public final float[] l;
    public final float[] m;
    public int n;
    public SurfaceTexture o;
    public volatile int p;
    public int q;
    public byte[] r;
    
    public i() {
        this.f = new AtomicBoolean();
        this.g = new AtomicBoolean(true);
        this.h = new g();
        this.i = new c();
        this.j = (z<Long>)new z();
        this.k = (z<e>)new z();
        this.l = new float[16];
        this.m = new float[16];
        this.p = 0;
        this.q = -1;
    }
    
    public final void a(final long n, final long n2, final n n3, MediaFormat a) {
        this.j.a(n2, (Object)n);
        a = (MediaFormat)(Object)n3.A;
        final int b = n3.B;
        final byte[] r = this.r;
        int i = this.q;
        this.r = (byte[])(Object)a;
        int p3 = b;
        if (b == -1) {
            p3 = this.p;
        }
        this.q = p3;
        if (i == p3 && Arrays.equals(r, this.r)) {
            return;
        }
        final byte[] r2 = this.r;
        Object o;
        a = (MediaFormat)(o = null);
        Label_0382: {
            if (r2 == null) {
                break Label_0382;
            }
            i = this.q;
            final s s = new s(r2);
            while (true) {
                try {
                    s.C(4);
                    final int c = s.c();
                    s.B(0);
                    ArrayList list = null;
                    Label_0286: {
                        if (c == 1886547818) {
                            s.C(8);
                            int n4;
                            for (int j = s.b, c2 = s.c; j < c2; j = n4) {
                                n4 = s.c() + j;
                                if (n4 <= j) {
                                    break;
                                }
                                if (n4 > c2) {
                                    break;
                                }
                                final int c3 = s.c();
                                if (c3 == 2037673328 || c3 == 1836279920) {
                                    s.A(n4);
                                    list = cd.f.a(s);
                                    break Label_0286;
                                }
                                s.B(n4);
                            }
                            list = null;
                        }
                        else {
                            list = cd.f.a(s);
                        }
                    }
                    if (list == null) {
                        o = a;
                    }
                    else {
                        final int size = list.size();
                        if (size != 1) {
                            if (size != 2) {
                                o = a;
                            }
                            else {
                                o = new e((e$a)list.get(0), (e$a)list.get(1), i);
                            }
                        }
                        else {
                            final e$a e$a = list.get(0);
                            o = new e(e$a, e$a, i);
                        }
                    }
                    if (o == null || !cd.g.a((e)o)) {
                        final int q = this.q;
                        float n5 = (float)Math.toRadians(180.0f);
                        final float n6 = (float)Math.toRadians(360.0f);
                        float n7 = n5 / 36;
                        float n8 = n6 / 72;
                        a = (MediaFormat)(Object)new float[15984];
                        final float[] array = new float[10656];
                        int k = 0;
                        int n10;
                        int n9 = n10 = k;
                        while (k < 36) {
                            final float n11 = (float)k;
                            final float n12 = n5 / 2.0f;
                            float n13 = n11 * n7 - n12;
                            final int n14 = k + 1;
                            final float n15 = n14 * n7 - n12;
                            i = 0;
                            int n16 = n9;
                            float n17 = n7;
                            final float n18 = n15;
                            final int n19 = n14;
                            final float n20 = n5;
                            while (i < 73) {
                                int l = 0;
                                final int n21 = 2;
                                final float n22 = n8;
                                final int n23 = i;
                                final float n24 = n17;
                                final float n25 = n13;
                                for (i = n21; l < i; ++l, i = 2) {
                                    float n26;
                                    if (l == 0) {
                                        n26 = n25;
                                    }
                                    else {
                                        n26 = n18;
                                    }
                                    final float n27 = n23 * n22;
                                    final float n28 = n6 / 2.0f;
                                    i = n16 + 1;
                                    final double n29 = 50.0f;
                                    final double n30 = n27 + 3.1415927f - n28;
                                    final double sin = Math.sin(n30);
                                    final double n31 = n26;
                                    a[n16] = -(float)(Math.cos(n31) * (sin * n29));
                                    final int n32 = i + 1;
                                    a[i] = (float)(Math.sin(n31) * n29);
                                    i = n32 + 1;
                                    a[n32] = (float)(Math.cos(n31) * (Math.cos(n30) * n29));
                                    final int n33 = n10 + 1;
                                    array[n10] = n27 / n6;
                                    n10 = n33 + 1;
                                    array[n33] = (k + l) * n24 / n20;
                                    Label_0808: {
                                        if (n23 != 0 || l != 0) {
                                            if (n23 != 72 || l != 1) {
                                                break Label_0808;
                                            }
                                        }
                                        System.arraycopy(a, i - 3, a, i, 3);
                                        i += 3;
                                        System.arraycopy(array, n10 - 2, array, n10, 2);
                                        n10 += 2;
                                    }
                                    n16 = i;
                                }
                                i = n23 + 1;
                                n13 = n25;
                                n17 = n24;
                                n8 = n22;
                            }
                            n5 = n20;
                            n7 = n17;
                            k = n19;
                            n9 = n16;
                        }
                        final e$a e$a2 = new e$a(new e$b[] { new e$b(0, (float[])(Object)a, array, 1) });
                        o = new e(e$a2, e$a2, q);
                    }
                    this.k.a(n2, o);
                }
                catch (final ArrayIndexOutOfBoundsException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final SurfaceTexture b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GlUtil.b();
        final g h = this.h;
        h.getClass();
        final GlUtil.b c = new GlUtil.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        h.c = c;
        h.d = GLES20.glGetUniformLocation(c.a, "uMvpMatrix");
        h.e = GLES20.glGetUniformLocation(h.c.a, "uTexMatrix");
        h.f = h.c.a("aPosition");
        h.g = h.c.a("aTexCoords");
        h.h = GLES20.glGetUniformLocation(h.c.a, "uTexture");
        GlUtil.b();
        final int[] array = { 0 };
        GLES20.glGenTextures(1, IntBuffer.wrap(array));
        GLES20.glBindTexture(36197, array[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GlUtil.b();
        this.n = array[0];
        (this.o = new SurfaceTexture(this.n)).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)new h(this));
        return this.o;
    }
    
    public final void c(final float[] array, final long n) {
        ((z)this.i.d).a(n, (Object)array);
    }
    
    public final void e() {
        this.j.b();
        final c i = this.i;
        ((z)i.d).b();
        i.a = false;
        this.g.set(true);
    }
}
