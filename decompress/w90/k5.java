// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.c;
import nx.d;
import ca0.o0;
import com.reddit.screen.BaseScreen;
import t30.g;
import t30.i;
import t30.h;
import javax.inject.Provider;
import vx.b;
import af2.e;

public final class k5
{
    public e a;
    public e b;
    public b c;
    public py.b d;
    public py.b e;
    public Provider<h> f;
    
    public k5(final a1 a1, final i i, final g g, final BaseScreen baseScreen) {
        this.a = af2.e.a((Object)i);
        this.b = af2.e.a((Object)g);
        final a1$p1 v = a1.v;
        final a1$p9 m = a1.m;
        this.c = new b((Provider)v, (Provider)m, 16);
        this.d = new py.b((Provider)v, (Provider)m, 12);
        this.e = new py.b((Provider)v, (Provider)m, 16);
        this.f = (Provider<h>)af2.c.b((Provider)new d((Provider)this.a, (Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)this.e, (Provider)new ht.b((Provider)iv0.b.b((Provider)af2.e.a((Object)baseScreen)), 5), (Provider)a1.w, (Provider)new o0((Provider)a1.h, 13), (Provider)a1.m, 1));
    }
}
