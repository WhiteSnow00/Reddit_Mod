// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import bd.c0;
import java.io.IOException;
import db.a$e;
import db.e;
import bd.s;
import db.a$f;
import db.a$d;
import db.a$b;
import bd.a0;
import db.a;

public final class v extends db.a
{
    public v(final a0 a0, final long n, final long n2) {
        super((a$d)new a$b(), (a$f)new a(a0), n, n + 1L, 0L, n2, 188L, 1000);
    }
    
    public static int d(final int n, final byte[] array) {
        return (array[n + 3] & 0xFF) | ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
    
    public static final class a implements a$f
    {
        public final a0 a;
        public final s b;
        
        public a(final a0 a) {
            this.a = a;
            this.b = new s();
        }
        
        public final a$e a(final e e, final long n) throws IOException {
            final long d = e.d;
            final int n2 = (int)Math.min(20000L, e.c - d);
            this.b.y(n2);
            e.h(this.b.a, 0, n2, false);
            final s b = this.b;
            int b2 = -1;
            int n3 = -1;
            long n4 = -9223372036854775807L;
            a$e a$e;
            while (true) {
                final int c = b.c;
                final int b3 = b.b;
                if (c - b3 >= 4) {
                    if (v.d(b3, b.a) != 442) {
                        b.C(1);
                    }
                    else {
                        b.C(4);
                        final long c2 = w.c(b);
                        int b4 = n3;
                        long b5 = n4;
                        if (c2 != -9223372036854775807L) {
                            b5 = this.a.b(c2);
                            if (b5 > n) {
                                if (n4 == -9223372036854775807L) {
                                    a$e = new a$e(-1, b5, d);
                                    break;
                                }
                                a$e = db.a$e.a(d + n3);
                                break;
                            }
                            else {
                                if (100000L + b5 > n) {
                                    a$e = db.a$e.a(d + b.b);
                                    break;
                                }
                                b4 = b.b;
                            }
                        }
                        final int c3 = b.c;
                        Label_0496: {
                            if (c3 - b.b < 10) {
                                b.B(c3);
                            }
                            else {
                                b.C(9);
                                final int n5 = b.r() & 0x7;
                                if (b.c - b.b < n5) {
                                    b.B(c3);
                                }
                                else {
                                    b.C(n5);
                                    final int c4 = b.c;
                                    final int b6 = b.b;
                                    if (c4 - b6 < 4) {
                                        b.B(c3);
                                    }
                                    else {
                                        if (v.d(b6, b.a) == 443) {
                                            b.C(4);
                                            final int w = b.w();
                                            if (b.c - b.b < w) {
                                                b.B(c3);
                                                break Label_0496;
                                            }
                                            b.C(w);
                                        }
                                        while (true) {
                                            final int c5 = b.c;
                                            final int b7 = b.b;
                                            if (c5 - b7 < 4) {
                                                break;
                                            }
                                            final int d2 = v.d(b7, b.a);
                                            if (d2 == 442) {
                                                break;
                                            }
                                            if (d2 == 441) {
                                                break;
                                            }
                                            if (d2 >>> 8 != 1) {
                                                break;
                                            }
                                            b.C(4);
                                            if (b.c - b.b < 2) {
                                                b.B(c3);
                                                break;
                                            }
                                            b.B(Math.min(b.c, b.b + b.w()));
                                        }
                                    }
                                }
                            }
                        }
                        b2 = b.b;
                        n3 = b4;
                        n4 = b5;
                    }
                }
                else {
                    if (n4 != -9223372036854775807L) {
                        a$e = new a$e(-2, n4, d + b2);
                        break;
                    }
                    a$e = db.a$e.d;
                    break;
                }
            }
            return a$e;
        }
        
        public final void b() {
            final s b = this.b;
            final byte[] f = c0.f;
            b.getClass();
            b.z(f.length, f);
        }
    }
}
