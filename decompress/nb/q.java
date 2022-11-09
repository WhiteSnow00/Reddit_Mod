// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import ya.a$a;
import db.w$a;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import ya.a;
import com.google.android.exoplayer2.ParserException;
import bd.d0;
import com.google.android.exoplayer2.n;
import db.w;
import bd.r;
import bd.s;

public final class q implements k
{
    public final String a;
    public final s b;
    public final r c;
    public w d;
    public String e;
    public n f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;
    
    public q(final String a) {
        this.a = a;
        final s b = new s(1024);
        this.b = b;
        final byte[] a2 = b.a;
        this.c = new r(a2, a2.length);
        this.k = -9223372036854775807L;
    }
    
    public final void b() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }
    
    public final void c(final s s) throws ParserException {
        d0.g(this.d);
        while (true) {
            final int n = s.c - s.b;
            if (n <= 0) {
                return;
            }
            final int g = this.g;
            if (g != 0) {
                if (g != 1) {
                    if (g != 2) {
                        if (g != 3) {
                            throw new IllegalStateException();
                        }
                        final int min = Math.min(n, this.i - this.h);
                        s.b(this.h, min, this.c.a);
                        if ((this.h += min) != this.i) {
                            continue;
                        }
                        this.c.k(0);
                        final r c = this.c;
                        Label_0908: {
                            if (!c.f()) {
                                this.l = true;
                                final int g2 = c.g(1);
                                int g3;
                                if (g2 == 1) {
                                    g3 = c.g(1);
                                }
                                else {
                                    g3 = 0;
                                }
                                this.m = g3;
                                if (g3 != 0) {
                                    throw ParserException.createForMalformedContainer((String)null, (Throwable)null);
                                }
                                if (g2 == 1) {
                                    c.g((c.g(2) + 1) * 8);
                                }
                                if (!c.f()) {
                                    throw ParserException.createForMalformedContainer((String)null, (Throwable)null);
                                }
                                this.n = c.g(6);
                                final int g4 = c.g(4);
                                final int g5 = c.g(3);
                                if (g4 != 0 || g5 != 0) {
                                    throw ParserException.createForMalformedContainer((String)null, (Throwable)null);
                                }
                                if (g2 == 0) {
                                    final int e = c.e();
                                    final int b = c.b();
                                    final a$a d = ya.a.d(c, true);
                                    this.u = d.c;
                                    this.r = d.a;
                                    this.t = d.b;
                                    final int n2 = b - c.b();
                                    c.k(e);
                                    final byte[] array = new byte[(n2 + 7) / 8];
                                    c.h(n2, array);
                                    final n$a n$a = new n$a();
                                    n$a.a = this.e;
                                    n$a.k = "audio/mp4a-latm";
                                    n$a.h = this.u;
                                    n$a.x = this.t;
                                    n$a.y = this.r;
                                    n$a.m = Collections.singletonList(array);
                                    n$a.c = this.a;
                                    final n f = new n(n$a);
                                    if (!f.equals((Object)this.f)) {
                                        this.f = f;
                                        this.s = 1024000000L / f.E;
                                        this.d.a(f);
                                    }
                                }
                                else {
                                    final int n3 = c.g((c.g(2) + 1) * 8);
                                    final int b2 = c.b();
                                    final a$a d2 = ya.a.d(c, true);
                                    this.u = d2.c;
                                    this.r = d2.a;
                                    this.t = d2.b;
                                    c.m(n3 - (b2 - c.b()));
                                }
                                final int g6 = c.g(3);
                                if ((this.o = g6) != 0) {
                                    if (g6 != 1) {
                                        if (g6 != 3 && g6 != 4 && g6 != 5) {
                                            if (g6 != 6 && g6 != 7) {
                                                throw new IllegalStateException();
                                            }
                                            c.m(1);
                                        }
                                        else {
                                            c.m(6);
                                        }
                                    }
                                    else {
                                        c.m(9);
                                    }
                                }
                                else {
                                    c.m(8);
                                }
                                final boolean f2 = c.f();
                                this.p = f2;
                                this.q = 0L;
                                if (f2) {
                                    if (g2 == 1) {
                                        this.q = c.g((c.g(2) + 1) * 8);
                                    }
                                    else {
                                        boolean f3;
                                        do {
                                            f3 = c.f();
                                            this.q = (this.q << 8) + c.g(8);
                                        } while (f3);
                                    }
                                }
                                if (c.f()) {
                                    c.m(8);
                                }
                            }
                            else if (!this.l) {
                                break Label_0908;
                            }
                            if (this.m != 0) {
                                throw ParserException.createForMalformedContainer((String)null, (Throwable)null);
                            }
                            if (this.n != 0) {
                                throw ParserException.createForMalformedContainer((String)null, (Throwable)null);
                            }
                            if (this.o != 0) {
                                throw ParserException.createForMalformedContainer((String)null, (Throwable)null);
                            }
                            int n4 = 0;
                            int g7;
                            do {
                                g7 = c.g(8);
                                n4 += g7;
                            } while (g7 == 255);
                            final int e2 = c.e();
                            if ((e2 & 0x7) == 0x0) {
                                this.b.B(e2 >> 3);
                            }
                            else {
                                c.h(n4 * 8, this.b.a);
                                this.b.B(0);
                            }
                            this.d.c(n4, this.b);
                            final long k = this.k;
                            if (k != -9223372036854775807L) {
                                this.d.b(k, 1, n4, 0, (w$a)null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                c.m((int)this.q);
                            }
                        }
                        this.g = 0;
                    }
                    else {
                        final int i = (this.j & 0xFFFFFF1F) << 8 | s.r();
                        this.i = i;
                        final s b3 = this.b;
                        if (i > b3.a.length) {
                            b3.y(i);
                            final r c2 = this.c;
                            final byte[] a = this.b.a;
                            c2.getClass();
                            c2.j(a.length, a);
                        }
                        this.h = 0;
                        this.g = 3;
                    }
                }
                else {
                    final int r = s.r();
                    if ((r & 0xE0) == 0xE0) {
                        this.j = r;
                        this.g = 2;
                    }
                    else {
                        if (r == 86) {
                            continue;
                        }
                        this.g = 0;
                    }
                }
            }
            else {
                if (s.r() != 86) {
                    continue;
                }
                this.g = 1;
            }
        }
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        this.d = j.k(e0$d.d, 1);
        e0$d.b();
        this.e = e0$d.e;
    }
    
    public final void e() {
    }
    
    public final void f(final int n, final long k) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
}
