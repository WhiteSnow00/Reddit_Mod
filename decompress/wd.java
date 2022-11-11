// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import db0.t;
import com.reddit.session.Session;
import ix1.m;
import af0.q;
import da0.b$a;
import d00.f;
import ht.a$a;
import zl1.j$a;
import fn1.s$a;
import af0.t$a;
import fn1.i$a;
import af0.q$a;
import ca0.o0;
import af0.r$a;
import ye0.c$a;
import e40.k;
import zl1.h;
import sn1.j;
import android.app.Activity;
import android.content.Context;
import d00.c;
import e40.d;
import rx.a;
import uz.i;
import com.reddit.billing.RedditBillingManager;
import com.reddit.billing.RemotePurchaseDataSource;
import javax.inject.Provider;
import zy.e;
import mn1.b;

public final class wd implements b
{
    public vx.b A;
    public e B;
    public sx.b C;
    public Provider<RemotePurchaseDataSource> D;
    public py.b E;
    public Provider<RedditBillingManager> F;
    public i G;
    public a H;
    public d I;
    public vx.b J;
    public c K;
    public u60.e L;
    public w10.a M;
    public Provider<ze0.e> N;
    public final zg2.a<? extends Context> a;
    public final zg2.a<? extends Activity> b;
    public final a1 c;
    public final wd d;
    public ww0.c e;
    public ht.b f;
    public af2.e g;
    public Provider<o20.a> h;
    public Provider<j> i;
    public af2.e j;
    public r40.a k;
    public lx.d l;
    public af2.e m;
    public Provider<h> n;
    public ww0.c o;
    public n20.b p;
    public n41.c q;
    public vx.d r;
    public Provider<q20.c> s;
    public Provider<bn1.a> t;
    public Provider<o72.h> u;
    public Provider<zl1.i> v;
    public bc0.d w;
    public k x;
    public a y;
    public i z;
    
    public wd(final a1 c, final re0.e e, final zg2.a a, final zg2.a b) {
        this.d = this;
        this.c = c;
        this.a = (zg2.a<? extends Context>)a;
        this.b = (zg2.a<? extends Activity>)b;
        this.e = new ww0.c((Object)new py.b((Provider)c.W3, (Provider)c.W2, 11), 14);
        this.f = new ht.b((Provider)c.i4, 29);
        final af2.e a2 = af2.e.a((Object)a);
        this.g = a2;
        final Provider b2 = af2.c.b((Provider)vx.d.b((Provider)a2, (Provider)c.E, (Provider)c.w));
        this.h = (Provider<o20.a>)b2;
        this.i = (Provider<j>)af2.c.b((Provider)new k((Provider)this.g, (Provider)c.c, b2, 28));
        this.j = af2.e.a((Object)b);
        final r40.a a3 = r40.a.a((Provider)this.g, ms1.a.a((Provider)c.b0, (Provider)c.y), (Provider)c.m, (Provider)c.z0, (Provider)c.A0);
        this.k = a3;
        final af2.e j = this.j;
        this.l = new lx.d((Provider)j, (Provider)a3, (Provider)c.w, (Provider)new j31.d((Object)j, 10), (Provider)new sa1.b((Object)j, 6), 11);
        final af2.e a4 = af2.e.a((Object)e);
        this.m = a4;
        this.n = (Provider<h>)af2.c.b((Provider)new sy.e((Provider)c.r, (Provider)new qb0.b((Provider)c$a.a, 3), (Provider)c.i4, (Provider)c.W3, (Provider)a4, (Provider)r$a.a, 4));
        final a1$j7 i4 = c.i4;
        final j31.d d = new j31.d((Object)new o0((Provider)i4, 3), 9);
        final q a5 = q$a.a;
        this.o = new ww0.c((Object)new w30.b((Provider)i4, (Provider)d, (Provider)a5, 28), 15);
        final n20.b p4 = new n20.b((Provider)i4, (Provider)d, (Provider)i$a.a, (Provider)a5, 16);
        this.p = p4;
        final n41.c q = new n41.c((Provider)c.m, (Provider)c.W3, 6);
        this.q = q;
        this.r = new vx.d((Provider)new hg0.c((Provider)p4, (Provider)q, 9), (Provider)new e((Provider)d, (Provider)t$a.a, (Provider)c.K, 29), (Provider)i4, 21);
        final Provider b3 = af2.c.b((Provider)ei1.a.a((Provider)this.g));
        this.s = (Provider<q20.c>)b3;
        this.t = (Provider<bn1.a>)af2.c.b((Provider)new h00.i((Provider)this.n, (Provider)s$a.a, (Provider)new k((Provider)this.o, (Provider)this.r, (Provider)new mx.b((Provider)c.i4, (Provider)new k((Provider)this.p, (Provider)this.q, b3, 27), 29), 26), (Provider)c.j4, (Provider)c.k4, 14));
        this.u = (Provider<o72.h>)af2.c.b((Provider)hx.a.c((Provider)this.g, (Provider)c.r, (Provider)c.W3, (Provider)c.K));
        this.v = (Provider<zl1.i>)af2.c.b((Provider)j$a.a);
        this.w = new bc0.d((Provider)this.g, (Provider)c.w, (Provider)c.T, (Provider)this.k, (Provider)c.m, (Provider)c.K3, 5);
        this.x = e40.k.b((Provider)c.l0, (Provider)c.m0, (Provider)c.e);
        final a y = new a((Provider)a$a.a, 15);
        this.y = y;
        final a1.f6 k = c.K;
        final i z = new i((Provider)new f((Provider)k, (Provider)y, 15), (Provider)k, 11);
        this.z = z;
        final vx.b a6 = new vx.b((Provider)k, (Provider)z, 11);
        this.A = a6;
        this.B = new e((Provider)z, (Provider)a6, (Provider)k, 7);
        this.C = new sx.b((Provider)k, (Provider)z, (Provider)a6, (Provider)new vx.d((Provider)k, (Provider)z, (Provider)a6, 7), (Provider)new py.b((Provider)c.W2, (Provider)k, 9), 2);
        final Provider a7 = af2.h.a((Provider)rx.b.a((Provider)c.D0));
        this.D = (Provider<RemotePurchaseDataSource>)a7;
        this.E = py.b.a(a7, (Provider)c.E0);
        final Provider b4 = af2.c.b((Provider)vx.c.b((Provider)this.g, (Provider)this.j, (Provider)this.E, (Provider)c.c, (Provider)c.b0, (Provider)c.F0, (Provider)c.G0, (Provider)c.o0, (Provider)c.m, (Provider)uz.i.a((Provider)c.c, (Provider)c.K), (Provider)c.H0, (Provider)c.V));
        this.F = (Provider<RedditBillingManager>)b4;
        this.G = new i((Provider)new mw.b(b4, 14), (Provider)this.y, 12);
        this.H = new a((Provider)new b40.b(b4, 12), 17);
        final k x = this.x;
        final a1.f6 l = c.K;
        final da0.b a8 = b$a.a;
        this.I = new d((Provider)x, (Provider)a8, (Provider)l, 1);
        this.J = new vx.b((Provider)new a((Provider)c.L, 13), (Provider)a8, 9);
        this.K = new c((Provider)u60.c$a.a, (Provider)w60.b$a.a, 10);
        this.L = u60.e.a((Provider)this.x, (Provider)this.C, (Provider)this.G, (Provider)this.H, (Provider)c.W2, (Provider)this.I, (Provider)this.J, (Provider)this.K, (Provider)new rx.b((Provider)c.K, 15), (Provider)c.K);
        this.M = w10.a.b((Provider)this.x, (Provider)this.B, (Provider)this.C, (Provider)this.A, (Provider)this.z, (Provider)this.L, (Provider)this.G, (Provider)this.H, (Provider)c.W3, (Provider)c.l4, (Provider)c.K, (Provider)new f((Provider)new e((Provider)c.l0, (Provider)c.m0, (Provider)c.e, 6), (Provider)c.K, 13));
        this.N = (Provider<ze0.e>)af2.c.b((Provider)new k((Provider)this.M, (Provider)new a((Provider)this.B, 16), (Provider)c.m4, 7));
    }
    
    public static void a(final wd wd) {
        final q20.b k4 = wd.c.a.k4();
        kz0.k.N((Object)k4);
        final pe0.a r3 = wd.c.a.R3();
        kz0.k.N((Object)r3);
        new wn1.b(k4, r3);
    }
    
    public static sn1.h b(final wd wd) {
        final zg2.a<? extends Activity> b = wd.b;
        final m c = wd.c();
        final rc0.d i = wd.c.a.i();
        kz0.k.N((Object)i);
        return new sn1.h((zg2.a)b, c, i, (sn1.a)new sn1.c((zg2.a)wd.b), (sn1.b)new sn1.d((zg2.a)wd.b));
    }
    
    public final m c() {
        final zg2.a<? extends Context> a = this.a;
        final Session c = this.c.a.c();
        kz0.k.N((Object)c);
        final ge0.o0 z0 = this.c.a.Z0();
        kz0.k.N((Object)z0);
        final ix1.j j = new ix1.j(c, z0);
        final q20.b k4 = this.c.a.k4();
        kz0.k.N((Object)k4);
        final ix1.d d = new ix1.d();
        final t p = this.c.a.P();
        kz0.k.N((Object)p);
        final e80.d x8 = this.c.a.x8();
        kz0.k.N((Object)x8);
        return new m((zg2.a)a, j, k4, d, p, x8, new mx1.a());
    }
}
