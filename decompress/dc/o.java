// 
// Decompiled by Procyon v0.6.0
// 

package dc;

import java.io.IOException;
import db.w;
import com.google.android.exoplayer2.source.p;
import db.w$a;
import zc.f;
import db.e;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.n;

public final class o extends a
{
    public final int o;
    public final n p;
    public long q;
    public boolean r;
    
    public o(final com.google.android.exoplayer2.upstream.a a, final b b, final n n, final int n2, final Object o, final long n3, final long n4, final long n5, final int o2, final n p10) {
        super(a, b, n, n2, o, n3, n4, -9223372036854775807L, -9223372036854775807L, n5);
        this.o = o2;
        this.p = p10;
    }
    
    public final void a() {
    }
    
    public final boolean c() {
        return this.r;
    }
    
    public final void load() throws IOException {
        final c m = super.m;
        ah0.b.I((Object)m);
        final p[] b = m.b;
        final int length = b.length;
        final int n = 0;
        for (final p p : b) {
            if (p.F != 0L) {
                p.F = 0L;
                p.z = true;
            }
        }
        final w a = m.a(this.o);
        a.a(this.p);
        try {
            long a2;
            final long n2 = a2 = ((dc.e)this).i.a(((dc.e)this).b.a(this.q));
            if (n2 != -1L) {
                a2 = n2 + this.q;
            }
            final e e = new e((f)((dc.e)this).i, this.q, a2);
            for (int j = n; j != -1; j = a.e((f)e, Integer.MAX_VALUE, true)) {
                this.q += j;
            }
            a.b(((dc.e)this).g, 1, (int)this.q, 0, (w$a)null);
            vl.a.t1((com.google.android.exoplayer2.upstream.a)((dc.e)this).i);
            this.r = true;
        }
        finally {
            vl.a.t1((com.google.android.exoplayer2.upstream.a)((dc.e)this).i);
        }
    }
}
