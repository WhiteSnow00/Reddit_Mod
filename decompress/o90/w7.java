// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import jx.c;
import com.reddit.domain.model.sociallink.SocialLink;
import bu1.a;
import com.reddit.events.sociallinks.SocialLinksAnalytics;
import javax.inject.Provider;
import iz.b;
import se2.e;

public final class w7
{
    public e a;
    public e b;
    public b c;
    public e d;
    public Provider<eu1.b> e;
    public Provider<SocialLinksAnalytics> f;
    public Provider<a> g;
    
    public w7(final z0 z0, final rg2.a a, final bu1.b b, final String s, final SocialLink socialLink) {
        this.a = se2.e.b((Object)s);
        this.b = se2.e.a((Object)socialLink);
        this.c = iz.b.d((Provider)z0.b0, (Provider)z0.h, (Provider)z0.m2, (Provider)z0.n2);
        this.d = se2.e.a((Object)b);
        this.e = (Provider<eu1.b>)se2.c.b((Provider)new c((Provider)se2.e.a((Object)a), (Provider)z0.w, (Provider)this.c, (Provider)z0.f1, 17));
        final Provider b2 = se2.c.b((Provider)new ib0.b((Provider)z0.h, 24));
        this.f = (Provider<SocialLinksAnalytics>)b2;
        this.g = (Provider<a>)se2.c.b((Provider)new f60.b((Provider)this.a, (Provider)this.b, (Provider)z0.b0, (Provider)this.c, (Provider)this.d, this.e, b2, 7));
    }
}
