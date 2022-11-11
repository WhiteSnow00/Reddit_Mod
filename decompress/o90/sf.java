// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import ae0.i;
import com.reddit.domain.model.mod.ModPermissions;
import com.reddit.domain.model.Subreddit;
import rg2.a;
import cd1.c;
import sg0.d;
import javax.inject.Provider;
import v40.k;
import qy.b;
import se2.e;

public final class sf
{
    public e a;
    public e b;
    public e c;
    public e d;
    public b e;
    public k f;
    public e g;
    public Provider<d> h;
    public ib0.b i;
    public Provider<c> j;
    
    public sf(final z0 z0, final cd1.d d, final a a, final cd1.b b, final Subreddit subreddit, final ModPermissions modPermissions, final i i, final cd1.a a2) {
        this.a = se2.e.a((Object)d);
        this.b = se2.e.a((Object)b);
        this.c = se2.e.b((Object)i);
        this.d = se2.e.a((Object)a2);
        final z0.z9 y = z0.y;
        final z0.z0$s9 m = z0.m;
        final z0.z0$m e = z0.e;
        this.e = new b((Provider)y, (Provider)m, (Provider)e, 14);
        this.f = new k((Provider)y, (Provider)m, (Provider)e, 6);
        this.g = se2.e.a((Object)subreddit);
        this.h = (Provider<d>)se2.c.b((Provider)new y30.d((Provider)z0.h, (Provider)this.g, (Provider)se2.e.a((Object)modPermissions), 10));
        this.i = new ib0.b((Provider)z0.y, 5);
        this.j = (Provider<c>)se2.c.b((Provider)new rx.c((Provider)this.a, (Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)this.e, (Provider)this.f, (Provider)z0.p0, (Provider)z0.w, (Provider)z0.m, (Provider)this.h, (Provider)this.i, (Provider)se2.e.a((Object)a), 3));
    }
}
