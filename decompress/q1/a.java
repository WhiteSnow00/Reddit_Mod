// 
// Decompiled by Procyon v0.6.0
// 

package q1;

import kotlin.NoWhenBranchMatchedException;
import androidx.compose.ui.unit.LayoutDirection;
import o1.w;
import o1.b0;
import java.util.ArrayList;
import n1.c;
import a4.u1;
import o1.n;
import android.graphics.Shader;
import o1.r;
import o1.a0;
import o1.s;
import o1.p;
import o1.f;

public final class a implements e
{
    public final a f;
    public final a$b g;
    public f h;
    public f i;
    
    public a() {
        this.f = new a();
        this.g = new d() {
            public final q1.b a = new q1.b(this);
            public final /* synthetic */ a b;
            
            @Override
            public final p a() {
                return this.b.f.c;
            }
            
            @Override
            public final long b() {
                return this.b.f.d;
            }
            
            @Override
            public final void c(final long d) {
                this.b.f.d = d;
            }
        };
    }
    
    public static a0 c(final a a, long p6, final q1.f f, final float n, final s s, int n2) {
        final a0 u = a.u(f);
        p6 = p(n, p6);
        final f f2 = (f)u;
        if (!r.c(f2.a(), p6)) {
            f2.c(p6);
        }
        if (f2.c != null) {
            f2.k(null);
        }
        if (!ah2.f.a((Object)f2.d, (Object)s)) {
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
        return u;
    }
    
    public static /* synthetic */ a0 h(final a a, final n n, final q1.f f, final float n2, final s s, final int n3) {
        return a.e(n, f, n2, s, n3, 1);
    }
    
    public static a0 k(final a a, long p8, final float n, int n2, final u1 u1, final float n3, final s s, int n4) {
        f i;
        if ((i = a.i) == null) {
            i = new f();
            i.w(1);
            a.i = i;
        }
        p8 = p(n3, p8);
        if (!r.c(i.a(), p8)) {
            i.c(p8);
        }
        if (i.c != null) {
            i.k(null);
        }
        if (!ah2.f.a((Object)i.d, (Object)s)) {
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
            i.v(n);
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
        if (!ah2.f.a((Object)null, (Object)u1)) {
            i.q(u1);
        }
        n2 = n5;
        if (i.l() == 1) {
            n2 = 1;
        }
        if (n2 == 0) {
            i.b(1);
        }
        return (a0)i;
    }
    
    public static long p(final float n, final long n2) {
        final boolean b = n == 1.0f;
        long b2 = n2;
        if (!b) {
            b2 = r.b(n2, r.d(n2) * n);
        }
        return b2;
    }
    
    @Override
    public final void A(final n n, final long n2, final long n3, final long n4, final float n5, final q1.f f, final s s, final int n6) {
        ah2.f.f((Object)n, "brush");
        ah2.f.f((Object)f, "style");
        this.f.c.q(c.c(n2), c.d(n2), c.c(n2) + n1.f.e(n3), c.d(n2) + n1.f.c(n3), a.b(n4), a.c(n4), h(this, n, f, n5, s, n6));
    }
    
    @Override
    public final void D0(final long n, final long n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        ah2.f.f((Object)f, "style");
        this.f.c.p(c.c(n2), c.d(n2), n1.f.e(n3) + c.c(n2), n1.f.c(n3) + c.d(n2), c(this, n, f, n4, s, n5));
    }
    
    @Override
    public final void I0(final long n, final long n2, final long n3, final long n4, final q1.f f, final float n5, final s s, final int n6) {
        ah2.f.f((Object)f, "style");
        this.f.c.q(c.c(n2), c.d(n2), n1.f.e(n3) + c.c(n2), n1.f.c(n3) + c.d(n2), a.b(n4), a.c(n4), c(this, n, f, n5, s, n6));
    }
    
    @Override
    public final void K0(final ArrayList list, final long n, final float n2, final int n3, final u1 u1, final float n4, final s s, final int n5) {
        this.f.c.d(k(this, n, n2, n3, u1, n4, s, n5), list);
    }
    
    @Override
    public final void N(final b0 b0, final long n, final float n2, final q1.f f, final s s, final int n3) {
        ah2.f.f((Object)b0, "path");
        ah2.f.f((Object)f, "style");
        this.f.c.b(b0, c(this, n, f, n2, s, n3));
    }
    
    @Override
    public final void N0(final long n, final long n2, final long n3, final float n4, final int n5, final u1 u1, final float n6, final s s, final int n7) {
        this.f.c.t(n2, n3, k(this, n, n4, n5, u1, n6, s, n7));
    }
    
    @Override
    public final void S(final long n, final float n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        ah2.f.f((Object)f, "style");
        this.f.c.c(n2, n3, c(this, n, f, n4, s, n5));
    }
    
    @Override
    public final void X(final w w, final long n, final float n2, final q1.f f, final s s, final int n3) {
        ah2.f.f((Object)w, "image");
        ah2.f.f((Object)f, "style");
        this.f.c.i(w, n, h(this, null, f, n2, s, n3));
    }
    
    @Override
    public final a$b Y() {
        return this.g;
    }
    
    @Override
    public final void a0(final n n, final float n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        ah2.f.f((Object)n, "brush");
        ah2.f.f((Object)f, "style");
        this.f.c.c(n2, n3, h(this, n, f, n4, s, n5));
    }
    
    @Override
    public final void d0(final w w, final long n, final long n2, final long n3, final long n4, final float n5, final q1.f f, final s s, final int n6, final int n7) {
        ah2.f.f((Object)w, "image");
        ah2.f.f((Object)f, "style");
        this.f.c.s(w, n, n2, n3, n4, this.e(null, f, n5, s, n6, n7));
    }
    
    public final a0 e(final n n, final q1.f f, final float n2, final s s, int n3, final int n4) {
        final a0 u = this.u(f);
        final int n5 = 1;
        if (n != null) {
            n.a(n2, this.b(), u);
        }
        else if (u.u() != n2) {
            u.d(n2);
        }
        if (!ah2.f.a((Object)u.h(), (Object)s)) {
            u.j(s);
        }
        if (u.i() != n3) {
            u.g(n3);
        }
        if (u.l() == n4) {
            n3 = n5;
        }
        else {
            n3 = 0;
        }
        if (n3 == 0) {
            u.b(n4);
        }
        return u;
    }
    
    @Override
    public final float getDensity() {
        return this.f.a.getDensity();
    }
    
    @Override
    public final float getFontScale() {
        return this.f.a.getFontScale();
    }
    
    @Override
    public final LayoutDirection getLayoutDirection() {
        return this.f.b;
    }
    
    @Override
    public final void i0(final n n, final long n2, final long n3, final float n4, int n5, final u1 u1, final float n6, final s s, int n7) {
        ah2.f.f((Object)n, "brush");
        final p c = this.f.c;
        f i;
        if ((i = this.i) == null) {
            i = new f();
            i.w(1);
            this.i = i;
        }
        n.a(n6, this.b(), (a0)i);
        if (!ah2.f.a((Object)i.d, (Object)s)) {
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
            i.v(n4);
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
        if (!ah2.f.a((Object)null, (Object)u1)) {
            i.q(u1);
        }
        n5 = n8;
        if (i.l() == 1) {
            n5 = 1;
        }
        if (n5 == 0) {
            i.b(1);
        }
        c.t(n2, n3, (a0)i);
    }
    
    @Override
    public final void m0(final b0 b0, final n n, final float n2, final q1.f f, final s s, final int n3) {
        ah2.f.f((Object)b0, "path");
        ah2.f.f((Object)n, "brush");
        ah2.f.f((Object)f, "style");
        this.f.c.b(b0, h(this, n, f, n2, s, n3));
    }
    
    @Override
    public final void o0(final n n, final long n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        ah2.f.f((Object)n, "brush");
        ah2.f.f((Object)f, "style");
        this.f.c.p(c.c(n2), c.d(n2), n1.f.e(n3) + c.c(n2), n1.f.c(n3) + c.d(n2), h(this, n, f, n4, s, n5));
    }
    
    @Override
    public final void q0(final long n, final float n2, final float n3, final long n4, final long n5, final float n6, final q1.f f, final s s, final int n7) {
        ah2.f.f((Object)f, "style");
        this.f.c.u(c.c(n4), c.d(n4), n1.f.e(n5) + c.c(n4), n1.f.c(n5) + c.d(n4), n2, n3, c(this, n, f, n6, s, n7));
    }
    
    public final a0 u(final q1.f f) {
        final boolean a = ah2.f.a((Object)f, (Object)q1.h.a);
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
                i.v(a2);
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
            if (!ah2.f.a((Object)null, (Object)null)) {
                j.getClass();
                i.q(null);
            }
            h = i;
        }
        return (a0)h;
    }
    
    public static final class a
    {
        public b a;
        public LayoutDirection b;
        public p c;
        public long d;
        
        public a() {
            final u2.c k = dg.d.K;
            final LayoutDirection ltr = LayoutDirection.Ltr;
            final g c = new g();
            final long b = n1.f.b;
            this.a = k;
            this.b = ltr;
            this.c = (p)c;
            this.d = b;
        }
        
        public final void a(final LayoutDirection b) {
            ah2.f.f((Object)b, "<set-?>");
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return ah2.f.a((Object)this.a, (Object)a.a) && this.b == a.b && ah2.f.a((Object)this.c, (Object)a.c) && n1.f.b(this.d, a.d);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int hashCode2 = this.b.hashCode();
            final int hashCode3 = this.c.hashCode();
            final long d = this.d;
            final int d2 = n1.f.d;
            return Long.hashCode(d) + (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("DrawParams(density=");
            k.append(this.a);
            k.append(", layoutDirection=");
            k.append(this.b);
            k.append(", canvas=");
            k.append(this.c);
            k.append(", size=");
            k.append((Object)n1.f.f(this.d));
            k.append(')');
            return k.toString();
        }
    }
}
