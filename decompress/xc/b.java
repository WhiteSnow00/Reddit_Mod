// 
// Decompiled by Procyon v0.6.0
// 

package xc;

import bd.c0;
import android.os.SystemClock;
import dc.m;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
import j2.g;
import com.google.android.exoplayer2.n;
import bc.s;

public abstract class b implements e
{
    public final s a;
    public final int b;
    public final int[] c;
    public final n[] d;
    public final long[] e;
    public int f;
    
    public b(final s a, final int[] array) {
        final int length = array.length;
        final int n = 0;
        ah0.b.H(length > 0);
        a.getClass();
        this.a = a;
        final int length2 = array.length;
        this.b = length2;
        this.d = new n[length2];
        for (int i = 0; i < array.length; ++i) {
            this.d[i] = a.h[array[i]];
        }
        Arrays.sort(this.d, (Comparator<? super n>)new g(3));
        this.c = new int[this.b];
        int n2 = n;
        int b;
        while (true) {
            b = this.b;
            if (n2 >= b) {
                break;
            }
            this.c[n2] = a.a(this.d[n2]);
            ++n2;
        }
        this.e = new long[b];
    }
    
    public void d() {
    }
    
    public final boolean e(final int n, final long n2) {
        return this.e[n] > n2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final b b2 = (b)o;
            if (this.a != b2.a || !Arrays.equals(this.c, b2.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int f(final int n) {
        return this.c[n];
    }
    
    public final int h(final int n) {
        for (int i = 0; i < this.b; ++i) {
            if (this.c[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + System.identityHashCode(this.a) * 31;
        }
        return this.f;
    }
    
    public final s i() {
        return this.a;
    }
    
    public void j() {
    }
    
    public int k(final long n, final List<? extends m> list) {
        return list.size();
    }
    
    public final int l() {
        return this.c[((e)this).b()];
    }
    
    public final int length() {
        return this.c.length;
    }
    
    public final n m() {
        return this.d[((e)this).b()];
    }
    
    public final boolean o(final int n, final long n2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        int e = this.e(n, elapsedRealtime) ? 1 : 0;
        for (int n3 = 0; n3 < this.b && e == 0; ++n3) {
            if (n3 != n && !this.e(n3, elapsedRealtime)) {
                e = 1;
            }
            else {
                e = 0;
            }
        }
        if (e == 0) {
            return false;
        }
        final long[] e2 = this.e;
        final long n4 = e2[n];
        final int a = c0.a;
        long n6;
        final long n5 = n6 = elapsedRealtime + n2;
        if (((n2 ^ n5) & (elapsedRealtime ^ n5)) < 0L) {
            n6 = Long.MAX_VALUE;
        }
        e2[n] = Math.max(n4, n6);
        return true;
    }
    
    public final n p(final int n) {
        return this.d[n];
    }
    
    public void q(final float n) {
    }
    
    public final int t(final n n) {
        for (int i = 0; i < this.b; ++i) {
            if (this.d[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
