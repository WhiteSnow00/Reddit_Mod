// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.view.View;
import android.media.metrics.LogSessionId;
import java.util.concurrent.TimeoutException;
import java.util.HashSet;
import android.content.BroadcastReceiver;
import va.t;
import ac.u;
import android.graphics.Rect;
import android.view.SurfaceHolder$Callback;
import java.util.Collections;
import android.os.Bundle;
import android.net.Uri;
import android.view.SurfaceView;
import android.graphics.SurfaceTexture;
import android.view.TextureView$SurfaceTextureListener;
import java.util.Iterator;
import com.google.android.exoplayer2.source.i$b;
import pb.a$b;
import va.p;
import android.util.Pair;
import a4.y0;
import yc.d$a;
import com.google.common.collect.ImmutableList;
import android.media.AudioManager;
import android.os.Handler$Callback;
import wc.h;
import wc.f;
import va.f0;
import ra.s;
import ad.d0;
import va.g0;
import android.os.Handler;
import android.util.Log;
import ad.x;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import mc.a;
import java.util.List;
import android.content.Context;
import ad.e;
import wc.o;
import android.view.TextureView;
import android.view.SurfaceHolder;
import android.view.Surface;
import android.media.AudioTrack;
import ac.q;
import va.h0;
import va.j0;
import va.i0;

public final class k extends d implements j
{
    public final c A;
    public final c0 B;
    public final i0 C;
    public final j0 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public h0 L;
    public q M;
    public w.a N;
    public r O;
    public n P;
    public AudioTrack Q;
    public Object R;
    public Surface S;
    public SurfaceHolder T;
    public cd.j U;
    public boolean V;
    public TextureView W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public final o b;
    public xa.d b0;
    public final w.a c;
    public float c0;
    public final e d;
    public boolean d0;
    public final Context e;
    public List<mc.a> e0;
    public final w f;
    public boolean f0;
    public final z[] g;
    public boolean g0;
    public final wc.n h;
    public i h0;
    public final ad.k i;
    public bd.q i0;
    public final g50.j j;
    public r j0;
    public final m k;
    public va.c0 k0;
    public final ad.m<w.c> l;
    public int l0;
    public final CopyOnWriteArraySet<j.a> m;
    public long m0;
    public final e0$b n;
    public final ArrayList o;
    public final boolean p;
    public final com.google.android.exoplayer2.source.i.a q;
    public final wa.a r;
    public final Looper s;
    public final yc.d t;
    public final long u;
    public final long v;
    public final x w;
    public final k.k$b x;
    public final k.k$c y;
    public final b z;
    
    static {
        va.w.a("goog.exo.exoplayer");
    }
    
    public k(final j.b b, w f) {
        this.d = new e();
        try {
            final String hexString = Integer.toHexString(System.identityHashCode(this));
            final String e = ad.c0.e;
            final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(e).length());
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [");
            sb.append("ExoPlayerLib/2.17.1");
            sb.append("] [");
            sb.append(e);
            sb.append("]");
            Log.i("ExoPlayerImpl", sb.toString());
            this.e = b.a.getApplicationContext();
            this.r = (wa.a)b.h.apply((Object)b.b);
            this.b0 = b.j;
            this.X = b.k;
            this.d0 = false;
            this.E = b.r;
            final k.k$b x = new k.k$b(this);
            this.x = x;
            this.y = new k.k$c();
            final Handler handler = new Handler(b.i);
            final z[] a = ((g0)b.c.get()).a(handler, x, x, x, x);
            this.g = a;
            ad.d0.f(a.length > 0);
            this.h = (wc.n)b.e.get();
            this.q = (com.google.android.exoplayer2.source.i.a)b.d.get();
            this.t = (yc.d)b.g.get();
            this.p = b.l;
            this.L = b.m;
            this.u = b.n;
            this.v = b.o;
            final Looper i = b.i;
            this.s = i;
            final x b2 = b.b;
            this.w = b2;
            if (f == null) {
                f = (w)this;
            }
            this.f = f;
            this.l = new ad.m<w.c>(i, b2, new s(this, 1));
            this.m = new CopyOnWriteArraySet<j.a>();
            this.o = new ArrayList();
            this.M = new q.a();
            this.b = new o(new f0[a.length], new f[a.length], com.google.android.exoplayer2.f0.g, null);
            this.n = new e0$b();
            final w.a.a a2 = new w.a.a();
            final ad.j.a a3 = a2.a;
            a3.getClass();
            for (int j = 0; j < 20; ++j) {
                a3.a((new int[] { 1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28 })[j]);
            }
            final wc.n h = this.h;
            h.getClass();
            a2.a(29, h instanceof wc.e);
            final w.a b3 = a2.b();
            this.c = b3;
            final w.a.a a4 = new w.a.a();
            final ad.j.a a5 = a4.a;
            final ad.j f2 = b3.f;
            a5.getClass();
            for (int k = 0; k < f2.b(); ++k) {
                a5.a(f2.a(k));
            }
            a4.a.a(4);
            a4.a.a(10);
            this.N = a4.b();
            this.i = this.w.c(this.s, null);
            final g50.j l = new g50.j((Object)this, 1);
            this.j = l;
            this.k0 = va.c0.i(this.b);
            this.r.w(this.f, this.s);
            final int a6 = ad.c0.a;
            wa.c0 a7;
            if (a6 < 31) {
                a7 = new wa.c0();
            }
            else {
                a7 = com.google.android.exoplayer2.k.a.a();
            }
            this.k = new m(this.g, this.h, this.b, (va.x)b.f.get(), this.t, this.F, this.G, this.r, this.L, b.p, b.q, false, this.s, this.w, l, a7);
            this.c0 = 1.0f;
            this.F = 0;
            final r m = com.google.android.exoplayer2.r.M;
            this.O = m;
            this.j0 = m;
            int generateAudioSessionId = -1;
            this.l0 = -1;
            if (a6 < 21) {
                final AudioTrack q = this.Q;
                if (q != null && q.getAudioSessionId() != 0) {
                    this.Q.release();
                    this.Q = null;
                }
                if (this.Q == null) {
                    this.Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.a0 = this.Q.getAudioSessionId();
            }
            else {
                final AudioManager audioManager = (AudioManager)this.e.getSystemService("audio");
                if (audioManager != null) {
                    generateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.a0 = generateAudioSessionId;
            }
            this.e0 = (List<mc.a>)ImmutableList.of();
            this.f0 = true;
            this.R(this.r);
            this.t.g(new Handler(this.s), (d$a)this.r);
            this.m.add((j.a)this.x);
            (this.z = new b(b.a, handler, this.x)).a();
            (this.A = new c(b.a, handler, this.x)).c();
            final c0 b4 = new c0(b.a, handler, this.x);
            (this.B = b4).b(ad.c0.z(this.b0.h));
            this.C = new i0(b.a);
            this.D = new j0(b.a);
            this.h0 = f0(b4);
            this.i0 = bd.q.j;
            this.s0(1, 10, this.a0);
            this.s0(2, 10, this.a0);
            this.s0(1, 3, this.b0);
            this.s0(2, 4, this.X);
            this.s0(2, 5, 0);
            this.s0(1, 9, this.d0);
            this.s0(2, 7, this.y);
            this.s0(6, 8, this.y);
        }
        finally {
            this.d.e();
        }
    }
    
    public static i f0(final c0 c0) {
        c0.getClass();
        int a;
        if (ad.c0.a >= 28) {
            a = y0.a(c0.d, c0.f);
        }
        else {
            a = 0;
        }
        return new i(0, a, c0.d.getStreamMaxVolume(c0.f));
    }
    
    public static long k0(final va.c0 c0) {
        final e0$c e0$c = new e0$c();
        final e0$b e0$b = new e0$b();
        c0.a.g(((ac.j)c0.b).a, e0$b);
        final long c2 = c0.c;
        long r;
        if (c2 == -9223372036854775807L) {
            r = c0.a.m(e0$b.h, e0$c).r;
        }
        else {
            r = e0$b.j + c2;
        }
        return r;
    }
    
    public static boolean l0(final va.c0 c0) {
        return c0.e == 3 && c0.l && c0.m == 0;
    }
    
    public final void A0() {
        final w.a n = this.N;
        final w f = this.f;
        final w.a c = this.c;
        final int a = ad.c0.a;
        final boolean b = f.b();
        final boolean w = f.w();
        final boolean p = f.P();
        final boolean k = f.k();
        final boolean z = f.z();
        final boolean f2 = f.F();
        final boolean p2 = f.I().p();
        final w.a.a a2 = new w.a.a();
        final ad.j.a a3 = a2.a;
        final ad.j f3 = c.f;
        a3.getClass();
        final boolean b2 = false;
        for (int i = 0; i < f3.b(); ++i) {
            a3.a(f3.a(i));
        }
        final boolean b3 = b ^ true;
        a2.a(4, b3);
        a2.a(5, w && !b);
        a2.a(6, p && !b);
        a2.a(7, !p2 && (p || !z || w) && !b);
        a2.a(8, k && !b);
        a2.a(9, !p2 && (k || (z && f2)) && !b);
        a2.a(10, b3);
        a2.a(11, w && !b);
        boolean b4 = b2;
        if (w) {
            b4 = b2;
            if (!b) {
                b4 = true;
            }
        }
        a2.a(12, b4);
        final w.a b5 = a2.b();
        this.N = b5;
        if (!b5.equals(n)) {
            this.l.c(13, (ad.m.a<w.c>)new ha.b((Object)this, 3));
        }
    }
    
    public final void B0(final int n, final int n2, final boolean b) {
        final int n3 = 0;
        int n4;
        if (b && n != -1) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        int n5 = n3;
        if (n4 != 0) {
            n5 = n3;
            if (n != 1) {
                n5 = 1;
            }
        }
        final va.c0 k0 = this.k0;
        if ((k0.l ? 1 : 0) == n4 && k0.m == n5) {
            return;
        }
        ++this.H;
        final va.c0 d = k0.d(n5, (boolean)(n4 != 0));
        this.k.m.e(1, n4, n5).a();
        this.C0(d, 0, n2, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final void C0(final va.c0 k0, int n, final int n2, final boolean b, final boolean b2, final int n3, long u, int n4) {
        final va.c0 k2 = this.k0;
        this.k0 = k0;
        final boolean equals = k2.a.equals((Object)k0.a);
        final e0 a = k2.a;
        final e0 a2 = k0.a;
        final boolean p8 = a2.p();
        final Integer value = -1;
        Pair pair;
        if (p8 && a.p()) {
            pair = new Pair((Object)Boolean.FALSE, (Object)value);
        }
        else if (a2.p() != a.p()) {
            pair = new Pair((Object)Boolean.TRUE, (Object)3);
        }
        else if (!a.m(a.g(((ac.j)k2.b).a, this.n).h, super.a).f.equals(a2.m(a2.g(((ac.j)k0.b).a, this.n).h, super.a).f)) {
            int n5;
            if (b2 && n3 == 0) {
                n5 = 1;
            }
            else if (b2 && n3 == 1) {
                n5 = 2;
            }
            else {
                if (!(equals ^ true)) {
                    throw new IllegalStateException();
                }
                n5 = 3;
            }
            pair = new Pair((Object)Boolean.TRUE, (Object)n5);
        }
        else if (b2 && n3 == 0 && ((ac.j)k2.b).d < ((ac.j)k0.b).d) {
            pair = new Pair((Object)Boolean.TRUE, (Object)0);
        }
        else {
            pair = new Pair((Object)Boolean.FALSE, (Object)value);
        }
        final boolean booleanValue = (boolean)pair.first;
        final int intValue = (int)pair.second;
        r o = this.O;
        com.google.android.exoplayer2.q h;
        if (booleanValue) {
            if (!k0.a.p()) {
                h = k0.a.m(k0.a.g(((ac.j)k0.b).a, this.n).h, super.a).h;
            }
            else {
                h = null;
            }
            this.j0 = com.google.android.exoplayer2.r.M;
        }
        else {
            h = null;
        }
        if (booleanValue || !k2.j.equals(k0.j)) {
            final r j0 = this.j0;
            j0.getClass();
            final r.a a3 = new r.a(j0);
            final List i = k0.j;
            for (int l = 0; l < i.size(); ++l) {
                final pb.a a4 = i.get(l);
                int n6 = 0;
                while (true) {
                    final a$b[] f = a4.f;
                    if (n6 >= f.length) {
                        break;
                    }
                    f[n6].P(a3);
                    ++n6;
                }
            }
            this.j0 = new r(a3);
            o = this.d0();
        }
        final boolean equals2 = o.equals((Object)this.O);
        this.O = o;
        final boolean b3 = k2.l != k0.l;
        final boolean b4 = k2.e != k0.e;
        if (b4 || b3) {
            this.D0();
        }
        final boolean b5 = k2.g != k0.g;
        if (!k2.a.equals((Object)k0.a)) {
            this.l.c(0, (ad.m.a<w.c>)new com.reddit.video.creation.widgets.recording.presenter.player.a((Object)k0, n));
        }
        if (b2) {
            final e0$b e0$b = new e0$b();
            Object a5;
            Object f2;
            com.google.android.exoplayer2.q h2;
            if (!k2.a.p()) {
                a5 = ((ac.j)k2.b).a;
                k2.a.g(a5, e0$b);
                n4 = e0$b.h;
                n = k2.a.b(a5);
                f2 = k2.a.m(n4, super.a).f;
                h2 = super.a.h;
            }
            else {
                f2 = null;
                h2 = null;
                a5 = null;
                n = -1;
            }
            long n7 = 0L;
            long n8 = 0L;
            Label_0932: {
                if (n3 == 0) {
                    if (((ac.j)k2.b).a()) {
                        final i$b b6 = k2.b;
                        n7 = e0$b.a(((ac.j)b6).b, ((ac.j)b6).c);
                        n8 = k0(k2);
                        break Label_0932;
                    }
                    if (((ac.j)k2.b).e != -1) {
                        n7 = k0(this.k0);
                    }
                    else {
                        n7 = e0$b.j + e0$b.i;
                    }
                }
                else {
                    if (((ac.j)k2.b).a()) {
                        n7 = k2.s;
                        n8 = k0(k2);
                        break Label_0932;
                    }
                    n7 = e0$b.j + k2.s;
                }
                n8 = n7;
            }
            final long u2 = ad.c0.U(n7);
            final long u3 = ad.c0.U(n8);
            final i$b b7 = k2.b;
            final w.d d = new w.d(f2, n4, h2, a5, n, u2, u3, ((ac.j)b7).b, ((ac.j)b7).c);
            n4 = this.S();
            Object a6;
            Object f3;
            com.google.android.exoplayer2.q h3;
            if (!this.k0.a.p()) {
                final va.c0 k3 = this.k0;
                a6 = ((ac.j)k3.b).a;
                k3.a.g(a6, this.n);
                n = this.k0.a.b(a6);
                f3 = this.k0.a.m(n4, super.a).f;
                h3 = super.a.h;
            }
            else {
                f3 = null;
                h3 = null;
                a6 = null;
                n = -1;
            }
            final long u4 = ad.c0.U(u);
            if (((ac.j)this.k0.b).a()) {
                u = ad.c0.U(k0(this.k0));
            }
            else {
                u = u4;
            }
            final i$b b8 = this.k0.b;
            this.l.c(11, (ad.m.a<w.c>)new qa.d(d, new w.d(f3, n4, h3, a6, n, u4, u, ((ac.j)b8).b, ((ac.j)b8).c), n3));
        }
        if (booleanValue) {
            this.l.c(1, new p(h, intValue, 1));
        }
        if (k2.f != k0.f) {
            this.l.c(10, new va.q(k0, 1));
            if (k0.f != null) {
                this.l.c(10, new va.r(k0, 1));
            }
        }
        final o m = k2.i;
        final o i2 = k0.i;
        if (m != i2) {
            this.h.a(i2.e);
            this.l.c(2, (ad.m.a<w.c>)new qa.h(2, (Object)k0, (Object)new wc.j((wc.i[])k0.i.c)));
            this.l.c(2, (ad.m.a<w.c>)new m3.b((Object)k0, 5));
        }
        if (equals2 ^ true) {
            this.l.c(14, new va.o(this.O, 1));
        }
        if (b5) {
            this.l.c(3, new ra.o(k0, 1));
        }
        if (b4 || b3) {
            this.l.c(-1, new va.q(k0, 2));
        }
        if (b4) {
            this.l.c(4, new va.o(k0, 0));
        }
        if (b3) {
            this.l.c(5, new p(k0, n2, 0));
        }
        if (k2.m != k0.m) {
            this.l.c(6, new va.q(k0, 0));
        }
        if (l0(k2) != l0(k0)) {
            this.l.c(7, new va.r(k0, 0));
        }
        if (!k2.n.equals(k0.n)) {
            this.l.c(12, (ad.m.a<w.c>)new g50.j((Object)k0, 2));
        }
        if (b) {
            this.l.c(-1, new ra.n(3));
        }
        this.A0();
        this.l.b();
        if (k2.o != k0.o) {
            final Iterator<j.a> iterator = this.m.iterator();
            while (iterator.hasNext()) {
                iterator.next().getClass();
            }
        }
        if (k2.p != k0.p) {
            final Iterator<j.a> iterator2 = this.m.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().j();
            }
        }
    }
    
    public final void D(final boolean b) {
        this.E0();
        final int e = this.A.e(this.g(), b);
        int n = 1;
        if (b) {
            n = n;
            if (e != 1) {
                n = 2;
            }
        }
        this.B0(e, n, b);
    }
    
    public final void D0() {
        final int g = this.g();
        if (g != 1) {
            if (g == 2 || g == 3) {
                this.E0();
                final boolean p = this.k0.p;
                final i0 c = this.C;
                this.o();
                c.getClass();
                final j0 d = this.D;
                this.o();
                d.getClass();
                return;
            }
            if (g != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.getClass();
        this.D.getClass();
    }
    
    public final List<mc.a> E() {
        this.E0();
        return this.e0;
    }
    
    public final void E0() {
        this.d.c();
        if (Thread.currentThread() != this.s.getThread()) {
            final String n = ad.c0.n("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.s.getThread().getName());
            if (this.f0) {
                throw new IllegalStateException(n);
            }
            Throwable t;
            if (this.g0) {
                t = null;
            }
            else {
                t = new IllegalStateException();
            }
            lg.e0.w0("ExoPlayerImpl", n, t);
            this.g0 = true;
        }
    }
    
    public final int G() {
        this.E0();
        return this.k0.m;
    }
    
    public final com.google.android.exoplayer2.f0 H() {
        this.E0();
        return this.k0.i.d;
    }
    
    public final e0 I() {
        this.E0();
        return this.k0.a;
    }
    
    public final Looper J() {
        return this.s;
    }
    
    public final void L(final TextureView w) {
        this.E0();
        if (w == null) {
            this.e0();
        }
        else {
            this.r0();
            this.W = w;
            if (w.getSurfaceTextureListener() != null) {
                Log.w("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
            }
            w.setSurfaceTextureListener((TextureView$SurfaceTextureListener)this.x);
            SurfaceTexture surfaceTexture;
            if (w.isAvailable()) {
                surfaceTexture = w.getSurfaceTexture();
            }
            else {
                surfaceTexture = null;
            }
            if (surfaceTexture == null) {
                this.x0(null);
                this.o0(0, 0);
            }
            else {
                final Surface s = new Surface(surfaceTexture);
                this.x0(s);
                this.S = s;
                this.o0(((View)w).getWidth(), ((View)w).getHeight());
            }
        }
    }
    
    public final int M(final int n) {
        this.E0();
        return this.g[n].s();
    }
    
    public final void N(final int n, long j) {
        this.E0();
        this.r.D();
        final e0 a = this.k0.a;
        if (n < 0 || (!a.p() && n >= a.o())) {
            throw new IllegalSeekPositionException(a, n, j);
        }
        final int h = this.H;
        int n2 = 1;
        this.H = h + 1;
        if (this.b()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            final m.d d = new m.d(this.k0);
            d.a(1);
            final k k = (k)this.j.g;
            k.i.i(new h5.f(1, k, d));
            return;
        }
        if (this.g() != 1) {
            n2 = 2;
        }
        final int s = this.S();
        final va.c0 m0 = this.m0(this.k0.g(n2), a, this.n0(a, n, j));
        final m i = this.k;
        j = ad.c0.J(j);
        i.m.d(3, new m.g(a, n, j)).a();
        this.C0(m0, 0, 1, true, true, 1, this.h0(m0), s);
    }
    
    public final w.a O() {
        this.E0();
        return this.N;
    }
    
    public final long Q() {
        this.E0();
        if (this.b()) {
            final va.c0 k0 = this.k0;
            k0.a.g(((ac.j)k0.b).a, this.n);
            final va.c0 k2 = this.k0;
            long u;
            if (k2.c == -9223372036854775807L) {
                u = ad.c0.U(k2.a.m(this.S(), super.a).r);
            }
            else {
                u = ad.c0.U(this.n.j) + ad.c0.U(this.k0.c);
            }
            return u;
        }
        return this.getCurrentPosition();
    }
    
    public final void R(final w.c c) {
        c.getClass();
        this.l.a(c);
    }
    
    public final int S() {
        this.E0();
        int j0;
        if ((j0 = this.j0()) == -1) {
            j0 = 0;
        }
        return j0;
    }
    
    public final void T(final SurfaceView surfaceView) {
        this.E0();
        SurfaceHolder holder;
        if (surfaceView == null) {
            holder = null;
        }
        else {
            holder = surfaceView.getHolder();
        }
        this.E0();
        if (holder != null && holder == this.T) {
            this.e0();
        }
    }
    
    public final boolean V() {
        this.E0();
        return this.G;
    }
    
    public final r X() {
        this.E0();
        return this.O;
    }
    
    public final long Y() {
        this.E0();
        return this.u;
    }
    
    public final boolean b() {
        this.E0();
        return ((ac.j)this.k0.b).a();
    }
    
    public final v c() {
        this.E0();
        return this.k0.n;
    }
    
    public final void d(final wa.b b) {
        this.r.y(b);
    }
    
    public final r d0() {
        final e0 i = this.I();
        if (i.p()) {
            return this.j0;
        }
        final com.google.android.exoplayer2.q h = i.m(this.S(), super.a).h;
        final r j0 = this.j0;
        j0.getClass();
        final r.a a = new r.a(j0);
        final r k = h.i;
        if (k != null) {
            final CharSequence f = k.f;
            if (f != null) {
                a.a = f;
            }
            final CharSequence g = k.g;
            if (g != null) {
                a.b = g;
            }
            final CharSequence h2 = k.h;
            if (h2 != null) {
                a.c = h2;
            }
            final CharSequence l = k.i;
            if (l != null) {
                a.d = l;
            }
            final CharSequence m = k.j;
            if (m != null) {
                a.e = m;
            }
            final CharSequence k2 = k.k;
            if (k2 != null) {
                a.f = k2;
            }
            final CharSequence l2 = k.l;
            if (l2 != null) {
                a.g = l2;
            }
            final Uri m2 = k.m;
            if (m2 != null) {
                a.h = m2;
            }
            final y n = k.n;
            if (n != null) {
                a.i = n;
            }
            final y o = k.o;
            if (o != null) {
                a.j = o;
            }
            final byte[] p = k.p;
            if (p != null) {
                final Integer q = k.q;
                a.k = p.clone();
                a.l = q;
            }
            final Uri r = k.r;
            if (r != null) {
                a.m = r;
            }
            final Integer s = k.s;
            if (s != null) {
                a.n = s;
            }
            final Integer t = k.t;
            if (t != null) {
                a.o = t;
            }
            final Integer u = k.u;
            if (u != null) {
                a.p = u;
            }
            final Boolean v = k.v;
            if (v != null) {
                a.q = v;
            }
            final Integer w = k.w;
            if (w != null) {
                a.r = w;
            }
            final Integer x = k.x;
            if (x != null) {
                a.r = x;
            }
            final Integer y = k.y;
            if (y != null) {
                a.s = y;
            }
            final Integer z = k.z;
            if (z != null) {
                a.t = z;
            }
            final Integer a2 = k.A;
            if (a2 != null) {
                a.u = a2;
            }
            final Integer b = k.B;
            if (b != null) {
                a.v = b;
            }
            final Integer c = k.C;
            if (c != null) {
                a.w = c;
            }
            final CharSequence d = k.D;
            if (d != null) {
                a.x = d;
            }
            final CharSequence e = k.E;
            if (e != null) {
                a.y = e;
            }
            final CharSequence f2 = k.F;
            if (f2 != null) {
                a.z = f2;
            }
            final Integer g2 = k.G;
            if (g2 != null) {
                a.A = g2;
            }
            final Integer h3 = k.H;
            if (h3 != null) {
                a.B = h3;
            }
            final CharSequence i2 = k.I;
            if (i2 != null) {
                a.C = i2;
            }
            final CharSequence j2 = k.J;
            if (j2 != null) {
                a.D = j2;
            }
            final CharSequence k3 = k.K;
            if (k3 != null) {
                a.E = k3;
            }
            final Bundle l3 = k.L;
            if (l3 != null) {
                a.F = l3;
            }
        }
        return new r(a);
    }
    
    public final long e() {
        this.E0();
        return ad.c0.U(this.k0.r);
    }
    
    public final void e0() {
        this.E0();
        this.r0();
        this.x0(null);
        this.o0(0, 0);
    }
    
    public final void f(final com.google.android.exoplayer2.source.i i) {
        this.E0();
        final List<com.google.android.exoplayer2.source.i> singletonList = Collections.singletonList(i);
        this.E0();
        this.u0(singletonList, true);
    }
    
    public final int g() {
        this.E0();
        return this.k0.e;
    }
    
    public final com.google.android.exoplayer2.x g0(final com.google.android.exoplayer2.x.b b) {
        final int j0 = this.j0();
        final m k = this.k;
        final e0 a = this.k0.a;
        int n = j0;
        if (j0 == -1) {
            n = 0;
        }
        return new com.google.android.exoplayer2.x(k, b, a, n, this.w, k.o);
    }
    
    public final long getBufferedPosition() {
        this.E0();
        if (this.b()) {
            final va.c0 k0 = this.k0;
            long n;
            if (((ac.j)k0.k).equals(k0.b)) {
                n = ad.c0.U(this.k0.q);
            }
            else {
                n = this.getDuration();
            }
            return n;
        }
        return this.x();
    }
    
    public final long getCurrentPosition() {
        this.E0();
        return ad.c0.U(this.h0(this.k0));
    }
    
    public final long getDuration() {
        this.E0();
        if (this.b()) {
            final va.c0 k0 = this.k0;
            final i$b b = k0.b;
            k0.a.g(((ac.j)b).a, this.n);
            return ad.c0.U(this.n.a(((ac.j)b).b, ((ac.j)b).c));
        }
        final e0 i = this.I();
        long u;
        if (i.p()) {
            u = -9223372036854775807L;
        }
        else {
            u = ad.c0.U(i.m(this.S(), super.a).s);
        }
        return u;
    }
    
    public final bd.q getVideoSize() {
        this.E0();
        return this.i0;
    }
    
    public final float getVolume() {
        this.E0();
        return this.c0;
    }
    
    public final void h(final w.c c) {
        c.getClass();
        final ad.m<w.c> l = this.l;
        for (final ad.m.c c2 : l.d) {
            if (c2.a.equals(c)) {
                final ad.m.b<w.c> c3 = l.c;
                c2.d = true;
                if (c2.c) {
                    c3.e((w.c)c2.a, c2.b.b());
                }
                l.d.remove(c2);
            }
        }
    }
    
    public final long h0(final va.c0 c0) {
        if (c0.a.p()) {
            return ad.c0.J(this.m0);
        }
        if (((ac.j)c0.b).a()) {
            return c0.s;
        }
        final e0 a = c0.a;
        final i$b b = c0.b;
        final long s = c0.s;
        a.g(((ac.j)b).a, this.n);
        return s + this.n.j;
    }
    
    public final void i(final SurfaceView surfaceView) {
        this.E0();
        if (surfaceView instanceof bd.i) {
            this.r0();
            this.x0(surfaceView);
            this.v0(surfaceView.getHolder());
        }
        else if (surfaceView instanceof cd.j) {
            this.r0();
            this.U = (cd.j)surfaceView;
            final com.google.android.exoplayer2.x g0 = this.g0((com.google.android.exoplayer2.x.b)this.y);
            ad.d0.f(g0.g ^ true);
            g0.d = 10000;
            final cd.j u = this.U;
            ad.d0.f(true ^ g0.g);
            g0.e = u;
            g0.c();
            this.U.f.add(this.x);
            this.x0(this.U.getVideoSurface());
            this.v0(surfaceView.getHolder());
        }
        else {
            SurfaceHolder holder;
            if (surfaceView == null) {
                holder = null;
            }
            else {
                holder = surfaceView.getHolder();
            }
            this.E0();
            if (holder == null) {
                this.e0();
            }
            else {
                this.r0();
                this.V = true;
                (this.T = holder).addCallback((SurfaceHolder$Callback)this.x);
                final Surface surface = holder.getSurface();
                if (surface != null && surface.isValid()) {
                    this.x0(surface);
                    final Rect surfaceFrame = holder.getSurfaceFrame();
                    this.o0(surfaceFrame.width(), surfaceFrame.height());
                }
                else {
                    this.x0(null);
                    this.o0(0, 0);
                }
            }
        }
    }
    
    public final wc.j i0() {
        this.E0();
        return new wc.j((wc.i[])this.k0.i.c);
    }
    
    public final ExoPlaybackException j() {
        this.E0();
        return this.k0.f;
    }
    
    public final int j0() {
        if (this.k0.a.p()) {
            return this.l0;
        }
        final va.c0 k0 = this.k0;
        return k0.a.g(((ac.j)k0.b).a, this.n).h;
    }
    
    public final int l() {
        this.E0();
        int b;
        if (this.b()) {
            b = ((ac.j)this.k0.b).b;
        }
        else {
            b = -1;
        }
        return b;
    }
    
    public final int m() {
        this.E0();
        return this.F;
    }
    
    public final va.c0 m0(va.c0 c0, final e0 e0, final Pair<Object, Long> pair) {
        ad.d0.c(e0.p() || pair != null);
        final e0 a = c0.a;
        final va.c0 h = c0.h(e0);
        if (e0.p()) {
            final i$b t = va.c0.t;
            final long j = ad.c0.J(this.m0);
            c0 = h.b(t, j, j, j, 0L, ac.u.i, this.b, (List)ImmutableList.of()).a(t);
            c0.q = c0.s;
            return c0;
        }
        final Object a2 = ((ac.j)h.b).a;
        final int a3 = ad.c0.a;
        final boolean b = a2.equals(pair.first) ^ true;
        i$b b2;
        if (b) {
            b2 = new i$b(pair.first);
        }
        else {
            b2 = h.b;
        }
        final long longValue = (long)pair.second;
        long i;
        final long n = i = ad.c0.J(this.Q());
        if (!a.p()) {
            i = n - a.g(a2, this.n).j;
        }
        if (!b) {
            final long n2 = lcmp(longValue, i);
            if (n2 >= 0) {
                if (n2 == 0) {
                    final int b3 = e0.b(((ac.j)h.k).a);
                    if (b3 != -1) {
                        c0 = h;
                        if (e0.f(b3, this.n, false).h == e0.g(((ac.j)b2).a, this.n).h) {
                            return c0;
                        }
                    }
                    e0.g(((ac.j)b2).a, this.n);
                    long q;
                    if (((ac.j)b2).a()) {
                        q = this.n.a(((ac.j)b2).b, ((ac.j)b2).c);
                    }
                    else {
                        q = this.n.i;
                    }
                    c0 = h.b(b2, h.s, h.s, h.d, q - h.s, h.h, h.i, h.j).a(b2);
                    c0.q = q;
                }
                else {
                    ad.d0.f(((ac.j)b2).a() ^ true);
                    final long max = Math.max(0L, h.r - (longValue - i));
                    long q2 = h.q;
                    if (((ac.j)h.k).equals(h.b)) {
                        q2 = longValue + max;
                    }
                    c0 = h.b(b2, longValue, longValue, longValue, max, h.h, h.i, h.j);
                    c0.q = q2;
                }
                return c0;
            }
        }
        ad.d0.f(((ac.j)b2).a() ^ true);
        u u;
        if (b) {
            u = ac.u.i;
        }
        else {
            u = h.h;
        }
        o o;
        if (b) {
            o = this.b;
        }
        else {
            o = h.i;
        }
        Object o2;
        if (b) {
            o2 = ImmutableList.of();
        }
        else {
            o2 = h.j;
        }
        c0 = h.b(b2, longValue, longValue, longValue, 0L, u, o, (List)o2).a(b2);
        c0.q = longValue;
        return c0;
    }
    
    public final Pair<Object, Long> n0(final e0 e0, final int l0, long u) {
        if (e0.p()) {
            this.l0 = l0;
            long m0 = u;
            if (u == -9223372036854775807L) {
                m0 = 0L;
            }
            this.m0 = m0;
            return null;
        }
        int a;
        if (l0 == -1 || (a = l0) >= e0.o()) {
            a = e0.a(this.G);
            u = ad.c0.U(e0.m(a, super.a).r);
        }
        return (Pair<Object, Long>)e0.i(super.a, this.n, a, ad.c0.J(u));
    }
    
    public final boolean o() {
        this.E0();
        return this.k0.l;
    }
    
    public final void o0(final int y, final int z) {
        if (y != this.Y || z != this.Z) {
            this.Y = y;
            this.Z = z;
            this.l.e(24, new va.n(y, z));
        }
    }
    
    public final void p(final int f) {
        this.E0();
        if (this.F != f) {
            this.F = f;
            this.k.m.e(11, f, 0).a();
            this.l.c(8, (ad.m.a<w.c>)new hf0.b(f));
            this.A0();
            this.l.b();
        }
    }
    
    @Deprecated
    public final void p0(final com.google.android.exoplayer2.source.a a, final boolean b) {
        this.E0();
        this.E0();
        this.u0((List<com.google.android.exoplayer2.source.i>)Collections.singletonList(a), b);
        this.prepare();
    }
    
    public final void prepare() {
        this.E0();
        final boolean o = this.o();
        final c a = this.A;
        final int n = 2;
        final int e = a.e(2, o);
        int n2;
        if (o && e != 1) {
            n2 = 2;
        }
        else {
            n2 = 1;
        }
        this.B0(e, n2, o);
        final va.c0 k0 = this.k0;
        if (k0.e != 1) {
            return;
        }
        final va.c0 e2 = k0.e((ExoPlaybackException)null);
        int n3 = n;
        if (e2.a.p()) {
            n3 = 4;
        }
        final va.c0 g = e2.g(n3);
        ++this.H;
        this.k.m.b(0).a();
        this.C0(g, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final void q(final boolean g) {
        this.E0();
        if (this.G != g) {
            this.G = g;
            this.k.m.e(12, g ? 1 : 0, 0).a();
            this.l.c(9, new t(g));
            this.A0();
            this.l.b();
        }
    }
    
    public final va.c0 q0(final int n) {
        ad.d0.c(n >= 0 && n <= this.o.size());
        final int s = this.S();
        final e0 i = this.I();
        final int size = this.o.size();
        ++this.H;
        for (int j = n - 1; j >= 0; --j) {
            this.o.remove(j);
        }
        this.M = this.M.f(n);
        final va.d0 d0 = new va.d0(this.o, this.M);
        final va.c0 k0 = this.k0;
        long q = this.Q();
        final boolean p = i.p();
        int j2 = -1;
        Pair pair;
        if (!p && !d0.p()) {
            pair = i.i(super.a, this.n, this.S(), ad.c0.J(q));
            final Object first = pair.first;
            if (d0.b(first) == -1) {
                final Object g = com.google.android.exoplayer2.m.G(super.a, this.n, this.F, this.G, first, i, d0);
                if (g != null) {
                    d0.g(g, this.n);
                    final int h = this.n.h;
                    pair = this.n0(d0, h, ad.c0.U(d0.m(h, super.a).r));
                }
                else {
                    pair = this.n0(d0, -1, -9223372036854775807L);
                }
            }
        }
        else {
            final boolean b = !i.p() && d0.p();
            if (!b) {
                j2 = this.j0();
            }
            if (b) {
                q = -9223372036854775807L;
            }
            pair = this.n0(d0, j2, q);
        }
        final va.c0 m0 = this.m0(k0, d0, (Pair<Object, Long>)pair);
        final int e = m0.e;
        boolean b2 = true;
        if (e == 1 || e == 4 || n <= 0 || n != size || s < m0.a.o()) {
            b2 = false;
        }
        va.c0 g2 = m0;
        if (b2) {
            g2 = m0.g(4);
        }
        this.k.m.f(this.M, n).a();
        return g2;
    }
    
    public final void r() {
        this.E0();
    }
    
    public final void r0() {
        if (this.U != null) {
            final com.google.android.exoplayer2.x g0 = this.g0((com.google.android.exoplayer2.x.b)this.y);
            ad.d0.f(g0.g ^ true);
            g0.d = 10000;
            ad.d0.f(g0.g ^ true);
            g0.e = null;
            g0.c();
            this.U.f.remove(this.x);
            this.U = null;
        }
        final TextureView w = this.W;
        if (w != null) {
            if (w.getSurfaceTextureListener() != this.x) {
                Log.w("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            }
            else {
                this.W.setSurfaceTextureListener((TextureView$SurfaceTextureListener)null);
            }
            this.W = null;
        }
        final SurfaceHolder t = this.T;
        if (t != null) {
            t.removeCallback((SurfaceHolder$Callback)this.x);
            this.T = null;
        }
    }
    
    public final void release() {
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final String e = ad.c0.e;
        final HashSet a = va.w.a;
        synchronized (va.w.class) {
            final String b = va.w.b;
            monitorexit(va.w.class);
            final StringBuilder k = aw.b.k(a81.e.h(b, a81.e.h(e, a81.e.h(hexString, 36))), "Release ", hexString, " [", "ExoPlayerLib/2.17.1");
            d.A(k, "] [", e, "] [", b);
            k.append("]");
            Log.i("ExoPlayerImpl", k.toString());
            this.E0();
            if (ad.c0.a < 21) {
                final AudioTrack q = this.Q;
                if (q != null) {
                    q.release();
                    this.Q = null;
                }
            }
            this.z.a();
            final c0 b2 = this.B;
            final c0.b e2 = b2.e;
            if (e2 != null) {
                try {
                    b2.a.unregisterReceiver((BroadcastReceiver)e2);
                }
                catch (final RuntimeException ex) {
                    lg.e0.w0("StreamVolumeManager", "Error unregistering stream volume receiver", (Throwable)ex);
                }
                b2.e = null;
            }
            this.C.getClass();
            this.D.getClass();
            final c a2 = this.A;
            a2.c = null;
            a2.a();
            Object o = this.k;
            synchronized (o) {
                boolean e3;
                if (!((m)o).E && ((Thread)((m)o).n).isAlive()) {
                    ((m)o).m.k(7);
                    ((m)o).f0(new va.h(o, 1), ((m)o).A);
                    e3 = ((m)o).E;
                    monitorexit(o);
                }
                else {
                    monitorexit(o);
                    e3 = true;
                }
                if (!e3) {
                    this.l.e(10, (ad.m.a<w.c>)new ha.c(2));
                }
                this.l.d();
                this.i.c();
                this.t.h(this.r);
                o = this.k0.g(1);
                this.k0 = (va.c0)o;
                o = ((va.c0)o).a(((va.c0)o).b);
                this.k0 = (va.c0)o;
                ((va.c0)o).q = ((va.c0)o).s;
                this.k0.r = 0L;
                this.r.release();
                this.r0();
                o = this.S;
                if (o != null) {
                    ((Surface)o).release();
                    this.S = null;
                }
                this.e0 = (List<mc.a>)ImmutableList.of();
            }
        }
    }
    
    public final int s() {
        this.E0();
        if (this.k0.a.p()) {
            return 0;
        }
        final va.c0 k0 = this.k0;
        return k0.a.b(((ac.j)k0.b).a);
    }
    
    public final void s0(final int n, final int d, final Object e) {
        for (final z z : this.g) {
            if (z.s() == n) {
                final com.google.android.exoplayer2.x g2 = this.g0(z);
                ad.d0.f(g2.g ^ true);
                g2.d = d;
                ad.d0.f(g2.g ^ true);
                g2.e = e;
                g2.c();
            }
        }
    }
    
    public final void setVolume(float h) {
        this.E0();
        h = ad.c0.h(h, 0.0f, 1.0f);
        if (this.c0 == h) {
            return;
        }
        this.c0 = h;
        this.s0(1, 2, this.A.g * h);
        this.l.e(22, new va.s(h));
    }
    
    public final void stop() {
        this.E0();
        this.E0();
        this.A.e(1, this.o());
        this.z0(null);
        this.e0 = (List<mc.a>)ImmutableList.of();
    }
    
    public final void t(final TextureView textureView) {
        this.E0();
        if (textureView != null && textureView == this.W) {
            this.e0();
        }
    }
    
    public final void t0(final List list) {
        this.E0();
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            list2.add(this.q.c((com.google.android.exoplayer2.q)list.get(i)));
        }
        this.u0(list2, true);
    }
    
    public final int u() {
        this.E0();
        int c;
        if (this.b()) {
            c = ((ac.j)this.k0.b).c;
        }
        else {
            c = -1;
        }
        return c;
    }
    
    public final void u0(final List<com.google.android.exoplayer2.source.i> list, final boolean b) {
        this.E0();
        int n = this.j0();
        long currentPosition = this.getCurrentPosition();
        ++this.H;
        if (!this.o.isEmpty()) {
            final int size = this.o.size();
            for (int i = size - 1; i >= 0; --i) {
                this.o.remove(i);
            }
            this.M = this.M.f(size);
        }
        final ArrayList<t$c> list2 = new ArrayList<t$c>();
        for (int j = 0; j < list.size(); ++j) {
            final t$c t$c = new t$c((com.google.android.exoplayer2.source.i)list.get(j), this.p);
            list2.add(t$c);
            this.o.add(j + 0, new k.k$d(t$c.a.t, t$c.b));
        }
        this.M = this.M.g(list2.size());
        final va.d0 d0 = new va.d0(this.o, this.M);
        if (!d0.p() && -1 >= d0.k) {
            throw new IllegalSeekPositionException(d0, -1, -9223372036854775807L);
        }
        if (b) {
            n = d0.a(this.G);
            currentPosition = -9223372036854775807L;
        }
        final va.c0 m0 = this.m0(this.k0, d0, this.n0(d0, n, currentPosition));
        int e = m0.e;
        if (n != -1 && (e = e) != 1) {
            if (!d0.p() && n < d0.k) {
                e = 2;
            }
            else {
                e = 4;
            }
        }
        final va.c0 g = m0.g(e);
        this.k.m.d(17, new m.a(list2, this.M, n, ad.c0.J(currentPosition))).a();
        this.C0(g, 0, 1, false, !((ac.j)this.k0.b).a.equals(((ac.j)g.b).a) && !this.k0.a.p(), 4, this.h0(g), -1);
    }
    
    public final long v() {
        this.E0();
        return this.v;
    }
    
    public final void v0(final SurfaceHolder t) {
        this.V = false;
        (this.T = t).addCallback((SurfaceHolder$Callback)this.x);
        final Surface surface = this.T.getSurface();
        if (surface != null && surface.isValid()) {
            final Rect surfaceFrame = this.T.getSurfaceFrame();
            this.o0(surfaceFrame.width(), surfaceFrame.height());
        }
        else {
            this.o0(0, 0);
        }
    }
    
    public final void w0(final v v) {
        this.E0();
        if (this.k0.n.equals(v)) {
            return;
        }
        final va.c0 f = this.k0.f(v);
        ++this.H;
        this.k.m.d(4, v).a();
        this.C0(f, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final long x() {
        this.E0();
        if (this.k0.a.p()) {
            return this.m0;
        }
        final va.c0 k0 = this.k0;
        if (((ac.j)k0.k).d != ((ac.j)k0.b).d) {
            return ad.c0.U(k0.a.m(this.S(), super.a).s);
        }
        long n = k0.q;
        if (((ac.j)this.k0.k).a()) {
            final va.c0 k2 = this.k0;
            final e0$b g = k2.a.g(((ac.j)k2.k).a, this.n);
            n = g.d(((ac.j)this.k0.k).b);
            if (n == Long.MIN_VALUE) {
                n = g.i;
            }
        }
        final va.c0 k3 = this.k0;
        k3.a.g(((ac.j)k3.k).a, this.n);
        return ad.c0.U(n + this.n.j);
    }
    
    public final void x0(final Object o) {
        final ArrayList list = new ArrayList();
        final z[] g = this.g;
        final int length = g.length;
        final boolean b = false;
        final int n = 0;
        for (final z z : g) {
            if (z.s() == 2) {
                final com.google.android.exoplayer2.x g2 = this.g0(z);
                ad.d0.f(g2.g ^ true);
                g2.d = 1;
                ad.d0.f(true ^ g2.g);
                g2.e = o;
                g2.c();
                list.add(g2);
            }
        }
        final Object r = this.R;
        int n2 = b ? 1 : 0;
        if (r != null) {
            n2 = (b ? 1 : 0);
            if (r != o) {
                int n3;
                try {
                    final Iterator iterator = list.iterator();
                    while (true) {
                        n3 = n;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        ((com.google.android.exoplayer2.x)iterator.next()).a(this.E);
                    }
                }
                catch (final TimeoutException ex) {
                    n3 = 1;
                }
                catch (final InterruptedException ex2) {
                    Thread.currentThread().interrupt();
                    n3 = n;
                }
                final Object r2 = this.R;
                final Surface s = this.S;
                n2 = n3;
                if (r2 == s) {
                    s.release();
                    this.S = null;
                    n2 = n3;
                }
            }
        }
        this.R = o;
        if (n2 != 0) {
            this.z0(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }
    
    public final void y0() {
        this.E0();
        this.r0();
        this.x0(null);
        this.o0(0, 0);
    }
    
    public final void z0(final ExoPlaybackException ex) {
        final va.c0 k0 = this.k0;
        final va.c0 a = k0.a(k0.b);
        a.q = a.s;
        a.r = 0L;
        boolean b = true;
        va.c0 c2;
        final va.c0 c0 = c2 = a.g(1);
        if (ex != null) {
            c2 = c0.e(ex);
        }
        ++this.H;
        this.k.m.b(6).a();
        if (!c2.a.p() || this.k0.a.p()) {
            b = false;
        }
        this.C0(c2, 0, 1, false, b, 4, this.h0(c2), -1);
    }
    
    public static final class a
    {
        public static wa.c0 a() {
            return new wa.c0(new wa.c0.a(LogSessionId.LOG_SESSION_ID_NONE));
        }
    }
}
