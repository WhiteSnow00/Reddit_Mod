// 
// Decompiled by Procyon v0.6.0
// 

package cc;

import java.io.IOException;
import yc.q;
import lq0.k;
import ad.d0;
import cb.i;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;

public final class l extends e
{
    public final cc.f j;
    public f$a k;
    public long l;
    public volatile boolean m;
    
    public l(final com.google.android.exoplayer2.upstream.a a, final com.google.android.exoplayer2.upstream.b b, final n n, final int n2, final Object o, final cc.f j) {
        super(a, b, 2, n, n2, o, -9223372036854775807L, -9223372036854775807L);
        this.j = j;
    }
    
    @Override
    public final void a() {
        this.m = true;
    }
    
    @Override
    public final void load() throws IOException {
        if (this.l == 0L) {
            ((cc.d)this.j).a(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            final com.google.android.exoplayer2.upstream.b a = super.b.a(this.l);
            final q i = super.i;
            final cb.e e = new cb.e((yc.f)i, a.f, i.a(a));
            Label_0163: {
                try {
                    while (!this.m) {
                        final int j = ((cc.d)this.j).f.i(e, cc.d.o);
                        boolean b = false;
                        d0.f(j != 1);
                        if (j == 0) {
                            b = true;
                        }
                        if (b) {
                            continue;
                        }
                        break;
                    }
                }
                finally {
                    break Label_0163;
                }
                this.l = e.d - super.b.f;
                return;
            }
            this.l = e.d - super.b.f;
        }
        finally {
            lq0.k.x((com.google.android.exoplayer2.upstream.a)super.i);
        }
    }
}
