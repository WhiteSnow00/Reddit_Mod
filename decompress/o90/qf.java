// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import dq0.g;
import hg0.f;
import com.reddit.domain.model.mod.ModPermissions;
import com.reddit.domain.model.Subreddit;
import com.reddit.screen.communities.icon.base.IconPresentationModel;
import t20.a;
import ff0.l;
import sg0.d;
import javax.inject.Provider;
import cz0.c;
import qy.b;
import se2.e;

public final class qf
{
    public final z0 a;
    public e b;
    public b c;
    public e d;
    public e e;
    public e f;
    public c g;
    public e h;
    public Provider<d> i;
    public Provider<yb1.b> j;
    public l k;
    public e l;
    public Provider<a> m;
    public Provider<rc1.b> n;
    
    public qf(final z0 a, final rc1.c c, final IconPresentationModel iconPresentationModel, final rc1.a a2, final Subreddit subreddit, final ModPermissions modPermissions, final ae0.d d, final rg2.a a3) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = new b((Provider)a.k0, (Provider)a.D4, (Provider)a.y, 13);
        this.d = se2.e.a((Object)a2);
        this.e = se2.e.b((Object)d);
        final e a4 = se2.e.a((Object)a3);
        this.f = a4;
        this.g = new c((Provider)a4, 7);
        this.h = se2.e.a((Object)subreddit);
        this.i = (Provider<d>)se2.c.b((Provider)new y30.d((Provider)a.h, (Provider)this.h, (Provider)se2.e.a((Object)modPermissions), 10));
        this.j = (Provider<yb1.b>)se2.c.b((Provider)new f((Provider)a.L, 29));
        this.k = new l((Provider)a.y, 0);
        this.l = se2.e.a((Object)iconPresentationModel);
        final Provider b = se2.c.b((Provider)new jt0.e((Provider)a.w, (Provider)a.m1, 2));
        this.m = (Provider<a>)b;
        this.n = (Provider<rc1.b>)se2.c.b((Provider)new g((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)this.e, (Provider)a.w, (Provider)this.g, (Provider)a.e, (Provider)this.i, (Provider)this.j, (Provider)this.k, (Provider)a.m, (Provider)this.f, (Provider)this.l, b, (Provider)a.p0, 1));
    }
}
