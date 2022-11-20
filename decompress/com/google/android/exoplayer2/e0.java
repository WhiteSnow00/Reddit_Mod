// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.os.BaseBundle;
import sa.l;
import android.net.Uri;
import bd.c0;
import cc.a$a;
import sa.t;
import wa.a;
import java.util.ArrayList;
import android.os.Bundle;
import ah0.b;
import android.util.Pair;

public abstract class e0 implements f
{
    public static final e0$a f;
    
    static {
        f = new e0$a();
    }
    
    public static String q(final int n) {
        return Integer.toString(n, 36);
    }
    
    public int a(final boolean b) {
        int n;
        if (this.p()) {
            n = -1;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public abstract int b(final Object p0);
    
    public int c(final boolean b) {
        int n;
        if (this.p()) {
            n = -1;
        }
        else {
            n = this.o() - 1;
        }
        return n;
    }
    
    public final int d(int e, final b b, final c c, final int n, final boolean b2) {
        final int h = this.f(e, b, false).h;
        if (this.m(h, c).u != e) {
            return e + 1;
        }
        e = this.e(h, n, b2);
        if (e == -1) {
            return -1;
        }
        return this.m(e, c).t;
    }
    
    public int e(int a, final int n, final boolean b) {
        if (n == 0) {
            if (a == this.c(b)) {
                a = -1;
            }
            else {
                ++a;
            }
            return a;
        }
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            if (a == this.c(b)) {
                a = this.a(b);
            }
            else {
                ++a;
            }
            return a;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e0)) {
            return false;
        }
        final e0 e0 = (e0)o;
        if (e0.o() == this.o() && e0.h() == this.h()) {
            final c c = new c();
            final b b = new b();
            final c c2 = new c();
            final b b2 = new b();
            for (int i = 0; i < this.o(); ++i) {
                if (!this.m(i, c).equals(e0.m(i, c2))) {
                    return false;
                }
            }
            for (int j = 0; j < this.h(); ++j) {
                if (!this.f(j, b, true).equals(e0.f(j, b2, true))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public abstract b f(final int p0, final b p1, final boolean p2);
    
    public b g(final Object o, final b b) {
        return this.f(this.b(o), b, true);
    }
    
    public abstract int h();
    
    @Override
    public final int hashCode() {
        final c c = new c();
        final b b = new b();
        int n = this.o() + 217;
        final int n2 = 0;
        for (int i = 0; i < this.o(); ++i) {
            n = n * 31 + this.m(i, c).hashCode();
        }
        int n3 = this.h() + n * 31;
        for (int j = n2; j < this.h(); ++j) {
            n3 = n3 * 31 + this.f(j, b, true).hashCode();
        }
        return n3;
    }
    
    public final Pair<Object, Long> i(final c c, final b b, final int n, final long n2) {
        final Pair<Object, Long> j = this.j(c, b, n, n2, 0L);
        j.getClass();
        return j;
    }
    
    public final Pair<Object, Long> j(final c c, final b b, int t, long n, long r) {
        b.E(t, this.o());
        this.n(t, c, r);
        r = n;
        if (n == -9223372036854775807L) {
            n = (r = c.r);
            if (n == -9223372036854775807L) {
                return null;
            }
        }
        t = c.t;
        this.f(t, b, false);
        while (t < c.u && b.j != r) {
            final int n2 = t + 1;
            if (this.f(n2, b, false).j > r) {
                break;
            }
            t = n2;
        }
        this.f(t, b, true);
        r -= b.j;
        final long i = b.i;
        n = r;
        if (i != -9223372036854775807L) {
            n = Math.min(r, i - 1L);
        }
        n = Math.max(0L, n);
        final Object g = b.g;
        g.getClass();
        return (Pair<Object, Long>)Pair.create(g, (Object)n);
    }
    
    public int k(int c, final int n, final boolean b) {
        if (n == 0) {
            if (c == this.a(b)) {
                c = -1;
            }
            else {
                --c;
            }
            return c;
        }
        if (n == 1) {
            return c;
        }
        if (n == 2) {
            if (c == this.a(b)) {
                c = this.c(b);
            }
            else {
                --c;
            }
            return c;
        }
        throw new IllegalStateException();
    }
    
    public abstract Object l(final int p0);
    
    public final c m(final int n, final c c) {
        return this.n(n, c, 0L);
    }
    
    public abstract c n(final int p0, final c p1, final long p2);
    
    public abstract int o();
    
    public final boolean p() {
        return this.o() == 0;
    }
    
    public final Bundle toBundle() {
        final ArrayList list = new ArrayList();
        final int o = this.o();
        final c c = new c();
        for (int i = 0; i < o; ++i) {
            list.add(this.n(i, c, 0L).d());
        }
        final ArrayList list2 = new ArrayList();
        final int h = this.h();
        final b b = new b();
        for (int j = 0; j < h; ++j) {
            list2.add(this.f(j, b, false).toBundle());
        }
        final int[] array = new int[o];
        if (o > 0) {
            array[0] = this.a(true);
        }
        for (int k = 1; k < o; ++k) {
            array[k] = this.e(array[k - 1], 0, true);
        }
        final Bundle bundle = new Bundle();
        i10.a.b0(bundle, q(0), new a(list));
        i10.a.b0(bundle, q(1), new a(list2));
        ((BaseBundle)bundle).putIntArray(q(2), array);
        return bundle;
    }
    
    public static final class b implements f
    {
        public Object f;
        public Object g;
        public int h;
        public long i;
        public long j;
        public boolean k;
        public cc.a l;
        
        static {
            new t(5);
        }
        
        public b() {
            this.l = cc.a.l;
        }
        
        public static String h(final int n) {
            return Integer.toString(n, 36);
        }
        
        public final long a(final int n, final int n2) {
            final a$a a = this.l.a(n);
            long n3;
            if (a.g != -1) {
                n3 = a.j[n2];
            }
            else {
                n3 = -9223372036854775807L;
            }
            return n3;
        }
        
        public final int b(final long n) {
            final cc.a l = this.l;
            final long i = this.i;
            l.getClass();
            int n3;
            final int n2 = n3 = -1;
            if (n != Long.MIN_VALUE) {
                if (i != -9223372036854775807L && n >= i) {
                    n3 = n2;
                }
                else {
                    int j;
                    for (j = l.j; j < l.g; ++j) {
                        if (l.a(j).f == Long.MIN_VALUE || l.a(j).f > n) {
                            final a$a a = l.a(j);
                            if (a.g == -1 || a.a(-1) < a.g) {
                                break;
                            }
                        }
                    }
                    n3 = n2;
                    if (j < l.g) {
                        n3 = j;
                    }
                }
            }
            return n3;
        }
        
        public final int c(final long n) {
            final cc.a l = this.l;
            final long i = this.i;
            int j = l.g;
            final boolean b = true;
            --j;
            while (j >= 0) {
                boolean b2 = false;
                Label_0094: {
                    Label_0091: {
                        if (n != Long.MIN_VALUE) {
                            final long f = l.a(j).f;
                            if (f == Long.MIN_VALUE) {
                                if (i != -9223372036854775807L) {
                                    if (n >= i) {
                                        break Label_0091;
                                    }
                                }
                            }
                            else if (n >= f) {
                                break Label_0091;
                            }
                            b2 = true;
                            break Label_0094;
                        }
                    }
                    b2 = false;
                }
                if (!b2) {
                    break;
                }
                --j;
            }
            if (j >= 0) {
                final a$a a = l.a(j);
                int n2 = 0;
                Label_0187: {
                    if (a.g == -1) {
                        n2 = (b ? 1 : 0);
                    }
                    else {
                        for (int k = 0; k < a.g; ++k) {
                            final int n3 = a.i[k];
                            n2 = (b ? 1 : 0);
                            if (n3 == 0) {
                                break Label_0187;
                            }
                            if (n3 == 1) {
                                n2 = (b ? 1 : 0);
                                break Label_0187;
                            }
                        }
                        n2 = 0;
                    }
                }
                if (n2 != 0) {
                    return j;
                }
            }
            j = -1;
            return j;
        }
        
        public final long d(final int n) {
            return this.l.a(n).f;
        }
        
        public final int e(int n, final int n2) {
            final a$a a = this.l.a(n);
            if (a.g != -1) {
                n = a.i[n2];
            }
            else {
                n = 0;
            }
            return n;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && b.class.equals(o.getClass())) {
                final b b2 = (b)o;
                if (!c0.a(this.f, b2.f) || !c0.a(this.g, b2.g) || this.h != b2.h || this.i != b2.i || this.j != b2.j || this.k != b2.k || !c0.a((Object)this.l, (Object)b2.l)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public final int f(final int n) {
            return this.l.a(n).a(-1);
        }
        
        public final boolean g(final int n) {
            return this.l.a(n).l;
        }
        
        @Override
        public final int hashCode() {
            final Object f = this.f;
            int hashCode = 0;
            int hashCode2;
            if (f == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = f.hashCode();
            }
            final Object g = this.g;
            if (g != null) {
                hashCode = g.hashCode();
            }
            final int h = this.h;
            final long i = this.i;
            final int n = (int)(i ^ i >>> 32);
            final long j = this.j;
            return this.l.hashCode() + ((((((217 + hashCode2) * 31 + hashCode) * 31 + h) * 31 + n) * 31 + (int)(j ^ j >>> 32)) * 31 + (this.k ? 1 : 0)) * 31;
        }
        
        public final void i(final Object f, final Object g, final int h, final long i, final long j, final cc.a l, final boolean k) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.l = l;
            this.k = k;
        }
        
        public final Bundle toBundle() {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt(h(0), this.h);
            ((BaseBundle)bundle).putLong(h(1), this.i);
            ((BaseBundle)bundle).putLong(h(2), this.j);
            ((BaseBundle)bundle).putBoolean(h(3), this.k);
            bundle.putBundle(h(4), this.l.toBundle());
            return bundle;
        }
    }
    
    public static final class c implements f
    {
        public static final Object w;
        public static final Object x;
        public static final q y;
        public Object f;
        @Deprecated
        public Object g;
        public q h;
        public Object i;
        public long j;
        public long k;
        public long l;
        public boolean m;
        public boolean n;
        @Deprecated
        public boolean o;
        public q$e p;
        public boolean q;
        public long r;
        public long s;
        public int t;
        public int u;
        public long v;
        
        static {
            w = new Object();
            x = new Object();
            final q$a q$a = new q$a();
            q$a.a = "com.google.android.exoplayer2.Timeline";
            q$a.b = Uri.EMPTY;
            y = q$a.a();
            new l(6);
        }
        
        public c() {
            this.f = c.w;
            this.h = c.y;
        }
        
        public static String b(final int n) {
            return Integer.toString(n, 36);
        }
        
        public final boolean a() {
            final boolean o = this.o;
            final q$e p = this.p;
            final boolean b = true;
            ah0.b.H(o == (p != null));
            return this.p != null && b;
        }
        
        public final void c(Object g, final q q, final Object i, final long j, final long k, final long l, final boolean m, final boolean n, final q$e p14, final long r, final long s, final int t, final int u, final long v) {
            this.f = g;
            q y;
            if (q != null) {
                y = q;
            }
            else {
                y = c.y;
            }
            this.h = y;
            Label_0046: {
                if (q != null) {
                    final q$g g2 = q.g;
                    if (g2 != null) {
                        g = ((q$f)g2).g;
                        break Label_0046;
                    }
                }
                g = null;
            }
            this.g = g;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = (p14 != null);
            this.p = p14;
            this.r = r;
            this.s = s;
            this.t = t;
            this.u = u;
            this.v = v;
            this.q = false;
        }
        
        public final Bundle d() {
            final Bundle bundle = new Bundle();
            bundle.putBundle(b(1), this.h.toBundle());
            ((BaseBundle)bundle).putLong(b(2), this.j);
            ((BaseBundle)bundle).putLong(b(3), this.k);
            ((BaseBundle)bundle).putLong(b(4), this.l);
            ((BaseBundle)bundle).putBoolean(b(5), this.m);
            ((BaseBundle)bundle).putBoolean(b(6), this.n);
            final q$e p = this.p;
            if (p != null) {
                bundle.putBundle(b(7), p.toBundle());
            }
            ((BaseBundle)bundle).putBoolean(b(8), this.q);
            ((BaseBundle)bundle).putLong(b(9), this.r);
            ((BaseBundle)bundle).putLong(b(10), this.s);
            ((BaseBundle)bundle).putInt(b(11), this.t);
            ((BaseBundle)bundle).putInt(b(12), this.u);
            ((BaseBundle)bundle).putLong(b(13), this.v);
            return bundle;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && c.class.equals(o.getClass())) {
                final c c = (c)o;
                if (!c0.a(this.f, c.f) || !c0.a((Object)this.h, (Object)c.h) || !c0.a(this.i, c.i) || !c0.a((Object)this.p, (Object)c.p) || this.j != c.j || this.k != c.k || this.l != c.l || this.m != c.m || this.n != c.n || this.q != c.q || this.r != c.r || this.s != c.s || this.t != c.t || this.u != c.u || this.v != c.v) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final int g = android.support.v4.media.a.g(this.f, 217, 31);
            final int hashCode = this.h.hashCode();
            final Object i = this.i;
            int hashCode2 = 0;
            int hashCode3;
            if (i == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = i.hashCode();
            }
            final q$e p = this.p;
            if (p != null) {
                hashCode2 = p.hashCode();
            }
            final long j = this.j;
            final int n = (int)(j ^ j >>> 32);
            final long k = this.k;
            final int n2 = (int)(k ^ k >>> 32);
            final long l = this.l;
            final int n3 = (int)(l ^ l >>> 32);
            final int m = this.m ? 1 : 0;
            final int n4 = this.n ? 1 : 0;
            final int q = this.q ? 1 : 0;
            final long r = this.r;
            final int n5 = (int)(r ^ r >>> 32);
            final long s = this.s;
            final int n6 = (int)(s ^ s >>> 32);
            final int t = this.t;
            final int u = this.u;
            final long v = this.v;
            return (((((((((((((hashCode + g) * 31 + hashCode3) * 31 + hashCode2) * 31 + n) * 31 + n2) * 31 + n3) * 31 + m) * 31 + n4) * 31 + q) * 31 + n5) * 31 + n6) * 31 + t) * 31 + u) * 31 + (int)(v ^ v >>> 32);
        }
        
        public final Bundle toBundle() {
            return this.d();
        }
    }
}
