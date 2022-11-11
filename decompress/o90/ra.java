// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import mg0.x;
import rg2.a;
import iz.b;
import m20.c;
import rx.d;
import com.reddit.events.profile.card.ProfileCardAnalytics;
import javax.inject.Provider;
import se2.e;

public final class ra
{
    public e a;
    public e b;
    public Provider<ProfileCardAnalytics> c;
    public d d;
    public e e;
    public Provider<c> f;
    public b g;
    public Provider<nt1.b> h;
    
    public ra(final z0 z0, final a a, final nt1.c c, final nt1.d d, final ha0.b b) {
        this.a = se2.e.a((Object)c);
        this.b = se2.e.a((Object)d);
        this.c = (Provider<ProfileCardAnalytics>)se2.c.b((Provider)new x((Provider)z0.h, 14));
        this.d = rx.d.a((Provider)z0.y, (Provider)z0.e, (Provider)z0.p0);
        final e a2 = se2.e.a((Object)a);
        this.e = a2;
        this.f = (Provider<c>)se2.c.b((Provider)oa1.b.a((Provider)a2));
        this.g = iz.b.c((Provider)this.e, z0.w, z0.f1, z0.W1);
        this.h = (Provider<nt1.b>)se2.c.b((Provider)new g40.d((Provider)this.a, (Provider)z0.b0, (Provider)z0.C0, (Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)this.f, (Provider)z0.c0, (Provider)this.g, (Provider)se2.e.b((Object)b), (Provider)z0.D0, 3));
    }
}
