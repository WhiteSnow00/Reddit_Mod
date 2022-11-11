// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import yc.f;
import cb.w$a;
import cb.u;
import com.google.android.exoplayer2.n;
import android.util.Log;
import android.util.Pair;
import ad.s;
import com.google.android.exoplayer2.ParserException;
import ad.c0;
import ad.d0;
import cb.t;
import java.io.IOException;
import cb.e;
import cb.i;
import cb.w;
import cb.j;
import cb.h;

public final class a implements h
{
    public j a;
    public w b;
    public int c;
    public long d;
    public b e;
    public int f;
    public long g;
    
    static {
        new(android.support.v4.media.a.class)();
    }
    
    public a() {
        this.c = 0;
        this.d = -1L;
        this.f = -1;
        this.g = -1L;
    }
    
    @Override
    public final void a(final long n, final long n2) {
        int c;
        if (n == 0L) {
            c = 0;
        }
        else {
            c = 4;
        }
        this.c = c;
        final b e = this.e;
        if (e != null) {
            e.b(n2);
        }
    }
    
    @Override
    public final void e(final j a) {
        this.a = a;
        this.b = a.i(0, 1);
        a.b();
    }
    
    @Override
    public final boolean f(final i i) throws IOException {
        return nb.c.a((e)i);
    }
    
    @Override
    public final int i(final i i, final t t) throws IOException {
        d0.g(this.b);
        final int a = c0.a;
        final int c = this.c;
        final int n = 0;
        int w = 4;
        boolean b = true;
        if (c == 0) {
            final e e = (e)i;
            d0.f(e.d == 0L);
            final int f = this.f;
            if (f != -1) {
                e.n(f);
                this.c = 4;
            }
            else {
                if (!nb.c.a(e)) {
                    throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
                }
                e.n((int)(e.k() - e.d));
                this.c = 1;
            }
            return 0;
        }
        long f2 = -1L;
        if (c == 1) {
            final s s = new s(8);
            final e e2 = (e)i;
            final nb.c.a a2 = nb.c.a.a(e2, s);
            if (a2.a != 1685272116) {
                e2.f = 0;
            }
            else {
                e2.j(8, false);
                s.B(0);
                e2.g(s.a, 0, 8, false);
                f2 = s.f();
                e2.n((int)a2.b + 8);
            }
            this.d = f2;
            this.c = 2;
            return 0;
        }
        if (c == 2) {
            final s s2 = new s(16);
            final e e3 = (e)i;
            final nb.c.a b2 = nb.c.b(1718449184, e3, s2);
            d0.f(b2.b >= 16L);
            e3.g(s2.a, 0, 16, false);
            s2.B(0);
            final int j = s2.j();
            final int k = s2.j();
            final int l = s2.i();
            s2.i();
            final int m = s2.j();
            final int j2 = s2.j();
            final int n2 = (int)b2.b - 16;
            byte[] f3;
            if (n2 > 0) {
                f3 = new byte[n2];
                e3.g(f3, 0, n2, false);
            }
            else {
                f3 = c0.f;
            }
            e3.n((int)(e3.k() - e3.d));
            final nb.b b3 = new nb.b(f3, j, k, l, m, j2);
            if (j == 17) {
                this.e = (b)new a(this.a, this.b, b3);
            }
            else if (j == 6) {
                this.e = (b)new c(this.a, this.b, b3, "audio/g711-alaw", -1);
            }
            else if (j == 7) {
                this.e = (b)new c(this.a, this.b, b3, "audio/g711-mlaw", -1);
            }
            else {
                Label_0694: {
                    Label_0688: {
                        if (j != 1) {
                            if (j != 3) {
                                if (j == 65534) {
                                    break Label_0688;
                                }
                            }
                            else if (j2 == 32) {
                                break Label_0694;
                            }
                            w = 0;
                            break Label_0694;
                        }
                    }
                    w = c0.w(j2);
                }
                if (w == 0) {
                    final StringBuilder sb = new StringBuilder(40);
                    sb.append("Unsupported WAV format type: ");
                    sb.append(j);
                    throw ParserException.createForUnsupportedContainerFeature(sb.toString());
                }
                this.e = (b)new c(this.a, this.b, b3, "audio/raw", w);
            }
            this.c = 3;
            return 0;
        }
        if (c == 3) {
            final e e4 = (e)i;
            e4.f = 0;
            final nb.c.a b4 = nb.c.b(1684108385, e4, new s(8));
            e4.n(8);
            final Pair create = Pair.create((Object)e4.d, (Object)b4.b);
            this.f = ((Long)create.first).intValue();
            final long longValue = (long)create.second;
            final long d = this.d;
            long n3 = longValue;
            if (d != -1L) {
                n3 = longValue;
                if (longValue == 4294967295L) {
                    n3 = d;
                }
            }
            final long g = this.f + n3;
            this.g = g;
            final long c2 = e4.c;
            if (c2 != -1L && g > c2) {
                final StringBuilder sb2 = new StringBuilder(69);
                sb2.append("Data exceeds input length: ");
                sb2.append(g);
                sb2.append(", ");
                sb2.append(c2);
                Log.w("WavExtractor", sb2.toString());
                this.g = c2;
            }
            final b e5 = this.e;
            e5.getClass();
            e5.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        if (c == 4) {
            if (this.g == -1L) {
                b = false;
            }
            d0.f(b);
            final long g2 = this.g;
            final e e6 = (e)i;
            final long d2 = e6.d;
            final b e7 = this.e;
            e7.getClass();
            int n4 = n;
            if (e7.c(e6, g2 - d2)) {
                n4 = -1;
            }
            return n4;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final void release() {
    }
    
    public static final class a implements b
    {
        public static final int[] m;
        public static final int[] n;
        public final j a;
        public final w b;
        public final nb.b c;
        public final int d;
        public final byte[] e;
        public final s f;
        public final int g;
        public final n h;
        public int i;
        public long j;
        public int k;
        public long l;
        
        static {
            m = new int[] { -1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8 };
            n = new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
        }
        
        public a(final j a, final w b, final nb.b c) throws ParserException {
            this.a = a;
            this.b = b;
            this.c = c;
            final int max = Math.max(1, c.b / 10);
            this.g = max;
            final s s = new s(c.e);
            s.j();
            final int j = s.j();
            this.d = j;
            final int a2 = c.a;
            final int c2 = c.c;
            final int n = (c2 - a2 * 4) * 8 / (c.d * a2) + 1;
            if (j == n) {
                final int a3 = c0.a;
                final int n2 = (max + j - 1) / j;
                this.e = new byte[c2 * n2];
                this.f = new s(j * 2 * a2 * n2);
                final int b2 = c.b;
                final int n3 = c.c * b2 * 8 / j;
                final n.a a4 = new n.a();
                a4.k = "audio/raw";
                a4.f = n3;
                a4.g = n3;
                a4.l = max * 2 * a2;
                a4.x = c.a;
                a4.y = b2;
                a4.z = 2;
                this.h = new n(a4);
                return;
            }
            final StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(n);
            sb.append("; got: ");
            sb.append(j);
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }
        
        @Override
        public final void a(final int n, final long n2) {
            this.a.l((u)new d(this.c, this.d, n, n2));
            this.b.b(this.h);
        }
        
        @Override
        public final void b(final long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }
        
        @Override
        public final boolean c(final e e, final long n) throws IOException {
            final int g = this.g;
            final int k = this.k;
            final nb.b c = this.c;
            final int n2 = k / (c.a * 2);
            final int d = this.d;
            final int a = c0.a;
            final int n3 = (g - n2 + d - 1) / d * c.c;
            while (true) {
                Label_0127: {
                    if (n == 0L) {
                        break Label_0127;
                    }
                    final boolean b = false;
                    while (!b) {
                        final int i = this.i;
                        if (i >= n3) {
                            break;
                        }
                        final int read = e.read(this.e, this.i, (int)Math.min(n3 - i, n));
                        if (read == -1) {
                            break Label_0127;
                        }
                        this.i += read;
                    }
                    final int n4 = this.i / this.c.c;
                    if (n4 > 0) {
                        final byte[] e2 = this.e;
                        final s f = this.f;
                        for (int j = 0; j < n4; ++j) {
                            int n5 = 0;
                            while (true) {
                                final nb.b c2 = this.c;
                                final int a2 = c2.a;
                                if (n5 >= a2) {
                                    break;
                                }
                                final byte[] a3 = f.a;
                                final int c3 = c2.c;
                                final int n6 = n5 * 4 + j * c3;
                                final int n7 = c3 / a2 - 4;
                                int l = (short)((e2[n6] & 0xFF) | (e2[n6 + 1] & 0xFF) << 8);
                                int n8 = Math.min(e2[n6 + 2] & 0xFF, 88);
                                int n9 = nb.a.a.n[n8];
                                int n10 = (this.d * j * a2 + n5) * 2;
                                a3[n10] = (byte)(l & 0xFF);
                                a3[n10 + 1] = (byte)(l >> 8);
                                for (int n11 = 0; n11 < n7 * 2; ++n11) {
                                    final int n12 = e2[n11 / 8 * a2 * 4 + (a2 * 4 + n6) + n11 / 2 % 4] & 0xFF;
                                    int n13;
                                    if (n11 % 2 == 0) {
                                        n13 = (n12 & 0xF);
                                    }
                                    else {
                                        n13 = n12 >> 4;
                                    }
                                    int n14 = ((n13 & 0x7) * 2 + 1) * n9 >> 3;
                                    if ((n13 & 0x8) != 0x0) {
                                        n14 = -n14;
                                    }
                                    l = c0.i(l + n14, -32768, 32767);
                                    n10 += a2 * 2;
                                    a3[n10] = (byte)(l & 0xFF);
                                    a3[n10 + 1] = (byte)(l >> 8);
                                    final int n15 = nb.a.a.m[n13];
                                    final int[] n16 = nb.a.a.n;
                                    n8 = c0.i(n8 + n15, 0, 88);
                                    n9 = n16[n8];
                                }
                                ++n5;
                            }
                        }
                        final int d2 = this.d;
                        final int a4 = this.c.a;
                        f.B(0);
                        f.A(d2 * n4 * 2 * a4);
                        this.i -= n4 * this.c.c;
                        final s f2 = this.f;
                        final int c4 = f2.c;
                        this.b.e(c4, f2);
                        final int m = this.k + c4;
                        this.k = m;
                        final int n17 = m / (this.c.a * 2);
                        final int g2 = this.g;
                        if (n17 >= g2) {
                            this.d(g2);
                        }
                    }
                    if (b) {
                        final int n18 = this.k / (this.c.a * 2);
                        if (n18 > 0) {
                            this.d(n18);
                        }
                    }
                    return b;
                }
                final boolean b = true;
                continue;
            }
        }
        
        public final void d(final int n) {
            final long j = this.j;
            final long p = c0.P(this.l, 1000000L, this.c.b);
            final int n2 = n * 2 * this.c.a;
            this.b.a(j + p, 1, n2, this.k - n2, (w$a)null);
            this.l += n;
            this.k -= n2;
        }
    }
    
    public interface b
    {
        void a(final int p0, final long p1) throws ParserException;
        
        void b(final long p0);
        
        boolean c(final e p0, final long p1) throws IOException;
    }
    
    public static final class c implements b
    {
        public final j a;
        public final w b;
        public final nb.b c;
        public final n d;
        public final int e;
        public long f;
        public int g;
        public long h;
        
        public c(final j a, final w b, final nb.b c, final String k, final int z) throws ParserException {
            this.a = a;
            this.b = b;
            this.c = c;
            final int n = c.a * c.d / 8;
            final int c2 = c.c;
            if (c2 == n) {
                final int n2 = c.b * n;
                final int n3 = n2 * 8;
                final int max = Math.max(n, n2 / 10);
                this.e = max;
                final n.a a2 = new n.a();
                a2.k = k;
                a2.f = n3;
                a2.g = n3;
                a2.l = max;
                a2.x = c.a;
                a2.y = c.b;
                a2.z = z;
                this.d = new n(a2);
                return;
            }
            final StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(n);
            sb.append("; got: ");
            sb.append(c2);
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }
        
        @Override
        public final void a(final int n, final long n2) {
            this.a.l((u)new d(this.c, 1, n, n2));
            this.b.b(this.d);
        }
        
        @Override
        public final void b(final long f) {
            this.f = f;
            this.g = 0;
            this.h = 0L;
        }
        
        @Override
        public final boolean c(final e e, long f) throws IOException {
            long n;
            boolean b;
            while (true) {
                n = lcmp(f, 0L);
                b = true;
                if (n <= 0) {
                    break;
                }
                final int g = this.g;
                final int e2 = this.e;
                if (g >= e2) {
                    break;
                }
                final int d = this.b.d((f)e, (int)Math.min(e2 - g, f), true);
                if (d == -1) {
                    f = 0L;
                }
                else {
                    this.g += d;
                    f -= d;
                }
            }
            final nb.b c = this.c;
            final int c2 = c.c;
            final int n2 = this.g / c2;
            if (n2 > 0) {
                f = this.f;
                final long p2 = c0.P(this.h, 1000000L, c.b);
                final int n3 = n2 * c2;
                final int g2 = this.g - n3;
                this.b.a(f + p2, 1, n3, g2, (w$a)null);
                this.h += n2;
                this.g = g2;
            }
            if (n > 0) {
                b = false;
            }
            return b;
        }
    }
}
