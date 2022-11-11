// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import mg0.x;
import se2.h;
import xk0.a;
import xk0.c;
import com.reddit.flairselect.FlairSelectPresenter;
import hi0.a0;
import jh0.m;
import xk0.d;
import javax.inject.Provider;
import qz.i;
import uw.f;
import se2.e;

public final class s4
{
    public final z0 a;
    public e b;
    public e c;
    public f d;
    public i e;
    public Provider<d> f;
    public Provider<m> g;
    public Provider<a0> h;
    public Provider<FlairSelectPresenter> i;
    
    public s4(final z0 a, final c c, final a a2, final rg2.a a3) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = se2.e.a((Object)a2);
        this.d = uw.f.b((Provider)a.y, (Provider)a.m);
        this.e = new i((Provider)a.V1, (Provider)a.m, 24);
        this.f = (Provider<d>)se2.c.b((Provider)new i((Provider)se2.e.a((Object)a3), (Provider)a.w, 25));
        this.g = (Provider<m>)se2.h.a((Provider)new hg0.f((Provider)a.h, 5));
        final Provider a4 = se2.h.a((Provider)x.a((Provider)a.h));
        this.h = (Provider<a0>)a4;
        this.i = (Provider<FlairSelectPresenter>)se2.c.b((Provider)new xk0.e((Provider)this.b, (Provider)this.c, a.V1, a.e, a.p0, a.k0, (Provider)this.d, (Provider)this.e, a.c, (Provider)this.f, (Provider)this.g, a.m, a.n1, a4));
    }
}
