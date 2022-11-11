// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import za.a;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.io.IOException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import ac.p;
import wa.c0;
import va.f0;
import com.android.billingclient.api.d0;
import va.e0;

public abstract class e implements z, e0
{
    public final int f;
    public final d0 g;
    public f0 h;
    public int i;
    public c0 j;
    public int k;
    public p l;
    public n[] m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;
    
    public e(final int f) {
        this.f = f;
        this.g = new d0(1);
        this.o = Long.MIN_VALUE;
    }
    
    public void A(final boolean b, final boolean b2) throws ExoPlaybackException {
    }
    
    public abstract void B(final long p0, final boolean p1) throws ExoPlaybackException;
    
    public void C() {
    }
    
    public void D() throws ExoPlaybackException {
    }
    
    public void E() {
    }
    
    public abstract void F(final n[] p0, final long p1, final long p2) throws ExoPlaybackException;
    
    public final int G(final d0 d0, final DecoderInputBuffer decoderInputBuffer, int n) {
        final p l = this.l;
        l.getClass();
        final int i = l.i(d0, decoderInputBuffer, n);
        n = -4;
        if (i == -4) {
            if (((za.a)decoderInputBuffer).o(4)) {
                this.o = Long.MIN_VALUE;
                if (!this.p) {
                    n = -3;
                }
                return n;
            }
            final long j = decoderInputBuffer.j + this.n;
            decoderInputBuffer.j = j;
            this.o = Math.max(this.o, j);
        }
        else if (i == -5) {
            final n n2 = (n)d0.g;
            n2.getClass();
            if (n2.u != Long.MAX_VALUE) {
                final n.a a = n2.a();
                a.o = n2.u + this.n;
                d0.g = a.a();
            }
        }
        return i;
    }
    
    @Override
    public final void d() {
        final int k = this.k;
        boolean b = true;
        if (k != 1) {
            b = false;
        }
        ad.d0.f(b);
        final d0 g = this.g;
        g.f = null;
        g.g = null;
        this.k = 0;
        this.l = null;
        this.m = null;
        this.p = false;
        this.z();
    }
    
    @Override
    public final boolean f() {
        return this.o == Long.MIN_VALUE;
    }
    
    @Override
    public final void g(final n[] m, final p l, final long o, final long n) throws ExoPlaybackException {
        ad.d0.f(this.p ^ true);
        this.l = l;
        if (this.o == Long.MIN_VALUE) {
            this.o = o;
        }
        this.F(this.m = m, o, this.n = n);
    }
    
    @Override
    public final int getState() {
        return this.k;
    }
    
    @Override
    public final p getStream() {
        return this.l;
    }
    
    public void h(final int n, final Object o) throws ExoPlaybackException {
    }
    
    @Override
    public final boolean i() {
        return this.p;
    }
    
    @Override
    public final void j(final f0 h, final n[] array, final p p8, final long o, final boolean b, final boolean b2, final long n, final long n2) throws ExoPlaybackException {
        ad.d0.f(this.k == 0);
        this.h = h;
        this.k = 1;
        this.A(b, b2);
        this.g(array, p8, n, n2);
        this.p = false;
        this.B(this.o = o, b);
    }
    
    @Override
    public final long m() {
        return this.o;
    }
    
    @Override
    public final void n(final long o) throws ExoPlaybackException {
        this.p = false;
        this.B(this.o = o, false);
    }
    
    @Override
    public ad.n o() {
        return null;
    }
    
    @Override
    public final void p() {
        this.p = true;
    }
    
    @Override
    public final void q(final int i, final c0 j) {
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void r() throws IOException {
        final p l = this.l;
        l.getClass();
        l.b();
    }
    
    @Override
    public final void reset() {
        ad.d0.f(this.k == 0);
        final d0 g = this.g;
        g.f = null;
        g.g = null;
        this.C();
    }
    
    @Override
    public final int s() {
        return this.f;
    }
    
    @Override
    public final void start() throws ExoPlaybackException {
        final int k = this.k;
        boolean b = true;
        if (k != 1) {
            b = false;
        }
        ad.d0.f(b);
        this.k = 2;
        this.D();
    }
    
    @Override
    public final void stop() {
        ad.d0.f(this.k == 2);
        this.k = 1;
        this.E();
    }
    
    @Override
    public final e t() {
        return this;
    }
    
    public int w() throws ExoPlaybackException {
        return 0;
    }
    
    public final ExoPlaybackException x(final n n, final Exception ex, final boolean b, final int n2) {
        if (n != null && !this.q) {
            this.q = true;
            try {
                int a = ((e0)this).a(n);
                a &= 0x7;
                return ExoPlaybackException.createForRenderer(ex, this.getName(), this.i, n, a, b, n2);
            }
            catch (final ExoPlaybackException ex2) {
                this.q = false;
            }
            finally {
                this.q = false;
            }
        }
        int a = 4;
        return ExoPlaybackException.createForRenderer(ex, this.getName(), this.i, n, a, b, n2);
    }
    
    public final ExoPlaybackException y(final MediaCodecUtil.DecoderQueryException ex, final n n) {
        return this.x(n, ex, false, 4002);
    }
    
    public abstract void z();
}
