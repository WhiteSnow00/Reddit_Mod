// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.e0$a;
import com.google.common.collect.ImmutableList;
import com.google.android.exoplayer2.v;
import qb.a;
import java.util.List;
import xc.n;
import bc.t;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i$b;

public final class d0
{
    public static final i$b t;
    public final e0 a;
    public final i$b b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final t h;
    public final n i;
    public final List<a> j;
    public final i$b k;
    public final boolean l;
    public final int m;
    public final v n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    
    static {
        t = new i$b(new Object());
    }
    
    public d0(final e0 a, final i$b b, final long c, final long d, final int e, final ExoPlaybackException f, final boolean g, final t h, final n i, final List<a> j, final i$b k, final boolean l, final int m, final v n, final long q, final long r, final long s, final boolean o, final boolean p19) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.q = q;
        this.r = r;
        this.s = s;
        this.o = o;
        this.p = p19;
    }
    
    public static d0 i(final n n) {
        final e0$a f = e0.f;
        final i$b t = d0.t;
        return new d0((e0)f, t, -9223372036854775807L, 0L, 1, null, false, bc.t.i, n, (List<a>)ImmutableList.of(), t, false, 0, v.i, 0L, 0L, 0L, false, false);
    }
    
    public final d0 a(final i$b i$b) {
        return new d0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, i$b, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final d0 b(final i$b i$b, final long n, final long n2, final long n3, final long n4, final t t, final n n5, final List<a> list) {
        return new d0(this.a, i$b, n2, n3, this.e, this.f, this.g, t, n5, list, this.k, this.l, this.m, this.n, this.q, n4, n, this.o, this.p);
    }
    
    public final d0 c(final boolean b) {
        return new d0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, b, this.p);
    }
    
    public final d0 d(final int n, final boolean b) {
        return new d0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, b, n, this.n, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final d0 e(final ExoPlaybackException ex) {
        return new d0(this.a, this.b, this.c, this.d, this.e, ex, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final d0 f(final v v) {
        return new d0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, v, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final d0 g(final int n) {
        return new d0(this.a, this.b, this.c, this.d, n, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final d0 h(final e0 e0) {
        return new d0(e0, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
}
