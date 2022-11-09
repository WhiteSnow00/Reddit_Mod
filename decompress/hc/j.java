// 
// Decompiled by Procyon v0.6.0
// 

package hc;

import com.google.android.exoplayer2.source.hls.playlist.c$d;
import com.google.android.exoplayer2.source.q$a;
import java.io.IOException;
import com.google.android.exoplayer2.ParserException;
import com.google.common.primitives.Ints;
import com.google.android.exoplayer2.source.hls.playlist.d$a;
import java.util.HashSet;
import com.google.android.exoplayer2.source.hls.playlist.d$b;
import java.util.Collections;
import com.google.android.exoplayer2.drm.b$b;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import bc.t;
import bd.d0;
import java.util.Map;
import com.google.android.exoplayer2.upstream.h$b;
import xc.m;
import com.google.android.exoplayer2.upstream.h$c;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.hls.playlist.c;
import android.net.Uri;
import com.google.android.exoplayer2.source.hls.playlist.c$c;
import java.util.List;
import wa.h0;
import qb.a;
import com.google.android.exoplayer2.n$a;
import bd.o;
import bd.c0;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.source.q;
import bc.u;
import com.google.android.exoplayer2.source.h$a;
import xa.b0;
import o8.l;
import dg.k;
import bc.p;
import java.util.IdentityHashMap;
import zc.b;
import com.google.android.exoplayer2.source.j$a;
import com.google.android.exoplayer2.drm.c$a;
import com.google.android.exoplayer2.drm.d;
import zc.s;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import z0.d1;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a;
import com.google.android.exoplayer2.source.h;

public final class j implements h, l$a, HlsPlaylistTracker$a
{
    public int A;
    public d1 B;
    public final g f;
    public final HlsPlaylistTracker g;
    public final f h;
    public final s i;
    public final d j;
    public final c$a k;
    public final com.google.android.exoplayer2.upstream.h l;
    public final j$a m;
    public final b n;
    public final IdentityHashMap<p, Integer> o;
    public final k p;
    public final l q;
    public final boolean r;
    public final int s;
    public final boolean t;
    public final b0 u;
    public h$a v;
    public int w;
    public u x;
    public hc.l[] y;
    public hc.l[] z;
    
    public j(final g f, final HlsPlaylistTracker g, final f h, final s i, final d j, final c$a k, final com.google.android.exoplayer2.upstream.h l, final j$a m, final b n, final l q, final boolean r, final int s, final boolean t, final b0 u) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        q.getClass();
        this.B = new d1(new q[0]);
        this.o = new IdentityHashMap<p, Integer>();
        this.p = new k(4);
        this.y = new hc.l[0];
        this.z = new hc.l[0];
    }
    
    public static n p(final n n, final n n2, final boolean b) {
        int l = -1;
        a o;
        int x;
        int d;
        int e;
        String h;
        String b2;
        String h2;
        if (n2 != null) {
            final String n3 = n2.n;
            o = n2.o;
            x = n2.D;
            d = n2.i;
            e = n2.j;
            h = n2.h;
            b2 = n2.g;
            h2 = n3;
        }
        else {
            final String r = c0.r(1, n.n);
            final a o2 = n.o;
            if (b) {
                x = n.D;
                d = n.i;
                e = n.j;
                final String h3 = n.h;
                b2 = n.g;
                final a a = o2;
                h2 = r;
                o = a;
                h = h3;
            }
            else {
                h = null;
                d = 0;
                x = -1;
                final String s = r;
                b2 = h;
                e = d;
                o = o2;
                h2 = s;
            }
        }
        final String e2 = bd.o.e(h2);
        int k;
        if (b) {
            k = n.k;
        }
        else {
            k = -1;
        }
        if (b) {
            l = n.l;
        }
        final n$a n$a = new n$a();
        n$a.a = n.f;
        n$a.b = b2;
        n$a.j = n.p;
        n$a.k = e2;
        n$a.h = h2;
        n$a.i = o;
        n$a.f = k;
        n$a.g = l;
        n$a.x = x;
        n$a.d = d;
        n$a.e = e;
        n$a.c = h;
        return n$a.a();
    }
    
    public final boolean a() {
        return this.B.a();
    }
    
    public final void b() {
        for (final hc.l l : this.y) {
            if (!l.s.isEmpty()) {
                final hc.h h = (hc.h)a80.a.R(l.s);
                final int b = l.i.b(h);
                if (b == 1) {
                    h.K = true;
                }
                else if (b == 2 && !l.Y && l.o.d()) {
                    l.o.a();
                }
            }
        }
        ((q$a)this.v).k((q)this);
    }
    
    public final boolean c(final long n) {
        if (this.x == null) {
            for (final hc.l l : this.y) {
                if (!l.I) {
                    l.c(l.U);
                }
            }
            return false;
        }
        return this.B.c(n);
    }
    
    public final long d() {
        return this.B.d();
    }
    
    public final void e(final long n) {
        this.B.e(n);
    }
    
    public final long f() {
        return this.B.f();
    }
    
    public final long g(long j, final h0 h0) {
        final hc.l[] z = this.z;
        final int length = z.length;
        int i = 0;
        while (i < length) {
            final hc.l l = z[i];
            if (l.F == 2) {
                final e k = l.i;
                final int b = k.q.b();
                final Uri[] e = k.e;
                c m;
                if (b < e.length && b != -1) {
                    m = k.g.k(e[k.q.l()], true);
                }
                else {
                    m = null;
                }
                if (m == null || ((List)m.r).isEmpty()) {
                    break;
                }
                if (!((jc.c)m).c) {
                    break;
                }
                final long n = m.h - k.g.b();
                final long n2 = j - n;
                final int d = c0.d((List)m.r, n2, true);
                final long j2 = ((c$d)((List<c$c>)m.r).get(d)).j;
                if (d != ((List)m.r).size() - 1) {
                    j = ((c$d)((List<Object>)m.r).get(d + 1)).j;
                }
                else {
                    j = j2;
                }
                j = h0.a(n2, j2, j) + n;
                break;
            }
            else {
                ++i;
            }
        }
        return j;
    }
    
    public final long h(final long n) {
        final hc.l[] z = this.z;
        if (z.length > 0) {
            final boolean h = z[0].H(n, false);
            int n2 = 1;
            while (true) {
                final hc.l[] z2 = this.z;
                if (n2 >= z2.length) {
                    break;
                }
                z2[n2].H(n, h);
                ++n2;
            }
            if (h) {
                ((SparseArray)this.p.f).clear();
            }
        }
        return n;
    }
    
    public final long i() {
        return -9223372036854775807L;
    }
    
    public final boolean j(final Uri uri, final h$c h$c, final boolean b) {
        final hc.l[] y = this.y;
        final int length = y.length;
        int i = 0;
        boolean b2 = true;
        while (i < length) {
            final hc.l l = y[i];
            boolean b5 = false;
            Label_0284: {
                if (c0.k(uri, l.i.e)) {
                    long b3 = 0L;
                    Label_0106: {
                        if (!b) {
                            final h$b fallbackSelection = l.n.getFallbackSelectionFor(xc.m.a(l.i.q), h$c);
                            if (fallbackSelection != null && fallbackSelection.a == 2) {
                                b3 = fallbackSelection.b;
                                break Label_0106;
                            }
                        }
                        b3 = -9223372036854775807L;
                    }
                    final e j = l.i;
                    int n = 0;
                    while (true) {
                        final Uri[] e = j.e;
                        if (n >= e.length) {
                            n = -1;
                            break;
                        }
                        if (e[n].equals((Object)uri)) {
                            break;
                        }
                        ++n;
                    }
                    boolean b4 = false;
                    Label_0261: {
                        if (n != -1) {
                            final int h = j.q.h(n);
                            if (h != -1) {
                                j.s |= uri.equals((Object)j.o);
                                if (b3 != -9223372036854775807L) {
                                    if (!j.q.o(h, b3) || !j.g.i(uri, b3)) {
                                        b4 = false;
                                        break Label_0261;
                                    }
                                }
                            }
                        }
                        b4 = true;
                    }
                    if (!b4 || b3 == -9223372036854775807L) {
                        b5 = false;
                        break Label_0284;
                    }
                }
                b5 = true;
            }
            b2 &= b5;
            ++i;
        }
        ((q$a)this.v).k((q)this);
        return b2;
    }
    
    public final void k(final q q) {
        final hc.l l = (hc.l)q;
        ((q$a)this.v).k((q)this);
    }
    
    public final u l() {
        final u x = this.x;
        x.getClass();
        return x;
    }
    
    public final hc.l n(final String s, final int n, final Uri[] array, final n[] array2, final n n2, final List<n> list, final Map<String, com.google.android.exoplayer2.drm.b> map, final long n3) {
        return new hc.l(s, n, (l$a)this, new e(this.f, this.g, array, array2, this.h, this.i, this.p, (List)list, this.u), (Map)map, this.n, n3, n2, this.j, this.k, this.l, this.m, this.s);
    }
    
    public final long o(final xc.f[] array, final boolean[] array2, final p[] array3, final boolean[] array4, final long n) {
        final int[] array5 = new int[array.length];
        final int[] array6 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            final p p5 = array3[i];
            int intValue;
            if (p5 == null) {
                intValue = -1;
            }
            else {
                intValue = this.o.get(p5);
            }
            array5[i] = intValue;
            array6[i] = -1;
            final xc.f f = array[i];
            if (f != null) {
                final t j = f.i();
                int n2 = 0;
                while (true) {
                    final hc.l[] y = this.y;
                    if (n2 >= y.length) {
                        break;
                    }
                    final hc.l l = y[n2];
                    l.v();
                    if (l.N.b(j) != -1) {
                        array6[i] = n2;
                        break;
                    }
                    ++n2;
                }
            }
        }
        this.o.clear();
        final int length = array.length;
        p[] array7 = new p[length];
        final int length2 = array.length;
        final p[] array8 = new p[length2];
        final int length3 = array.length;
        final xc.f[] array9 = new xc.f[length3];
        final hc.l[] array10 = new hc.l[this.y.length];
        int k = 0;
        int n3 = 0;
        int n4 = 0;
        p[] array11 = array8;
        while (k < this.y.length) {
            for (int n5 = 0; n5 < array.length; ++n5) {
                p p6;
                if (array5[n5] == k) {
                    p6 = array3[n5];
                }
                else {
                    p6 = null;
                }
                array11[n5] = p6;
                xc.f f2;
                if (array6[n5] == k) {
                    f2 = array[n5];
                }
                else {
                    f2 = null;
                }
                array9[n5] = f2;
            }
            final hc.l m = this.y[k];
            m.v();
            final int j2 = m.J;
            for (int n6 = 0; n6 < length3; ++n6) {
                final hc.k k2 = (hc.k)array11[n6];
                if (k2 != null && (array9[n6] == null || !array2[n6])) {
                    --m.J;
                    if (k2.h != -1) {
                        final hc.l g = k2.g;
                        final int f3 = k2.f;
                        g.v();
                        g.P.getClass();
                        final int n7 = g.P[f3];
                        d0.f(g.S[n7]);
                        g.S[n7] = false;
                        k2.h = -1;
                    }
                    array11[n6] = null;
                }
            }
            int n8;
            if (n4 || (m.X ? (j2 == 0) : (n != m.U))) {
                n8 = 1;
            }
            else {
                n8 = 0;
            }
            xc.f q;
            final xc.f f4 = q = m.i.q;
            xc.f f5;
            int n10;
            for (int n9 = 0; n9 < length3; ++n9, q = f5, n8 = n10) {
                final xc.f q2 = array9[n9];
                if (q2 == null) {
                    f5 = q;
                    n10 = n8;
                }
                else {
                    final int b = m.N.b(q2.i());
                    if (b == m.Q) {
                        m.i.q = q2;
                        q = q2;
                    }
                    f5 = q;
                    n10 = n8;
                    if (array11[n9] == null) {
                        ++m.J;
                        final hc.k k3 = new hc.k(m, b);
                        array11[n9] = (p)k3;
                        array4[n9] = true;
                        f5 = q;
                        n10 = n8;
                        if (m.P != null) {
                            k3.a();
                            f5 = q;
                            if ((n10 = n8) == 0) {
                                final hc.l.c c = m.A[m.P[b]];
                                int n11;
                                if (!c.y(n, true) && c.q + c.s != 0) {
                                    n11 = 1;
                                }
                                else {
                                    n11 = 0;
                                }
                                n10 = n11;
                                f5 = q;
                            }
                        }
                    }
                }
            }
            if (m.J == 0) {
                m.i.n = null;
                m.L = null;
                m.W = true;
                m.s.clear();
                if (m.o.d()) {
                    if (m.H) {
                        final hc.l.c[] a = m.A;
                        for (int length4 = a.length, n12 = 0; n12 < length4; ++n12) {
                            a[n12].i();
                        }
                    }
                    m.o.a();
                }
                else {
                    m.G();
                }
            }
            else {
                boolean b3 = false;
                Label_1036: {
                    if (!m.s.isEmpty() && !c0.a(q, f4)) {
                        boolean b2 = false;
                        Label_1012: {
                            if (!m.X) {
                                long n13 = 0L;
                                if (n < 0L) {
                                    n13 = -n;
                                }
                                final hc.h a2 = m.A();
                                q.a(n, n13, -9223372036854775807L, m.t, m.i.a(a2, n));
                                if (q.l() == m.i.h.a(a2.d)) {
                                    b2 = false;
                                    break Label_1012;
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            m.W = true;
                            b3 = true;
                            n8 = 1;
                            break Label_1036;
                        }
                    }
                    b3 = (n4 != 0);
                }
                if (n8 != 0) {
                    m.H(n, b3);
                    for (int n14 = 0; n14 < length2; ++n14) {
                        if (array11[n14] != null) {
                            array4[n14] = true;
                        }
                    }
                }
            }
            final p[] array12 = array7;
            final p[] array13 = array11;
            m.x.clear();
            for (final p p7 : array13) {
                if (p7 != null) {
                    m.x.add(p7);
                }
            }
            int n16 = 1;
            m.X = true;
            int n17 = 0;
            int n18 = 0;
            final p[] array14 = array12;
            while (n18 < array.length) {
                final p p8 = array13[n18];
                int n19;
                if (array6[n18] == k) {
                    p8.getClass();
                    array14[n18] = p8;
                    this.o.put(p8, k);
                    n19 = n16;
                }
                else {
                    n19 = n17;
                    if (array5[n18] == k) {
                        boolean b4;
                        if (p8 == null) {
                            b4 = (n16 != 0);
                        }
                        else {
                            b4 = false;
                        }
                        d0.f(b4);
                        n19 = n17;
                    }
                }
                ++n18;
                n17 = n19;
            }
            Label_1387: {
                if (n17 != 0) {
                    array10[n3] = m;
                    final int n20 = n3 + 1;
                    if (n3 == 0) {
                        m.i.l = (n16 != 0);
                        if (n8 == 0) {
                            final hc.l[] z = this.z;
                            if (z.length != 0) {
                                n3 = n20;
                                if (m == z[0]) {
                                    break Label_1387;
                                }
                            }
                        }
                        ((SparseArray)this.p.f).clear();
                        n3 = n20;
                        n4 = n16;
                    }
                    else {
                        if (k >= this.A) {
                            n16 = 0;
                        }
                        m.i.l = (n16 != 0);
                        n3 = n20;
                    }
                }
            }
            ++k;
            final p[] array15 = array14;
            array11 = array13;
            array7 = array15;
        }
        System.arraycopy(array7, 0, array3, 0, length);
        final hc.l[] z2 = (hc.l[])c0.L(n3, array10);
        this.z = z2;
        this.q.getClass();
        this.B = new d1(z2);
        return n;
    }
    
    public final void q(final h$a v, final long n) {
        this.v = v;
        this.g.g((HlsPlaylistTracker$a)this);
        final com.google.android.exoplayer2.source.hls.playlist.d e = this.g.e();
        e.getClass();
        final boolean t = this.t;
        int i = 0;
        final int n2 = 1;
        final int n3 = 1;
        Map<Object, Object> emptyMap;
        if (t) {
            final List m = e.m;
            final ArrayList list = new ArrayList(m);
            final HashMap hashMap = new HashMap();
            int n4 = 0;
            while (true) {
                emptyMap = hashMap;
                if (n4 >= list.size()) {
                    break;
                }
                com.google.android.exoplayer2.drm.b b = m.get(n4);
                final String h = b.h;
                int j = ++n4;
                while (j < list.size()) {
                    final com.google.android.exoplayer2.drm.b b2 = (com.google.android.exoplayer2.drm.b)list.get(j);
                    if (TextUtils.equals((CharSequence)b2.h, (CharSequence)h)) {
                        final String h2 = b.h;
                        boolean b3 = false;
                        Label_0201: {
                            if (h2 != null) {
                                final String h3 = b2.h;
                                if (h3 != null) {
                                    if (!TextUtils.equals((CharSequence)h2, (CharSequence)h3)) {
                                        b3 = false;
                                        break Label_0201;
                                    }
                                }
                            }
                            b3 = true;
                        }
                        d0.f(b3);
                        String s = b.h;
                        if (s == null) {
                            s = b2.h;
                        }
                        final b$b[] f = b.f;
                        final b$b[] f2 = b2.f;
                        final int a = c0.a;
                        final b$b[] copy = Arrays.copyOf(f, f.length + f2.length);
                        System.arraycopy(f2, 0, copy, f.length, f2.length);
                        b = new com.google.android.exoplayer2.drm.b(s, true, (b$b[])copy);
                        list.remove(j);
                    }
                    else {
                        ++j;
                    }
                }
                hashMap.put(h, b);
            }
        }
        else {
            emptyMap = Collections.emptyMap();
        }
        final boolean empty = e.e.isEmpty();
        final List g = e.g;
        final List h4 = e.h;
        this.w = 0;
        final ArrayList<hc.l> list2 = new ArrayList<hc.l>();
        final ArrayList<int[]> list3 = new ArrayList<int[]>();
        if (empty ^ true) {
            final int size = e.e.size();
            final int[] array = new int[size];
            int n6;
            int n5 = n6 = 0;
            while (i < e.e.size()) {
                final n b4 = e.e.get(i).b;
                if (b4.w <= 0 && c0.r(2, b4.n) == null) {
                    if (c0.r(1, b4.n) != null) {
                        array[i] = 1;
                        ++n6;
                    }
                    else {
                        array[i] = -1;
                    }
                }
                else {
                    array[i] = 2;
                    ++n5;
                }
                ++i;
            }
            int n10 = 0;
            int n11 = 0;
            int n12 = 0;
            Label_0575: {
                int n7;
                int n8;
                if (n5 > 0) {
                    n7 = n5;
                    n8 = n3;
                }
                else {
                    if (n6 < size) {
                        final int n9 = 0;
                        n10 = size - n6;
                        n11 = n9;
                        n12 = n2;
                        break Label_0575;
                    }
                    n8 = 0;
                    n7 = size;
                }
                final int n13 = n7;
                final int n14 = 0;
                n11 = n8;
                n10 = n13;
                n12 = n14;
            }
            final Uri[] array2 = new Uri[n10];
            final n[] array3 = new n[n10];
            final int[] array4 = new int[n10];
            int k = 0;
            int n15 = 0;
            while (k < e.e.size()) {
                int n16 = 0;
                Label_0705: {
                    if (n11 != 0) {
                        n16 = n15;
                        if (array[k] != 2) {
                            break Label_0705;
                        }
                    }
                    if (n12 != 0) {
                        n16 = n15;
                        if (array[k] == 1) {
                            break Label_0705;
                        }
                    }
                    final d$b d$b = e.e.get(k);
                    array2[n15] = d$b.a;
                    array3[n15] = d$b.b;
                    array4[n15] = k;
                    n16 = n15 + 1;
                }
                ++k;
                n15 = n16;
            }
            final String n17 = array3[0].n;
            final int q = c0.q(2, n17);
            final int q2 = c0.q(1, n17);
            final boolean b5 = q2 <= 1 && q <= 1 && q2 + q > 0;
            int n18;
            if (n11 == 0 && q2 > 0) {
                n18 = 1;
            }
            else {
                n18 = 0;
            }
            final hc.l n19 = this.n("main", n18, array2, array3, e.j, e.k, (Map<String, com.google.android.exoplayer2.drm.b>)emptyMap, n);
            list2.add(n19);
            list3.add(array4);
            if (this.r && b5) {
                final ArrayList<t> list4 = new ArrayList<t>();
                if (q > 0) {
                    final n[] array5 = new n[n10];
                    for (int l = 0; l < n10; ++l) {
                        final n n20 = array3[l];
                        final String r = c0.r(2, n20.n);
                        final String e2 = bd.o.e(r);
                        final n$a n$a = new n$a();
                        n$a.a = n20.f;
                        n$a.b = n20.g;
                        n$a.j = n20.p;
                        n$a.k = e2;
                        n$a.h = r;
                        n$a.i = n20.o;
                        n$a.f = n20.k;
                        n$a.g = n20.l;
                        n$a.p = n20.v;
                        n$a.q = n20.w;
                        n$a.r = n20.x;
                        n$a.d = n20.i;
                        n$a.e = n20.j;
                        array5[l] = new n(n$a);
                    }
                    list4.add(new t("main", array5));
                    if (q2 > 0 && (e.j != null || e.g.isEmpty())) {
                        list4.add(new t("main".concat(":audio"), new n[] { p(array3[0], e.j, false) }));
                    }
                    final List k2 = e.k;
                    if (k2 != null) {
                        for (int n21 = 0; n21 < k2.size(); ++n21) {
                            final StringBuilder sb = new StringBuilder(19);
                            sb.append("main");
                            sb.append(":cc:");
                            sb.append(n21);
                            list4.add(new t(sb.toString(), new n[] { k2.get(n21) }));
                        }
                    }
                }
                else {
                    final n[] array6 = new n[n10];
                    for (int n22 = 0; n22 < n10; ++n22) {
                        array6[n22] = p(array3[n22], e.j, true);
                    }
                    list4.add(new t("main", array6));
                }
                final String concat = "main".concat(":id3");
                final n$a n$a2 = new n$a();
                n$a2.a = "ID3";
                n$a2.k = "application/id3";
                final t t2 = new t(concat, new n[] { new n(n$a2) });
                list4.add(t2);
                n19.F((t[])list4.toArray(new t[0]), new int[] { list4.indexOf(t2) });
            }
        }
        final Map<Object, Object> map = emptyMap;
        final List list5 = g;
        final ArrayList<int[]> list6 = list3;
        final ArrayList list7 = new ArrayList(list5.size());
        final ArrayList list8 = new ArrayList(list5.size());
        final ArrayList list9 = new ArrayList(list5.size());
        final HashSet<String> set = new HashSet<String>();
        for (int n23 = 0; n23 < list5.size(); ++n23) {
            final String c = list5.get(n23).c;
            if (set.add(c)) {
                list7.clear();
                list8.clear();
                list9.clear();
                int n24 = 0;
                int n25 = 1;
                while (n24 < list5.size()) {
                    int n26 = n25;
                    if (c0.a(c, ((d$a)list5.get(n24)).c)) {
                        final d$a d$a = list5.get(n24);
                        list9.add((Object)n24);
                        list7.add((Object)d$a.a);
                        list8.add((Object)d$a.b);
                        n26 = (n25 & ((c0.q(1, d$a.b.n) == 1) ? 1 : 0));
                    }
                    ++n24;
                    n25 = n26;
                }
                final String value = String.valueOf(c);
                String concat2;
                if (value.length() != 0) {
                    concat2 = "audio:".concat(value);
                }
                else {
                    concat2 = new String("audio:");
                }
                final int a2 = c0.a;
                final hc.l n27 = this.n(concat2, 1, (Uri[])list7.toArray((Object[])new Uri[0]), (n[])list8.toArray((Object[])new n[0]), null, Collections.emptyList(), (Map<String, com.google.android.exoplayer2.drm.b>)map, n);
                list6.add(Ints.v2((Collection)list9));
                list2.add(n27);
                if (this.r && n25 != 0) {
                    n27.F(new t[] { new t(concat2, (n[])list8.toArray((Object[])new n[0])) }, new int[0]);
                }
            }
        }
        this.A = list2.size();
        for (int n28 = 0; n28 < h4.size(); ++n28) {
            final d$a d$a2 = h4.get(n28);
            final String c2 = d$a2.c;
            final StringBuilder sb2 = new StringBuilder(ak0.n.f(c2, 21));
            sb2.append("subtitle:");
            sb2.append(n28);
            sb2.append(":");
            sb2.append(c2);
            final String string = sb2.toString();
            final hc.l n29 = this.n(string, 3, new Uri[] { d$a2.a }, new n[] { d$a2.b }, null, Collections.emptyList(), (Map<String, com.google.android.exoplayer2.drm.b>)map, n);
            list6.add(new int[] { n28 });
            list2.add(n29);
            n29.F(new t[] { new t(string, new n[] { d$a2.b }) }, new int[0]);
        }
        int n30 = 0;
        this.y = list2.toArray(new hc.l[0]);
        final int[][] array7 = list6.toArray(new int[0][]);
        final hc.l[] y = this.y;
        this.w = y.length;
        y[0].i.l = true;
        while (n30 < y.length) {
            final hc.l l2 = y[n30];
            if (!l2.I) {
                l2.c(l2.U);
            }
            ++n30;
        }
        this.z = this.y;
    }
    
    public final void r() {
        final int w = this.w - 1;
        this.w = w;
        if (w > 0) {
            return;
        }
        final hc.l[] y = this.y;
        int n;
        for (int length = y.length, i = n = 0; i < length; ++i) {
            final hc.l l = y[i];
            l.v();
            n += l.N.f;
        }
        final t[] array = new t[n];
        final hc.l[] y2 = this.y;
        int n2;
        for (int length2 = y2.length, j = n2 = 0; j < length2; ++j) {
            final hc.l k = y2[j];
            k.v();
            for (int f = k.N.f, n3 = 0; n3 < f; ++n3, ++n2) {
                k.v();
                array[n2] = k.N.a(n3);
            }
        }
        this.x = new u(array);
        this.v.m((h)this);
    }
    
    public final void t() throws IOException {
        for (final hc.l l : this.y) {
            l.E();
            if (l.Y && !l.I) {
                throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", (Throwable)null);
            }
        }
    }
    
    public final void u(final long n, final boolean b) {
        for (final hc.l l : this.z) {
            if (l.H) {
                if (!l.C()) {
                    for (int length2 = l.A.length, j = 0; j < length2; ++j) {
                        l.A[j].h(n, b, l.S[j]);
                    }
                }
            }
        }
    }
}
