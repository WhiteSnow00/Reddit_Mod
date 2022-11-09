// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import com.google.android.exoplayer2.ParserException;
import ag0.a;
import android.util.Log;
import bd.d0;
import bd.s;
import db.j;
import bd.a0;
import bd.r;

public final class u implements e0
{
    public final k a;
    public final r b;
    public int c;
    public int d;
    public a0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    
    public u(final k a) {
        this.a = a;
        this.b = new r(new byte[10], 10);
        this.c = 0;
    }
    
    public final void a(final a0 e, final j j, final e0$d e0$d) {
        this.e = e;
        this.a.d(j, e0$d);
    }
    
    public final void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }
    
    public final void c(int j, final s s) throws ParserException {
        d0.g(this.e);
        final int n = -1;
        int n2 = 2;
        if ((j & 0x1) != 0x0) {
            final int c = this.c;
            if (c != 0 && c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        throw new IllegalStateException();
                    }
                    final int i = this.j;
                    if (i != -1) {
                        final StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.a.e();
                }
                else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int n3 = j;
        j = n;
        while (true) {
            final int c2 = s.c;
            final int b = s.b;
            final int n4 = c2 - b;
            if (n4 <= 0) {
                return;
            }
            final int c3 = this.c;
            if (c3 != 0) {
                if (c3 != 1) {
                    if (c3 != n2) {
                        if (c3 != 3) {
                            throw new IllegalStateException();
                        }
                        final int k = this.j;
                        int n5;
                        if (k == j) {
                            n5 = 0;
                        }
                        else {
                            n5 = n4 - k;
                        }
                        int n6 = n4;
                        if (n5 > 0) {
                            n6 = n4 - n5;
                            s.A(b + n6);
                        }
                        this.a.c(s);
                        final int l = this.j;
                        if (l != j && (this.j = l - n6) == 0) {
                            this.a.e();
                            this.c = 1;
                            this.d = 0;
                            continue;
                        }
                        continue;
                    }
                    else if (this.d(Math.min(10, this.i), s, this.b.a) && this.d(this.i, s, null)) {
                        this.b.k(0);
                        this.l = -9223372036854775807L;
                        final boolean f = this.f;
                        j = 4;
                        if (f) {
                            this.b.m(4);
                            final long n7 = this.b.g(3);
                            this.b.m(1);
                            final long n8 = this.b.g(15) << 15;
                            this.b.m(1);
                            final long n9 = this.b.g(15);
                            this.b.m(1);
                            if (!this.h && this.g) {
                                this.b.m(4);
                                final long n10 = this.b.g(3);
                                this.b.m(1);
                                final long n11 = this.b.g(15) << 15;
                                this.b.m(1);
                                final long n12 = this.b.g(15);
                                this.b.m(1);
                                this.e.b(n11 | n10 << 30 | n12);
                                this.h = true;
                            }
                            this.l = this.e.b(n7 << 30 | n8 | n9);
                        }
                        if (!this.k) {
                            j = 0;
                        }
                        n3 |= j;
                        this.a.f(n3, this.l);
                        this.c = 3;
                        this.d = 0;
                        j = -1;
                        n2 = 2;
                        continue;
                    }
                }
                else if (this.d(9, s, this.b.a)) {
                    this.b.k(0);
                    j = this.b.g(24);
                    boolean b2;
                    if (j != 1) {
                        ag0.a.u(41, "Unexpected start code prefix: ", j, "PesReader");
                        this.j = -1;
                        j = -1;
                        b2 = false;
                    }
                    else {
                        this.b.m(8);
                        j = this.b.g(16);
                        this.b.m(5);
                        this.k = this.b.f();
                        this.b.m(2);
                        this.f = this.b.f();
                        this.g = this.b.f();
                        this.b.m(6);
                        final int g = this.b.g(8);
                        this.i = g;
                        if (j == 0) {
                            this.j = -1;
                        }
                        else {
                            j = j + 6 - 9 - g;
                            if ((this.j = j) < 0) {
                                ag0.a.u(47, "Found negative packet payload size: ", j, "PesReader");
                                this.j = -1;
                            }
                        }
                        j = -1;
                        b2 = true;
                    }
                    int c4;
                    if (b2) {
                        c4 = 2;
                    }
                    else {
                        c4 = 0;
                    }
                    this.c = c4;
                    this.d = 0;
                    n2 = 2;
                    continue;
                }
                j = -1;
                n2 = 2;
            }
            else {
                s.C(n4);
            }
        }
    }
    
    public final boolean d(final int n, final s s, final byte[] array) {
        final int min = Math.min(s.c - s.b, n - this.d);
        boolean b = true;
        if (min <= 0) {
            return true;
        }
        if (array == null) {
            s.C(min);
        }
        else {
            s.b(this.d, min, array);
        }
        final int d = this.d + min;
        this.d = d;
        if (d != n) {
            b = false;
        }
        return b;
    }
}
