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
import java.util.Map;
import com.google.android.exoplayer2.upstream.h$b;
import com.google.android.exoplayer2.upstream.h$c;
import com.google.android.exoplayer2.source.hls.playlist.c;
import android.net.Uri;
import com.google.android.exoplayer2.source.hls.playlist.c$c;
import java.util.List;
import wa.i0;
import qb.a;
import com.google.android.exoplayer2.n$a;
import bd.p;
import bd.c0;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.h$a;
import xa.d0;
import bu0.e;
import androidx.compose.ui.platform.k0;
import bc.o;
import java.util.IdentityHashMap;
import zc.b;
import com.google.android.exoplayer2.source.j$a;
import com.google.android.exoplayer2.drm.c$a;
import com.google.android.exoplayer2.drm.d;
import zc.t;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import h.s;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a;
import com.google.android.exoplayer2.source.h;

public final class j implements h, l$a, HlsPlaylistTracker$a
{
    public int A;
    public s B;
    public final g f;
    public final HlsPlaylistTracker g;
    public final f h;
    public final t i;
    public final d j;
    public final c$a k;
    public final com.google.android.exoplayer2.upstream.h l;
    public final j$a m;
    public final b n;
    public final IdentityHashMap<o, Integer> o;
    public final k0 p;
    public final e q;
    public final boolean r;
    public final int s;
    public final boolean t;
    public final d0 u;
    public h$a v;
    public int w;
    public bc.t x;
    public l[] y;
    public l[] z;
    
    public j(final g f, final HlsPlaylistTracker g, final f h, final t i, final d j, final c$a k, final com.google.android.exoplayer2.upstream.h l, final j$a m, final b n, final e q, final boolean r, final int s, final boolean t, final d0 u) {
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
        this.B = e.d(new q[0]);
        this.o = new IdentityHashMap<o, Integer>();
        this.p = new k0(3);
        this.y = new l[0];
        this.z = new l[0];
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
                b2 = null;
                e = 0;
                o = o2;
                h2 = s;
            }
        }
        final String e2 = p.e(h2);
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
        for (final l l : this.y) {
            if (!l.s.isEmpty()) {
                final hc.h h = (hc.h)cg.d.Q2((Iterable)l.s);
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
            for (final l l : this.y) {
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
    
    public final long g(long j, final i0 i0) {
        final l[] z = this.z;
        final int length = z.length;
        int k = 0;
        while (k < length) {
            final l l = z[k];
            if (l.F == 2) {
                final hc.e m = l.i;
                final int b = m.q.b();
                final Uri[] e = m.e;
                c k2;
                if (b < e.length && b != -1) {
                    k2 = m.g.k(e[m.q.l()], true);
                }
                else {
                    k2 = null;
                }
                if (k2 == null || ((List)k2.r).isEmpty()) {
                    break;
                }
                if (!((jc.c)k2).c) {
                    break;
                }
                final long n = k2.h - m.g.b();
                final long n2 = j - n;
                final int d = c0.d((List)k2.r, Long.valueOf(n2), true);
                final long j2 = ((c$d)((List<c$c>)k2.r).get(d)).j;
                if (d != ((List)k2.r).size() - 1) {
                    j = ((c$d)((List<Object>)k2.r).get(d + 1)).j;
                }
                else {
                    j = j2;
                }
                j = i0.a(n2, j2, j) + n;
                break;
            }
            else {
                ++k;
            }
        }
        return j;
    }
    
    public final boolean h(final Uri uri, final h$c h$c, final boolean b) {
        final l[] y = this.y;
        final int length = y.length;
        int i = 0;
        boolean b2 = true;
        while (i < length) {
            final l l = y[i];
            boolean b5 = false;
            Label_0284: {
                if (c0.k((Object)uri, (Object[])l.i.e)) {
                    long b3 = 0L;
                    Label_0106: {
                        if (!b) {
                            final h$b fallbackSelection = l.n.getFallbackSelectionFor(xc.l.a(l.i.q), h$c);
                            if (fallbackSelection != null && fallbackSelection.a == 2) {
                                b3 = fallbackSelection.b;
                                break Label_0106;
                            }
                        }
                        b3 = -9223372036854775807L;
                    }
                    final hc.e j = l.i;
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
                            final int h = ((xc.h)j.q).h(n);
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
    
    public final long i(final long n) {
        final l[] z = this.z;
        if (z.length > 0) {
            final boolean h = z[0].H(n, false);
            int n2 = 1;
            while (true) {
                final l[] z2 = this.z;
                if (n2 >= z2.length) {
                    break;
                }
                z2[n2].H(n, h);
                ++n2;
            }
            if (h) {
                this.p.p();
            }
        }
        return n;
    }
    
    public final long j() {
        return -9223372036854775807L;
    }
    
    public final void k(final q q) {
        final l l = (l)q;
        ((q$a)this.v).k((q)this);
    }
    
    public final bc.t l() {
        final bc.t x = this.x;
        x.getClass();
        return x;
    }
    
    public final l n(final String s, final int n, final Uri[] array, final n[] array2, final n n2, final List<n> list, final Map<String, com.google.android.exoplayer2.drm.b> map, final long n3) {
        return new l(s, n, (l$a)this, new hc.e(this.f, this.g, array, array2, this.h, this.i, this.p, (List)list, this.u), (Map)map, this.n, n3, n2, this.j, this.k, this.l, this.m, this.s);
    }
    
    public final long o(final xc.e[] array, final boolean[] array2, final o[] array3, final boolean[] array4, final long n) {
        final int[] array5 = new int[array.length];
        final int[] array6 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            final o o = array3[i];
            int intValue;
            if (o == null) {
                intValue = -1;
            }
            else {
                intValue = this.o.get(o);
            }
            array5[i] = intValue;
            array6[i] = -1;
            final xc.e e = array[i];
            if (e != null) {
                final bc.s j = ((xc.h)e).i();
                int n2 = 0;
                while (true) {
                    final l[] y = this.y;
                    if (n2 >= y.length) {
                        break;
                    }
                    final l l = y[n2];
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
        final o[] array7 = new o[length];
        final int length2 = array.length;
        final o[] array8 = new o[length2];
        final int length3 = array.length;
        final xc.e[] array9 = new xc.e[length3];
        final l[] array10 = new l[this.y.length];
        int k = 0;
        int n3 = 0;
        int n4 = 0;
        while (k < this.y.length) {
            for (int n5 = 0; n5 < array.length; ++n5) {
                o o2;
                if (array5[n5] == k) {
                    o2 = array3[n5];
                }
                else {
                    o2 = null;
                }
                array8[n5] = o2;
                xc.e e2;
                if (array6[n5] == k) {
                    e2 = array[n5];
                }
                else {
                    e2 = null;
                }
                array9[n5] = e2;
            }
            final l m = this.y[k];
            m.v();
            final int j2 = m.J;
            for (int n6 = 0; n6 < length3; ++n6) {
                final k k2 = (k)array8[n6];
                if (k2 != null && (array9[n6] == null || !array2[n6])) {
                    --m.J;
                    if (k2.h != -1) {
                        final l g = k2.g;
                        final int f = k2.f;
                        g.v();
                        g.P.getClass();
                        final int n7 = g.P[f];
                        ah0.b.H(g.S[n7]);
                        g.S[n7] = false;
                        k2.h = -1;
                    }
                    array8[n6] = null;
                }
            }
            int n8;
            if (n4 || (m.X ? (j2 == 0) : (n != m.U))) {
                n8 = 1;
            }
            else {
                n8 = 0;
            }
            xc.e q;
            final xc.e e3 = q = m.i.q;
            xc.e e4;
            int n10;
            for (int n9 = 0; n9 < length3; ++n9, q = e4, n8 = n10) {
                final xc.e q2 = array9[n9];
                if (q2 == null) {
                    e4 = q;
                    n10 = n8;
                }
                else {
                    final int b = m.N.b(((xc.h)q2).i());
                    if (b == m.Q) {
                        m.i.q = q2;
                        q = q2;
                    }
                    e4 = q;
                    n10 = n8;
                    if (array8[n9] == null) {
                        ++m.J;
                        final k k3 = new k(m, b);
                        array8[n9] = (o)k3;
                        array4[n9] = true;
                        e4 = q;
                        n10 = n8;
                        if (m.P != null) {
                            k3.a();
                            e4 = q;
                            if ((n10 = n8) == 0) {
                                final l.c c = m.A[m.P[b]];
                                int n11;
                                if (!c.y(n, true) && c.q + c.s != 0) {
                                    n11 = 1;
                                }
                                else {
                                    n11 = 0;
                                }
                                n10 = n11;
                                e4 = q;
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
                        final l.c[] a = m.A;
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
                Label_1016: {
                    if (!m.s.isEmpty() && !c0.a((Object)q, (Object)e3)) {
                        boolean b2 = false;
                        Label_0992: {
                            if (!m.X) {
                                long n13 = 0L;
                                if (n < 0L) {
                                    n13 = -n;
                                }
                                final hc.h a2 = m.A();
                                q.a(n, n13, -9223372036854775807L, m.t, m.i.a(a2, n));
                                if (q.l() == m.i.h.a(((dc.e)a2).d)) {
                                    b2 = false;
                                    break Label_0992;
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            m.W = true;
                            b3 = true;
                            n8 = 1;
                            break Label_1016;
                        }
                    }
                    b3 = (n4 != 0);
                }
                if (n8 != 0) {
                    m.H(n, b3);
                    for (int n14 = 0; n14 < length2; ++n14) {
                        if (array8[n14] != null) {
                            array4[n14] = true;
                        }
                    }
                }
            }
            m.x.clear();
            for (final o o3 : array8) {
                if (o3 != null) {
                    m.x.add(o3);
                }
            }
            int n16 = 1;
            m.X = true;
            int n17 = 0;
            int n19;
            for (int n18 = 0; n18 < array.length; ++n18, n17 = n19) {
                final o o4 = array8[n18];
                if (array6[n18] == k) {
                    o4.getClass();
                    array7[n18] = o4;
                    this.o.put(o4, k);
                    n19 = n16;
                }
                else {
                    n19 = n17;
                    if (array5[n18] == k) {
                        boolean b4;
                        if (o4 == null) {
                            b4 = (n16 != 0);
                        }
                        else {
                            b4 = false;
                        }
                        ah0.b.H(b4);
                        n19 = n17;
                    }
                }
            }
            Label_1349: {
                if (n17 != 0) {
                    array10[n3] = m;
                    final int n20 = n3 + 1;
                    if (n3 == 0) {
                        m.i.l = (n16 != 0);
                        if (n8 == 0) {
                            final l[] z = this.z;
                            if (z.length != 0) {
                                n3 = n20;
                                if (m == z[0]) {
                                    break Label_1349;
                                }
                            }
                        }
                        this.p.p();
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
        }
        System.arraycopy(array7, 0, array3, 0, length);
        final l[] z2 = (l[])c0.L(n3, (Object[])array10);
        this.z = z2;
        this.q.getClass();
        this.B = e.d((q[])z2);
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
        Map<String, com.google.android.exoplayer2.drm.b> emptyMap;
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
                        ah0.b.H(b3);
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
        final ArrayList<l> list2 = new ArrayList<l>();
        final ArrayList<int[]> list3 = new ArrayList<int[]>();
        if (empty ^ true) {
            final int size = e.e.size();
            final int[] array = new int[size];
            int n5 = 0;
            int n6 = 0;
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
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            Label_0578: {
                int n7;
                int n8;
                if (n5 > 0) {
                    n7 = n5;
                    n8 = n3;
                }
                else {
                    if (n6 < size) {
                        final int n9 = 0;
                        final int n10 = size - n6;
                        n11 = n9;
                        n12 = n2;
                        n13 = n10;
                        break Label_0578;
                    }
                    n8 = 0;
                    n7 = size;
                }
                final int n14 = n7;
                final int n15 = 0;
                n11 = n8;
                n13 = n14;
                n12 = n15;
            }
            final Uri[] array2 = new Uri[n13];
            final n[] array3 = new n[n13];
            final int[] array4 = new int[n13];
            int k = 0;
            int n16 = 0;
            while (k < e.e.size()) {
                int n17 = 0;
                Label_0708: {
                    if (n11 != 0) {
                        n17 = n16;
                        if (array[k] != 2) {
                            break Label_0708;
                        }
                    }
                    if (n12 != 0) {
                        n17 = n16;
                        if (array[k] == 1) {
                            break Label_0708;
                        }
                    }
                    final d$b d$b = e.e.get(k);
                    array2[n16] = d$b.a;
                    array3[n16] = d$b.b;
                    array4[n16] = k;
                    n17 = n16 + 1;
                }
                ++k;
                n16 = n17;
            }
            final String n18 = array3[0].n;
            final int q = c0.q(2, n18);
            final int q2 = c0.q(1, n18);
            final boolean b5 = q2 <= 1 && q <= 1 && q2 + q > 0;
            int n19;
            if (n11 == 0 && q2 > 0) {
                n19 = 1;
            }
            else {
                n19 = 0;
            }
            final l n20 = this.n("main", n19, array2, array3, e.j, e.k, emptyMap, n);
            list2.add(n20);
            list3.add(array4);
            if (this.r && b5) {
                final ArrayList<bc.s> list4 = new ArrayList<bc.s>();
                if (q > 0) {
                    final n[] array5 = new n[n13];
                    for (int l = 0; l < n13; ++l) {
                        final n n21 = array3[l];
                        final String r = c0.r(2, n21.n);
                        final String e2 = bd.p.e(r);
                        final n$a n$a = new n$a();
                        n$a.a = n21.f;
                        n$a.b = n21.g;
                        n$a.j = n21.p;
                        n$a.k = e2;
                        n$a.h = r;
                        n$a.i = n21.o;
                        n$a.f = n21.k;
                        n$a.g = n21.l;
                        n$a.p = n21.v;
                        n$a.q = n21.w;
                        n$a.r = n21.x;
                        n$a.d = n21.i;
                        n$a.e = n21.j;
                        array5[l] = new n(n$a);
                    }
                    list4.add(new bc.s("main", array5));
                    if (q2 > 0 && (e.j != null || e.g.isEmpty())) {
                        list4.add(new bc.s("main".concat(":audio"), new n[] { p(array3[0], e.j, false) }));
                    }
                    final List k2 = e.k;
                    if (k2 != null) {
                        for (int n22 = 0; n22 < k2.size(); ++n22) {
                            final StringBuilder sb = new StringBuilder(19);
                            sb.append("main");
                            sb.append(":cc:");
                            sb.append(n22);
                            list4.add(new bc.s(sb.toString(), new n[] { k2.get(n22) }));
                        }
                    }
                }
                else {
                    final n[] array6 = new n[n13];
                    for (int n23 = 0; n23 < n13; ++n23) {
                        array6[n23] = p(array3[n23], e.j, true);
                    }
                    list4.add(new bc.s("main", array6));
                }
                final String concat = "main".concat(":id3");
                final n$a n$a2 = new n$a();
                n$a2.a = "ID3";
                n$a2.k = "application/id3";
                final bc.s s2 = new bc.s(concat, new n[] { new n(n$a2) });
                list4.add(s2);
                n20.F((bc.s[])list4.toArray(new bc.s[0]), new int[] { list4.indexOf(s2) });
            }
        }
        final ArrayList list5 = new ArrayList(g.size());
        final ArrayList list6 = new ArrayList(g.size());
        final ArrayList list7 = new ArrayList<Integer>(g.size());
        final HashSet<String> set = new HashSet<String>();
        for (int n24 = 0; n24 < g.size(); ++n24) {
            final String c = g.get(n24).c;
            if (set.add(c)) {
                list5.clear();
                list6.clear();
                list7.clear();
                int n25 = 0;
                int n26 = 1;
                while (n25 < g.size()) {
                    int n27 = n26;
                    if (c0.a((Object)c, (Object)((d$a)g.get(n25)).c)) {
                        final d$a d$a = g.get(n25);
                        list7.add((Object)n25);
                        list5.add((Object)d$a.a);
                        list6.add((Object)d$a.b);
                        n27 = (n26 & ((c0.q(1, d$a.b.n) == 1) ? 1 : 0));
                    }
                    ++n25;
                    n26 = n27;
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
                final l n28 = this.n(concat2, 1, (Uri[])list5.toArray((Object[])new Uri[0]), (n[])list6.toArray((Object[])new n[0]), null, Collections.emptyList(), emptyMap, n);
                list3.add(Ints.v0((Collection)list7));
                list2.add(n28);
                if (this.r && n26 != 0) {
                    n28.F(new bc.s[] { new bc.s(concat2, (n[])list6.toArray((Object[])new n[0])) }, new int[0]);
                }
            }
        }
        this.A = list2.size();
        for (int n29 = 0; n29 < h4.size(); ++n29) {
            final d$a d$a2 = h4.get(n29);
            final String c2 = d$a2.c;
            final StringBuilder sb2 = new StringBuilder(u10.o.e(c2, 21));
            sb2.append("subtitle:");
            sb2.append(n29);
            sb2.append(":");
            sb2.append(c2);
            final String string = sb2.toString();
            final l n30 = this.n(string, 3, new Uri[] { d$a2.a }, new n[] { d$a2.b }, null, Collections.emptyList(), emptyMap, n);
            list3.add(new int[] { n29 });
            list2.add(n30);
            n30.F(new bc.s[] { new bc.s(string, new n[] { d$a2.b }) }, new int[0]);
        }
        int n31 = 0;
        this.y = list2.toArray(new l[0]);
        final int[][] array7 = list3.toArray(new int[0][]);
        final l[] y = this.y;
        this.w = y.length;
        y[0].i.l = true;
        while (n31 < y.length) {
            final l l2 = y[n31];
            if (!l2.I) {
                l2.c(l2.U);
            }
            ++n31;
        }
        this.z = this.y;
    }
    
    public final void r() {
        final int w = this.w - 1;
        this.w = w;
        if (w > 0) {
            return;
        }
        final l[] y = this.y;
        final int length = y.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final l l = y[i];
            l.v();
            n += l.N.f;
            ++i;
        }
        final bc.s[] array = new bc.s[n];
        final l[] y2 = this.y;
        final int length2 = y2.length;
        int j = 0;
        int n2 = 0;
        while (j < length2) {
            final l k = y2[j];
            k.v();
            for (int f = k.N.f, n3 = 0; n3 < f; ++n3, ++n2) {
                k.v();
                array[n2] = k.N.a(n3);
            }
            ++j;
        }
        this.x = new bc.t(array);
        this.v.m((h)this);
    }
    
    public final void t() throws IOException {
        for (final l l : this.y) {
            l.E();
            if (l.Y && !l.I) {
                throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", (Throwable)null);
            }
        }
    }
    
    public final void u(final long n, final boolean b) {
        for (final l l : this.z) {
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
