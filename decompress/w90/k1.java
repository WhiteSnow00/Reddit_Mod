// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import vx.c;
import uz.i;
import af2.h;
import com.reddit.screen.BaseScreen;
import com.reddit.billing.RedditBillingManager;
import com.reddit.billing.RemotePurchaseDataSource;
import javax.inject.Provider;
import iv0.b;
import af2.e;

public final class k1
{
    public final a1 a;
    public e b;
    public b c;
    public sa1.b d;
    public Provider<RemotePurchaseDataSource> e;
    public py.b f;
    public Provider<RedditBillingManager> g;
    
    public k1(final a1 a, final BaseScreen baseScreen) {
        this.a = a;
        final e a2 = af2.e.a((Object)baseScreen);
        this.b = a2;
        this.c = iv0.b.b((Provider)a2);
        this.d = sa1.b.a((Provider)this.b);
        final Provider a3 = h.a((Provider)rx.b.a((Provider)a.D0));
        this.e = (Provider<RemotePurchaseDataSource>)a3;
        this.f = py.b.a(a3, (Provider)a.E0);
        this.g = (Provider<RedditBillingManager>)af2.c.b((Provider)vx.c.b((Provider)this.c, (Provider)this.d, (Provider)this.f, (Provider)a.c, (Provider)a.b0, (Provider)a.F0, (Provider)a.G0, (Provider)a.o0, (Provider)a.m, (Provider)i.a((Provider)a.c, (Provider)a.K), (Provider)a.H0, (Provider)a.V));
    }
}
