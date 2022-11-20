// 
// Decompiled by Procyon v0.6.0
// 

package q9;

import java.io.IOException;
import android.media.MediaCrypto;
import android.view.Surface;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import android.media.MediaCodec;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaFormat;
import android.media.MediaExtractor;
import com.daasuu.mp4compose.SampleType;

public final class k implements f
{
    public static final SampleType s;
    public final MediaExtractor a;
    public final j b;
    public long c;
    public final int d;
    public final MediaFormat e;
    public final MediaCodec$BufferInfo f;
    public MediaCodec g;
    public MediaCodec h;
    public MediaFormat i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public a o;
    public final float p;
    public final boolean q;
    public final long r;
    
    static {
        s = SampleType.AUDIO;
    }
    
    public k(final MediaExtractor a, final int d, final MediaFormat e, final j b, final float p7, final long n, long micros) {
        this.f = new MediaCodec$BufferInfo();
        this.a = a;
        this.d = d;
        this.e = e;
        this.b = b;
        this.p = p7;
        this.q = false;
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        milliseconds.toMicros(n);
        if (micros != -1L) {
            micros = milliseconds.toMicros(micros);
        }
        this.r = micros;
    }
    
    public final boolean a() {
        boolean b = false;
        while (true) {
            int n = 0;
            Label_0232: {
                Label_0163: {
                    if (!this.l) {
                        final int dequeueOutputBuffer = this.h.dequeueOutputBuffer(this.f, 0L);
                        if (dequeueOutputBuffer != -3) {
                            if (dequeueOutputBuffer != -2) {
                                if (dequeueOutputBuffer == -1) {
                                    break Label_0163;
                                }
                                if (this.i == null) {
                                    throw new RuntimeException("Could not determine actual output format.");
                                }
                                final MediaCodec$BufferInfo f = this.f;
                                final int flags = f.flags;
                                if ((flags & 0x4) != 0x0) {
                                    this.l = true;
                                    f.set(0, 0, 0L, flags);
                                }
                                if ((this.f.flags & 0x2) == 0x0) {
                                    this.b.b(q9.k.s, this.h.getOutputBuffer(dequeueOutputBuffer), this.f);
                                    this.c = this.f.presentationTimeUs;
                                    this.h.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    n = 2;
                                    break Label_0232;
                                }
                                this.h.releaseOutputBuffer(dequeueOutputBuffer, false);
                            }
                            else {
                                if (this.i != null) {
                                    throw new RuntimeException("Audio output format changed twice.");
                                }
                                final MediaFormat outputFormat = this.h.getOutputFormat();
                                this.i = outputFormat;
                                "audio/mp4a-latm".equals(outputFormat.getString("mime"));
                                this.b.a(q9.k.s, this.i);
                            }
                        }
                        n = 1;
                        break Label_0232;
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
            while (this.o.n == -1) {
                int n2 = 0;
                Label_0650: {
                    Label_0360: {
                        if (!this.k) {
                            final int dequeueOutputBuffer2 = this.g.dequeueOutputBuffer(this.f, 0L);
                            if (dequeueOutputBuffer2 != -3) {
                                if (dequeueOutputBuffer2 != -2) {
                                    if (dequeueOutputBuffer2 != -1) {
                                        final MediaCodec$BufferInfo f2 = this.f;
                                        if ((f2.flags & 0x4) != 0x0) {
                                            this.k = true;
                                            this.o.a(-1);
                                        }
                                        else if (f2.size > 0) {
                                            this.o.a(dequeueOutputBuffer2);
                                        }
                                        n2 = 2;
                                        break Label_0650;
                                    }
                                    break Label_0360;
                                }
                                else {
                                    final a o = this.o;
                                    final MediaFormat outputFormat2 = this.g.getOutputFormat();
                                    o.h = outputFormat2;
                                    if ((o.d = outputFormat2.getInteger("sample-rate")) != o.c.getInteger("sample-rate")) {
                                        throw new UnsupportedOperationException("Audio sample rate conversion not supported yet.");
                                    }
                                    o.e = o.h.getInteger("channel-count");
                                    final int integer = o.c.getInteger("channel-count");
                                    o.f = integer;
                                    if (integer != 1 && integer != 2) {
                                        throw new UnsupportedOperationException(a.q(a.t("Output channel count ("), o.f, ") not supported."));
                                    }
                                    o.g.getClass();
                                    if (o.e > 2) {
                                        throw new UnsupportedOperationException(a.q(a.t("Input channel count ("), o.e, ") not supported."));
                                    }
                                    o.i = new l(o.d, o.f);
                                    o.k = false;
                                    o.m = 0L;
                                    o.o = true;
                                    ByteBuffer.allocateDirect(o.l * 16).order(ByteOrder.nativeOrder());
                                    if (o.p) {
                                        final l i = o.i;
                                        i.f = o.j;
                                        i.g = 0;
                                        i.h = 0;
                                    }
                                    else {
                                        o.i.e = o.j;
                                    }
                                }
                            }
                            n2 = 1;
                            break Label_0650;
                        }
                    }
                    n2 = 0;
                }
                boolean b2 = b;
                if (n2 != 0) {
                    b2 = true;
                }
                b = b2;
                if (n2 != 1) {
                    b = b2;
                    final a o2 = this.o;
                    final l j = o2.i;
                    while (true) {
                        Label_1040: {
                            if (j == null || !o2.o) {
                                break Label_1040;
                            }
                            final boolean k = o2.k;
                            if (!k && j.n == 0) {
                                break Label_1040;
                            }
                            if (!k && o2.j < 1.0f) {
                                final int n3 = j.n;
                                if (n3 > 0 && n3 * o2.f < o2.l) {
                                    boolean b3 = b;
                                    if (o2.n != -1) {
                                        o2.n = -1;
                                        b3 = b;
                                    }
                                    break Label_1063;
                                }
                            }
                            final int dequeueInputBuffer = o2.b.dequeueInputBuffer(0L);
                            boolean b3;
                            if (dequeueInputBuffer < 0) {
                                b3 = b;
                            }
                            else if (o2.j < 1.0f) {
                                final int n4 = o2.i.n * o2.f;
                                final int l = o2.l;
                                if (n4 >= l) {
                                    o2.c(l, dequeueInputBuffer);
                                    b3 = b;
                                }
                                else {
                                    final boolean m = o2.k;
                                    if (m && n4 > 0 && n4 < l) {
                                        o2.c(n4, dequeueInputBuffer);
                                        b3 = b;
                                    }
                                    else {
                                        b3 = b;
                                        if (m) {
                                            b3 = b;
                                            if (n4 == 0) {
                                                o2.o = false;
                                                o2.b(dequeueInputBuffer, null);
                                                b3 = b;
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                final int n5 = o2.i.n;
                                final int n6 = o2.f * n5;
                                final int l2 = o2.l;
                                if (n6 >= l2) {
                                    o2.c(l2, dequeueInputBuffer);
                                    b3 = b;
                                }
                                else if (n6 > 0 && n6 < l2) {
                                    o2.c(n6, dequeueInputBuffer);
                                    b3 = b;
                                }
                                else {
                                    b3 = b;
                                    if (o2.k) {
                                        b3 = b;
                                        if (n5 == 0) {
                                            o2.o = false;
                                            o2.b(dequeueInputBuffer, null);
                                            b3 = b;
                                        }
                                    }
                                }
                            }
                            while (true) {
                                int n8 = 0;
                                Label_1245: {
                                    if (!this.j) {
                                        final int sampleTrackIndex = this.a.getSampleTrackIndex();
                                        if (sampleTrackIndex < 0 || sampleTrackIndex == this.d) {
                                            final int dequeueInputBuffer2 = this.g.dequeueInputBuffer(0L);
                                            if (dequeueInputBuffer2 >= 0) {
                                                if (sampleTrackIndex >= 0) {
                                                    final long c = this.c;
                                                    final long r = this.r;
                                                    if (c < r || r == -1L) {
                                                        final int sampleData = this.a.readSampleData(this.g.getInputBuffer(dequeueInputBuffer2), 0);
                                                        int n7;
                                                        if ((this.a.getSampleFlags() & 0x1) != 0x0) {
                                                            n7 = 1;
                                                        }
                                                        else {
                                                            n7 = 0;
                                                        }
                                                        this.g.queueInputBuffer(dequeueInputBuffer2, 0, sampleData, this.a.getSampleTime(), n7);
                                                        this.a.advance();
                                                        n8 = 2;
                                                        break Label_1245;
                                                    }
                                                }
                                                this.j = true;
                                                this.g.queueInputBuffer(dequeueInputBuffer2, 0, 0, 0L, 4);
                                                this.a.unselectTrack(this.d);
                                            }
                                        }
                                    }
                                    n8 = 0;
                                }
                                if (n8 == 0) {
                                    break;
                                }
                                b3 = true;
                            }
                            return b3;
                        }
                        boolean b3 = b;
                        if (o2.n != -1) {
                            o2.n = -1;
                            b3 = b;
                        }
                        continue;
                    }
                }
            }
            continue;
        }
    }
    
    public final long b() {
        return (long)(this.c * this.p);
    }
    
    public final boolean c() {
        return this.l;
    }
    
    public final void release() {
        final MediaCodec g = this.g;
        if (g != null) {
            if (this.m) {
                g.stop();
            }
            this.g.release();
            this.g = null;
        }
        final MediaCodec h = this.h;
        if (h != null) {
            if (this.n) {
                h.stop();
            }
            this.h.release();
            this.h = null;
        }
    }
    
    public final void setup() {
        this.a.selectTrack(this.d);
        try {
            (this.h = MediaCodec.createEncoderByType(this.e.getString("mime"))).configure(this.e, (Surface)null, (MediaCrypto)null, 1);
            this.h.start();
            this.n = true;
            final MediaFormat trackFormat = this.a.getTrackFormat(this.d);
            try {
                (this.g = MediaCodec.createDecoderByType(trackFormat.getString("mime"))).configure(trackFormat, (Surface)null, (MediaCrypto)null, 0);
                this.g.start();
                this.m = true;
                this.o = new a(this.g, this.h, this.e, this.p, this.q);
            }
            catch (final IOException ex) {
                throw new IllegalStateException(ex);
            }
        }
        catch (final IOException ex2) {
            throw new IllegalStateException(ex2);
        }
    }
}
