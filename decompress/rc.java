// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import vs1.c$a;
import af2.h;
import jl0.g;
import rh0.b$a;
import ca0.o0;
import nv1.f;
import nv1.i;
import vx.d;
import q20.c;
import af2.e;
import com.reddit.events.onboardingchaining.OnboardingChainingAnalytics;
import kz0.b;
import javax.inject.Provider;
import android.content.Context;
import android.app.Activity;
import zg2.a;

public final class rc
{
    public final a<? extends Activity> a;
    public final String b;
    public final a<? extends Context> c;
    public final a1 d;
    public Provider<b> e;
    public Provider<rh0.a> f;
    public Provider<pi0.a> g;
    public Provider<jl0.a> h;
    public Provider<OnboardingChainingAnalytics> i;
    public Provider<vs1.b> j;
    public Provider<vs1.a> k;
    public e l;
    public e m;
    public Provider<c> n;
    public e o;
    public d p;
    public Provider<sg0.a> q;
    public Provider<zv1.b> r;
    
    public rc(final a1 d, final i i, final a c, final a a, final f f) {
        this.d = d;
        this.a = (a<? extends Activity>)a;
        this.b = "search_results";
        this.c = (a<? extends Context>)c;
        this.e = (Provider<b>)af2.c.b((Provider)o0.g((Provider)d.h));
        final Provider b = af2.c.b((Provider)b$a.a);
        this.f = (Provider<rh0.a>)b;
        this.g = (Provider<pi0.a>)af2.c.b((Provider)mx.b.b((Provider)d.h, b));
        this.h = (Provider<jl0.a>)af2.h.a((Provider)jl0.g.a((Provider)d.m));
        this.i = (Provider<OnboardingChainingAnalytics>)af2.c.b((Provider)o0.b((Provider)d.h));
        final Provider b2 = af2.c.b((Provider)c$a.a);
        this.j = (Provider<vs1.b>)b2;
        this.k = (Provider<vs1.a>)af2.c.b((Provider)cx.b.a(b2, (Provider)d.q1, (Provider)d.L1, (Provider)d.M1, (Provider)d.R1));
        this.l = af2.e.a((Object)i);
        final e a2 = af2.e.a((Object)c);
        this.m = a2;
        this.n = (Provider<c>)af2.c.b((Provider)ei1.a.a((Provider)a2));
        this.o = af2.e.a((Object)f);
        this.p = vx.d.b((Provider)this.m, (Provider)d.E, (Provider)d.w);
        this.q = (Provider<sg0.a>)af2.c.b((Provider)sx.c.a((Provider)d.h, (Provider)d.U1, (Provider)d.L1, uy.b.c((Provider)d.m, (Provider)d.K1, (Provider)d.w0)));
        this.r = (Provider<zv1.b>)af2.c.b((Provider)new zv1.c((Provider)this.l, (Provider)this.n, d.c0, d.N0, d.y, d.T1, d.j, d.o0, (Provider)this.o, d.b0, (Provider)this.p, (Provider)this.q, cx.b.b((Provider)d.j, (Provider)d.U1, (Provider)d.G2, (Provider)d.b0, (Provider)d.H2), d.U1, d.K2, d.x2, d.I2));
    }
}
