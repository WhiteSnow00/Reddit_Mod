// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import zg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import kotlin.NoWhenBranchMatchedException;
import yl.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import pg2.j;
import androidx.compose.foundation.FocusedBoundsKt;
import j1.d;
import u2.i;
import c2.l;
import n0.k;
import c2.z;
import c2.b0;
import t0.f;

public final class ContentInViewModifier implements f, b0, z
{
    public final mj2.b0 f;
    public final Orientation g;
    public final k h;
    public final boolean i;
    public l j;
    public l k;
    public i l;
    public final d m;
    
    public ContentInViewModifier(final mj2.b0 f, final Orientation g, final k h, final boolean i) {
        ah2.f.f((Object)f, "scope");
        ah2.f.f((Object)g, "orientation");
        ah2.f.f((Object)h, "scrollableState");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.m = BringIntoViewResponderKt.a(FocusedBoundsKt.a((d)this, (zg2.l<? super l, j>)new ContentInViewModifier$modifier.ContentInViewModifier$modifier$1(this)), this);
    }
    
    public static float g(float n, float n2, final float n3) {
        if (n < 0.0f || n2 > n3) {
            if (n >= 0.0f || n2 <= n3) {
                final float abs = Math.abs(n);
                n2 -= n3;
                if (abs < Math.abs(n2)) {
                    return n;
                }
                n = n2;
                return n;
            }
        }
        n = 0.0f;
        return n;
    }
    
    @Override
    public final void R(final l k) {
        ah2.f.f((Object)k, "coordinates");
        this.k = k;
    }
    
    @Override
    public final Object a(final n1.d d, final c<? super j> c) {
        final Object f = this.f(d, this.b(d), c);
        if (f == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return f;
        }
        return pg2.j.a;
    }
    
    @Override
    public final n1.d b(final n1.d d) {
        ah2.f.f((Object)d, "localRect");
        final i l = this.l;
        if (l != null) {
            return this.d(l.a, d);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }
    
    public final n1.d d(long x1, n1.d d) {
        x1 = yl.a.x1(x1);
        final int n = a.a[this.g.ordinal()];
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d = d.d(g(d.a, d.c, n1.f.e(x1)), 0.0f);
        }
        else {
            d = d.d(0.0f, g(d.b, d.d, n1.f.c(x1)));
        }
        return d;
    }
    
    public final Object f(final n1.d d, final n1.d d2, final c<? super j> c) {
        final int n = a.a[this.g.ordinal()];
        float n2;
        float n3;
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            n2 = d.a;
            n3 = d2.a;
        }
        else {
            n2 = d.b;
            n3 = d2.b;
        }
        float n4 = n2 - n3;
        if (this.i) {
            n4 = -n4;
        }
        final Object b = ScrollExtensionsKt.b(this.h, n4, c);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return pg2.j.a;
    }
    
    @Override
    public final void g0(final long n) {
        final l k = this.k;
        final i l = this.l;
        if (l != null && !u2.i.a(l.a, n) && (k != null && k.isAttached())) {
            final long a = l.a;
            if ((this.g == Orientation.Horizontal) ? ((int)(k.a() >> 32) < (int)(a >> 32)) : (u2.i.b(k.a()) < u2.i.b(a))) {
                final l j = this.j;
                if (j != null) {
                    final n1.d b = k.B(j, false);
                    if (b != null) {
                        final n1.d a2 = dg.d.A(n1.c.b, yl.a.x1(a));
                        final n1.d d = this.d(k.a(), b);
                        final boolean c = a2.c(b);
                        final boolean a3 = ah2.f.a((Object)d, (Object)b);
                        if (c && (true ^ a3)) {
                            mj2.g.i(this.f, (CoroutineContext)null, (CoroutineStart)null, (p)new ContentInViewModifier$onSizeChanged$1(this, b, d, (c)null), 3);
                        }
                    }
                }
            }
        }
        this.l = new i(n);
    }
}
