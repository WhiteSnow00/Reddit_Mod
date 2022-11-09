// 
// Decompiled by Procyon v0.6.0
// 

package bc;

import com.google.android.exoplayer2.e0$c;
import bd.d0;
import com.google.android.exoplayer2.e0$b;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.a;
import android.net.Uri;
import com.google.android.exoplayer2.q$a;
import com.google.android.exoplayer2.q$e;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.e0;

public final class r extends e0
{
    public static final Object t;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final Object q;
    public final q r;
    public final q$e s;
    
    static {
        t = new Object();
        final q$a q$a = new q$a();
        q$a.a = "SinglePeriodTimeline";
        q$a.b = Uri.EMPTY;
        q$a.a();
    }
    
    public r(final long g, final long h, final long j, final long k, final long l, final long m, final boolean n, final boolean o, final boolean p12, final Object q, final q r, final q$e s) {
        this.g = g;
        this.h = h;
        this.i = -9223372036854775807L;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p12;
        this.q = q;
        r.getClass();
        this.r = r;
        this.s = s;
    }
    
    public r(final long n, final long n2, final long n3, final long n4, final boolean b, final boolean b2, final boolean b3, final a a, final q q) {
        q$e h;
        if (b3) {
            h = q.h;
        }
        else {
            h = null;
        }
        this(-9223372036854775807L, -9223372036854775807L, n, n2, n3, n4, b, b2, false, a, q, h);
    }
    
    public r(final long n, final boolean b, final boolean b2, final q q) {
        this(n, n, 0L, 0L, b, false, b2, null, q);
    }
    
    public final int b(final Object o) {
        int n;
        if (bc.r.t.equals(o)) {
            n = 0;
        }
        else {
            n = -1;
        }
        return n;
    }
    
    public final e0$b f(final int n, final e0$b e0$b, final boolean b) {
        d0.e(n, 1);
        Object t;
        if (b) {
            t = bc.r.t;
        }
        else {
            t = null;
        }
        final long j = this.j;
        final long n2 = -this.l;
        e0$b.getClass();
        e0$b.i((Object)null, t, 0, j, n2, cc.a.l, false);
        return e0$b;
    }
    
    public final int h() {
        return 1;
    }
    
    public final Object l(final int n) {
        d0.e(n, 1);
        return bc.r.t;
    }
    
    public final e0$c n(final int n, final e0$c e0$c, long n2) {
        d0.e(n, 1);
        final long m = this.m;
        final boolean o = this.o;
        long n3 = m;
        Label_0088: {
            if (o) {
                n3 = m;
                if (!this.p) {
                    n3 = m;
                    if (n2 != 0L) {
                        final long k = this.k;
                        if (k != -9223372036854775807L) {
                            n2 = (n3 = m + n2);
                            if (n2 <= k) {
                                break Label_0088;
                            }
                        }
                        n3 = -9223372036854775807L;
                    }
                }
            }
        }
        e0$c.c(e0$c.w, this.r, this.q, this.g, this.h, this.i, this.n, o, this.s, n3, this.k, 0, 0, this.l);
        return e0$c;
    }
    
    public final int o() {
        return 1;
    }
}
