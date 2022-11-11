// 
// Decompiled by Procyon v0.6.0
// 

package q1;

import o1.p;
import kotlin.NoWhenBranchMatchedException;
import androidx.compose.ui.unit.LayoutDirection;
import o1.w;
import java.util.ArrayList;
import o1.b0;
import n1.c;
import o1.n;
import android.graphics.Shader;
import o1.r;
import o1.a0;
import o1.s;
import o1.f;

public final class a implements e
{
    public final a.a$a f;
    public final a$b g;
    public f h;
    public f i;
    
    public a() {
        this.f = new a.a$a();
        this.g = new a$b(this);
    }
    
    public static a0 c(final a a, long o, final q1.f f, final float n, final s s, int n2) {
        final a0 q = a.q(f);
        o = o(n, o);
        final f f2 = (f)q;
        if (!r.c(f2.a(), o)) {
            f2.c(o);
        }
        if (f2.c != null) {
            f2.k(null);
        }
        if (!sg2.e.a((Object)f2.d, (Object)s)) {
            f2.j(s);
        }
        final int b = f2.b;
        final int n3 = 0;
        if (b != n2) {
            f2.g(n2);
        }
        n2 = n3;
        if (f2.l() == 1) {
            n2 = 1;
        }
        if (n2 == 0) {
            f2.b(1);
        }
        return q;
    }
    
    public static /* synthetic */ a0 h(final a a, final n n, final q1.f f, final float n2, final s s, final int n3) {
        return a.e(n, f, n2, s, n3, 1);
    }
    
    public static a0 k(final a a, long o, final float n, int n2, final np.a a2, final float n3, final s s, int n4) {
        f i;
        if ((i = a.i) == null) {
            i = new f();
            i.w(1);
            a.i = i;
        }
        o = o(n3, o);
        if (!r.c(i.a(), o)) {
            i.c(o);
        }
        if (i.c != null) {
            i.k(null);
        }
        if (!sg2.e.a((Object)i.d, (Object)s)) {
            i.j(s);
        }
        final int b = i.b;
        final int n5 = 0;
        if (b != n4) {
            i.g(n4);
        }
        if (i.p() == n) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        if (n4 == 0) {
            i.u(n);
        }
        if (i.o() == 4.0f) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        if (n4 == 0) {
            i.t(4.0f);
        }
        if (i.m() == n2) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        if (n4 == 0) {
            i.r(n2);
        }
        if (i.n() == 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            i.s(0);
        }
        i.getClass();
        if (!sg2.e.a((Object)null, (Object)a2)) {
            i.q(a2);
        }
        n2 = n5;
        if (i.l() == 1) {
            n2 = 1;
        }
        if (n2 == 0) {
            i.b(1);
        }
        return i;
    }
    
    public static long o(final float n, final long n2) {
        final boolean b = n == 1.0f;
        long b2 = n2;
        if (!b) {
            b2 = r.b(n2, r.d(n2) * n);
        }
        return b2;
    }
    
    public final void B(final n n, final long n2, final long n3, final long n4, final float n5, final q1.f f, final s s, final int n6) {
        sg2.e.f((Object)n, "brush");
        sg2.e.f((Object)f, "style");
        this.f.c.q(c.c(n2), c.d(n2), c.c(n2) + n1.f.f(n3), c.d(n2) + n1.f.d(n3), n1.a.b(n4), n1.a.c(n4), h(this, n, f, n5, s, n6));
    }
    
    public final void G0(final long n, final long n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        sg2.e.f((Object)f, "style");
        this.f.c.p(c.c(n2), c.d(n2), n1.f.f(n3) + c.c(n2), n1.f.d(n3) + c.d(n2), c(this, n, f, n4, s, n5));
    }
    
    public final void J0(final long n, final long n2, final long n3, final long n4, final q1.f f, final float n5, final s s, final int n6) {
        sg2.e.f((Object)f, "style");
        this.f.c.q(c.c(n2), c.d(n2), n1.f.f(n3) + c.c(n2), n1.f.d(n3) + c.d(n2), n1.a.b(n4), n1.a.c(n4), c(this, n, f, n5, s, n6));
    }
    
    public final void O(final b0 b0, final long n, final float n2, final q1.f f, final s s, final int n3) {
        sg2.e.f((Object)b0, "path");
        sg2.e.f((Object)f, "style");
        this.f.c.b(b0, c(this, n, f, n2, s, n3));
    }
    
    public final void R(final ArrayList list, final long n, final float n2, final int n3, final np.a a, final float n4, final s s, final int n5) {
        this.f.c.d(k(this, n, n2, n3, a, n4, s, n5), list);
    }
    
    public final void T(final long n, final float n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        sg2.e.f((Object)f, "style");
        this.f.c.c(n2, n3, c(this, n, f, n4, s, n5));
    }
    
    public final void Z(final w w, final long n, final float n2, final q1.f f, final s s, final int n3) {
        sg2.e.f((Object)w, "image");
        sg2.e.f((Object)f, "style");
        this.f.c.i(w, n, h(this, null, f, n2, s, n3));
    }
    
    public final a$b a0() {
        return this.g;
    }
    
    public final a0 e(final n n, final q1.f f, final float n2, final s s, int n3, final int n4) {
        final a0 q = this.q(f);
        final int n5 = 1;
        if (n != null) {
            n.a(n2, ((e)this).b(), q);
        }
        else if (q.v() != n2) {
            q.d(n2);
        }
        if (!sg2.e.a((Object)q.h(), (Object)s)) {
            q.j(s);
        }
        if (q.i() != n3) {
            q.g(n3);
        }
        if (q.l() == n4) {
            n3 = n5;
        }
        else {
            n3 = 0;
        }
        if (n3 == 0) {
            q.b(n4);
        }
        return q;
    }
    
    public final void e0(final n n, final float n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        sg2.e.f((Object)n, "brush");
        sg2.e.f((Object)f, "style");
        this.f.c.c(n2, n3, h(this, n, f, n4, s, n5));
    }
    
    public final float getDensity() {
        return this.f.a.getDensity();
    }
    
    public final float getFontScale() {
        return this.f.a.getFontScale();
    }
    
    public final LayoutDirection getLayoutDirection() {
        return this.f.b;
    }
    
    public final void h0(final w w, final long n, final long n2, final long n3, final long n4, final float n5, final q1.f f, final s s, final int n6, final int n7) {
        sg2.e.f((Object)w, "image");
        sg2.e.f((Object)f, "style");
        this.f.c.s(w, n, n2, n3, n4, this.e(null, f, n5, s, n6, n7));
    }
    
    public final void m0(final long n, final long n2, final long n3, final float n4, final int n5, final np.a a, final float n6, final s s, final int n7) {
        this.f.c.t(n2, n3, k(this, n, n4, n5, a, n6, s, n7));
    }
    
    public final void p0(final b0 b0, final n n, final float n2, final q1.f f, final s s, final int n3) {
        sg2.e.f((Object)b0, "path");
        sg2.e.f((Object)n, "brush");
        sg2.e.f((Object)f, "style");
        this.f.c.b(b0, h(this, n, f, n2, s, n3));
    }
    
    public final a0 q(final q1.f f) {
        final boolean a = sg2.e.a((Object)f, (Object)q1.h.a);
        final int n = 0;
        f h;
        if (a) {
            if ((h = this.h) == null) {
                h = new f();
                h.w(0);
                this.h = h;
            }
        }
        else {
            if (!(f instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            f i;
            if ((i = this.i) == null) {
                i = new f();
                i.w(1);
                this.i = i;
            }
            final float p = i.p();
            final i j = (i)f;
            final float a2 = j.a;
            if (p != a2) {
                i.u(a2);
            }
            final int m = i.m();
            final int c = j.c;
            if (m != c) {
                i.r(c);
            }
            final float o = i.o();
            final float b = j.b;
            if (o != b) {
                i.t(b);
            }
            final int n2 = i.n();
            final int d = j.d;
            int n3 = n;
            if (n2 == d) {
                n3 = 1;
            }
            if (n3 == 0) {
                i.s(d);
            }
            i.getClass();
            j.getClass();
            if (!sg2.e.a((Object)null, (Object)null)) {
                j.getClass();
                i.q(null);
            }
            h = i;
        }
        return h;
    }
    
    public final void r0(final n n, final long n2, final long n3, final float n4, int n5, final np.a a, final float n6, final s s, int n7) {
        sg2.e.f((Object)n, "brush");
        final p c = this.f.c;
        f i;
        if ((i = this.i) == null) {
            i = new f();
            i.w(1);
            this.i = i;
        }
        n.a(n6, ((e)this).b(), i);
        if (!sg2.e.a((Object)i.d, (Object)s)) {
            i.j(s);
        }
        final int b = i.b;
        final int n8 = 0;
        if (b != n7) {
            i.g(n7);
        }
        if (i.p() == n4) {
            n7 = 1;
        }
        else {
            n7 = 0;
        }
        if (n7 == 0) {
            i.u(n4);
        }
        if (i.o() == 4.0f) {
            n7 = 1;
        }
        else {
            n7 = 0;
        }
        if (n7 == 0) {
            i.t(4.0f);
        }
        if (i.m() == n5) {
            n7 = 1;
        }
        else {
            n7 = 0;
        }
        if (n7 == 0) {
            i.r(n5);
        }
        if (i.n() == 0) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        if (n5 == 0) {
            i.s(0);
        }
        i.getClass();
        if (!sg2.e.a((Object)null, (Object)a)) {
            i.q(a);
        }
        n5 = n8;
        if (i.l() == 1) {
            n5 = 1;
        }
        if (n5 == 0) {
            i.b(1);
        }
        c.t(n2, n3, i);
    }
    
    public final void s0(final n n, final long n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        sg2.e.f((Object)n, "brush");
        sg2.e.f((Object)f, "style");
        this.f.c.p(c.c(n2), c.d(n2), n1.f.f(n3) + c.c(n2), n1.f.d(n3) + c.d(n2), h(this, n, f, n4, s, n5));
    }
    
    public final void u0(final long n, final float n2, final float n3, final long n4, final long n5, final float n6, final q1.f f, final s s, final int n7) {
        sg2.e.f((Object)f, "style");
        this.f.c.u(c.c(n4), c.d(n4), n1.f.f(n5) + c.c(n4), n1.f.d(n5) + c.d(n4), n2, n3, c(this, n, f, n6, s, n7));
    }
}
