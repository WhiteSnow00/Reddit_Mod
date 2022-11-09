// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.u$b;
import db.u;
import android.util.Log;
import bd.d0;
import db.t;
import java.io.IOException;
import db.e;
import db.i;
import a40.f;
import db.j;
import bd.s;
import android.util.SparseArray;
import bd.a0;
import db.h;

public final class x implements h
{
    public final a0 a;
    public final SparseArray<x.x$a> b;
    public final s c;
    public final w d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public v i;
    public j j;
    public boolean k;
    
    static {
        new(a40.f.class)();
    }
    
    public x() {
        final a0 a = new a0(0L);
        this.a = a;
        this.c = new s(4096);
        this.b = (SparseArray<x.x$a>)new SparseArray();
        this.d = new w();
    }
    
    public final void a(long n, final long n2) {
        final a0 a = this.a;
        synchronized (a) {
            n = a.b;
            monitorexit(a);
            final int n3 = 1;
            int n4;
            if ((n4 = ((n == -9223372036854775807L) ? 1 : 0)) == 0) {
                n = this.a.c();
                int n5;
                if (n != -9223372036854775807L && n != 0L && n != n2) {
                    n5 = n3;
                }
                else {
                    n5 = 0;
                }
                n4 = n5;
            }
            if (n4 != 0) {
                this.a.d(n2);
            }
            final v i = this.i;
            if (i != null) {
                i.c(n2);
            }
            for (int j = 0; j < this.b.size(); ++j) {
                final x.x$a x$a = (x.x$a)this.b.valueAt(j);
                x$a.f = false;
                x$a.a.b();
            }
        }
    }
    
    public final boolean c(final i i) throws IOException {
        final byte[] array = new byte[14];
        final e e = (e)i;
        boolean b = false;
        e.h(array, 0, 14, false);
        if (0x1BA != ((array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF))) {
            return false;
        }
        if ((array[4] & 0xC4) != 0x44) {
            return false;
        }
        if ((array[6] & 0x4) != 0x4) {
            return false;
        }
        if ((array[8] & 0x4) != 0x4) {
            return false;
        }
        if ((array[9] & 0x1) != 0x1) {
            return false;
        }
        if ((array[12] & 0x3) != 0x3) {
            return false;
        }
        e.j(array[13] & 0x7, false);
        e.h(array, 0, 3, false);
        if (0x1 == ((array[0] & 0xFF) << 16 | (array[1] & 0xFF) << 8 | (array[2] & 0xFF))) {
            b = true;
        }
        return b;
    }
    
    public final void f(final j j) {
        this.j = j;
    }
    
    public final int h(final i i, final t t) throws IOException {
        d0.g(this.j);
        final e e = (e)i;
        final long c = e.c;
        final long n = lcmp(c, -1L);
        final int n2 = 1;
        final int n3 = 0;
        final boolean b = n != 0;
        final long n4 = -9223372036854775807L;
        if (b) {
            final w d = this.d;
            if (!d.c) {
                if (!d.e) {
                    final int n5 = (int)Math.min(20000L, c);
                    final long a = c - n5;
                    if (e.d != a) {
                        t.a = a;
                        return n2;
                    }
                    d.b.y(n5);
                    e.f = 0;
                    e.h(d.b.a, 0, n5, false);
                    final s b2 = d.b;
                    final int b3 = b2.b;
                    int n7 = b2.c - 4;
                    long c2;
                    while (true) {
                        c2 = n4;
                        if (n7 < b3) {
                            break;
                        }
                        if (w.b(n7, b2.a) == 442) {
                            b2.B(n7 + 4);
                            c2 = w.c(b2);
                            if (c2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        --n7;
                    }
                    d.g = c2;
                    d.e = true;
                }
                else {
                    if (d.g == -9223372036854775807L) {
                        d.a(e);
                        return n3;
                    }
                    if (!d.d) {
                        final int n8 = (int)Math.min(20000L, c);
                        final long d2 = e.d;
                        final long a2 = 0;
                        if (d2 != a2) {
                            t.a = a2;
                            return n2;
                        }
                        d.b.y(n8);
                        e.f = 0;
                        e.h(d.b.a, 0, n8, false);
                        final s b4 = d.b;
                        int b5 = b4.b;
                        final int c3 = b4.c;
                        long c4;
                        while (true) {
                            c4 = n4;
                            if (b5 >= c3 - 3) {
                                break;
                            }
                            if (w.b(b5, b4.a) == 442) {
                                b4.B(b5 + 4);
                                c4 = w.c(b4);
                                if (c4 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            ++b5;
                        }
                        d.f = c4;
                        d.d = true;
                    }
                    else {
                        final long f = d.f;
                        if (f == -9223372036854775807L) {
                            d.a(e);
                            return n3;
                        }
                        final long h = d.a.b(d.g) - d.a.b(f);
                        d.h = h;
                        if (h < 0L) {
                            final StringBuilder sb = new StringBuilder(65);
                            sb.append("Invalid duration: ");
                            sb.append(h);
                            sb.append(". Using TIME_UNSET instead.");
                            Log.w("PsDurationReader", sb.toString());
                            d.h = -9223372036854775807L;
                        }
                        d.a(e);
                        return n3;
                    }
                }
                return 0;
            }
        }
        if (!this.k) {
            this.k = true;
            final w d3 = this.d;
            final long h2 = d3.h;
            if (h2 != -9223372036854775807L) {
                final v j = new v(d3.a, h2, c);
                this.i = j;
                this.j.s((u)j.a);
            }
            else {
                this.j.s((u)new u$b(h2));
            }
        }
        final v k = this.i;
        if (k != null && k.c != null) {
            return k.a(e, t);
        }
        e.f = 0;
        long n9;
        if (n != 0) {
            n9 = c - e.k();
        }
        else {
            n9 = -1L;
        }
        if (n9 != -1L && n9 < 4L) {
            return -1;
        }
        if (!e.h(this.c.a, 0, 4, true)) {
            return -1;
        }
        this.c.B(0);
        final int c5 = this.c.c();
        if (c5 == 441) {
            return -1;
        }
        if (c5 == 442) {
            e.h(this.c.a, 0, 10, false);
            this.c.B(9);
            e.n((this.c.r() & 0x7) + 14);
            return 0;
        }
        if (c5 == 443) {
            e.h(this.c.a, 0, 2, false);
            this.c.B(0);
            e.n(this.c.w() + 6);
            return 0;
        }
        if ((c5 & 0xFFFFFF00) >> 8 != 1) {
            e.n(1);
            return 0;
        }
        final int n10 = c5 & 0xFF;
        x.x$a x$a2;
        final x.x$a x$a = x$a2 = (x.x$a)this.b.get(n10);
        if (!this.e) {
            x.x$a x$a3;
            if ((x$a3 = x$a) == null) {
                k l = null;
                Label_1050: {
                    Object o;
                    if (n10 == 189) {
                        o = new b(null);
                        this.f = true;
                        this.h = e.d;
                    }
                    else if ((n10 & 0xE0) == 0xC0) {
                        o = new r(null);
                        this.f = true;
                        this.h = e.d;
                    }
                    else {
                        if ((n10 & 0xF0) != 0xE0) {
                            break Label_1050;
                        }
                        o = new l(null);
                        this.g = true;
                        this.h = e.d;
                    }
                    l = (k)o;
                }
                x$a3 = x$a;
                if (l != null) {
                    l.d(this.j, new e0$d(n10, 256));
                    x$a3 = new x.x$a(l, this.a);
                    this.b.put(n10, (Object)x$a3);
                }
            }
            long n11;
            if (this.f && this.g) {
                n11 = this.h + 8192L;
            }
            else {
                n11 = 1048576L;
            }
            x$a2 = x$a3;
            if (e.d > n11) {
                this.e = true;
                this.j.b();
                x$a2 = x$a3;
            }
        }
        e.h(this.c.a, 0, 2, false);
        this.c.B(0);
        final int n12 = this.c.w() + 6;
        if (x$a2 == null) {
            e.n(n12);
        }
        else {
            this.c.y(n12);
            e.f(this.c.a, 0, n12, false);
            this.c.B(6);
            final s c6 = this.c;
            c6.b(0, 3, x$a2.c.a);
            x$a2.c.k(0);
            x$a2.c.m(8);
            x$a2.d = x$a2.c.f();
            x$a2.e = x$a2.c.f();
            x$a2.c.m(6);
            c6.b(0, x$a2.c.g(8), x$a2.c.a);
            x$a2.c.k(0);
            x$a2.g = 0L;
            if (x$a2.d) {
                x$a2.c.m(4);
                final long n13 = x$a2.c.g(3);
                x$a2.c.m(1);
                final long n14 = x$a2.c.g(15) << 15;
                x$a2.c.m(1);
                final long n15 = x$a2.c.g(15);
                x$a2.c.m(1);
                if (!x$a2.f && x$a2.e) {
                    x$a2.c.m(4);
                    final long n16 = x$a2.c.g(3);
                    x$a2.c.m(1);
                    final long n17 = x$a2.c.g(15) << 15;
                    x$a2.c.m(1);
                    final long n18 = x$a2.c.g(15);
                    x$a2.c.m(1);
                    x$a2.b.b(n18 | (n16 << 30 | n17));
                    x$a2.f = true;
                }
                x$a2.g = x$a2.b.b(n13 << 30 | n14 | n15);
            }
            x$a2.a.f(4, x$a2.g);
            x$a2.a.c(c6);
            x$a2.a.e();
            final s c7 = this.c;
            c7.A(c7.a.length);
        }
        return 0;
    }
    
    public final void release() {
    }
}
