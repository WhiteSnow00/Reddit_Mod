// 
// Decompiled by Procyon v0.6.0
// 

package lb;

import db.v;
import db.u$a;
import java.io.EOFException;
import java.io.IOException;
import bd.c0;
import db.u;
import ah0.b;

public final class a implements f
{
    public final e a;
    public final long b;
    public final long c;
    public final h d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    
    public a(final h d, final long b, final long c, final long n, final long f, final boolean b2) {
        ah0.b.C(b >= 0L && c > b);
        this.d = d;
        this.b = b;
        this.c = c;
        if (n != c - b && !b2) {
            this.e = 0;
        }
        else {
            this.f = f;
            this.e = 4;
        }
        this.a = new e();
    }
    
    public final u a() {
        Object o;
        if (this.f != 0L) {
            o = new a();
        }
        else {
            o = null;
        }
        return (u)o;
    }
    
    public final void b(final long n) {
        this.h = c0.j(n, 0L, this.f - 1L);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
    
    public final long c(final db.e e) throws IOException {
        final int e2 = this.e;
        if (e2 != 0) {
            if (e2 != 1) {
                if (e2 != 2) {
                    if (e2 != 3) {
                        if (e2 == 4) {
                            return -1L;
                        }
                        throw new IllegalStateException();
                    }
                }
                else {
                    final long i = this.i;
                    final long j = this.j;
                    long n = 0L;
                    Label_0331: {
                        if (i != j) {
                            final long d = e.d;
                            if (!this.a.b(e, j)) {
                                n = this.i;
                                if (n != d) {
                                    break Label_0331;
                                }
                                throw new IOException("No ogg page can be found.");
                            }
                            else {
                                this.a.a(e, false);
                                e.f = 0;
                                final long h = this.h;
                                final e a = this.a;
                                final long b = a.b;
                                final long n2 = h - b;
                                final int n3 = a.d + a.e;
                                if (0L > n2 || n2 >= 72000L) {
                                    final long n4 = lcmp(n2, 0L);
                                    if (n4 < 0) {
                                        this.j = d;
                                        this.l = b;
                                    }
                                    else {
                                        this.i = e.d + n3;
                                        this.k = b;
                                    }
                                    final long k = this.j;
                                    final long l = this.i;
                                    if (k - l < 100000L) {
                                        this.j = l;
                                        n = l;
                                        break Label_0331;
                                    }
                                    final long n5 = n3;
                                    long n6;
                                    if (n4 <= 0) {
                                        n6 = 2L;
                                    }
                                    else {
                                        n6 = 1L;
                                    }
                                    n = c0.j((k - l) * n2 / (this.l - this.k) + (e.d - n5 * n6), l, k - 1L);
                                    break Label_0331;
                                }
                            }
                        }
                        n = -1L;
                    }
                    if (n != -1L) {
                        return n;
                    }
                    this.e = 3;
                }
                while (true) {
                    this.a.b(e, -1L);
                    this.a.a(e, false);
                    final e a2 = this.a;
                    if (a2.b > this.h) {
                        break;
                    }
                    e.n(a2.d + a2.e);
                    this.i = e.d;
                    this.k = this.a.b;
                }
                e.f = 0;
                this.e = 4;
                return -(this.k + 2L);
            }
        }
        else {
            final long d2 = e.d;
            this.g = d2;
            this.e = 1;
            final long n7 = this.c - 65307L;
            if (n7 > d2) {
                return n7;
            }
        }
        final e a3 = this.a;
        a3.a = 0;
        a3.b = 0L;
        a3.c = 0;
        a3.d = 0;
        a3.e = 0;
        if (a3.b(e, -1L)) {
            this.a.a(e, false);
            final e a4 = this.a;
            e.n(a4.d + a4.e);
            long f = this.a.b;
            while (true) {
                final e a5 = this.a;
                if ((a5.a & 0x4) == 0x4 || !a5.b(e, -1L) || e.d >= this.c || !this.a.a(e, true)) {
                    break;
                }
                final e a6 = this.a;
                final int d3 = a6.d;
                final int e3 = a6.e;
                boolean b2;
                try {
                    e.n(d3 + e3);
                    b2 = true;
                }
                catch (final EOFException ex) {
                    b2 = false;
                }
                if (!b2) {
                    break;
                }
                f = this.a.b;
            }
            this.f = f;
            this.e = 4;
            return this.g;
        }
        throw new EOFException();
    }
    
    public final class a implements u
    {
        public final lb.a a;
        
        public a(final lb.a a) {
            this.a = a;
        }
        
        public final u$a d(final long n) {
            final lb.a a = this.a;
            final long n2 = a.d.i * n / 1000000L;
            final long b = a.b;
            final long c = a.c;
            final v v = new v(n, c0.j((c - b) * n2 / a.f + b - 30000L, b, c - 1L));
            return new u$a(v, v);
        }
        
        public final boolean e() {
            return true;
        }
        
        public final long i() {
            final lb.a a = this.a;
            return a.f * 1000000L / a.d.i;
        }
    }
}
