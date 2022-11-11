// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import z30.l;
import is0.d$a;
import com.reddit.screen.BaseScreen;
import ks0.c;
import ks0.b;
import qs0.a;
import js0.d;
import javax.inject.Provider;
import se2.e;

public final class u
{
    public final z0 a;
    public e b;
    public e c;
    public Provider<js0.e> d;
    public Provider<d> e;
    public e f;
    public Provider<a> g;
    public Provider<b> h;
    
    public u(final z0 a, final c c, final ks0.a a2, final BaseScreen baseScreen) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = se2.e.a((Object)a2);
        final Provider b = se2.c.b((Provider)d$a.a);
        this.d = (Provider<js0.e>)b;
        this.e = (Provider<d>)se2.c.b((Provider)new rx.d((Provider)a.G, b, (Provider)a.H, 19));
        final e a3 = se2.e.a((Object)baseScreen);
        this.f = a3;
        final Provider b2 = se2.c.b((Provider)jx.c.a((Provider)cz0.c.b((Provider)a3), (Provider)a.w, (Provider)a.E, (Provider)this.f));
        this.g = (Provider<a>)b2;
        this.h = (Provider<b>)se2.c.b((Provider)new l((Provider)this.b, (Provider)this.c, (Provider)this.e, (Provider)a.F, b2, (Provider)a.D, 3));
    }
}
