// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import fv1.j$a;
import ks1.c$a;
import ym0.v;
import z30.l;
import se2.h;
import zk0.g;
import hh0.b$a;
import cv1.f;
import com.reddit.screen.BaseScreen;
import cv1.i;
import m20.c;
import ym0.j;
import pi.d;
import se2.e;
import com.reddit.events.onboardingchaining.OnboardingChainingAnalytics;
import cz0.b;
import javax.inject.Provider;
import android.content.Context;
import android.app.Activity;
import rg2.a;

public final class pc
{
    public final a<? extends Activity> a;
    public final String b;
    public final a<? extends Context> c;
    public final z0 d;
    public Provider<b> e;
    public Provider<hh0.a> f;
    public Provider<fi0.a> g;
    public Provider<zk0.a> h;
    public Provider<OnboardingChainingAnalytics> i;
    public e j;
    public e k;
    public e l;
    public Provider<as1.a> m;
    public d n;
    public Provider<j> o;
    public Provider<ks1.b> p;
    public Provider<ks1.a> q;
    public e r;
    public Provider<c> s;
    public e t;
    public vy.e u;
    public Provider<kg0.a> v;
    public Provider<ov1.b> w;
    
    public pc(final z0 d, final i i, final a c, final a a, final BaseScreen baseScreen, final f f) {
        this.d = d;
        this.a = a;
        this.b = "search_results";
        this.c = c;
        this.e = (Provider<b>)se2.c.b((Provider)cz0.c.a((Provider)d.h));
        final Provider b = se2.c.b((Provider)b$a.a);
        this.f = (Provider<hh0.a>)b;
        this.g = (Provider<fi0.a>)se2.c.b((Provider)rx.b.a((Provider)d.h, b));
        this.h = (Provider<zk0.a>)se2.h.a((Provider)zk0.g.a((Provider)d.m));
        this.i = (Provider<OnboardingChainingAnalytics>)se2.c.b((Provider)id0.b.c((Provider)d.h));
        this.j = se2.e.a((Object)c);
        this.k = se2.e.a((Object)baseScreen);
        this.l = se2.e.a((Object)"search_results");
        this.m = (Provider<as1.a>)se2.c.b((Provider)z30.l.b((Provider)this.j, (Provider)this.k, (Provider)d.w, (Provider)d.T, (Provider)d.U, (Provider)d.V));
        this.n = pi.d.a((Provider)this.j, com.reddit.metrics.a.a((Provider)d.b0, (Provider)d.y), (Provider)d.m, (Provider)d.A0, (Provider)d.B0);
        this.o = (Provider<j>)se2.c.b((Provider)ym0.v.a((Provider)this.j, (Provider)this.k, (Provider)this.l, (Provider)d.b0, (Provider)d.E, (Provider)d.j2, (Provider)this.m, (Provider)d.u2, (Provider)d.P1, (Provider)this.n, (Provider)d.p2, (Provider)d.n, (Provider)this.f, (Provider)d.v2, (Provider)d.h, (Provider)d.w2, (Provider)zz.c.b((Provider)d.y0, (Provider)d.z0), (Provider)d.k2, (Provider)d.D1, (Provider)d.o2, (Provider)d.m1, (Provider)d.L0));
        final Provider b2 = se2.c.b((Provider)c$a.a);
        this.p = (Provider<ks1.b>)b2;
        this.q = (Provider<ks1.a>)se2.c.b((Provider)yw.b.a(b2, (Provider)d.t1, (Provider)d.O1, (Provider)d.P1, (Provider)d.p2));
        this.r = se2.e.a((Object)i);
        this.s = (Provider<c>)se2.c.b((Provider)oa1.b.a((Provider)this.j));
        this.t = se2.e.a((Object)f);
        this.u = vy.e.a((Provider)this.j, (Provider)d.E, (Provider)d.w);
        this.v = (Provider<kg0.a>)se2.c.b((Provider)jx.c.c((Provider)d.h, (Provider)d.e2, (Provider)d.O1, q30.b.a((Provider)d.m, (Provider)d.N1, (Provider)d.x0)));
        this.w = (Provider<ov1.b>)se2.c.b((Provider)new de1.a((Provider)this.r, (Provider)this.s, (Provider)d.c0, (Provider)d.Q0, (Provider)d.y, (Provider)d.V3, (Provider)d.j, (Provider)d.p0, (Provider)this.t, (Provider)d.b0, (Provider)this.u, (Provider)this.v, (Provider)u30.g.a((Provider)d.j, (Provider)d.e2, (Provider)d.J2, (Provider)d.b0, (Provider)d.K2), (Provider)d.e2, (Provider)j$a.a, (Provider)d.N2, (Provider)d.z2, (Provider)d.L2, 1));
    }
}
