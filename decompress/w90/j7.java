// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.c;
import ho0.d;
import ho0.f;
import javax.inject.Provider;
import vg0.a;
import e40.k;
import af2.e;

public final class j7
{
    public e a;
    public e b;
    public k c;
    public a d;
    public Provider<fo0.a> e;
    public Provider<ho0.e> f;
    
    public j7(final a1 a1, final f f, final zg2.a a2, final d d) {
        this.a = af2.e.a((Object)f);
        this.b = af2.e.a((Object)d);
        this.c = new k((Provider)a1.R2, (Provider)a1.F1, (Provider)a1.o0, 15);
        final e a3 = af2.e.a((Object)a2);
        this.d = new a((Provider)a3, 19);
        final Provider b = af2.c.b((Provider)vx.d.c((Provider)a3, (Provider)a1.N2, (Provider)a1.w));
        this.e = (Provider<fo0.a>)b;
        this.f = (Provider<ho0.e>)af2.c.b((Provider)new rk0.d((Provider)this.a, (Provider)this.b, (Provider)a1.o0, (Provider)this.c, (Provider)a1.R2, (Provider)a1.N2, (Provider)a1.m, (Provider)this.d, (Provider)a1.G1, b, 3));
    }
}
