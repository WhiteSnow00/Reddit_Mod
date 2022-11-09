// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import mj2.c0;
import eg.n0;
import i2.o;
import i2.a;

public final class f
{
    public final n a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    public f(final a a, final long n) {
        this.a = new n(a.f);
        this.b = o.f(n);
        this.c = o.e(n);
        this.d = -1;
        this.e = -1;
        final int f = o.f(n);
        final int e = o.e(n);
        if (f < 0 || f > a.length()) {
            final StringBuilder p2 = d.p("start (", f, ") offset is outside of text region ");
            p2.append(a.length());
            throw new IndexOutOfBoundsException(p2.toString());
        }
        if (e < 0 || e > a.length()) {
            final StringBuilder p3 = d.p("end (", e, ") offset is outside of text region ");
            p3.append(a.length());
            throw new IndexOutOfBoundsException(p3.toString());
        }
        if (f <= e) {
            return;
        }
        throw new IllegalArgumentException(ag0.a.m("Do not set reversed range: ", f, " > ", e));
    }
    
    public final void a(int n, int d) {
        final long j = n0.j(n, d);
        this.a.b(n, d, "");
        final long m0 = c0.m0(n0.j(this.b, this.c), j);
        this.b = o.f(m0);
        this.c = o.e(m0);
        d = this.d;
        if (d != -1) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            final long m2 = c0.m0(n0.j(d, this.e), j);
            if (o.b(m2)) {
                this.d = -1;
                this.e = -1;
            }
            else {
                this.d = o.f(m2);
                this.e = o.e(m2);
            }
        }
    }
    
    public final char b(int n) {
        final n a = this.a;
        final h b = a.b;
        char c;
        if (b == null) {
            n = (c = a.a.charAt(n));
        }
        else {
            final int c2 = a.c;
            if (n < c2) {
                n = (c = a.a.charAt(n));
            }
            else {
                final int a2 = b.a;
                final int d = b.d;
                final int c3 = b.c;
                final int n2 = a2 - (d - c3);
                if (n < n2 + c2) {
                    n -= c2;
                    if (n < c3) {
                        n = (c = b.b[n]);
                    }
                    else {
                        n = (c = b.b[n - c3 + d]);
                    }
                }
                else {
                    n = (c = a.a.charAt(n - (n2 - a.d + c2)));
                }
            }
        }
        return c;
    }
    
    public final int c() {
        return this.a.a();
    }
    
    public final void d(final int n, final int n2, final String s) {
        ah2.f.f((Object)s, "text");
        if (n < 0 || n > this.a.a()) {
            final StringBuilder p3 = d.p("start (", n, ") offset is outside of text region ");
            p3.append(this.a.a());
            throw new IndexOutOfBoundsException(p3.toString());
        }
        if (n2 < 0 || n2 > this.a.a()) {
            final StringBuilder p4 = d.p("end (", n2, ") offset is outside of text region ");
            p4.append(this.a.a());
            throw new IndexOutOfBoundsException(p4.toString());
        }
        if (n <= n2) {
            this.a.b(n, n2, s);
            this.b = s.length() + n;
            this.c = s.length() + n;
            this.d = -1;
            this.e = -1;
            return;
        }
        throw new IllegalArgumentException(ag0.a.m("Do not set reversed range: ", n, " > ", n2));
    }
    
    public final void e(final int d, final int e) {
        if (d < 0 || d > this.a.a()) {
            final StringBuilder p2 = d.p("start (", d, ") offset is outside of text region ");
            p2.append(this.a.a());
            throw new IndexOutOfBoundsException(p2.toString());
        }
        if (e < 0 || e > this.a.a()) {
            final StringBuilder p3 = d.p("end (", e, ") offset is outside of text region ");
            p3.append(this.a.a());
            throw new IndexOutOfBoundsException(p3.toString());
        }
        if (d < e) {
            this.d = d;
            this.e = e;
            return;
        }
        throw new IllegalArgumentException(ag0.a.m("Do not set reversed or empty range: ", d, " > ", e));
    }
    
    public final void f(final int b, final int c) {
        if (b < 0 || b > this.a.a()) {
            final StringBuilder p2 = d.p("start (", b, ") offset is outside of text region ");
            p2.append(this.a.a());
            throw new IndexOutOfBoundsException(p2.toString());
        }
        if (c < 0 || c > this.a.a()) {
            final StringBuilder p3 = d.p("end (", c, ") offset is outside of text region ");
            p3.append(this.a.a());
            throw new IndexOutOfBoundsException(p3.toString());
        }
        if (b <= c) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new IllegalArgumentException(ag0.a.m("Do not set reversed range: ", b, " > ", c));
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
