// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.nio.ByteBuffer;
import ya.o;

public final class j implements AudioProcessor
{
    public int b;
    public float c;
    public float d;
    public AudioProcessor$a e;
    public AudioProcessor$a f;
    public AudioProcessor$a g;
    public AudioProcessor$a h;
    public boolean i;
    public o j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;
    
    public j() {
        this.c = 1.0f;
        this.d = 1.0f;
        final AudioProcessor$a e = AudioProcessor$a.e;
        this.e = e;
        this.f = e;
        this.g = e;
        this.h = e;
        final ByteBuffer a = AudioProcessor.a;
        this.k = a;
        this.l = a.asShortBuffer();
        this.m = a;
        this.b = -1;
    }
    
    public final void a(final ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        final o j = this.j;
        j.getClass();
        final ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
        final int remaining = byteBuffer.remaining();
        this.n += remaining;
        final int remaining2 = shortBuffer.remaining();
        final int b = j.b;
        final int n = remaining2 / b;
        shortBuffer.get(j.j = j.b(j.j, j.k, n), j.k * j.b, b * n * 2 / 2);
        j.k += n;
        j.e();
        byteBuffer.position(byteBuffer.position() + remaining);
    }
    
    public final boolean b() {
        if (this.p) {
            final o j = this.j;
            if (j == null || j.m * j.b * 2 == 0) {
                return true;
            }
        }
        return false;
    }
    
    public final void c() {
        final o j = this.j;
        if (j != null) {
            final int k = j.k;
            final float c = j.c;
            final float d = j.d;
            final int m = j.m + (int)((k / (c / d) + j.o) / (j.e * d) + 0.5f);
            j.j = j.b(j.j, k, j.h * 2 + k);
            int n = 0;
            int n2;
            while (true) {
                n2 = j.h * 2;
                final int b = j.b;
                if (n >= n2 * b) {
                    break;
                }
                j.j[b * k + n] = 0;
                ++n;
            }
            j.k += n2;
            j.e();
            if (j.m > m) {
                j.m = m;
            }
            j.k = 0;
            j.r = 0;
            j.o = 0;
        }
        this.p = true;
    }
    
    public final AudioProcessor$a d(final AudioProcessor$a e) throws AudioProcessor$UnhandledAudioFormatException {
        if (e.c == 2) {
            int n;
            if ((n = this.b) == -1) {
                n = e.a;
            }
            this.e = e;
            final AudioProcessor$a f = new AudioProcessor$a(n, e.b, 2);
            this.f = f;
            this.i = true;
            return f;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(e);
    }
    
    public final void flush() {
        if (this.isActive()) {
            final AudioProcessor$a e = this.e;
            this.g = e;
            final AudioProcessor$a f = this.f;
            this.h = f;
            if (this.i) {
                this.j = new o(e.a, e.b, this.c, this.d, f.a);
            }
            else {
                final o j = this.j;
                if (j != null) {
                    j.k = 0;
                    j.m = 0;
                    j.o = 0;
                    j.p = 0;
                    j.q = 0;
                    j.r = 0;
                    j.s = 0;
                    j.t = 0;
                    j.u = 0;
                    j.v = 0;
                }
            }
        }
        this.m = AudioProcessor.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
    
    public final ByteBuffer getOutput() {
        final o j = this.j;
        if (j != null) {
            final int n = j.m * j.b * 2;
            if (n > 0) {
                if (this.k.capacity() < n) {
                    final ByteBuffer order = ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                }
                else {
                    this.k.clear();
                    this.l.clear();
                }
                final ShortBuffer l = this.l;
                final int min = Math.min(l.remaining() / j.b, j.m);
                l.put(j.l, 0, j.b * min);
                final int m = j.m - min;
                j.m = m;
                final short[] i = j.l;
                final int b = j.b;
                System.arraycopy(i, min * b, i, 0, m * b);
                this.o += n;
                this.k.limit(n);
                this.m = this.k;
            }
        }
        final ByteBuffer k = this.m;
        this.m = AudioProcessor.a;
        return k;
    }
    
    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }
    
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        final AudioProcessor$a e = AudioProcessor$a.e;
        this.e = e;
        this.f = e;
        this.g = e;
        this.h = e;
        final ByteBuffer a = AudioProcessor.a;
        this.k = a;
        this.l = a.asShortBuffer();
        this.m = a;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
