// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import z50.x0;
import b40.k0;
import ty.s;
import xi1.g;
import xi1.f;
import com.reddit.events.onboardingchaining.OnboardingChainingAnalytics;
import n10.b;
import m20.c;
import javax.inject.Provider;
import se2.e;
import com.reddit.screen.BaseScreen;

public final class vb
{
    public final BaseScreen a;
    public final z0 b;
    public e c;
    public e d;
    public e e;
    public Provider<c> f;
    public kn1.c g;
    public b h;
    public uv0.b i;
    public uv0.b j;
    public Provider<OnboardingChainingAnalytics> k;
    public Provider<f> l;
    
    public vb(final z0 b, final g g, final xi1.e e, final BaseScreen a) {
        this.b = b;
        this.a = a;
        this.c = se2.e.a((Object)g);
        this.d = se2.e.a((Object)e);
        final e a2 = se2.e.a((Object)a);
        this.e = a2;
        final Provider b2 = se2.c.b((Provider)oa1.b.a((Provider)cz0.c.b((Provider)a2)));
        this.f = (Provider<c>)b2;
        this.g = kn1.c.b(b2, (Provider)b.A0);
        this.h = new b((Provider)this.g, (Provider)this.f, (Provider)b.I2, (Provider)s.a((Provider)b.n, (Provider)b.N3, (Provider)b.G, (Provider)b.x3, (Provider)b.t0, (Provider)b.A0, (Provider)b.O3, (Provider)b.b0, (Provider)b.P3, (Provider)b.Q3, (Provider)b.R3, (Provider)b.r, (Provider)b.M3), 15);
        final uv0.b e2 = uv0.b.e((Provider)this.e);
        this.i = e2;
        this.j = uv0.b.a((Provider)e2);
        this.k = (Provider<OnboardingChainingAnalytics>)se2.c.b((Provider)id0.b.c((Provider)b.h));
        this.l = (Provider<f>)se2.c.b((Provider)new x0((Provider)this.c, (Provider)this.d, (Provider)b.M3, (Provider)this.h, (Provider)b.S3, (Provider)this.j, (Provider)this.k, (Provider)k0.a((Provider)b.b0, (Provider)b.E, (Provider)this.i, (Provider)b.u0), (Provider)b.P3, (Provider)b.u0, (Provider)b.r, (Provider)b.A0, (Provider)b.T3, 2));
    }
}
