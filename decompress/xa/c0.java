// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import java.util.AbstractCollection;
import java.io.IOException;
import android.os.Handler$Callback;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.w$b;
import java.util.List;
import sa.s;
import f40.z;
import ra.g;
import ra.e;
import bc.i;
import bd.n$a;
import com.google.android.exoplayer2.source.i$b;
import bd.n$b;
import sa.j;
import android.os.Looper;
import bd.k;
import com.google.android.exoplayer2.w;
import bd.n;
import android.util.SparseArray;
import com.google.android.exoplayer2.e0;
import bd.c;

public final class c0 implements a
{
    public final c f;
    public final e0.b g;
    public final e0.c h;
    public final c0.c0$a i;
    public final SparseArray<b$a> j;
    public n<b> k;
    public w l;
    public k m;
    public boolean n;
    
    public c0(final c f) {
        f.getClass();
        this.f = f;
        final int a = bd.c0.a;
        Looper looper = Looper.myLooper();
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.k = (n<b>)new n(looper, f, (n$b)new j(8));
        final e0.b g = new e0.b();
        this.g = g;
        this.h = new e0.c();
        this.i = new c0.c0$a(g);
        this.j = (SparseArray<b$a>)new SparseArray();
    }
    
    public final void A(final int n, final i$b i$b, final int n2) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1022, (n$a<b>)new h((Object)m, n2, 1));
    }
    
    public final void B(final int n, final i$b i$b) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1025, (n$a<b>)new p(m, 1));
    }
    
    public final void C() {
        if (!this.n) {
            final b$a j = this.J();
            this.n = true;
            this.O(j, -1, (n$a<b>)new ia.b(j, 4));
        }
    }
    
    public final void D(final int n, final i$b i$b, final i i) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1004, (n$a<b>)new e(4, m, i));
    }
    
    public final void E(final int n, final i$b i$b) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1026, (n$a<b>)new ra.h(m, 4));
    }
    
    public final void F(final int n, final i$b i$b, final bc.h h, final i i) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1001, (n$a<b>)new d(m, h, i, 1));
    }
    
    public final void G(final int n, final i$b i$b, final Exception ex) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1024, (n$a<b>)new g(3, m, ex));
    }
    
    public final void H(final b b) {
        this.k.a((Object)b);
    }
    
    public final void I(final int n, final i$b i$b) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1027, (n$a<b>)new xa.e(m, 0));
    }
    
    public final b$a J() {
        return this.L(this.i.d);
    }
    
    public final b$a K(final e0 e0, final int n, i$b i$b) {
        if (e0.p()) {
            i$b = null;
        }
        final long d = this.f.d();
        final boolean equals = e0.equals(this.l.I());
        final int n2 = 1;
        final boolean b = equals && n == this.l.S();
        long n3 = 0L;
        if (i$b != null && ((bc.j)i$b).a()) {
            int n4;
            if (b && this.l.k() == ((bc.j)i$b).b && this.l.t() == ((bc.j)i$b).c) {
                n4 = n2;
            }
            else {
                n4 = 0;
            }
            if (n4 != 0) {
                n3 = this.l.getCurrentPosition();
            }
        }
        else if (b) {
            n3 = this.l.Q();
        }
        else if (!e0.p()) {
            n3 = bd.c0.U(e0.m(n, this.h).r);
        }
        return new b$a(d, e0, n, i$b, n3, this.l.I(), this.l.S(), this.i.d, this.l.getCurrentPosition(), this.l.d());
    }
    
    public final b$a L(final i$b i$b) {
        this.l.getClass();
        e0 e0;
        if (i$b == null) {
            e0 = null;
        }
        else {
            e0 = (e0)this.i.c.get((Object)i$b);
        }
        if (i$b != null && e0 != null) {
            return this.K(e0, e0.g(((bc.j)i$b).a, this.g).h, i$b);
        }
        final int s = this.l.S();
        Object o = this.l.I();
        if (s >= ((e0)o).o()) {
            o = com.google.android.exoplayer2.e0.f;
        }
        return this.K((e0)o, s, null);
    }
    
    public final b$a M(final int n, final i$b i$b) {
        this.l.getClass();
        final int n2 = 1;
        boolean b = true;
        if (i$b != null) {
            if (this.i.c.get((Object)i$b) == null) {
                b = false;
            }
            b$a b$a;
            if (b) {
                b$a = this.L(i$b);
            }
            else {
                b$a = this.K((e0)e0.f, n, i$b);
            }
            return b$a;
        }
        Object o = this.l.I();
        int n3;
        if (n < ((e0)o).o()) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 == 0) {
            o = e0.f;
        }
        return this.K((e0)o, n, null);
    }
    
    public final b$a N() {
        return this.L(this.i.f);
    }
    
    public final void O(final b$a b$a, final int n, final n$a<b> n$a) {
        this.j.put(n, (Object)b$a);
        this.k.e(n, (n$a)n$a);
    }
    
    public final void a(final String s) {
        final b$a n = this.N();
        this.O(n, 1019, (n$a<b>)new e(2, n, s));
    }
    
    public final void b(final ab.e e) {
        final b$a n = this.N();
        this.O(n, 1007, (n$a<b>)new g(2, n, e));
    }
    
    public final void c(final String s) {
        final b$a n = this.N();
        this.O(n, 1012, (n$a<b>)new z(4, (Object)n, (Object)s));
    }
    
    public final void d(final ab.e e) {
        final b$a n = this.N();
        this.O(n, 1015, (n$a<b>)new xa.c(2, (Object)n, (Object)e));
    }
    
    public final void e(final com.google.android.exoplayer2.n n, final ab.g g) {
        final b$a n2 = this.N();
        this.O(n2, 1017, (n$a<b>)new s((Object)n2, 3, (Object)n, (Object)g));
    }
    
    public final void f(final ab.e e) {
        final b$a l = this.L(this.i.e);
        this.O(l, 1013, (n$a<b>)new e(5, l, e));
    }
    
    public final void g(final long n, final Object o) {
        final b$a n2 = this.N();
        this.O(n2, 26, (n$a<b>)new xa.s((Object)n2, n, o));
    }
    
    public final void h(final long n, final long n2, final String s) {
        final b$a n3 = this.N();
        this.O(n3, 1008, (n$a<b>)new b0(n3, s, n2, n));
    }
    
    public final void i(final int n, final long n2) {
        final b$a l = this.L(this.i.e);
        this.O(l, 1021, (n$a<b>)new xa.w(l, n, n2));
    }
    
    public final void j(final int n, final long n2) {
        final b$a l = this.L(this.i.e);
        this.O(l, 1018, (n$a<b>)new xa.g(l, n, n2));
    }
    
    public final void k(final com.google.android.exoplayer2.n n, final ab.g g) {
        final b$a n2 = this.N();
        this.O(n2, 1009, (n$a<b>)new qa.b(n2, n, g));
    }
    
    public final void l(final Exception ex) {
        final b$a n = this.N();
        this.O(n, 1029, (n$a<b>)new v(n, ex, 2));
    }
    
    public final void m(final int n, final i$b i$b, final bc.h h, final i i) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1000, (n$a<b>)new o((Object)m, 0, (Object)h, (Object)i));
    }
    
    public final void n(final Exception ex) {
        final b$a n = this.N();
        this.O(n, 1014, (n$a<b>)new v(n, ex, 1));
    }
    
    public final void o(final long n) {
        final b$a n2 = this.N();
        this.O(n2, 1010, (n$a<b>)new sa.o((Object)n2, n));
    }
    
    public final void onAvailableCommandsChanged(final w.a a) {
        final b$a j = this.J();
        this.O(j, 13, (n$a<b>)new z(6, (Object)j, (Object)a));
    }
    
    public final void onCues(final List<nc.a> list) {
        final b$a j = this.J();
        this.O(j, 27, (n$a<b>)new e(7, j, list));
    }
    
    public final void onDeviceInfoChanged(final com.google.android.exoplayer2.i i) {
        final b$a j = this.J();
        this.O(j, 29, (n$a<b>)new z(2, (Object)j, (Object)i));
    }
    
    public final void onDeviceVolumeChanged(final int n, final boolean b) {
        final b$a j = this.J();
        this.O(j, 30, (n$a<b>)new a0(j, n, b));
    }
    
    public final void onEvents(final w w, final w$b w$b) {
    }
    
    public final void onIsLoadingChanged(final boolean b) {
        final b$a j = this.J();
        this.O(j, 3, (n$a<b>)new m(j, b));
    }
    
    public final void onIsPlayingChanged(final boolean b) {
        final b$a j = this.J();
        this.O(j, 7, (n$a<b>)new f((Object)j, b));
    }
    
    public final void onLoadingChanged(final boolean b) {
    }
    
    public final void onMediaItemTransition(final q q, final int n) {
        final b$a j = this.J();
        this.O(j, 1, (n$a<b>)new xa.n(n, (Object)j, (Object)q));
    }
    
    public final void onMediaMetadataChanged(final r r) {
        final b$a j = this.J();
        this.O(j, 14, (n$a<b>)new xa.c(1, (Object)j, (Object)r));
    }
    
    public final void onMetadata(final qb.a a) {
        final b$a j = this.J();
        this.O(j, 28, (n$a<b>)new xa.c(0, (Object)j, (Object)a));
    }
    
    public final void onPlayWhenReadyChanged(final boolean b, final int n) {
        final b$a j = this.J();
        this.O(j, 5, (n$a<b>)new xa.j(j, b, n));
    }
    
    public final void onPlaybackParametersChanged(final com.google.android.exoplayer2.v v) {
        final b$a j = this.J();
        this.O(j, 12, (n$a<b>)new e(6, j, v));
    }
    
    public final void onPlaybackStateChanged(final int n) {
        final b$a j = this.J();
        this.O(j, 4, (n$a<b>)new wa.s(j, n, 1));
    }
    
    public final void onPlaybackSuppressionReasonChanged(final int n) {
        final b$a j = this.J();
        this.O(j, 6, (n$a<b>)new wa.o(j, n, 1));
    }
    
    public final void onPlayerError(final PlaybackException ex) {
        final ExoPlaybackException ex2 = (ExoPlaybackException)ex;
        b$a b$a = null;
        Label_0042: {
            if (ex2 instanceof ExoPlaybackException) {
                final bc.j mediaPeriodId = ex2.mediaPeriodId;
                if (mediaPeriodId != null) {
                    b$a = this.L(new i$b(mediaPeriodId));
                    break Label_0042;
                }
            }
            b$a = this.J();
        }
        this.O(b$a, 10, (n$a<b>)new e(3, b$a, ex));
    }
    
    public final void onPlayerErrorChanged(final PlaybackException ex) {
        final ExoPlaybackException ex2 = (ExoPlaybackException)ex;
        b$a b$a = null;
        Label_0042: {
            if (ex2 instanceof ExoPlaybackException) {
                final bc.j mediaPeriodId = ex2.mediaPeriodId;
                if (mediaPeriodId != null) {
                    b$a = this.L(new i$b(mediaPeriodId));
                    break Label_0042;
                }
            }
            b$a = this.J();
        }
        this.O(b$a, 10, (n$a<b>)new z(3, (Object)b$a, (Object)ex));
    }
    
    public final void onPlayerStateChanged(final boolean b, final int n) {
        final b$a j = this.J();
        this.O(j, -1, (n$a<b>)new a0(j, b, n));
    }
    
    public final void onPositionDiscontinuity(final int n) {
    }
    
    public final void onPositionDiscontinuity(final w.d d, final w.d d2, final int n) {
        if (n == 1) {
            this.n = false;
        }
        final c0.c0$a i = this.i;
        final w l = this.l;
        l.getClass();
        i.d = c0.c0$a.b(l, i.b, i.e, i.a);
        final b$a j = this.J();
        this.O(j, 11, (n$a<b>)new xa.q(j, d, d2, n));
    }
    
    public final void onRenderedFirstFrame() {
    }
    
    public final void onRepeatModeChanged(final int n) {
        final b$a j = this.J();
        this.O(j, 8, (n$a<b>)new h((Object)j, n, 0));
    }
    
    public final void onSeekProcessed() {
        final b$a j = this.J();
        this.O(j, -1, (n$a<b>)new p(j, 0));
    }
    
    public final void onShuffleModeEnabledChanged(final boolean b) {
        final b$a j = this.J();
        this.O(j, 9, (n$a<b>)new xa.z(j, b));
    }
    
    public final void onSkipSilenceEnabledChanged(final boolean b) {
        final b$a n = this.N();
        this.O(n, 23, (n$a<b>)new t(n, b));
    }
    
    public final void onSurfaceSizeChanged(final int n, final int n2) {
        final b$a n3 = this.N();
        this.O(n3, 24, (n$a<b>)new xa.i(n3, n, n2));
    }
    
    public final void onTimelineChanged(final e0 e0, final int n) {
        final c0.c0$a i = this.i;
        final w l = this.l;
        l.getClass();
        i.d = c0.c0$a.b(l, i.b, i.e, i.a);
        i.d(l.I());
        final b$a j = this.J();
        this.O(j, 0, (n$a<b>)new h((Object)j, n, 2));
    }
    
    public final void onTracksChanged(final bc.t t, final xc.i i) {
        final b$a j = this.J();
        this.O(j, 2, (n$a<b>)new y((Object)j, 0, (Object)t, (Object)i));
    }
    
    public final void onTracksInfoChanged(final f0 f0) {
        final b$a j = this.J();
        this.O(j, 2, (n$a<b>)new sa.r(1, (Object)j, (Object)f0));
    }
    
    public final void onVideoSizeChanged(final cd.q q) {
        final b$a n = this.N();
        this.O(n, 25, (n$a<b>)new sa.r(3, (Object)n, (Object)q));
    }
    
    public final void onVolumeChanged(final float n) {
        final b$a n2 = this.N();
        this.O(n2, 22, (n$a<b>)new u(n2, n));
    }
    
    public final void p(final Exception ex) {
        final b$a n = this.N();
        this.O(n, 1030, (n$a<b>)new v(n, ex, 0));
    }
    
    public final void q(final long n, final long n2, final String s) {
        final b$a n3 = this.N();
        this.O(n3, 1016, (n$a<b>)new x(n3, s, n2, n));
    }
    
    public final void r(final int n, final long n2, final long n3) {
        final b$a n4 = this.N();
        this.O(n4, 1011, (n$a<b>)new xa.r(n4, n, n2, n3));
    }
    
    public final void release() {
        final k m = this.m;
        ah0.b.I((Object)m);
        m.i((Runnable)new androidx.activity.k((Object)this, 5));
    }
    
    public final void s(final ab.e e) {
        final b$a l = this.L(this.i.e);
        this.O(l, 1020, (n$a<b>)new z(5, (Object)l, (Object)e));
    }
    
    public final void t(final int n, final long n2, final long n3) {
        final c0.c0$a i = this.i;
        i$b i$b;
        if (((AbstractCollection)i.b).isEmpty()) {
            i$b = null;
        }
        else {
            i$b = (i$b)cg.d.Q2((Iterable)i.b);
        }
        final b$a l = this.L(i$b);
        this.O(l, 1006, (n$a<b>)new l(l, n, n2, n3));
    }
    
    public final void u(final ImmutableList list, final i$b f) {
        final c0.c0$a i = this.i;
        final w l = this.l;
        l.getClass();
        i.getClass();
        i.b = ImmutableList.copyOf((Collection)list);
        if (!((List)list).isEmpty()) {
            i.e = ((List<i$b>)list).get(0);
            f.getClass();
            i.f = f;
        }
        if (i.d == null) {
            i.d = c0.c0$a.b(l, i.b, i.e, i.a);
        }
        i.d(l.I());
    }
    
    public final void v(final w l, final Looper looper) {
        ah0.b.H(this.l == null || ((AbstractCollection)this.i.b).isEmpty());
        l.getClass();
        this.l = l;
        this.m = (k)this.f.c(looper, (Handler$Callback)null);
        final n<b> k = this.k;
        this.k = (n<b>)new n(k.d, looper, k.a, (n$b)new xa.c(3, (Object)this, (Object)l));
    }
    
    public final void w(final int n, final i$b i$b, final i i) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1005, (n$a<b>)new sa.r(2, (Object)m, (Object)i));
    }
    
    public final void x(final int n, final i$b i$b, final bc.h h, final i i) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1002, (n$a<b>)new d(m, h, i, 0));
    }
    
    public final void y(final int n, final i$b i$b, final bc.h h, final i i, final IOException ex, final boolean b) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1003, (n$a<b>)new xa.k(m, h, i, ex, b));
    }
    
    public final void z(final int n, final i$b i$b) {
        final b$a m = this.M(n, i$b);
        this.O(m, 1023, (n$a<b>)new m3.a((Object)m, 5));
    }
}
