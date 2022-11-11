// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import pi.d;
import oa1.b;
import com.reddit.domain.model.streaming.StreamCorrelation;
import com.reddit.screen.BaseScreen;
import v10.u;
import r31.k;
import ff0.q1;
import javax.inject.Provider;
import cz0.c;
import se2.e;
import com.reddit.domain.model.streaming.StreamingEntryPointType;
import jj0.a;

public final class u0
{
    public final a a;
    public final StreamingEntryPointType b;
    public final z0 c;
    public e d;
    public c e;
    public Provider<m20.c> f;
    public e g;
    public q1 h;
    public Provider<k> i;
    public Provider<u> j;
    
    public u0(final z0 c, final a a, final BaseScreen baseScreen, final StreamingEntryPointType b, final StreamCorrelation streamCorrelation) {
        this.c = c;
        this.a = a;
        this.b = b;
        final e a2 = se2.e.a((Object)baseScreen);
        this.d = a2;
        final c b2 = cz0.c.b((Provider)a2);
        this.e = b2;
        this.f = (Provider<m20.c>)se2.c.b((Provider)oa1.b.a((Provider)b2));
        this.g = se2.e.a((Object)streamCorrelation);
        this.h = q1.e((Provider)this.d);
        this.i = (Provider<k>)se2.c.b((Provider)f60.b.a((Provider)this.g, (Provider)this.h, (Provider)this.d, (Provider)c.m, (Provider)c.w, (Provider)c.E, pi.d.a((Provider)this.e, com.reddit.metrics.a.a((Provider)c.b0, (Provider)c.y), (Provider)c.m, (Provider)c.A0, (Provider)c.B0)));
        this.j = (Provider<u>)se2.c.b((Provider)new nx.c((Provider)c.L, 3));
    }
}
