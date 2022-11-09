// 
// Decompiled by Procyon v0.6.0
// 

package q9;

import java.nio.ByteOrder;
import android.media.MediaCodec$BufferInfo;
import com.daasuu.mp4compose.SampleType;
import v7.a;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaMuxer;

public final class j
{
    public final MediaMuxer a;
    public MediaFormat b;
    public MediaFormat c;
    public int d;
    public int e;
    public ByteBuffer f;
    public final ArrayList g;
    public boolean h;
    public final a i;
    
    public j(final MediaMuxer a, final a i) {
        this.a = a;
        this.i = i;
        this.g = new ArrayList();
    }
    
    public final void a(final SampleType sampleType, final MediaFormat mediaFormat) {
        final int n = j$a.a[((Enum)sampleType).ordinal()];
        if (n != 1) {
            if (n != 2) {
                throw new AssertionError();
            }
            this.c = mediaFormat;
        }
        else {
            this.b = mediaFormat;
        }
    }
    
    public final void b(final SampleType sampleType, final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        if (this.h) {
            final MediaMuxer a = this.a;
            final int n = j$a.a[((Enum)sampleType).ordinal()];
            int n2;
            if (n != 1) {
                if (n != 2) {
                    throw new AssertionError();
                }
                n2 = this.e;
            }
            else {
                n2 = this.d;
            }
            a.writeSampleData(n2, byteBuffer, mediaCodec$BufferInfo);
            return;
        }
        byteBuffer.limit(mediaCodec$BufferInfo.offset + mediaCodec$BufferInfo.size);
        byteBuffer.position(mediaCodec$BufferInfo.offset);
        if (this.f == null) {
            this.f = ByteBuffer.allocateDirect(65536).order(ByteOrder.nativeOrder());
        }
        this.f.put(byteBuffer);
        this.g.add(new b(sampleType, mediaCodec$BufferInfo.size, mediaCodec$BufferInfo));
    }
    
    public static final class b
    {
        public final SampleType a;
        public final int b;
        public final long c;
        public final int d;
        
        public b(final SampleType a, final int b, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
            this.a = a;
            this.b = b;
            this.c = mediaCodec$BufferInfo.presentationTimeUs;
            this.d = mediaCodec$BufferInfo.flags;
        }
    }
}
