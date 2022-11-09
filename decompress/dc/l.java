// 
// Decompiled by Procyon v0.6.0
// 

package dc;

import java.io.IOException;
import zc.q;
import bd.d0;
import db.i;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;

public final class l extends e
{
    public final f j;
    public f$a k;
    public long l;
    public volatile boolean m;
    
    public l(final a a, final b b, final n n, final int n2, final Object o, final f j) {
        super(a, b, 2, n, n2, o, -9223372036854775807L, -9223372036854775807L);
        this.j = j;
    }
    
    public final void a() {
        this.m = true;
    }
    
    public final void load() throws IOException {
        if (this.l == 0L) {
            ((d)this.j).a(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            final b a = super.b.a(this.l);
            final q i = super.i;
            final db.e e = new db.e((zc.f)i, a.f, i.a(a));
            Label_0163: {
                try {
                    while (!this.m) {
                        final int h = ((d)this.j).f.h((i)e, d.o);
                        boolean b = false;
                        d0.f(h != 1);
                        if (h == 0) {
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
            xl0.d.g((a)super.i);
        }
    }
}
