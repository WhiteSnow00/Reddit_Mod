// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import ig2.j;
import ml0.a;
import sg2.e;

public final class n
{
    public String a;
    public h b;
    public int c;
    public int d;
    
    public n(final String a) {
        e.f((Object)a, "text");
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
    
    public final void b(int a, int d, final String s) {
        e.f((Object)s, "text");
        final h b = this.b;
        if (b == null) {
            final int max = Math.max(255, s.length() + 128);
            final char[] array = new char[max];
            final int min = Math.min(a, 64);
            final int min2 = Math.min(this.a.length() - d, 64);
            final String a2 = this.a;
            final int c = a - min;
            a.C0(a2, array, 0, c, a);
            final String a3 = this.a;
            a = max - min2;
            final int d2 = min2 + d;
            a.C0(a3, array, a, d, d2);
            a.C0(s, array, min, 0, s.length());
            this.b = new h(array, s.length() + min, a);
            this.c = c;
            this.d = d2;
            return;
        }
        final int c2 = this.c;
        final int n = a - c2;
        final int n2 = d - c2;
        if (n >= 0 && n2 <= b.a - (b.d - b.c)) {
            final int n3 = s.length() - (n2 - n);
            d = b.d - b.c;
            if (n3 > d) {
                a = b.a;
                do {
                    a *= 2;
                } while (a - b.a < n3 - d);
                final char[] b2 = new char[a];
                j.E0(b.b, b2, 0, 0, b.c);
                final int a4 = b.a;
                d = b.d;
                final int n4 = a4 - d;
                final int d3 = a - n4;
                j.E0(b.b, b2, d3, d, n4 + d);
                b.b = b2;
                b.a = a;
                b.d = d3;
            }
            a = b.c;
            if (n < a && n2 <= a) {
                d = a - n2;
                final char[] b3 = b.b;
                j.E0(b3, b3, b.d - d, n2, a);
                b.c = n;
                b.d -= d;
            }
            else if (n < a && n2 >= a) {
                b.d = b.d - a + n2;
                b.c = n;
            }
            else {
                final int d4 = b.d;
                d = d4 - a;
                final int n5 = n + d;
                final char[] b4 = b.b;
                j.E0(b4, b4, a, d4, n5);
                b.c += n5 - d4;
                b.d = d + n2;
            }
            a.C0(s, b.b, b.c, 0, s.length());
            a = b.c;
            b.c = s.length() + a;
            return;
        }
        this.a = this.toString();
        this.b = null;
        this.c = -1;
        this.d = -1;
        this.b(a, d, s);
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
        e.e((Object)string, "sb.toString()");
        return string;
    }
}
