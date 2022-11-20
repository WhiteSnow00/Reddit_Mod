// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import b5.k;
import java.math.BigInteger;
import java.util.Hashtable;

public abstract class g
{
    public static final f[] f;
    public pl2.d a;
    public f b;
    public f c;
    public f[] d;
    public Hashtable e;
    
    static {
        f = new f[0];
    }
    
    public g(final pl2.d d, final f f, final f f2) {
        int f3;
        if (d == null) {
            f3 = 0;
        }
        else {
            f3 = d.f;
        }
        f[] f4 = null;
        Label_0150: {
            if (f3 != 0 && f3 != 5) {
                final f j = d.j(pl2.b.b);
                if (f3 != 1 && f3 != 2) {
                    if (f3 == 3) {
                        f4 = new f[] { j, j, j };
                        break Label_0150;
                    }
                    if (f3 == 4) {
                        f4 = new f[] { j, d.b };
                        break Label_0150;
                    }
                    if (f3 != 6) {
                        throw new IllegalArgumentException("unknown coordinate system");
                    }
                }
                f4 = new f[] { j };
            }
            else {
                f4 = g.f;
            }
        }
        this(d, f, f2, f4);
    }
    
    public g(final pl2.d a, final f b, final f c, final f[] d) {
        this.e = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public abstract g a(final g p0);
    
    public final void b() {
        final int e = this.e();
        boolean b = false;
        if (e == 0 || e == 5 || this.j() || this.d[0].h()) {
            b = true;
        }
        if (b) {
            return;
        }
        throw new IllegalStateException("point not in normal form");
    }
    
    public final boolean c(g m) {
        final boolean b = false;
        final boolean b2 = false;
        if (m == null) {
            return false;
        }
        final pl2.d a = this.a;
        final pl2.d a2 = m.a;
        final boolean b3 = a == null;
        final boolean b4 = a2 == null;
        final boolean j = this.j();
        final boolean i = m.j();
        if (!j && !i) {
            g k = null;
            Label_0166: {
                if (!b3 || !b4) {
                    if (b3) {
                        m = m.m();
                    }
                    else {
                        if (b4) {
                            k = this.m();
                            break Label_0166;
                        }
                        if (!a.i(a2)) {
                            return false;
                        }
                        final g[] array = { this, a.m(m) };
                        a.n(array, 0, 2, null);
                        k = array[0];
                        m = array[1];
                        break Label_0166;
                    }
                }
                k = this;
            }
            boolean b5 = b2;
            if (k.b.equals(m.b)) {
                b5 = b2;
                if (k.g().equals(m.g())) {
                    b5 = true;
                }
            }
            return b5;
        }
        boolean b6 = b;
        if (j) {
            b6 = b;
            if (i) {
                if (!b3 && !b4) {
                    b6 = b;
                    if (!a.i(a2)) {
                        return b6;
                    }
                }
                b6 = true;
            }
        }
        return b6;
    }
    
    public abstract boolean d();
    
    public final int e() {
        final pl2.d a = this.a;
        int f;
        if (a == null) {
            f = 0;
        }
        else {
            f = a.f;
        }
        return f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof g && this.c((g)o));
    }
    
    public final byte[] f(final boolean b) {
        if (this.j()) {
            return new byte[1];
        }
        final g m = this.m();
        final byte[] e = m.b.e();
        if (b) {
            final byte[] array = new byte[e.length + 1];
            int n;
            if (m.d()) {
                n = 3;
            }
            else {
                n = 2;
            }
            array[0] = (byte)n;
            System.arraycopy(e, 0, array, 1, e.length);
            return array;
        }
        final byte[] e2 = m.g().e();
        final byte[] array2 = new byte[e.length + e2.length + 1];
        array2[0] = 4;
        System.arraycopy(e, 0, array2, 1, e.length);
        System.arraycopy(e2, 0, array2, e.length + 1, e2.length);
        return array2;
    }
    
    public f g() {
        return this.c;
    }
    
    public f h() {
        final f[] d = this.d;
        f f;
        if (d.length <= 0) {
            f = null;
        }
        else {
            f = d[0];
        }
        return f;
    }
    
    @Override
    public final int hashCode() {
        final pl2.d a = this.a;
        int n;
        if (a == null) {
            n = 0;
        }
        else {
            n = ~a.hashCode();
        }
        int n2 = n;
        if (!this.j()) {
            final g m = this.m();
            n2 = (n ^ m.b.hashCode() * 17 ^ m.g().hashCode() * 257);
        }
        return n2;
    }
    
    public final boolean i(final boolean b, final boolean b2) {
        return this.j() || (((q)this.a.o(this, "bc_validity", (m)new g$a(this, b, b2))).a ^ true);
    }
    
    public final boolean j() {
        final f b = this.b;
        final boolean b2 = false;
        if (b != null && this.c != null) {
            final f[] d = this.d;
            boolean b3 = b2;
            if (d.length <= 0) {
                return b3;
            }
            b3 = b2;
            if (!d[0].i()) {
                return b3;
            }
        }
        return true;
    }
    
    public final g k(final BigInteger bigInteger) {
        final pl2.d a = this.a;
        synchronized (a) {
            if (a.h == null) {
                a.h = a.c();
            }
            return a.h.k2(this, bigInteger);
        }
    }
    
    public abstract g l();
    
    public final g m() {
        if (this.j()) {
            return this;
        }
        final int e = this.e();
        if (e == 0 || e == 5) {
            return this;
        }
        final f h = this.h();
        if (h.h()) {
            return this;
        }
        return this.n(h.g());
    }
    
    public final g n(f j) {
        final int e = this.e();
        if (e != 1) {
            if (e == 2 || e == 3 || e == 4) {
                final f o = j.o();
                j = o.j(j);
                return this.a.e(this.b.j(o), this.c.j(j));
            }
            if (e != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return this.a.e(this.b.j(j), this.c.j(j));
    }
    
    public abstract boolean o();
    
    public boolean p() {
        final boolean equals = pl2.b.b.equals(this.a.e);
        final boolean b = true;
        if (equals) {
            return true;
        }
        final BigInteger d = this.a.d;
        boolean b2 = b;
        if (d != null) {
            final BigInteger abs = d.abs();
            g l = this.a.l();
            final int bitLength = abs.bitLength();
            g g = l;
            if (bitLength > 0) {
                if (abs.testBit(0)) {
                    l = this;
                }
                g v = this;
                int n = 1;
                while (true) {
                    g = l;
                    if (n >= bitLength) {
                        break;
                    }
                    v = v.v();
                    g a = l;
                    if (abs.testBit(n)) {
                        a = l.a(v);
                    }
                    ++n;
                    l = a;
                }
            }
            g i = g;
            if (d.signum() < 0) {
                i = g.l();
            }
            b2 = (i.j() && b);
        }
        return b2;
    }
    
    public g q(final f f) {
        g f2;
        if (this.j()) {
            f2 = this;
        }
        else {
            f2 = this.a.f(this.b.j(f), this.c, this.d);
        }
        return f2;
    }
    
    public g r(final f f) {
        g f2;
        if (this.j()) {
            f2 = this;
        }
        else {
            f2 = this.a.f(this.b, this.c.j(f), this.d);
        }
        return f2;
    }
    
    public abstract g s(final g p0);
    
    public g t() {
        return this.w(this);
    }
    
    @Override
    public final String toString() {
        if (this.j()) {
            return "INF";
        }
        final StringBuffer sb = new StringBuffer();
        sb.append('(');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        for (int i = 0; i < this.d.length; ++i) {
            sb.append(',');
            sb.append(this.d[i]);
        }
        sb.append(')');
        return sb.toString();
    }
    
    public g u(int n) {
        if (n >= 0) {
            g v = this;
            while (--n >= 0) {
                v = v.v();
            }
            return v;
        }
        throw new IllegalArgumentException("'e' cannot be negative");
    }
    
    public abstract g v();
    
    public g w(final g g) {
        return this.v().a(g);
    }
    
    public static final class d extends g$b
    {
        public d(final pl2.d d, final f f, final f f2) {
            super(d, f, f2);
        }
        
        public d(final pl2.d d, final f f, final f f2, final f[] array) {
            super(d, f, f2, array);
        }
        
        public final g a(final g g) {
            if (((g)this).j()) {
                return g;
            }
            if (g.j()) {
                return (g)this;
            }
            final pl2.d a = ((g)this).a;
            final int f = a.f;
            f f2 = ((g)this).b;
            final f b = g.b;
            if (f != 0) {
                if (f != 1) {
                    if (f != 6) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    if (f2.i()) {
                        if (b.i()) {
                            return a.l();
                        }
                        return g.a((g)this);
                    }
                    else {
                        final f c = ((g)this).c;
                        final f f3 = ((g)this).d[0];
                        final f c2 = g.c;
                        final f f4 = g.d[0];
                        final boolean h = f3.h();
                        f j;
                        f i;
                        if (!h) {
                            j = b.j(f3);
                            i = c2.j(f3);
                        }
                        else {
                            j = b;
                            i = c2;
                        }
                        final boolean h2 = f4.h();
                        f k;
                        if (!h2) {
                            f2 = f2.j(f4);
                            k = c.j(f4);
                        }
                        else {
                            k = c;
                        }
                        final f a2 = k.a(i);
                        final f a3 = f2.a(j);
                        if (!a3.i()) {
                            f f5;
                            f f6;
                            f f7;
                            if (b.i()) {
                                final g m = ((g)this).m();
                                final f b2 = m.b;
                                final f g2 = m.g();
                                final f d = g2.a(c2).d(b2);
                                f5 = b5.k.p(d, d, b2).a(a.b);
                                if (f5.i()) {
                                    return (g)new d(a, f5, a.c.n());
                                }
                                f6 = d.j(b2.a(f5)).a(f5).a(g2).d(f5).a(f5);
                                f7 = a.j(pl2.b.b);
                            }
                            else {
                                final f o = a3.o();
                                final f l = a2.j(f2);
                                final f j2 = a2.j(j);
                                f5 = l.j(j2);
                                if (f5.i()) {
                                    return (g)new d(a, f5, a.c.n());
                                }
                                final f f8 = f7 = a2.j(o);
                                if (!h2) {
                                    f7 = f8.j(f4);
                                }
                                f6 = j2.a(o).p(f7, c.a(f3));
                                if (!h) {
                                    f7 = f7.j(f3);
                                }
                            }
                            return (g)new d(a, f5, f6, new f[] { f7 });
                        }
                        if (a2.i()) {
                            return this.v();
                        }
                        return a.l();
                    }
                }
                else {
                    final f c3 = ((g)this).c;
                    final f f9 = ((g)this).d[0];
                    final f c4 = g.c;
                    final f f10 = g.d[0];
                    final boolean h3 = f10.h();
                    final f j3 = f9.j(c4);
                    f j4;
                    if (h3) {
                        j4 = c3;
                    }
                    else {
                        j4 = c3.j(f10);
                    }
                    final f a4 = j3.a(j4);
                    final f j5 = f9.j(b);
                    f j6;
                    if (h3) {
                        j6 = f2;
                    }
                    else {
                        j6 = f2.j(f10);
                    }
                    final f a5 = j5.a(j6);
                    if (!a5.i()) {
                        final f o2 = a5.o();
                        final f j7 = o2.j(a5);
                        f j8;
                        if (h3) {
                            j8 = f9;
                        }
                        else {
                            j8 = f9.j(f10);
                        }
                        final f a6 = a4.a(a5);
                        final f a7 = a6.l(a4, o2, a.b).j(j8).a(j7);
                        final f j9 = a5.j(a7);
                        f j10;
                        if (h3) {
                            j10 = o2;
                        }
                        else {
                            j10 = o2.j(f10);
                        }
                        return (g)new d(a, j9, a4.l(f2, a5, c3).l(j10, a6, a7), new f[] { j7.j(j8) });
                    }
                    if (a4.i()) {
                        return this.v();
                    }
                    return a.l();
                }
            }
            else {
                final f c5 = ((g)this).c;
                final f c6 = g.c;
                final f a8 = f2.a(b);
                final f a9 = c5.a(c6);
                if (!a8.i()) {
                    final f d2 = a9.d(a8);
                    final f a10 = k.p(d2, d2, a8).a(a.b);
                    return (g)new d(a, a10, d2.j(f2.a(a10)).a(a10).a(c5));
                }
                if (a9.i()) {
                    return this.v();
                }
                return a.l();
            }
        }
        
        public final boolean d() {
            final f b = ((g)this).b;
            final boolean i = b.i();
            boolean b2 = false;
            if (i) {
                return false;
            }
            final f c = ((g)this).c;
            final int e = ((g)this).e();
            if (e != 5 && e != 6) {
                return c.d(b).s();
            }
            if (c.s() != b.s()) {
                b2 = true;
            }
            return b2;
        }
        
        public final f g() {
            final int e = ((g)this).e();
            if (e != 5 && e != 6) {
                return ((g)this).c;
            }
            final f b = ((g)this).b;
            final f c = ((g)this).c;
            if (!((g)this).j() && !b.i()) {
                f f2;
                final f f = f2 = c.a(b).j(b);
                if (6 == e) {
                    final f f3 = ((g)this).d[0];
                    f2 = f;
                    if (!f3.h()) {
                        f2 = f.d(f3);
                    }
                }
                return f2;
            }
            return c;
        }
        
        public final g l() {
            if (((g)this).j()) {
                return (g)this;
            }
            final f b = ((g)this).b;
            if (b.i()) {
                return (g)this;
            }
            final int e = ((g)this).e();
            if (e == 0) {
                return (g)new d(((g)this).a, b, ((g)this).c.a(b));
            }
            if (e == 1) {
                return (g)new d(((g)this).a, b, ((g)this).c.a(b), new f[] { ((g)this).d[0] });
            }
            if (e == 5) {
                return (g)new d(((g)this).a, b, ((g)this).c.b());
            }
            if (e == 6) {
                final f c = ((g)this).c;
                final f f = ((g)this).d[0];
                return (g)new d(((g)this).a, b, c.a(f), new f[] { f });
            }
            throw new IllegalStateException("unsupported coordinate system");
        }
        
        public final g v() {
            if (((g)this).j()) {
                return (g)this;
            }
            final pl2.d a = ((g)this).a;
            f f = ((g)this).b;
            if (f.i()) {
                return a.l();
            }
            final int f2 = a.f;
            if (f2 == 0) {
                final f a2 = ((g)this).c.d(f).a(f);
                final f a3 = a2.o().a(a2).a(a.b);
                return (g)new d(a, a3, f.p(a3, a2.b()));
            }
            if (f2 == 1) {
                f f3 = ((g)this).c;
                final f f4 = ((g)this).d[0];
                final boolean h = f4.h();
                f j;
                if (h) {
                    j = f;
                }
                else {
                    j = f.j(f4);
                }
                if (!h) {
                    f3 = f3.j(f4);
                }
                final f o = f.o();
                final f a4 = o.a(f3);
                final f o2 = j.o();
                final f a5 = a4.a(j);
                final f l = a5.l(a4, o2, a.b);
                return (g)new d(a, j.j(l), o.o().l(j, l, a5), new f[] { j.j(o2) });
            }
            if (f2 != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            final f c = ((g)this).c;
            final f f5 = ((g)this).d[0];
            final boolean h2 = f5.h();
            f i;
            if (h2) {
                i = c;
            }
            else {
                i = c.j(f5);
            }
            f o3;
            if (h2) {
                o3 = f5;
            }
            else {
                o3 = f5.o();
            }
            final f b = a.b;
            f k;
            if (h2) {
                k = b;
            }
            else {
                k = b.j(o3);
            }
            final f p = b5.k.p(c, i, k);
            if (p.i()) {
                return (g)new d(a, p, a.c.n());
            }
            final f o4 = p.o();
            f m;
            if (h2) {
                m = p;
            }
            else {
                m = p.j(o3);
            }
            final f c2 = a.c;
            f f7;
            if (c2.c() < a.k() >> 1) {
                final f o5 = c.a(f).o();
                f f6;
                if (c2.h()) {
                    f6 = k.a(o3).o();
                }
                else {
                    f6 = k.p(c2, o3.o());
                }
                f7 = o5.a(p).a(o3).j(o5).a(f6).a(o4);
                if (!b.i()) {
                    f f8 = f7;
                    if (!b.h()) {
                        f8 = f7.a(b.b().j(m));
                        return (g)new d(a, o4, f8, new f[] { m });
                    }
                    return (g)new d(a, o4, f8, new f[] { m });
                }
            }
            else {
                if (!h2) {
                    f = f.j(f5);
                }
                f7 = f.p(p, i).a(o4);
            }
            f f8 = f7.a(m);
            return (g)new d(a, o4, f8, new f[] { m });
        }
        
        public final g w(final g g) {
            if (((g)this).j()) {
                return g;
            }
            if (g.j()) {
                return this.v();
            }
            final pl2.d a = ((g)this).a;
            final f b = ((g)this).b;
            if (b.i()) {
                return g;
            }
            if (a.f != 6) {
                return this.v().a(g);
            }
            final f b2 = g.b;
            final f f = g.d[0];
            if (b2.i() || !f.h()) {
                return this.v().a(g);
            }
            final f c = ((g)this).c;
            final f f2 = ((g)this).d[0];
            final f c2 = g.c;
            final f o = b.o();
            final f o2 = c.o();
            final f o3 = f2.o();
            final f a2 = a.b.j(o3).a(o2).a(c.j(f2));
            final f b3 = c2.b();
            final f l = a.b.a(b3).j(o3).a(o2).l(a2, o, o3);
            final f j = b2.j(o3);
            final f o4 = j.a(a2).o();
            if (o4.i()) {
                if (l.i()) {
                    return g.v();
                }
                return a.l();
            }
            else {
                if (l.i()) {
                    return (g)new d(a, l, a.c.n());
                }
                final f i = l.o().j(j);
                final f k = l.j(o4).j(o3);
                return (g)new d(a, i, l.a(o4).o().l(a2, b3, k), new f[] { k });
            }
        }
    }
    
    public static final class e extends g$c
    {
        public e(final pl2.d d, final f f, final f f2) {
            super(d, f, f2);
        }
        
        public e(final pl2.d d, final f f, final f f2, final f[] array) {
            super(d, f, f2, array);
        }
        
        public static f A(final f f) {
            return f.a(f).a(f);
        }
        
        public static f y(f a) {
            a = a.a(a);
            return a.a(a);
        }
        
        public final e B(final boolean b) {
            final f b2 = ((g)this).b;
            final f c = ((g)this).c;
            final f f = ((g)this).d[0];
            final f z = this.z();
            final f a = A(b2.o()).a(z);
            f f2 = c.a(c);
            final f j = f2.j(c);
            final f i = b2.j(j);
            final f a2 = i.a(i);
            final f r = a.o().r(a2.a(a2));
            final f o = j.o();
            final f a3 = o.a(o);
            final f r2 = a.j(a2.r(r)).r(a3);
            f a4;
            if (b) {
                final f k = a3.j(z);
                a4 = k.a(k);
            }
            else {
                a4 = null;
            }
            if (!f.h()) {
                f2 = f2.j(f);
            }
            return new e(((g)this).a, r, r2, new f[] { f2, a4 });
        }
        
        public final g a(final g g) {
            if (((g)this).j()) {
                return g;
            }
            if (g.j()) {
                return (g)this;
            }
            if (this == g) {
                return this.v();
            }
            final pl2.d a = ((g)this).a;
            final int f = a.f;
            f f2 = ((g)this).b;
            f f3 = ((g)this).c;
            f f4 = g.b;
            f f5 = g.c;
            if (f != 0) {
                if (f != 1) {
                    if (f != 2 && f != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    final f f6 = ((g)this).d[0];
                    final f f7 = g.d[0];
                    final boolean h = f6.h();
                    f r3 = null;
                    f r4 = null;
                    f l = null;
                    f f10 = null;
                    Label_0519: {
                        if (!h && f6.equals(f7)) {
                            final f r = f2.r(f4);
                            final f r2 = f3.r(f5);
                            if (r.i()) {
                                if (r2.i()) {
                                    return this.v();
                                }
                                return a.l();
                            }
                            else {
                                final f o = r.o();
                                final f j = f2.j(o);
                                final f i = f4.j(o);
                                final f k = j.r(i).j(f3);
                                r3 = r2.o().r(j).r(i);
                                r4 = j.r(r3).j(r2).r(k);
                                l = r.j(f6);
                            }
                        }
                        else {
                            if (!h) {
                                final f o2 = f6.o();
                                f4 = o2.j(f4);
                                f5 = o2.j(f6).j(f5);
                            }
                            final boolean h2 = f7.h();
                            if (!h2) {
                                final f o3 = f7.o();
                                f2 = o3.j(f2);
                                f3 = o3.j(f7).j(f3);
                            }
                            final f r5 = f2.r(f4);
                            final f r6 = f3.r(f5);
                            if (r5.i()) {
                                if (r6.i()) {
                                    return this.v();
                                }
                                return a.l();
                            }
                            else {
                                final f o4 = r5.o();
                                final f m = o4.j(r5);
                                final f j2 = o4.j(f2);
                                final f r7 = r6.o().a(m).r(j2.a(j2));
                                final f k2 = j2.r(r7).k(r6, m, f3);
                                f f8;
                                if (!h) {
                                    f8 = r5.j(f6);
                                }
                                else {
                                    f8 = r5;
                                }
                                if (!h2) {
                                    f8 = f8.j(f7);
                                }
                                if (f8 == r5) {
                                    final f f9 = r7;
                                    l = f8;
                                    r4 = k2;
                                    r3 = f9;
                                    f10 = o4;
                                    break Label_0519;
                                }
                                final f f11 = r7;
                                l = f8;
                                r4 = k2;
                                r3 = f11;
                            }
                        }
                        f10 = null;
                    }
                    f[] array;
                    if (f == 4) {
                        array = new f[] { l, this.x(l, f10) };
                    }
                    else {
                        array = new f[] { l };
                    }
                    return (g)new e(a, r3, r4, array);
                }
                else {
                    final f f12 = ((g)this).d[0];
                    f j3 = g.d[0];
                    final boolean h3 = f12.h();
                    final boolean h4 = j3.h();
                    if (!h3) {
                        f5 = f5.j(f12);
                    }
                    if (!h4) {
                        f3 = f3.j(j3);
                    }
                    final f r8 = f5.r(f3);
                    if (!h3) {
                        f4 = f4.j(f12);
                    }
                    if (!h4) {
                        f2 = f2.j(j3);
                    }
                    final f r9 = f4.r(f2);
                    if (!r9.i()) {
                        if (!h3) {
                            if (h4) {
                                j3 = f12;
                            }
                            else {
                                j3 = f12.j(j3);
                            }
                        }
                        final f o5 = r9.o();
                        final f j4 = o5.j(r9);
                        final f j5 = o5.j(f2);
                        final f r10 = r8.o().j(j3).r(j4).r(j5.a(j5));
                        return (g)new e(a, r9.j(r10), j5.r(r10).k(r8, f3, j4), new f[] { j4.j(j3) });
                    }
                    if (r8.i()) {
                        return this.v();
                    }
                    return a.l();
                }
            }
            else {
                final f r11 = f4.r(f2);
                final f r12 = f5.r(f3);
                if (!r11.i()) {
                    final f d = r12.d(r11);
                    final f r13 = d.o().r(f2).r(f4);
                    return (g)new e(a, r13, d.j(f2.r(r13)).r(f3));
                }
                if (r12.i()) {
                    return this.v();
                }
                return a.l();
            }
        }
        
        public final f h() {
            return super.h();
        }
        
        public final g l() {
            if (((g)this).j()) {
                return (g)this;
            }
            final pl2.d a = ((g)this).a;
            if (a.f != 0) {
                return (g)new e(a, ((g)this).b, ((g)this).c.m(), ((g)this).d);
            }
            return (g)new e(a, ((g)this).b, ((g)this).c.m());
        }
        
        public final g t() {
            if (((g)this).j()) {
                return (g)this;
            }
            final f c = ((g)this).c;
            if (c.i()) {
                return (g)this;
            }
            final pl2.d a = ((g)this).a;
            final int f = a.f;
            if (f != 0) {
                if (f != 4) {
                    return this.v().a((g)this);
                }
                return this.B(false).a((g)this);
            }
            else {
                final f b = ((g)this).b;
                final f a2 = c.a(c);
                final f o = a2.o();
                final f a3 = A(b.o()).a(((g)this).a.b);
                final f r = b.a(b).a(b).j(o).r(a3.o());
                if (r.i()) {
                    return ((g)this).a.l();
                }
                final f g = r.j(a2).g();
                final f j = r.j(g).j(a3);
                final f r2 = o.o().j(g).r(j);
                final f a4 = r2.r(j).j(j.a(r2)).a(b);
                return (g)new e(a, a4, b.r(a4).j(r2).r(c));
            }
        }
        
        public final g u(final int n) {
            if (n < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            }
            if (n == 0 || ((g)this).j()) {
                return (g)this;
            }
            if (n == 1) {
                return this.v();
            }
            final pl2.d a = ((g)this).a;
            final f c = ((g)this).c;
            if (c.i()) {
                return a.l();
            }
            final int f = a.f;
            final f b = a.b;
            final f b2 = ((g)this).b;
            final f[] d = ((g)this).d;
            f j;
            if (d.length < 1) {
                j = a.j(pl2.b.b);
            }
            else {
                j = d[0];
            }
            f i = c;
            f f2 = b;
            f k = b2;
            Label_0232: {
                if (!j.h()) {
                    i = c;
                    f2 = b;
                    k = b2;
                    if (f != 0) {
                        f o;
                        if (f != 1) {
                            if (f != 2) {
                                if (f == 4) {
                                    f2 = this.z();
                                    i = c;
                                    k = b2;
                                    break Label_0232;
                                }
                                throw new IllegalStateException("unsupported coordinate system");
                            }
                            else {
                                o = null;
                                i = c;
                                k = b2;
                            }
                        }
                        else {
                            o = j.o();
                            k = b2.j(j);
                            i = c.j(o);
                        }
                        f2 = this.x(j, o);
                    }
                }
            }
            int l = 0;
            f r = k;
            f f3 = f2;
            f r2 = i;
            while (l < n) {
                if (r2.i()) {
                    return a.l();
                }
                final f a2 = A(r.o());
                final f a3 = r2.a(r2);
                final f m = a3.j(r2);
                final f j2 = r.j(m);
                final f a4 = j2.a(j2);
                final f o2 = m.o();
                final f a5 = o2.a(o2);
                f a6 = f3;
                f a7 = a2;
                if (!f3.i()) {
                    a7 = a2.a(f3);
                    final f j3 = a5.j(f3);
                    a6 = j3.a(j3);
                }
                r = a7.o().r(a4.a(a4));
                r2 = a7.j(a4.r(r)).r(a5);
                f j4;
                if (j.h()) {
                    j4 = a3;
                }
                else {
                    j4 = a3.j(j);
                }
                ++l;
                f3 = a6;
                j = j4;
            }
            if (f == 0) {
                final f g = j.g();
                final f o3 = g.o();
                return (g)new e(a, r.j(o3), r2.j(o3.j(g)));
            }
            if (f == 1) {
                return (g)new e(a, r.j(j), r2, new f[] { j.j(j.o()) });
            }
            if (f == 2) {
                return (g)new e(a, r, r2, new f[] { j });
            }
            if (f == 4) {
                return (g)new e(a, r, r2, new f[] { j, f3 });
            }
            throw new IllegalStateException("unsupported coordinate system");
        }
        
        public final g v() {
            if (((g)this).j()) {
                return (g)this;
            }
            final pl2.d a = ((g)this).a;
            final f c = ((g)this).c;
            if (c.i()) {
                return a.l();
            }
            final int f = a.f;
            final f b = ((g)this).b;
            if (f == 0) {
                final f d = A(b.o()).a(((g)this).a.b).d(c.a(c));
                final f r = d.o().r(b.a(b));
                return (g)new e(a, r, d.j(b.r(r)).r(c));
            }
            if (f == 1) {
                final f f2 = ((g)this).d[0];
                final boolean h = f2.h();
                f f4;
                final f f3 = f4 = a.b;
                if (!f3.i()) {
                    f4 = f3;
                    if (!h) {
                        f4 = f3.j(f2.o());
                    }
                }
                final f a2 = f4.a(A(b.o()));
                f j;
                if (h) {
                    j = c;
                }
                else {
                    j = c.j(f2);
                }
                f f5;
                if (h) {
                    f5 = c.o();
                }
                else {
                    f5 = j.j(c);
                }
                final f y = y(b.j(f5));
                final f r2 = a2.o().r(y.a(y));
                final f a3 = j.a(j);
                final f i = r2.j(a3);
                final f a4 = f5.a(f5);
                final f k = y.r(r2).j(a2);
                final f o = a4.o();
                final f r3 = k.r(o.a(o));
                f f6;
                if (h) {
                    f6 = a4.a(a4);
                }
                else {
                    f6 = a3.o();
                }
                return (g)new e(a, i, r3, new f[] { f6.a(f6).j(j) });
            }
            if (f == 2) {
                final f f7 = ((g)this).d[0];
                final boolean h2 = f7.h();
                final f o2 = c.o();
                final f o3 = o2.o();
                f f8 = a.b;
                final f m = f8.m();
                f f9 = null;
                f f10;
                if (m.t().equals(BigInteger.valueOf(3L))) {
                    f o4;
                    if (h2) {
                        o4 = f7;
                    }
                    else {
                        o4 = f7.o();
                    }
                    f9 = A(b.a(o4).j(b.r(o4)));
                    f10 = o2.j(b);
                }
                else {
                    final f a5 = A(b.o());
                    Label_0268: {
                        if (!h2) {
                            if (f8.i()) {
                                f9 = a5;
                                break Label_0268;
                            }
                            final f o5 = f7.o().o();
                            if (m.c() < f8.c()) {
                                f9 = a5.r(o5.j(m));
                                break Label_0268;
                            }
                            f8 = o5.j(f8);
                        }
                        f9 = a5.a(f8);
                    }
                    f10 = b.j(o2);
                }
                final f y2 = y(f10);
                final f r4 = f9.o().r(y2.a(y2));
                final f r5 = y2.r(r4).j(f9).r(y(o3.a(o3)));
                f f11 = c.a(c);
                if (!h2) {
                    f11 = f11.j(f7);
                }
                return (g)new e(a, r4, r5, new f[] { f11 });
            }
            if (f == 4) {
                return (g)this.B(true);
            }
            throw new IllegalStateException("unsupported coordinate system");
        }
        
        public final g w(final g g) {
            if (this == g) {
                return this.t();
            }
            if (((g)this).j()) {
                return g;
            }
            if (g.j()) {
                return this.v();
            }
            final f c = ((g)this).c;
            if (c.i()) {
                return g;
            }
            final pl2.d a = ((g)this).a;
            final int f = a.f;
            if (f != 0) {
                if (f != 4) {
                    return this.v().a(g);
                }
                return this.B(false).a(g);
            }
            else {
                final f b = ((g)this).b;
                final f b2 = g.b;
                final f c2 = g.c;
                final f r = b2.r(b);
                final f r2 = c2.r(c);
                if (r.i()) {
                    if (r2.i()) {
                        return this.t();
                    }
                    return (g)this;
                }
                else {
                    final f o = r.o();
                    final f r3 = o.j(b.a(b).a(b2)).r(r2.o());
                    if (r3.i()) {
                        return a.l();
                    }
                    final f g2 = r3.j(r).g();
                    final f j = r3.j(g2).j(r2);
                    final f r4 = c.a(c).j(o).j(r).j(g2).r(j);
                    final f a2 = r4.r(j).j(j.a(r4)).a(b2);
                    return (g)new e(a, a2, b.r(a2).j(r4).r(c));
                }
            }
        }
        
        public final f x(f f, f m) {
            final f b = ((g)this).a.b;
            if (!b.i() && !f.h()) {
                f o;
                if ((o = m) == null) {
                    o = f.o();
                }
                f = o.o();
                m = b.m();
                if (m.c() < b.c()) {
                    f = f.j(m).m();
                }
                else {
                    f = f.j(b);
                }
                return f;
            }
            return b;
        }
        
        public final f z() {
            final f[] d = ((g)this).d;
            f x;
            if ((x = d[1]) == null) {
                x = this.x(d[0], null);
                d[1] = x;
            }
            return x;
        }
    }
}
