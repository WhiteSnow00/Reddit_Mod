// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import kotlin.collections.EmptyList;
import java.util.Collection;
import java.util.List;
import android.support.v4.media.a;
import dg2.j;
import androidx.compose.runtime.ComposerKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cg.d;
import ng2.e;
import java.util.ArrayList;

public final class x0
{
    public final v0 a;
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
    public final v o;
    public final v p;
    public final v q;
    public int r;
    public int s;
    public boolean t;
    public wc.b u;
    
    static {
        new a();
    }
    
    public x0(final v0 a) {
        ng2.e.f((Object)a, "table");
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
        this.o = new v();
        this.p = new v();
        this.q = new v();
        this.s = -1;
    }
    
    public static void t(final x0 x0) {
        final int s = x0.s;
        final int n = x0.n(s);
        final int[] b = x0.b;
        boolean b2 = true;
        final int n2 = n * 5 + 1;
        final int n3 = b[n2];
        if ((n3 & 0x8000000) == 0x0) {
            b2 = false;
        }
        if (!b2) {
            b[n2] = (n3 | 0x8000000);
            if (!d.X(n, b)) {
                x0.O(x0.z(s));
            }
        }
    }
    
    public final int A(int n, final int[] array) {
        n = array[this.n(n) * 5 + 2];
        if (n <= -2) {
            n = this.m() + n + 2;
        }
        return n;
    }
    
    public final void B() {
        final wc.b u = this.u;
        if (u != null) {
            while (u.f.isEmpty() ^ true) {
                final int i = u.i();
                final int n = this.n(i);
                int n2 = i + 1;
                final int o = this.o(i);
                int n3;
                boolean b;
                while (true) {
                    n3 = 0;
                    if (n2 >= o + i) {
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
                if (cg.d.X(n, this.b) != b) {
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
                    final int z = this.z(i);
                    if (z < 0) {
                        continue;
                    }
                    u.b(z);
                }
            }
        }
    }
    
    public final boolean C() {
        if (this.m == 0) {
            final int r = this.r;
            final int h = this.h;
            final int g = this.G();
            final wc.b u = this.u;
            if (u != null) {
                while ((u.f.isEmpty() ^ true) && ((Number)CollectionsKt___CollectionsKt.S4(u.f)).intValue() >= r) {
                    u.i();
                }
            }
            final boolean d = this.D(r, this.r - r);
            this.E(h, this.h - h, r - 1);
            this.r = r;
            this.h = h;
            this.n -= g;
            return d;
        }
        ComposerKt.c("Cannot remove group while inserting".toString());
        throw null;
    }
    
    public final boolean D(int g, int s) {
        boolean b = false;
        final int n = 0;
        if (s > 0) {
            final ArrayList<b> d = this.d;
            this.v(g);
            if (d.isEmpty() ^ true) {
                final int f = this.f;
                final int n2 = s + g;
                final int j0 = cg.d.j0((ArrayList)this.d, n2, this.b.length / 5 - f);
                int i;
                if ((i = j0) >= this.d.size()) {
                    i = j0 - 1;
                }
                int n3 = i + 1;
                int n4 = 0;
                while (i >= 0) {
                    final b value = this.d.get(i);
                    ng2.e.e((Object)value, "anchors[index]");
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
                if (cg.d.X(this.n(s), b4)) {
                    g = 1;
                }
            }
            if (g != 0) {
                this.O(this.s);
            }
        }
        return b;
    }
    
    public final void E(final int j, final int n, int i) {
        if (n > 0) {
            final int k = this.k;
            final int n2 = j + n;
            this.w(n2, i);
            this.j = j;
            this.k = k + n;
            j.V1(j, n2, this.c);
            i = this.i;
            if (i >= j) {
                this.i = i - n;
            }
        }
    }
    
    public final Object F(int h, final Object o) {
        final int j = this.J(this.n(this.r), this.b);
        final int[] b = this.b;
        final int r = this.r;
        boolean b2 = true;
        final int g = this.g(this.n(r + 1), b);
        final int n = j + h;
        if (n < j || n >= g) {
            b2 = false;
        }
        if (b2) {
            h = this.h(n);
            final Object[] c = this.c;
            final Object o2 = c[h];
            c[h] = o;
            return o2;
        }
        final StringBuilder o3 = android.support.v4.media.a.o("Write to an invalid slot index ", h, " for group ");
        o3.append(this.r);
        ComposerKt.c(o3.toString().toString());
        throw null;
    }
    
    public final int G() {
        final int n = this.n(this.r);
        final int r = cg.d.d0(n, this.b) + this.r;
        this.r = r;
        this.h = this.g(this.n(r), this.b);
        int k0;
        if (cg.d.h0(n, this.b)) {
            k0 = 1;
        }
        else {
            k0 = cg.d.k0(n, this.b);
        }
        return k0;
    }
    
    public final void H() {
        final int g = this.g;
        this.r = g;
        this.h = this.g(this.n(g), this.b);
    }
    
    public final Object I(int n, int n2) {
        final int j = this.J(this.n(n), this.b);
        final int[] b = this.b;
        final int n3 = 1;
        n = this.g(this.n(n + 1), b);
        n2 += j;
        if (j <= n2 && n2 < n) {
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
    
    public final int J(int n, final int[] array) {
        if (n >= this.b.length / 5) {
            n = this.c.length - this.k;
        }
        else {
            final int r0 = cg.d.r0(n, array);
            final int k = this.k;
            final int length = this.c.length;
            if ((n = r0) < 0) {
                n = length - k + r0 + 1;
            }
        }
        return n;
    }
    
    public final void K() {
        if (this.m == 0) {
            final d$a$a a = d$a.a;
            this.L(a, 0, a, false);
            return;
        }
        ComposerKt.c("Key must be supplied when inserting".toString());
        throw null;
    }
    
    public final void L(final Object o, int n, final Object o2, final boolean b) {
        final int m = this.m;
        final int n2 = 1;
        final boolean b2 = m > 0;
        this.q.b(this.n);
        if (b2) {
            this.q(1);
            final int r = this.r;
            final int n3 = this.n(r);
            final d$a$a a = d$a.a;
            int n4;
            if (o != a) {
                n4 = 1;
            }
            else {
                n4 = 0;
            }
            int n5;
            if (!b && o2 != a) {
                n5 = n2;
            }
            else {
                n5 = 0;
            }
            final int[] b3 = this.b;
            final int s = this.s;
            final int h = this.h;
            int n6;
            if (b) {
                n6 = 1073741824;
            }
            else {
                n6 = 0;
            }
            int n7;
            if (n4 != 0) {
                n7 = 536870912;
            }
            else {
                n7 = 0;
            }
            int n8;
            if (n5 != 0) {
                n8 = 268435456;
            }
            else {
                n8 = 0;
            }
            final int n9 = n3 * 5;
            b3[n9 + 0] = n;
            b3[n9 + 1] = (n6 | n7 | n8);
            b3[n9 + 2] = s;
            b3[n9 + 3] = 0;
            b3[n9 + 4] = h;
            this.i = h;
            n = (b ? 1 : 0) + n4 + n5;
            if (n > 0) {
                this.r(n, r);
                final Object[] c = this.c;
                final int n10 = n = this.h;
                if ((b ? 1 : 0) != 0) {
                    c[n10] = o2;
                    n = n10 + 1;
                }
                int n11 = n;
                if (n4 != 0) {
                    c[n] = o;
                    n11 = n + 1;
                }
                n = n11;
                if (n5 != 0) {
                    c[n11] = o2;
                    n = n11 + 1;
                }
                this.h = n;
            }
            this.n = 0;
            n = r + 1;
            this.s = r;
            this.r = n;
        }
        else {
            n = this.s;
            this.o.b(n);
            this.p.b(this.b.length / 5 - this.f - this.g);
            n = this.r;
            final int n12 = this.n(n);
            if (!ng2.e.a(o2, (Object)d$a.a)) {
                if ((b ? 1 : 0) != 0) {
                    this.P(this.r, o2);
                }
                else {
                    this.N(o2);
                }
            }
            this.h = this.J(n12, this.b);
            this.i = this.g(this.n(this.r + 1), this.b);
            this.n = cg.d.k0(n12, this.b);
            this.s = n;
            this.r = n + 1;
            n += cg.d.d0(n12, this.b);
        }
        this.g = n;
    }
    
    public final void M(final Object o) {
        if (this.m > 0) {
            this.r(1, this.s);
        }
        final Object o2 = this.c[this.h(this.h++)];
        final int h = this.h;
        if (h <= this.i) {
            this.c[this.h(h - 1)] = o;
            return;
        }
        ComposerKt.c("Writing to an invalid slot".toString());
        throw null;
    }
    
    public final void N(final Object o) {
        final int n = this.n(this.r);
        if (cg.d.g0(n, this.b)) {
            this.c[this.h(this.d(n, this.b))] = o;
            return;
        }
        ComposerKt.c("Updating the data of a group that was not created with a data slot".toString());
        throw null;
    }
    
    public final void O(final int n) {
        if (n >= 0) {
            wc.b u;
            if ((u = this.u) == null) {
                u = new wc.b();
                this.u = u;
            }
            u.b(n);
        }
    }
    
    public final void P(final int n, Object o) {
        final int n2 = this.n(n);
        final int[] b = this.b;
        if (n2 < b.length && cg.d.h0(n2, b)) {
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
            ComposerKt.c("Cannot seek backwards".toString());
            throw null;
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
        final StringBuilder t = a.t("Cannot seek outside the current group (");
        t.append(this.s);
        t.append('-');
        t.append(this.g);
        t.append(')');
        ComposerKt.c(t.toString().toString());
        throw null;
    }
    
    public final b b(int n) {
        final ArrayList<b> d = this.d;
        final int l3 = cg.d.L3((ArrayList)d, n, this.m());
        b b;
        if (l3 < 0) {
            if (n > this.e) {
                n = -(this.m() - n);
            }
            b = new b(n);
            d.add(-(l3 + 1), b);
        }
        else {
            final b value = d.get(l3);
            ng2.e.e((Object)value, "get(location)");
            b = value;
        }
        return b;
    }
    
    public final int c(final b b) {
        ng2.e.f((Object)b, "anchor");
        int a;
        final int n = a = b.a;
        if (n < 0) {
            a = n + this.m();
        }
        return a;
    }
    
    public final int d(final int n, final int[] array) {
        return cg.d.v1(array[n * 5 + 1] >> 29) + this.g(n, array);
    }
    
    public final void e() {
        if (this.m++ == 0) {
            this.p.b(this.b.length / 5 - this.f - this.g);
        }
    }
    
    public final void f() {
        final int n = 1;
        this.t = true;
        if (this.o.f == 0) {
            this.v(this.m());
            this.w(this.c.length - this.k, this.e);
            this.B();
        }
        final v0 a = this.a;
        final int[] b = this.b;
        final int e = this.e;
        final Object[] c = this.c;
        final int j = this.j;
        final ArrayList<b> d = this.d;
        a.getClass();
        ng2.e.f((Object)b, "groups");
        ng2.e.f((Object)c, "slots");
        ng2.e.f((Object)d, "anchors");
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
        final boolean h0 = cg.d.h0(n4, this.b);
        if (b) {
            cg.d.u0(n4, n6, this.b);
            cg.d.v0(n4, n5, this.b);
            final int a = this.q.a();
            int n7;
            if (h0) {
                n7 = n2;
            }
            else {
                n7 = n5;
            }
            this.n = a + n7;
            this.s = this.A(s, this.b);
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
                ComposerKt.c("Expected to be at the end of a group".toString());
                throw null;
            }
            final int d0 = cg.d.d0(n4, this.b);
            final int k0 = cg.d.k0(n4, this.b);
            cg.d.u0(n4, n6, this.b);
            cg.d.v0(n4, n5, this.b);
            final int a2 = this.o.a();
            this.g = this.b.length / 5 - this.f - this.p.a();
            this.s = a2;
            final int a3 = this.A(s, this.b);
            final int a4 = this.q.a();
            this.n = a4;
            if (a3 == a2) {
                int n9;
                if (h0) {
                    n9 = n3;
                }
                else {
                    n9 = n5 - k0;
                }
                this.n = a4 + n9;
            }
            else {
                final int n10 = n6 - d0;
                int n11;
                if (h0) {
                    n11 = 0;
                }
                else {
                    n11 = n5 - k0;
                }
                int a5 = a3;
                int n12 = n11;
                int n13 = 0;
                Label_0453: {
                    if (n10 == 0) {
                        if ((n13 = n11) == 0) {
                            break Label_0453;
                        }
                        n12 = n11;
                        a5 = a3;
                    }
                    while (true) {
                        n13 = n12;
                        if (a5 == 0) {
                            break;
                        }
                        n13 = n12;
                        if (a5 == a2) {
                            break;
                        }
                        if (n12 == 0) {
                            n13 = n12;
                            if (n10 == 0) {
                                break;
                            }
                        }
                        final int n14 = this.n(a5);
                        if (n10 != 0) {
                            cg.d.u0(n14, cg.d.d0(n14, this.b) + n10, this.b);
                        }
                        if (n12 != 0) {
                            final int[] b2 = this.b;
                            cg.d.v0(n14, cg.d.k0(n14, b2) + n12, b2);
                        }
                        if (cg.d.h0(n14, this.b)) {
                            n12 = 0;
                        }
                        a5 = this.A(a5, this.b);
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
                if (this.q.f == this.o.f) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    ComposerKt.c("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
                this.g = this.b.length / 5 - this.f - this.p.a();
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
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Started group at ");
                    sb.append(r);
                    sb.append(" must be a subgroup of the group at ");
                    sb.append(s);
                    ComposerKt.c(sb.toString().toString());
                    throw null;
                }
                final int r2 = this.r;
                final int h = this.h;
                final int i = this.i;
                this.r = r;
                this.K();
                this.r = r2;
                this.h = h;
                this.i = i;
            }
            return;
        }
        ComposerKt.c("Cannot call ensureStarted() while inserting".toString());
        throw null;
    }
    
    public final void l(int n, final int n2, int i) {
        if (n >= this.e) {
            n = -(this.m() - n + 2);
        }
        while (i < n2) {
            this.b[this.n(i) * 5 + 2] = n;
            final int n3 = cg.d.d0(this.n(i), this.b) + i;
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
        return cg.d.d0(this.n(n), this.b);
    }
    
    public final boolean p(final int n, final int n2) {
        final int s = this.s;
        final boolean b = false;
        int g = 0;
        Label_0148: {
            if (n2 == s) {
                g = this.g;
            }
            else {
                final v o = this.o;
                final int f = o.f;
                int n3;
                if (f > 0) {
                    n3 = ((int[])o.g)[f - 1];
                }
                else {
                    n3 = 0;
                }
                int n4 = 0;
                Label_0115: {
                    if (n2 <= n3) {
                        int i = 0;
                        while (true) {
                            while (i < f) {
                                if (((int[])o.g)[i] == n2) {
                                    if (i < 0) {
                                        n4 = this.o(n2);
                                        break Label_0115;
                                    }
                                    g = this.b.length / 5 - this.f - ((int[])this.p.g)[i];
                                    break Label_0148;
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
        boolean b2 = b;
        if (n > n2) {
            b2 = b;
            if (n < g) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void q(final int n) {
        if (n > 0) {
            final int r = this.r;
            this.v(r);
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
                dg2.j.L1(0, 0, e * 5, b, b2);
                dg2.j.L1((e + n4) * 5, (f + e) * 5, n2 * 5, b, b2);
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
            this.w(this.h, i);
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
                dg2.j.O1(c, 0, c2, 0, j);
                dg2.j.O1(c, j + i, c2, k + j, length);
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
        return cg.d.h0(this.n(n), this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("SlotWriter(current = ");
        t.append(this.r);
        t.append(" end=");
        t.append(this.g);
        t.append(" size = ");
        t.append(this.m());
        t.append(" gap=");
        t.append(this.e);
        t.append('-');
        t.append(this.e + this.f);
        t.append(')');
        return t.toString();
    }
    
    public final void u(v0 g, int i) {
        ng2.e.f((Object)g, "table");
        ComposerKt.f(this.m > 0);
        if (i == 0 && this.r == 0 && this.a.g == 0) {
            final int[] b = this.b;
            final Object[] c = this.c;
            final ArrayList<b> d = this.d;
            final int[] f = g.f;
            final int g2 = g.g;
            final Object[] h = g.h;
            i = g.i;
            this.b = f;
            this.c = h;
            this.d = g.m;
            this.e = g2;
            this.f = f.length / 5 - g2;
            this.j = i;
            this.k = h.length - i;
            this.l = g2;
            ng2.e.f((Object)b, "groups");
            ng2.e.f((Object)c, "slots");
            ng2.e.f((Object)d, "anchors");
            g.f = b;
            g.g = 0;
            g.h = c;
            g.i = 0;
            g.m = d;
            return;
        }
        g = (v0)g.g();
        try {
            x0.a.a((x0)g, i, this, true, true);
        }
        finally {
            ((x0)g).f();
        }
    }
    
    public final void v(final int e) {
        final int f = this.f;
        final int e2 = this.e;
        if (e2 != e) {
            final boolean empty = this.d.isEmpty();
            boolean b = true;
            if (empty ^ true) {
                final int n = this.b.length / 5 - this.f;
                if (e2 < e) {
                    for (int i = cg.d.j0((ArrayList)this.d, e2, n); i < this.d.size(); ++i) {
                        final b value = this.d.get(i);
                        e.e((Object)value, "anchors[index]");
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
                    for (int j = cg.d.j0((ArrayList)this.d, e, n); j < this.d.size(); ++j) {
                        final b value2 = this.d.get(j);
                        e.e((Object)value2, "anchors[index]");
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
                    dg2.j.L1(n3 + n2, n2, n4, b4, b4);
                }
                else {
                    dg2.j.L1(n4, n4 + n3, n2 + n3, b4, b4);
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
    
    public final void w(final int j, int i) {
        final int k = this.k;
        final int l = this.j;
        final int m = this.l;
        if (l != j) {
            final Object[] c = this.c;
            if (j < l) {
                j.O1(c, j + k, c, j, l);
            }
            else {
                j.O1(c, l, c, l + k, j + k);
            }
            j.V1(j, j + k, c);
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
    
    public final void x(final b b, final x0 x0) {
        ng2.e.f((Object)b, "anchor");
        final int m = x0.m;
        final boolean b2 = true;
        ComposerKt.f(m > 0);
        ComposerKt.f(this.m == 0);
        ComposerKt.f(b.a());
        final int n = this.c(b) + 1;
        final int r = this.r;
        ComposerKt.f(r <= n && n < this.g);
        int i = this.z(n);
        final int o = this.o(n);
        int k0;
        if (this.s(n)) {
            k0 = 1;
        }
        else {
            k0 = cg.d.k0(this.n(n), this.b);
        }
        z0.x0.a.a(this, n, x0, false, false);
        this.O(i);
        int n2;
        if (k0 > 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        while (i >= r) {
            final int n3 = this.n(i);
            final int[] b3 = this.b;
            cg.d.u0(n3, cg.d.d0(n3, b3) - o, b3);
            int n4;
            if ((n4 = n2) != 0) {
                if (cg.d.h0(n3, this.b)) {
                    n4 = 0;
                }
                else {
                    final int[] b4 = this.b;
                    cg.d.v0(n3, cg.d.k0(n3, b4) - k0, b4);
                    n4 = n2;
                }
            }
            i = this.z(i);
            n2 = n4;
        }
        if (n2 != 0) {
            ComposerKt.f(this.n >= k0 && b2);
            this.n -= k0;
        }
    }
    
    public final Object y(int n) {
        n = this.n(n);
        Object o;
        if (cg.d.h0(n, this.b)) {
            o = this.c[this.h(this.g(n, this.b))];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final int z(final int n) {
        return this.A(n, this.b);
    }
    
    public static final class a
    {
        public static final List a(final x0 x0, int k0, final x0 x2, final boolean b, final boolean b2) {
            final int o = x0.o(k0);
            final int n = k0 + o;
            final int g = x0.g(x0.n(k0), x0.b);
            final int g2 = x0.g(x0.n(n), x0.b);
            final int n2 = g2 - g;
            final boolean b3 = k0 >= 0 && (x0.b[x0.n(k0) * 5 + 1] & 0xC000000) != 0x0;
            x2.q(o);
            x2.r(n2, x2.r);
            if (x0.e < n) {
                x0.v(n);
            }
            if (x0.j < g2) {
                x0.w(g2, n);
            }
            final int[] b4 = x2.b;
            final int r = x2.r;
            final int[] b5 = x0.b;
            final int n3 = r * 5;
            j.L1(n3, k0 * 5, n * 5, b5, b4);
            final Object[] c = x2.c;
            final int h = x2.h;
            j.O1(x0.c, h, c, g, g2);
            final int s = x2.s;
            b4[n3 + 2] = s;
            final int n4 = r - k0;
            final int r2 = r + o;
            final int g3 = x2.g(r, b4);
            int l = x2.l;
            final int i = x2.k;
            final int length = c.length;
            int j = r;
            final int n5 = h;
            while (j < r2) {
                if (j != r) {
                    final int n6 = j * 5 + 2;
                    b4[n6] += n4;
                }
                final int n7 = x2.g(j, b4) + (h - g3);
                int m;
                if (l < j) {
                    m = 0;
                }
                else {
                    m = x2.j;
                }
                int n8 = n7;
                if (n7 > m) {
                    n8 = -(length - i - n7 + 1);
                }
                b4[j * 5 + 4] = n8;
                int n9;
                if (j == (n9 = l)) {
                    n9 = l + 1;
                }
                ++j;
                l = n9;
            }
            x2.l = l;
            final int j2 = d.j0((ArrayList)x0.d, k0, x0.m());
            final int j3 = d.j0((ArrayList)x0.d, n, x0.m());
            Object instance;
            if (j2 < j3) {
                final ArrayList<b> d = x0.d;
                instance = new ArrayList<b>(j3 - j2);
                for (int n10 = j2; n10 < j3; ++n10) {
                    final b value = d.get(n10);
                    e.e((Object)value, "sourceAnchors[anchorIndex]");
                    final b b6 = value;
                    b6.a += n4;
                    ((ArrayList<b>)instance).add(b6);
                }
                x2.d.addAll(cg.d.j0((ArrayList)x2.d, x2.r, x2.m()), (Collection<? extends b>)instance);
                d.subList(j2, j3).clear();
            }
            else {
                instance = EmptyList.INSTANCE;
            }
            final int z = x0.z(k0);
            boolean b8;
            if (b) {
                final boolean b7 = z >= 0;
                if (b7) {
                    x0.K();
                    x0.a(z - x0.r);
                    x0.K();
                }
                x0.a(k0 - x0.r);
                b8 = x0.C();
                if (b7) {
                    x0.H();
                    x0.i();
                    x0.H();
                    x0.i();
                }
            }
            else {
                b8 = x0.D(k0, o);
                x0.E(g, n2, k0 - 1);
            }
            if (b8 ^ true) {
                final int n11 = x2.n;
                if (d.h0(r, b4)) {
                    k0 = 1;
                }
                else {
                    k0 = d.k0(r, b4);
                }
                x2.n = n11 + k0;
                if (b2) {
                    x2.r = r2;
                    x2.h = n5 + n2;
                }
                if (b3) {
                    x2.O(s);
                }
                return (List)instance;
            }
            ComposerKt.c("Unexpectedly removed anchors".toString());
            throw null;
        }
    }
}
