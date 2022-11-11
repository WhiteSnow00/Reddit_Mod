// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.os.Build$VERSION;
import n1.d;
import kotlin.NoWhenBranchMatchedException;
import aa1.a;
import o1.p;
import n1.c;
import o1.f0;
import n1.f;
import o1.z;
import androidx.compose.ui.unit.LayoutDirection;
import n1.e;
import o1.b0;
import o1.h;
import o1.l0;
import android.graphics.Outline;
import u2.b;

public final class s0
{
    public b a;
    public boolean b;
    public final Outline c;
    public long d;
    public l0 e;
    public h f;
    public b0 g;
    public boolean h;
    public boolean i;
    public b0 j;
    public e k;
    public float l;
    public long m;
    public long n;
    public boolean o;
    public LayoutDirection p;
    public z q;
    
    public s0(final b a) {
        sg2.e.f((Object)a, "density");
        this.a = a;
        this.b = true;
        final Outline c = new Outline();
        c.setAlpha(1.0f);
        this.c = c;
        final long b = n1.f.b;
        this.d = b;
        this.e = f0.a;
        this.m = n1.c.b;
        this.n = b;
        this.p = LayoutDirection.Ltr;
    }
    
    public final void a(final p p) {
        sg2.e.f((Object)p, "canvas");
        this.e();
        final b0 g = this.g;
        if (g != null) {
            p.h(g, 1);
        }
        else {
            final float l = this.l;
            if (l > 0.0f) {
                b0 j = this.j;
                final e k = this.k;
                b0 b6 = null;
                Label_0445: {
                    if (j != null) {
                        final long m = this.m;
                        final long n = this.n;
                        int n3;
                        final int n2 = n3 = 0;
                        if (k != null) {
                            if (!aa1.a.D0(k)) {
                                n3 = n2;
                            }
                            else {
                                final boolean b = k.a == n1.c.c(m);
                                n3 = n2;
                                if (b) {
                                    final boolean b2 = k.b == n1.c.d(m);
                                    n3 = n2;
                                    if (b2) {
                                        final boolean b3 = k.c == n1.f.f(n) + n1.c.c(m);
                                        n3 = n2;
                                        if (b3) {
                                            final boolean b4 = k.d == n1.f.d(n) + n1.c.d(m);
                                            n3 = n2;
                                            if (b4) {
                                                final boolean b5 = n1.a.b(k.e) == l;
                                                n3 = n2;
                                                if (b5) {
                                                    n3 = 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        b6 = j;
                        if (n3 != 0) {
                            break Label_0445;
                        }
                    }
                    final float c = n1.c.c(this.m);
                    final float d = n1.c.d(this.m);
                    final float c2 = n1.c.c(this.m);
                    final float f = n1.f.f(this.n);
                    final float d2 = n1.c.d(this.m);
                    final float d3 = n1.f.d(this.n);
                    final float i = this.l;
                    final long f2 = aa1.a.f(i, i);
                    final long f3 = aa1.a.f(n1.a.b(f2), n1.a.c(f2));
                    final e k2 = new e(c, d, f + c2, d3 + d2, f3, f3, f3, f3);
                    if (j == null) {
                        j = yg.a.u();
                    }
                    else {
                        j.reset();
                    }
                    j.h(k2);
                    this.k = k2;
                    this.j = j;
                    b6 = j;
                }
                p.h(b6, 1);
            }
            else {
                p.e(n1.c.c(this.m), n1.c.d(this.m), n1.c.c(this.m) + n1.f.f(this.n), n1.c.d(this.m) + n1.f.d(this.n), 1);
            }
        }
    }
    
    public final Outline b() {
        this.e();
        Outline c;
        if (this.o && this.b) {
            c = this.c;
        }
        else {
            c = null;
        }
        return c;
    }
    
    public final boolean c(final long n) {
        final boolean o = this.o;
        final boolean b = true;
        if (!o) {
            return true;
        }
        final z q = this.q;
        if (q == null) {
            return true;
        }
        final float c = n1.c.c(n);
        final float d = n1.c.d(n);
        final boolean b2 = q instanceof z.b;
        final boolean b3 = false;
        if (b2) {
            final d a = ((z.b)q).a;
            if (a.a <= c && c < a.c && a.b <= d && d < a.d) {
                return b;
            }
        }
        else if (q instanceof z.c) {
            final e a2 = ((z.c)q).a;
            if (c >= a2.a && c < a2.c && d >= a2.b) {
                if (d < a2.d) {
                    final float b5 = n1.a.b(a2.e);
                    int n2 = b3 ? 1 : 0;
                    if (n1.a.b(a2.f) + b5 <= a2.c - a2.a) {
                        final float b6 = n1.a.b(a2.h);
                        n2 = (b3 ? 1 : 0);
                        if (n1.a.b(a2.g) + b6 <= a2.c - a2.a) {
                            final float c2 = n1.a.c(a2.e);
                            n2 = (b3 ? 1 : 0);
                            if (n1.a.c(a2.h) + c2 <= a2.d - a2.b) {
                                final float c3 = n1.a.c(a2.f);
                                n2 = (b3 ? 1 : 0);
                                if (n1.a.c(a2.g) + c3 <= a2.d - a2.b) {
                                    n2 = 1;
                                }
                            }
                        }
                    }
                    if (n2 == 0) {
                        final h u = yg.a.u();
                        u.h(a2);
                        return wd.a.S((b0)u, c, d);
                    }
                    final float n3 = n1.a.b(a2.e) + a2.a;
                    final float n4 = n1.a.c(a2.e) + a2.b;
                    final float n5 = a2.c - n1.a.b(a2.f);
                    final float n6 = a2.b + n1.a.c(a2.f);
                    final float n7 = a2.c - n1.a.b(a2.g);
                    final float n8 = a2.d - n1.a.c(a2.g);
                    final float n9 = a2.d - n1.a.c(a2.h);
                    final float n10 = a2.a + n1.a.b(a2.h);
                    if (c < n3 && d < n4) {
                        return wd.a.X(c, d, n3, n4, a2.e);
                    }
                    if (c < n10 && d > n9) {
                        return wd.a.X(c, d, n10, n9, a2.h);
                    }
                    if (c > n5 && d < n6) {
                        return wd.a.X(c, d, n5, n6, a2.f);
                    }
                    boolean b4 = b;
                    if (c <= n7) {
                        return b4;
                    }
                    b4 = b;
                    if (d > n8) {
                        b4 = wd.a.X(c, d, n7, n8, a2.g);
                        return b4;
                    }
                    return b4;
                }
            }
        }
        else {
            if (q instanceof z.a) {
                return wd.a.S(((z.a)q).a, c, d);
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }
    
    public final boolean d(final l0 e, final float alpha, final boolean b, final float n, final LayoutDirection p6, final b a) {
        sg2.e.f((Object)e, "shape");
        sg2.e.f((Object)p6, "layoutDirection");
        sg2.e.f((Object)a, "density");
        this.c.setAlpha(alpha);
        final boolean b2 = sg2.e.a((Object)this.e, (Object)e) ^ true;
        if (b2) {
            this.e = e;
            this.h = true;
        }
        final boolean o = b || n > 0.0f;
        if (this.o != o) {
            this.o = o;
            this.h = true;
        }
        if (this.p != p6) {
            this.p = p6;
            this.h = true;
        }
        if (!sg2.e.a((Object)this.a, (Object)a)) {
            this.a = a;
            this.h = true;
        }
        return b2;
    }
    
    public final void e() {
        if (this.h) {
            this.m = n1.c.b;
            final long d = this.d;
            this.n = d;
            this.l = 0.0f;
            this.g = null;
            this.h = false;
            this.i = false;
            if (this.o && n1.f.f(d) > 0.0f && n1.f.d(this.d) > 0.0f) {
                this.b = true;
                final z g = this.e.g(this.d, this.p, this.a);
                this.q = g;
                if (g instanceof z.b) {
                    final d a = ((z.b)g).a;
                    this.m = wd.a.f(a.a, a.b);
                    this.n = bg.d.q(a.c - a.a, a.d - a.b);
                    this.c.setRect(lw0.b.k2(a.a), lw0.b.k2(a.b), lw0.b.k2(a.c), lw0.b.k2(a.d));
                }
                else if (g instanceof z.c) {
                    final e a2 = ((z.c)g).a;
                    final float b = n1.a.b(a2.e);
                    this.m = wd.a.f(a2.a, a2.b);
                    this.n = bg.d.q(a2.c - a2.a, a2.d - a2.b);
                    if (aa1.a.D0(a2)) {
                        this.c.setRoundRect(lw0.b.k2(a2.a), lw0.b.k2(a2.b), lw0.b.k2(a2.c), lw0.b.k2(a2.d), b);
                        this.l = b;
                    }
                    else {
                        h f;
                        if ((f = this.f) == null) {
                            f = yg.a.u();
                            this.f = f;
                        }
                        f.reset();
                        f.h(a2);
                        this.f(f);
                    }
                }
                else if (g instanceof z.a) {
                    this.f(((z.a)g).a);
                }
            }
            else {
                this.c.setEmpty();
            }
        }
    }
    
    public final void f(final b0 g) {
        if (Build$VERSION.SDK_INT <= 28 && !g.k()) {
            this.b = false;
            this.c.setEmpty();
            this.i = true;
        }
        else {
            final Outline c = this.c;
            if (!(g instanceof h)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            c.setConvexPath(((h)g).a);
            this.i = (this.c.canClip() ^ true);
        }
        this.g = g;
    }
}
