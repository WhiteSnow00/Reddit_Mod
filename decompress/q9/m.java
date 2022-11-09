// 
// Decompiled by Procyon v0.6.0
// 

package q9;

import s9.c;
import s9.b;
import android.media.MediaMuxer;
import java.util.Iterator;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import android.util.Log;
import com.daasuu.mp4compose.SampleType;
import java.io.IOException;
import android.opengl.Matrix;
import android.media.MediaCrypto;
import android.view.Surface;
import android.opengl.EGLContext;
import com.daasuu.mp4compose.FillMode;
import android.util.Size;
import com.daasuu.mp4compose.Rotation;
import android.opengl.EGLDisplay;
import android.opengl.EGL14;
import java.util.concurrent.TimeUnit;
import v7.a;
import android.media.MediaCodec;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaFormat;
import android.media.MediaExtractor;

public final class m
{
    public final MediaExtractor a;
    public final int b;
    public final MediaFormat c;
    public final j d;
    public final MediaCodec$BufferInfo e;
    public MediaCodec f;
    public MediaCodec g;
    public MediaFormat h;
    public d i;
    public e j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public final float q;
    public final long r;
    public final long s;
    public final a t;
    
    public m(final MediaExtractor a, final int b, final MediaFormat c, final j d, final float q, final long n, long micros, final a t) {
        this.e = new MediaCodec$BufferInfo();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.q = q;
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        this.r = milliseconds.toMicros(n);
        if (micros != -1L) {
            micros = milliseconds.toMicros(micros);
        }
        this.s = micros;
        this.t = t;
    }
    
    public final void a() {
        final d i = this.i;
        if (i != null) {
            final EGLDisplay f = i.f;
            if (f != EGL14.EGL_NO_DISPLAY) {
                EGL14.eglDestroySurface(f, i.h);
                EGL14.eglDestroyContext(i.f, i.g);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(i.f);
            }
            i.i.release();
            i.n.f.release();
            i.f = EGL14.EGL_NO_DISPLAY;
            i.g = EGL14.EGL_NO_CONTEXT;
            i.h = EGL14.EGL_NO_SURFACE;
            i.l.c();
            i.l = null;
            i.i = null;
            i.n = null;
            this.i = null;
        }
        final e j = this.j;
        if (j != null) {
            j.d();
            this.j = null;
        }
        final MediaCodec f2 = this.f;
        if (f2 != null) {
            if (this.n) {
                f2.stop();
            }
            this.f.release();
            this.f = null;
        }
        final MediaCodec g = this.g;
        if (g != null) {
            if (this.o) {
                g.stop();
            }
            this.g.release();
            this.g = null;
        }
    }
    
    public final void b(final r9.a a, final Rotation x, final Size y, final Size z, final FillMode a2, final EGLContext eglContext) {
        try {
            (this.g = MediaCodec.createEncoderByType(this.c.getString("mime"))).configure(this.c, (Surface)null, (MediaCrypto)null, 1);
            (this.j = new e(this.g.createInputSurface(), eglContext)).c();
            this.g.start();
            this.o = true;
            final MediaFormat trackFormat = this.a.getTrackFormat(this.b);
            this.a.seekTo(this.r, 0);
            if (trackFormat.containsKey("rotation-degrees")) {
                trackFormat.setInteger("rotation-degrees", 0);
            }
            final d i = new d(a);
            this.i = i;
            i.x = x;
            i.y = y;
            i.z = z;
            i.A = a2;
            i.C = false;
            i.B = false;
            final int width = y.getWidth();
            final int height = i.y.getHeight();
            i.r.b(width, height);
            i.q.getClass();
            i.o.b(width, height);
            i.p.getClass();
            Matrix.frustumM(i.t, 0, -1.0f, 1.0f, -1.0f, 1.0f, 5.0f, 7.0f);
            Matrix.setIdentityM(i.u, 0);
            try {
                (this.f = MediaCodec.createDecoderByType(trackFormat.getString("mime"))).configure(trackFormat, this.i.i, (MediaCrypto)null, 0);
                this.f.start();
                this.n = true;
            }
            catch (final IOException ex) {
                throw new IllegalStateException(ex);
            }
        }
        catch (final IOException ex2) {
            throw new IllegalStateException(ex2);
        }
    }
    
    public final boolean c() {
        boolean b = false;
        while (true) {
            int n = 0;
            Label_0797: {
                Label_0163: {
                    if (!this.m) {
                        final int dequeueOutputBuffer = this.g.dequeueOutputBuffer(this.e, 0L);
                        if (dequeueOutputBuffer != -3) {
                            if (dequeueOutputBuffer != -2) {
                                if (dequeueOutputBuffer == -1) {
                                    break Label_0163;
                                }
                                if (this.h == null) {
                                    throw new RuntimeException("Could not determine actual output format.");
                                }
                                final MediaCodec$BufferInfo e = this.e;
                                final int flags = e.flags;
                                if ((flags & 0x4) != 0x0) {
                                    this.m = true;
                                    e.set(0, 0, 0L, flags);
                                }
                                if ((this.e.flags & 0x2) == 0x0) {
                                    this.d.b(SampleType.VIDEO, this.g.getOutputBuffer(dequeueOutputBuffer), this.e);
                                    this.p = this.e.presentationTimeUs;
                                    this.g.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    n = 2;
                                    break Label_0797;
                                }
                                this.g.releaseOutputBuffer(dequeueOutputBuffer, false);
                            }
                            else {
                                if (this.h != null) {
                                    throw new RuntimeException("Video output format changed twice.");
                                }
                                final MediaFormat outputFormat = this.g.getOutputFormat();
                                this.h = outputFormat;
                                this.d.a(SampleType.VIDEO, outputFormat);
                                final j d = this.d;
                                final MediaFormat b2 = d.b;
                                if (b2 != null && d.c != null) {
                                    d.d = d.a.addTrack(b2);
                                    final a i = d.i;
                                    final StringBuilder k = a.k("Added track #");
                                    k.append(d.d);
                                    k.append(" with ");
                                    k.append(d.b.getString("mime"));
                                    k.append(" to muxer");
                                    final String string = k.toString();
                                    i.getClass();
                                    Log.d("MuxRender", string);
                                    d.e = d.a.addTrack(d.c);
                                    final a j = d.i;
                                    final StringBuilder l = a.k("Added track #");
                                    l.append(d.e);
                                    l.append(" with ");
                                    l.append(d.c.getString("mime"));
                                    l.append(" to muxer");
                                    final String string2 = l.toString();
                                    j.getClass();
                                    Log.d("MuxRender", string2);
                                }
                                else if (b2 != null) {
                                    d.d = d.a.addTrack(b2);
                                    final a m = d.i;
                                    final StringBuilder k2 = a.k("Added track #");
                                    k2.append(d.d);
                                    k2.append(" with ");
                                    k2.append(d.b.getString("mime"));
                                    k2.append(" to muxer");
                                    final String string3 = k2.toString();
                                    m.getClass();
                                    Log.d("MuxRender", string3);
                                }
                                d.a.start();
                                d.h = true;
                                if (d.f == null) {
                                    d.f = ByteBuffer.allocate(0);
                                }
                                d.f.flip();
                                final a i2 = d.i;
                                final StringBuilder k3 = a.k("Output format determined, writing ");
                                k3.append(d.g.size());
                                k3.append(" samples / ");
                                k3.append(d.f.limit());
                                k3.append(" bytes to muxer.");
                                final String string4 = k3.toString();
                                i2.getClass();
                                Log.d("MuxRender", string4);
                                final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
                                final Iterator iterator = d.g.iterator();
                                int n2 = 0;
                                while (iterator.hasNext()) {
                                    final j.b b3 = (j.b)iterator.next();
                                    mediaCodec$BufferInfo.set(n2, b3.b, b3.c, b3.d);
                                    final MediaMuxer a = d.a;
                                    final int n3 = q9.j.j$a.a[((Enum)b3.a).ordinal()];
                                    int n4;
                                    if (n3 != 1) {
                                        if (n3 != 2) {
                                            throw new AssertionError();
                                        }
                                        n4 = d.e;
                                    }
                                    else {
                                        n4 = d.d;
                                    }
                                    a.writeSampleData(n4, d.f, mediaCodec$BufferInfo);
                                    n2 += b3.b;
                                }
                                d.g.clear();
                                d.f = null;
                            }
                        }
                        n = 1;
                        break Label_0797;
                    }
                }
                n = 0;
            }
            if (n == 0) {
                break;
            }
            b = true;
        }
        while (true) {
            int n5 = 0;
            Label_1939: {
                if (!this.l) {
                    final int dequeueOutputBuffer2 = this.f.dequeueOutputBuffer(this.e, 0L);
                    if (dequeueOutputBuffer2 == -3 || dequeueOutputBuffer2 == -2) {
                        n5 = 1;
                        break Label_1939;
                    }
                    if (dequeueOutputBuffer2 != -1) {
                        if ((this.e.flags & 0x4) != 0x0) {
                            this.g.signalEndOfInputStream();
                            this.l = true;
                            this.e.size = 0;
                        }
                        final MediaCodec$BufferInfo e2 = this.e;
                        boolean b4 = false;
                        Label_0938: {
                            if (e2.size > 0) {
                                final long presentationTimeUs = e2.presentationTimeUs;
                                if (presentationTimeUs >= this.r) {
                                    final long s = this.s;
                                    if (presentationTimeUs <= s || s == -1L) {
                                        b4 = true;
                                        break Label_0938;
                                    }
                                }
                            }
                            b4 = false;
                        }
                        this.f.releaseOutputBuffer(dequeueOutputBuffer2, b4);
                        Label_1927: {
                            if (b4) {
                                final d i3 = this.i;
                                Object o = i3.j;
                                synchronized (o) {
                                    while (!i3.k) {
                                        try {
                                            i3.j.wait(10000L);
                                            if (i3.k) {
                                                continue;
                                            }
                                            throw new RuntimeException("Surface frame wait timed out");
                                        }
                                        catch (final InterruptedException ex) {
                                            throw new RuntimeException(ex);
                                        }
                                        break;
                                    }
                                    i3.k = false;
                                    monitorexit(o);
                                    i3.n.f.updateTexImage();
                                    o = i3.n;
                                    ((c)o).f.getTransformMatrix(i3.w);
                                    o = this.i;
                                    GLES20.glBindFramebuffer(36160, ((d)o).r.c);
                                    final s9.a r = ((d)o).r;
                                    GLES20.glViewport(0, 0, r.a, r.b);
                                    if (((d)o).l != null) {
                                        GLES20.glBindFramebuffer(36160, ((d)o).o.c);
                                        final s9.a o2 = ((d)o).o;
                                        GLES20.glViewport(0, 0, o2.a, o2.b);
                                        final float[] h = ((d)o).l.h;
                                        GLES20.glClearColor(h[0], h[1], h[2], h[3]);
                                    }
                                    GLES20.glClear(16384);
                                    Matrix.multiplyMM(((d)o).s, 0, ((d)o).v, 0, ((d)o).u, 0);
                                    final float[] s2 = ((d)o).s;
                                    Matrix.multiplyMM(s2, 0, ((d)o).t, 0, s2, 0);
                                    final boolean c = ((d)o).C;
                                    float n6 = -1.0f;
                                    float n7;
                                    if (c) {
                                        n7 = -1.0f;
                                    }
                                    else {
                                        n7 = 1.0f;
                                    }
                                    if (!((d)o).B) {
                                        n6 = 1.0f;
                                    }
                                    final int n8 = q9.d.d$a.a[((Enum)((d)o).A).ordinal()];
                                    if (n8 != 1) {
                                        if (n8 != 2) {
                                            if (n8 == 3) {
                                                o.getClass();
                                            }
                                        }
                                        else {
                                            final float[] scaleAspectCrop = FillMode.getScaleAspectCrop(((d)o).x.getRotation(), ((d)o).z.getWidth(), ((d)o).z.getHeight(), ((d)o).y.getWidth(), ((d)o).y.getHeight());
                                            Matrix.scaleM(((d)o).s, 0, scaleAspectCrop[0] * n7, scaleAspectCrop[1] * n6, 1.0f);
                                            final Rotation x = ((d)o).x;
                                            if (x != Rotation.NORMAL) {
                                                Matrix.rotateM(((d)o).s, 0, (float)(-x.getRotation()), 0.0f, 0.0f, 1.0f);
                                            }
                                        }
                                    }
                                    else {
                                        final float[] scaleAspectFit = FillMode.getScaleAspectFit(((d)o).x.getRotation(), ((d)o).z.getWidth(), ((d)o).z.getHeight(), ((d)o).y.getWidth(), ((d)o).y.getHeight());
                                        Matrix.scaleM(((d)o).s, 0, scaleAspectFit[0] * n7, scaleAspectFit[1] * n6, 1.0f);
                                        final Rotation x2 = ((d)o).x;
                                        if (x2 != Rotation.NORMAL) {
                                            Matrix.rotateM(((d)o).s, 0, (float)(-x2.getRotation()), 0.0f, 0.0f, 1.0f);
                                        }
                                    }
                                    final b p = ((d)o).p;
                                    final int m2 = ((d)o).m;
                                    final float[] s3 = ((d)o).s;
                                    final float[] w = ((d)o).w;
                                    GLES20.glUseProgram(((r9.a)p).c);
                                    GLES20.glUniformMatrix4fv(((r9.a)p).b("uMVPMatrix"), 1, false, s3, 0);
                                    GLES20.glUniformMatrix4fv(((r9.a)p).b("uSTMatrix"), 1, false, w, 0);
                                    GLES20.glUniform1f(((r9.a)p).b("uCRatio"), 1.0f);
                                    GLES20.glBindBuffer(34962, ((r9.a)p).f);
                                    GLES20.glEnableVertexAttribArray(((r9.a)p).b("aPosition"));
                                    GLES20.glVertexAttribPointer(((r9.a)p).b("aPosition"), 3, 5126, false, 20, 0);
                                    GLES20.glEnableVertexAttribArray(((r9.a)p).b("aTextureCoord"));
                                    GLES20.glVertexAttribPointer(((r9.a)p).b("aTextureCoord"), 2, 5126, false, 20, 12);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(p.j, m2);
                                    GLES20.glUniform1i(((r9.a)p).b("sTexture"), 0);
                                    GLES20.glDrawArrays(5, 0, 4);
                                    GLES20.glDisableVertexAttribArray(((r9.a)p).b("aPosition"));
                                    GLES20.glDisableVertexAttribArray(((r9.a)p).b("aTextureCoord"));
                                    GLES20.glBindBuffer(34962, 0);
                                    GLES20.glBindTexture(3553, 0);
                                    if (((d)o).l != null) {
                                        GLES20.glBindFramebuffer(36160, ((d)o).r.c);
                                        GLES20.glClear(16384);
                                        ((d)o).l.a(((d)o).o.e);
                                    }
                                    GLES20.glBindFramebuffer(36160, 0);
                                    final s9.a r2 = ((d)o).r;
                                    GLES20.glViewport(0, 0, r2.a, r2.b);
                                    GLES20.glClear(16640);
                                    ((d)o).q.a(((d)o).r.e);
                                    o = this.j;
                                    final long n9 = this.e.presentationTimeUs * 1000L;
                                    switch (((e)o).a) {
                                        default: {
                                            EGLExt.eglPresentationTimeANDROID(((e)o).b, ((e)o).d, n9);
                                            break;
                                        }
                                        case 0: {
                                            EGLExt.eglPresentationTimeANDROID(((e)o).b, ((e)o).d, n9);
                                            break;
                                        }
                                    }
                                    o = this.j;
                                    EGL14.eglSwapBuffers(((e)o).b, ((e)o).d);
                                    break Label_1927;
                                }
                            }
                            final long presentationTimeUs2 = this.e.presentationTimeUs;
                            if (presentationTimeUs2 != 0L) {
                                this.p = presentationTimeUs2;
                            }
                        }
                        n5 = 2;
                        break Label_1939;
                    }
                }
                n5 = 0;
            }
            if (n5 != 0) {
                b = true;
            }
            if (n5 != 1) {
                break;
            }
        }
        while (true) {
            int n11 = 0;
            Label_2197: {
                if (!this.k) {
                    final int sampleTrackIndex = this.a.getSampleTrackIndex();
                    final a t = this.t;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("drainExtractor trackIndex:");
                    sb.append(sampleTrackIndex);
                    final String string5 = sb.toString();
                    t.getClass();
                    Log.d("VideoComposer", string5);
                    if (sampleTrackIndex < 0 || sampleTrackIndex == this.b) {
                        final int dequeueInputBuffer = this.f.dequeueInputBuffer(0L);
                        if (dequeueInputBuffer >= 0) {
                            if (sampleTrackIndex >= 0) {
                                final long p2 = this.p;
                                final long s4 = this.s;
                                if (p2 < s4 || s4 == -1L) {
                                    final int sampleData = this.a.readSampleData(this.f.getInputBuffer(dequeueInputBuffer), 0);
                                    int n10;
                                    if ((this.a.getSampleFlags() & 0x1) != 0x0) {
                                        n10 = 1;
                                    }
                                    else {
                                        n10 = 0;
                                    }
                                    this.f.queueInputBuffer(dequeueInputBuffer, 0, sampleData, (long)(this.a.getSampleTime() / this.q), n10);
                                    this.a.advance();
                                    n11 = 2;
                                    break Label_2197;
                                }
                            }
                            this.k = true;
                            this.f.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            this.a.unselectTrack(this.b);
                        }
                    }
                }
                n11 = 0;
            }
            if (n11 == 0) {
                break;
            }
            b = true;
        }
        return b;
    }
}
