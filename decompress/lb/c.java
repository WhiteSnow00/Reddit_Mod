// 
// Decompiled by Procyon v0.6.0
// 

package lb;

import db.u;
import db.w;
import java.util.Arrays;
import db.w$a;
import bd.d0;
import db.t;
import java.io.IOException;
import com.google.android.exoplayer2.ParserException;
import db.z;
import bd.s;
import bd.c0;
import ak0.n;
import db.j;
import db.h;

public final class c implements h
{
    public j a;
    public lb.h b;
    public boolean c;
    
    static {
        new(ak0.n.class)();
    }
    
    public final void a(long e, final long n) {
        final lb.h b = this.b;
        if (b != null) {
            final d a = b.a;
            final e a2 = a.a;
            a2.a = 0;
            a2.b = 0L;
            a2.c = 0;
            a2.d = 0;
            a2.e = 0;
            a.b.y(0);
            a.c = -1;
            a.e = false;
            if (e == 0L) {
                b.d(b.l ^ true);
            }
            else if (b.h != 0) {
                e = b.i * n / 1000000L;
                b.e = e;
                final f d = b.d;
                final int a3 = c0.a;
                d.b(e);
                b.h = 2;
            }
        }
    }
    
    public final boolean b(final db.e e) throws IOException {
        final e e2 = new e();
        if (e2.a(e, true)) {
            if ((e2.a & 0x2) == 0x2) {
                final int min = Math.min(e2.e, 8);
                final s s = new s(min);
                e.h(s.a, 0, min, false);
                s.B(0);
                if (s.c - s.b >= 5 && s.r() == 127 && s.s() == 1179402563L) {
                    this.b = new b();
                }
                else {
                    s.B(0);
                    boolean c;
                    try {
                        c = z.c(1, s, true);
                    }
                    catch (final ParserException ex) {
                        c = false;
                    }
                    if (c) {
                        this.b = new i();
                    }
                    else {
                        s.B(0);
                        if (!g.e(s, g.n)) {
                            return false;
                        }
                        this.b = new g();
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public final boolean c(final db.i i) throws IOException {
        try {
            return this.b((db.e)i);
        }
        catch (final ParserException ex) {
            return false;
        }
    }
    
    public final void f(final j a) {
        this.a = a;
    }
    
    public final int h(final db.i i, final t t) throws IOException {
        d0.g(this.a);
        if (this.b == null) {
            final db.e e = (db.e)i;
            if (!this.b(e)) {
                throw ParserException.createForMalformedContainer("Failed to determine bitstream type", (Throwable)null);
            }
            e.f = 0;
        }
        if (!this.c) {
            final w k = this.a.k(0, 1);
            this.a.b();
            final lb.h b = this.b;
            b.c = this.a;
            b.b = k;
            b.d(true);
            this.c = true;
        }
        final lb.h b2 = this.b;
        d0.g(b2.b);
        final int a = c0.a;
        final int h = b2.h;
        if (h != 0) {
            if (h == 1) {
                ((db.e)i).n((int)b2.f);
                b2.h = 2;
                return 0;
            }
            if (h != 2) {
                if (h != 3) {
                    throw new IllegalStateException();
                }
            }
            else {
                final f d = b2.d;
                final db.e e2 = (db.e)i;
                final long c = d.c(e2);
                if (c >= 0L) {
                    t.a = c;
                    return 1;
                }
                if (c < -1L) {
                    b2.a(-(c + 2L));
                }
                if (!b2.l) {
                    final u a2 = b2.d.a();
                    d0.g(a2);
                    b2.c.s(a2);
                    b2.l = true;
                }
                if (b2.k > 0L || b2.a.a(e2)) {
                    b2.k = 0L;
                    final s b3 = b2.a.b;
                    final long b4 = b2.b(b3);
                    if (b4 >= 0L) {
                        final long g = b2.g;
                        if (g + b4 >= b2.e) {
                            final long n2 = g * 1000000L / b2.i;
                            b2.b.c(b3.c, b3);
                            b2.b.b(n2, 1, b3.c, 0, (w$a)null);
                            b2.e = -1L;
                        }
                    }
                    b2.g += b4;
                    return 0;
                }
                b2.h = 3;
            }
        }
        else {
            db.e e3;
            boolean b5;
            while (true) {
                final d a3 = b2.a;
                e3 = (db.e)i;
                if (!a3.a(e3)) {
                    b2.h = 3;
                    b5 = false;
                    break;
                }
                final long d2 = e3.d;
                final long f = b2.f;
                b2.k = d2 - f;
                if (!b2.c(b2.a.b, f, b2.j)) {
                    b5 = true;
                    break;
                }
                b2.f = e3.d;
            }
            if (b5) {
                final com.google.android.exoplayer2.n a4 = b2.j.a;
                b2.i = a4.E;
                if (!b2.m) {
                    b2.b.a(a4);
                    b2.m = true;
                }
                final b.a b6 = b2.j.b;
                if (b6 != null) {
                    b2.d = b6;
                }
                else {
                    final long c2 = e3.c;
                    if (c2 == -1L) {
                        b2.d = new lb.h.b();
                    }
                    else {
                        final e a5 = b2.a.a;
                        b2.d = new a(b2, b2.f, c2, a5.d + a5.e, a5.b, (a5.a & 0x4) != 0x0);
                    }
                }
                b2.h = 2;
                final d a6 = b2.a;
                final s b7 = a6.b;
                final byte[] a7 = b7.a;
                if (a7.length == 65025) {
                    return 0;
                }
                b7.z(a6.b.c, Arrays.copyOf(a7, Math.max(65025, b7.c)));
                return 0;
            }
        }
        return -1;
        n = 0;
        return n;
    }
    
    public final void release() {
    }
}
