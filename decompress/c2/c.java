// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import mj2.c0;

public interface c
{
    long a(final long p0, final long p1);
    
    public static final class a
    {
        public static final c$a$a a;
        public static final c$a$e b;
        public static final c$a$c c;
        public static final c$a$d d;
        public static final c$a$f e;
        public static final f f;
        public static final c$a$b g;
        
        static {
            a = new c() {
                @Override
                public final long a(final long n, final long n2) {
                    final float max = Math.max(n1.f.e(n2) / n1.f.e(n), n1.f.c(n2) / n1.f.c(n));
                    return c0.g(max, max);
                }
            };
            b = new c() {
                @Override
                public final long a(final long n, final long n2) {
                    final float min = Math.min(n1.f.e(n2) / n1.f.e(n), n1.f.c(n2) / n1.f.c(n));
                    return c0.g(min, min);
                }
            };
            c = new c() {
                @Override
                public final long a(final long n, final long n2) {
                    final float n3 = n1.f.c(n2) / n1.f.c(n);
                    return c0.g(n3, n3);
                }
            };
            d = new c() {
                @Override
                public final long a(final long n, final long n2) {
                    final float n3 = n1.f.e(n2) / n1.f.e(n);
                    return c0.g(n3, n3);
                }
            };
            e = new c() {
                @Override
                public final long a(long n, final long n2) {
                    if (n1.f.e(n) <= n1.f.e(n2) && n1.f.c(n) <= n1.f.c(n2)) {
                        n = c0.g(1.0f, 1.0f);
                    }
                    else {
                        final float min = Math.min(n1.f.e(n2) / n1.f.e(n), n1.f.c(n2) / n1.f.c(n));
                        n = c0.g(min, min);
                    }
                    return n;
                }
            };
            f = new f();
            g = new c() {
                @Override
                public final long a(final long n, final long n2) {
                    return c0.g(n1.f.e(n2) / n1.f.e(n), n1.f.c(n2) / n1.f.c(n));
                }
            };
        }
    }
}
