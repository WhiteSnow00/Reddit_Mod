// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.io.IOException;
import java.io.InterruptedIOException;
import ra.k;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.a;

public final class e
{
    public final com.google.android.exoplayer2.upstream.cache.a a;
    public final Cache b;
    public final b c;
    public final String d;
    public final byte[] e;
    public final a f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;
    
    public e(final com.google.android.exoplayer2.upstream.cache.a a, final b c, final byte[] array, final a f) {
        this.a = a;
        this.b = a.a;
        this.c = c;
        byte[] e = array;
        if (array == null) {
            e = new byte[131072];
        }
        this.e = e;
        this.f = f;
        this.d = ((k)a.e).b(c);
        this.g = c.f;
    }
    
    public final void a() throws IOException {
        if (!this.j) {
            final Cache b = this.b;
            final String d = this.d;
            final b c = this.c;
            this.i = b.e(c.f, c.g, d);
            final b c2 = this.c;
            final long g = c2.g;
            final long n = -1L;
            if (g != -1L) {
                this.h = c2.f + g;
            }
            else {
                long a;
                if ((a = zc.h.a((h)this.b.b(this.d))) == -1L) {
                    a = -1L;
                }
                this.h = a;
            }
            final a f = this.f;
            long g2 = n;
            if (f != null) {
                final long h = this.h;
                long n2;
                if (h == -1L) {
                    n2 = -1L;
                }
                else {
                    n2 = h - this.c.f;
                }
                f.u(n2, this.i, 0L);
                g2 = n;
            }
            Label_0848: {
                while (true) {
                    final long h2 = this.h;
                    if (h2 != g2 && this.g >= h2) {
                        return;
                    }
                    if (this.j) {
                        throw new InterruptedIOException();
                    }
                    final long h3 = this.h;
                    long n3;
                    if (h3 == g2) {
                        n3 = Long.MAX_VALUE;
                    }
                    else {
                        n3 = h3 - this.g;
                    }
                    final long i = this.b.i(this.g, n3, this.d);
                    if (i > 0L) {
                        this.g += i;
                    }
                    else {
                        long g3;
                        if ((g3 = -i) == Long.MAX_VALUE) {
                            g3 = g2;
                        }
                        final long g4 = this.g;
                        final long h4 = this.h;
                        boolean b2 = true;
                        final boolean b3 = g4 + g3 == h4 || g3 == g2;
                        long n4 = 0L;
                        Label_0439: {
                            if (g3 != g2) {
                                final b c3 = this.c;
                                c3.getClass();
                                final b.a a2 = new b.a(c3);
                                a2.f = g4;
                                a2.g = g3;
                                final b a3 = a2.a();
                                try {
                                    n4 = this.a.a(a3);
                                    break Label_0439;
                                }
                                catch (final IOException ex) {
                                    lq0.k.x((com.google.android.exoplayer2.upstream.a)this.a);
                                }
                            }
                            n4 = g2;
                            b2 = false;
                        }
                        Label_0518: {
                            if (!b2) {
                                if (!this.j) {
                                    final b c4 = this.c;
                                    c4.getClass();
                                    final b.a a4 = new b.a(c4);
                                    a4.f = g4;
                                    a4.g = g2;
                                    final b a5 = a4.a();
                                    try {
                                        n4 = this.a.a(a5);
                                        break Label_0518;
                                    }
                                    catch (final IOException ex2) {
                                        lq0.k.x((com.google.android.exoplayer2.upstream.a)this.a);
                                        throw ex2;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        if (b3 && n4 != g2) {
                            final long h5 = n4 + g4;
                            try {
                                if (this.h != h5) {
                                    this.h = h5;
                                    final a f2 = this.f;
                                    if (f2 != null) {
                                        long n5;
                                        if (h5 == g2) {
                                            n5 = g2;
                                        }
                                        else {
                                            n5 = h5 - this.c.f;
                                        }
                                        f2.u(n5, this.i, 0L);
                                    }
                                }
                            }
                            catch (final IOException ex3) {
                                break Label_0848;
                            }
                        }
                        int n6;
                        int j = n6 = 0;
                        while (j != -1) {
                            if (this.j) {
                                throw new InterruptedIOException();
                            }
                            final com.google.android.exoplayer2.upstream.cache.a a6 = this.a;
                            final byte[] e = this.e;
                            final int read = a6.read(e, 0, e.length);
                            if ((j = read) == -1) {
                                continue;
                            }
                            final long n7 = read;
                            final long k = this.i + n7;
                            this.i = k;
                            final a f3 = this.f;
                            if (f3 != null) {
                                final long h6 = this.h;
                                if (h6 != g2) {
                                    g2 = h6 - this.c.f;
                                }
                                f3.u(g2, k, n7);
                            }
                            n6 += read;
                            g2 = -1L;
                            j = read;
                        }
                        if (b3) {
                            final long h7 = n6 + g4;
                            if (this.h != h7) {
                                this.h = h7;
                                final a f4 = this.f;
                                if (f4 != null) {
                                    long n8;
                                    if (h7 == -1L) {
                                        n8 = -1L;
                                    }
                                    else {
                                        n8 = h7 - this.c.f;
                                    }
                                    f4.u(n8, this.i, 0L);
                                }
                            }
                        }
                        g2 = -1L;
                        this.a.close();
                        this.g = g4 + n6;
                    }
                }
                throw new InterruptedIOException();
            }
            lq0.k.x((com.google.android.exoplayer2.upstream.a)this.a);
            throw;
        }
        throw new InterruptedIOException();
    }
    
    public interface a
    {
        void u(final long p0, final long p1, final long p2);
    }
}
