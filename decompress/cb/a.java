// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import ad.c0;
import java.io.IOException;
import ad.d0;

public abstract class a
{
    public final a a;
    public final f b;
    public c c;
    public final int d;
    
    public a(final d d, final f b, final long n, final long n2, final long n3, final long n4, final long n5, final int d2) {
        this.b = b;
        this.d = d2;
        this.a = new a(d, n, n2, n3, n4, n5);
    }
    
    public static int b(final cb.e e, final long a, final t t) {
        if (a == e.d) {
            return 0;
        }
        t.a = a;
        return 1;
    }
    
    public final int a(final cb.e e, final t t) throws IOException {
        while (true) {
            final c c = this.c;
            d0.g(c);
            final long f = c.f;
            final long g = c.g;
            final long h = c.h;
            if (g - f <= this.d) {
                this.c = null;
                this.b.b();
                return b(e, f, t);
            }
            final long n = h - e.d;
            boolean b;
            if (n >= 0L && n <= 262144L) {
                e.n((int)n);
                b = true;
            }
            else {
                b = false;
            }
            if (!b) {
                return b(e, h, t);
            }
            e.f = 0;
            final e a = this.b.a(e, c.b);
            final int a2 = a.a;
            if (a2 == -3) {
                this.c = null;
                this.b.b();
                return b(e, h, t);
            }
            if (a2 != -2) {
                if (a2 != -1) {
                    if (a2 == 0) {
                        final long n2 = a.c - e.d;
                        if (n2 >= 0L && n2 <= 262144L) {
                            e.n((int)n2);
                        }
                        this.c = null;
                        this.b.b();
                        return b(e, a.c, t);
                    }
                    throw new IllegalStateException("Invalid case");
                }
                else {
                    final long b2 = a.b;
                    final long c2 = a.c;
                    c.e = b2;
                    c.g = c2;
                    c.h = cb.a.c.a(c.b, c.d, b2, c.f, c2, c.c);
                }
            }
            else {
                final long b3 = a.b;
                final long c3 = a.c;
                c.d = b3;
                c.f = c3;
                c.h = cb.a.c.a(c.b, b3, c.e, c3, c.g, c.c);
            }
        }
    }
    
    public final void c(final long n) {
        final c c = this.c;
        if (c != null && c.a == n) {
            return;
        }
        final long a = this.a.a.a(n);
        final a a2 = this.a;
        this.c = new c(n, a, a2.c, a2.d, a2.e, a2.f, a2.g);
    }
    
    public static final class a implements u
    {
        public final d a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        
        public a(final d a, final long b, final long d, final long e, final long f, final long g) {
            this.a = a;
            this.b = b;
            this.c = 0L;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        public final u.a c(final long n) {
            final v v = new v(n, cb.a.c.a(this.a.a(n), this.c, this.d, this.e, this.f, this.g));
            return new u.a(v, v);
        }
        
        public final boolean d() {
            return true;
        }
        
        public final long h() {
            return this.b;
        }
    }
    
    public static final class b implements d
    {
        @Override
        public final long a(final long n) {
            return n;
        }
    }
    
    public static final class c
    {
        public final long a;
        public final long b;
        public final long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        
        public c(final long a, final long b, final long d, final long e, final long f, final long g, final long c) {
            this.a = a;
            this.b = b;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.c = c;
            this.h = a(b, d, e, f, g, c);
        }
        
        public static long a(long n, final long n2, final long n3, final long n4, final long n5, final long n6) {
            if (n4 + 1L < n5 && n2 + 1L < n3) {
                n = (long)((n - n2) * ((n5 - n4) / (float)(n3 - n2)));
                return c0.j(n + n4 - n6 - n / 20L, n4, n5 - 1L);
            }
            return n4;
        }
    }
    
    public interface d
    {
        long a(final long p0);
    }
    
    public static final class e
    {
        public static final e d;
        public final int a;
        public final long b;
        public final long c;
        
        static {
            d = new e(-3, -9223372036854775807L, -1L);
        }
        
        public e(final int a, final long b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static e a(final long n) {
            return new e(0, -9223372036854775807L, n);
        }
    }
    
    public interface f
    {
        e a(final cb.e p0, final long p1) throws IOException;
        
        default void b() {
        }
    }
}
