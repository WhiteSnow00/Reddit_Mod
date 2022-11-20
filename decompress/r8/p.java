// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import com.bumptech.glide.load.engine.c$a;
import p8.d;
import com.bumptech.glide.load.engine.i;
import v8.n$a;
import com.bumptech.glide.load.data.d$a;

public final class p implements d$a<Object>
{
    public final n$a f;
    public final i g;
    
    public p(final i g, final n$a f) {
        this.g = g;
        this.f = f;
    }
    
    public final void e(final Object j) {
        final i g = this.g;
        final n$a f = this.f;
        final n$a k = g.k;
        if (k != null && k == f) {
            final i g2 = this.g;
            final n$a f2 = this.f;
            final f p = g2.f.p;
            if (j != null && p.c(f2.c.c())) {
                g2.j = j;
                g2.g.e();
            }
            else {
                final c$a g3 = g2.g;
                final d a = f2.a;
                final com.bumptech.glide.load.data.d c = f2.c;
                g3.c(a, j, c, c.c(), (d)g2.l);
            }
        }
    }
    
    public final void f(final Exception ex) {
        final i g = this.g;
        final n$a f = this.f;
        final n$a k = g.k;
        if (k != null && k == f) {
            final i g2 = this.g;
            final n$a f2 = this.f;
            final c$a g3 = g2.g;
            final c l = g2.l;
            final com.bumptech.glide.load.data.d c = f2.c;
            g3.d((d)l, ex, c, c.c());
        }
    }
}
