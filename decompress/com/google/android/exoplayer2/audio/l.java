// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import ad.c0;

public final class l extends c
{
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;
    
    public l() {
        this.m = c0.f;
    }
    
    public final void a(final ByteBuffer byteBuffer) {
        final int position = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - position;
        if (n == 0) {
            return;
        }
        final int min = Math.min(n, this.l);
        this.o += min / super.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        final int n2 = n - min;
        final int n3 = this.n + n2 - this.m.length;
        final ByteBuffer i = this.i(n3);
        final int j = c0.i(n3, 0, this.n);
        i.put(this.m, 0, j);
        final int k = c0.i(n3 - j, 0, n2);
        byteBuffer.limit(byteBuffer.position() + k);
        i.put(byteBuffer);
        byteBuffer.limit(limit);
        final int n4 = n2 - k;
        final int n5 = this.n - j;
        this.n = n5;
        final byte[] m = this.m;
        System.arraycopy(m, j, m, 0, n5);
        byteBuffer.get(this.m, this.n, n4);
        this.n += n4;
        i.flip();
    }
    
    public final boolean b() {
        return super.b() && this.n == 0;
    }
    
    public final AudioProcessor.a e(final AudioProcessor.a a) throws AudioProcessor.UnhandledAudioFormatException {
        if (a.c == 2) {
            this.k = true;
            Object e = a;
            if (this.i == 0) {
                if (this.j != 0) {
                    e = a;
                }
                else {
                    e = AudioProcessor.a.e;
                }
            }
            return (AudioProcessor.a)e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(a);
    }
    
    public final void f() {
        if (this.k) {
            this.k = false;
            final int j = this.j;
            final int d = super.b.d;
            this.m = new byte[j * d];
            this.l = this.i * d;
        }
        this.n = 0;
    }
    
    public final void g() {
        if (this.k) {
            final int n = this.n;
            if (n > 0) {
                this.o += n / super.b.d;
            }
            this.n = 0;
        }
    }
    
    public final ByteBuffer getOutput() {
        if (super.b()) {
            final int n = this.n;
            if (n > 0) {
                this.i(n).put(this.m, 0, this.n).flip();
                this.n = 0;
            }
        }
        return super.getOutput();
    }
    
    public final void h() {
        this.m = c0.f;
    }
}
