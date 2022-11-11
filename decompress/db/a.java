// 
// Decompiled by Procyon v0.6.0
// 

package db;

import java.io.EOFException;
import cb.w$a;
import yc.f;
import com.google.android.exoplayer2.n;
import ad.d0;
import cb.t;
import cb.i;
import java.util.Arrays;
import java.io.IOException;
import com.google.android.exoplayer2.ParserException;
import cb.e;
import cb.d;
import ad.c0;
import cb.u;
import cb.w;
import cb.j;
import cb.h;

public final class a implements h
{
    public static final int[] p;
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final int t;
    public final byte[] a;
    public final int b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int i;
    public int j;
    public long k;
    public j l;
    public w m;
    public u n;
    public boolean o;
    
    static {
        p = new int[] { 13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1 };
        final int[] array;
        final int[] q2 = array = new int[16];
        array[0] = 18;
        array[1] = 24;
        array[2] = 33;
        array[3] = 37;
        array[4] = 41;
        array[5] = 47;
        array[6] = 51;
        array[7] = 59;
        array[8] = 61;
        array[9] = 6;
        array[11] = (array[10] = 1);
        array[13] = (array[12] = 1);
        array[15] = (array[14] = 1);
        q = q2;
        r = c0.C("#!AMR\n");
        s = c0.C("#!AMR-WB\n");
        t = q2[8];
    }
    
    public a() {
        this.b = 0;
        this.a = new byte[1];
        this.i = -1;
    }
    
    @Override
    public final void a(final long n, long b) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (n != 0L) {
            final u n2 = this.n;
            if (n2 instanceof d) {
                final d d = (d)n2;
                b = d.b;
                this.k = Math.max(0L, n - b) * 8L * 1000000L / d.e;
                return;
            }
        }
        this.k = 0L;
    }
    
    public final int b(final e e) throws IOException {
        final boolean b = false;
        e.f = 0;
        e.g(this.a, 0, 1, false);
        final byte b2 = this.a[0];
        if ((b2 & 0x83) > 0) {
            final StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid padding bits for frame header ");
            sb.append(b2);
            throw ParserException.createForMalformedContainer(sb.toString(), null);
        }
        final int n = b2 >> 3 & 0xF;
        int n2 = b ? 1 : 0;
        Label_0132: {
            if (n >= 0) {
                n2 = (b ? 1 : 0);
                if (n <= 15) {
                    final boolean c = this.c;
                    if (!c || (n >= 10 && n <= 13)) {
                        final boolean b3 = !c && (n < 12 || n > 14);
                        n2 = (b ? 1 : 0);
                        if (!b3) {
                            break Label_0132;
                        }
                    }
                    n2 = 1;
                }
            }
        }
        if (n2 == 0) {
            String s;
            if (this.c) {
                s = "WB";
            }
            else {
                s = "NB";
            }
            final StringBuilder sb2 = new StringBuilder(s.length() + 35);
            sb2.append("Illegal AMR ");
            sb2.append(s);
            sb2.append(" frame type ");
            sb2.append(n);
            throw ParserException.createForMalformedContainer(sb2.toString(), null);
        }
        int n3;
        if (this.c) {
            n3 = db.a.q[n];
        }
        else {
            n3 = db.a.p[n];
        }
        return n3;
    }
    
    public final boolean c(final e e) throws IOException {
        final byte[] r = db.a.r;
        e.f = 0;
        final byte[] array = new byte[r.length];
        e.g(array, 0, r.length, false);
        if (Arrays.equals(array, r)) {
            this.c = false;
            e.n(r.length);
            return true;
        }
        final byte[] s = db.a.s;
        e.f = 0;
        final byte[] array2 = new byte[s.length];
        e.g(array2, 0, s.length, false);
        if (Arrays.equals(array2, s)) {
            this.c = true;
            e.n(s.length);
            return true;
        }
        return false;
    }
    
    @Override
    public final void e(final j l) {
        this.l = l;
        this.m = l.i(0, 1);
        l.b();
    }
    
    @Override
    public final boolean f(final i i) throws IOException {
        return this.c((e)i);
    }
    
    @Override
    public final int i(final i i, final t t) throws IOException {
        d0.g(this.m);
        final int a = c0.a;
        final e e = (e)i;
        if (e.d == 0L && !this.c(e)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        if (!this.o) {
            this.o = true;
            final boolean c = this.c;
            String k;
            if (c) {
                k = "audio/amr-wb";
            }
            else {
                k = "audio/3gpp";
            }
            int y;
            if (c) {
                y = 16000;
            }
            else {
                y = 8000;
            }
            final w m = this.m;
            final n.a a2 = new n.a();
            a2.k = k;
            a2.l = db.a.t;
            a2.x = 1;
            a2.y = y;
            m.b(new n(a2));
        }
        Label_0217: {
            if (this.f != 0) {
                break Label_0217;
            }
            while (true) {
                try {
                    final int b = this.b((e)i);
                    this.e = b;
                    this.f = b;
                    if (this.i == -1) {
                        this.h = e.d;
                        this.i = b;
                    }
                    if (this.i == b) {
                        ++this.j;
                    }
                    final int d = this.m.d((f)i, this.f, true);
                    int n;
                    if (d == -1) {
                        n = -1;
                    }
                    else {
                        if ((this.f -= d) <= 0) {
                            this.m.a(this.k + this.d, 1, this.e, 0, (w$a)null);
                            this.d += 20000L;
                        }
                        n = 0;
                    }
                    final long c2 = e.c;
                    if (!this.g) {
                        final int b2 = this.b;
                        if ((b2 & 0x1) != 0x0 && c2 != -1L) {
                            final int j = this.i;
                            if (j == -1 || j == this.e) {
                                if (this.j >= 20 || n == -1) {
                                    final d n2 = new d((int)(j * 8 * 1000000L / 20000L), c2, j, this.h, (b2 & 0x2) != 0x0);
                                    this.n = (u)n2;
                                    this.l.l((u)n2);
                                    this.g = true;
                                    return n;
                                }
                                return n;
                            }
                        }
                        final u.b n3 = new u.b(-9223372036854775807L);
                        this.n = (u)n3;
                        this.l.l((u)n3);
                        this.g = true;
                    }
                    return n;
                }
                catch (final EOFException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public final void release() {
    }
}
