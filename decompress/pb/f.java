// 
// Decompiled by Procyon v0.6.0
// 

package pb;

import android.media.MediaCodec;
import android.media.MediaCodec$CodecException;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import java.util.ArrayDeque;
import android.os.Handler;
import android.os.HandlerThread;
import android.media.MediaCodec$Callback;

public final class f extends MediaCodec$Callback
{
    public final Object a;
    public final HandlerThread b;
    public Handler c;
    public final i d;
    public final i e;
    public final ArrayDeque<MediaCodec$BufferInfo> f;
    public final ArrayDeque<MediaFormat> g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec$CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    
    public f(final HandlerThread b) {
        this.a = new Object();
        this.b = b;
        this.d = new i();
        this.e = new i();
        this.f = new ArrayDeque<MediaCodec$BufferInfo>();
        this.g = new ArrayDeque<MediaFormat>();
    }
    
    public final void a() {
        if (!this.g.isEmpty()) {
            this.i = this.g.getLast();
        }
        final i d = this.d;
        d.a = 0;
        d.b = -1;
        d.c = 0;
        final i e = this.e;
        e.a = 0;
        e.b = -1;
        e.c = 0;
        this.f.clear();
        this.g.clear();
        this.j = null;
    }
    
    public final void onError(final MediaCodec mediaCodec, final MediaCodec$CodecException j) {
        synchronized (this.a) {
            this.j = j;
        }
    }
    
    public final void onInputBufferAvailable(final MediaCodec mediaCodec, final int n) {
        synchronized (this.a) {
            this.d.a(n);
        }
    }
    
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        synchronized (this.a) {
            final MediaFormat i = this.i;
            if (i != null) {
                this.e.a(-2);
                this.g.add(i);
                this.i = null;
            }
            this.e.a(n);
            this.f.add(mediaCodec$BufferInfo);
        }
    }
    
    public final void onOutputFormatChanged(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
