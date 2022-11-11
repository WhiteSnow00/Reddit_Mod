// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import mg0.x;
import k50.h;
import com.reddit.screen.BaseScreen;
import ki1.c;
import javax.inject.Provider;
import ff0.q1;
import t10.d;
import vh1.a;
import ez.f;
import uv0.b;
import se2.e;

public final class ud
{
    public final z0 a;
    public e b;
    public e c;
    public e d;
    public e e;
    public b f;
    public e g;
    public f h;
    public a i;
    public d j;
    public q1 k;
    public Provider<ci1.a> l;
    public Provider<ki1.b> m;
    
    public ud(final z0 a, final c c, final BaseScreen baseScreen, final rg2.a a2, final rg2.a a3, final rg2.a a4, final pc0.b b, final xc0.c c2) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = se2.e.a((Object)b);
        this.d = se2.e.a((Object)c2);
        final e a5 = se2.e.a((Object)baseScreen);
        this.e = a5;
        this.f = uv0.b.e((Provider)a5);
        this.g = se2.e.a((Object)a2);
        this.h = ez.f.b((Provider)this.f, (Provider)this.g, se2.e.a((Object)a3), (Provider)this.c, a.w, a.H, a.X3, a.A0, a.b0);
        final a i = new a((Object)new yr0.d((Object)this.e, 12), 0);
        this.i = i;
        final h a6 = k50.h.a(a.S3, a.y, a.x3, (Provider)this.c, a.A0, i, a.n, a.b0);
        final z0.z0$g7 j = a.i;
        this.j = t10.d.a((Provider)this.c, j, a.I2, a.t0, a.W3, (Provider)this.h, a.S3, (Provider)a6, (Provider)new ly.b((Provider)j, (Provider)a.x3, 17), a.Y3, a.A0, (Provider)this.i, a.Z3, new x((Provider)a.h, 9), a.a4, a.M3);
        this.k = q1.c((Provider)a.h);
        this.l = (Provider<ci1.a>)se2.c.b((Provider)new qy.b((Provider)cz0.c.b((Provider)this.e), (Provider)a.w, (Provider)a.m, 25));
        final e a7 = se2.e.a((Object)a4);
        final e c3 = this.c;
        final z0.z0$f5 a8 = a.A0;
        final z0.z0$e5 s3 = a.S3;
        final z0.z0$a3 o4 = a.o4;
        final z0.z0$h6 k = a.K;
        this.m = (Provider<ki1.b>)se2.c.b((Provider)new com.reddit.screen.onboarding.onboardingtopic.snoovatar.a((Provider)this.b, (Provider)c3, (Provider)this.d, (Provider)this.j, a.i, (Provider)this.k, a.n4, (Provider)this.l, k, a8, a7, new px.a((Provider)c3, (Provider)a8, (Provider)s3, (Provider)o4, (Provider)k, 5)));
    }
}
