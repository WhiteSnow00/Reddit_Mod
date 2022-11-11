// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import b40.k0;
import com.reddit.screen.BaseScreen;
import xr1.a;
import vr1.y;
import javax.inject.Provider;
import uw.f;
import ek0.d;
import uv0.b;
import cz0.c;
import se2.e;

public final class ob
{
    public e a;
    public e b;
    public c c;
    public b d;
    public e e;
    public d f;
    public f g;
    public Provider<y> h;
    public Provider<a> i;
    public Provider<m20.c> j;
    
    public ob(final z0 z0, final xr1.b b, final BaseScreen baseScreen, final rg2.a a) {
        this.a = se2.e.a((Object)b);
        final e a2 = se2.e.a((Object)baseScreen);
        this.b = a2;
        this.c = cz0.c.b((Provider)a2);
        this.d = uv0.b.e((Provider)this.b);
        final e a3 = se2.e.a((Object)a);
        this.e = a3;
        final d a4 = ek0.d.a((Provider)this.c, (Provider)this.d, z0.j0, z0.w, z0.E, z0.f1, z0.g1, a3);
        this.f = a4;
        final f g = new f((Provider)this.e, (Provider)z0.h, 25);
        this.g = g;
        final Provider b2 = se2.c.b((Provider)new k0((Provider)z0.y, (Provider)new vh1.a((Object)z0.p, 2), (Provider)a4, (Provider)g, 19));
        this.h = (Provider<y>)b2;
        this.i = (Provider<a>)se2.c.b((Provider)new vl0.f((Provider)this.a, (Provider)this.f, (Provider)z0.r, (Provider)z0.y, (Provider)this.g, b2, 6));
        this.j = (Provider<m20.c>)se2.c.b((Provider)oa1.b.a((Provider)this.c));
    }
}
