// 
// Decompiled by Procyon v0.6.0
// 

package eb;

import ad.s;
import java.io.IOException;
import cb.e;
import cb.m;
import ra.o;
import java.util.Objects;
import cb.p;

public final class a extends a
{
    public a(final p p4, int n, final long n2, final long n3) {
        Objects.requireNonNull(p4);
        final o o = new o(p4, 2);
        final a a = new a(p4, n);
        final long b = p4.b();
        final long j = p4.j;
        n = p4.d;
        long n4;
        long n5;
        if (n > 0) {
            n4 = (n + (long)p4.c) / 2L;
            n5 = 1L;
        }
        else {
            n = p4.a;
            long n6;
            if (n == p4.b && n > 0) {
                n6 = n;
            }
            else {
                n6 = 4096L;
            }
            n4 = n6 * p4.g * p4.h / 8L;
            n5 = 64L;
        }
        super((d)o, (f)a, b, j, n2, n3, n4 + n5, Math.max(6, p4.c));
    }
    
    public static final class a implements f
    {
        public final p a;
        public final int b;
        public final m.a c;
        
        public a(final p a, final int b) {
            this.a = a;
            this.b = b;
            this.c = new m.a();
        }
        
        @Override
        public final e a(final cb.e e, final long n) throws IOException {
            final long d = e.d;
            final long c = this.c(e);
            final long k = e.k();
            e.j(Math.max(6, this.a.c), false);
            final long c2 = this.c(e);
            final long i = e.k();
            if (c <= n && c2 > n) {
                return cb.a.e.a(k);
            }
            if (c2 <= n) {
                return new e(-2, c2, i);
            }
            return new e(-1, c, d);
        }
        
        public final long c(final cb.e e) throws IOException {
            while (e.k() < e.c - 6L) {
                final p a = this.a;
                final int b = this.b;
                final m.a c = this.c;
                final long k = e.k();
                final byte[] array = new byte[2];
                e.g(array, 0, 2, false);
                boolean a2;
                if (((array[0] & 0xFF) << 8 | (array[1] & 0xFF)) != b) {
                    e.f = 0;
                    e.j((int)(k - e.d), false);
                    a2 = false;
                }
                else {
                    final s s = new s(16);
                    System.arraycopy(array, 0, s.a, 0, 2);
                    final byte[] a3 = s.a;
                    int i;
                    int p;
                    for (i = 0; i < 14; i += p) {
                        p = e.p(2 + i, 14 - i, a3);
                        if (p == -1) {
                            break;
                        }
                    }
                    s.A(i);
                    e.f = 0;
                    e.j((int)(k - e.d), false);
                    a2 = m.a(s, a, b, c);
                }
                if (a2) {
                    break;
                }
                e.j(1, false);
            }
            final long j = e.k();
            final long c2 = e.c;
            if (j >= c2 - 6L) {
                e.j((int)(c2 - e.k()), false);
                return this.a.j;
            }
            return this.c.a;
        }
    }
}
