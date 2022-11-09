// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import java.io.IOException;
import mj2.c0;
import db.a$e;
import db.e;
import bd.s;
import db.a$f;
import db.a$d;
import db.a$b;
import bd.a0;
import db.a;

public final class b0 extends db.a
{
    public b0(final a0 a0, final long n, final long n2, final int n3, final int n4) {
        super((a$d)new a$b(), (a$f)new a(n3, a0, n4), n, n + 1L, 0L, n2, 188L, 940);
    }
    
    public static final class a implements a$f
    {
        public final a0 a;
        public final s b;
        public final int c;
        public final int d;
        
        public a(final int c, final a0 a, final int d) {
            this.c = c;
            this.a = a;
            this.d = d;
            this.b = new s();
        }
        
        public final a$e a(final e e, final long n) throws IOException {
            final long d = e.d;
            final int n2 = (int)Math.min(this.d, e.c - d);
            this.b.y(n2);
            e.h(this.b.a, 0, n2, false);
            final s b = this.b;
            final int c = b.c;
            long n3 = -1L;
            long n4 = -1L;
            long n5 = -9223372036854775807L;
            while (true) {
                final int c2 = b.c;
                int b2 = b.b;
                if (c2 - b2 < 188) {
                    break;
                }
                for (byte[] a = b.a; b2 < c && a[b2] != 71; ++b2) {}
                final int n6 = b2 + 188;
                if (n6 > c) {
                    break;
                }
                final long v = c0.V(b, b2, this.c);
                long n7 = n4;
                long b3 = n5;
                if (v != -9223372036854775807L) {
                    b3 = this.a.b(v);
                    if (b3 > n) {
                        if (n5 == -9223372036854775807L) {
                            return new a$e(-1, b3, d);
                        }
                        return a$e.a(d + n4);
                    }
                    else {
                        if (100000L + b3 > n) {
                            return a$e.a(d + b2);
                        }
                        n7 = b2;
                    }
                }
                b.B(n6);
                n3 = n6;
                n4 = n7;
                n5 = b3;
            }
            a$e a$e;
            if (n5 != -9223372036854775807L) {
                a$e = new a$e(-2, n5, d + n3);
            }
            else {
                a$e = db.a$e.d;
            }
            return a$e;
        }
        
        public final void b() {
            final s b = this.b;
            final byte[] f = bd.c0.f;
            b.getClass();
            b.z(f.length, f);
        }
    }
}
