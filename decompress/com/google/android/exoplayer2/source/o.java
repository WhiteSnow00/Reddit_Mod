// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import ad.d0;
import za.c$a;
import android.media.MediaCodec$CryptoInfo;
import cb.w$a;
import za.c;
import ad.c0;
import java.util.Arrays;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import yc.a;
import java.nio.ByteBuffer;
import yc.j;
import ad.s;
import yc.b;

public final class o
{
    public final b a;
    public final int b;
    public final s c;
    public a d;
    public a e;
    public a f;
    public long g;
    
    public o(final b a) {
        this.a = a;
        final int b = ((j)a).b;
        this.b = b;
        this.c = new s(32);
        final a f = new a(0L, b);
        this.d = f;
        this.e = f;
        this.f = f;
    }
    
    public static a d(a d, long n, final ByteBuffer byteBuffer, int n2) {
        a d2;
        long n3;
        int i;
        while (true) {
            d2 = d;
            n3 = n;
            i = n2;
            if (n < d.b) {
                break;
            }
            d = d.d;
        }
        while (i > 0) {
            final int min = Math.min(i, (int)(d2.b - n3));
            final yc.a c = d2.c;
            byteBuffer.put(c.a, (int)(n3 - d2.a) + c.b, min);
            n2 = i - min;
            n = (n3 += min);
            i = n2;
            if (n == d2.b) {
                d2 = d2.d;
                n3 = n;
                i = n2;
            }
        }
        return d2;
    }
    
    public static a e(a a, long n, final byte[] array, final int n2) {
        while (n >= a.b) {
            a = a.d;
        }
        int n3;
        long n4;
        for (int i = n2; i > 0; i = n3, n = n4) {
            final int min = Math.min(i, (int)(a.b - n));
            final yc.a c = a.c;
            System.arraycopy(c.a, (int)(n - a.a) + c.b, array, n2 - i, min);
            n3 = i - min;
            n4 = n + min;
            i = n3;
            n = n4;
            if (n4 == a.b) {
                a = a.d;
            }
        }
        return a;
    }
    
    public static a f(a a, final DecoderInputBuffer decoderInputBuffer, final p.a a2, final s s) {
        a a3 = a;
        if (((za.a)decoderInputBuffer).o(1073741824)) {
            final long b = a2.b;
            int w = 1;
            s.y(1);
            a = e(a, b, s.a, 1);
            final long n = b + 1L;
            final byte[] a4 = s.a;
            final int n2 = 0;
            final byte b2 = a4[0];
            final boolean b3 = (b2 & 0x80) != 0x0;
            final int n3 = b2 & 0x7F;
            final c g = decoderInputBuffer.g;
            final byte[] a5 = g.a;
            if (a5 == null) {
                g.a = new byte[16];
            }
            else {
                Arrays.fill(a5, (byte)0);
            }
            final a e = e(a, n, g.a, n3);
            long n5;
            final long n4 = n5 = n + n3;
            a = e;
            if (b3) {
                s.y(2);
                a = e(e, n4, s.a, 2);
                n5 = n4 + 2L;
                w = s.w();
            }
            final int[] d = g.d;
            int[] array = null;
            Label_0217: {
                if (d != null) {
                    array = d;
                    if (d.length >= w) {
                        break Label_0217;
                    }
                }
                array = new int[w];
            }
            final int[] e2 = g.e;
            int[] array2 = null;
            Label_0247: {
                if (e2 != null) {
                    array2 = e2;
                    if (e2.length >= w) {
                        break Label_0247;
                    }
                }
                array2 = new int[w];
            }
            if (b3) {
                final int n6 = w * 6;
                s.y(n6);
                final a e3 = e(a, n5, s.a, n6);
                final long n7 = n5 + n6;
                s.B(0);
                int n8 = n2;
                while (true) {
                    n5 = n7;
                    a = e3;
                    if (n8 >= w) {
                        break;
                    }
                    array[n8] = s.w();
                    array2[n8] = s.u();
                    ++n8;
                }
            }
            else {
                array2[array[0] = 0] = a2.a - (int)(n5 - a2.b);
            }
            final w$a c = a2.c;
            final int a6 = c0.a;
            final byte[] b4 = c.b;
            final byte[] a7 = g.a;
            final int a8 = c.a;
            final int c2 = c.c;
            final int d2 = c.d;
            g.f = w;
            g.d = array;
            g.e = array2;
            g.b = b4;
            g.a = a7;
            g.c = a8;
            g.g = c2;
            g.h = d2;
            final MediaCodec$CryptoInfo i = g.i;
            i.numSubSamples = w;
            i.numBytesOfClearData = array;
            i.numBytesOfEncryptedData = array2;
            i.key = b4;
            i.iv = a7;
            i.mode = a8;
            if (c0.a >= 24) {
                final c$a j = g.j;
                j.getClass();
                j.b.set(c2, d2);
                j.a.setPattern(j.b);
            }
            final long b5 = a2.b;
            final int n9 = (int)(n5 - b5);
            a2.b = b5 + n9;
            a2.a -= n9;
            a3 = a;
        }
        if (((za.a)decoderInputBuffer).o(268435456)) {
            s.y(4);
            a = e(a3, a2.b, s.a, 4);
            final int u = s.u();
            a2.b += 4L;
            a2.a -= 4;
            decoderInputBuffer.v(u);
            final a d3 = d(a, a2.b, decoderInputBuffer.h, u);
            a2.b += u;
            final int a9 = a2.a - u;
            a2.a = a9;
            final ByteBuffer k = decoderInputBuffer.k;
            if (k != null && k.capacity() >= a9) {
                decoderInputBuffer.k.clear();
            }
            else {
                decoderInputBuffer.k = ByteBuffer.allocate(a9);
            }
            a = d(d3, a2.b, decoderInputBuffer.k, a2.a);
        }
        else {
            decoderInputBuffer.v(a2.a);
            a = d(a3, a2.b, decoderInputBuffer.h, a2.a);
        }
        return a;
    }
    
    public final void a(final a a) {
        if (a.c == null) {
            return;
        }
        final j j = (j)this.a;
        monitorenter(j);
        a a2 = a;
        while (true) {
            Label_0100: {
                if (a2 == null) {
                    break Label_0100;
                }
                try {
                    final yc.a[] f = j.f;
                    final int n = j.e++;
                    final yc.a c = a2.c;
                    c.getClass();
                    f[n] = c;
                    --j.d;
                    final a d = a2.d;
                    if (d != null) {
                        a2 = d;
                        if (d.c != null) {
                            continue;
                        }
                    }
                    a2 = null;
                    continue;
                    j.notifyAll();
                    monitorexit(j);
                    a.c = null;
                    a.d = null;
                }
                finally {
                    monitorexit(j);
                }
            }
        }
    }
    
    public final void b(final long n) {
        if (n == -1L) {
            return;
        }
        a d;
        while (true) {
            d = this.d;
            if (n >= d.b) {
                final b a = this.a;
                final yc.a c = d.c;
                Object d2 = a;
                synchronized (d2) {
                    ((j)d2).f[((j)d2).e++] = c;
                    --((j)d2).d;
                    d2.notifyAll();
                    monitorexit(d2);
                    d2 = this.d;
                    ((a)d2).c = null;
                    final a d3 = ((a)d2).d;
                    ((a)d2).d = null;
                    this.d = d3;
                    continue;
                }
                break;
            }
            break;
        }
        if (this.e.a < d.a) {
            this.e = d;
        }
    }
    
    public final int c(final int n) {
        final a f = this.f;
        if (f.c == null) {
            Object d = this.a;
            synchronized (d) {
                final int d2 = ((j)d).d + 1;
                ((j)d).d = d2;
                final int e = ((j)d).e;
                yc.a c;
                if (e > 0) {
                    final yc.a[] f2 = ((j)d).f;
                    final int e2 = e - 1;
                    ((j)d).e = e2;
                    c = f2[e2];
                    c.getClass();
                    ((j)d).f[((j)d).e] = null;
                }
                else {
                    c = new yc.a(new byte[((j)d).b], 0);
                    final yc.a[] f3 = ((j)d).f;
                    if (d2 > f3.length) {
                        ((j)d).f = Arrays.copyOf(f3, f3.length * 2);
                    }
                }
                monitorexit(d);
                d = new a(this.f.b, this.b);
                f.c = c;
                f.d = (a)d;
            }
        }
        return Math.min(n, (int)(this.f.b - this.g));
    }
    
    public static final class a
    {
        public long a;
        public long b;
        public yc.a c;
        public a d;
        
        public a(final long a, final int n) {
            d0.f(this.c == null);
            this.a = a;
            this.b = a + n;
        }
    }
}
