// 
// Decompiled by Procyon v0.6.0
// 

package xc;

import java.util.AbstractCollection;
import com.google.common.collect.ImmutableCollection$a;
import bd.c0;
import dc.n;
import java.util.List;
import com.google.common.collect.ImmutableList$a;
import java.util.ArrayList;
import java.util.Collection;
import android.util.Log;
import bc.t;
import dc.m;
import bd.c;
import com.google.common.collect.ImmutableList;
import zc.d;

public final class a extends xc.b
{
    public final d g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final ImmutableList<a> o;
    public final c p;
    public float q;
    public int r;
    public int s;
    public long t;
    public m u;
    
    public a(final t t, final int[] array, final int n, final d g, final long n2, final long n3, long n4, final int k, final int l, final float m, final float n5, final ImmutableList list, final c p13) {
        super(t, array);
        if (n4 < n2) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            n4 = n2;
        }
        this.g = g;
        this.h = n2 * 1000L;
        this.i = n3 * 1000L;
        this.j = n4 * 1000L;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n5;
        this.o = (ImmutableList<a>)ImmutableList.copyOf((Collection)list);
        this.p = p13;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }
    
    public static void v(final ArrayList list, final long[] array) {
        final int n = 0;
        long n2 = 0L;
        int n3 = 0;
        int i;
        while (true) {
            i = n;
            if (n3 >= array.length) {
                break;
            }
            n2 += array[n3];
            ++n3;
        }
        while (i < list.size()) {
            final ImmutableList$a immutableList$a = list.get(i);
            if (immutableList$a != null) {
                ((ImmutableCollection$a)immutableList$a).c((Object)new a(n2, array[i]));
            }
            ++i;
        }
    }
    
    public static long x(final List list) {
        final boolean empty = list.isEmpty();
        final long n = -9223372036854775807L;
        if (empty) {
            return -9223372036854775807L;
        }
        final m m = (m)a.R(list);
        final long g = m.g;
        long n2 = n;
        if (g != -9223372036854775807L) {
            final long h = m.h;
            n2 = n;
            if (h != -9223372036854775807L) {
                n2 = h - g;
            }
        }
        return n2;
    }
    
    @Override
    public final void a(long n, final long n2, final long n3, final List<? extends m> list, final n[] array) {
        final long d = this.p.d();
        final int r = this.r;
        Label_0136: {
            long n5 = 0L;
            Label_0116: {
                if (r >= array.length || !array[r].next()) {
                    for (final n n4 : array) {
                        if (n4.next()) {
                            n = n4.a();
                            n5 = n4.b();
                            break Label_0116;
                        }
                    }
                    n = x(list);
                    break Label_0136;
                }
                final n n6 = array[this.r];
                n = n6.a();
                n5 = n6.b();
            }
            n -= n5;
        }
        int s = this.s;
        if (s == 0) {
            this.s = 1;
            this.r = this.w(d, n);
            return;
        }
        int r2 = this.r;
        int t;
        if (list.isEmpty()) {
            t = -1;
        }
        else {
            t = this.t(((m)a.R(list)).d);
        }
        if (t != -1) {
            s = ((m)a.R(list)).e;
            r2 = t;
        }
        int w;
        final int n7 = w = this.w(d, n);
        Label_0380: {
            if (!this.e(r2, d)) {
                final com.google.android.exoplayer2.n[] d2 = super.d;
                final com.google.android.exoplayer2.n n8 = d2[r2];
                final com.google.android.exoplayer2.n n9 = d2[n7];
                if (n3 == -9223372036854775807L) {
                    n = this.h;
                }
                else {
                    long n10 = n3;
                    if (n != -9223372036854775807L) {
                        n10 = n3 - n;
                    }
                    n = Math.min((long)(n10 * this.n), this.h);
                }
                final int m = n9.m;
                final int j = n8.m;
                if (m <= j || n2 >= n) {
                    w = n7;
                    if (m >= j) {
                        break Label_0380;
                    }
                    w = n7;
                    if (n2 < this.i) {
                        break Label_0380;
                    }
                }
                w = r2;
            }
        }
        if (w != r2) {
            s = 3;
        }
        this.s = s;
        this.r = w;
    }
    
    @Override
    public final int b() {
        return this.r;
    }
    
    @Override
    public final void d() {
        this.u = null;
    }
    
    @Override
    public final void j() {
        this.t = -9223372036854775807L;
        this.u = null;
    }
    
    @Override
    public final int k(final long n, final List<? extends m> list) {
        final long d = this.p.d();
        final long t = this.t;
        final int n2 = 0;
        if (t != -9223372036854775807L && d - t < 1000L && (list.isEmpty() || a.R(list).equals(this.u))) {
            return list.size();
        }
        this.t = d;
        m u;
        if (list.isEmpty()) {
            u = null;
        }
        else {
            u = (m)a.R(list);
        }
        this.u = u;
        if (list.isEmpty()) {
            return 0;
        }
        final int size = list.size();
        final long y = c0.y(this.q, list.get(size - 1).g - n);
        final long j = this.j;
        if (y < j) {
            return size;
        }
        final com.google.android.exoplayer2.n n3 = super.d[this.w(d, x(list))];
        for (int i = n2; i < size; ++i) {
            final m m = list.get(i);
            final com.google.android.exoplayer2.n d2 = m.d;
            if (c0.y(this.q, m.g - n) >= j && d2.m < n3.m) {
                final int w = d2.w;
                if (w != -1 && w <= this.l) {
                    final int v = d2.v;
                    if (v != -1 && v <= this.k && w < n3.w) {
                        return i;
                    }
                }
            }
        }
        return size;
    }
    
    @Override
    public final void q(final float q) {
        this.q = q;
    }
    
    @Override
    public final Object r() {
        return null;
    }
    
    @Override
    public final int u() {
        return this.s;
    }
    
    public final int w(final long n, long b) {
        b = (long)(this.g.c() * this.m);
        this.g.getClass();
        b /= (long)this.q;
        if (!((AbstractCollection)this.o).isEmpty()) {
            int n2;
            for (n2 = 1; n2 < ((AbstractCollection)this.o).size() - 1 && this.o.get(n2).a < b; ++n2) {}
            final a a = ((List<a>)this.o).get(n2 - 1);
            final a a2 = ((List<a>)this.o).get(n2);
            final long a3 = a.a;
            final float n3 = (b - a3) / (float)(a2.a - a3);
            b = a.b;
            b += (long)(n3 * (a2.b - b));
        }
        int n4;
        for (int i = n4 = 0; i < super.b; ++i) {
            if (n == Long.MIN_VALUE || !this.e(i, n)) {
                if (super.d[i].m <= b) {
                    return i;
                }
                n4 = i;
            }
        }
        return n4;
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            if (this.a != a.a || this.b != a.b) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            return (int)this.a * 31 + (int)this.b;
        }
    }
    
    public static final class b implements f.b
    {
        public b() {
        }
        
        public b(final int n) {
        }
    }
}
