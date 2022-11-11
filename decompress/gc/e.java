// 
// Decompiled by Procyon v0.6.0
// 

package gc;

import cc.m;
import com.google.android.exoplayer2.upstream.b;
import ad.b0;
import com.google.android.exoplayer2.source.hls.playlist.c$a;
import android.util.Pair;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import com.google.android.exoplayer2.source.hls.playlist.c$c;
import java.util.Collection;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import yc.s;
import wc.f;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import wa.c0;
import java.util.List;
import ac.t;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.n;
import android.net.Uri;
import androidx.lifecycle.w;
import com.google.android.exoplayer2.upstream.a;

public final class e
{
    public final g a;
    public final a b;
    public final a c;
    public final w d;
    public final Uri[] e;
    public final n[] f;
    public final HlsPlaylistTracker g;
    public final t h;
    public final List<n> i;
    public final com.google.android.exoplayer2.source.hls.a j;
    public final c0 k;
    public boolean l;
    public byte[] m;
    public BehindLiveWindowException n;
    public Uri o;
    public boolean p;
    public f q;
    public long r;
    public boolean s;
    
    public e(final g a, final HlsPlaylistTracker g, final Uri[] e, final n[] f, final gc.f f2, final s s, final w d, final List<n> i, final c0 k) {
        this.a = a;
        this.g = g;
        this.e = e;
        this.f = f;
        this.d = d;
        this.i = i;
        this.k = k;
        this.j = new com.google.android.exoplayer2.source.hls.a();
        this.m = ad.c0.f;
        this.r = -9223372036854775807L;
        final a a2 = f2.a();
        this.b = a2;
        if (s != null) {
            a2.i(s);
        }
        this.c = f2.a();
        this.h = new t("", f);
        final ArrayList list = new ArrayList();
        for (int j = 0; j < e.length; ++j) {
            if ((f[j].j & 0x4000) == 0x0) {
                list.add(j);
            }
        }
        this.q = (f)new e$d(this.h, Ints.g1((Collection)list));
    }
    
    public final cc.n[] a(final h h, final long n) {
        int a;
        if (h == null) {
            a = -1;
        }
        else {
            a = this.h.a(((e)h).d);
        }
        final int length = this.q.length();
        final cc.n[] array = new cc.n[length];
        for (int i = 0; i < length; ++i) {
            final int c = this.q.c(i);
            final Uri uri = this.e[c];
            if (!this.g.h(uri)) {
                array[i] = (cc.n)cc.n.a;
            }
            else {
                final c k = this.g.k(uri, false);
                k.getClass();
                final long n2 = k.h - this.g.b();
                final Pair<Long, Integer> c2 = this.c(h, c != a, k, n2, n);
                final long longValue = (long)c2.first;
                final int intValue = (int)c2.second;
                final int n3 = (int)(longValue - k.k);
                Object o;
                if (n3 >= 0 && ((List)k.r).size() >= n3) {
                    final ArrayList<Object> list = new ArrayList<Object>();
                    int n4 = intValue;
                    if (n3 < ((List)k.r).size()) {
                        int n5 = n3;
                        if (intValue != -1) {
                            final c$c c$c = ((List<c$c>)k.r).get(n3);
                            if (intValue == 0) {
                                list.add(c$c);
                            }
                            else if (intValue < ((List)c$c.r).size()) {
                                final ImmutableList r = c$c.r;
                                list.addAll(((List)r).subList(intValue, ((List)r).size()));
                            }
                            n5 = n3 + 1;
                        }
                        final ImmutableList r2 = k.r;
                        list.addAll(((List)r2).subList(n5, ((List)r2).size()));
                        n4 = 0;
                    }
                    if (k.n != -9223372036854775807L) {
                        int n6;
                        if ((n6 = n4) == -1) {
                            n6 = 0;
                        }
                        if (n6 < ((List)k.s).size()) {
                            final ImmutableList s = k.s;
                            list.addAll(((List)s).subList(n6, ((List)s).size()));
                        }
                    }
                    o = Collections.unmodifiableList((List<?>)list);
                }
                else {
                    o = ImmutableList.of();
                }
                array[i] = (cc.n)new e$c(n2, (List)o);
            }
        }
        return array;
    }
    
    public final int b(final h h) {
        final int o = h.o;
        int n = 1;
        if (o == -1) {
            return 1;
        }
        final c k = this.g.k(this.e[this.h.a(((e)h).d)], false);
        k.getClass();
        final int n2 = (int)(((m)h).j - k.k);
        if (n2 < 0) {
            return 1;
        }
        ImmutableList list;
        if (n2 < ((List)k.r).size()) {
            list = ((List<c$c>)k.r).get(n2).r;
        }
        else {
            list = k.s;
        }
        if (h.o >= ((List)list).size()) {
            return 2;
        }
        final c$a c$a = (c$a)((List)list).get(h.o);
        if (c$a.r) {
            return 0;
        }
        if (!ad.c0.a(Uri.parse(b0.c(((ic.c)k).a, ((c.d)c$a).f)), ((e)h).b.a)) {
            n = 2;
        }
        return n;
    }
    
    public final Pair<Long, Integer> c(final h h, final boolean b, final c c, long n, long n2) {
        final boolean b2 = true;
        int n3 = -1;
        if (h != null && !b) {
            Pair pair;
            if (h.H) {
                if (h.o == -1) {
                    n = ((m)h).b();
                }
                else {
                    n = ((m)h).j;
                }
                final int o = h.o;
                if (o != -1) {
                    n3 = o + 1;
                }
                pair = new Pair((Object)n, (Object)n3);
            }
            else {
                pair = new Pair((Object)((m)h).j, (Object)h.o);
            }
            return (Pair<Long, Integer>)pair;
        }
        final long u = c.u;
        long g = n2;
        if (h != null) {
            if (this.p) {
                g = n2;
            }
            else {
                g = ((e)h).g;
            }
        }
        if (!c.o && g >= u + n) {
            return (Pair<Long, Integer>)new Pair((Object)(c.k + ((List)c.r).size()), (Object)(-1));
        }
        final long n4 = g - n;
        final ImmutableList r = c.r;
        final boolean live = this.g.isLive();
        int n5 = 0;
        boolean b3 = b2;
        if (live) {
            b3 = (h == null && b2);
        }
        final int d = ad.c0.d((List)r, n4, b3);
        n2 = d + c.k;
        int n6 = n3;
        n = n2;
        if (d >= 0) {
            final c$c c$c = ((List<c$c>)c.r).get(d);
            ImmutableList list;
            if (n4 < ((c.d)c$c).j + ((c.d)c$c).h) {
                list = c$c.r;
            }
            else {
                list = c.s;
            }
            while (true) {
                n6 = n3;
                n = n2;
                if (n5 >= ((List)list).size()) {
                    break;
                }
                final c$a c$a = (c$a)((List)list).get(n5);
                if (n4 < ((c.d)c$a).j + ((c.d)c$a).h) {
                    n6 = n3;
                    n = n2;
                    if (c$a.q) {
                        if (list == c.s) {
                            n = 1L;
                        }
                        else {
                            n = 0L;
                        }
                        n += n2;
                        n6 = n5;
                        break;
                    }
                    break;
                }
                else {
                    ++n5;
                }
            }
        }
        return (Pair<Long, Integer>)new Pair((Object)n, (Object)n6);
    }
    
    public final e$a d(final Uri a, final int n) {
        if (a == null) {
            return null;
        }
        final byte[] array = this.j.a.remove(a);
        if (array != null) {
            final byte[] array2 = this.j.a.put(a, array);
            return null;
        }
        final com.google.android.exoplayer2.upstream.b.a a2 = new com.google.android.exoplayer2.upstream.b.a();
        a2.a = a;
        a2.i = 1;
        return new e$a(this.c, a2.a(), this.f[n], this.q.u(), this.q.r(), this.m);
    }
    
    public static final class b
    {
        public e a;
        public boolean b;
        public Uri c;
        
        public b() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }
    
    public static final class e
    {
        public final c.d a;
        public final long b;
        public final int c;
        public final boolean d;
        
        public e(final c.d a, final long b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = (a instanceof c$a && ((c$a)a).r);
        }
    }
}
