// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.mediacodec;

import java.io.IOException;
import android.media.MediaCrypto;
import com.google.android.exoplayer2.n;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.os.Handler;
import android.media.MediaCodec$BufferInfo;

public interface c
{
    void a(final int p0);
    
    void b();
    
    void c(final int p0, final long p1);
    
    int d(final MediaCodec$BufferInfo p0);
    
    void e(final int p0, final c p1, final long p2);
    
    void f(final int p0, final int p1, final long p2, final int p3);
    
    void flush();
    
    void g(final c p0, final Handler p1);
    
    MediaFormat getOutputFormat();
    
    ByteBuffer h(final int p0);
    
    void i(final Surface p0);
    
    int j();
    
    ByteBuffer k(final int p0);
    
    void release();
    
    void releaseOutputBuffer(final int p0, final boolean p1);
    
    void setParameters(final Bundle p0);
    
    public static final class a
    {
        public final d a;
        public final MediaFormat b;
        public final n c;
        public final Surface d;
        public final MediaCrypto e;
        
        public a(final d a, final MediaFormat b, final n c, final Surface d, final MediaCrypto e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    public interface b
    {
        c a(final a p0) throws IOException;
    }
    
    public interface c
    {
    }
}
