// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import sg2.e;
import ej2.c0;
import al0.g7;
import al0.b;
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
            final StringBuilder i = al0.b.i("start (", f, ") offset is outside of text region ");
            i.append(a.length());
            throw new IndexOutOfBoundsException(i.toString());
        }
        if (e < 0 || e > a.length()) {
            final StringBuilder j = al0.b.i("end (", e, ") offset is outside of text region ");
            j.append(a.length());
            throw new IndexOutOfBoundsException(j.toString());
        }
        if (f <= e) {
            return;
        }
        throw new IllegalArgumentException(g7.f("Do not set reversed range: ", f, " > ", e));
    }
    
    public final void a(int n, int d) {
        final long i = wd.a.i(n, d);
        this.a.b(n, d, "");
        final long v4 = c0.v4(wd.a.i(this.b, this.c), i);
        this.b = o.f(v4);
        this.c = o.e(v4);
        d = this.d;
        if (d != -1) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            final long v5 = c0.v4(wd.a.i(d, this.e), i);
            if (o.b(v5)) {
                this.d = -1;
                this.e = -1;
            }
            else {
                this.d = o.f(v5);
                this.e = o.e(v5);
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
        sg2.e.f((Object)s, "text");
        if (n < 0 || n > this.a.a()) {
            final StringBuilder i = al0.b.i("start (", n, ") offset is outside of text region ");
            i.append(this.a.a());
            throw new IndexOutOfBoundsException(i.toString());
        }
        if (n2 < 0 || n2 > this.a.a()) {
            final StringBuilder j = al0.b.i("end (", n2, ") offset is outside of text region ");
            j.append(this.a.a());
            throw new IndexOutOfBoundsException(j.toString());
        }
        if (n <= n2) {
            this.a.b(n, n2, s);
            this.b = s.length() + n;
            this.c = s.length() + n;
            this.d = -1;
            this.e = -1;
            return;
        }
        throw new IllegalArgumentException(g7.f("Do not set reversed range: ", n, " > ", n2));
    }
    
    public final void e(final int d, final int e) {
        if (d < 0 || d > this.a.a()) {
            final StringBuilder i = al0.b.i("start (", d, ") offset is outside of text region ");
            i.append(this.a.a());
            throw new IndexOutOfBoundsException(i.toString());
        }
        if (e < 0 || e > this.a.a()) {
            final StringBuilder j = al0.b.i("end (", e, ") offset is outside of text region ");
            j.append(this.a.a());
            throw new IndexOutOfBoundsException(j.toString());
        }
        if (d < e) {
            this.d = d;
            this.e = e;
            return;
        }
        throw new IllegalArgumentException(g7.f("Do not set reversed or empty range: ", d, " > ", e));
    }
    
    public final void f(final int b, final int c) {
        if (b < 0 || b > this.a.a()) {
            final StringBuilder i = b.i("start (", b, ") offset is outside of text region ");
            i.append(this.a.a());
            throw new IndexOutOfBoundsException(i.toString());
        }
        if (c < 0 || c > this.a.a()) {
            final StringBuilder j = b.i("end (", c, ") offset is outside of text region ");
            j.append(this.a.a());
            throw new IndexOutOfBoundsException(j.toString());
        }
        if (b <= c) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new IllegalArgumentException(g7.f("Do not set reversed range: ", b, " > ", c));
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
