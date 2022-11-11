// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.domain.model.mod.ModPermissions;
import com.reddit.domain.model.Subreddit;
import ic1.a;
import ic1.c;
import sg0.d;
import javax.inject.Provider;
import qy.b;
import se2.e;

public final class wf
{
    public final z0 a;
    public e b;
    public e c;
    public b d;
    public e e;
    public e f;
    public Provider<d> g;
    public Provider<ic1.b> h;
    
    public wf(final z0 a, final c c, final a a2, final ae0.c c2, final Subreddit subreddit, final ModPermissions modPermissions) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = se2.e.b((Object)c2);
        this.d = qy.b.c((Provider)a.y, (Provider)a.m, (Provider)a.r);
        this.e = se2.e.a((Object)a2);
        this.f = se2.e.a((Object)subreddit);
        final Provider b = se2.c.b((Provider)new y30.d((Provider)a.h, (Provider)this.f, (Provider)se2.e.a((Object)modPermissions), 10));
        this.g = (Provider<d>)b;
        this.h = (Provider<ic1.b>)se2.c.b((Provider)new ek0.d((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)a.m, (Provider)a.p0, (Provider)this.e, (Provider)a.w, b, 5));
    }
}
