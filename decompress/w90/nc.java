// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import nv1.g;
import uy.b;
import com.reddit.domain.model.search.Query;
import nv1.f;
import com.reddit.search.screens.SearchPresenter;
import of0.k0;
import q20.c;
import javax.inject.Provider;
import af2.e;
import android.content.Context;
import zg2.a;

public final class nc
{
    public final a<? extends Context> a;
    public final a1 b;
    public e c;
    public e d;
    public Provider<c> e;
    public Provider<sg0.a> f;
    public e g;
    public k0 h;
    public k0 i;
    public e j;
    public ww0.c k;
    public hg0.c l;
    public l40.a m;
    public Provider<SearchPresenter> n;
    
    public nc(final a1 b, final nv1.c c, final a a, final f f, final Query query, final Boolean b2) {
        this.b = b;
        this.a = (a<? extends Context>)a;
        this.c = af2.e.a((Object)c);
        final e a2 = af2.e.a((Object)a);
        this.d = a2;
        this.e = (Provider<c>)af2.c.b((Provider)ei1.a.a((Provider)a2));
        this.f = (Provider<sg0.a>)af2.c.b((Provider)sx.c.a((Provider)b.h, (Provider)b.U1, (Provider)b.L1, uy.b.c((Provider)b.m, (Provider)b.K1, (Provider)b.w0)));
        this.g = af2.e.a((Object)f);
        final a1.j2 h = b.h;
        this.h = new k0((Provider)h, 6);
        this.i = new k0((Provider)h, 11);
        this.j = af2.e.a((Object)b2);
        this.k = new ww0.c((Object)b.U1, 19);
        final e d = this.d;
        final a1.g0 j2 = b.J2;
        this.l = new hg0.c((Provider)d, (Provider)j2, 10);
        this.m = new l40.a((Provider)b.w, (Provider)this.i, (Provider)b.K2, (Provider)j2, (Provider)d, (Provider)b.b0, 12);
        this.n = (Provider<SearchPresenter>)af2.c.b((Provider)new g((Provider)this.c, (Provider)this.e, (Provider)this.f, b.b0, (Provider)this.g, b.T1, b.j, b.o0, (Provider)this.h, (Provider)this.i, (Provider)this.j, (Provider)this.k, b.x2, b.I2, b.U1, (Provider)this.l, (Provider)this.m, af2.e.a((Object)query)));
    }
}
