// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

public abstract class d implements w
{
    public final e0.c a;
    
    public d() {
        this.a = new e0.c();
    }
    
    @Deprecated
    public final int A() {
        return ((w)this).S();
    }
    
    public final void B() {
        if (!((w)this).I().p()) {
            if (!((w)this).b()) {
                final boolean p = this.P();
                if (this.y() && !this.v()) {
                    if (p) {
                        final int b0 = this.b0();
                        if (b0 != -1) {
                            ((w)this).N(b0, -9223372036854775807L);
                        }
                    }
                }
                else {
                    if (p) {
                        final long currentPosition = ((w)this).getCurrentPosition();
                        ((w)this).q();
                        if (currentPosition <= 3000L) {
                            final int b2 = this.b0();
                            if (b2 != -1) {
                                ((w)this).N(b2, -9223372036854775807L);
                            }
                            return;
                        }
                    }
                    this.seekTo(0L);
                }
            }
        }
    }
    
    public final boolean F() {
        final e0 i = ((w)this).I();
        return !i.p() && i.m(((w)this).S(), this.a).n;
    }
    
    public final void K() {
        if (!((w)this).I().p()) {
            if (!((w)this).b()) {
                if (this.j()) {
                    final int a0 = this.a0();
                    if (a0 != -1) {
                        ((w)this).N(a0, -9223372036854775807L);
                    }
                }
                else if (this.y() && this.F()) {
                    ((w)this).N(((w)this).S(), -9223372036854775807L);
                }
            }
        }
    }
    
    public final boolean P() {
        return this.b0() != -1;
    }
    
    @Deprecated
    public final boolean U() {
        return this.y();
    }
    
    public final void W() {
        this.c0(-((w)this).Y());
    }
    
    public final q Z() {
        final e0 i = ((w)this).I();
        q h;
        if (i.p()) {
            h = null;
        }
        else {
            h = i.m(((w)this).S(), this.a).h;
        }
        return h;
    }
    
    public final int a0() {
        final e0 i = ((w)this).I();
        int e;
        if (i.p()) {
            e = -1;
        }
        else {
            final int s = ((w)this).S();
            int l;
            if ((l = ((w)this).l()) == 1) {
                l = 0;
            }
            e = i.e(s, l, ((w)this).V());
        }
        return e;
    }
    
    public final int b0() {
        final e0 i = ((w)this).I();
        int k;
        if (i.p()) {
            k = -1;
        }
        else {
            final int s = ((w)this).S();
            int l;
            if ((l = ((w)this).l()) == 1) {
                l = 0;
            }
            k = i.k(s, l, ((w)this).V());
        }
        return k;
    }
    
    public final void c0(long min) {
        final long n = ((w)this).getCurrentPosition() + min;
        final long duration = ((w)this).getDuration();
        min = n;
        if (duration != -9223372036854775807L) {
            min = Math.min(n, duration);
        }
        this.seekTo(Math.max(min, 0L));
    }
    
    public final boolean isPlaying() {
        return ((w)this).f() == 3 && ((w)this).n() && ((w)this).G() == 0;
    }
    
    public final boolean j() {
        return this.a0() != -1;
    }
    
    public final boolean m(final int n) {
        return ((w)this).O().f.a.get(n);
    }
    
    public final void pause() {
        ((w)this).C(false);
    }
    
    public final void play() {
        ((w)this).C(true);
    }
    
    public final void seekTo(final long n) {
        ((w)this).N(((w)this).S(), n);
    }
    
    public final boolean v() {
        final e0 i = ((w)this).I();
        return !i.p() && i.m(((w)this).S(), this.a).m;
    }
    
    public final void x() {
        this.c0(((w)this).u());
    }
    
    public final boolean y() {
        final e0 i = ((w)this).I();
        return !i.p() && i.m(((w)this).S(), this.a).a();
    }
    
    @Deprecated
    public final boolean z() {
        return this.F();
    }
}
