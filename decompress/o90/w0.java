// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import se2.h;
import pi.d;
import com.reddit.screen.BaseScreen;
import si0.f;
import r31.k;
import javax.inject.Provider;
import cz0.c;
import ff0.q1;
import se2.e;
import com.reddit.domain.model.streaming.StreamingEntryPointType;
import com.reddit.domain.model.streaming.StreamCorrelation;
import kj0.a;
import kj0.b;

public final class w0
{
    public final b a;
    public final a b;
    public final StreamCorrelation c;
    public final StreamingEntryPointType d;
    public final o20.a e;
    public final z0 f;
    public e g;
    public e h;
    public q1 i;
    public c j;
    public Provider<k> k;
    public Provider<m20.c> l;
    public Provider<f> m;
    
    public w0(final z0 f, final b a, final a b, final StreamCorrelation c, final BaseScreen baseScreen, final StreamingEntryPointType d, final o20.a e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = se2.e.a((Object)c);
        final e a2 = se2.e.a((Object)baseScreen);
        this.h = a2;
        this.i = q1.e((Provider)a2);
        this.j = cz0.c.b((Provider)this.h);
        this.k = (Provider<k>)se2.c.b((Provider)f60.b.a((Provider)this.g, (Provider)this.i, (Provider)this.h, (Provider)f.m, (Provider)f.w, (Provider)f.E, pi.d.a((Provider)this.j, com.reddit.metrics.a.a((Provider)f.b0, (Provider)f.y), (Provider)f.m, (Provider)f.A0, (Provider)f.B0)));
        this.l = (Provider<m20.c>)se2.c.b((Provider)oa1.b.a((Provider)this.j));
        this.m = (Provider<f>)se2.h.a((Provider)ib0.b.b((Provider)f.h));
    }
}
