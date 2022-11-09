// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.c;
import bc0.d;
import k42.a;
import ot1.b;
import javax.inject.Provider;
import af2.e;

public final class ka
{
    public e a;
    public e b;
    public Provider<b> c;
    public Provider<m42.b> d;
    public Provider<a> e;
    public Provider<rt1.a> f;
    
    public ka(final a1 a1, final rt1.b b, final zg2.a a2) {
        this.a = af2.e.a((Object)b);
        final e a3 = af2.e.a((Object)a2);
        this.b = a3;
        this.c = (Provider<b>)af2.c.b((Provider)new d((Provider)a3, (Provider)a1.w, (Provider)a1.T, (Provider)a1.g0, (Provider)a1.E, (Provider)a1.c1, 6));
        final Provider b2 = af2.c.b((Provider)new iv0.b((Provider)this.b, 18));
        this.d = (Provider<m42.b>)b2;
        final Provider b3 = af2.c.b((Provider)new vx.d((Provider)this.b, b2, (Provider)a1.e0, 25));
        this.e = (Provider<a>)b3;
        this.f = (Provider<rt1.a>)af2.c.b((Provider)new h70.a((Provider)this.a, (Provider)a1.H3, (Provider)this.c, (Provider)a1.W, (Provider)a1.c, (Provider)a1.m, b3, (Provider)a1.e0, 5));
    }
}
