// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import cz0.c;
import com.reddit.screen.BaseScreen;
import xd1.g;
import xd1.f;
import yd1.a;
import javax.inject.Provider;
import uv0.b;
import se2.e;

public final class q7
{
    public e a;
    public e b;
    public b c;
    public e d;
    public Provider<a> e;
    public Provider<f> f;
    
    public q7(final z0 z0, final xd1.e e, final g g, final BaseScreen baseScreen) {
        this.a = se2.e.a((Object)e);
        final e a = se2.e.a((Object)baseScreen);
        this.b = a;
        this.c = uv0.b.e((Provider)a);
        this.d = se2.e.a((Object)g);
        final Provider b = se2.c.b((Provider)new n10.b((Provider)cz0.c.b((Provider)this.b), (Provider)z0.j0, (Provider)z0.w, (Provider)z0.E, 14));
        this.e = (Provider<a>)b;
        this.f = (Provider<f>)se2.c.b((Provider)new rx.c((Provider)this.a, (Provider)this.c, (Provider)this.d, (Provider)z0.m, b, (Provider)z0.C1, (Provider)z0.e, (Provider)z0.p0, (Provider)z0.S1, (Provider)z0.X2, (Provider)z0.t1, (Provider)z0.y0, 4));
    }
}
