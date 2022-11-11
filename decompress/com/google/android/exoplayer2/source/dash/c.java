// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.dash;

import java.util.Collection;
import ec.i;
import java.util.Map;
import ad.c0;
import cc.g;
import cb.u;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import cc.m;
import va.h0;
import java.io.IOException;
import com.google.android.exoplayer2.n;
import cb.h;
import cb.w;
import java.util.List;
import jb.l;
import ad.a0;
import jb.e;
import hb.d;
import ec.b;
import ec.j;
import java.util.ArrayList;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import wc.f;
import yc.o;

public final class c implements a
{
    public final o a;
    public final dc.a b;
    public final int[] c;
    public final int d;
    public final com.google.android.exoplayer2.upstream.a e;
    public final long f;
    public final d$c g;
    public final b[] h;
    public f i;
    public c j;
    public int k;
    public BehindLiveWindowException l;
    public boolean m;
    
    public c(final o a, final c j, final dc.a b, int i, final int[] c, final f k, final int d, final com.google.android.exoplayer2.upstream.a e, long e2, final boolean b2, final ArrayList list, final d$c g) {
        this.a = a;
        this.j = j;
        this.b = b;
        this.c = c;
        this.i = k;
        this.d = d;
        this.e = e;
        this.k = i;
        this.f = e2;
        this.g = g;
        e2 = j.e(i);
        final ArrayList<j> l = this.l();
        this.h = new b[k.length()];
        j m;
        ec.b d2;
        b[] h;
        n f;
        String p12;
        Object o = null;
        Object o2;
        boolean b3 = false;
        int n;
        for (i = 0; i < this.h.length; ++i) {
            m = l.get(k.c(i));
            d2 = b.d(m.g);
            h = this.h;
            if (d2 == null) {
                d2 = ((List<ec.b>)m.g).get(0);
            }
            f = m.f;
            p12 = f.p;
            Label_0339: {
                if (ad.o.l(p12)) {
                    if (!"application/x-rawcc".equals(p12)) {
                        o = null;
                        break Label_0339;
                    }
                    o2 = new lb.a(f);
                }
                else {
                    Label_0279: {
                        if (p12 != null) {
                            if (p12.startsWith("video/webm") || p12.startsWith("audio/webm") || p12.startsWith("application/webm") || p12.startsWith("video/x-matroska") || p12.startsWith("audio/x-matroska") || p12.startsWith("application/x-matroska")) {
                                b3 = true;
                                break Label_0279;
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        o2 = new d(1);
                    }
                    else {
                        if (b2) {
                            n = 4;
                        }
                        else {
                            n = 0;
                        }
                        o2 = new e(n, (a0)null, (l)null, (List)list, (w)g);
                    }
                }
                o = new cc.d((h)o2, d, f);
            }
            h[i] = new b(e2, m, d2, (cc.f)o, 0L, m.l());
        }
    }
    
    public final void a(final f i) {
        this.i = i;
    }
    
    public final void b() throws IOException {
        final BehindLiveWindowException l = this.l;
        if (l == null) {
            this.a.b();
            return;
        }
        throw l;
    }
    
    public final long c(final long n, final h0 h0) {
        for (final b b : this.h) {
            final dc.b d = b.d;
            if (d != null) {
                final long n2 = d.f(n, b.e) + b.f;
                final long d2 = b.d(n2);
                final long g = b.d.g(b.e);
                long d3;
                if (d2 < n && (g == -1L || n2 < b.d.h() + b.f + g - 1L)) {
                    d3 = b.d(n2 + 1L);
                }
                else {
                    d3 = d2;
                }
                return h0.a(n, d2, d3);
            }
        }
        return n;
    }
    
    public final boolean d(final long n, final cc.e e, final List<? extends m> list) {
        return this.l == null && this.i.e(n, e, list);
    }
    
    public final boolean e(final cc.e e, final boolean b, final com.google.android.exoplayer2.upstream.h.c c, final com.google.android.exoplayer2.upstream.h h) {
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final d$c g = this.g;
        if (g != null) {
            final long d = g.d;
            final boolean b3 = d != -9223372036854775807L && d < e.g;
            final com.google.android.exoplayer2.source.dash.d e2 = g.e;
            boolean b4 = false;
            Label_0155: {
                Label_0152: {
                    if (e2.k.d) {
                        if (!e2.m) {
                            if (!b3) {
                                break Label_0152;
                            }
                            if (e2.l) {
                                e2.m = true;
                                e2.l = false;
                                final DashMediaSource a = ((DashMediaSource$c)e2.g).a;
                                a.I.removeCallbacks((Runnable)a.B);
                                a.z();
                            }
                        }
                        b4 = true;
                        break Label_0155;
                    }
                }
                b4 = false;
            }
            if (b4) {
                return true;
            }
        }
        if (!this.j.d && e instanceof m) {
            final IOException a2 = c.a;
            if (a2 instanceof HttpDataSource$InvalidResponseCodeException && ((HttpDataSource$InvalidResponseCodeException)a2).responseCode == 404) {
                final b b5 = this.h[this.i.t(e.d)];
                final long g2 = b5.d.g(b5.e);
                if (g2 != -1L && g2 != 0L && ((m)e).b() > b5.d.h() + b5.f + g2 - 1L) {
                    return this.m = true;
                }
            }
        }
        final b b6 = this.h[this.i.t(e.d)];
        final ec.b d2 = this.b.d(b6.b.g);
        if (d2 != null && !b6.c.equals((Object)d2)) {
            return true;
        }
        final f i = this.i;
        final ImmutableList g3 = b6.b.g;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final int length = i.length();
        int n;
        int n2;
        for (int j = n = 0; j < length; ++j, n = n2) {
            n2 = n;
            if (i.b(j, elapsedRealtime)) {
                n2 = n + 1;
            }
        }
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int k = 0; k < ((List)g3).size(); ++k) {
            set.add(((ec.b)((List)g3).get(k)).c);
        }
        final int size = set.size();
        final dc.a b7 = this.b;
        b7.getClass();
        final HashSet<Integer> set2 = new HashSet<Integer>();
        final ArrayList b8 = b7.b(g3);
        for (int l = 0; l < b8.size(); ++l) {
            set2.add(((ec.b)b8.get(l)).c);
        }
        final com.google.android.exoplayer2.upstream.h.a a3 = new com.google.android.exoplayer2.upstream.h.a(size, size - set2.size(), length, n);
        if (!a3.a(2) && !a3.a(1)) {
            return false;
        }
        final com.google.android.exoplayer2.upstream.h.b fallbackSelection = h.getFallbackSelectionFor(a3, c);
        boolean o = b2;
        if (fallbackSelection != null) {
            if (!a3.a(fallbackSelection.a)) {
                o = b2;
            }
            else {
                final int a4 = fallbackSelection.a;
                if (a4 == 2) {
                    final f m = this.i;
                    o = m.o(m.t(e.d), fallbackSelection.b);
                }
                else {
                    o = b2;
                    if (a4 == 1) {
                        final dc.a b9 = this.b;
                        final ec.b c2 = b6.c;
                        final long b10 = fallbackSelection.b;
                        b9.getClass();
                        final long n3 = SystemClock.elapsedRealtime() + b10;
                        dc.a.a(c2.b, n3, b9.a);
                        final int c3 = c2.c;
                        if (c3 != Integer.MIN_VALUE) {
                            dc.a.a(c3, n3, b9.b);
                        }
                        o = true;
                    }
                }
            }
        }
        return o;
    }
    
    public final void f(final c j, int i) {
        try {
            this.j = j;
            this.k = i;
            final long e = j.e(i);
            final ArrayList<j> l = this.l();
            j k;
            b[] h;
            for (i = 0; i < this.h.length; ++i) {
                k = l.get(this.i.c(i));
                h = this.h;
                h[i] = h[i].a(e, k);
            }
        }
        catch (final BehindLiveWindowException m) {
            this.l = m;
        }
    }
    
    public final int g(final long n, final List<? extends m> list) {
        if (this.l == null && this.i.length() >= 2) {
            return this.i.j(n, list);
        }
        return list.size();
    }
    
    public final void h(final cc.e e) {
        if (e instanceof cc.l) {
            final int t = this.i.t(e.d);
            final b[] h = this.h;
            final b b = h[t];
            if (b.d == null) {
                final cc.f a = b.a;
                final u m = ((cc.d)a).m;
                cb.c c;
                if (m instanceof cb.c) {
                    c = (cb.c)m;
                }
                else {
                    c = null;
                }
                if (c != null) {
                    final j b2 = b.b;
                    h[t] = new b(b.e, b2, b.c, a, b.f, new dc.d(c, b2.h));
                }
            }
        }
        final d$c g = this.g;
        if (g != null) {
            final long d = g.d;
            if (d == -9223372036854775807L || e.h > d) {
                g.d = e.h;
            }
            g.e.l = true;
        }
    }
    
    public final void j(long n, long c, final List<? extends m> list, final g g) {
        if (this.l != null) {
            return;
        }
        final long n2 = c - n;
        final long j = c0.J(this.j.a);
        final long i = c0.J(this.j.b(this.k).b);
        final d$c g2 = this.g;
        final int n3 = 0;
        if (g2 != null) {
            final com.google.android.exoplayer2.source.dash.d e = g2.e;
            final c k = e.k;
            int n4;
            if (!k.d) {
                n4 = 0;
            }
            else if (e.m) {
                n4 = 1;
            }
            else {
                final Map.Entry<Long, Long> ceilingEntry = e.j.ceilingEntry(k.h);
                int n5;
                if (ceilingEntry != null && ceilingEntry.getValue() < i + j + c) {
                    final long longValue = ceilingEntry.getKey();
                    final DashMediaSource a = ((DashMediaSource$c)e.g).a;
                    final long s = a.S;
                    if (s == -9223372036854775807L || s < longValue) {
                        a.S = longValue;
                    }
                    n5 = 1;
                }
                else {
                    n5 = 0;
                }
                n4 = n5;
                if (n5 != 0) {
                    if (!e.l) {
                        n4 = n5;
                    }
                    else {
                        e.m = true;
                        e.l = false;
                        final DashMediaSource a2 = ((DashMediaSource$c)e.g).a;
                        a2.I.removeCallbacks((Runnable)a2.B);
                        a2.z();
                        n4 = n5;
                    }
                }
            }
            if (n4 != 0) {
                return;
            }
        }
        final long l = c0.J(c0.v(this.f));
        final long m = this.k(l);
        m m2;
        if (list.isEmpty()) {
            m2 = null;
        }
        else {
            m2 = list.get(list.size() - 1);
        }
        final int length = this.i.length();
        final cc.n[] array = new cc.n[length];
        for (int n6 = n3; n6 < length; ++n6) {
            final b b = this.h[n6];
            final dc.b d = b.d;
            if (d == null) {
                array[n6] = (cc.n)cc.n.a;
            }
            else {
                final long n7 = d.d(b.e, l) + b.f;
                final long b2 = b.b(l);
                long n8;
                if (m2 != null) {
                    n8 = m2.b();
                }
                else {
                    n8 = c0.j(b.d.f(c, b.e) + b.f, n7, b2);
                }
                if (n8 < n7) {
                    array[n6] = (cc.n)cc.n.a;
                }
                else {
                    array[n6] = (cc.n)new c(this.m(n6), n8, b2);
                }
            }
        }
        long max;
        if (!this.j.d) {
            max = -9223372036854775807L;
        }
        else {
            final b b3 = this.h[0];
            final long n9 = l;
            max = Math.max(0L, Math.min(this.k(n9), this.h[0].c(b3.b(n9))) - n);
        }
        this.i.m(n, n2, max, list, array);
        final b m3 = this.m(this.i.a());
        final cc.f a3 = m3.a;
        if (a3 != null) {
            final j b4 = m3.b;
            i l2;
            if (((cc.d)a3).n == null) {
                l2 = b4.l;
            }
            else {
                l2 = null;
            }
            i m4;
            if (m3.d == null) {
                m4 = b4.m();
            }
            else {
                m4 = null;
            }
            if (l2 != null || m4 != null) {
                final com.google.android.exoplayer2.upstream.a e2 = this.e;
                final n l3 = this.i.l();
                final int u = this.i.u();
                final Object r = this.i.r();
                final j b5 = m3.b;
                i a4 = m4;
                if (l2 == null || (a4 = l2.a(m4, m3.c.a)) != null) {
                    l2 = a4;
                }
                g.b = new cc.l(e2, dc.c.a(b5, m3.c.a, l2, 0), l3, u, r, m3.a);
                return;
            }
        }
        final long e3 = m3.e;
        final long n10 = lcmp(e3, -9223372036854775807L);
        final boolean b6 = n10 != 0;
        if (m3.d.g(e3) == 0L) {
            g.a = b6;
            return;
        }
        final long n11 = m3.d.d(m3.e, l) + m3.f;
        final long b7 = m3.b(l);
        if (m2 != null) {
            n = m2.b();
        }
        else {
            n = c0.j(m3.d.f(c, m3.e) + m3.f, n11, b7);
        }
        if (n < n11) {
            this.l = new BehindLiveWindowException();
            return;
        }
        final long n12 = lcmp(n, b7);
        if (n12 > 0 || (this.m && n12 >= 0)) {
            g.a = b6;
            return;
        }
        if (b6 && m3.d(n) >= e3) {
            g.a = true;
            return;
        }
        int n13 = 1;
        int n15;
        int n14 = n15 = (int)Math.min(1, b7 - n + 1L);
        if (n10 != 0) {
            while ((n15 = n14) > 1) {
                n15 = n14;
                if (m3.d(n14 + n - 1L) < e3) {
                    break;
                }
                --n14;
            }
        }
        if (!list.isEmpty()) {
            c = -9223372036854775807L;
        }
        final com.google.android.exoplayer2.upstream.a e4 = this.e;
        final int d2 = this.d;
        final n l4 = this.i.l();
        final int u2 = this.i.u();
        final Object r2 = this.i.r();
        final j b8 = m3.b;
        final long d3 = m3.d(n);
        i i2 = m3.d.i(n - m3.f);
        Object b9;
        if (m3.a == null) {
            c = m3.c(n);
            int n16;
            if (m3.e(n, m)) {
                n16 = 0;
            }
            else {
                n16 = 8;
            }
            b9 = new cc.o(e4, dc.c.a(b8, m3.c.a, i2, n16), l4, u2, r2, d3, c, n, d2, l4);
        }
        else {
            int n17 = 1;
            while (n13 < n15) {
                final i a5 = i2.a(m3.d.i(n13 + n - m3.f), m3.c.a);
                if (a5 == null) {
                    break;
                }
                ++n17;
                ++n13;
                i2 = a5;
            }
            final long n18 = n17 + n - 1L;
            final long c2 = m3.c(n18);
            long e5 = m3.e;
            if (e5 == -9223372036854775807L || e5 > c2) {
                e5 = -9223372036854775807L;
            }
            int n19;
            if (m3.e(n18, m)) {
                n19 = 0;
            }
            else {
                n19 = 8;
            }
            b9 = new cc.j(e4, dc.c.a(b8, m3.c.a, i2, n19), l4, u2, r2, d3, c2, c, e5, n, n17, -b8.h, m3.a);
        }
        g.b = b9;
    }
    
    public final long k(long n) {
        final c j = this.j;
        final long a = j.a;
        final long n2 = -9223372036854775807L;
        if (a == -9223372036854775807L) {
            n = n2;
        }
        else {
            n -= c0.J(a + j.b(this.k).b);
        }
        return n;
    }
    
    public final ArrayList<j> l() {
        final List c = this.j.b(this.k).c;
        final ArrayList list = new ArrayList();
        final int[] c2 = this.c;
        for (int length = c2.length, i = 0; i < length; ++i) {
            list.addAll(((ec.a)c.get(c2[i])).c);
        }
        return list;
    }
    
    public final b m(final int n) {
        final b b = this.h[n];
        final ec.b d = this.b.d(b.b.g);
        b b2 = b;
        if (d != null) {
            b2 = b;
            if (!d.equals((Object)b.c)) {
                b2 = new b(b.e, b.b, d, b.a, b.f, b.d);
                this.h[n] = b2;
            }
        }
        return b2;
    }
    
    public final void release() {
        final b[] h = this.h;
        for (int length = h.length, i = 0; i < length; ++i) {
            final cc.f a = h[i].a;
            if (a != null) {
                ((cc.d)a).f.release();
            }
        }
    }
    
    public static final class b
    {
        public final cc.f a;
        public final j b;
        public final ec.b c;
        public final dc.b d;
        public final long e;
        public final long f;
        
        public b(final long e, final j b, final ec.b c, final cc.f a, final long f, final dc.b d) {
            this.e = e;
            this.b = b;
            this.c = c;
            this.f = f;
            this.a = a;
            this.d = d;
        }
        
        public final b a(final long n, final j j) throws BehindLiveWindowException {
            final dc.b l = this.b.l();
            final dc.b i = j.l();
            if (l == null) {
                return new b(n, j, this.c, this.a, this.f, l);
            }
            if (!l.j()) {
                return new b(n, j, this.c, this.a, this.f, i);
            }
            final long g = l.g(n);
            if (g == 0L) {
                return new b(n, j, this.c, this.a, this.f, i);
            }
            final long h = l.h();
            final long b = l.b(h);
            final long n2 = g + h - 1L;
            final long b2 = l.b(n2);
            final long c = l.c(n2, n);
            final long h2 = i.h();
            final long b3 = i.b(h2);
            final long f = this.f;
            final long n3 = lcmp(c + b2, b3);
            long f2;
            if (n3 == 0) {
                f2 = n2 + 1L;
            }
            else {
                if (n3 < 0) {
                    throw new BehindLiveWindowException();
                }
                if (b3 < b) {
                    final long n4 = f - (i.f(b, n) - h);
                    return new b(n, j, this.c, this.a, n4, i);
                }
                f2 = l.f(b3, n);
            }
            final long n4 = f2 - h2 + f;
            return new b(n, j, this.c, this.a, n4, i);
        }
        
        public final long b(final long n) {
            return this.d.k(this.e, n) + (this.d.d(this.e, n) + this.f) - 1L;
        }
        
        public final long c(final long n) {
            return this.d.c(n - this.f, this.e) + this.d(n);
        }
        
        public final long d(final long n) {
            return this.d.b(n - this.f);
        }
        
        public final boolean e(final long n, final long n2) {
            final boolean j = this.d.j();
            final boolean b = true;
            if (j) {
                return true;
            }
            boolean b2 = b;
            if (n2 != -9223372036854775807L) {
                b2 = (this.c(n) <= n2 && b);
            }
            return b2;
        }
    }
    
    public static final class c extends cc.b
    {
        public final com.google.android.exoplayer2.source.dash.c.b e;
        
        public c(final com.google.android.exoplayer2.source.dash.c.b e, final long n, final long n2) {
            super(n, n2);
            this.e = e;
        }
        
        public final long a() {
            this.c();
            return this.e.c(super.d);
        }
        
        public final long b() {
            this.c();
            return this.e.d(super.d);
        }
    }
}
