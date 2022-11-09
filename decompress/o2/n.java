// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import qg2.j;
import eg.n0;
import ah2.f;

public final class n
{
    public String a;
    public h b;
    public int c;
    public int d;
    
    public n(final String a) {
        f.f((Object)a, "text");
        this.a = a;
        this.c = -1;
        this.d = -1;
    }
    
    public final int a() {
        final h b = this.b;
        if (b == null) {
            return this.a.length();
        }
        return b.a - (b.d - b.c) + (this.a.length() - (this.d - this.c));
    }
    
    public final void b(int a, int n, final String s) {
        f.f((Object)s, "text");
        final h b = this.b;
        if (b == null) {
            final int max = Math.max(255, s.length() + 128);
            final char[] array = new char[max];
            final int min = Math.min(a, 64);
            final int min2 = Math.min(this.a.length() - n, 64);
            final String a2 = this.a;
            final int c = a - min;
            n0.L0(a2, array, 0, c, a);
            final String a3 = this.a;
            a = max - min2;
            final int d = min2 + n;
            n0.L0(a3, array, a, n, d);
            n0.L0(s, array, min, 0, s.length());
            this.b = new h(array, s.length() + min, a);
            this.c = c;
            this.d = d;
            return;
        }
        final int c2 = this.c;
        final int n2 = a - c2;
        final int n3 = n - c2;
        if (n2 >= 0 && n3 <= b.a - (b.d - b.c)) {
            final int n4 = s.length() - (n3 - n2);
            n = b.d - b.c;
            if (n4 > n) {
                a = b.a;
                do {
                    a *= 2;
                } while (a - b.a < n4 - n);
                final char[] b2 = new char[a];
                j.i1(b.b, b2, 0, 0, b.c);
                final int a4 = b.a;
                n = b.d;
                final int n5 = a4 - n;
                final int d2 = a - n5;
                j.i1(b.b, b2, d2, n, n5 + n);
                b.b = b2;
                b.a = a;
                b.d = d2;
            }
            a = b.c;
            if (n2 < a && n3 <= a) {
                n = a - n3;
                final char[] b3 = b.b;
                j.i1(b3, b3, b.d - n, n3, a);
                b.c = n2;
                b.d -= n;
            }
            else if (n2 < a && n3 >= a) {
                b.d = b.d - a + n3;
                b.c = n2;
            }
            else {
                n = b.d;
                final int n6 = n - a;
                final int n7 = n2 + n6;
                final char[] b4 = b.b;
                j.i1(b4, b4, a, n, n7);
                b.c += n7 - n;
                b.d = n6 + n3;
            }
            n0.L0(s, b.b, b.c, 0, s.length());
            a = b.c;
            b.c = s.length() + a;
            return;
        }
        this.a = this.toString();
        this.b = null;
        this.c = -1;
        this.d = -1;
        this.b(a, n, s);
    }
    
    @Override
    public final String toString() {
        final h b = this.b;
        if (b == null) {
            return this.a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a, 0, this.c);
        sb.append(b.b, 0, b.c);
        final char[] b2 = b.b;
        final int d = b.d;
        sb.append(b2, d, b.a - d);
        final String a = this.a;
        sb.append(a, this.d, a.length());
        final String string = sb.toString();
        f.e((Object)string, "sb.toString()");
        return string;
    }
}
