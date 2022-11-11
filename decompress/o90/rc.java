// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import dq0.g;
import hi1.b$a;
import mg0.x;
import k50.h;
import pc0.b;
import gi1.c;
import com.reddit.screen.BaseScreen;
import com.reddit.events.onboardingchaining.OnboardingChainingAnalytics;
import javax.inject.Provider;
import t10.d;
import vh1.a;
import ez.f;
import se2.e;

public final class rc
{
    public final z0 a;
    public e b;
    public e c;
    public e d;
    public e e;
    public e f;
    public f g;
    public a h;
    public d i;
    public Provider<OnboardingChainingAnalytics> j;
    public Provider<gi1.d> k;
    
    public rc(final z0 a, final rg2.a a2, final rg2.a a3, final rg2.a a4, final BaseScreen baseScreen, final gi1.e e, final c c, final b b) {
        this.a = a;
        this.b = se2.e.a((Object)e);
        this.c = se2.e.a((Object)c);
        this.d = se2.e.a((Object)b);
        this.e = se2.e.a((Object)a2);
        this.f = se2.e.a((Object)a3);
        this.g = ez.f.b((Provider)this.e, (Provider)this.f, se2.e.a((Object)a4), (Provider)this.d, a.w, a.H, a.X3, a.A0, a.b0);
        final a h = new a((Object)new yr0.d((Object)se2.e.a((Object)baseScreen), 12), 0);
        this.h = h;
        final h a5 = k50.h.a(a.S3, a.y, a.x3, (Provider)this.d, a.A0, h, a.n, a.b0);
        final z0.z0$g7 i = a.i;
        this.i = t10.d.a((Provider)this.d, i, a.I2, a.t0, a.W3, (Provider)this.g, a.S3, (Provider)a5, (Provider)new ly.b((Provider)i, (Provider)a.x3, 17), a.Y3, a.A0, (Provider)this.h, a.Z3, new x((Provider)a.h, 9), a.a4, a.M3);
        final Provider b2 = se2.c.b((Provider)id0.b.c((Provider)a.h));
        this.j = (Provider<OnboardingChainingAnalytics>)b2;
        final rx.b b3 = new rx.b((Provider)a.L, (Provider)a.K, 27);
        final z0.z0$f5 a6 = a.A0;
        final oa1.b b4 = new oa1.b((Object)a6, 6);
        final rx.b b5 = new rx.b((Provider)this.h, (Provider)a6, 14);
        final z0.z0$s9 m = a.m;
        final ib0.b b6 = new ib0.b((Provider)m, 7);
        final e d = this.d;
        final z0.z0$e5 s3 = a.S3;
        this.k = (Provider<gi1.d>)se2.c.b((Provider)new g((Provider)this.b, (Provider)this.c, (Provider)d, (Provider)a6, (Provider)s3, (Provider)this.i, b2, (Provider)a.y, (Provider)m, (Provider)a.W0, (Provider)b3, (Provider)b4, (Provider)b5, (Provider)b6, (Provider)new ox.b((Provider)d, (Provider)a6, (Provider)s3, (Provider)b$a.a, b2, 13), 2));
    }
}
