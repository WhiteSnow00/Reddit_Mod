// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import oa1.b;
import com.reddit.screen.BaseScreen;
import tn1.n;
import tn1.m;
import k20.a;
import javax.inject.Provider;
import cz0.c;
import se2.e;

public final class qe
{
    public final z0 a;
    public e b;
    public e c;
    public c d;
    public Provider<a> e;
    public Provider<m> f;
    public Provider<m20.c> g;
    
    public qe(final z0 a, final n n, final BaseScreen baseScreen) {
        this.a = a;
        this.b = se2.e.a((Object)n);
        final e a2 = se2.e.a((Object)baseScreen);
        this.c = a2;
        final c b = cz0.c.b((Provider)a2);
        this.d = b;
        this.e = (Provider<a>)se2.c.b((Provider)vy.e.a((Provider)b, (Provider)a.E, (Provider)a.w));
        this.f = (Provider<m>)se2.c.b((Provider)new q40.a((Provider)this.b, (Provider)a.y, (Provider)a.b0, (Provider)this.e, (Provider)a.e, (Provider)a.p0, (Provider)a.m, (Provider)oa1.b.b((Provider)this.c), (Provider)a.e0, 6));
        this.g = (Provider<m20.c>)se2.c.b((Provider)oa1.b.a((Provider)this.d));
    }
}
