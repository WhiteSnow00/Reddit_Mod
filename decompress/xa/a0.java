// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import java.util.AbstractCollection;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.CopyOnWriteArraySet;
import android.os.Handler$Callback;
import androidx.appcompat.widget.a1;
import bd.d0;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.e0;
import bc.j;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.w$b;
import java.util.List;
import wa.p;
import java.io.IOException;
import sa.t;
import bc.i;
import com.google.android.exoplayer2.source.i$b;
import com.google.android.exoplayer2.n;
import g60.c1;
import wa.o;
import ra.g;
import sa.r;
import ra.h;
import g60.b1;
import ab.e;
import android.os.Looper;
import bd.c0;
import bd.k;
import com.google.android.exoplayer2.w;
import bd.m;
import android.util.SparseArray;
import com.google.android.exoplayer2.e0$c;
import com.google.android.exoplayer2.e0$b;
import bd.c;

public final class a0 implements xa.a
{
    public final c f;
    public final e0$b g;
    public final e0$c h;
    public final a i;
    public final SparseArray<b.a> j;
    public m<b> k;
    public w l;
    public k m;
    public boolean n;
    
    public a0(final c f) {
        f.getClass();
        this.f = f;
        final int a = c0.a;
        Looper looper = Looper.myLooper();
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.k = new m<b>(looper, f, new ka.k(7));
        final e0$b g = new e0$b();
        this.g = g;
        this.h = new e0$c();
        this.i = new a(g);
        this.j = (SparseArray<b.a>)new SparseArray();
    }
    
    @Override
    public final void A1(final int n, final long n2, final long n3) {
        final b.a s = this.s();
        this.t(s, 1011, new l(s, n, n2, n3, 1));
    }
    
    @Override
    public final void C1(final e e) {
        final b.a q = this.q(this.i.e);
        this.t(q, 1020, (m.a<b>)new b1(1, (Object)q, (Object)e));
    }
    
    @Override
    public final void G0(final Exception ex) {
        final b.a s = this.s();
        this.t(s, 1014, new h(3, s, ex));
    }
    
    @Override
    public final void I0(final long n) {
        final b.a s = this.s();
        this.t(s, 1010, (m.a<b>)new r((Object)s, n));
    }
    
    @Override
    public final void J0(final Exception ex) {
        final b.a s = this.s();
        this.t(s, 1030, new g(4, s, ex));
    }
    
    @Override
    public final void N8() {
        if (!this.n) {
            final b.a o = this.o();
            this.n = true;
            this.t(o, -1, new o(o, 3));
        }
    }
    
    @Override
    public final void Q(final e e) {
        final b.a s = this.s();
        this.t(s, 1015, (m.a<b>)new c1(1, (Object)s, (Object)e));
    }
    
    @Override
    public final void U(final n n, final ab.g g) {
        final b.a s = this.s();
        this.t(s, 1017, new xa.h(s, n, g, 1));
    }
    
    @Override
    public final void W(final e e) {
        final b.a q = this.q(this.i.e);
        this.t(q, 1013, new g(7, q, e));
    }
    
    @Override
    public final void X(final long n, final Object o) {
        final b.a s = this.s();
        this.t(s, 26, new s(s, o, n));
    }
    
    @Override
    public final void Yb(final b b) {
        this.k.a(b);
    }
    
    public final void a(final int n, final long n2, final long n3) {
        final a i = this.i;
        i$b i$b;
        if (((AbstractCollection)i.b).isEmpty()) {
            i$b = null;
        }
        else {
            i$b = (i$b)a80.a.R((Iterable)i.b);
        }
        final b.a q = this.q(i$b);
        this.t(q, 1006, new l(q, n, n2, n3, 0));
    }
    
    public final void b(final int n, final i$b i$b, final bc.h h, final i i) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1000, new xa.o(r, h, i, 0));
    }
    
    @Override
    public final void b0(final long n, final long n2, final String s) {
        final b.a s2 = this.s();
        this.t(s2, 1008, new xa.c(s2, s, n2, n));
    }
    
    public final void c(final int n, final i$b i$b, final i i) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1005, new xa.e(r, i, 1));
    }
    
    public final void d(final int n, final i$b i$b, final bc.h h, final i i) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1002, (m.a<b>)new t((Object)r, (Object)h, (Object)i));
    }
    
    @Override
    public final void d0(final int n, final long n2) {
        final b.a q = this.q(this.i.e);
        this.t(q, 1021, new v(q, n, n2));
    }
    
    public final void e(final int n, final i$b i$b, final bc.h h, final i i, final IOException ex, final boolean b) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1003, new xa.k(r, h, i, ex, b));
    }
    
    public final void f(final int n, final i$b i$b) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1023, new q(r, 1));
    }
    
    public final void g(final int n, final i$b i$b, final int n2) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1022, new p(r, n2, 2));
    }
    
    public final void h(final int n, final i$b i$b) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1025, new m3.c(r, 7));
    }
    
    public final void i(final int n, final i$b i$b, final i i) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1004, new xa.e(r, i, 0));
    }
    
    public final void j(final int n, final i$b i$b) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1026, new xa.d(r, 1));
    }
    
    @Override
    public final void k(final String s) {
        final b.a s2 = this.s();
        this.t(s2, 1019, new g(5, s2, s));
    }
    
    public final void l(final int n, final i$b i$b, final bc.h h, final i i) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1001, new xa.o(r, h, i, 1));
    }
    
    public final void m(final int n, final i$b i$b, final Exception ex) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1024, (m.a<b>)new b1(2, (Object)r, (Object)ex));
    }
    
    @Override
    public final void m0(final int n, final long n2) {
        final b.a q = this.q(this.i.e);
        this.t(q, 1018, new xa.g(q, n, n2));
    }
    
    public final void n(final int n, final i$b i$b) {
        final b.a r = this.r(n, i$b);
        this.t(r, 1027, new xa.d(r, 0));
    }
    
    @Override
    public final void n0(final n n, final ab.g g) {
        final b.a s = this.s();
        this.t(s, 1009, new xa.h(s, n, g, 0));
    }
    
    public final b.a o() {
        return this.q(this.i.d);
    }
    
    public final void onAvailableCommandsChanged(final w.a a) {
        final b.a o = this.o();
        this.t(o, 13, new g(6, o, a));
    }
    
    public final void onCues(final List<nc.a> list) {
        final b.a o = this.o();
        this.t(o, 27, new ra.e(2, o, list));
    }
    
    public final void onDeviceInfoChanged(final com.google.android.exoplayer2.i i) {
        final b.a o = this.o();
        this.t(o, 29, (m.a<b>)new b1(0, (Object)o, (Object)i));
    }
    
    public final void onDeviceVolumeChanged(final int n, final boolean b) {
        final b.a o = this.o();
        this.t(o, 30, new z(o, n, b));
    }
    
    public final void onEvents(final w w, final w$b w$b) {
    }
    
    public final void onIsLoadingChanged(final boolean b) {
        final b.a o = this.o();
        this.t(o, 3, new xa.n(o, b));
    }
    
    public final void onIsPlayingChanged(final boolean b) {
        final b.a o = this.o();
        this.t(o, 7, new y(o, b, 1));
    }
    
    public final void onLoadingChanged(final boolean b) {
    }
    
    public final void onMediaItemTransition(final com.google.android.exoplayer2.q q, final int n) {
        final b.a o = this.o();
        this.t(o, 1, new ra.d(n, 2, o, q));
    }
    
    public final void onMediaMetadataChanged(final com.google.android.exoplayer2.r r) {
        final b.a o = this.o();
        this.t(o, 14, (m.a<b>)new m10.l(0, (Object)o, (Object)r));
    }
    
    public final void onMetadata(final qb.a a) {
        final b.a o = this.o();
        this.t(o, 28, new g(3, o, a));
    }
    
    public final void onPlayWhenReadyChanged(final boolean b, final int n) {
        final b.a o = this.o();
        this.t(o, 5, new z(o, b, n));
    }
    
    public final void onPlaybackParametersChanged(final com.google.android.exoplayer2.v v) {
        final b.a o = this.o();
        this.t(o, 12, (m.a<b>)new m10.l(3, (Object)o, (Object)v));
    }
    
    public final void onPlaybackStateChanged(final int n) {
        final b.a o = this.o();
        this.t(o, 4, new u(o, n, 0));
    }
    
    public final void onPlaybackSuppressionReasonChanged(final int n) {
        final b.a o = this.o();
        this.t(o, 6, new u(o, n, 1));
    }
    
    public final void onPlayerError(final PlaybackException ex) {
        final ExoPlaybackException ex2 = (ExoPlaybackException)ex;
        b.a a = null;
        Label_0042: {
            if (ex2 instanceof ExoPlaybackException) {
                final j mediaPeriodId = ex2.mediaPeriodId;
                if (mediaPeriodId != null) {
                    a = this.q(new i$b(mediaPeriodId));
                    break Label_0042;
                }
            }
            a = this.o();
        }
        this.t(a, 10, new x(a, ex2, 1));
    }
    
    public final void onPlayerErrorChanged(final PlaybackException ex) {
        final ExoPlaybackException ex2 = (ExoPlaybackException)ex;
        b.a a = null;
        Label_0042: {
            if (ex2 instanceof ExoPlaybackException) {
                final j mediaPeriodId = ex2.mediaPeriodId;
                if (mediaPeriodId != null) {
                    a = this.q(new i$b(mediaPeriodId));
                    break Label_0042;
                }
            }
            a = this.o();
        }
        this.t(a, 10, new x(a, ex2, 0));
    }
    
    public final void onPlayerStateChanged(final boolean b, final int n) {
        final b.a o = this.o();
        this.t(o, -1, new f(o, b, n));
    }
    
    public final void onPositionDiscontinuity(final int n) {
    }
    
    public final void onPositionDiscontinuity(final w.d d, final w.d d2, final int n) {
        if (n == 1) {
            this.n = false;
        }
        final a i = this.i;
        final w l = this.l;
        l.getClass();
        i.d = a.b(l, i.b, i.e, i.a);
        final b.a o = this.o();
        this.t(o, 11, new xa.r(o, d, d2, n));
    }
    
    public final void onRenderedFirstFrame() {
    }
    
    public final void onRepeatModeChanged(final int n) {
        final b.a o = this.o();
        this.t(o, 8, new xa.i(o, n));
    }
    
    public final void onSeekProcessed() {
        final b.a o = this.o();
        this.t(o, -1, new q(o, 0));
    }
    
    public final void onShuffleModeEnabledChanged(final boolean b) {
        final b.a o = this.o();
        this.t(o, 9, new y(o, b, 0));
    }
    
    public final void onSkipSilenceEnabledChanged(final boolean b) {
        final b.a s = this.s();
        this.t(s, 23, new xa.t(s, b));
    }
    
    public final void onSurfaceSizeChanged(final int n, final int n2) {
        final b.a s = this.s();
        this.t(s, 24, new xa.j(s, n, n2));
    }
    
    public final void onTimelineChanged(final e0 e0, final int n) {
        final a i = this.i;
        final w l = this.l;
        l.getClass();
        i.d = a.b(l, i.b, i.e, i.a);
        i.d(l.I());
        final b.a o = this.o();
        this.t(o, 0, new xa.p(o, n));
    }
    
    public final void onTracksChanged(final bc.u u, final xc.j j) {
        final b.a o = this.o();
        this.t(o, 2, (m.a<b>)new a40.a((Object)o, 0, (Object)u, (Object)j));
    }
    
    public final void onTracksInfoChanged(final f0 f0) {
        final b.a o = this.o();
        this.t(o, 2, (m.a<b>)new m10.l(1, (Object)o, (Object)f0));
    }
    
    public final void onVideoSizeChanged(final cd.q q) {
        final b.a s = this.s();
        this.t(s, 25, new ra.e(3, s, q));
    }
    
    public final void onVolumeChanged(final float n) {
        final b.a s = this.s();
        this.t(s, 22, new xa.m(s, n));
    }
    
    public final b.a p(final e0 e0, final int n, i$b i$b) {
        if (e0.p()) {
            i$b = null;
        }
        final long d = this.f.d();
        final boolean equals = e0.equals((Object)this.l.I());
        final int n2 = 1;
        final boolean b = equals && n == this.l.S();
        long n3 = 0L;
        if (i$b != null && ((j)i$b).a()) {
            int n4;
            if (b && this.l.k() == ((j)i$b).b && this.l.t() == ((j)i$b).c) {
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
            n3 = c0.U(e0.m(n, this.h).r);
        }
        return new b.a(d, e0, n, i$b, n3, this.l.I(), this.l.S(), this.i.d, this.l.getCurrentPosition(), this.l.d());
    }
    
    @Override
    public final void p4(final ImmutableList list, final i$b f) {
        final a i = this.i;
        final w l = this.l;
        l.getClass();
        i.getClass();
        i.b = (ImmutableList<i$b>)ImmutableList.copyOf((Collection)list);
        if (!((List)list).isEmpty()) {
            i.e = ((List<i$b>)list).get(0);
            f.getClass();
            i.f = f;
        }
        if (i.d == null) {
            i.d = a.b(l, i.b, i.e, i.a);
        }
        i.d(l.I());
    }
    
    public final b.a q(final i$b i$b) {
        this.l.getClass();
        e0 e0;
        if (i$b == null) {
            e0 = null;
        }
        else {
            e0 = (e0)this.i.c.get((Object)i$b);
        }
        if (i$b != null && e0 != null) {
            return this.p(e0, e0.g(((j)i$b).a, this.g).h, i$b);
        }
        final int s = this.l.S();
        Object o = this.l.I();
        if (s >= ((e0)o).o()) {
            o = com.google.android.exoplayer2.e0.f;
        }
        return this.p((e0)o, s, null);
    }
    
    @Override
    public final void q0(final Exception ex) {
        final b.a s = this.s();
        this.t(s, 1029, (m.a<b>)new m10.l(2, (Object)s, (Object)ex));
    }
    
    public final b.a r(final int n, final i$b i$b) {
        this.l.getClass();
        final int n2 = 1;
        boolean b = true;
        if (i$b != null) {
            if (this.i.c.get((Object)i$b) == null) {
                b = false;
            }
            b.a a;
            if (b) {
                a = this.q(i$b);
            }
            else {
                a = this.p((e0)e0.f, n, i$b);
            }
            return a;
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
        return this.p((e0)o, n, null);
    }
    
    @Override
    public final void release() {
        final k m = this.m;
        d0.g(m);
        m.i(new a1(this, 5));
    }
    
    public final b.a s() {
        return this.q(this.i.f);
    }
    
    public final void t(final b.a a, final int n, final m.a<b> a2) {
        this.j.put(n, (Object)a);
        this.k.e(n, a2);
    }
    
    @Override
    public final void v4(final w l, final Looper looper) {
        d0.f(this.l == null || ((AbstractCollection)this.i.b).isEmpty());
        l.getClass();
        this.l = l;
        this.m = this.f.c(looper, null);
        final m<b> k = this.k;
        this.k = new m<b>((CopyOnWriteArraySet<m.c<Object>>)k.d, looper, k.a, new h(2, this, l));
    }
    
    @Override
    public final void x(final e e) {
        final b.a s = this.s();
        this.t(s, 1007, new ra.e(1, s, e));
    }
    
    @Override
    public final void y(final String s) {
        final b.a s2 = this.s();
        this.t(s2, 1012, (m.a<b>)new c1(2, (Object)s2, (Object)s));
    }
    
    @Override
    public final void y1(final long n, final long n2, final String s) {
        final b.a s2 = this.s();
        this.t(s2, 1016, new xa.w(s2, s, n2, n));
    }
    
    public static final class a
    {
        public final e0$b a;
        public ImmutableList<i$b> b;
        public ImmutableMap<i$b, e0> c;
        public i$b d;
        public i$b e;
        public i$b f;
        
        public a(final e0$b a) {
            this.a = a;
            this.b = (ImmutableList<i$b>)ImmutableList.of();
            this.c = (ImmutableMap<i$b, e0>)ImmutableMap.of();
        }
        
        public static i$b b(final w w, final ImmutableList<i$b> list, final i$b i$b, final e0$b e0$b) {
            final e0 i = w.I();
            final int r = w.r();
            Object l;
            if (i.p()) {
                l = null;
            }
            else {
                l = i.l(r);
            }
            int b;
            if (!w.b() && !i.p()) {
                b = i.f(r, e0$b, false).b(c0.J(w.getCurrentPosition()) - e0$b.j);
            }
            else {
                b = -1;
            }
            for (int j = 0; j < ((AbstractCollection)list).size(); ++j) {
                final i$b i$b2 = ((List<i$b>)list).get(j);
                if (c(i$b2, l, w.b(), w.k(), w.t(), b)) {
                    return i$b2;
                }
            }
            if (((AbstractCollection)list).isEmpty() && i$b != null && c(i$b, l, w.b(), w.k(), w.t(), b)) {
                return i$b;
            }
            return null;
        }
        
        public static boolean c(final i$b i$b, final Object o, final boolean b, final int n, final int n2, final int n3) {
            final boolean equals = ((j)i$b).a.equals(o);
            final boolean b2 = false;
            if (!equals) {
                return false;
            }
            if (!b || ((j)i$b).b != n || ((j)i$b).c != n2) {
                boolean b3 = b2;
                if (b) {
                    return b3;
                }
                b3 = b2;
                if (((j)i$b).b != -1) {
                    return b3;
                }
                b3 = b2;
                if (((j)i$b).e != n3) {
                    return b3;
                }
            }
            return true;
        }
        
        public final void a(final ImmutableMap$b<i$b, e0> immutableMap$b, final i$b i$b, e0 e0) {
            if (i$b == null) {
                return;
            }
            if (e0.b(((j)i$b).a) != -1) {
                immutableMap$b.b((Object)i$b, (Object)e0);
            }
            else {
                e0 = (e0)this.c.get((Object)i$b);
                if (e0 != null) {
                    immutableMap$b.b((Object)i$b, (Object)e0);
                }
            }
        }
        
        public final void d(final e0 e0) {
            final ImmutableMap$b builder = ImmutableMap.builder();
            if (((AbstractCollection)this.b).isEmpty()) {
                this.a((ImmutableMap$b<i$b, e0>)builder, this.e, e0);
                if (!yl.a.d0((Object)this.f, (Object)this.e)) {
                    this.a((ImmutableMap$b<i$b, e0>)builder, this.f, e0);
                }
                if (!yl.a.d0((Object)this.d, (Object)this.e) && !yl.a.d0((Object)this.d, (Object)this.f)) {
                    this.a((ImmutableMap$b<i$b, e0>)builder, this.d, e0);
                }
            }
            else {
                for (int i = 0; i < ((AbstractCollection)this.b).size(); ++i) {
                    this.a((ImmutableMap$b<i$b, e0>)builder, this.b.get(i), e0);
                }
                if (!this.b.contains((Object)this.d)) {
                    this.a((ImmutableMap$b<i$b, e0>)builder, this.d, e0);
                }
            }
            this.c = (ImmutableMap<i$b, e0>)builder.a(true);
        }
    }
}
