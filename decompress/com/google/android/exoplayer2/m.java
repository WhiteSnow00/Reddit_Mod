// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import com.google.common.collect.ImmutableCollection$a;
import pb.a$b;
import com.google.common.collect.ImmutableList$a;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import android.os.Message;
import java.io.IOException;
import va.f0;
import yc.b;
import android.os.SystemClock;
import ac.q;
import java.util.concurrent.atomic.AtomicBoolean;
import android.util.Log;
import wc.f;
import java.util.Iterator;
import ad.w;
import java.util.List;
import com.google.common.collect.ImmutableList;
import ac.u;
import com.google.android.exoplayer2.source.i$b;
import va.y;
import ad.d0;
import mc.l;
import android.util.Pair;
import android.os.Handler;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import g50.j;
import wa.a;
import ad.c;
import java.util.ArrayList;
import android.os.Looper;
import android.os.HandlerThread;
import ad.k;
import yc.d;
import wc.o;
import va.e0;
import java.util.Set;
import va.c0;
import va.h0;
import wc.n;
import com.google.android.exoplayer2.source.h$a;
import android.os.Handler$Callback;

public final class m implements Handler$Callback, h$a, n.a, t.d, h.a, x.a
{
    public final long A;
    public h0 B;
    public c0 C;
    public d D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public g P;
    public long Q;
    public int R;
    public boolean S;
    public ExoPlaybackException T;
    public long U;
    public final z[] f;
    public final Set<z> g;
    public final e0[] h;
    public final n i;
    public final o j;
    public final va.x k;
    public final yc.d l;
    public final k m;
    public final HandlerThread n;
    public final Looper o;
    public final e0$c p;
    public final e0$b q;
    public final long r;
    public final boolean s;
    public final h t;
    public final ArrayList<c> u;
    public final ad.c v;
    public final e w;
    public final s x;
    public final t y;
    public final p z;
    
    public m(final z[] f, final n i, final o j, final va.x k, final yc.d d, int l, final boolean m, final wa.a a, final h0 b, final com.google.android.exoplayer2.g z, final long a2, final boolean f2, final Looper looper, final ad.c v, final j w, final wa.c0 c0) {
        this.w = (e)w;
        this.f = f;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = d;
        this.J = l;
        this.K = m;
        this.B = b;
        this.z = (p)z;
        this.A = a2;
        this.F = f2;
        this.v = v;
        this.U = -9223372036854775807L;
        this.r = k.getBackBufferDurationUs();
        this.s = k.retainBackBufferFromKeyframe();
        final c0 i2 = c0.i(j);
        this.C = i2;
        this.D = new d(i2);
        this.h = new e0[f.length];
        for (l = 0; l < f.length; ++l) {
            f[l].q(l, c0);
            this.h[l] = (e0)f[l].t();
        }
        this.t = new h((h.a)this, v);
        this.u = new ArrayList<c>();
        this.g = Collections.newSetFromMap(new IdentityHashMap<z, Boolean>());
        this.p = new e0$c();
        this.q = new e0$b();
        i.a = (n.a)this;
        i.b = d;
        this.S = true;
        final Handler handler = new Handler(looper);
        this.x = new s(a, handler);
        this.y = new t((t.d)this, a, handler, c0);
        final HandlerThread n = new HandlerThread("ExoPlayer:Playback", -16);
        ((Thread)(this.n = n)).start();
        final Looper looper2 = n.getLooper();
        this.o = looper2;
        this.m = v.c(looper2, (Handler$Callback)this);
    }
    
    public static Pair<Object, Long> F(final com.google.android.exoplayer2.e0 e0, final g g, final boolean b, final int n, final boolean b2, final e0$c e0$c, final e0$b e0$b) {
        com.google.android.exoplayer2.e0 a = g.a;
        if (e0.p()) {
            return null;
        }
        if (a.p()) {
            a = e0;
        }
        try {
            final Pair i = a.i(e0$c, e0$b, g.b, g.c);
            if (e0.equals((Object)a)) {
                return (Pair<Object, Long>)i;
            }
            if (e0.b(i.first) != -1) {
                Pair j = i;
                if (a.g(i.first, e0$b).k) {
                    j = i;
                    if (a.m(e0$b.h, e0$c).t == a.b(i.first)) {
                        j = e0.i(e0$c, e0$b, e0.g(i.first, e0$b).h, g.c);
                    }
                }
                return (Pair<Object, Long>)j;
            }
            if (b) {
                final Object g2 = G(e0$c, e0$b, n, b2, i.first, a, e0);
                if (g2 != null) {
                    return (Pair<Object, Long>)e0.i(e0$c, e0$b, e0.g(g2, e0$b).h, -9223372036854775807L);
                }
            }
            return null;
        }
        catch (final IndexOutOfBoundsException ex) {
            return null;
        }
    }
    
    public static Object G(final e0$c e0$c, final e0$b e0$b, final int n, final boolean b, final Object o, final com.google.android.exoplayer2.e0 e0, final com.google.android.exoplayer2.e0 e2) {
        int n2;
        int h;
        int n3;
        int b2;
        for (n2 = e0.b(o), h = e0.h(), n3 = 0, b2 = -1; n3 < h && b2 == -1; b2 = e2.b(e0.l(n2)), ++n3) {
            n2 = e0.d(n2, e0$b, e0$c, n, b);
            if (n2 == -1) {
                break;
            }
        }
        Object l;
        if (b2 == -1) {
            l = null;
        }
        else {
            l = e2.l(b2);
        }
        return l;
    }
    
    public static void M(final z z, final long f) {
        z.p();
        if (z instanceof l) {
            final l l = (l)z;
            d0.f(l.p);
            l.F = f;
        }
    }
    
    public static boolean r(final z z) {
        return z.getState() != 0;
    }
    
    public final void A() throws ExoPlaybackException {
        final float f = this.t.c().f;
        final s x = this.x;
        y y = x.h;
        final y i = x.i;
        int n = 1;
        while (y != null && y.d) {
            final o g = y.g(f, this.C.a);
            final o n2 = y.n;
            boolean b = false;
            Label_0130: {
                Label_0127: {
                    if (n2 != null) {
                        if (n2.c.length == g.c.length) {
                            for (int j = 0; j < g.c.length; ++j) {
                                if (!g.a(n2, j)) {
                                    break Label_0127;
                                }
                            }
                            b = true;
                            break Label_0130;
                        }
                    }
                }
                b = false;
            }
            if (!b) {
                if (n != 0) {
                    final s x2 = this.x;
                    final y h = x2.h;
                    final boolean l = x2.l(h);
                    final boolean[] array = new boolean[this.f.length];
                    final long a = h.a(g, this.C.s, l, array);
                    final c0 c = this.C;
                    final boolean b2 = c.e != 4 && a != c.s;
                    final c0 c2 = this.C;
                    this.C = this.p(c2.b, a, c2.c, c2.d, b2, 5);
                    if (b2) {
                        this.D(a);
                    }
                    final boolean[] array2 = new boolean[this.f.length];
                    int n3 = 0;
                    while (true) {
                        final z[] f2 = this.f;
                        if (n3 >= f2.length) {
                            break;
                        }
                        final z z = f2[n3];
                        final boolean r = r(z);
                        array2[n3] = r;
                        final ac.p p = h.c[n3];
                        if (r) {
                            if (p != z.getStream()) {
                                this.b(z);
                            }
                            else if (array[n3]) {
                                z.n(this.Q);
                            }
                        }
                        ++n3;
                    }
                    this.d(array2);
                }
                else {
                    this.x.l(y);
                    if (y.d) {
                        y.a(g, Math.max(y.f.b, this.Q - y.o), false, new boolean[y.i.length]);
                    }
                }
                this.l(true);
                if (this.C.e != 4) {
                    this.t();
                    this.d0();
                    this.m.k(2);
                }
                return;
            }
            if (y == i) {
                n = 0;
            }
            y = y.l;
        }
    }
    
    public final void B(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.m.h();
        final ExoPlaybackException ex = null;
        this.T = null;
        this.H = false;
        final h t = this.t;
        t.k = false;
        final w f = t.f;
        if (f.g) {
            f.a(f.u());
            f.g = false;
        }
        this.Q = 1000000000000L;
        for (final z z : this.f) {
            Label_0127: {
                try {
                    this.b(z);
                    break Label_0127;
                }
                catch (final RuntimeException z) {}
                catch (final ExoPlaybackException ex2) {}
                lg.e0.I("ExoPlayerImplInternal", "Disable failed.", (Throwable)z);
            }
        }
        if (b) {
            for (final z z2 : this.f) {
                if (this.g.remove(z2)) {
                    try {
                        z2.reset();
                    }
                    catch (final RuntimeException ex3) {
                        lg.e0.I("ExoPlayerImplInternal", "Reset failed.", (Throwable)ex3);
                    }
                }
            }
        }
        this.O = 0;
        final c0 c = this.C;
        i$b b5 = c.b;
        long s = c.s;
        final boolean a = ((ac.j)this.C.b).a();
        final int n = 1;
        long n2 = 0L;
        Label_0344: {
            if (!a) {
                final c0 c2 = this.C;
                final e0$b q = this.q;
                final i$b b6 = c2.b;
                final com.google.android.exoplayer2.e0 a2 = c2.a;
                if (!a2.p() && !a2.g(((ac.j)b6).a, q).k) {
                    n2 = this.C.s;
                    break Label_0344;
                }
            }
            n2 = this.C.c;
        }
        int n4 = 0;
        Label_0443: {
            if (b2) {
                this.P = null;
                final Pair<i$b, Long> g = this.g(this.C.a);
                final i$b i$b = (i$b)g.first;
                final long longValue = (long)g.second;
                final long n3 = -9223372036854775807L;
                b5 = i$b;
                s = longValue;
                n2 = n3;
                if (!((ac.j)i$b).equals(this.C.b)) {
                    b5 = i$b;
                    s = longValue;
                    n4 = n;
                    n2 = n3;
                    break Label_0443;
                }
            }
            n4 = 0;
        }
        this.x.b();
        this.I = false;
        final c0 c3 = this.C;
        final com.google.android.exoplayer2.e0 a3 = c3.a;
        final int e = c3.e;
        ExoPlaybackException f4;
        if (b4) {
            f4 = ex;
        }
        else {
            f4 = c3.f;
        }
        u u;
        if (n4 != 0) {
            u = ac.u.i;
        }
        else {
            u = c3.h;
        }
        o o;
        if (n4 != 0) {
            o = this.j;
        }
        else {
            o = c3.i;
        }
        Object o2;
        if (n4 != 0) {
            o2 = ImmutableList.of();
        }
        else {
            o2 = c3.j;
        }
        final c0 c4 = this.C;
        this.C = new c0(a3, b5, n2, s, e, f4, false, u, o, (List)o2, b5, c4.l, c4.m, c4.n, s, 0L, s, this.N, false);
        if (b3) {
            final t y = this.y;
            for (final t.b b7 : y.h.values()) {
                try {
                    b7.a.a(b7.b);
                }
                catch (final RuntimeException ex4) {
                    lg.e0.I("MediaSourceList", "Failed to release child source.", (Throwable)ex4);
                }
                b7.a.b((com.google.android.exoplayer2.source.j)b7.c);
                b7.a.k((com.google.android.exoplayer2.drm.c)b7.c);
            }
            y.h.clear();
            y.i.clear();
            y.k = false;
        }
    }
    
    public final void C() {
        final y h = this.x.h;
        this.G = (h != null && h.f.h && this.F);
    }
    
    public final void D(long q) throws ExoPlaybackException {
        final y h = this.x.h;
        long o;
        if (h == null) {
            o = 1000000000000L;
        }
        else {
            o = h.o;
        }
        q += o;
        this.Q = q;
        this.t.f.a(q);
        for (final z z : this.f) {
            if (r(z)) {
                z.n(this.Q);
            }
        }
        for (y y = this.x.h; y != null; y = y.l) {
            for (final wc.f f2 : y.n.c) {
                if (f2 != null) {
                    f2.f();
                }
            }
        }
    }
    
    public final void E(final com.google.android.exoplayer2.e0 e0, final com.google.android.exoplayer2.e0 e2) {
        if (e0.p() && e2.p()) {
            return;
        }
        final int n = this.u.size() - 1;
        if (n < 0) {
            Collections.sort(this.u);
            return;
        }
        this.u.get(n).getClass();
        throw null;
    }
    
    public final void H(final boolean b) throws ExoPlaybackException {
        final i$b a = this.x.h.f.a;
        final long j = this.J(a, this.C.s, true, false);
        if (j != this.C.s) {
            final c0 c = this.C;
            this.C = this.p(a, j, c.c, c.d, b, 5);
        }
    }
    
    public final void I(final g p) throws ExoPlaybackException {
        final d d = this.D;
        int n = 1;
        d.a(1);
        final Pair<Object, Long> f = F(this.C.a, p, true, this.J, this.K, this.p, this.q);
        long n2 = -9223372036854775807L;
        i$b n3 = null;
        int n5 = 0;
        long n7 = 0L;
        long n9 = 0L;
        Label_0276: {
            long n4;
            if (f == null) {
                final Pair<i$b, Long> g = this.g(this.C.a);
                n3 = (i$b)g.first;
                n4 = (long)g.second;
                n5 = ((this.C.a.p() ^ true) ? 1 : 0);
            }
            else {
                final Object first = f.first;
                final long longValue = (long)f.second;
                long n6;
                if (p.c == -9223372036854775807L) {
                    n6 = -9223372036854775807L;
                }
                else {
                    n6 = longValue;
                }
                n3 = this.x.n(this.C.a, first, longValue);
                if (((ac.j)n3).a()) {
                    this.C.a.g(((ac.j)n3).a, this.q);
                    long h;
                    if (this.q.f(((ac.j)n3).b) == ((ac.j)n3).c) {
                        h = this.q.l.h;
                    }
                    else {
                        h = 0L;
                    }
                    n7 = n6;
                    n5 = 1;
                    n4 = h;
                    break Label_0276;
                }
                if (p.c == -9223372036854775807L) {
                    n5 = 1;
                }
                else {
                    n5 = 0;
                }
                final long n8 = n6;
                n4 = longValue;
                n2 = n8;
            }
            n7 = n2;
            try {
                Label_0445: {
                    if (this.C.a.p()) {
                        this.P = p;
                    }
                    else if (f == null) {
                        if (this.C.e != 1) {
                            this.W(4);
                        }
                        this.B(false, true, false, true);
                    }
                    else {
                        long c;
                        if (((ac.j)n3).equals(this.C.b)) {
                            final y h2 = this.x.h;
                            if (h2 != null && h2.d && n4 != 0L) {
                                c = h2.a.c(n4, this.B);
                            }
                            else {
                                c = n4;
                            }
                            if (ad.c0.U(c) == ad.c0.U(this.C.s)) {
                                final c0 c2 = this.C;
                                final int e = c2.e;
                                if (e == 2 || e == 3) {
                                    n4 = c2.s;
                                    break Label_0445;
                                }
                            }
                        }
                        else {
                            c = n4;
                        }
                        final boolean b = this.C.e == 4;
                        final s x = this.x;
                        if (n4 == this.J(n3, c, x.h != x.i, b)) {
                            n = 0;
                        }
                        n5 |= n;
                        try {
                            final c0 c3 = this.C;
                            final com.google.android.exoplayer2.e0 a = c3.a;
                            this.e0(a, n3, a, c3.b, n7);
                        }
                        finally {}
                    }
                }
                this.C = this.p(n3, n4, n7, n4, (boolean)(n5 != 0), 2);
                return;
            }
            finally {
                n9 = n4;
            }
        }
        this.C = this.p(n3, n9, n7, n9, (boolean)(n5 != 0), 2);
    }
    
    public final long J(final i$b i$b, long n, final boolean b, final boolean b2) throws ExoPlaybackException {
        this.b0();
        this.H = false;
        if (b2 || this.C.e == 3) {
            this.W(2);
        }
        y y2;
        y y;
        for (y = (y2 = this.x.h); y2 != null && !((ac.j)i$b).equals(y2.f.a); y2 = y2.l) {}
        if (b || y != y2 || (y2 != null && y2.o + n < 0L)) {
            final z[] f = this.f;
            for (int length = f.length, i = 0; i < length; ++i) {
                this.b(f[i]);
            }
            if (y2 != null) {
                s x;
                while (true) {
                    x = this.x;
                    if (x.h == y2) {
                        break;
                    }
                    x.a();
                }
                x.l(y2);
                y2.o = 1000000000000L;
                this.d(new boolean[this.f.length]);
            }
        }
        if (y2 != null) {
            this.x.l(y2);
            long j;
            if (!y2.d) {
                y2.f = y2.f.b(n);
                j = n;
            }
            else {
                j = n;
                if (y2.e) {
                    j = y2.a.j(n);
                    y2.a.y(j - this.r, this.s);
                }
            }
            this.D(j);
            this.t();
            n = j;
        }
        else {
            this.x.b();
            this.D(n);
        }
        this.l(false);
        this.m.k(2);
        return n;
    }
    
    public final void K(final x x) throws ExoPlaybackException {
        if (x.f == this.o) {
            monitorenter(x);
            monitorexit(x);
            try {
                x.a.h(x.d, x.e);
                x.b(true);
                final int e = this.C.e;
                if (e == 3 || e == 2) {
                    this.m.k(2);
                }
                return;
            }
            finally {
                x.b(true);
            }
        }
        this.m.d(15, x).a();
    }
    
    public final void L(final x x) {
        final Looper f = x.f;
        if (!f.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            x.b(false);
            return;
        }
        this.v.c(f, null).i(new h5.f(2, this, x));
    }
    
    public final void N(final boolean l, final AtomicBoolean atomicBoolean) {
        if (this.L != l && !(this.L = l)) {
            for (final z z : this.f) {
                if (!r(z) && this.g.remove(z)) {
                    z.reset();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                this.notifyAll();
            }
        }
    }
    
    public final void O(final a a) throws ExoPlaybackException {
        this.D.a(1);
        if (a.c != -1) {
            this.P = new g(new va.d0(a.a, a.b), a.c, a.d);
        }
        final t y = this.y;
        final List<t$c> a2 = a.a;
        final q b = a.b;
        y.h(0, y.b.size());
        this.m(y.a(y.b.size(), a2, b), false);
    }
    
    public final void P(final boolean n) {
        if (n == this.N) {
            return;
        }
        this.N = n;
        final c0 c = this.C;
        final int e = c.e;
        if (!n && e != 4 && e != 1) {
            this.m.k(2);
        }
        else {
            this.C = c.c(n);
        }
    }
    
    public final void Q(final boolean f) throws ExoPlaybackException {
        this.F = f;
        this.C();
        if (this.G) {
            final s x = this.x;
            if (x.i != x.h) {
                this.H(true);
                this.l(false);
            }
        }
    }
    
    public final void R(int i, int length, final boolean b, final boolean b2) throws ExoPlaybackException {
        final d d = this.D;
        int n;
        if (b2) {
            n = 1;
        }
        else {
            n = 0;
        }
        d.a(n);
        final d d2 = this.D;
        d2.a = true;
        d2.f = true;
        d2.g = length;
        this.C = this.C.d(i, b);
        this.H = false;
        for (y y = this.x.h; y != null; y = y.l) {
            final wc.f[] c = y.n.c;
            wc.f f;
            for (length = c.length, i = 0; i < length; ++i) {
                f = c[i];
                if (f != null) {
                    f.s(b);
                }
            }
        }
        if (!this.X()) {
            this.b0();
            this.d0();
        }
        else {
            i = this.C.e;
            if (i == 3) {
                this.Z();
                this.m.k(2);
            }
            else if (i == 2) {
                this.m.k(2);
            }
        }
    }
    
    public final void S(v c) throws ExoPlaybackException {
        this.t.e(c);
        c = this.t.c();
        this.o(c, c.f, true, true);
    }
    
    public final void T(final int n) throws ExoPlaybackException {
        this.J = n;
        final s x = this.x;
        final com.google.android.exoplayer2.e0 a = this.C.a;
        x.f = n;
        if (!x.o(a)) {
            this.H(true);
        }
        this.l(false);
    }
    
    public final void U(final boolean b) throws ExoPlaybackException {
        this.K = b;
        final s x = this.x;
        final com.google.android.exoplayer2.e0 a = this.C.a;
        x.g = b;
        if (!x.o(a)) {
            this.H(true);
        }
        this.l(false);
    }
    
    public final void V(final q q) throws ExoPlaybackException {
        this.D.a(1);
        final t y = this.y;
        final int size = y.b.size();
        q g = q;
        if (q.getLength() != size) {
            g = q.d().g(size);
        }
        y.j = g;
        this.m(y.c(), false);
    }
    
    public final void W(final int n) {
        final c0 c = this.C;
        if (c.e != n) {
            if (n != 2) {
                this.U = -9223372036854775807L;
            }
            this.C = c.g(n);
        }
    }
    
    public final boolean X() {
        final c0 c = this.C;
        return c.l && c.m == 0;
    }
    
    public final boolean Y(final com.google.android.exoplayer2.e0 e0, final i$b i$b) {
        final boolean a = ((ac.j)i$b).a();
        boolean b2;
        final boolean b = b2 = false;
        if (!a) {
            if (e0.p()) {
                b2 = b;
            }
            else {
                e0.m(e0.g(((ac.j)i$b).a, this.q).h, this.p);
                b2 = b;
                if (this.p.a()) {
                    final e0$c p2 = this.p;
                    b2 = b;
                    if (p2.n) {
                        b2 = b;
                        if (p2.k != -9223372036854775807L) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final void Z() throws ExoPlaybackException {
        int i = 0;
        this.H = false;
        final h t = this.t;
        t.k = true;
        final w f = t.f;
        if (!f.g) {
            f.i = f.f.d();
            f.g = true;
        }
        for (z[] f2 = this.f; i < f2.length; ++i) {
            final z z = f2[i];
            if (r(z)) {
                z.start();
            }
        }
    }
    
    public final void a(final a a, final int n) throws ExoPlaybackException {
        this.D.a(1);
        final t y = this.y;
        int size = n;
        if (n == -1) {
            size = y.b.size();
        }
        this.m(y.a(size, a.a, a.b), false);
    }
    
    public final void a0(final boolean b, final boolean b2) {
        this.B(b || !this.L, false, true, false);
        this.D.a(b2 ? 1 : 0);
        this.k.onStopped();
        this.W(1);
    }
    
    public final void b(final z z) throws ExoPlaybackException {
        if (z.getState() == 0) {
            return;
        }
        final h t = this.t;
        if (z == t.h) {
            t.i = null;
            t.h = null;
            t.j = true;
        }
        if (z.getState() == 2) {
            z.stop();
        }
        z.d();
        --this.O;
    }
    
    public final void b0() throws ExoPlaybackException {
        final h t = this.t;
        int i = 0;
        t.k = false;
        final w f = t.f;
        if (f.g) {
            f.a(f.u());
            f.g = false;
        }
        for (z[] f2 = this.f; i < f2.length; ++i) {
            final z z = f2[i];
            if (r(z) && z.getState() == 2) {
                z.stop();
            }
        }
    }
    
    public final void c() throws ExoPlaybackException, IOException {
        final long a = this.v.a();
        int n9;
        if (!this.C.a.p() && this.y.k) {
            final s x = this.x;
            final long q = this.Q;
            final y j = x.j;
            if (j != null) {
                d0.f(j.l == null);
                if (j.d) {
                    j.a.f(q - j.o);
                }
            }
            final s x2 = this.x;
            final y i = x2.j;
            if (i == null || (!i.f.i && (i.d && (i.e || i.a.e() == Long.MIN_VALUE)) && x2.j.f.e != -9223372036854775807L && x2.k < 100)) {
                final s x3 = this.x;
                final long q2 = this.Q;
                final c0 c = this.C;
                final y k = x3.j;
                va.z z;
                if (k == null) {
                    z = x3.d(c.a, c.b, c.c, c.s);
                }
                else {
                    z = x3.c(c.a, k, q2);
                }
                if (z != null) {
                    final s x4 = this.x;
                    final e0[] h = this.h;
                    final n l = this.i;
                    final yc.b allocator = this.k.getAllocator();
                    final t y = this.y;
                    final o m = this.j;
                    final y j2 = x4.j;
                    long n;
                    if (j2 == null) {
                        n = 1000000000000L;
                    }
                    else {
                        n = j2.o + j2.f.e - z.b;
                    }
                    final y y2 = new y(h, n, l, allocator, y, z, m);
                    final y j3 = x4.j;
                    if (j3 != null) {
                        if (y2 != j3.l) {
                            j3.b();
                            j3.l = y2;
                            j3.c();
                        }
                    }
                    else {
                        x4.h = y2;
                        x4.i = y2;
                    }
                    x4.l = null;
                    x4.j = y2;
                    ++x4.k;
                    x4.k();
                    y2.a.s((h$a)this, z.b);
                    if (this.x.h == y2) {
                        this.D(z.b);
                    }
                    this.l(false);
                }
            }
            if (this.I) {
                this.I = this.q();
                this.c0();
            }
            else {
                this.t();
            }
            final y i2 = this.x.i;
            if (i2 != null) {
                if (i2.l != null && !this.G) {
                    boolean b = false;
                    Label_0744: {
                        Label_0735: {
                            if (i2.d) {
                                int n2 = 0;
                                while (true) {
                                    final z[] f = this.f;
                                    if (n2 >= f.length) {
                                        break;
                                    }
                                    final z z2 = f[n2];
                                    final ac.p p = i2.c[n2];
                                    if (z2.getStream() != p) {
                                        break Label_0735;
                                    }
                                    if (p != null && !z2.f()) {
                                        final y l2 = i2.l;
                                        if (!i2.f.f || !l2.d || (!(z2 instanceof l) && !(z2 instanceof pb.f) && z2.m() < l2.e())) {
                                            break Label_0735;
                                        }
                                    }
                                    ++n2;
                                }
                                b = true;
                                break Label_0744;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        final y l3 = i2.l;
                        if (l3.d || this.Q >= l3.e()) {
                            final o n3 = i2.n;
                            final s x5 = this.x;
                            final y i3 = x5.i;
                            d0.f(i3 != null && i3.l != null);
                            x5.i = x5.i.l;
                            x5.k();
                            final y i4 = x5.i;
                            final o n4 = i4.n;
                            final com.google.android.exoplayer2.e0 a2 = this.C.a;
                            this.e0(a2, i4.f.a, a2, i2.f.a, -9223372036854775807L);
                            if (i4.d && i4.a.n() != -9223372036854775807L) {
                                final long e = i4.e();
                                for (final z z3 : this.f) {
                                    if (z3.getStream() != null) {
                                        M(z3, e);
                                    }
                                }
                            }
                            else {
                                for (int n6 = 0; n6 < this.f.length; ++n6) {
                                    final boolean b2 = n3.b(n6);
                                    final boolean b3 = n4.b(n6);
                                    if (b2 && !this.f[n6].i()) {
                                        final boolean b4 = ((com.google.android.exoplayer2.e)this.h[n6]).f == -2;
                                        final f0 f3 = n3.b[n6];
                                        final f0 f4 = n4.b[n6];
                                        if (!b3 || !f4.equals((Object)f3) || b4) {
                                            M(this.f[n6], i4.e());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else if (i2.f.i || this.G) {
                    int n7 = 0;
                    while (true) {
                        final z[] f5 = this.f;
                        if (n7 >= f5.length) {
                            break;
                        }
                        final z z4 = f5[n7];
                        final ac.p p2 = i2.c[n7];
                        if (p2 != null && z4.getStream() == p2 && z4.f()) {
                            final long e2 = i2.f.e;
                            long n8;
                            if (e2 != -9223372036854775807L && e2 != Long.MIN_VALUE) {
                                n8 = e2 + i2.o;
                            }
                            else {
                                n8 = -9223372036854775807L;
                            }
                            M(z4, n8);
                        }
                        ++n7;
                    }
                }
            }
            n9 = 1;
            final s x6 = this.x;
            final y i5 = x6.i;
            if (i5 != null && x6.h != i5) {
                if (!i5.g) {
                    final o n10 = i5.n;
                    int n12;
                    int n11 = n12 = 0;
                    z[] f6;
                    while (true) {
                        f6 = this.f;
                        if (n11 >= f6.length) {
                            break;
                        }
                        final z z5 = f6[n11];
                        if (r(z5)) {
                            int n13;
                            if (z5.getStream() != i5.c[n11]) {
                                n13 = n9;
                            }
                            else {
                                n13 = 0;
                            }
                            if (!n10.b(n11) || n13 != 0) {
                                if (!z5.i()) {
                                    final wc.f f7 = n10.c[n11];
                                    int length2;
                                    if (f7 != null) {
                                        length2 = f7.length();
                                    }
                                    else {
                                        length2 = 0;
                                    }
                                    final com.google.android.exoplayer2.n[] array = new com.google.android.exoplayer2.n[length2];
                                    for (int n14 = 0; n14 < length2; ++n14) {
                                        array[n14] = f7.p(n14);
                                    }
                                    z5.g(array, i5.c[n11], i5.e(), i5.o);
                                }
                                else if (z5.b()) {
                                    this.b(z5);
                                }
                                else {
                                    n12 = n9;
                                }
                            }
                        }
                        ++n11;
                    }
                    if ((n12 ^ 0x1) != 0x0) {
                        this.d(new boolean[f6.length]);
                    }
                }
            }
            int n15 = 0;
            while (true) {
                int n16 = 0;
                Label_1599: {
                    if (this.X()) {
                        if (!this.G) {
                            final y h2 = this.x.h;
                            if (h2 != null) {
                                final y l4 = h2.l;
                                if (l4 != null && this.Q >= l4.e() && l4.g) {
                                    n16 = n9;
                                    break Label_1599;
                                }
                            }
                        }
                    }
                    n16 = 0;
                }
                if (n16 == 0) {
                    break;
                }
                if (n15 != 0) {
                    this.u();
                }
                final y a3 = this.x.a();
                a3.getClass();
                int n17 = 0;
                Label_1711: {
                    if (((ac.j)this.C.b).a.equals(((ac.j)a3.f.a).a)) {
                        final i$b b5 = this.C.b;
                        if (((ac.j)b5).b == -1) {
                            final i$b a4 = a3.f.a;
                            if (((ac.j)a4).b == -1 && ((ac.j)b5).e != ((ac.j)a4).e) {
                                n17 = n9;
                                break Label_1711;
                            }
                        }
                    }
                    n17 = 0;
                }
                final va.z f8 = a3.f;
                final i$b a5 = f8.a;
                final long b6 = f8.b;
                this.C = this.p(a5, b6, f8.c, b6, (boolean)((n17 ^ 0x1) != 0x0), 0);
                this.C();
                this.d0();
                n15 = n9;
            }
        }
        else {
            n9 = 1;
        }
        final int e3 = this.C.e;
        if (e3 == n9 || e3 == 4) {
            this.m.h();
            return;
        }
        final y h3 = this.x.h;
        if (h3 == null) {
            this.m.h();
            this.m.j(a + 10L);
            return;
        }
        bg.d.D("doSomeWork");
        this.d0();
        int n20;
        int n21;
        if (h3.d) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            h3.a.y(this.C.s - this.r, this.s);
            int n18 = n9;
            int n19 = 0;
            while (true) {
                final z[] f9 = this.f;
                n20 = n9;
                n21 = n18;
                if (n19 >= f9.length) {
                    break;
                }
                final z z6 = f9[n19];
                int n22;
                int n23;
                if (!r(z6)) {
                    n22 = n9;
                    n23 = n18;
                }
                else {
                    z6.l(this.Q, elapsedRealtime * 1000L);
                    int n24;
                    if (n18 != 0 && z6.b()) {
                        n24 = 1;
                    }
                    else {
                        n24 = 0;
                    }
                    final boolean b7 = h3.c[n19] != z6.getStream();
                    final boolean b8 = !b7 && z6.f();
                    final boolean b9 = b7 || b8 || z6.isReady() || z6.b();
                    int n25;
                    if (n9 != 0 && b9) {
                        n25 = 1;
                    }
                    else {
                        n25 = 0;
                    }
                    n22 = n25;
                    n23 = n24;
                    if (!b9) {
                        z6.r();
                        n23 = n24;
                        n22 = n25;
                    }
                }
                ++n19;
                n9 = n22;
                n18 = n23;
            }
        }
        else {
            h3.a.v();
            n20 = 1;
            n21 = 1;
        }
        final long e4 = h3.f.e;
        final boolean b10 = n21 != 0 && h3.d && (e4 == -9223372036854775807L || e4 <= this.C.s);
        if (b10 && this.G) {
            this.G = false;
            this.R(this.C.m, 5, false, false);
        }
        Label_2780: {
            if (b10 && h3.f.i) {
                this.W(4);
                this.b0();
            }
            else {
                final c0 c2 = this.C;
                if (c2.e == 2) {
                    boolean s = false;
                    Label_2548: {
                        if (this.O == 0) {
                            s = this.s();
                        }
                        else {
                            Label_2539: {
                                if (n20 != 0) {
                                    if (c2.g) {
                                        long i6;
                                        if (this.Y(c2.a, this.x.h.f.a)) {
                                            i6 = ((com.google.android.exoplayer2.g)this.z).i;
                                        }
                                        else {
                                            i6 = -9223372036854775807L;
                                        }
                                        final y j4 = this.x.j;
                                        final boolean b11 = j4.d && (!j4.e || j4.a.e() == Long.MIN_VALUE) && j4.f.i;
                                        final boolean b12 = ((ac.j)j4.f.a).a() && !j4.d;
                                        if (!b11 && !b12) {
                                            final va.x k2 = this.k;
                                            final long q3 = this.C.q;
                                            final y j5 = this.x.j;
                                            long max;
                                            if (j5 == null) {
                                                max = 0L;
                                            }
                                            else {
                                                max = Math.max(0L, q3 - (this.Q - j5.o));
                                            }
                                            if (!k2.shouldStartPlayback(max, this.t.c().f, this.H, i6)) {
                                                break Label_2539;
                                            }
                                        }
                                    }
                                    s = true;
                                    break Label_2548;
                                }
                            }
                            s = false;
                        }
                    }
                    if (s) {
                        this.W(3);
                        this.T = null;
                        if (this.X()) {
                            this.Z();
                        }
                        break Label_2780;
                    }
                }
                if (this.C.e == 3) {
                    if (this.O == 0) {
                        if (this.s()) {
                            break Label_2780;
                        }
                    }
                    else if (n20 != 0) {
                        break Label_2780;
                    }
                    this.H = this.X();
                    this.W(2);
                    if (this.H) {
                        for (y y3 = this.x.h; y3 != null; y3 = y3.l) {
                            for (final wc.f f10 : y3.n.c) {
                                if (f10 != null) {
                                    f10.n();
                                }
                            }
                        }
                        final com.google.android.exoplayer2.g g = (com.google.android.exoplayer2.g)this.z;
                        final long i7 = g.i;
                        if (i7 != -9223372036854775807L) {
                            final long i8 = i7 + g.b;
                            g.i = i8;
                            final long h4 = g.h;
                            if (h4 != -9223372036854775807L && i8 > h4) {
                                g.i = h4;
                            }
                            g.m = -9223372036854775807L;
                        }
                    }
                    this.b0();
                }
            }
        }
        boolean b13 = false;
        Label_2896: {
            if (this.C.e == 2) {
                int n27 = 0;
                while (true) {
                    final z[] f11 = this.f;
                    if (n27 >= f11.length) {
                        break;
                    }
                    if (r(f11[n27]) && this.f[n27].getStream() == h3.c[n27]) {
                        this.f[n27].r();
                    }
                    ++n27;
                }
                final c0 c4 = this.C;
                if (!c4.g && c4.r < 500000L && this.q()) {
                    b13 = true;
                    break Label_2896;
                }
            }
            b13 = false;
        }
        if (!b13) {
            this.U = -9223372036854775807L;
        }
        else if (this.U == -9223372036854775807L) {
            this.U = this.v.d();
        }
        else if (this.v.d() - this.U >= 4000L) {
            throw new IllegalStateException("Playback stuck buffering and not loading");
        }
        final boolean n28 = this.N;
        final c0 c5 = this.C;
        if (n28 != c5.o) {
            this.C = c5.c(n28);
        }
        int n29 = 0;
        Label_3130: {
            if (!this.X() || this.C.e != 3) {
                final int e5 = this.C.e;
                if (e5 != 2) {
                    if (this.O != 0 && e5 != 4) {
                        this.m.h();
                        this.m.j(a + 1000L);
                    }
                    else {
                        this.m.h();
                    }
                    n29 = 0;
                    break Label_3130;
                }
            }
            boolean b14;
            if (this.N && this.M) {
                b14 = false;
            }
            else {
                this.m.h();
                this.m.j(a + 10L);
                b14 = true;
            }
            n29 = ((b14 ^ true) ? 1 : 0);
        }
        final c0 c6 = this.C;
        if ((c6.p ? 1 : 0) != n29) {
            this.C = new c0(c6.a, c6.b, c6.c, c6.d, c6.e, c6.f, c6.g, c6.h, c6.i, c6.j, c6.k, c6.l, c6.m, c6.n, c6.q, c6.r, c6.s, c6.o, (boolean)(n29 != 0));
        }
        this.M = false;
        bg.d.Y();
    }
    
    public final void c0() {
        final y j = this.x.j;
        final boolean b = this.I || (j != null && j.a.a());
        final c0 c = this.C;
        if (b != c.g) {
            this.C = new c0(c.a, c.b, c.c, c.d, c.e, c.f, b, c.h, c.i, c.j, c.k, c.l, c.m, c.n, c.q, c.r, c.s, c.o, c.p);
        }
    }
    
    public final void d(final boolean[] array) throws ExoPlaybackException {
        final y i = this.x.i;
        final o n = i.n;
        for (int j = 0; j < this.f.length; ++j) {
            if (!n.b(j) && this.g.remove(this.f[j])) {
                this.f[j].reset();
            }
        }
        for (int k = 0; k < this.f.length; ++k) {
            if (n.b(k)) {
                final boolean b = array[k];
                final z h = this.f[k];
                if (!r(h)) {
                    final s x = this.x;
                    final y l = x.i;
                    final boolean b2 = l == x.h;
                    final o n2 = l.n;
                    final f0 f0 = n2.b[k];
                    final wc.f f2 = n2.c[k];
                    int length;
                    if (f2 != null) {
                        length = f2.length();
                    }
                    else {
                        length = 0;
                    }
                    final com.google.android.exoplayer2.n[] array2 = new com.google.android.exoplayer2.n[length];
                    for (int n3 = 0; n3 < length; ++n3) {
                        array2[n3] = f2.p(n3);
                    }
                    final boolean b3 = this.X() && this.C.e == 3;
                    final boolean b4 = !b && b3;
                    ++this.O;
                    this.g.add(h);
                    h.j(f0, array2, l.c[k], this.Q, b4, b2, l.e(), l.o);
                    ((x.b)h).h(11, new com.google.android.exoplayer2.l(this));
                    final h t = this.t;
                    t.getClass();
                    final ad.n o = h.o();
                    if (o != null) {
                        final ad.n m = t.i;
                        if (o != m) {
                            if (m != null) {
                                throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                            t.i = o;
                            t.h = h;
                            o.e(t.f.j);
                        }
                    }
                    if (b3) {
                        h.start();
                    }
                }
            }
        }
        i.g = true;
    }
    
    public final void d0() throws ExoPlaybackException {
        final y h = this.x.h;
        if (h == null) {
            return;
        }
        final boolean d = h.d;
        long n = -9223372036854775807L;
        long n2;
        if (d) {
            n2 = h.a.n();
        }
        else {
            n2 = -9223372036854775807L;
        }
        m i;
        m m;
        if (n2 != -9223372036854775807L) {
            this.D(n2);
            if (n2 != this.C.s) {
                final c0 c = this.C;
                this.C = this.p(c.b, n2, c.c, n2, true, 5);
            }
            m = (i = this);
        }
        else {
            final h t = this.t;
            final boolean b = h != this.x.i;
            final z h2 = t.h;
            boolean b2 = false;
            Label_0204: {
                Label_0201: {
                    if (h2 != null && !h2.b()) {
                        if (!t.h.isReady()) {
                            if (b) {
                                break Label_0201;
                            }
                            if (t.h.f()) {
                                break Label_0201;
                            }
                        }
                        b2 = false;
                        break Label_0204;
                    }
                }
                b2 = true;
            }
            Label_0458: {
                if (b2) {
                    t.j = true;
                    if (t.k) {
                        final w f = t.f;
                        if (!f.g) {
                            f.i = f.f.d();
                            f.g = true;
                        }
                    }
                }
                else {
                    final ad.n j = t.i;
                    j.getClass();
                    final long u = j.u();
                    if (t.j) {
                        if (u < t.f.u()) {
                            final w f2 = t.f;
                            if (f2.g) {
                                f2.a(f2.u());
                                f2.g = false;
                            }
                            break Label_0458;
                        }
                        else {
                            t.j = false;
                            if (t.k) {
                                final w f3 = t.f;
                                if (!f3.g) {
                                    f3.i = f3.f.d();
                                    f3.g = true;
                                }
                            }
                        }
                    }
                    t.f.a(u);
                    final v c2 = j.c();
                    if (!c2.equals(t.f.j)) {
                        t.f.e(c2);
                        ((m)t.g).m.d(16, c2).a();
                    }
                }
            }
            final long u2 = t.u();
            this.Q = u2;
            final long o = h.o;
            final long s = this.C.s;
            m m4 = null;
            m m3 = null;
            Label_0804: {
                if (!this.u.isEmpty() && !((ac.j)this.C.b).a()) {
                    long n3 = s;
                    if (this.S) {
                        n3 = s - 1L;
                        this.S = false;
                    }
                    final c0 c3 = this.C;
                    final int b3 = c3.a.b(((ac.j)c3.b).a);
                    int min = Math.min(this.R, this.u.size());
                    final c c4 = null;
                    while (true) {
                        m k = null;
                        m l = null;
                        Label_0634: {
                            if (min <= 0) {
                                k = this;
                                final m m2;
                                l = (m2 = k);
                                final long n4 = n3;
                                break Label_0634;
                            }
                            c c5 = this.u.get(min - 1);
                            m3 = (m4 = this);
                            final long n5 = -9223372036854775807L;
                            m m2 = m4;
                            final long n4 = n3;
                            final long n6 = n5;
                            while (c5 != null) {
                                c5.getClass();
                                if (b3 >= 0) {
                                    if (b3 != 0) {
                                        break;
                                    }
                                    c5.getClass();
                                    if (0L <= n4) {
                                        break;
                                    }
                                }
                                if (--min <= 0) {
                                    final m m5 = m3;
                                    l = m4;
                                    k = m5;
                                    n = n6;
                                    break Label_0634;
                                }
                                c5 = m2.u.get(min - 1);
                            }
                            c c6 = c4;
                            if (min < m2.u.size()) {
                                c6 = m2.u.get(min);
                            }
                            if (c6 != null) {
                                c6.getClass();
                            }
                            if (c6 != null) {
                                c6.getClass();
                            }
                            m2.R = min;
                            n = n6;
                            break Label_0804;
                        }
                        final long n6 = n;
                        final m m6 = l;
                        m3 = k;
                        final c c7 = null;
                        m4 = m6;
                        c c5 = c7;
                        continue;
                    }
                }
                m3 = (m4 = this);
            }
            m3.C.s = u2 - o;
            i = m4;
            m = m3;
        }
        m.C.q = m.x.j.d();
        final c0 c8 = m.C;
        final long q = i.C.q;
        final y j2 = i.x.j;
        final long n7 = 0L;
        long max;
        if (j2 == null) {
            max = 0L;
        }
        else {
            max = Math.max(0L, q - (i.Q - j2.o));
        }
        c8.r = max;
        final c0 c9 = m.C;
        if (c9.l && c9.e == 3 && m.Y(c9.a, c9.b)) {
            final c0 c10 = m.C;
            if (c10.n.f == 1.0f) {
                final p z = m.z;
                final long e = m.e(c10.a, ((ac.j)c10.b).a, c10.s);
                final long q2 = i.C.q;
                final y j3 = i.x.j;
                long max2;
                if (j3 == null) {
                    max2 = n7;
                }
                else {
                    max2 = Math.max(0L, q2 - (i.Q - j3.o));
                }
                final com.google.android.exoplayer2.g g = (com.google.android.exoplayer2.g)z;
                float n8;
                if (g.d == n) {
                    n8 = 1.0f;
                }
                else {
                    final long n9 = e - max2;
                    final long n10 = g.n;
                    if (n10 == n) {
                        g.n = n9;
                        g.o = 0L;
                    }
                    else {
                        final float c11 = g.c;
                        final long max3 = Math.max(n9, (long)((1.0f - c11) * n9 + n10 * c11));
                        g.n = max3;
                        final long abs = Math.abs(n9 - max3);
                        final long o2 = g.o;
                        final float c12 = g.c;
                        g.o = (long)((1.0f - c12) * abs + o2 * c12);
                    }
                    if (g.m != n && SystemClock.elapsedRealtime() - g.m < 1000L) {
                        n8 = g.l;
                    }
                    else {
                        g.m = SystemClock.elapsedRealtime();
                        final long n11 = g.o * 3L + g.n;
                        if (g.i > n11) {
                            final long j4 = ad.c0.J(1000L);
                            final float l2 = g.l;
                            final float n12 = (float)j4;
                            final long n13 = (long)((l2 - 1.0f) * n12);
                            final long n14 = (long)((g.j - 1.0f) * n12);
                            final long f4 = g.f;
                            int n15 = 1;
                            final long i2 = g.i;
                            long i3 = n11;
                            while (n15 < 3) {
                                final long n16 = (new long[] { n11, f4, i2 - (n13 + n14) })[n15];
                                long n17 = i3;
                                if (n16 > i3) {
                                    n17 = n16;
                                }
                                ++n15;
                                i3 = n17;
                            }
                            g.i = i3;
                        }
                        else {
                            final long j5 = ad.c0.j(e - (long)(Math.max(0.0f, g.l - 1.0f) / 1.0E-7f), g.i, n11);
                            g.i = j5;
                            final long h3 = g.h;
                            if (h3 != n && j5 > h3) {
                                g.i = h3;
                            }
                        }
                        final long n18 = e - g.i;
                        if (Math.abs(n18) < g.a) {
                            g.l = 1.0f;
                        }
                        else {
                            g.l = ad.c0.h(1.0E-7f * n18 + 1.0f, g.k, g.j);
                        }
                        n8 = g.l;
                    }
                }
                if (m.t.c().f != n8) {
                    m.t.e(new v(n8, m.C.n.g));
                    m.o(m.C.n, m.t.c().f, false, false);
                }
            }
        }
    }
    
    public final long e(final com.google.android.exoplayer2.e0 e0, final Object o, final long n) {
        e0.m(e0.g(o, this.q).h, this.p);
        final e0$c p3 = this.p;
        if (p3.k != -9223372036854775807L && p3.a()) {
            final e0$c p4 = this.p;
            if (p4.n) {
                return ad.c0.J(ad.c0.v(p4.l) - this.p.k) - (n + this.q.j);
            }
        }
        return -9223372036854775807L;
    }
    
    public final void e0(final com.google.android.exoplayer2.e0 e0, final i$b i$b, final com.google.android.exoplayer2.e0 e2, final i$b i$b2, long e3) {
        if (!this.Y(e0, i$b)) {
            v v;
            if (((ac.j)i$b).a()) {
                v = com.google.android.exoplayer2.v.i;
            }
            else {
                v = this.C.n;
            }
            if (!this.t.c().equals(v)) {
                this.t.e(v);
            }
            return;
        }
        e0.m(e0.g(((ac.j)i$b).a, this.q).h, this.p);
        final p z = this.z;
        final q$e p5 = this.p.p;
        final int a = ad.c0.a;
        final com.google.android.exoplayer2.g g = (com.google.android.exoplayer2.g)z;
        g.getClass();
        g.d = ad.c0.J(p5.f);
        g.g = ad.c0.J(p5.g);
        g.h = ad.c0.J(p5.h);
        float i = p5.i;
        if (i == -3.4028235E38f) {
            i = 0.97f;
        }
        g.k = i;
        float j = p5.j;
        if (j == -3.4028235E38f) {
            j = 1.03f;
        }
        g.j = j;
        if (i == 1.0f && j == 1.0f) {
            g.d = -9223372036854775807L;
        }
        g.a();
        if (e3 != -9223372036854775807L) {
            final p z2 = this.z;
            e3 = this.e(e0, ((ac.j)i$b).a, e3);
            final com.google.android.exoplayer2.g g2 = (com.google.android.exoplayer2.g)z2;
            g2.e = e3;
            g2.a();
        }
        else {
            final Object f = this.p.f;
            Object f2 = null;
            if (!e2.p()) {
                f2 = e2.m(e2.g(((ac.j)i$b2).a, this.q).h, this.p).f;
            }
            if (!ad.c0.a(f2, f)) {
                final com.google.android.exoplayer2.g g3 = (com.google.android.exoplayer2.g)this.z;
                g3.e = -9223372036854775807L;
                g3.a();
            }
        }
    }
    
    public final long f() {
        final y i = this.x.i;
        if (i == null) {
            return 0L;
        }
        long o = i.o;
        if (!i.d) {
            return o;
        }
        int n = 0;
        while (true) {
            final z[] f = this.f;
            if (n >= f.length) {
                return o;
            }
            long max = o;
            if (r(f[n])) {
                if (this.f[n].getStream() != i.c[n]) {
                    max = o;
                }
                else {
                    final long m = this.f[n].m();
                    if (m == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    max = Math.max(m, o);
                }
            }
            ++n;
            o = max;
        }
    }
    
    public final void f0(final va.h h, final long n) {
        synchronized (this) {
            final long d = this.v.d();
            boolean b = false;
            for (long n2 = n; !(boolean)h.get() && n2 > 0L; n2 = d + n - this.v.d()) {
                try {
                    this.v.b();
                    this.wait(n2);
                }
                catch (final InterruptedException ex) {
                    b = true;
                }
            }
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public final Pair<i$b, Long> g(final com.google.android.exoplayer2.e0 e0) {
        final boolean p = e0.p();
        final long n = 0L;
        if (p) {
            return (Pair<i$b, Long>)Pair.create((Object)c0.t, (Object)0L);
        }
        final Pair i = e0.i(this.p, this.q, e0.a(this.K), -9223372036854775807L);
        final i$b n2 = this.x.n(e0, i.first, 0L);
        long n3 = (long)i.second;
        if (((ac.j)n2).a()) {
            e0.g(((ac.j)n2).a, this.q);
            n3 = n;
            if (((ac.j)n2).c == this.q.f(((ac.j)n2).b)) {
                n3 = this.q.l.h;
            }
        }
        return (Pair<i$b, Long>)Pair.create((Object)n2, (Object)n3);
    }
    
    public final void h(final com.google.android.exoplayer2.source.h h) {
        final y j = this.x.j;
        boolean b = true;
        if (j == null || j.a != h) {
            return;
        }
        final long q = this.Q;
        if (j != null) {
            if (j.l != null) {
                b = false;
            }
            d0.f(b);
            if (j.d) {
                j.a.f(q - j.o);
            }
        }
        this.t();
    }
    
    public final boolean handleMessage(final Message message) {
        int n = 1000;
        try {
            switch (message.what) {
                default: {
                    return false;
                }
                case 25: {
                    this.H(true);
                    break;
                }
                case 24: {
                    this.P(message.arg1 == 1);
                    break;
                }
                case 23: {
                    this.Q(message.arg1 != 0);
                    break;
                }
                case 22: {
                    this.v();
                    break;
                }
                case 21: {
                    this.V((q)message.obj);
                    break;
                }
                case 20: {
                    this.z(message.arg1, message.arg2, (q)message.obj);
                    break;
                }
                case 19: {
                    this.w((b)message.obj);
                    break;
                }
                case 18: {
                    this.a((a)message.obj, message.arg1);
                    break;
                }
                case 17: {
                    this.O((a)message.obj);
                    break;
                }
                case 16: {
                    final v v = (v)message.obj;
                    this.o(v, v.f, true, false);
                    break;
                }
                case 15: {
                    this.L((x)message.obj);
                    break;
                }
                case 14: {
                    final x x = (x)message.obj;
                    x.getClass();
                    this.K(x);
                    break;
                }
                case 13: {
                    this.N(message.arg1 != 0, (AtomicBoolean)message.obj);
                    break;
                }
                case 12: {
                    this.U(message.arg1 != 0);
                    break;
                }
                case 11: {
                    this.T(message.arg1);
                    break;
                }
                case 10: {
                    this.A();
                    break;
                }
                case 9: {
                    this.h((com.google.android.exoplayer2.source.h)message.obj);
                    break;
                }
                case 8: {
                    this.n((com.google.android.exoplayer2.source.h)message.obj);
                    break;
                }
                case 7: {
                    this.y();
                    return true;
                }
                case 6: {
                    this.a0(false, true);
                    break;
                }
                case 5: {
                    this.B = (h0)message.obj;
                    break;
                }
                case 4: {
                    this.S((v)message.obj);
                    break;
                }
                case 3: {
                    this.I((g)message.obj);
                    break;
                }
                case 2: {
                    this.c();
                    break;
                }
                case 1: {
                    this.R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                }
                case 0: {
                    this.x();
                    break;
                }
            }
        }
        catch (final RuntimeException ex) {
            if (ex instanceof IllegalStateException || ex instanceof IllegalArgumentException) {
                n = 1004;
            }
            final ExoPlaybackException forUnexpected = ExoPlaybackException.createForUnexpected(ex, n);
            lg.e0.I("ExoPlayerImplInternal", "Playback error", (Throwable)forUnexpected);
            this.a0(true, false);
            this.C = this.C.e(forUnexpected);
        }
        catch (final IOException ex2) {
            this.j(ex2, 2000);
        }
        catch (final BehindLiveWindowException ex3) {
            this.j(ex3, 1002);
        }
        catch (final DataSourceException ex4) {
            this.j(ex4, ex4.reason);
        }
        catch (final ParserException ex5) {
            final int dataType = ex5.dataType;
            if (dataType == 1) {
                if (ex5.contentIsMalformed) {
                    n = 3001;
                }
                else {
                    n = 3003;
                }
            }
            else if (dataType == 4) {
                if (ex5.contentIsMalformed) {
                    n = 3002;
                }
                else {
                    n = 3004;
                }
            }
            this.j(ex5, n);
        }
        catch (final DrmSession.DrmSessionException ex6) {
            this.j(ex6, ex6.errorCode);
        }
        catch (final ExoPlaybackException ex7) {
            ExoPlaybackException copyWithMediaPeriodId = ex7;
            if (ex7.type != 0) {
                final y i = this.x.i;
                copyWithMediaPeriodId = ex7;
                if (i != null) {
                    copyWithMediaPeriodId = ex7.copyWithMediaPeriodId((ac.j)i.f.a);
                }
            }
            if (copyWithMediaPeriodId.isRecoverable && this.T == null) {
                lg.e0.w0("ExoPlayerImplInternal", "Recoverable renderer error", (Throwable)copyWithMediaPeriodId);
                this.T = copyWithMediaPeriodId;
                final k m = this.m;
                m.g((k.a)m.d(25, copyWithMediaPeriodId));
            }
            else {
                final ExoPlaybackException t = this.T;
                ExoPlaybackException t2 = copyWithMediaPeriodId;
                if (t != null) {
                    ((Throwable)t).addSuppressed((Throwable)copyWithMediaPeriodId);
                    t2 = this.T;
                }
                lg.e0.I("ExoPlayerImplInternal", "Playback error", (Throwable)t2);
                this.a0(true, false);
                this.C = this.C.e(t2);
            }
        }
        this.u();
        return true;
    }
    
    public final void i(final com.google.android.exoplayer2.source.q q) {
        this.m.d(9, q).a();
    }
    
    public final void j(final IOException ex, final int n) {
        final ExoPlaybackException forSource = ExoPlaybackException.createForSource(ex, n);
        final y h = this.x.h;
        ExoPlaybackException copyWithMediaPeriodId = forSource;
        if (h != null) {
            copyWithMediaPeriodId = forSource.copyWithMediaPeriodId((ac.j)h.f.a);
        }
        lg.e0.I("ExoPlayerImplInternal", "Playback error", (Throwable)copyWithMediaPeriodId);
        this.a0(false, false);
        this.C = this.C.e(copyWithMediaPeriodId);
    }
    
    public final void k(final com.google.android.exoplayer2.source.h h) {
        this.m.d(8, h).a();
    }
    
    public final void l(final boolean b) {
        final y j = this.x.j;
        i$b i$b;
        if (j == null) {
            i$b = this.C.b;
        }
        else {
            i$b = j.f.a;
        }
        final boolean b2 = ((ac.j)this.C.k).equals(i$b) ^ true;
        if (b2) {
            this.C = this.C.a(i$b);
        }
        final c0 c = this.C;
        long q;
        if (j == null) {
            q = c.s;
        }
        else {
            q = j.d();
        }
        c.q = q;
        final c0 c2 = this.C;
        final long q2 = c2.q;
        final y i = this.x.j;
        long max = 0L;
        if (i != null) {
            max = Math.max(0L, q2 - (this.Q - i.o));
        }
        c2.r = max;
        if ((b2 || b) && j != null && j.d) {
            this.k.onTracksSelected(this.f, j.m, j.n.c);
        }
    }
    
    public final void m(final com.google.android.exoplayer2.e0 p0, final boolean p1) throws ExoPlaybackException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //     4: astore_3       
        //     5: aload_0        
        //     6: getfield        com/google/android/exoplayer2/m.P:Lcom/google/android/exoplayer2/m$g;
        //     9: astore          4
        //    11: aload_0        
        //    12: getfield        com/google/android/exoplayer2/m.x:Lcom/google/android/exoplayer2/s;
        //    15: astore          5
        //    17: aload_0        
        //    18: getfield        com/google/android/exoplayer2/m.J:I
        //    21: istore          6
        //    23: aload_0        
        //    24: getfield        com/google/android/exoplayer2/m.K:Z
        //    27: istore          7
        //    29: aload_0        
        //    30: getfield        com/google/android/exoplayer2/m.p:Lcom/google/android/exoplayer2/e0$c;
        //    33: astore          8
        //    35: aload_0        
        //    36: getfield        com/google/android/exoplayer2/m.q:Lcom/google/android/exoplayer2/e0$b;
        //    39: astore          9
        //    41: aload_1        
        //    42: invokevirtual   com/google/android/exoplayer2/e0.p:()Z
        //    45: ifeq            70
        //    48: new             Lcom/google/android/exoplayer2/m$f;
        //    51: dup            
        //    52: getstatic       va/c0.t:Lcom/google/android/exoplayer2/source/i$b;
        //    55: lconst_0       
        //    56: ldc2_w          -9223372036854775807
        //    59: iconst_0       
        //    60: iconst_1       
        //    61: iconst_0       
        //    62: invokespecial   com/google/android/exoplayer2/m$f.<init>:(Lcom/google/android/exoplayer2/source/i$b;JJZZZ)V
        //    65: astore          10
        //    67: goto            1048
        //    70: aload_3        
        //    71: getfield        va/c0.b:Lcom/google/android/exoplayer2/source/i$b;
        //    74: astore          11
        //    76: aload           11
        //    78: getfield        ac/j.a:Ljava/lang/Object;
        //    81: astore          10
        //    83: aload_3        
        //    84: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //    87: astore          12
        //    89: aload           12
        //    91: invokevirtual   com/google/android/exoplayer2/e0.p:()Z
        //    94: ifne            124
        //    97: aload           12
        //    99: aload           11
        //   101: getfield        ac/j.a:Ljava/lang/Object;
        //   104: aload           9
        //   106: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //   109: getfield        com/google/android/exoplayer2/e0$b.k:Z
        //   112: ifeq            118
        //   115: goto            124
        //   118: iconst_0       
        //   119: istore          13
        //   121: goto            127
        //   124: iconst_1       
        //   125: istore          13
        //   127: aload_3        
        //   128: getfield        va/c0.b:Lcom/google/android/exoplayer2/source/i$b;
        //   131: invokevirtual   ac/j.a:()Z
        //   134: ifne            154
        //   137: iload           13
        //   139: ifeq            145
        //   142: goto            154
        //   145: aload_3        
        //   146: getfield        va/c0.s:J
        //   149: lstore          14
        //   151: goto            160
        //   154: aload_3        
        //   155: getfield        va/c0.c:J
        //   158: lstore          14
        //   160: aload           4
        //   162: ifnull          322
        //   165: aload_1        
        //   166: aload           4
        //   168: iconst_1       
        //   169: iload           6
        //   171: iload           7
        //   173: aload           8
        //   175: aload           9
        //   177: invokestatic    com/google/android/exoplayer2/m.F:(Lcom/google/android/exoplayer2/e0;Lcom/google/android/exoplayer2/m$g;ZIZLcom/google/android/exoplayer2/e0$c;Lcom/google/android/exoplayer2/e0$b;)Landroid/util/Pair;
        //   180: astore          12
        //   182: aload           12
        //   184: ifnonnull       211
        //   187: aload_1        
        //   188: iload           7
        //   190: invokevirtual   com/google/android/exoplayer2/e0.a:(Z)I
        //   193: istore          6
        //   195: lload           14
        //   197: lstore          16
        //   199: iconst_0       
        //   200: istore          18
        //   202: iconst_0       
        //   203: istore          19
        //   205: iconst_1       
        //   206: istore          7
        //   208: goto            303
        //   211: aload           4
        //   213: getfield        com/google/android/exoplayer2/m$g.c:J
        //   216: ldc2_w          -9223372036854775807
        //   219: lcmp           
        //   220: ifne            249
        //   223: aload_1        
        //   224: aload           12
        //   226: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   229: aload           9
        //   231: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //   234: getfield        com/google/android/exoplayer2/e0$b.h:I
        //   237: istore          6
        //   239: lload           14
        //   241: lstore          16
        //   243: iconst_0       
        //   244: istore          7
        //   246: goto            275
        //   249: aload           12
        //   251: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   254: astore          10
        //   256: aload           12
        //   258: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   261: checkcast       Ljava/lang/Long;
        //   264: invokevirtual   java/lang/Long.longValue:()J
        //   267: lstore          16
        //   269: iconst_1       
        //   270: istore          7
        //   272: iconst_m1      
        //   273: istore          6
        //   275: aload_3        
        //   276: getfield        va/c0.e:I
        //   279: iconst_4       
        //   280: if_icmpne       289
        //   283: iconst_1       
        //   284: istore          18
        //   286: goto            292
        //   289: iconst_0       
        //   290: istore          18
        //   292: iconst_0       
        //   293: istore          20
        //   295: iload           7
        //   297: istore          19
        //   299: iload           20
        //   301: istore          7
        //   303: iload           18
        //   305: istore          20
        //   307: iload           19
        //   309: istore          18
        //   311: iload           20
        //   313: istore          19
        //   315: aload           10
        //   317: astore          4
        //   319: goto            361
        //   322: aload           10
        //   324: astore          4
        //   326: aload           11
        //   328: astore          12
        //   330: aload_3        
        //   331: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //   334: invokevirtual   com/google/android/exoplayer2/e0.p:()Z
        //   337: ifeq            380
        //   340: aload_1        
        //   341: iload           7
        //   343: invokevirtual   com/google/android/exoplayer2/e0.a:(Z)I
        //   346: istore          6
        //   348: lload           14
        //   350: lstore          16
        //   352: iconst_0       
        //   353: istore          18
        //   355: iconst_0       
        //   356: istore          19
        //   358: iconst_0       
        //   359: istore          7
        //   361: iload           19
        //   363: istore          20
        //   365: iload           7
        //   367: istore          19
        //   369: aload           4
        //   371: astore          10
        //   373: iload           20
        //   375: istore          7
        //   377: goto            639
        //   380: aload_1        
        //   381: aload           4
        //   383: invokevirtual   com/google/android/exoplayer2/e0.b:(Ljava/lang/Object;)I
        //   386: iconst_m1      
        //   387: if_icmpne       448
        //   390: aload           8
        //   392: aload           9
        //   394: iload           6
        //   396: iload           7
        //   398: aload           4
        //   400: aload_3        
        //   401: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //   404: aload_1        
        //   405: invokestatic    com/google/android/exoplayer2/m.G:(Lcom/google/android/exoplayer2/e0$c;Lcom/google/android/exoplayer2/e0$b;IZLjava/lang/Object;Lcom/google/android/exoplayer2/e0;Lcom/google/android/exoplayer2/e0;)Ljava/lang/Object;
        //   408: astore          4
        //   410: aload           4
        //   412: ifnonnull       429
        //   415: aload_1        
        //   416: iload           7
        //   418: invokevirtual   com/google/android/exoplayer2/e0.a:(Z)I
        //   421: istore          6
        //   423: iconst_1       
        //   424: istore          7
        //   426: goto            445
        //   429: aload_1        
        //   430: aload           4
        //   432: aload           9
        //   434: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //   437: getfield        com/google/android/exoplayer2/e0$b.h:I
        //   440: istore          6
        //   442: iconst_0       
        //   443: istore          7
        //   445: goto            473
        //   448: lload           14
        //   450: ldc2_w          -9223372036854775807
        //   453: lcmp           
        //   454: ifne            476
        //   457: aload_1        
        //   458: aload           4
        //   460: aload           9
        //   462: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //   465: getfield        com/google/android/exoplayer2/e0$b.h:I
        //   468: istore          6
        //   470: iconst_0       
        //   471: istore          7
        //   473: goto            621
        //   476: iload           13
        //   478: ifeq            615
        //   481: aload_3        
        //   482: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //   485: astore          10
        //   487: aload           12
        //   489: astore          11
        //   491: aload           10
        //   493: aload           11
        //   495: getfield        ac/j.a:Ljava/lang/Object;
        //   498: aload           9
        //   500: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //   503: pop            
        //   504: aload_3        
        //   505: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //   508: aload           9
        //   510: getfield        com/google/android/exoplayer2/e0$b.h:I
        //   513: aload           8
        //   515: invokevirtual   com/google/android/exoplayer2/e0.m:(ILcom/google/android/exoplayer2/e0$c;)Lcom/google/android/exoplayer2/e0$c;
        //   518: getfield        com/google/android/exoplayer2/e0$c.t:I
        //   521: aload_3        
        //   522: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //   525: aload           11
        //   527: getfield        ac/j.a:Ljava/lang/Object;
        //   530: invokevirtual   com/google/android/exoplayer2/e0.b:(Ljava/lang/Object;)I
        //   533: if_icmpne       592
        //   536: aload           9
        //   538: getfield        com/google/android/exoplayer2/e0$b.j:J
        //   541: lstore          16
        //   543: aload_1        
        //   544: aload           8
        //   546: aload           9
        //   548: aload_1        
        //   549: aload           4
        //   551: aload           9
        //   553: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //   556: getfield        com/google/android/exoplayer2/e0$b.h:I
        //   559: lload           14
        //   561: lload           16
        //   563: ladd           
        //   564: invokevirtual   com/google/android/exoplayer2/e0.i:(Lcom/google/android/exoplayer2/e0$c;Lcom/google/android/exoplayer2/e0$b;IJ)Landroid/util/Pair;
        //   567: astore          4
        //   569: aload           4
        //   571: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   574: astore          10
        //   576: aload           4
        //   578: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   581: checkcast       Ljava/lang/Long;
        //   584: invokevirtual   java/lang/Long.longValue:()J
        //   587: lstore          16
        //   589: goto            600
        //   592: aload           4
        //   594: astore          10
        //   596: lload           14
        //   598: lstore          16
        //   600: iconst_m1      
        //   601: istore          6
        //   603: iconst_0       
        //   604: istore          7
        //   606: iconst_0       
        //   607: istore          19
        //   609: iconst_1       
        //   610: istore          18
        //   612: goto            639
        //   615: iconst_0       
        //   616: istore          7
        //   618: iconst_m1      
        //   619: istore          6
        //   621: lload           14
        //   623: lstore          16
        //   625: iconst_0       
        //   626: istore          20
        //   628: iconst_0       
        //   629: istore          18
        //   631: iload           7
        //   633: istore          19
        //   635: iload           20
        //   637: istore          7
        //   639: iload           6
        //   641: iconst_m1      
        //   642: if_icmpeq       688
        //   645: aload_1        
        //   646: aload           8
        //   648: aload           9
        //   650: iload           6
        //   652: ldc2_w          -9223372036854775807
        //   655: invokevirtual   com/google/android/exoplayer2/e0.i:(Lcom/google/android/exoplayer2/e0$c;Lcom/google/android/exoplayer2/e0$b;IJ)Landroid/util/Pair;
        //   658: astore          4
        //   660: aload           4
        //   662: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   665: astore          10
        //   667: aload           4
        //   669: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   672: checkcast       Ljava/lang/Long;
        //   675: invokevirtual   java/lang/Long.longValue:()J
        //   678: lstore          16
        //   680: ldc2_w          -9223372036854775807
        //   683: lstore          21
        //   685: goto            692
        //   688: lload           16
        //   690: lstore          21
        //   692: aload           5
        //   694: aload_1        
        //   695: aload           10
        //   697: lload           16
        //   699: invokevirtual   com/google/android/exoplayer2/s.n:(Lcom/google/android/exoplayer2/e0;Ljava/lang/Object;J)Lcom/google/android/exoplayer2/source/i$b;
        //   702: astore          4
        //   704: aload           4
        //   706: getfield        ac/j.e:I
        //   709: istore          6
        //   711: iload           6
        //   713: iconst_m1      
        //   714: if_icmpeq       746
        //   717: aload           11
        //   719: getfield        ac/j.e:I
        //   722: istore          23
        //   724: iload           23
        //   726: iconst_m1      
        //   727: if_icmpeq       740
        //   730: iload           6
        //   732: iload           23
        //   734: if_icmplt       740
        //   737: goto            746
        //   740: iconst_0       
        //   741: istore          6
        //   743: goto            749
        //   746: iconst_1       
        //   747: istore          6
        //   749: aload           11
        //   751: getfield        ac/j.a:Ljava/lang/Object;
        //   754: aload           10
        //   756: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   759: ifeq            789
        //   762: aload           11
        //   764: invokevirtual   ac/j.a:()Z
        //   767: ifne            789
        //   770: aload           4
        //   772: invokevirtual   ac/j.a:()Z
        //   775: ifne            789
        //   778: iload           6
        //   780: ifeq            789
        //   783: iconst_1       
        //   784: istore          6
        //   786: goto            792
        //   789: iconst_0       
        //   790: istore          6
        //   792: aload_1        
        //   793: aload           10
        //   795: aload           9
        //   797: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //   800: astore          10
        //   802: iload           13
        //   804: ifne            923
        //   807: lload           14
        //   809: lload           21
        //   811: lcmp           
        //   812: ifne            923
        //   815: aload           11
        //   817: getfield        ac/j.a:Ljava/lang/Object;
        //   820: aload           4
        //   822: getfield        ac/j.a:Ljava/lang/Object;
        //   825: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   828: ifne            834
        //   831: goto            923
        //   834: aload           11
        //   836: invokevirtual   ac/j.a:()Z
        //   839: ifeq            896
        //   842: aload           10
        //   844: aload           11
        //   846: getfield        ac/j.b:I
        //   849: invokevirtual   com/google/android/exoplayer2/e0$b.g:(I)Z
        //   852: ifeq            896
        //   855: aload           10
        //   857: aload           11
        //   859: getfield        ac/j.b:I
        //   862: aload           11
        //   864: getfield        ac/j.c:I
        //   867: invokevirtual   com/google/android/exoplayer2/e0$b.e:(II)I
        //   870: iconst_4       
        //   871: if_icmpeq       923
        //   874: aload           10
        //   876: aload           11
        //   878: getfield        ac/j.b:I
        //   881: aload           11
        //   883: getfield        ac/j.c:I
        //   886: invokevirtual   com/google/android/exoplayer2/e0$b.e:(II)I
        //   889: iconst_2       
        //   890: if_icmpeq       923
        //   893: goto            917
        //   896: aload           4
        //   898: invokevirtual   ac/j.a:()Z
        //   901: ifeq            923
        //   904: aload           10
        //   906: aload           4
        //   908: getfield        ac/j.b:I
        //   911: invokevirtual   com/google/android/exoplayer2/e0$b.g:(I)Z
        //   914: ifeq            923
        //   917: iconst_1       
        //   918: istore          13
        //   920: goto            926
        //   923: iconst_0       
        //   924: istore          13
        //   926: iload           6
        //   928: ifne            940
        //   931: aload           4
        //   933: astore          10
        //   935: iload           13
        //   937: ifeq            944
        //   940: aload           11
        //   942: astore          10
        //   944: aload           10
        //   946: invokevirtual   ac/j.a:()Z
        //   949: ifeq            1020
        //   952: aload           10
        //   954: aload           11
        //   956: invokevirtual   ac/j.equals:(Ljava/lang/Object;)Z
        //   959: ifeq            971
        //   962: aload_3        
        //   963: getfield        va/c0.s:J
        //   966: lstore          14
        //   968: goto            1017
        //   971: aload_1        
        //   972: aload           10
        //   974: getfield        ac/j.a:Ljava/lang/Object;
        //   977: aload           9
        //   979: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //   982: pop            
        //   983: aload           10
        //   985: getfield        ac/j.c:I
        //   988: aload           9
        //   990: aload           10
        //   992: getfield        ac/j.b:I
        //   995: invokevirtual   com/google/android/exoplayer2/e0$b.f:(I)I
        //   998: if_icmpne       1014
        //  1001: aload           9
        //  1003: getfield        com/google/android/exoplayer2/e0$b.l:Lbc/a;
        //  1006: getfield        bc/a.h:J
        //  1009: lstore          14
        //  1011: goto            1017
        //  1014: lconst_0       
        //  1015: lstore          14
        //  1017: goto            1024
        //  1020: lload           16
        //  1022: lstore          14
        //  1024: new             Lcom/google/android/exoplayer2/m$f;
        //  1027: dup            
        //  1028: aload           10
        //  1030: lload           14
        //  1032: lload           21
        //  1034: iload           7
        //  1036: iload           19
        //  1038: iload           18
        //  1040: invokespecial   com/google/android/exoplayer2/m$f.<init>:(Lcom/google/android/exoplayer2/source/i$b;JJZZZ)V
        //  1043: astore          10
        //  1045: goto            67
        //  1048: aload           10
        //  1050: getfield        com/google/android/exoplayer2/m$f.a:Lcom/google/android/exoplayer2/source/i$b;
        //  1053: astore          4
        //  1055: aload           10
        //  1057: getfield        com/google/android/exoplayer2/m$f.c:J
        //  1060: lstore          21
        //  1062: aload           10
        //  1064: getfield        com/google/android/exoplayer2/m$f.d:Z
        //  1067: istore          24
        //  1069: aload           10
        //  1071: getfield        com/google/android/exoplayer2/m$f.b:J
        //  1074: lstore          16
        //  1076: aload_0        
        //  1077: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1080: getfield        va/c0.b:Lcom/google/android/exoplayer2/source/i$b;
        //  1083: aload           4
        //  1085: invokevirtual   ac/j.equals:(Ljava/lang/Object;)Z
        //  1088: ifeq            1113
        //  1091: lload           16
        //  1093: aload_0        
        //  1094: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1097: getfield        va/c0.s:J
        //  1100: lcmp           
        //  1101: ifeq            1107
        //  1104: goto            1113
        //  1107: iconst_0       
        //  1108: istore          25
        //  1110: goto            1116
        //  1113: iconst_1       
        //  1114: istore          25
        //  1116: iconst_3       
        //  1117: istore          23
        //  1119: aload           10
        //  1121: getfield        com/google/android/exoplayer2/m$f.e:Z
        //  1124: ifeq            1175
        //  1127: aload_0        
        //  1128: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1131: getfield        va/c0.e:I
        //  1134: istore          6
        //  1136: iload           6
        //  1138: iconst_1       
        //  1139: if_icmpeq       1164
        //  1142: aload_0        
        //  1143: iconst_4       
        //  1144: invokevirtual   com/google/android/exoplayer2/m.W:(I)V
        //  1147: goto            1164
        //  1150: astore          11
        //  1152: iconst_1       
        //  1153: istore          19
        //  1155: iconst_4       
        //  1156: istore          6
        //  1158: iconst_0       
        //  1159: istore          7
        //  1161: goto            1762
        //  1164: aload_0        
        //  1165: iconst_0       
        //  1166: iconst_0       
        //  1167: iconst_0       
        //  1168: iconst_1       
        //  1169: invokevirtual   com/google/android/exoplayer2/m.B:(ZZZZ)V
        //  1172: goto            1175
        //  1175: iload           25
        //  1177: ifne            1296
        //  1180: aload_0        
        //  1181: getfield        com/google/android/exoplayer2/m.x:Lcom/google/android/exoplayer2/s;
        //  1184: astore          11
        //  1186: aload_0        
        //  1187: getfield        com/google/android/exoplayer2/m.Q:J
        //  1190: lstore          26
        //  1192: aload_0        
        //  1193: invokevirtual   com/google/android/exoplayer2/m.f:()J
        //  1196: lstore          28
        //  1198: iconst_4       
        //  1199: istore          30
        //  1201: iconst_1       
        //  1202: istore          20
        //  1204: iconst_1       
        //  1205: istore          18
        //  1207: iload           30
        //  1209: istore          13
        //  1211: iload           18
        //  1213: istore          19
        //  1215: lload           16
        //  1217: lstore          14
        //  1219: iload           30
        //  1221: istore          6
        //  1223: iload           20
        //  1225: istore          7
        //  1227: aload           11
        //  1229: aload_1        
        //  1230: lload           26
        //  1232: lload           28
        //  1234: invokevirtual   com/google/android/exoplayer2/s.p:(Lcom/google/android/exoplayer2/e0;JJ)Z
        //  1237: ifne            1525
        //  1240: iload           30
        //  1242: istore          13
        //  1244: iload           18
        //  1246: istore          19
        //  1248: aload_0        
        //  1249: iconst_0       
        //  1250: invokevirtual   com/google/android/exoplayer2/m.H:(Z)V
        //  1253: lload           16
        //  1255: lstore          14
        //  1257: iload           30
        //  1259: istore          6
        //  1261: iload           20
        //  1263: istore          7
        //  1265: goto            1525
        //  1268: astore          11
        //  1270: iconst_0       
        //  1271: istore          7
        //  1273: iconst_4       
        //  1274: istore          6
        //  1276: iconst_1       
        //  1277: istore          19
        //  1279: goto            1762
        //  1282: astore          11
        //  1284: iconst_0       
        //  1285: istore          7
        //  1287: iconst_1       
        //  1288: istore          19
        //  1290: iconst_4       
        //  1291: istore          6
        //  1293: goto            1762
        //  1296: iconst_1       
        //  1297: istore          20
        //  1299: iconst_1       
        //  1300: istore          18
        //  1302: iconst_4       
        //  1303: istore          30
        //  1305: iload           30
        //  1307: istore          13
        //  1309: iload           18
        //  1311: istore          19
        //  1313: lload           16
        //  1315: lstore          14
        //  1317: iload           30
        //  1319: istore          6
        //  1321: iload           20
        //  1323: istore          7
        //  1325: aload_1        
        //  1326: invokevirtual   com/google/android/exoplayer2/e0.p:()Z
        //  1329: ifne            1525
        //  1332: iload           30
        //  1334: istore          13
        //  1336: iload           18
        //  1338: istore          19
        //  1340: aload_0        
        //  1341: getfield        com/google/android/exoplayer2/m.x:Lcom/google/android/exoplayer2/s;
        //  1344: getfield        com/google/android/exoplayer2/s.h:Lva/y;
        //  1347: astore          11
        //  1349: aload           11
        //  1351: ifnull          1435
        //  1354: iload           30
        //  1356: istore          13
        //  1358: iload           18
        //  1360: istore          19
        //  1362: aload           11
        //  1364: getfield        va/y.f:Lva/z;
        //  1367: getfield        va/z.a:Lcom/google/android/exoplayer2/source/i$b;
        //  1370: aload           4
        //  1372: invokevirtual   ac/j.equals:(Ljava/lang/Object;)Z
        //  1375: ifeq            1417
        //  1378: iload           30
        //  1380: istore          13
        //  1382: iload           18
        //  1384: istore          19
        //  1386: aload           11
        //  1388: aload_0        
        //  1389: getfield        com/google/android/exoplayer2/m.x:Lcom/google/android/exoplayer2/s;
        //  1392: aload_1        
        //  1393: aload           11
        //  1395: getfield        va/y.f:Lva/z;
        //  1398: invokevirtual   com/google/android/exoplayer2/s.h:(Lcom/google/android/exoplayer2/e0;Lva/z;)Lva/z;
        //  1401: putfield        va/y.f:Lva/z;
        //  1404: iload           30
        //  1406: istore          13
        //  1408: iload           18
        //  1410: istore          19
        //  1412: aload           11
        //  1414: invokevirtual   va/y.h:()V
        //  1417: iload           30
        //  1419: istore          13
        //  1421: iload           18
        //  1423: istore          19
        //  1425: aload           11
        //  1427: getfield        va/y.l:Lva/y;
        //  1430: astore          11
        //  1432: goto            1349
        //  1435: iload           30
        //  1437: istore          13
        //  1439: iload           18
        //  1441: istore          19
        //  1443: aload_0        
        //  1444: getfield        com/google/android/exoplayer2/m.x:Lcom/google/android/exoplayer2/s;
        //  1447: astore          11
        //  1449: iload           30
        //  1451: istore          13
        //  1453: iload           18
        //  1455: istore          19
        //  1457: aload           11
        //  1459: getfield        com/google/android/exoplayer2/s.h:Lva/y;
        //  1462: aload           11
        //  1464: getfield        com/google/android/exoplayer2/s.i:Lva/y;
        //  1467: if_acmpeq       1477
        //  1470: iload           18
        //  1472: istore          7
        //  1474: goto            1480
        //  1477: iconst_0       
        //  1478: istore          7
        //  1480: iload           30
        //  1482: istore          13
        //  1484: iload           18
        //  1486: istore          19
        //  1488: aload_0        
        //  1489: aload           4
        //  1491: lload           16
        //  1493: iload           7
        //  1495: iload           24
        //  1497: invokevirtual   com/google/android/exoplayer2/m.J:(Lcom/google/android/exoplayer2/source/i$b;JZZ)J
        //  1500: lstore          14
        //  1502: iload           30
        //  1504: istore          6
        //  1506: iload           20
        //  1508: istore          7
        //  1510: goto            1525
        //  1513: iconst_0       
        //  1514: istore          7
        //  1516: astore          11
        //  1518: iload           13
        //  1520: istore          6
        //  1522: goto            1762
        //  1525: iconst_0       
        //  1526: istore          19
        //  1528: aload_0        
        //  1529: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1532: astore          12
        //  1534: aload           12
        //  1536: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //  1539: astore          11
        //  1541: aload           12
        //  1543: getfield        va/c0.b:Lcom/google/android/exoplayer2/source/i$b;
        //  1546: astore          12
        //  1548: aload           10
        //  1550: getfield        com/google/android/exoplayer2/m$f.f:Z
        //  1553: ifeq            1563
        //  1556: lload           14
        //  1558: lstore          16
        //  1560: goto            1568
        //  1563: ldc2_w          -9223372036854775807
        //  1566: lstore          16
        //  1568: aload_0        
        //  1569: aload_1        
        //  1570: aload           4
        //  1572: aload           11
        //  1574: aload           12
        //  1576: lload           16
        //  1578: invokevirtual   com/google/android/exoplayer2/m.e0:(Lcom/google/android/exoplayer2/e0;Lcom/google/android/exoplayer2/source/i$b;Lcom/google/android/exoplayer2/e0;Lcom/google/android/exoplayer2/source/i$b;J)V
        //  1581: iload           25
        //  1583: ifne            1599
        //  1586: lload           21
        //  1588: aload_0        
        //  1589: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1592: getfield        va/c0.c:J
        //  1595: lcmp           
        //  1596: ifeq            1707
        //  1599: aload_0        
        //  1600: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1603: astore          10
        //  1605: aload           10
        //  1607: getfield        va/c0.b:Lcom/google/android/exoplayer2/source/i$b;
        //  1610: getfield        ac/j.a:Ljava/lang/Object;
        //  1613: astore          11
        //  1615: aload           10
        //  1617: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //  1620: astore          10
        //  1622: iload           25
        //  1624: ifeq            1662
        //  1627: iload_2        
        //  1628: ifeq            1662
        //  1631: aload           10
        //  1633: invokevirtual   com/google/android/exoplayer2/e0.p:()Z
        //  1636: ifne            1662
        //  1639: aload           10
        //  1641: aload           11
        //  1643: aload_0        
        //  1644: getfield        com/google/android/exoplayer2/m.q:Lcom/google/android/exoplayer2/e0$b;
        //  1647: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //  1650: getfield        com/google/android/exoplayer2/e0$b.k:Z
        //  1653: ifne            1662
        //  1656: iload           7
        //  1658: istore_2       
        //  1659: goto            1665
        //  1662: iload           19
        //  1664: istore_2       
        //  1665: aload_0        
        //  1666: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1669: getfield        va/c0.d:J
        //  1672: lstore          16
        //  1674: aload_1        
        //  1675: aload           11
        //  1677: invokevirtual   com/google/android/exoplayer2/e0.b:(Ljava/lang/Object;)I
        //  1680: iconst_m1      
        //  1681: if_icmpne       1688
        //  1684: iload           6
        //  1686: istore          23
        //  1688: aload_0        
        //  1689: aload_0        
        //  1690: aload           4
        //  1692: lload           14
        //  1694: lload           21
        //  1696: lload           16
        //  1698: iload_2        
        //  1699: iload           23
        //  1701: invokevirtual   com/google/android/exoplayer2/m.p:(Lcom/google/android/exoplayer2/source/i$b;JJJZI)Lva/c0;
        //  1704: putfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1707: aload_0        
        //  1708: invokevirtual   com/google/android/exoplayer2/m.C:()V
        //  1711: aload_0        
        //  1712: aload_1        
        //  1713: aload_0        
        //  1714: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1717: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //  1720: invokevirtual   com/google/android/exoplayer2/m.E:(Lcom/google/android/exoplayer2/e0;Lcom/google/android/exoplayer2/e0;)V
        //  1723: aload_0        
        //  1724: aload_0        
        //  1725: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1728: aload_1        
        //  1729: invokevirtual   va/c0.h:(Lcom/google/android/exoplayer2/e0;)Lva/c0;
        //  1732: putfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1735: aload_1        
        //  1736: invokevirtual   com/google/android/exoplayer2/e0.p:()Z
        //  1739: ifne            1747
        //  1742: aload_0        
        //  1743: aconst_null    
        //  1744: putfield        com/google/android/exoplayer2/m.P:Lcom/google/android/exoplayer2/m$g;
        //  1747: aload_0        
        //  1748: iload           19
        //  1750: invokevirtual   com/google/android/exoplayer2/m.l:(Z)V
        //  1753: return         
        //  1754: astore          11
        //  1756: iconst_0       
        //  1757: istore          7
        //  1759: goto            1273
        //  1762: aload_0        
        //  1763: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1766: astore_3       
        //  1767: aload_3        
        //  1768: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //  1771: astore          12
        //  1773: aload_3        
        //  1774: getfield        va/c0.b:Lcom/google/android/exoplayer2/source/i$b;
        //  1777: astore_3       
        //  1778: aload           10
        //  1780: getfield        com/google/android/exoplayer2/m$f.f:Z
        //  1783: ifeq            1793
        //  1786: lload           16
        //  1788: lstore          14
        //  1790: goto            1798
        //  1793: ldc2_w          -9223372036854775807
        //  1796: lstore          14
        //  1798: aload_0        
        //  1799: aload_1        
        //  1800: aload           4
        //  1802: aload           12
        //  1804: aload_3        
        //  1805: lload           14
        //  1807: invokevirtual   com/google/android/exoplayer2/m.e0:(Lcom/google/android/exoplayer2/e0;Lcom/google/android/exoplayer2/source/i$b;Lcom/google/android/exoplayer2/e0;Lcom/google/android/exoplayer2/source/i$b;J)V
        //  1810: iload           25
        //  1812: ifne            1828
        //  1815: lload           21
        //  1817: aload_0        
        //  1818: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1821: getfield        va/c0.c:J
        //  1824: lcmp           
        //  1825: ifeq            1936
        //  1828: aload_0        
        //  1829: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1832: astore          12
        //  1834: aload           12
        //  1836: getfield        va/c0.b:Lcom/google/android/exoplayer2/source/i$b;
        //  1839: getfield        ac/j.a:Ljava/lang/Object;
        //  1842: astore          10
        //  1844: aload           12
        //  1846: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //  1849: astore          12
        //  1851: iload           25
        //  1853: ifeq            1891
        //  1856: iload_2        
        //  1857: ifeq            1891
        //  1860: aload           12
        //  1862: invokevirtual   com/google/android/exoplayer2/e0.p:()Z
        //  1865: ifne            1891
        //  1868: aload           12
        //  1870: aload           10
        //  1872: aload_0        
        //  1873: getfield        com/google/android/exoplayer2/m.q:Lcom/google/android/exoplayer2/e0$b;
        //  1876: invokevirtual   com/google/android/exoplayer2/e0.g:(Ljava/lang/Object;Lcom/google/android/exoplayer2/e0$b;)Lcom/google/android/exoplayer2/e0$b;
        //  1879: getfield        com/google/android/exoplayer2/e0$b.k:Z
        //  1882: ifne            1891
        //  1885: iload           19
        //  1887: istore_2       
        //  1888: goto            1894
        //  1891: iload           7
        //  1893: istore_2       
        //  1894: aload_0        
        //  1895: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1898: getfield        va/c0.d:J
        //  1901: lstore          14
        //  1903: aload_1        
        //  1904: aload           10
        //  1906: invokevirtual   com/google/android/exoplayer2/e0.b:(Ljava/lang/Object;)I
        //  1909: iconst_m1      
        //  1910: if_icmpne       1917
        //  1913: iload           6
        //  1915: istore          23
        //  1917: aload_0        
        //  1918: aload_0        
        //  1919: aload           4
        //  1921: lload           16
        //  1923: lload           21
        //  1925: lload           14
        //  1927: iload_2        
        //  1928: iload           23
        //  1930: invokevirtual   com/google/android/exoplayer2/m.p:(Lcom/google/android/exoplayer2/source/i$b;JJJZI)Lva/c0;
        //  1933: putfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1936: aload_0        
        //  1937: invokevirtual   com/google/android/exoplayer2/m.C:()V
        //  1940: aload_0        
        //  1941: aload_1        
        //  1942: aload_0        
        //  1943: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1946: getfield        va/c0.a:Lcom/google/android/exoplayer2/e0;
        //  1949: invokevirtual   com/google/android/exoplayer2/m.E:(Lcom/google/android/exoplayer2/e0;Lcom/google/android/exoplayer2/e0;)V
        //  1952: aload_0        
        //  1953: aload_0        
        //  1954: getfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1957: aload_1        
        //  1958: invokevirtual   va/c0.h:(Lcom/google/android/exoplayer2/e0;)Lva/c0;
        //  1961: putfield        com/google/android/exoplayer2/m.C:Lva/c0;
        //  1964: aload_1        
        //  1965: invokevirtual   com/google/android/exoplayer2/e0.p:()Z
        //  1968: ifne            1976
        //  1971: aload_0        
        //  1972: aconst_null    
        //  1973: putfield        com/google/android/exoplayer2/m.P:Lcom/google/android/exoplayer2/m$g;
        //  1976: aload_0        
        //  1977: iload           7
        //  1979: invokevirtual   com/google/android/exoplayer2/m.l:(Z)V
        //  1982: aload           11
        //  1984: athrow         
        //    Exceptions:
        //  throws com.google.android.exoplayer2.ExoPlaybackException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  1119   1136   1754   1762   Any
        //  1142   1147   1150   1164   Any
        //  1164   1172   1282   1296   Any
        //  1180   1186   1282   1296   Any
        //  1186   1198   1268   1273   Any
        //  1227   1240   1513   1525   Any
        //  1248   1253   1513   1525   Any
        //  1325   1332   1513   1525   Any
        //  1340   1349   1513   1525   Any
        //  1362   1378   1513   1525   Any
        //  1386   1404   1513   1525   Any
        //  1412   1417   1513   1525   Any
        //  1425   1432   1513   1525   Any
        //  1443   1449   1513   1525   Any
        //  1457   1470   1513   1525   Any
        //  1488   1502   1513   1525   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1273:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void n(final com.google.android.exoplayer2.source.h h) throws ExoPlaybackException {
        final y j = this.x.j;
        if (j == null || j.a != h) {
            return;
        }
        final float f = this.t.c().f;
        final com.google.android.exoplayer2.e0 a = this.C.a;
        j.d = true;
        j.m = j.a.p();
        final o g = j.g(f, a);
        final va.z f2 = j.f;
        final long b = f2.b;
        final long e = f2.e;
        long max = b;
        if (e != -9223372036854775807L) {
            max = b;
            if (b >= e) {
                max = Math.max(0L, e - 1L);
            }
        }
        final long a2 = j.a(g, max, false, new boolean[j.i.length]);
        final long o = j.o;
        final va.z f3 = j.f;
        j.o = f3.b - a2 + o;
        j.f = f3.b(a2);
        this.k.onTracksSelected(this.f, j.m, j.n.c);
        if (j == this.x.h) {
            this.D(j.f.b);
            this.d(new boolean[this.f.length]);
            final c0 c = this.C;
            final i$b b2 = c.b;
            final long b3 = j.f.b;
            this.C = this.p(b2, b3, c.c, b3, false, 5);
        }
        this.t();
    }
    
    public final void o(final v v, final float n, final boolean b, final boolean b2) throws ExoPlaybackException {
        if (b) {
            if (b2) {
                this.D.a(1);
            }
            this.C = this.C.f(v);
        }
        final float f = v.f;
        y y = this.x.h;
        int n2;
        while (true) {
            n2 = 0;
            int i = 0;
            if (y == null) {
                break;
            }
            for (wc.f[] c = y.n.c; i < c.length; ++i) {
                final wc.f f2 = c[i];
                if (f2 != null) {
                    f2.q(f);
                }
            }
            y = y.l;
        }
        final z[] f3 = this.f;
        for (int length = f3.length, j = n2; j < length; ++j) {
            final z z = f3[j];
            if (z != null) {
                z.v(n, v.f);
            }
        }
    }
    
    public final c0 p(final i$b i$b, final long n, final long n2, final long n3, final boolean b, final int e) {
        this.S = (this.S || n != this.C.s || !((ac.j)i$b).equals(this.C.b));
        this.C();
        final c0 c = this.C;
        u u = c.h;
        o o = c.i;
        Object o2 = c.j;
        if (this.y.k) {
            final y h = this.x.h;
            if (h == null) {
                u = ac.u.i;
            }
            else {
                u = h.m;
            }
            if (h == null) {
                o = this.j;
            }
            else {
                o = h.n;
            }
            final wc.f[] c2 = o.c;
            final ImmutableList$a immutableList$a = new ImmutableList$a();
            int n4;
            int n5;
            for (int length = c2.length, i = n4 = 0; i < length; ++i, n4 = n5) {
                final wc.f f = c2[i];
                n5 = n4;
                if (f != null) {
                    final pb.a o3 = f.p(0).o;
                    if (o3 == null) {
                        ((ImmutableCollection$a)immutableList$a).c((Object)new pb.a(new a$b[0]));
                        n5 = n4;
                    }
                    else {
                        ((ImmutableCollection$a)immutableList$a).c((Object)o3);
                        n5 = 1;
                    }
                }
            }
            if (n4 != 0) {
                o2 = immutableList$a.f();
            }
            else {
                o2 = ImmutableList.of();
            }
            if (h != null) {
                final va.z f2 = h.f;
                if (f2.c != n2) {
                    h.f = f2.a(n2);
                }
            }
        }
        else if (!((ac.j)i$b).equals(c.b)) {
            u = ac.u.i;
            o = this.j;
            o2 = ImmutableList.of();
        }
        if (b) {
            final d d = this.D;
            if (d.d && d.e != 5) {
                d0.c(e == 5);
            }
            else {
                d.a = true;
                d.d = true;
                d.e = e;
            }
        }
        final c0 c3 = this.C;
        final long q = c3.q;
        final y j = this.x.j;
        long max;
        if (j == null) {
            max = 0L;
        }
        else {
            max = Math.max(0L, q - (this.Q - j.o));
        }
        return c3.b(i$b, n, n2, n3, max, u, o, (List)o2);
    }
    
    public final boolean q() {
        final y j = this.x.j;
        if (j == null) {
            return false;
        }
        long g;
        if (!j.d) {
            g = 0L;
        }
        else {
            g = j.a.g();
        }
        return g != Long.MIN_VALUE;
    }
    
    public final boolean s() {
        final y h = this.x.h;
        final long e = h.f.e;
        return h.d && (e == -9223372036854775807L || this.C.s < e || !this.X());
    }
    
    public final void t() {
        final boolean q = this.q();
        final boolean b = false;
        boolean shouldContinueLoading;
        if (!q) {
            shouldContinueLoading = false;
        }
        else {
            final y j = this.x.j;
            final boolean d = j.d;
            final long n = 0L;
            long g;
            if (!d) {
                g = 0L;
            }
            else {
                g = j.a.g();
            }
            final y i = this.x.j;
            long max;
            if (i == null) {
                max = n;
            }
            else {
                max = Math.max(0L, g - (this.Q - i.o));
            }
            long q2;
            long n2;
            if (j == this.x.h) {
                q2 = this.Q;
                n2 = j.o;
            }
            else {
                q2 = this.Q - j.o;
                n2 = j.f.b;
            }
            shouldContinueLoading = this.k.shouldContinueLoading(q2 - n2, max, this.t.c().f);
        }
        this.I = shouldContinueLoading;
        if (shouldContinueLoading) {
            final y k = this.x.j;
            final long q3 = this.Q;
            boolean b2 = b;
            if (k.l == null) {
                b2 = true;
            }
            d0.f(b2);
            k.a.d(q3 - k.o);
        }
        this.c0();
    }
    
    public final void u() {
        final d d = this.D;
        final c0 c = this.C;
        final boolean a = d.a | d.b != c;
        d.a = a;
        d.b = c;
        if (a) {
            final com.google.android.exoplayer2.k k = (com.google.android.exoplayer2.k)((j)this.w).g;
            k.i.i(new h5.f(1, k, d));
            this.D = new d(this.C);
        }
    }
    
    public final void v() throws ExoPlaybackException {
        this.m(this.y.c(), true);
    }
    
    public final void w(final b b) throws ExoPlaybackException {
        final d d = this.D;
        boolean b2 = true;
        d.a(1);
        final t y = this.y;
        b.getClass();
        y.getClass();
        if (y.b.size() < 0) {
            b2 = false;
        }
        d0.c(b2);
        y.j = null;
        this.m(y.c(), false);
    }
    
    public final void x() {
        this.D.a(1);
        final int n = 0;
        this.B(false, false, false, true);
        this.k.onPrepared();
        int n2;
        if (this.C.a.p()) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        this.W(n2);
        final t y = this.y;
        final yc.l f = this.l.f();
        d0.f(y.k ^ true);
        y.l = (yc.s)f;
        for (int i = n; i < y.b.size(); ++i) {
            final t$c t$c = y.b.get(i);
            y.f(t$c);
            y.i.add(t$c);
        }
        y.k = true;
        this.m.k(2);
    }
    
    public final void y() {
        this.B(true, false, true, false);
        this.k.onReleased();
        this.W(1);
        this.n.quit();
        synchronized (this) {
            this.E = true;
            this.notifyAll();
        }
    }
    
    public final void z(final int n, final int n2, final q j) throws ExoPlaybackException {
        final d d = this.D;
        boolean b = true;
        d.a(1);
        final t y = this.y;
        y.getClass();
        if (n < 0 || n > n2 || n2 > y.b.size()) {
            b = false;
        }
        d0.c(b);
        y.j = j;
        y.h(n, n2);
        this.m(y.c(), false);
    }
    
    public static final class a
    {
        public final List<t$c> a;
        public final q b;
        public final int c;
        public final long d;
        
        public a(final ArrayList a, final q b, final int c, final long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c implements Comparable<c>
    {
        public c() {
            throw null;
        }
        
        @Override
        public final int compareTo(final Object o) {
            o.getClass();
            return 0;
        }
    }
    
    public static final class d
    {
        public boolean a;
        public c0 b;
        public int c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        
        public d(final c0 b) {
            this.b = b;
        }
        
        public final void a(final int n) {
            this.a |= (n > 0);
            this.c += n;
        }
    }
    
    public interface e
    {
    }
    
    public static final class f
    {
        public final i$b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        
        public f(final i$b a, final long b, final long c, final boolean d, final boolean e, final boolean f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class g
    {
        public final com.google.android.exoplayer2.e0 a;
        public final int b;
        public final long c;
        
        public g(final com.google.android.exoplayer2.e0 a, final int b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
