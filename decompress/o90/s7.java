// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import us0.f;
import va0.z;
import mg0.x;
import kl0.g;
import ff0.q1;
import ib0.b;
import com.reddit.presentation.RedditNavHeaderView;
import com.reddit.presentation.RedditNavHeaderPresenter;
import ki0.c;
import javax.inject.Provider;
import nx.a;
import se2.e;
import com.reddit.screen.BaseScreen;

public final class s7
{
    public final BaseScreen a;
    public final z0 b;
    public e c;
    public a d;
    public Provider<c> e;
    public Provider<RedditNavHeaderPresenter> f;
    public Provider<sg0.e> g;
    public e h;
    public Provider<qs0.a> i;
    
    public s7(final z0 b, final RedditNavHeaderView redditNavHeaderView, final BaseScreen a) {
        this.b = b;
        this.a = a;
        this.c = se2.e.a((Object)redditNavHeaderView);
        this.d = new a((Provider)new b((Provider)b.d, 4), 27);
        this.e = (Provider<c>)se2.c.b((Provider)ib0.b.a((Provider)b.h));
        this.f = (Provider<RedditNavHeaderPresenter>)se2.c.b((Provider)new g((Provider)this.c, (Provider)this.d, (Provider)b.p0, (Provider)b.e, (Provider)b.Q0, (Provider)b.b0, (Provider)b.c, (Provider)b.j, (Provider)b.m, (Provider)b.t1, (Provider)this.e, (Provider)q1.c((Provider)b.h), (Provider)b.Y2, (Provider)b.Z2, (Provider)b.a3, (Provider)b.b3, (Provider)b.g0, (Provider)b.W0, (Provider)b.r, (Provider)b.c3, (Provider)b.d3, (Provider)b.e3, (Provider)b.q2, 1));
        this.g = (Provider<sg0.e>)se2.c.b((Provider)new x((Provider)b.h, 1));
        final e a2 = se2.e.a((Object)a);
        this.h = a2;
        this.i = (Provider<qs0.a>)se2.c.b((Provider)jx.c.a((Provider)cz0.c.b((Provider)a2), (Provider)b.w, (Provider)b.E, (Provider)this.h));
    }
    
    public final q40.b a() {
        final z k7 = this.b.a.k7();
        ui.b.n((Object)k7);
        final f e7 = this.b.a.E7();
        ui.b.n((Object)e7);
        return new q40.b(k7, e7);
    }
}
