// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import bc.j;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.e;
import com.google.android.exoplayer2.source.f;
import com.google.android.exoplayer2.source.i$b;
import com.google.android.exoplayer2.t$b;
import com.google.android.exoplayer2.t$c;
import android.util.Pair;
import com.google.android.exoplayer2.a;
import zc.b;
import xc.n;
import com.google.android.exoplayer2.t;
import xc.m;
import bc.o;
import com.google.android.exoplayer2.source.h;

public final class z
{
    public final h a;
    public final Object b;
    public final o[] c;
    public boolean d;
    public boolean e;
    public a0 f;
    public boolean g;
    public final boolean[] h;
    public final f0[] i;
    public final m j;
    public final t k;
    public z l;
    public bc.t m;
    public n n;
    public long o;
    
    public z(final f0[] i, long d, final m j, final b b, final t k, final a0 f, final n n) {
        this.i = i;
        this.o = d;
        this.j = j;
        this.k = k;
        final i$b a = f.a;
        this.b = ((j)a).a;
        this.f = f;
        this.m = bc.t.i;
        this.n = n;
        this.c = new o[i.length];
        this.h = new boolean[i.length];
        final long b2 = f.b;
        d = f.d;
        k.getClass();
        final Object a2 = ((j)a).a;
        final int l = com.google.android.exoplayer2.a.j;
        final Pair pair = (Pair)a2;
        final Object first = pair.first;
        final i$b b3 = a.b(pair.second);
        final t$c t$c = k.d.get(first);
        t$c.getClass();
        k.i.add(t$c);
        final t$b t$b = k.h.get(t$c);
        if (t$b != null) {
            t$b.a.h(t$b.b);
        }
        t$c.c.add(b3);
        final f y = t$c.a.y(b3, b, b2);
        k.c.put(y, t$c);
        k.d();
        Object a3 = y;
        if (d != -9223372036854775807L) {
            a3 = new com.google.android.exoplayer2.source.b((h)y, true, 0L, d);
        }
        this.a = (h)a3;
    }
    
    public final long a(final n n, long o, final boolean b, final boolean[] array) {
        int n2 = 0;
        while (true) {
            final int a = n.a;
            boolean b2 = true;
            if (n2 >= a) {
                break;
            }
            final boolean[] h = this.h;
            if (b || !n.a(this.n, n2)) {
                b2 = false;
            }
            h[n2] = b2;
            ++n2;
        }
        final o[] c = this.c;
        int n3 = 0;
        while (true) {
            final f0[] i = this.i;
            if (n3 >= i.length) {
                break;
            }
            if (((e)i[n3]).f == -2) {
                c[n3] = null;
            }
            ++n3;
        }
        this.b();
        this.n = n;
        this.c();
        o = this.a.o(n.c, this.h, this.c, array, o);
        final o[] c2 = this.c;
        int n4 = 0;
        while (true) {
            final f0[] j = this.i;
            if (n4 >= j.length) {
                break;
            }
            if (((e)j[n4]).f == -2 && this.n.b(n4)) {
                c2[n4] = (o)new bc.f();
            }
            ++n4;
        }
        this.e = false;
        int n5 = 0;
        while (true) {
            final o[] c3 = this.c;
            if (n5 >= c3.length) {
                break;
            }
            if (c3[n5] != null) {
                ah0.b.H(n.b(n5));
                if (((e)this.i[n5]).f != -2) {
                    this.e = true;
                }
            }
            else {
                ah0.b.H(n.c[n5] == null);
            }
            ++n5;
        }
        return o;
    }
    
    public final void b() {
        final z l = this.l;
        int n = 0;
        if (l != null) {
            return;
        }
        while (true) {
            final n n2 = this.n;
            if (n >= n2.a) {
                break;
            }
            final boolean b = n2.b(n);
            final xc.e e = this.n.c[n];
            if (b && e != null) {
                e.d();
            }
            ++n;
        }
    }
    
    public final void c() {
        final z l = this.l;
        int n = 0;
        if (l != null) {
            return;
        }
        while (true) {
            final n n2 = this.n;
            if (n >= n2.a) {
                break;
            }
            final boolean b = n2.b(n);
            final xc.e e = this.n.c[n];
            if (b && e != null) {
                e.j();
            }
            ++n;
        }
    }
    
    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long d;
        if (this.e) {
            d = this.a.d();
        }
        else {
            d = Long.MIN_VALUE;
        }
        long e = d;
        if (d == Long.MIN_VALUE) {
            e = this.f.e;
        }
        return e;
    }
    
    public final long e() {
        return this.f.b + this.o;
    }
    
    public final void f() {
        this.b();
        final t k = this.k;
        final h a = this.a;
        try {
            if (a instanceof com.google.android.exoplayer2.source.b) {
                k.g(((com.google.android.exoplayer2.source.b)a).f);
            }
            else {
                k.g(a);
            }
        }
        catch (final RuntimeException ex) {
            ah0.b.U("MediaPeriodHolder", "Period release failed.", (Throwable)ex);
        }
    }
    
    public final n g(final float n, final e0 e0) throws ExoPlaybackException {
        final m j = this.j;
        final f0[] i = this.i;
        final bc.t m = this.m;
        final i$b a = this.f.a;
        final n b = j.b(i, m);
        for (final xc.e e2 : b.c) {
            if (e2 != null) {
                e2.q(n);
            }
        }
        return b;
    }
    
    public final void h() {
        final h a = this.a;
        if (a instanceof com.google.android.exoplayer2.source.b) {
            long d;
            if ((d = this.f.d) == -9223372036854775807L) {
                d = Long.MIN_VALUE;
            }
            final com.google.android.exoplayer2.source.b b = (com.google.android.exoplayer2.source.b)a;
            b.j = 0L;
            b.k = d;
        }
    }
}
