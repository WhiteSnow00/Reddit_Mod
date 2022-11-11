// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import sg2.e;
import n1.f;
import android.graphics.Shader;

public abstract class j0 extends n
{
    public Shader a;
    public long b;
    
    public j0() {
        final int d = f.d;
        this.b = f.c;
    }
    
    @Override
    public final void a(final float n, long a, final a0 a2) {
        Shader a3 = this.a;
        if (a3 == null || !f.c(this.b, a)) {
            a3 = this.b(a);
            this.a = a3;
            this.b = a;
        }
        a = a2.a();
        final long b = r.b;
        if (!r.c(a, b)) {
            a2.c(b);
        }
        if (!e.a((Object)a2.f(), (Object)a3)) {
            a2.k(a3);
        }
        if (a2.v() != n) {
            a2.d(n);
        }
    }
    
    public abstract Shader b(final long p0);
}
