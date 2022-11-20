// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.util.List;
import qb.a$b;
import java.util.ArrayList;
import java.util.Collections;
import qb.a;
import java.nio.ByteBuffer;
import qb.d;
import bd.a0;
import bd.s;
import bd.t;
import ai2.h;

public final class c extends h
{
    public final t b;
    public final s c;
    public a0 d;
    
    public c() {
        this.b = new t();
        this.c = new s();
    }
    
    @Override
    public final a w(final d d, final ByteBuffer byteBuffer) {
        final a0 d2 = this.d;
        Label_0081: {
            if (d2 != null) {
                final long n = d.n;
                synchronized (d2) {
                    final long b = d2.b;
                    monitorexit(d2);
                    if (n == b) {
                        break Label_0081;
                    }
                }
            }
            (this.d = new a0(((DecoderInputBuffer)d).j)).a(((DecoderInputBuffer)d).j - d.n);
        }
        final byte[] array = byteBuffer.array();
        final int limit = byteBuffer.limit();
        this.b.z(limit, array);
        this.c.j(limit, array);
        this.c.m(39);
        final long n2 = (long)this.c.g(1) << 32 | (long)this.c.g(32);
        this.c.m(20);
        int g = this.c.g(12);
        final int g2 = this.c.g(8);
        Object o = null;
        this.b.C(14);
        if (g2 != 0) {
            if (g2 != 255) {
                if (g2 != 4) {
                    if (g2 != 5) {
                        if (g2 == 6) {
                            final t b2 = this.b;
                            final a0 d3 = this.d;
                            final long a = xb.g.a(n2, b2);
                            o = new g(a, d3.b(a));
                        }
                    }
                    else {
                        final t b3 = this.b;
                        final a0 d4 = this.d;
                        final long s = b3.s();
                        final boolean b4 = (b3.r() & 0x80) != 0x0;
                        List<d$b> emptyList = Collections.emptyList();
                        boolean b8;
                        long a2;
                        boolean b9;
                        long n4;
                        int r5;
                        boolean b11;
                        boolean b12;
                        int n5;
                        int n6;
                        if (!b4) {
                            final int r = b3.r();
                            final boolean b5 = (r & 0x80) != 0x0;
                            final boolean b6 = (r & 0x40) != 0x0;
                            final boolean b7 = (r & 0x20) != 0x0;
                            b8 = ((r & 0x10) != 0x0);
                            if (b6 && !b8) {
                                a2 = xb.g.a(n2, b3);
                            }
                            else {
                                a2 = -9223372036854775807L;
                            }
                            if (!b6) {
                                final int r2 = b3.r();
                                emptyList = new ArrayList<d$b>(r2);
                                for (int i = 0; i < r2; ++i) {
                                    final int r3 = b3.r();
                                    long a3;
                                    if (!b8) {
                                        a3 = xb.g.a(n2, b3);
                                    }
                                    else {
                                        a3 = -9223372036854775807L;
                                    }
                                    ((ArrayList<d$b>)emptyList).add(new d$b(r3, a3, d4.b(a3)));
                                }
                            }
                            if (b7) {
                                final long n3 = b3.r();
                                b9 = ((n3 & 0x80L) != 0x0L);
                                n4 = ((n3 & 0x1L) << 32 | b3.s()) * 1000L / 90L;
                            }
                            else {
                                b9 = false;
                                n4 = -9223372036854775807L;
                            }
                            final int w = b3.w();
                            final int r4 = b3.r();
                            r5 = b3.r();
                            final boolean b10 = b6;
                            b11 = b5;
                            b12 = b10;
                            n5 = w;
                            n6 = r4;
                        }
                        else {
                            a2 = -9223372036854775807L;
                            b11 = false;
                            b12 = false;
                            b8 = false;
                            b9 = false;
                            n4 = -9223372036854775807L;
                            n5 = 0;
                            n6 = 0;
                            r5 = 0;
                        }
                        o = new xb.d(s, b4, b11, b12, b8, a2, d4.b(a2), emptyList, b9, n4, n5, n6, r5);
                    }
                }
                else {
                    final t b13 = this.b;
                    final int r6 = b13.r();
                    final ArrayList list = new ArrayList<f$c>(r6);
                    for (int j = 0; j < r6; ++j) {
                        final long s2 = b13.s();
                        final boolean b14 = (b13.r() & 0x80) != 0x0;
                        ArrayList list2 = new ArrayList();
                        boolean b18;
                        long n8;
                        int w2;
                        int r9;
                        int r10;
                        boolean b20;
                        long n9;
                        boolean b21;
                        if (!b14) {
                            final int r7 = b13.r();
                            final boolean b15 = (r7 & 0x80) != 0x0;
                            final boolean b16 = (r7 & 0x40) != 0x0;
                            final boolean b17 = (r7 & 0x20) != 0x0;
                            long s3;
                            if (b16) {
                                s3 = b13.s();
                            }
                            else {
                                s3 = -9223372036854775807L;
                            }
                            if (!b16) {
                                final int r8 = b13.r();
                                list2 = new ArrayList(r8);
                                for (int k = 0; k < r8; ++k) {
                                    list2.add(new f$b(b13.r(), b13.s()));
                                }
                            }
                            if (b17) {
                                final long n7 = b13.r();
                                b18 = ((n7 & 0x80L) != 0x0L);
                                n8 = ((n7 & 0x1L) << 32 | b13.s()) * 1000L / 90L;
                            }
                            else {
                                b18 = false;
                                n8 = -9223372036854775807L;
                            }
                            w2 = b13.w();
                            r9 = b13.r();
                            r10 = b13.r();
                            final boolean b19 = b15;
                            b20 = b16;
                            n9 = s3;
                            b21 = b19;
                        }
                        else {
                            b21 = false;
                            b20 = false;
                            n9 = -9223372036854775807L;
                            b18 = false;
                            n8 = -9223372036854775807L;
                            w2 = 0;
                            r9 = 0;
                            r10 = 0;
                        }
                        list.add(new f$c(s2, b14, b21, b20, list2, n9, b18, n8, w2, r9, r10));
                    }
                    o = new f(list);
                }
            }
            else {
                final t b22 = this.b;
                final long s4 = b22.s();
                g -= 4;
                final byte[] array2 = new byte[g];
                b22.b(0, g, array2);
                o = new xb.a(s4, array2, n2);
            }
        }
        else {
            o = new e();
        }
        a a4;
        if (o == null) {
            a4 = new a(new a$b[0]);
        }
        else {
            a4 = new a(new a$b[] { (a$b)o });
        }
        return a4;
    }
}
