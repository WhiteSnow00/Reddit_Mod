// 
// Decompiled by Procyon v0.6.0
// 

package dc;

import za.a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.android.billingclient.api.d0;
import java.io.IOException;
import ad.c0;
import ec.f;
import rb.c;
import com.google.android.exoplayer2.n;
import ac.p;

public final class e implements p
{
    public final n f;
    public final c g;
    public long[] h;
    public boolean i;
    public f j;
    public boolean k;
    public int l;
    public long m;
    
    public e(final f j, final n f, final boolean b) {
        this.f = f;
        this.j = j;
        this.g = new c();
        this.m = -9223372036854775807L;
        this.h = j.b;
        this.c(j, b);
    }
    
    public final void a(long m) {
        final long[] h = this.h;
        boolean b = true;
        final int b2 = c0.b(h, m, true);
        this.l = b2;
        if (!this.i || b2 != this.h.length) {
            b = false;
        }
        if (!b) {
            m = -9223372036854775807L;
        }
        this.m = m;
    }
    
    @Override
    public final void b() throws IOException {
    }
    
    public final void c(final f j, final boolean i) {
        final int l = this.l;
        long n;
        if (l == 0) {
            n = -9223372036854775807L;
        }
        else {
            n = this.h[l - 1];
        }
        this.i = i;
        this.j = j;
        final long[] b = j.b;
        this.h = b;
        final long m = this.m;
        if (m != -9223372036854775807L) {
            this.a(m);
        }
        else if (n != -9223372036854775807L) {
            this.l = c0.b(b, n, false);
        }
    }
    
    @Override
    public final int i(final d0 d0, final DecoderInputBuffer decoderInputBuffer, final int n) {
        final int l = this.l;
        final boolean b = l == this.h.length;
        if (b && !this.i) {
            ((a)decoderInputBuffer).f = 4;
            return -4;
        }
        if ((n & 0x2) != 0x0 || !this.k) {
            d0.g = this.f;
            this.k = true;
            return -5;
        }
        if (b) {
            return -3;
        }
        if ((n & 0x1) == 0x0) {
            this.l = l + 1;
        }
        if ((n & 0x4) == 0x0) {
            final byte[] a = this.g.a(this.j.a[l]);
            decoderInputBuffer.v(a.length);
            decoderInputBuffer.h.put(a);
        }
        decoderInputBuffer.j = this.h[l];
        ((a)decoderInputBuffer).f = 1;
        return -4;
    }
    
    @Override
    public final boolean isReady() {
        return true;
    }
    
    @Override
    public final int k(final long n) {
        return (this.l = Math.max(this.l, c0.b(this.h, n, true))) - this.l;
    }
}
