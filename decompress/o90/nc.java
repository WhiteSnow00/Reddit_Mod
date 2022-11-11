// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import z50.s1;
import b40.k0;
import uw.f;
import com.reddit.screen.BaseScreen;
import vr1.y;
import javax.inject.Provider;
import vh1.a;
import ek0.d;
import uv0.b;
import cz0.c;
import se2.e;

public final class nc
{
    public e a;
    public e b;
    public c c;
    public b d;
    public e e;
    public d f;
    public a g;
    public Provider<y> h;
    public Provider<yr1.a> i;
    public Provider<m20.c> j;
    
    public nc(final z0 z0, final yr1.b b, final BaseScreen baseScreen, final rg2.a a) {
        this.a = se2.e.a((Object)b);
        final e a2 = se2.e.a((Object)baseScreen);
        this.b = a2;
        this.c = cz0.c.b((Provider)a2);
        this.d = uv0.b.e((Provider)this.b);
        final e a3 = se2.e.a((Object)a);
        this.e = a3;
        final d a4 = ek0.d.a((Provider)this.c, (Provider)this.d, z0.j0, z0.w, z0.E, z0.f1, z0.g1, a3);
        this.f = a4;
        final a g = new a((Object)z0.p, 2);
        this.g = g;
        final Provider b2 = se2.c.b((Provider)new k0((Provider)z0.y, (Provider)g, (Provider)a4, (Provider)new f((Provider)this.e, (Provider)z0.h, 25), 19));
        this.h = (Provider<y>)b2;
        final z0.z9 y = z0.y;
        final a g2 = this.g;
        this.i = (Provider<yr1.a>)se2.c.b((Provider)new s1((Provider)this.a, (Provider)this.f, (Provider)z0.m, b2, (Provider)new y30.d((Provider)y, (Provider)g2, (Provider)z0.r, 21), (Provider)z0.p, (Provider)z0.d1, (Provider)z0.n1, (Provider)g2, (Provider)z0.q1, (Provider)z0.c, 4));
        this.j = (Provider<m20.c>)se2.c.b((Provider)oa1.b.a((Provider)this.c));
    }
}
