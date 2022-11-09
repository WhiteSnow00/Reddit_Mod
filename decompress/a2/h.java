// 
// Decompiled by Procyon v0.6.0
// 

package a2;

import java.util.ArrayList;
import aj2.c;

public final class h
{
    public final d[] a;
    public int b;
    public final boolean c;
    
    public h() {
        final d[] a = new d[20];
        for (int i = 0; i < 20; ++i) {
            a[i] = null;
        }
        this.a = a;
        this.c = true;
    }
    
    public final void a(final long n, final long n2) {
        final int b = (this.b + 1) % 20;
        this.b = b;
        this.a[b] = new d(n2, n);
    }
    
    public final long b() {
        final boolean c = this.c;
        final int n = 0;
        int n2 = 0;
        if (c) {
            final d[] a = this.a;
            int b = this.b;
            final d d = a[b];
            long n3;
            if (d == null) {
                n3 = aj2.c.g(0.0f, 0.0f);
            }
            else {
                final a a2 = new a();
                final a a3 = new a();
                d d2 = d;
                do {
                    b = (b + 1) % 20;
                    final d d3 = this.a[b];
                    if (d3 != null) {
                        final long b2 = d.b;
                        final long b3 = d3.b;
                        final long n4 = b2 - b3;
                        final long abs = Math.abs(b3 - d2.b);
                        if (n4 <= 100L) {
                            if (abs > 40L) {
                                a2.a = 0.0f;
                                a2.b = Long.MAX_VALUE;
                                a2.c = Float.NaN;
                                a2.d = true;
                                a3.a = 0.0f;
                                a3.b = Long.MAX_VALUE;
                                a3.c = Float.NaN;
                                a3.d = true;
                            }
                            final long n5 = -n4;
                            a2.a(n1.c.c(d3.a), n5);
                            a3.a(n1.c.d(d3.a), n5);
                            ++n2;
                        }
                        d2 = d;
                    }
                } while (b != this.b && n2 < 20);
                if (n2 < 3) {
                    n3 = aj2.c.g(0.0f, 0.0f);
                }
                else {
                    final float a4 = a2.a;
                    final float signum = Math.signum(a4);
                    final float n6 = 2;
                    final float n7 = (float)Math.sqrt(Math.abs(a4) * n6);
                    final float a5 = a3.a;
                    n3 = aj2.c.g(signum * n7, Math.signum(a5) * (float)Math.sqrt(Math.abs(a5) * n6));
                }
            }
            return n3;
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        int b4 = this.b;
        final d d4 = this.a[b4];
        g g;
        if (d4 == null) {
            g = a2.g.e;
        }
        else {
            d d5 = d4;
            int n8 = n;
            int i;
            d d7;
            do {
                final d d6 = this.a[b4];
                if (d6 == null) {
                    i = n8;
                    d7 = d5;
                    break;
                }
                final long b5 = d4.b;
                final long b6 = d6.b;
                final float n9 = (float)(b5 - b6);
                final float n10 = (float)Math.abs(b6 - d5.b);
                i = n8;
                d7 = d5;
                if (n9 > 100.0f) {
                    break;
                }
                if (n10 > 40.0f) {
                    i = n8;
                    d7 = d5;
                    break;
                }
                final long a6 = d6.a;
                list.add(n1.c.c(a6));
                list2.add(n1.c.d(a6));
                list3.add(-n9);
                int n11;
                if ((n11 = b4) == 0) {
                    n11 = 20;
                }
                b4 = n11 - 1;
                i = n8 + 1;
                d7 = d6;
                n8 = i;
                d5 = d7;
            } while (i < 20);
            if (i >= 3) {
                try {
                    final e p1 = gn.a.P1(list3, list);
                    final e p2 = gn.a.P1(list3, list2);
                    final float floatValue = p1.a.get(1).floatValue();
                    final float floatValue2 = p2.a.get(1).floatValue();
                    final float n12 = 1000;
                    g = new g(yd.a.y0(floatValue * n12, floatValue2 * n12), p1.b * p2.b, d4.b - d7.b, n1.c.e(d4.a, d7.a));
                }
                catch (final IllegalArgumentException ex) {
                    g = a2.g.e;
                }
            }
            else {
                g = new g(n1.c.b, 1.0f, d4.b - d7.b, n1.c.e(d4.a, d7.a));
            }
        }
        final long a7 = g.a;
        return aj2.c.g(n1.c.c(a7), n1.c.d(a7));
    }
}
