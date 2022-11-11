// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import rg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import wd.a;
import kotlin.NoWhenBranchMatchedException;
import lw0.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.foundation.FocusedBoundsKt;
import sg2.e;
import j1.d;
import u2.i;
import c2.l;
import n0.k;
import c2.z;
import c2.b0;
import t0.f;

public final class ContentInViewModifier implements f, b0, z
{
    public final ej2.b0 f;
    public final Orientation g;
    public final k h;
    public final boolean i;
    public l j;
    public l k;
    public i l;
    public final d m;
    
    public ContentInViewModifier(final ej2.b0 f, final Orientation g, final k h, final boolean i) {
        e.f((Object)f, "scope");
        e.f((Object)g, "orientation");
        e.f((Object)h, "scrollableState");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.m = BringIntoViewResponderKt.a(FocusedBoundsKt.a((d)this, (rg2.l)new ContentInViewModifier$modifier.ContentInViewModifier$modifier$1(this)), this);
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
    
    public final void S(final l k) {
        e.f((Object)k, "coordinates");
        this.k = k;
    }
    
    @Override
    public final Object a(final n1.d d, final c<? super j> c) {
        final Object f = this.f(d, this.b(d), c);
        if (f == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return f;
        }
        return hg2.j.a;
    }
    
    @Override
    public final n1.d b(final n1.d d) {
        e.f((Object)d, "localRect");
        final i l = this.l;
        if (l != null) {
            return this.d(l.a, d);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }
    
    public final n1.d d(long s2, n1.d d) {
        s2 = lw0.b.S2(s2);
        final int n = ContentInViewModifier.ContentInViewModifier$a.a[((Enum)this.g).ordinal()];
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d = d.d(g(d.a, d.c, n1.f.f(s2)), 0.0f);
        }
        else {
            d = d.d(0.0f, g(d.b, d.d, n1.f.d(s2)));
        }
        return d;
    }
    
    public final Object f(final n1.d d, final n1.d d2, final c<? super j> c) {
        final int n = ContentInViewModifier.ContentInViewModifier$a.a[((Enum)this.g).ordinal()];
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
        final Object b = ScrollExtensionsKt.b(this.h, n4, (c)c);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return hg2.j.a;
    }
    
    public final void k0(final long n) {
        final l k = this.k;
        final i l = this.l;
        if (l != null && !u2.i.a(l.a, n) && (k != null && k.isAttached())) {
            final long a = l.a;
            if ((this.g == Orientation.Horizontal) ? ((int)(k.a() >> 32) < (int)(a >> 32)) : (u2.i.b(k.a()) < u2.i.b(a))) {
                final l j = this.j;
                if (j != null) {
                    final n1.d a2 = k.A(j, false);
                    if (a2 != null) {
                        final n1.d h = wd.a.h(n1.c.b, lw0.b.S2(a));
                        final n1.d d = this.d(k.a(), a2);
                        final boolean c = h.c(a2);
                        final boolean a3 = e.a((Object)d, (Object)a2);
                        if (c && (true ^ a3)) {
                            ej2.g.i(this.f, (CoroutineContext)null, (CoroutineStart)null, (p)new ContentInViewModifier$onSizeChanged$1(this, a2, d, (c)null), 3);
                        }
                    }
                }
            }
        }
        this.l = new i(n);
    }
}
