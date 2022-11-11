// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import ad.c0;

public final class i extends c
{
    public final long i;
    public final long j;
    public final short k;
    public int l;
    public boolean m;
    public byte[] n;
    public byte[] o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;
    
    public i() {
        this.i = 150000L;
        this.j = 20000L;
        this.k = 1024;
        final byte[] f = c0.f;
        this.n = f;
        this.o = f;
    }
    
    public final void a(final ByteBuffer byteBuffer) {
    Label_0000:
        while (byteBuffer.hasRemaining() && !super.g.hasRemaining()) {
            final int p = this.p;
            if (p == 0) {
                final int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.n.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    int n;
                    do {
                        n = limit2 - 2;
                        if (n < byteBuffer.position()) {
                            final int position = byteBuffer.position();
                            if (position == byteBuffer.position()) {
                                this.p = 1;
                            }
                            else {
                                byteBuffer.limit(position);
                                final int remaining = byteBuffer.remaining();
                                this.i(remaining).put(byteBuffer).flip();
                                if (remaining > 0) {
                                    this.s = true;
                                }
                            }
                            byteBuffer.limit(limit);
                            continue Label_0000;
                        }
                        limit2 = n;
                    } while (Math.abs(byteBuffer.getShort(n)) <= this.k);
                    final int l = this.l;
                    final int position = n / l * l + l;
                    continue;
                }
            }
            if (p != 1) {
                if (p != 2) {
                    throw new IllegalStateException();
                }
                final int limit3 = byteBuffer.limit();
                final int j = this.j(byteBuffer);
                byteBuffer.limit(j);
                this.t += byteBuffer.remaining() / this.l;
                this.l(byteBuffer, this.o, this.r);
                if (j >= limit3) {
                    continue;
                }
                this.k(this.r, this.o);
                this.p = 0;
                byteBuffer.limit(limit3);
            }
            else {
                final int limit4 = byteBuffer.limit();
                final int i = this.j(byteBuffer);
                final int n2 = i - byteBuffer.position();
                final byte[] n3 = this.n;
                final int length = n3.length;
                final int q = this.q;
                final int n4 = length - q;
                if (i < limit4 && n2 < n4) {
                    this.k(q, n3);
                    this.q = 0;
                    this.p = 0;
                }
                else {
                    final int min = Math.min(n2, n4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.n, this.q, min);
                    final int q2 = this.q + min;
                    this.q = q2;
                    final byte[] n5 = this.n;
                    if (q2 == n5.length) {
                        if (this.s) {
                            this.k(this.r, n5);
                            this.t += (this.q - this.r * 2) / this.l;
                        }
                        else {
                            this.t += (q2 - this.r) / this.l;
                        }
                        this.l(byteBuffer, this.n, this.q);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(limit4);
                }
            }
        }
    }
    
    public final AudioProcessor.a e(AudioProcessor.a e) throws AudioProcessor.UnhandledAudioFormatException {
        if (e.c == 2) {
            if (!this.m) {
                e = AudioProcessor.a.e;
            }
            return e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(e);
    }
    
    public final void f() {
        if (this.m) {
            final AudioProcessor.a b = super.b;
            final int d = b.d;
            this.l = d;
            final long i = this.i;
            final int a = b.a;
            final int n = (int)(i * a / 1000000L) * d;
            if (this.n.length != n) {
                this.n = new byte[n];
            }
            final int r = (int)(this.j * a / 1000000L) * d;
            if (this.o.length != (this.r = r)) {
                this.o = new byte[r];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }
    
    public final void g() {
        final int q = this.q;
        if (q > 0) {
            this.k(q, this.n);
        }
        if (!this.s) {
            this.t += this.r / this.l;
        }
    }
    
    public final void h() {
        this.m = false;
        this.r = 0;
        final byte[] f = c0.f;
        this.n = f;
        this.o = f;
    }
    
    public final boolean isActive() {
        return this.m;
    }
    
    public final int j(final ByteBuffer byteBuffer) {
        for (int i = byteBuffer.position(); i < byteBuffer.limit(); i += 2) {
            if (Math.abs(byteBuffer.getShort(i)) > this.k) {
                final int l = this.l;
                return i / l * l;
            }
        }
        return byteBuffer.limit();
    }
    
    public final void k(final int n, final byte[] array) {
        this.i(n).put(array, 0, n).flip();
        if (n > 0) {
            this.s = true;
        }
    }
    
    public final void l(final ByteBuffer byteBuffer, final byte[] array, final int n) {
        final int min = Math.min(byteBuffer.remaining(), this.r);
        final int n2 = this.r - min;
        System.arraycopy(array, n - n2, this.o, 0, n2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.o, n2, min);
    }
}
