// 
// Decompiled by Procyon v0.6.0
// 

package q9;

import android.util.Log;
import android.media.MediaFormat;
import java.nio.ByteOrder;
import java.util.concurrent.TimeUnit;
import v7.a;
import java.nio.ByteBuffer;
import android.media.MediaCodec$BufferInfo;
import com.daasuu.mp4compose.SampleType;
import android.media.MediaExtractor;

public final class b implements f
{
    public final MediaExtractor a;
    public final int b;
    public final j c;
    public final SampleType d;
    public final MediaCodec$BufferInfo e;
    public int f;
    public ByteBuffer g;
    public boolean h;
    public long i;
    public final long j;
    public final long k;
    public final a l;
    
    public b(final MediaExtractor a, int integer, final j c, long micros, long micros2, final a l) {
        final SampleType audio = SampleType.AUDIO;
        this.d = audio;
        this.e = new MediaCodec$BufferInfo();
        this.a = a;
        this.b = integer;
        this.c = c;
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        micros = milliseconds.toMicros(micros);
        this.j = micros;
        if (micros2 != -1L) {
            micros2 = milliseconds.toMicros(micros2);
        }
        this.k = micros2;
        this.l = l;
        final MediaFormat trackFormat = a.getTrackFormat(integer);
        c.a(audio, trackFormat);
        if (trackFormat.containsKey("max-input-size")) {
            integer = trackFormat.getInteger("max-input-size");
        }
        else {
            integer = 65536;
        }
        this.f = integer;
        this.g = ByteBuffer.allocateDirect(integer).order(ByteOrder.nativeOrder());
        a.seekTo(micros, 0);
    }
    
    public final boolean a() {
        if (this.h) {
            return false;
        }
        final int sampleTrackIndex = this.a.getSampleTrackIndex();
        final a l = this.l;
        final StringBuilder sb = new StringBuilder();
        sb.append("stepPipeline trackIndex:");
        sb.append(sampleTrackIndex);
        final String string = sb.toString();
        l.getClass();
        Log.d("AudioComposer", string);
        if (sampleTrackIndex >= 0) {
            final long i = this.i;
            final long k = this.k;
            if (i < k || k == -1L) {
                if (sampleTrackIndex != this.b) {
                    return false;
                }
                this.g.clear();
                final int sampleData = this.a.readSampleData(this.g, 0);
                if (sampleData > this.f) {
                    final a j = this.l;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Sample size smaller than buffer size, resizing buffer: ");
                    sb2.append(sampleData);
                    final String string2 = sb2.toString();
                    j.getClass();
                    Log.w("AudioComposer", string2);
                    final int f = sampleData * 2;
                    this.f = f;
                    this.g = ByteBuffer.allocateDirect(f).order(ByteOrder.nativeOrder());
                }
                int n;
                if ((this.a.getSampleFlags() & 0x1) != 0x0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (this.a.getSampleTime() >= this.j) {
                    final long sampleTime = this.a.getSampleTime();
                    final long m = this.k;
                    if (sampleTime <= m || m == -1L) {
                        this.e.set(0, sampleData, this.a.getSampleTime(), n);
                        this.c.b(this.d, this.g, this.e);
                    }
                }
                this.i = this.a.getSampleTime();
                this.a.advance();
                return true;
            }
        }
        this.g.clear();
        this.e.set(0, 0, 0L, 4);
        this.c.b(this.d, this.g, this.e);
        this.h = true;
        this.a.unselectTrack(this.b);
        return true;
    }
    
    public final long b() {
        return this.i;
    }
    
    public final boolean c() {
        return this.h;
    }
    
    public final void release() {
    }
    
    public final void setup() {
    }
}
