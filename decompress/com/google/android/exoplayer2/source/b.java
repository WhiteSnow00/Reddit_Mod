// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import java.io.IOException;
import com.google.android.exoplayer2.n;
import ad.o;
import ac.p;
import wc.f;
import ac.u;
import ad.d0;
import ad.c0;
import va.h0;

public final class b implements h, h$a
{
    public final h f;
    public h$a g;
    public b.b$a[] h;
    public long i;
    public long j;
    public long k;
    public ClippingMediaSource.IllegalClippingException l;
    
    public b(final h f, final boolean b, final long j, final long k) {
        this.f = f;
        this.h = new b.b$a[0];
        long i;
        if (b) {
            i = j;
        }
        else {
            i = -9223372036854775807L;
        }
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final boolean a() {
        return this.f.a();
    }
    
    public final boolean b() {
        return this.i != -9223372036854775807L;
    }
    
    public final long c(final long n, h0 h0) {
        final long j = this.j;
        if (n == j) {
            return j;
        }
        final long i = c0.j(h0.a, 0L, n - j);
        final long b = h0.b;
        final long k = this.k;
        long n2;
        if (k == Long.MIN_VALUE) {
            n2 = Long.MAX_VALUE;
        }
        else {
            n2 = k - n;
        }
        final long l = c0.j(b, 0L, n2);
        if (i != h0.a || l != h0.b) {
            h0 = new h0(i, l);
        }
        return this.f.c(n, h0);
    }
    
    public final boolean d(final long n) {
        return this.f.d(n);
    }
    
    public final long e() {
        final long e = this.f.e();
        if (e != Long.MIN_VALUE) {
            final long k = this.k;
            if (k == Long.MIN_VALUE || e < k) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }
    
    public final void f(final long n) {
        this.f.f(n);
    }
    
    public final long g() {
        final long g = this.f.g();
        if (g != Long.MIN_VALUE) {
            final long k = this.k;
            if (k == Long.MIN_VALUE || g < k) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }
    
    public final void i(final q q) {
        final h h = (h)q;
        final h$a g = this.g;
        g.getClass();
        ((q.a<q>)g).i((q)this);
    }
    
    public final long j(long k) {
        this.i = -9223372036854775807L;
        final b.b$a[] h = this.h;
        final int length = h.length;
        final boolean b = false;
        for (final b.b$a b$a : h) {
            if (b$a != null) {
                b$a.g = false;
            }
        }
        final long j = this.f.j(k);
        boolean b2 = false;
        Label_0112: {
            if (j != k) {
                b2 = b;
                if (j < this.j) {
                    break Label_0112;
                }
                k = this.k;
                if (k != Long.MIN_VALUE) {
                    b2 = b;
                    if (j > k) {
                        break Label_0112;
                    }
                }
            }
            b2 = true;
        }
        d0.f(b2);
        return j;
    }
    
    public final void k(final h h) {
        if (this.l != null) {
            return;
        }
        final h$a g = this.g;
        g.getClass();
        g.k((h)this);
    }
    
    public final long n() {
        if (this.b()) {
            long i = this.i;
            this.i = -9223372036854775807L;
            final long n = this.n();
            if (n != -9223372036854775807L) {
                i = n;
            }
            return i;
        }
        final long n2 = this.f.n();
        if (n2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        final long j = this.j;
        final boolean b = true;
        d0.f(n2 >= j);
        final long k = this.k;
        boolean b2 = b;
        if (k != Long.MIN_VALUE) {
            b2 = (n2 <= k && b);
        }
        d0.f(b2);
        return n2;
    }
    
    public final u p() {
        return this.f.p();
    }
    
    public final void s(final h$a g, final long n) {
        this.g = g;
        this.f.s((h$a)this, n);
    }
    
    public final long t(final f[] array, final boolean[] array2, final p[] array3, final boolean[] array4, long k) {
        this.h = new b.b$a[array3.length];
        final p[] array5 = new p[array3.length];
        final int n = 0;
        int n2 = 0;
        while (true) {
            final int length = array3.length;
            p f = null;
            if (n2 >= length) {
                break;
            }
            final b.b$a[] h = this.h;
            final b.b$a b$a = (b.b$a)array3[n2];
            if ((h[n2] = b$a) != null) {
                f = b$a.f;
            }
            array5[n2] = f;
            ++n2;
        }
        final long t = this.f.t(array, array2, array5, array4, k);
        final boolean b = this.b();
        final boolean b2 = true;
        long m = 0L;
        Label_0213: {
            if (b) {
                final long j = this.j;
                if (k == j) {
                    boolean b3 = false;
                    Label_0196: {
                        if (j != 0L) {
                            for (final f f2 : array) {
                                if (f2 != null) {
                                    final n l = f2.l();
                                    if (!o.a(l.q, l.n)) {
                                        b3 = true;
                                        break Label_0196;
                                    }
                                }
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        m = t;
                        break Label_0213;
                    }
                }
            }
            m = -9223372036854775807L;
        }
        this.i = m;
        boolean b4 = b2;
        Label_0278: {
            if (t != k) {
                if (t >= this.j) {
                    k = this.k;
                    b4 = b2;
                    if (k == Long.MIN_VALUE) {
                        break Label_0278;
                    }
                    if (t <= k) {
                        b4 = b2;
                        break Label_0278;
                    }
                }
                b4 = false;
            }
        }
        d0.f(b4);
        for (int n3 = n; n3 < array3.length; ++n3) {
            final p p5 = array5[n3];
            if (p5 == null) {
                this.h[n3] = null;
            }
            else {
                final b.b$a[] h2 = this.h;
                final b.b$a b$a2 = h2[n3];
                if (b$a2 == null || b$a2.f != p5) {
                    h2[n3] = new b.b$a(this, p5);
                }
            }
            array3[n3] = (p)this.h[n3];
        }
        return t;
    }
    
    public final void v() throws IOException {
        final ClippingMediaSource.IllegalClippingException l = this.l;
        if (l == null) {
            this.f.v();
            return;
        }
        throw l;
    }
    
    public final void y(final long n, final boolean b) {
        this.f.y(n, b);
    }
}
