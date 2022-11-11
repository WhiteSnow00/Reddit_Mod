// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import ad.d0;
import android.content.Context;
import bd.q;
import com.google.android.exoplayer2.source.i;
import va.c0;
import wa.b;
import android.view.SurfaceView;
import android.view.TextureView;
import android.os.Looper;
import mc.a;
import java.util.List;
import ad.e;

@Deprecated
public final class a0 extends d implements j
{
    public final k b;
    public final e c;
    
    public a0(final j.b b) {
        final e c = new e();
        this.c = c;
        try {
            this.b = new k(b, (w)this);
            c.e();
        }
        finally {
            this.c.e();
        }
    }
    
    public final void D(final boolean b) {
        this.d0();
        this.b.D(b);
    }
    
    public final List<mc.a> E() {
        this.d0();
        final k b = this.b;
        b.E0();
        return b.e0;
    }
    
    public final int G() {
        this.d0();
        return this.b.G();
    }
    
    public final f0 H() {
        this.d0();
        return this.b.H();
    }
    
    public final e0 I() {
        this.d0();
        return this.b.I();
    }
    
    public final Looper J() {
        this.d0();
        return this.b.s;
    }
    
    public final void L(final TextureView textureView) {
        this.d0();
        this.b.L(textureView);
    }
    
    public final int M(final int n) {
        this.d0();
        return this.b.M(n);
    }
    
    public final void N(final int n, final long n2) {
        this.d0();
        this.b.N(n, n2);
    }
    
    public final w.a O() {
        this.d0();
        final k b = this.b;
        b.E0();
        return b.N;
    }
    
    public final long Q() {
        this.d0();
        return this.b.Q();
    }
    
    public final void R(final w.c c) {
        this.d0();
        final k b = this.b;
        b.getClass();
        c.getClass();
        b.l.a(c);
    }
    
    public final int S() {
        this.d0();
        return this.b.S();
    }
    
    public final void T(final SurfaceView surfaceView) {
        this.d0();
        this.b.T(surfaceView);
    }
    
    public final boolean V() {
        this.d0();
        final k b = this.b;
        b.E0();
        return b.G;
    }
    
    public final r X() {
        this.d0();
        final k b = this.b;
        b.E0();
        return b.O;
    }
    
    public final long Y() {
        this.d0();
        final k b = this.b;
        b.E0();
        return b.u;
    }
    
    public final boolean b() {
        this.d0();
        return this.b.b();
    }
    
    public final v c() {
        this.d0();
        return this.b.c();
    }
    
    public final void d(final b b) {
        this.d0();
        final k b2 = this.b;
        b2.getClass();
        b2.r.y(b);
    }
    
    public final void d0() {
        this.c.c();
    }
    
    public final long e() {
        this.d0();
        return this.b.e();
    }
    
    public final void e0() {
        this.d0();
        final k b = this.b;
        b.E0();
        final c0 q0 = b.q0(Math.min(Integer.MAX_VALUE, b.o.size()));
        b.C0(q0, 0, 1, false, ((ac.j)q0.b).a.equals(((ac.j)b.k0.b).a) ^ true, 4, b.h0(q0), -1);
    }
    
    public final void f(final i i) {
        this.d0();
        this.b.f(i);
    }
    
    public final void f0(final List list) {
        this.d0();
        this.b.t0(list);
    }
    
    public final int g() {
        this.d0();
        return this.b.g();
    }
    
    public final long getBufferedPosition() {
        this.d0();
        return this.b.getBufferedPosition();
    }
    
    public final long getCurrentPosition() {
        this.d0();
        return this.b.getCurrentPosition();
    }
    
    public final long getDuration() {
        this.d0();
        return this.b.getDuration();
    }
    
    public final q getVideoSize() {
        this.d0();
        final k b = this.b;
        b.E0();
        return b.i0;
    }
    
    public final float getVolume() {
        this.d0();
        final k b = this.b;
        b.E0();
        return b.c0;
    }
    
    public final void h(final w.c c) {
        this.d0();
        this.b.h(c);
    }
    
    public final void i(final SurfaceView surfaceView) {
        this.d0();
        this.b.i(surfaceView);
    }
    
    public final ExoPlaybackException j() {
        this.d0();
        return this.b.j();
    }
    
    public final int l() {
        this.d0();
        return this.b.l();
    }
    
    public final int m() {
        this.d0();
        final k b = this.b;
        b.E0();
        return b.F;
    }
    
    public final boolean o() {
        this.d0();
        return this.b.o();
    }
    
    public final void p(final int n) {
        this.d0();
        this.b.p(n);
    }
    
    public final void prepare() {
        this.d0();
        this.b.prepare();
    }
    
    public final void q(final boolean b) {
        this.d0();
        this.b.q(b);
    }
    
    public final void r() {
        this.d0();
        this.b.E0();
    }
    
    public final void release() {
        this.d0();
        this.b.release();
    }
    
    public final int s() {
        this.d0();
        return this.b.s();
    }
    
    public final void setVolume(final float volume) {
        this.d0();
        this.b.setVolume(volume);
    }
    
    public final void stop() {
        this.d0();
        this.b.stop();
    }
    
    public final void t(final TextureView textureView) {
        this.d0();
        this.b.t(textureView);
    }
    
    public final int u() {
        this.d0();
        return this.b.u();
    }
    
    public final long v() {
        this.d0();
        final k b = this.b;
        b.E0();
        return b.v;
    }
    
    public final long x() {
        this.d0();
        return this.b.x();
    }
    
    @Deprecated
    public static final class a
    {
        public final j.b a;
        
        @Deprecated
        public a(final Context context) {
            this.a = new j.b(context);
        }
        
        @Deprecated
        public final a0 a() {
            final j.b a = this.a;
            d0.f(a.s ^ true);
            a.s = true;
            return new a0(a);
        }
    }
}
