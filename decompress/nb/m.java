// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import db.w$a;
import bd.c0;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import bd.r;
import java.util.Arrays;
import android.util.Log;
import bd.d0;
import bd.p;
import db.w;
import bd.s;

public final class m implements k
{
    public static final float[] l;
    public final f0 a;
    public final s b;
    public final boolean[] c;
    public final m.m$a d;
    public final nb.s e;
    public m.m$b f;
    public long g;
    public String h;
    public w i;
    public boolean j;
    public long k;
    
    static {
        l = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f };
    }
    
    public m(final f0 a) {
        this.a = a;
        this.c = new boolean[4];
        this.d = new m.m$a();
        this.k = -9223372036854775807L;
        this.e = new nb.s(178);
        this.b = new s();
    }
    
    public final void b() {
        p.a(this.c);
        final m.m$a d = this.d;
        d.a = false;
        d.c = 0;
        d.b = 0;
        final m.m$b f = this.f;
        if (f != null) {
            f.b = false;
            f.c = false;
            f.d = false;
            f.e = -1;
        }
        final nb.s e = this.e;
        if (e != null) {
            e.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
    
    public final void c(final s s) {
        d0.g(this.f);
        d0.g(this.i);
        int b = s.b;
        final int c = s.c;
        final byte[] a = s.a;
        final long g = this.g;
        final int n = c - b;
        this.g = g + n;
        this.i.c(n, s);
        while (true) {
            final int b2 = p.b(a, b, c, this.c);
            if (b2 == c) {
                if (!this.j) {
                    this.d.a(b, c, a);
                }
                this.f.a(b, c, a);
                final nb.s e = this.e;
                if (e != null) {
                    e.a(b, c, a);
                }
                return;
            }
            final byte[] a2 = s.a;
            final int n2 = b2 + 3;
            final int e2 = a2[n2] & 0xFF;
            final int n3 = b2 - b;
            if (!this.j) {
                if (n3 > 0) {
                    this.d.a(b, b2, a);
                }
                int n4;
                if (n3 < 0) {
                    n4 = -n3;
                }
                else {
                    n4 = 0;
                }
                final m.m$a d = this.d;
                final int b3 = d.b;
                boolean b4 = false;
                Label_0472: {
                    if (b3 != 0) {
                        if (b3 != 1) {
                            if (b3 != 2) {
                                if (b3 != 3) {
                                    if (b3 != 4) {
                                        throw new IllegalStateException();
                                    }
                                    if (e2 == 179 || e2 == 181) {
                                        d.c -= n4;
                                        d.a = false;
                                        b4 = true;
                                        break Label_0472;
                                    }
                                }
                                else if ((e2 & 0xF0) != 0x20) {
                                    Log.w("H263Reader", "Unexpected start code value");
                                    d.a = false;
                                    d.c = 0;
                                    d.b = 0;
                                }
                                else {
                                    d.d = d.c;
                                    d.b = 4;
                                }
                            }
                            else if (e2 > 31) {
                                Log.w("H263Reader", "Unexpected start code value");
                                d.a = false;
                                d.c = 0;
                                d.b = 0;
                            }
                            else {
                                d.b = 3;
                            }
                        }
                        else if (e2 != 181) {
                            Log.w("H263Reader", "Unexpected start code value");
                            d.a = false;
                            d.c = 0;
                            d.b = 0;
                        }
                        else {
                            d.b = 2;
                        }
                    }
                    else if (e2 == 176) {
                        d.b = 1;
                        d.a = true;
                    }
                    d.a(0, 3, m.m$a.f);
                    b4 = false;
                }
                if (b4) {
                    final w i = this.i;
                    final m.m$a d2 = this.d;
                    final int d3 = d2.d;
                    final String h = this.h;
                    h.getClass();
                    final byte[] copy = Arrays.copyOf(d2.e, d2.c);
                    final r r = new r(copy, copy.length);
                    r.n(d3);
                    r.n(4);
                    r.l();
                    r.m(8);
                    if (r.f()) {
                        r.m(4);
                        r.m(3);
                    }
                    final int g2 = r.g(4);
                    float t = 0.0f;
                    Label_0676: {
                        if (g2 == 15) {
                            final int g3 = r.g(8);
                            final int g4 = r.g(8);
                            if (g4 != 0) {
                                t = g3 / (float)g4;
                                break Label_0676;
                            }
                            Log.w("H263Reader", "Invalid aspect ratio");
                        }
                        else {
                            final float[] l = m.l;
                            if (g2 < 7) {
                                t = l[g2];
                                break Label_0676;
                            }
                            Log.w("H263Reader", "Invalid aspect ratio");
                        }
                        t = 1.0f;
                    }
                    if (r.f()) {
                        r.m(2);
                        r.m(1);
                        if (r.f()) {
                            r.m(15);
                            r.l();
                            r.m(15);
                            r.l();
                            r.m(15);
                            r.l();
                            r.m(3);
                            r.m(11);
                            r.l();
                            r.m(15);
                            r.l();
                        }
                    }
                    if (r.g(2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    r.l();
                    final int g5 = r.g(16);
                    r.l();
                    if (r.f()) {
                        if (g5 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        }
                        else {
                            int j = g5 - 1;
                            int n5 = 0;
                            while (j > 0) {
                                ++n5;
                                j >>= 1;
                            }
                            r.m(n5);
                        }
                    }
                    r.l();
                    final int g6 = r.g(13);
                    r.l();
                    final int g7 = r.g(13);
                    r.l();
                    r.l();
                    final n$a n$a = new n$a();
                    n$a.a = h;
                    n$a.k = "video/mp4v-es";
                    n$a.p = g6;
                    n$a.q = g7;
                    n$a.t = t;
                    n$a.m = Collections.singletonList(copy);
                    i.a(new n(n$a));
                    this.j = true;
                }
            }
            this.f.a(b, b2, a);
            final nb.s e3 = this.e;
            if (e3 != null) {
                int n6;
                if (n3 > 0) {
                    e3.a(b, b2, a);
                    n6 = 0;
                }
                else {
                    n6 = -n3;
                }
                if (this.e.b(n6)) {
                    final nb.s e4 = this.e;
                    final int e5 = p.e(e4.e, e4.d);
                    final s b5 = this.b;
                    final int a3 = c0.a;
                    b5.z(e5, this.e.d);
                    this.a.a(this.k, this.b);
                }
                if (e2 == 178 && s.a[b2 + 2] == 1) {
                    this.e.d(e2);
                }
            }
            final boolean b6 = true;
            final int n7 = c - b2;
            final long g8 = this.g - n7;
            final m.m$b f = this.f;
            final boolean k = this.j;
            if (f.e == 182 && k && f.b) {
                final long h2 = f.h;
                if (h2 != -9223372036854775807L) {
                    f.a.b(h2, (int)(f.d ? 1 : 0), (int)(g8 - f.g), n7, (w$a)null);
                }
            }
            if (f.e != 179) {
                f.g = g8;
            }
            final m.m$b f2 = this.f;
            final long m = this.k;
            f2.e = e2;
            f2.d = false;
            f2.b = (e2 == 182 || e2 == 179);
            f2.c = (e2 == 182 && b6);
            f2.f = 0;
            f2.h = m;
            b = n2;
        }
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        this.h = e0$d.e;
        e0$d.b();
        final w k = j.k(e0$d.d, 2);
        this.i = k;
        this.f = new m.m$b(k);
        final f0 a = this.a;
        if (a != null) {
            a.b(j, e0$d);
        }
    }
    
    public final void e() {
    }
    
    public final void f(final int n, final long k) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
}
