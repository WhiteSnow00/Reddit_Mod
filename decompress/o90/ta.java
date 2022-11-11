// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import ff0.q1;
import nx0.g;
import se2.h;
import mg0.x;
import com.reddit.events.userprofile.UserProfileAnalytics;
import com.reddit.events.blocked.BlockedAccountsAnalytics;
import hi0.a0;
import ib0.b;
import se2.e;
import cz0.c;
import com.reddit.events.sociallinks.SocialLinksAnalytics;
import javax.inject.Provider;
import hg2.j;
import rg2.a;
import com.reddit.screen.BaseScreen;

public final class ta
{
    public final String a;
    public final BaseScreen b;
    public final a<j> c;
    public final z0 d;
    public Provider<SocialLinksAnalytics> e;
    public c f;
    public e g;
    public b h;
    public Provider<eu1.b> i;
    public Provider<a0> j;
    public Provider<t31.b> k;
    public Provider<st1.a> l;
    public Provider<BlockedAccountsAnalytics> m;
    public Provider<UserProfileAnalytics> n;
    
    public ta(final z0 d, final String a, final BaseScreen b, final a c, final kg0.c c2) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = (Provider<SocialLinksAnalytics>)se2.c.b((Provider)new b((Provider)d.h, 24));
        this.f = cz0.c.b((Provider)se2.e.a((Object)b));
        this.g = se2.e.a((Object)c2);
        final z0.z0$j2 h = d.h;
        this.h = new b((Provider)h, 15);
        this.i = (Provider<eu1.b>)se2.c.b((Provider)new jx.c((Provider)this.f, (Provider)d.w, (Provider)iz.b.d((Provider)d.b0, (Provider)h, (Provider)d.m2, (Provider)d.n2), (Provider)d.f1, 17));
        this.j = (Provider<a0>)se2.h.a((Provider)x.a((Provider)d.h));
        this.k = (Provider<t31.b>)se2.c.b((Provider)nx0.g.b((Provider)this.f, (Provider)d.w));
        this.l = (Provider<st1.a>)se2.c.b((Provider)new q60.c((Provider)d.v2, (Provider)this.f, (Provider)d.w, (Provider)this.g, (Provider)this.h, (Provider)this.i, (Provider)this.j, (Provider)this.k, (Provider)d.W1, (Provider)d.I3, (Provider)iz.b.c((Provider)this.f, d.w, d.f1, d.W1), (Provider)d.J3, (Provider)d.E, 3));
        this.m = (Provider<BlockedAccountsAnalytics>)se2.c.b((Provider)wb0.a.d((Provider)d.h));
        this.n = (Provider<UserProfileAnalytics>)se2.c.b((Provider)q1.d((Provider)d.h));
    }
}
