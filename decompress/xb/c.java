// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import java.util.List;
import qb.a$b;
import java.util.ArrayList;
import java.util.Collections;
import java.nio.ByteBuffer;
import qb.d;
import bd.a0;
import bd.r;
import bd.s;
import android.support.v4.media.a;

public final class c extends a
{
    public final s f;
    public final r g;
    public a0 h;
    
    public c() {
        this.f = new s();
        this.g = new r();
    }
    
    public final qb.a j0(final d d, final ByteBuffer byteBuffer) {
        final a0 h = this.h;
        Label_0072: {
            if (h != null) {
                final long n = d.n;
                synchronized (h) {
                    final long b = h.b;
                    monitorexit(h);
                    if (n == b) {
                        break Label_0072;
                    }
                }
            }
            (this.h = new a0(d.j)).a(d.j - d.n);
        }
        final byte[] array = byteBuffer.array();
        final int limit = byteBuffer.limit();
        this.f.z(limit, array);
        this.g.j(limit, array);
        this.g.m(39);
        final long n2 = (long)this.g.g(1) << 32 | (long)this.g.g(32);
        this.g.m(20);
        final int g = this.g.g(12);
        final int g2 = this.g.g(8);
        Object o = null;
        this.f.C(14);
        if (g2 != 0) {
            if (g2 != 255) {
                if (g2 != 4) {
                    if (g2 != 5) {
                        if (g2 == 6) {
                            final s f = this.f;
                            final a0 h2 = this.h;
                            final long a = xb.g.a(n2, f);
                            o = new g(a, h2.b(a));
                        }
                    }
                    else {
                        final s f2 = this.f;
                        final a0 h3 = this.h;
                        final long s = f2.s();
                        final boolean b2 = (f2.r() & 0x80) != 0x0;
                        List<xb.d.b> emptyList = Collections.emptyList();
                        long a2;
                        boolean b7;
                        long n4;
                        int r5;
                        boolean b9;
                        boolean b10;
                        boolean b11;
                        int n5;
                        int n6;
                        if (!b2) {
                            final int r = f2.r();
                            final boolean b3 = (r & 0x80) != 0x0;
                            final boolean b4 = (r & 0x40) != 0x0;
                            final boolean b5 = (r & 0x20) != 0x0;
                            final boolean b6 = (r & 0x10) != 0x0;
                            if (b4 && !b6) {
                                a2 = xb.g.a(n2, f2);
                            }
                            else {
                                a2 = -9223372036854775807L;
                            }
                            if (!b4) {
                                final int r2 = f2.r();
                                emptyList = new ArrayList<xb.d.b>(r2);
                                for (int i = 0; i < r2; ++i) {
                                    final int r3 = f2.r();
                                    long a3;
                                    if (!b6) {
                                        a3 = xb.g.a(n2, f2);
                                    }
                                    else {
                                        a3 = -9223372036854775807L;
                                    }
                                    ((ArrayList<xb.d.b>)emptyList).add(new xb.d.b(r3, a3, h3.b(a3)));
                                }
                            }
                            if (b5) {
                                final long n3 = f2.r();
                                b7 = ((n3 & 0x80L) != 0x0L);
                                n4 = ((n3 & 0x1L) << 32 | f2.s()) * 1000L / 90L;
                            }
                            else {
                                b7 = false;
                                n4 = -9223372036854775807L;
                            }
                            final int w = f2.w();
                            final int r4 = f2.r();
                            r5 = f2.r();
                            final boolean b8 = b3;
                            b9 = b6;
                            b10 = b4;
                            b11 = b8;
                            n5 = w;
                            n6 = r4;
                        }
                        else {
                            a2 = -9223372036854775807L;
                            b11 = false;
                            b10 = false;
                            b9 = false;
                            b7 = false;
                            n4 = -9223372036854775807L;
                            n5 = 0;
                            n6 = 0;
                            r5 = 0;
                        }
                        o = new xb.d(s, b2, b11, b10, b9, a2, h3.b(a2), emptyList, b7, n4, n5, n6, r5);
                    }
                }
                else {
                    final s f3 = this.f;
                    final int r6 = f3.r();
                    final ArrayList list = new ArrayList<f.c>(r6);
                    for (int j = 0; j < r6; ++j) {
                        final long s2 = f3.s();
                        final boolean b12 = (f3.r() & 0x80) != 0x0;
                        ArrayList list2 = new ArrayList();
                        boolean b13;
                        boolean b14;
                        boolean b16;
                        long n8;
                        int r10;
                        long n9;
                        int n10;
                        int n11;
                        if (!b12) {
                            final int r7 = f3.r();
                            b13 = ((r7 & 0x80) != 0x0);
                            b14 = ((r7 & 0x40) != 0x0);
                            final boolean b15 = (r7 & 0x20) != 0x0;
                            long s3;
                            if (b14) {
                                s3 = f3.s();
                            }
                            else {
                                s3 = -9223372036854775807L;
                            }
                            if (!b14) {
                                final int r8 = f3.r();
                                list2 = new ArrayList(r8);
                                for (int k = 0; k < r8; ++k) {
                                    list2.add(new f.b(f3.r(), f3.s()));
                                }
                            }
                            if (b15) {
                                final long n7 = f3.r();
                                b16 = ((n7 & 0x80L) != 0x0L);
                                n8 = ((n7 & 0x1L) << 32 | f3.s()) * 1000L / 90L;
                            }
                            else {
                                b16 = false;
                                n8 = -9223372036854775807L;
                            }
                            final int w2 = f3.w();
                            final int r9 = f3.r();
                            r10 = f3.r();
                            n9 = s3;
                            n10 = w2;
                            n11 = r9;
                        }
                        else {
                            b13 = false;
                            b14 = false;
                            n9 = -9223372036854775807L;
                            b16 = false;
                            n8 = -9223372036854775807L;
                            n10 = 0;
                            n11 = 0;
                            r10 = 0;
                        }
                        list.add(new f.c(s2, b12, b13, b14, list2, n9, b16, n8, n10, n11, r10));
                    }
                    o = new f(list);
                }
            }
            else {
                final s f4 = this.f;
                final long s4 = f4.s();
                final int n12 = g - 4;
                final byte[] array2 = new byte[n12];
                f4.b(0, n12, array2);
                o = new xb.a(s4, array2, n2);
            }
        }
        else {
            o = new e();
        }
        qb.a a4;
        if (o == null) {
            a4 = new qb.a(new a$b[0]);
        }
        else {
            a4 = new qb.a(new a$b[] { (a$b)o });
        }
        return a4;
    }
}
