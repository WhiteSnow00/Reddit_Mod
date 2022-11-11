// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.e0$c;
import com.google.android.exoplayer2.e0$b;
import ec.l;
import java.util.List;
import dc.e;
import java.util.Iterator;
import android.os.SystemClock;
import java.math.RoundingMode;
import com.google.android.exoplayer2.e0;
import ec.f;
import java.util.Map;
import ad.v;
import android.os.Handler$Callback;
import android.os.Looper;
import wa.c0;
import ad.d0;
import java.io.IOException;
import ec.g;
import com.google.android.exoplayer2.q$g;
import com.google.android.exoplayer2.source.i$b;
import va.w;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.q;
import ec.c;
import android.net.Uri;
import com.google.android.exoplayer2.q$e;
import android.os.Handler;
import yc.s;
import com.google.android.exoplayer2.upstream.Loader;
import yc.o;
import androidx.activity.b;
import j5.i;
import com.google.android.exoplayer2.source.a;

public final class DashMediaSource extends a
{
    public final i A;
    public final androidx.activity.b B;
    public final DashMediaSource.DashMediaSource$c C;
    public final o D;
    public com.google.android.exoplayer2.upstream.a E;
    public Loader F;
    public s G;
    public DashManifestStaleException H;
    public Handler I;
    public q$e J;
    public Uri K;
    public Uri L;
    public c M;
    public boolean N;
    public long O;
    public long P;
    public long Q;
    public int R;
    public long S;
    public int T;
    public final q m;
    public final boolean n;
    public final com.google.android.exoplayer2.upstream.a.a o;
    public final com.google.android.exoplayer2.source.dash.a.a p;
    public final dn.a q;
    public final d r;
    public final h s;
    public final dc.a t;
    public final long u;
    public final j.a v;
    public final com.google.android.exoplayer2.upstream.i.a<? extends c> w;
    public final DashMediaSource.DashMediaSource$e x;
    public final Object y;
    public final SparseArray<com.google.android.exoplayer2.source.dash.b> z;
    
    static {
        w.a("goog.exo.dash");
    }
    
    public DashMediaSource(final q m, final com.google.android.exoplayer2.upstream.a.a o, final com.google.android.exoplayer2.upstream.i.a w, final com.google.android.exoplayer2.source.dash.a.a p8, final dn.a q, final d r, final h s, final long u) {
        this.m = m;
        this.J = m.h;
        final q$g g = m.g;
        g.getClass();
        this.K = ((q.f)g).a;
        this.L = ((q.f)m.g).a;
        this.M = null;
        this.o = o;
        this.w = w;
        this.p = p8;
        this.r = r;
        this.s = s;
        this.u = u;
        this.q = q;
        this.t = new dc.a();
        this.n = false;
        this.v = this.n((i$b)null);
        this.y = new Object();
        this.z = (SparseArray<com.google.android.exoplayer2.source.dash.b>)new SparseArray();
        this.C = new DashMediaSource.DashMediaSource$c(this);
        this.S = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        this.x = new DashMediaSource.DashMediaSource$e(this);
        this.D = (o)new DashMediaSource.DashMediaSource$f(this);
        this.A = new i((Object)this, 1);
        this.B = new androidx.activity.b((Object)this, 8);
    }
    
    public static boolean v(final g g) {
        for (int i = 0; i < g.c.size(); ++i) {
            final int b = g.c.get(i).b;
            if (b == 1 || b == 2) {
                return true;
            }
        }
        return false;
    }
    
    public final q c() {
        return this.m;
    }
    
    public final void d() throws IOException {
        this.D.b();
    }
    
    public final com.google.android.exoplayer2.source.h f(final i$b i$b, final yc.b b, long n) {
        final int n2 = (int)((ac.j)i$b).a - this.T;
        n = this.M.b(n2).b;
        final j.a a = new j.a(super.h.c, 0, i$b, n);
        final com.google.android.exoplayer2.drm.c.a a2 = new com.google.android.exoplayer2.drm.c.a(super.i.c, 0, i$b);
        final int n3 = this.T + n2;
        final c m = this.M;
        final dc.a t = this.t;
        final com.google.android.exoplayer2.source.dash.a.a p3 = this.p;
        final s g = this.G;
        final d r = this.r;
        final h s = this.s;
        n = this.Q;
        final o d = this.D;
        final dn.a q = this.q;
        final DashMediaSource.DashMediaSource$c c = this.C;
        final c0 l = super.l;
        d0.g(l);
        final com.google.android.exoplayer2.source.dash.b b2 = new com.google.android.exoplayer2.source.dash.b(n3, m, t, n2, p3, g, r, a2, s, a, n, d, b, q, c, l);
        this.z.put(n3, (Object)b2);
        return (com.google.android.exoplayer2.source.h)b2;
    }
    
    public final void g(final com.google.android.exoplayer2.source.h h) {
        final com.google.android.exoplayer2.source.dash.b b = (com.google.android.exoplayer2.source.dash.b)h;
        final com.google.android.exoplayer2.source.dash.d r = b.r;
        r.n = true;
        r.i.removeCallbacksAndMessages((Object)null);
        final cc.h<com.google.android.exoplayer2.source.dash.a>[] x = b.x;
        for (int length = x.length, i = 0; i < length; ++i) {
            x[i].A((cc.h.h$b<com.google.android.exoplayer2.source.dash.a>)b);
        }
        b.w = null;
        this.z.remove(b.f);
    }
    
    public final void s(final s g) {
        this.G = g;
        this.r.prepare();
        final d r = this.r;
        final Looper myLooper = Looper.myLooper();
        final c0 l = super.l;
        d0.g(l);
        r.c(myLooper, l);
        if (this.n) {
            this.y(false);
        }
        else {
            this.E = this.o.a();
            this.F = new Loader("DashMediaSource");
            this.I = ad.c0.l(null);
            this.z();
        }
    }
    
    public final void u() {
        this.N = false;
        this.E = null;
        final Loader f = this.F;
        if (f != null) {
            f.e(null);
            this.F = null;
        }
        this.O = 0L;
        this.P = 0L;
        c m;
        if (this.n) {
            m = this.M;
        }
        else {
            m = null;
        }
        this.M = m;
        this.K = this.L;
        this.H = null;
        final Handler i = this.I;
        if (i != null) {
            i.removeCallbacksAndMessages((Object)null);
            this.I = null;
        }
        this.Q = -9223372036854775807L;
        this.R = 0;
        this.S = -9223372036854775807L;
        this.T = 0;
        this.z.clear();
        final dc.a t = this.t;
        t.a.clear();
        t.b.clear();
        t.c.clear();
        this.r.release();
    }
    
    public final void w() {
        final Loader f = this.F;
        final DashMediaSource$a dashMediaSource$a = new DashMediaSource$a(this);
        Object b = ad.v.b;
        synchronized (b) {
            final boolean c = ad.v.c;
            monitorexit(b);
            if (c) {
                synchronized (b) {
                    long d;
                    if (ad.v.c) {
                        d = ad.v.d;
                    }
                    else {
                        d = -9223372036854775807L;
                    }
                    monitorexit(b);
                    this.Q = d;
                    this.y(true);
                    return;
                }
            }
            if ((b = f) == null) {
                b = new Loader("SntpClient");
            }
            ((Loader)b).f((Loader.d)new v.c(), (Loader.a<Loader.d>)new v.b(dashMediaSource$a), 1);
        }
    }
    
    public final void x(final com.google.android.exoplayer2.upstream.i<?> i, long a, final long n) {
        a = i.a;
        final yc.q d = i.d;
        final ac.h h = new ac.h(d.c, d.d, d.b);
        this.s.onLoadTaskConcluded(a);
        this.v.d(h, i.c);
    }
    
    public final void y(final boolean b) {
        for (int i = 0; i < this.z.size(); ++i) {
            final int key = this.z.keyAt(i);
            if (key >= this.T) {
                final com.google.android.exoplayer2.source.dash.b b2 = (com.google.android.exoplayer2.source.dash.b)this.z.valueAt(i);
                final c m = this.M;
                final int b3 = key - this.T;
                b2.A = m;
                b2.B = b3;
                final com.google.android.exoplayer2.source.dash.d r = b2.r;
                r.m = false;
                r.k = m;
                final Iterator<Map.Entry<Long, Long>> iterator = r.j.entrySet().iterator();
                while (iterator.hasNext()) {
                    if (((Map.Entry<Long, V>)iterator.next()).getKey() < r.k.h) {
                        iterator.remove();
                    }
                }
                final cc.h<com.google.android.exoplayer2.source.dash.a>[] x = b2.x;
                if (x != null) {
                    for (int length = x.length, j = 0; j < length; ++j) {
                        x[j].j.f(m, b3);
                    }
                    ((com.google.android.exoplayer2.source.q.a<com.google.android.exoplayer2.source.dash.b>)b2.w).i(b2);
                }
                b2.C = m.b(b3).d;
                for (final e e : b2.y) {
                    for (final f f : b2.C) {
                        if (f.a().equals(e.j.a())) {
                            final int c = m.c();
                            e.c(f, m.d && b3 == c - 1);
                            break;
                        }
                    }
                }
            }
        }
        final g b4 = this.M.b(0);
        final int n = this.M.c() - 1;
        final g b5 = this.M.b(n);
        final long e2 = this.M.e(n);
        final long l = ad.c0.J(ad.c0.v(this.Q));
        final long e3 = this.M.e(0);
        final long j2 = ad.c0.J(b4.b);
        final boolean v = v(b4);
        int n2 = 0;
        long max = j2;
        while (n2 < b4.c.size()) {
            final ec.a a = b4.c.get(n2);
            final List c2 = a.c;
            Label_0595: {
                if ((v || a.b != 3) && !c2.isEmpty()) {
                    final dc.b l2 = c2.get(0).l();
                    if (l2 != null) {
                        if (l2.k(e3, l) != 0L) {
                            max = Math.max(max, l2.b(l2.d(e3, l)) + j2);
                            break Label_0595;
                        }
                    }
                    max = j2;
                    break;
                }
            }
            ++n2;
        }
        final long j3 = ad.c0.J(b5.b);
        final boolean v2 = v(b5);
        long min = Long.MAX_VALUE;
        int n3 = 0;
        final g g = b4;
        while (true) {
            for (g g2 = b5; n3 < g2.c.size(); ++n3) {
                final ec.a a2 = g2.c.get(n3);
                final List c3 = a2.c;
                if ((v2 || a2.b != 3) && !c3.isEmpty()) {
                    final dc.b l3 = c3.get(0).l();
                    long n4;
                    if (l3 == null) {
                        n4 = j3 + e2;
                    }
                    else {
                        final long n5 = e2;
                        final long k2 = l3.k(n5, l);
                        if (k2 != 0L) {
                            final long n6 = l3.d(n5, l) + k2 - 1L;
                            min = Math.min(min, l3.c(n6, n5) + (l3.b(n6) + j3));
                            continue;
                        }
                        n4 = j3;
                    }
                    boolean b7 = false;
                    Label_0921: {
                        Label_0919: {
                            if (this.M.d) {
                                int n7 = 0;
                                while (true) {
                                    while (n7 < g2.c.size()) {
                                        final dc.b l4 = g2.c.get(n7).c.get(0).l();
                                        if (l4 != null && !l4.j()) {
                                            ++n7;
                                        }
                                        else {
                                            final boolean b6 = true;
                                            if (!b6) {
                                                b7 = true;
                                                break Label_0921;
                                            }
                                            break Label_0919;
                                        }
                                    }
                                    final boolean b6 = false;
                                    continue;
                                }
                            }
                        }
                        b7 = false;
                    }
                    long max2 = max;
                    if (b7) {
                        final long f2 = this.M.f;
                        max2 = max;
                        if (f2 != -9223372036854775807L) {
                            max2 = Math.max(max, n4 - ad.c0.J(f2));
                        }
                    }
                    final long n8 = n4 - max2;
                    final c m2 = this.M;
                    long n16;
                    long n17;
                    if (m2.d) {
                        d0.f(m2.a != -9223372036854775807L);
                        final long n9 = l - ad.c0.J(this.M.a) - max2;
                        final long u = ad.c0.U(n9);
                        final long h = this.m.h.h;
                        long n10 = 0L;
                        Label_1117: {
                            if (h != -9223372036854775807L) {
                                n10 = Math.min(u, h);
                            }
                            else {
                                final l j4 = this.M.j;
                                if (j4 != null) {
                                    final long c4 = j4.c;
                                    if (c4 != -9223372036854775807L) {
                                        n10 = Math.min(u, c4);
                                        break Label_1117;
                                    }
                                }
                                n10 = u;
                            }
                        }
                        long u2;
                        final long n11 = u2 = ad.c0.U(n9 - n8);
                        if (n11 < 0L) {
                            u2 = n11;
                            if (n10 > 0L) {
                                u2 = 0L;
                            }
                        }
                        final long c5 = this.M.c;
                        long min2 = u2;
                        if (c5 != -9223372036854775807L) {
                            min2 = Math.min(u2 + c5, u);
                        }
                        final long g3 = this.m.h.g;
                        long b8;
                        if (g3 != -9223372036854775807L) {
                            b8 = ad.c0.j(g3, min2, u);
                        }
                        else {
                            final l j5 = this.M.j;
                            b8 = min2;
                            if (j5 != null) {
                                final long b9 = j5.b;
                                b8 = min2;
                                if (b9 != -9223372036854775807L) {
                                    b8 = ad.c0.j(b9, min2, u);
                                }
                            }
                        }
                        long c6 = n10;
                        if (b8 > n10) {
                            c6 = b8;
                        }
                        long n12 = this.J.f;
                        Label_1369: {
                            if (n12 == -9223372036854775807L) {
                                final c m3 = this.M;
                                final l j6 = m3.j;
                                if (j6 != null) {
                                    n12 = j6.a;
                                    if (n12 != -9223372036854775807L) {
                                        break Label_1369;
                                    }
                                }
                                n12 = m3.g;
                                if (n12 == -9223372036854775807L) {
                                    n12 = this.u;
                                }
                            }
                        }
                        long n13 = n12;
                        if (n12 < b8) {
                            n13 = b8;
                        }
                        long j7 = n13;
                        if (n13 > c6) {
                            j7 = ad.c0.j(ad.c0.U(n9 - Math.min(5000000L, n8 / 2L)), b8, c6);
                        }
                        final q$e h2 = this.m.h;
                        float n14 = h2.i;
                        if (n14 == -3.4028235E38f) {
                            final l j8 = this.M.j;
                            if (j8 != null) {
                                n14 = j8.d;
                            }
                            else {
                                n14 = -3.4028235E38f;
                            }
                        }
                        float n15 = h2.j;
                        if (n15 == -3.4028235E38f) {
                            final l j9 = this.M.j;
                            if (j9 != null) {
                                n15 = j9.e;
                            }
                            else {
                                n15 = -3.4028235E38f;
                            }
                        }
                        float e4 = n15;
                        float d = n14;
                        Label_1604: {
                            if (n14 == -3.4028235E38f) {
                                e4 = n15;
                                d = n14;
                                if (n15 == -3.4028235E38f) {
                                    final l j10 = this.M.j;
                                    if (j10 != null) {
                                        e4 = n15;
                                        d = n14;
                                        if (j10.a != -9223372036854775807L) {
                                            break Label_1604;
                                        }
                                    }
                                    e4 = (d = 1.0f);
                                }
                            }
                        }
                        final q$e.a a3 = new q$e.a();
                        a3.a = j7;
                        a3.b = b8;
                        a3.c = c6;
                        a3.d = d;
                        a3.e = e4;
                        this.J = a3.a();
                        final long a4 = this.M.a;
                        final long u3 = ad.c0.U(max2);
                        n16 = n9 - ad.c0.J(this.J.f);
                        final long min3 = Math.min(5000000L, n8 / 2L);
                        if (n16 < min3) {
                            n16 = min3;
                        }
                        n17 = u3 + a4;
                    }
                    else {
                        n17 = -9223372036854775807L;
                        n16 = 0L;
                    }
                    final long j11 = ad.c0.J(g.b);
                    final c m4 = this.M;
                    final long a5 = m4.a;
                    final long q = this.Q;
                    final int t = this.T;
                    final q m5 = this.m;
                    q$e j12;
                    if (m4.d) {
                        j12 = this.J;
                    }
                    else {
                        j12 = null;
                    }
                    this.t((e0)new b(a5, n17, q, t, max2 - j11, n8, n16, m4, m5, j12));
                    if (!this.n) {
                        this.I.removeCallbacks((Runnable)this.B);
                        if (b7) {
                            final Handler i2 = this.I;
                            final androidx.activity.b b10 = this.B;
                            final c m6 = this.M;
                            final long v3 = ad.c0.v(this.Q);
                            final int n18 = m6.c() - 1;
                            final g b11 = m6.b(n18);
                            final long j13 = ad.c0.J(b11.b);
                            final long e5 = m6.e(n18);
                            final long j14 = ad.c0.J(v3);
                            final long j15 = ad.c0.J(m6.a);
                            long j16 = ad.c0.J(5000L);
                            long n20;
                            for (int n19 = 0; n19 < b11.c.size(); ++n19, j16 = n20) {
                                final List c7 = b11.c.get(n19).c;
                                if (c7.isEmpty()) {
                                    n20 = j16;
                                }
                                else {
                                    final dc.b l5 = c7.get(0).l();
                                    n20 = j16;
                                    if (l5 != null) {
                                        final long n21 = l5.e(e5, j14) + (j15 + j13) - j14;
                                        if (n21 >= j16 - 100000L) {
                                            n20 = j16;
                                            if (n21 <= j16) {
                                                continue;
                                            }
                                            n20 = j16;
                                            if (n21 >= j16 + 100000L) {
                                                continue;
                                            }
                                        }
                                        n20 = n21;
                                    }
                                }
                            }
                            final boolean b12 = false;
                            final RoundingMode ceiling = RoundingMode.CEILING;
                            ceiling.getClass();
                            final long n22 = j16 / 1000L;
                            final long n23 = j16 - n22 * 1000L;
                            final long n24 = lcmp(n23, 0L);
                            long n25 = 0L;
                            if (n24 == 0) {
                                n25 = n22;
                            }
                            else {
                                final int n26 = (int)((j16 ^ 0x3E8L) >> 63);
                                final int n27 = 1;
                                final int n28 = n26 | 0x1;
                                int n29 = b12 ? 1 : 0;
                                Label_2311: {
                                    while (true) {
                                        switch (tg.c.a[ceiling.ordinal()]) {
                                            default: {
                                                throw new AssertionError();
                                            }
                                            case 6:
                                            case 7:
                                            case 8: {
                                                final long abs = Math.abs(n23);
                                                final long n30 = lcmp(abs - (Math.abs(1000L) - abs), 0L);
                                                if (n30 == 0) {
                                                    if (ceiling == RoundingMode.HALF_UP) {
                                                        break Label_2311;
                                                    }
                                                    n29 = (b12 ? 1 : 0);
                                                    if (ceiling != RoundingMode.HALF_EVEN) {
                                                        break Label_2335;
                                                    }
                                                    n29 = (b12 ? 1 : 0);
                                                    if ((n22 & 0x1L) != 0x0L) {
                                                        break Label_2311;
                                                    }
                                                    break Label_2335;
                                                }
                                                else {
                                                    n29 = (b12 ? 1 : 0);
                                                    if (n30 > 0) {
                                                        break Label_2311;
                                                    }
                                                    break Label_2335;
                                                }
                                                break;
                                            }
                                            case 5: {
                                                n29 = (b12 ? 1 : 0);
                                                if (n28 > 0) {
                                                    break Label_2311;
                                                }
                                                break Label_2335;
                                            }
                                            case 3: {
                                                n29 = (b12 ? 1 : 0);
                                                if (n28 < 0) {
                                                    break Label_2311;
                                                }
                                                break Label_2335;
                                            }
                                            case 1: {
                                                int n31;
                                                if (n24 == 0) {
                                                    n31 = n27;
                                                }
                                                else {
                                                    n31 = 0;
                                                }
                                                if (n31 != 0) {
                                                    n29 = (b12 ? 1 : 0);
                                                    break Label_2335;
                                                }
                                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                            }
                                            case 2: {
                                                n25 = n22;
                                                if (n29 != 0) {
                                                    n25 = n22 + n28;
                                                    break;
                                                }
                                                break;
                                            }
                                            case 4: {
                                                n29 = 1;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            i2.postDelayed((Runnable)b10, n25);
                        }
                        if (this.N) {
                            this.z();
                        }
                        else if (b) {
                            final c m7 = this.M;
                            if (m7.d) {
                                final long e6 = m7.e;
                                if (e6 != -9223372036854775807L) {
                                    long n32 = e6;
                                    if (e6 == 0L) {
                                        n32 = 5000L;
                                    }
                                    this.I.postDelayed((Runnable)this.A, Math.max(0L, this.O + n32 - SystemClock.elapsedRealtime()));
                                }
                            }
                        }
                    }
                    return;
                }
            }
            long n4 = min;
            continue;
        }
    }
    
    public final void z() {
        this.I.removeCallbacks((Runnable)this.A);
        if (this.F.c()) {
            return;
        }
        if (this.F.d()) {
            this.N = true;
            return;
        }
        Object o = this.y;
        synchronized (o) {
            final Uri k = this.K;
            monitorexit(o);
            this.N = false;
            final com.google.android.exoplayer2.upstream.i i = new com.google.android.exoplayer2.upstream.i(4, k, this.E, (com.google.android.exoplayer2.upstream.i.a)this.w);
            o = this.x;
            this.v.m(new ac.h(i.a, i.b, this.F.f((com.google.android.exoplayer2.upstream.i)i, (Loader.a<com.google.android.exoplayer2.upstream.i>)o, this.s.getMinimumLoadableRetryCount(4))), i.c);
        }
    }
    
    public static final class b extends e0
    {
        public final long g;
        public final long h;
        public final long i;
        public final int j;
        public final long k;
        public final long l;
        public final long m;
        public final c n;
        public final q o;
        public final q$e p;
        
        public b(final long g, final long h, final long i, final int j, final long k, final long l, final long m, final c n, final q o, final q$e p10) {
            final boolean d = n.d;
            final boolean b = true;
            d0.f(d == (p10 != null) && b);
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p10;
        }
        
        public final int b(final Object o) {
            final boolean b = o instanceof Integer;
            final int n = -1;
            if (!b) {
                return -1;
            }
            final int n2 = (int)o - this.j;
            int n3 = n;
            if (n2 >= 0) {
                if (n2 >= this.h()) {
                    n3 = n;
                }
                else {
                    n3 = n2;
                }
            }
            return n3;
        }
        
        public final e0$b f(final int n, final e0$b e0$b, final boolean b) {
            d0.e(n, this.h());
            Object value = null;
            String a;
            if (b) {
                a = this.n.b(n).a;
            }
            else {
                a = null;
            }
            if (b) {
                value = this.j + n;
            }
            final long e = this.n.e(n);
            final long j = ad.c0.J(this.n.b(n).b - this.n.b(0).b);
            final long k = this.k;
            e0$b.getClass();
            e0$b.i((Object)a, value, 0, e, j - k, bc.a.l, false);
            return e0$b;
        }
        
        public final int h() {
            return this.n.c();
        }
        
        public final Object l(final int n) {
            d0.e(n, this.h());
            return this.j + n;
        }
        
        public final e0$c n(int i, final e0$c e0$c, long n) {
            d0.e(i, 1);
            final long m = this.m;
            final c n2 = this.n;
            if (n2.d && n2.e != -9223372036854775807L && n2.b == -9223372036854775807L) {
                i = 1;
            }
            else {
                i = 0;
            }
            Label_0063: {
                if (i != 0) {
                    long n3 = m;
                    if (n > 0L) {
                        n = (n3 = m + n);
                        if (n > this.l) {
                            n = -9223372036854775807L;
                            break Label_0063;
                        }
                    }
                    long n4;
                    long n5;
                    for (n4 = this.k + n3, n5 = n2.e(0), i = 0; i < this.n.c() - 1 && n4 >= n5; n4 -= n5, ++i, n5 = this.n.e(i)) {}
                    final g b = this.n.b(i);
                    final int size = b.c.size();
                    i = 0;
                    while (true) {
                        while (i < size) {
                            if (((ec.a)b.c.get(i)).b == 2) {
                                if (i == -1) {
                                    n = n3;
                                    break Label_0063;
                                }
                                final dc.b l = b.c.get(i).c.get(0).l();
                                n = n3;
                                if (l == null) {
                                    break Label_0063;
                                }
                                if (l.g(n5) == 0L) {
                                    n = n3;
                                    break Label_0063;
                                }
                                n = l.b(l.f(n4, n5)) + n3 - n4;
                                break Label_0063;
                            }
                            else {
                                ++i;
                            }
                        }
                        i = -1;
                        continue;
                    }
                }
                n = m;
            }
            final Object w = e0$c.w;
            final q o = this.o;
            final c n6 = this.n;
            e0$c.c(w, o, (Object)n6, this.g, this.h, this.i, true, n6.d && n6.e != -9223372036854775807L && n6.b == -9223372036854775807L, this.p, n, this.l, 0, this.h() - 1, this.k);
            return e0$c;
        }
        
        public final int o() {
            return 1;
        }
    }
}
