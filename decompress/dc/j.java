// 
// Decompiled by Procyon v0.6.0
// 

package dc;

import java.io.IOException;
import zc.r;
import com.google.android.exoplayer2.source.p;
import db.i;
import db.e;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.b;

public final class j extends a
{
    public final int o;
    public final long p;
    public final f q;
    public long r;
    public volatile boolean s;
    public boolean t;
    
    public j(final com.google.android.exoplayer2.upstream.a a, final b b, final n n, final int n2, final Object o, final long n3, final long n4, final long n5, final long n6, final long n7, final int o2, final long p13, final f q) {
        super(a, b, n, n2, o, n3, n4, n5, n6, n7);
        this.o = o2;
        this.p = p13;
        this.q = q;
    }
    
    public final void a() {
        this.s = true;
    }
    
    public final long b() {
        return ((m)this).j + this.o;
    }
    
    public final boolean c() {
        return this.t;
    }
    
    public final void load() throws IOException {
        if (this.r == 0L) {
            final c m = super.m;
            ah0.b.I((Object)m);
            final long p = this.p;
            for (final p p2 : m.b) {
                if (p2.F != p) {
                    p2.F = p;
                    p2.z = true;
                }
            }
            final f q = this.q;
            final long k = super.k;
            long n = -9223372036854775807L;
            long n2;
            if (k == -9223372036854775807L) {
                n2 = -9223372036854775807L;
            }
            else {
                n2 = k - this.p;
            }
            final long l = super.l;
            if (l != -9223372036854775807L) {
                n = l - this.p;
            }
            ((d)q).a((f$a)m, n2, n);
        }
        try {
            final b a = ((dc.e)this).b.a(this.r);
            final r j = ((dc.e)this).i;
            final e e = new e((zc.f)j, a.f, j.a(a));
            Label_0303: {
                try {
                    while (!this.s) {
                        final int h = ((d)this.q).f.h((i)e, d.o);
                        ah0.b.H(h != 1);
                        if (h == 0) {
                            continue;
                        }
                        break;
                    }
                }
                finally {
                    break Label_0303;
                }
                this.r = e.d - ((dc.e)this).b.f;
                vl.a.t1((com.google.android.exoplayer2.upstream.a)((dc.e)this).i);
                this.t = (this.s ^ true);
                return;
            }
            this.r = e.d - ((dc.e)this).b.f;
        }
        finally {
            vl.a.t1((com.google.android.exoplayer2.upstream.a)((dc.e)this).i);
        }
    }
}
