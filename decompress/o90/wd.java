// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import se2.c;
import ib0.b;
import com.reddit.events.sociallinks.SocialLinksAnalytics;
import javax.inject.Provider;
import hu1.e;
import com.reddit.screen.BaseScreen;
import ae0.y;
import hg2.j;
import rg2.a;

public final class wd
{
    public final a<j> a;
    public final y b;
    public final BaseScreen c;
    public final e d;
    public final z0 e;
    public Provider<SocialLinksAnalytics> f;
    
    public wd(final z0 e, final BaseScreen c, final a a, final y b, final e d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = (Provider<SocialLinksAnalytics>)se2.c.b((Provider)new b((Provider)e.h, 24));
    }
}
