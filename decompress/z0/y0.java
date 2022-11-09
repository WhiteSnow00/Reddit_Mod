// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import kotlin.collections.EmptyList;
import java.util.Collection;
import java.util.List;
import androidx.compose.runtime.ComposerKt;
import qg2.j;
import kotlin.collections.CollectionsKt___CollectionsKt;
import at1.a;
import ah2.f;
import java.util.ArrayList;

public final class y0
{
    public final x0 a;
    public int[] b;
    public Object[] c;
    public ArrayList<b> d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final w o;
    public final w p;
    public final w q;
    public int r;
    public int s;
    public boolean t;
    public m0 u;
    
    static {
        new a();
    }
    
    public y0(final x0 a) {
        ah2.f.f((Object)a, "table");
        this.a = a;
        final int[] f = a.f;
        this.b = f;
        final Object[] h = a.h;
        this.c = h;
        this.d = a.m;
        final int g = a.g;
        this.e = g;
        this.f = f.length / 5 - g;
        this.g = g;
        final int i = a.i;
        this.j = i;
        this.k = h.length - i;
        this.l = g;
        this.o = new w(0);
        this.p = new w(0);
        this.q = new w(0);
        this.s = -1;
    }
    
    public final void A() {
        final m0 u = this.u;
        if (u != null) {
            while (u.a.isEmpty() ^ true) {
                final int d = u.d();
                final int n = this.n(d);
                int n2 = d + 1;
                final int o = this.o(d);
                int n3;
                boolean b;
                while (true) {
                    n3 = 0;
                    if (n2 >= o + d) {
                        b = false;
                        break;
                    }
                    if ((this.b[this.n(n2) * 5 + 1] & 0xC000000) != 0x0) {
                        b = true;
                        break;
                    }
                    n2 += this.o(n2);
                }
                int n4 = n3;
                if (at1.a.p(n, this.b) != b) {
                    n4 = 1;
                }
                if (n4 != 0) {
                    final int[] b2 = this.b;
                    final int n5 = n * 5 + 1;
                    if (b) {
                        b2[n5] |= 0x4000000;
                    }
                    else {
                        b2[n5] &= 0xFBFFFFFF;
                    }
                    final int y = this.y(d);
                    if (y < 0) {
                        continue;
                    }
                    u.a(y);
                }
            }
        }
    }
    
    public final boolean B() {
        if (this.m == 0) {
            final int r = this.r;
            final int h = this.h;
            final int f = this.F();
            final m0 u = this.u;
            if (u != null) {
                while ((u.a.isEmpty() ^ true) && ((Number)CollectionsKt___CollectionsKt.p1(u.a)).intValue() >= r) {
                    u.d();
                }
            }
            final boolean c = this.C(r, this.r - r);
            this.D(h, this.h - h, r - 1);
            this.r = r;
            this.h = h;
            this.n -= f;
            return c;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }
    
    public final boolean C(int g, int s) {
        boolean b = false;
        final int n = 0;
        if (s > 0) {
            final ArrayList<b> d = this.d;
            this.u(g);
            if (d.isEmpty() ^ true) {
                final int f = this.f;
                final int n2 = s + g;
                final int u = at1.a.u((ArrayList)this.d, n2, this.b.length / 5 - f);
                int i;
                if ((i = u) >= this.d.size()) {
                    i = u - 1;
                }
                int n3 = i + 1;
                int n4 = 0;
                while (i >= 0) {
                    final b value = this.d.get(i);
                    ah2.f.e((Object)value, "anchors[index]");
                    final b b2 = value;
                    final int c = this.c(b2);
                    if (c < g) {
                        break;
                    }
                    int n5 = n4;
                    if (c < n2) {
                        b2.a = Integer.MIN_VALUE;
                        if ((n5 = n4) == 0) {
                            n5 = i + 1;
                        }
                        n3 = i;
                    }
                    --i;
                    n4 = n5;
                }
                final boolean b3 = b = (n3 < n4);
                if (b3) {
                    this.d.subList(n3, n4).clear();
                    b = b3;
                }
            }
            else {
                b = false;
            }
            this.e = g;
            this.f += s;
            final int l = this.l;
            if (l > g) {
                this.l = Math.max(g, l - s);
            }
            g = this.g;
            if (g >= this.e) {
                this.g = g - s;
            }
            s = this.s;
            g = n;
            if (s >= 0) {
                final int[] b4 = this.b;
                g = n;
                if (at1.a.p(this.n(s), b4)) {
                    g = 1;
                }
            }
            if (g != 0) {
                this.M(this.s);
            }
        }
        return b;
    }
    
    public final void D(final int j, final int n, int i) {
        if (n > 0) {
            final int k = this.k;
            final int n2 = j + n;
            this.v(n2, i);
            this.j = j;
            this.k = k + n;
            j.q1(j, n2, this.c);
            i = this.i;
            if (i >= j) {
                this.i = i - n;
            }
        }
    }
    
    public final Object E(int h, final Object o) {
        final int i = this.I(this.n(this.r), this.b);
        final int[] b = this.b;
        final int r = this.r;
        boolean b2 = true;
        final int g = this.g(this.n(r + 1), b);
        final int n = i + h;
        if (n < i || n >= g) {
            b2 = false;
        }
        if (b2) {
            h = this.h(n);
            final Object[] c = this.c;
            final Object o2 = c[h];
            c[h] = o;
            return o2;
        }
        final StringBuilder p2 = d.p("Write to an invalid slot index ", h, " for group ");
        p2.append(this.r);
        ComposerKt.c(p2.toString().toString());
        throw null;
    }
    
    public final int F() {
        final int n = this.n(this.r);
        final int r = at1.a.q(n, this.b) + this.r;
        this.r = r;
        this.h = this.g(this.n(r), this.b);
        int v;
        if (at1.a.t(n, this.b)) {
            v = 1;
        }
        else {
            v = at1.a.v(n, this.b);
        }
        return v;
    }
    
    public final void G() {
        final int g = this.g;
        this.r = g;
        this.h = this.g(this.n(g), this.b);
    }
    
    public final Object H(int n, int n2) {
        final int i = this.I(this.n(n), this.b);
        final int[] b = this.b;
        final int n3 = 1;
        n = this.g(this.n(n + 1), b);
        n2 += i;
        if (i <= n2 && n2 < n) {
            n = n3;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            return d$a.a;
        }
        n = this.h(n2);
        return this.c[n];
    }
    
    public final int I(int n, final int[] array) {
        if (n >= this.b.length / 5) {
            n = this.c.length - this.k;
        }
        else {
            final int y = at1.a.y(n, array);
            final int k = this.k;
            final int length = this.c.length;
            if ((n = y) < 0) {
                n = length - k + y + 1;
            }
        }
        return n;
    }
    
    public final void J() {
        if (this.m == 0) {
            final d$a$a a = d$a.a;
            this.K(a, 0, a, false);
            return;
        }
        throw new IllegalArgumentException("Key must be supplied when inserting".toString());
    }
    
    public final void K(final Object o, int g, final Object o2, final boolean b) {
        final int m = this.m;
        int n = 1;
        final boolean b2 = m > 0;
        this.q.d(this.n);
        if (b2) {
            this.q(1);
            final int r = this.r;
            final int n2 = this.n(r);
            final d$a$a a = d$a.a;
            int n3;
            if (o != a) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            if (b || o2 == a) {
                n = 0;
            }
            final int[] b3 = this.b;
            final int s = this.s;
            final int h = this.h;
            int n4;
            if (b) {
                n4 = 1073741824;
            }
            else {
                n4 = 0;
            }
            int n5;
            if (n3 != 0) {
                n5 = 536870912;
            }
            else {
                n5 = 0;
            }
            int n6;
            if (n != 0) {
                n6 = 268435456;
            }
            else {
                n6 = 0;
            }
            final int n7 = n2 * 5;
            b3[n7 + 0] = g;
            b3[n7 + 1] = (n4 | n5 | n6);
            b3[n7 + 2] = s;
            b3[n7 + 3] = 0;
            b3[n7 + 4] = h;
            this.i = h;
            g = (b ? 1 : 0) + n3 + n;
            if (g > 0) {
                this.r(g, r);
                final Object[] c = this.c;
                final int n8 = g = this.h;
                if ((b ? 1 : 0) != 0) {
                    c[n8] = o2;
                    g = n8 + 1;
                }
                int n9 = g;
                if (n3 != 0) {
                    c[g] = o;
                    n9 = g + 1;
                }
                g = n9;
                if (n != 0) {
                    c[n9] = o2;
                    g = n9 + 1;
                }
                this.h = g;
            }
            this.n = 0;
            g = r + 1;
            this.s = r;
            this.r = g;
        }
        else {
            g = this.s;
            this.o.d(g);
            this.p.d(this.b.length / 5 - this.f - this.g);
            final int r2 = this.r;
            g = this.n(r2);
            if (!ah2.f.a(o2, (Object)d$a.a)) {
                if ((b ? 1 : 0) != 0) {
                    this.N(this.r, o2);
                }
                else {
                    this.L(o2);
                }
            }
            this.h = this.I(g, this.b);
            this.i = this.g(this.n(this.r + 1), this.b);
            this.n = at1.a.v(g, this.b);
            this.s = r2;
            this.r = r2 + 1;
            g = r2 + at1.a.q(g, this.b);
        }
        this.g = g;
    }
    
    public final void L(final Object o) {
        final int n = this.n(this.r);
        if (at1.a.r(n, this.b)) {
            this.c[this.h(this.d(n, this.b))] = o;
            return;
        }
        ComposerKt.c("Updating the data of a group that was not created with a data slot".toString());
        throw null;
    }
    
    public final void M(final int n) {
        if (n >= 0) {
            m0 u;
            if ((u = this.u) == null) {
                u = new m0(0);
                this.u = u;
            }
            u.a(n);
        }
    }
    
    public final void N(final int n, Object o) {
        final int n2 = this.n(n);
        final int[] b = this.b;
        if (n2 < b.length && at1.a.t(n2, b)) {
            this.c[this.h(this.g(n2, this.b))] = o;
            return;
        }
        o = new StringBuilder();
        ((StringBuilder)o).append("Updating the node of a group at ");
        ((StringBuilder)o).append(n);
        ((StringBuilder)o).append(" that was not created with as a node group");
        ComposerKt.c(((StringBuilder)o).toString().toString());
        throw null;
    }
    
    public final void a(int g) {
        final int n = 1;
        if (g < 0) {
            throw new IllegalArgumentException("Cannot seek backwards".toString());
        }
        if (this.m > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (g == 0) {
            return;
        }
        final int r = this.r + g;
        if (r >= this.s && r <= this.g) {
            g = n;
        }
        else {
            g = 0;
        }
        if (g != 0) {
            this.r = r;
            g = this.g(this.n(r), this.b);
            this.h = g;
            this.i = g;
            return;
        }
        final StringBuilder k = a.k("Cannot seek outside the current group (");
        k.append(this.s);
        k.append('-');
        k.append(this.g);
        k.append(')');
        ComposerKt.c(k.toString().toString());
        throw null;
    }
    
    public final b b(int n) {
        final ArrayList<b> d = this.d;
        final int f1 = at1.a.F1((ArrayList)d, n, this.m());
        b b;
        if (f1 < 0) {
            if (n > this.e) {
                n = -(this.m() - n);
            }
            b = new b(n);
            d.add(-(f1 + 1), b);
        }
        else {
            final b value = d.get(f1);
            ah2.f.e((Object)value, "get(location)");
            b = value;
        }
        return b;
    }
    
    public final int c(final b b) {
        ah2.f.f((Object)b, "anchor");
        int a;
        final int n = a = b.a;
        if (n < 0) {
            a = n + this.m();
        }
        return a;
    }
    
    public final int d(final int n, final int[] array) {
        return at1.a.g0(array[n * 5 + 1] >> 29) + this.g(n, array);
    }
    
    public final void e() {
        if (this.m++ == 0) {
            this.p.d(this.b.length / 5 - this.f - this.g);
        }
    }
    
    public final void f() {
        final int n = 1;
        this.t = true;
        if (this.o.b == 0) {
            this.u(this.m());
            this.v(this.c.length - this.k, this.e);
            this.A();
        }
        final x0 a = this.a;
        final int[] b = this.b;
        final int e = this.e;
        final Object[] c = this.c;
        final int j = this.j;
        final ArrayList<b> d = this.d;
        a.getClass();
        ah2.f.f((Object)b, "groups");
        ah2.f.f((Object)c, "slots");
        ah2.f.f((Object)d, "anchors");
        int n2;
        if (this.a == a && a.k) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            a.k = false;
            a.f = b;
            a.g = e;
            a.h = c;
            a.i = j;
            a.m = d;
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }
    
    public final int g(int n, final int[] array) {
        if (n >= this.b.length / 5) {
            n = this.c.length - this.k;
        }
        else {
            final int n2 = array[n * 5 + 4];
            final int k = this.k;
            final int length = this.c.length;
            if ((n = n2) < 0) {
                n = length - k + n2 + 1;
            }
        }
        return n;
    }
    
    public final int h(int n) {
        if (n >= this.j) {
            n += this.k;
        }
        return n;
    }
    
    public final void i() {
        final int m = this.m;
        final int n = 1;
        final int n2 = 1;
        final int n3 = 0;
        final boolean b = m > 0;
        final int r = this.r;
        final int g = this.g;
        final int s = this.s;
        final int n4 = this.n(s);
        final int n5 = this.n;
        final int n6 = r - s;
        final boolean t = at1.a.t(n4, this.b);
        if (b) {
            at1.a.z(n4, n6, this.b);
            at1.a.A(n4, n5, this.b);
            final int c = this.q.c();
            int n7;
            if (t) {
                n7 = n2;
            }
            else {
                n7 = n5;
            }
            this.n = c + n7;
            this.s = this.z(s, this.b);
        }
        else {
            int n8;
            if (r == g) {
                n8 = n;
            }
            else {
                n8 = 0;
            }
            if (n8 == 0) {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
            final int q = at1.a.q(n4, this.b);
            final int v = at1.a.v(n4, this.b);
            at1.a.z(n4, n6, this.b);
            at1.a.A(n4, n5, this.b);
            final int c2 = this.o.c();
            this.g = this.b.length / 5 - this.f - this.p.c();
            this.s = c2;
            final int z = this.z(s, this.b);
            final int c3 = this.q.c();
            this.n = c3;
            if (z == c2) {
                int n9;
                if (t) {
                    n9 = n3;
                }
                else {
                    n9 = n5 - v;
                }
                this.n = c3 + n9;
            }
            else {
                final int n10 = n6 - q;
                int n11;
                if (t) {
                    n11 = 0;
                }
                else {
                    n11 = n5 - v;
                }
                int z2 = z;
                int n12 = n11;
                int n13 = 0;
                Label_0464: {
                    if (n10 == 0) {
                        if ((n13 = n11) == 0) {
                            break Label_0464;
                        }
                        n12 = n11;
                        z2 = z;
                    }
                    while (true) {
                        n13 = n12;
                        if (z2 == 0) {
                            break;
                        }
                        n13 = n12;
                        if (z2 == c2) {
                            break;
                        }
                        if (n12 == 0) {
                            n13 = n12;
                            if (n10 == 0) {
                                break;
                            }
                        }
                        final int n14 = this.n(z2);
                        if (n10 != 0) {
                            at1.a.z(n14, at1.a.q(n14, this.b) + n10, this.b);
                        }
                        if (n12 != 0) {
                            final int[] b2 = this.b;
                            at1.a.A(n14, at1.a.v(n14, b2) + n12, b2);
                        }
                        if (at1.a.t(n14, this.b)) {
                            n12 = 0;
                        }
                        z2 = this.z(z2, this.b);
                    }
                }
                this.n += n13;
            }
        }
    }
    
    public final void j() {
        final int m = this.m;
        final int n = 1;
        if (m > 0) {
            if ((this.m = m - 1) == 0) {
                int n2;
                if (this.q.b == this.o.b) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    ComposerKt.c("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
                this.g = this.b.length / 5 - this.f - this.p.c();
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }
    
    public final void k(final int r) {
        final int m = this.m;
        final int n = 1;
        if (m <= 0) {
            final int s = this.s;
            if (s != r) {
                int n2;
                if (r >= s && r < this.g) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    throw new IllegalArgumentException(ag0.a.m("Started group at ", r, " must be a subgroup of the group at ", s).toString());
                }
                final int r2 = this.r;
                final int h = this.h;
                final int i = this.i;
                this.r = r;
                this.J();
                this.r = r2;
                this.h = h;
                this.i = i;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
    }
    
    public final void l(int n, final int n2, int i) {
        if (n >= this.e) {
            n = -(this.m() - n + 2);
        }
        while (i < n2) {
            this.b[this.n(i) * 5 + 2] = n;
            final int n3 = at1.a.q(this.n(i), this.b) + i;
            this.l(i, n3, i + 1);
            i = n3;
        }
    }
    
    public final int m() {
        return this.b.length / 5 - this.f;
    }
    
    public final int n(int n) {
        if (n >= this.e) {
            n += this.f;
        }
        return n;
    }
    
    public final int o(final int n) {
        return at1.a.q(this.n(n), this.b);
    }
    
    public final boolean p(final int n, final int n2) {
        final int s = this.s;
        final boolean b = false;
        int g = 0;
        Label_0139: {
            if (n2 == s) {
                g = this.g;
            }
            else {
                final w o = this.o;
                final int b2 = o.b;
                int n3;
                if (b2 > 0) {
                    n3 = o.c[b2 - 1];
                }
                else {
                    n3 = 0;
                }
                int n4 = 0;
                Label_0109: {
                    if (n2 <= n3) {
                        int i = 0;
                        while (true) {
                            while (i < b2) {
                                if (o.c[i] == n2) {
                                    if (i < 0) {
                                        n4 = this.o(n2);
                                        break Label_0109;
                                    }
                                    g = this.b.length / 5 - this.f - this.p.c[i];
                                    break Label_0139;
                                }
                                else {
                                    ++i;
                                }
                            }
                            i = -1;
                            continue;
                        }
                    }
                    n4 = this.o(n2);
                }
                g = n4 + n2;
            }
        }
        boolean b3 = b;
        if (n > n2) {
            b3 = b;
            if (n < g) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final void q(final int n) {
        if (n > 0) {
            final int r = this.r;
            this.u(r);
            final int e = this.e;
            final int f = this.f;
            final int[] b = this.b;
            final int n2 = b.length / 5;
            final int n3 = n2 - f;
            int j = 0;
            int n4;
            if ((n4 = f) < n) {
                final int max = Math.max(Math.max(n2 * 2, n3 + n), 32);
                final int[] b2 = new int[max * 5];
                n4 = max - n3;
                qg2.j.g1(0, 0, e * 5, b, b2);
                qg2.j.g1((e + n4) * 5, (f + e) * 5, n2 * 5, b, b2);
                this.b = b2;
            }
            final int g = this.g;
            if (g >= e) {
                this.g = g + n;
            }
            final int e2 = e + n;
            this.e = e2;
            this.f = n4 - n;
            int g2;
            if (n3 > 0) {
                g2 = this.g(this.n(r + n), this.b);
            }
            else {
                g2 = 0;
            }
            if (this.l >= e) {
                j = this.j;
            }
            final int k = this.k;
            final int length = this.c.length;
            int n5 = g2;
            if (g2 > j) {
                n5 = -(length - k - g2 + 1);
            }
            for (int i = e; i < e2; ++i) {
                this.b[i * 5 + 4] = n5;
            }
            final int l = this.l;
            if (l >= e) {
                this.l = l + n;
            }
        }
    }
    
    public final void r(final int n, int i) {
        if (n > 0) {
            this.v(this.h, i);
            final int j = this.j;
            final int k = this.k;
            if ((i = k) < n) {
                final Object[] c = this.c;
                final int length = c.length;
                final int n2 = length - k;
                final int max = Math.max(Math.max(length * 2, n2 + n), 32);
                final Object[] c2 = new Object[max];
                for (i = 0; i < max; ++i) {
                    c2[i] = null;
                }
                i = max - n2;
                qg2.j.j1(c, 0, c2, 0, j);
                qg2.j.j1(c, j + i, c2, k + j, length);
                this.c = c2;
            }
            final int l = this.i;
            if (l >= j) {
                this.i = l + n;
            }
            this.j = j + n;
            this.k = i - n;
        }
    }
    
    public final boolean s(final int n) {
        return at1.a.t(this.n(n), this.b);
    }
    
    public final void t(x0 d, int i) {
        ah2.f.f((Object)d, "table");
        if (this.m > 0) {
            if (i == 0 && this.r == 0 && this.a.g == 0) {
                final int[] b = this.b;
                final Object[] c = this.c;
                final ArrayList<b> d2 = this.d;
                final int[] f = d.f;
                final int g = d.g;
                final Object[] h = d.h;
                i = d.i;
                this.b = f;
                this.c = h;
                this.d = d.m;
                this.e = g;
                this.f = f.length / 5 - g;
                this.j = i;
                this.k = h.length - i;
                this.l = g;
                ah2.f.f((Object)b, "groups");
                ah2.f.f((Object)c, "slots");
                ah2.f.f((Object)d2, "anchors");
                d.f = b;
                d.g = 0;
                d.h = c;
                d.i = 0;
                d.m = d2;
                return;
            }
            d = (x0)d.d();
            try {
                y0.a.a((y0)d, i, this, true, true);
                return;
            }
            finally {
                ((y0)d).f();
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SlotWriter(current = ");
        k.append(this.r);
        k.append(" end=");
        k.append(this.g);
        k.append(" size = ");
        k.append(this.m());
        k.append(" gap=");
        k.append(this.e);
        k.append('-');
        k.append(this.e + this.f);
        k.append(')');
        return k.toString();
    }
    
    public final void u(final int e) {
        final int f = this.f;
        final int e2 = this.e;
        if (e2 != e) {
            final boolean empty = this.d.isEmpty();
            boolean b = true;
            if (empty ^ true) {
                final int n = this.b.length / 5 - this.f;
                if (e2 < e) {
                    for (int i = at1.a.u((ArrayList)this.d, e2, n); i < this.d.size(); ++i) {
                        final b value = this.d.get(i);
                        ah2.f.e((Object)value, "anchors[index]");
                        final b b2 = value;
                        final int a = b2.a;
                        if (a >= 0) {
                            break;
                        }
                        final int a2 = a + n;
                        if (a2 >= e) {
                            break;
                        }
                        b2.a = a2;
                    }
                }
                else {
                    for (int j = at1.a.u((ArrayList)this.d, e, n); j < this.d.size(); ++j) {
                        final b value2 = this.d.get(j);
                        ah2.f.e((Object)value2, "anchors[index]");
                        final b b3 = value2;
                        final int a3 = b3.a;
                        if (a3 < 0) {
                            break;
                        }
                        b3.a = -(n - a3);
                    }
                }
            }
            if (f > 0) {
                final int[] b4 = this.b;
                final int n2 = e * 5;
                final int n3 = f * 5;
                final int n4 = e2 * 5;
                if (e < e2) {
                    qg2.j.g1(n3 + n2, n2, n4, b4, b4);
                }
                else {
                    qg2.j.g1(n4, n4 + n3, n2 + n3, b4, b4);
                }
            }
            int k;
            if (e < (k = e2)) {
                k = e + f;
            }
            final int n5 = this.b.length / 5;
            if (k >= n5) {
                b = false;
            }
            ComposerKt.f(b);
            while (k < n5) {
                final int[] b5 = this.b;
                final int n6 = k * 5 + 2;
                final int n7 = b5[n6];
                int n8;
                if (n7 > -2) {
                    n8 = n7;
                }
                else {
                    n8 = this.m() + n7 + 2;
                }
                if (n8 >= e) {
                    n8 = -(this.m() - n8 + 2);
                }
                if (n8 != n7) {
                    this.b[n6] = n8;
                }
                final int n9 = k + 1;
                if ((k = n9) == e) {
                    k = n9 + f;
                }
            }
        }
        this.e = e;
    }
    
    public final void v(final int j, int i) {
        final int k = this.k;
        final int l = this.j;
        final int m = this.l;
        if (l != j) {
            final Object[] c = this.c;
            if (j < l) {
                j.j1(c, j + k, c, j, l);
            }
            else {
                j.j1(c, l, c, l + k, j + k);
            }
            j.q1(j, j + k, c);
        }
        final int min = Math.min(i + 1, this.m());
        if (m != min) {
            final int n = this.c.length - k;
            if (min < m) {
                i = this.n(min);
                final int n2 = this.n(m);
                final int e = this.e;
                while (i < n2) {
                    final int[] b = this.b;
                    final int n3 = i * 5 + 4;
                    final int n4 = b[n3];
                    if (n4 < 0) {
                        ComposerKt.c("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                    b[n3] = -(n - n4 + 1);
                    final int n5 = i + 1;
                    if ((i = n5) != e) {
                        continue;
                    }
                    i = n5 + this.f;
                }
            }
            else {
                i = this.n(m);
                while (i < this.n(min)) {
                    final int[] b2 = this.b;
                    final int n6 = i * 5 + 4;
                    final int n7 = b2[n6];
                    if (n7 >= 0) {
                        ComposerKt.c("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                    b2[n6] = n7 + n + 1;
                    final int n8 = i + 1;
                    if ((i = n8) != this.e) {
                        continue;
                    }
                    i = n8 + this.f;
                }
            }
            this.l = min;
        }
        this.j = j;
    }
    
    public final void w(final b b, final y0 y0) {
        ah2.f.f((Object)b, "anchor");
        final int m = y0.m;
        boolean b2 = true;
        if (m <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.m != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!b.a()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        final int n = this.c(b) + 1;
        final int r = this.r;
        if (r <= n && n < this.g) {
            int i = this.y(n);
            final int o = this.o(n);
            int v;
            if (this.s(n)) {
                v = 1;
            }
            else {
                v = at1.a.v(this.n(n), this.b);
            }
            z0.y0.a.a(this, n, y0, false, false);
            this.M(i);
            int n2;
            if (v > 0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            while (i >= r) {
                final int n3 = this.n(i);
                final int[] b3 = this.b;
                at1.a.z(n3, at1.a.q(n3, b3) - o, b3);
                int n4;
                if ((n4 = n2) != 0) {
                    if (at1.a.t(n3, this.b)) {
                        n4 = 0;
                    }
                    else {
                        final int[] b4 = this.b;
                        at1.a.A(n3, at1.a.v(n3, b4) - v, b4);
                        n4 = n2;
                    }
                }
                i = this.y(i);
                n2 = n4;
            }
            if (n2 != 0) {
                if (this.n < v) {
                    b2 = false;
                }
                ComposerKt.f(b2);
                this.n -= v;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final Object x(int n) {
        n = this.n(n);
        Object o;
        if (at1.a.t(n, this.b)) {
            o = this.c[this.h(this.g(n, this.b))];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final int y(final int n) {
        return this.z(n, this.b);
    }
    
    public final int z(int n, final int[] array) {
        n = array[this.n(n) * 5 + 2];
        if (n <= -2) {
            n = this.m() + n + 2;
        }
        return n;
    }
    
    public static final class a
    {
        public static final List a(final y0 y0, int v, final y0 y2, final boolean b, final boolean b2) {
            final int o = y0.o(v);
            final int n = v + o;
            final int g = y0.g(y0.n(v), y0.b);
            final int g2 = y0.g(y0.n(n), y0.b);
            final int n2 = g2 - g;
            final boolean b3 = v >= 0 && (y0.b[y0.n(v) * 5 + 1] & 0xC000000) != 0x0;
            y2.q(o);
            y2.r(n2, y2.r);
            if (y0.e < n) {
                y0.u(n);
            }
            if (y0.j < g2) {
                y0.v(g2, n);
            }
            final int[] b4 = y2.b;
            final int r = y2.r;
            final int[] b5 = y0.b;
            final int n3 = r * 5;
            j.g1(n3, v * 5, n * 5, b5, b4);
            final Object[] c = y2.c;
            final int h = y2.h;
            j.j1(y0.c, h, c, g, g2);
            final int s = y2.s;
            b4[n3 + 2] = s;
            final int n4 = r - v;
            final int r2 = r + o;
            final int g3 = y2.g(r, b4);
            int l = y2.l;
            final int k = y2.k;
            final int length = c.length;
            int i = r;
            final int n5 = h;
            while (i < r2) {
                if (i != r) {
                    final int n6 = i * 5 + 2;
                    b4[n6] += n4;
                }
                final int n7 = y2.g(i, b4) + (h - g3);
                int j;
                if (l < i) {
                    j = 0;
                }
                else {
                    j = y2.j;
                }
                int n8 = n7;
                if (n7 > j) {
                    n8 = -(length - k - n7 + 1);
                }
                b4[i * 5 + 4] = n8;
                int n9;
                if (i == (n9 = l)) {
                    n9 = l + 1;
                }
                ++i;
                l = n9;
            }
            y2.l = l;
            final int u = at1.a.u((ArrayList)y0.d, v, y0.m());
            final int u2 = at1.a.u((ArrayList)y0.d, n, y0.m());
            Object instance;
            if (u < u2) {
                final ArrayList<b> d = y0.d;
                instance = new ArrayList<b>(u2 - u);
                for (int n10 = u; n10 < u2; ++n10) {
                    final b value = d.get(n10);
                    f.e((Object)value, "sourceAnchors[anchorIndex]");
                    final b b6 = value;
                    b6.a += n4;
                    ((ArrayList<b>)instance).add(b6);
                }
                y2.d.addAll(at1.a.u((ArrayList)y2.d, y2.r, y2.m()), (Collection<? extends b>)instance);
                d.subList(u, u2).clear();
            }
            else {
                instance = EmptyList.INSTANCE;
            }
            final int y3 = y0.y(v);
            boolean b8;
            if (b) {
                final boolean b7 = y3 >= 0;
                if (b7) {
                    y0.J();
                    y0.a(y3 - y0.r);
                    y0.J();
                }
                y0.a(v - y0.r);
                b8 = y0.B();
                if (b7) {
                    y0.G();
                    y0.i();
                    y0.G();
                    y0.i();
                }
            }
            else {
                b8 = y0.C(v, o);
                y0.D(g, n2, v - 1);
            }
            if (b8 ^ true) {
                final int n11 = y2.n;
                if (at1.a.t(r, b4)) {
                    v = 1;
                }
                else {
                    v = at1.a.v(r, b4);
                }
                y2.n = n11 + v;
                if (b2) {
                    y2.r = r2;
                    y2.h = n5 + n2;
                }
                if (b3) {
                    y2.M(s);
                }
                return (List)instance;
            }
            ComposerKt.c("Unexpectedly removed anchors".toString());
            throw null;
        }
    }
}
