// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import ca0.o0;
import qb0.b;
import com.reddit.screen.BaseScreen;
import t61.d;
import com.reddit.events.postsets.PostSetAnalytics;
import nx.c;
import com.reddit.events.postsubmit.CrosspostAnalytics;
import javax.inject.Provider;
import af2.e;

public final class m3
{
    public final a1 a;
    public e b;
    public e c;
    public Provider<CrosspostAnalytics> d;
    public c e;
    public n41.c f;
    public Provider<PostSetAnalytics> g;
    public Provider<d> h;
    
    public m3(final a1 a, final t61.e e, final t61.c c, final BaseScreen baseScreen) {
        this.a = a;
        this.b = af2.e.a((Object)e);
        this.c = af2.e.a((Object)c);
        this.d = (Provider<CrosspostAnalytics>)af2.c.b((Provider)new b((Provider)a.h, 18));
        this.e = new c((Provider)iv0.b.b((Provider)af2.e.a((Object)baseScreen)), (Provider)a.w, (Provider)a.A1, (Provider)a.J0, 9);
        this.f = new n41.c((Provider)a.y, (Provider)a.D, 1);
        final Provider b = af2.c.b((Provider)o0.c((Provider)a.h));
        this.g = (Provider<PostSetAnalytics>)b;
        this.h = (Provider<d>)af2.c.b((Provider)new xk0.d((Provider)this.b, (Provider)this.c, (Provider)a.i, (Provider)a.y, (Provider)a.D, (Provider)a.x1, (Provider)this.d, (Provider)a.o0, (Provider)this.e, (Provider)a.e, (Provider)this.f, b, (Provider)a.B1, 1));
    }
}
