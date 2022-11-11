// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.domain.model.mod.ModPermissions;
import com.reddit.domain.model.Subreddit;
import ae0.j;
import hd1.a;
import hd1.c;
import com.reddit.session.n;
import sg0.d;
import javax.inject.Provider;
import qy.b;
import se2.e;

public final class uf
{
    public final z0 a;
    public e b;
    public b c;
    public e d;
    public e e;
    public e f;
    public Provider<d> g;
    public e h;
    public Provider<n> i;
    public Provider<hd1.b> j;
    
    public uf(final z0 a, final c c, final a a2, final j j, final Subreddit subreddit, final ModPermissions modPermissions, final fd1.a a3) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = qy.b.c((Provider)a.y, (Provider)a.m, (Provider)a.r);
        this.d = se2.e.a((Object)a2);
        this.e = se2.e.b((Object)j);
        this.f = se2.e.a((Object)subreddit);
        this.g = (Provider<d>)se2.c.b((Provider)new y30.d((Provider)a.h, (Provider)this.f, (Provider)se2.e.a((Object)modPermissions), 10));
        this.h = se2.e.a((Object)a3);
        final Provider b = se2.c.b((Provider)new uv0.b((Provider)a.c, 7));
        this.i = (Provider<n>)b;
        this.j = (Provider<hd1.b>)se2.c.b((Provider)new r10.e((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)a.p0, (Provider)a.e, (Provider)a.m, (Provider)a.w, (Provider)this.e, (Provider)this.g, (Provider)a.m1, (Provider)this.h, b, 2));
    }
}
