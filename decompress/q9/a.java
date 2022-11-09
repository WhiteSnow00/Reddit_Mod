// 
// Decompiled by Procyon v0.6.0
// 

package q9;

import java.nio.ShortBuffer;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCodec;

public final class a extends c
{
    public l i;
    public float j;
    public boolean k;
    public int l;
    public long m;
    public int n;
    public boolean o;
    public boolean p;
    
    public a(final MediaCodec mediaCodec, final MediaCodec mediaCodec2, final MediaFormat mediaFormat, final float j, final boolean p5) {
        super(mediaCodec, mediaCodec2, mediaFormat);
        this.i = null;
        this.k = false;
        this.l = 2048;
        this.m = 0L;
        this.n = -1;
        this.o = true;
        this.p = p5;
        this.j = j;
    }
    
    public final void a(int length) {
        if (super.h != null) {
            ByteBuffer outputBuffer;
            if (length == -1) {
                outputBuffer = null;
            }
            else {
                outputBuffer = super.a.getOutputBuffer(length);
            }
            if (outputBuffer != null) {
                final ShortBuffer shortBuffer = outputBuffer.asShortBuffer();
                final int capacity = shortBuffer.capacity();
                final short[] array = new short[capacity];
                shortBuffer.get(array);
                shortBuffer.rewind();
                this.i.f(capacity / super.f, array);
                this.n = length;
                this.k = false;
                super.a.releaseOutputBuffer(length, false);
            }
            else {
                final l i = this.i;
                final int m = i.m;
                final int n = i.n + (int)((m / (i.e / 1.0f) + i.o) / (i.f * 1.0f) + 0.5f);
                length = i.r * 2 + m;
                final int j = i.j;
                if (m + length > j) {
                    length = (j >> 1) + length + j;
                    i.j = length;
                    final short[] a = i.a;
                    final int n2 = length * i.i;
                    final short[] a2 = new short[n2];
                    if (a.length <= (length = n2)) {
                        length = a.length;
                    }
                    System.arraycopy(a, 0, a2, 0, length);
                    i.a = a2;
                }
                length = 0;
                int n3;
                while (true) {
                    n3 = i.r * 2;
                    final int k = i.i;
                    if (length >= n3 * k) {
                        break;
                    }
                    i.a[k * m + length] = 0;
                    ++length;
                }
                i.m += n3;
                i.f(0, null);
                if (i.n > n) {
                    i.n = n;
                }
                i.m = 0;
                i.s = 0;
                i.o = 0;
                this.k = true;
            }
            return;
        }
        throw new RuntimeException("Buffer received before format!");
    }
    
    public final void b(final int n, final short[] array) {
        final ShortBuffer shortBuffer = super.b.getInputBuffer(n).asShortBuffer();
        shortBuffer.clear();
        if (array != null) {
            shortBuffer.put(array);
            final long m = this.m + array.length;
            this.m = m;
            super.b.queueInputBuffer(n, 0, array.length * 2, (long)(m * 1.0f * 1000000.0f / (super.d * 1.0f * super.f)), 0);
            return;
        }
        super.b.queueInputBuffer(n, 0, 0, 0L, 4);
    }
    
    public final void c(int n, final int n2) {
        final short[] array = new short[n];
        final l i = this.i;
        final int n3 = n / super.f;
        final int n4 = i.n;
        if (n4 != 0) {
            int n5;
            if (n4 > n3) {
                n = n3;
                n5 = n4 - n3;
            }
            else {
                final int n6 = 0;
                n = n4;
                n5 = n6;
            }
            i.d(array, 0, i.b, 0, n);
            final short[] b = i.b;
            i.d(b, 0, b, n, n5);
            i.n = n5;
        }
        this.b(n2, array);
    }
}
