// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import ez.g;
import se2.h;
import zk0.i;
import com.reddit.screen.BaseScreen;
import b42.a;
import e42.b;
import zk0.d;
import f42.f;
import javax.inject.Provider;
import cz0.c;
import se2.e;

public final class me
{
    public final z0 a;
    public e b;
    public c c;
    public Provider<f> d;
    public kn1.c e;
    public e f;
    public Provider<d> g;
    public Provider<b> h;
    public Provider<a> i;
    public Provider<ou1.b> j;
    
    public me(final z0 a, final ou1.c c, final BaseScreen baseScreen, final ou1.a a2) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        final c b = cz0.c.b((Provider)se2.e.a((Object)baseScreen));
        this.c = b;
        final Provider b2 = se2.c.b((Provider)uv0.b.c((Provider)b));
        this.d = (Provider<f>)b2;
        this.e = kn1.c.a(b2, (Provider)a.d0);
        this.f = se2.e.a((Object)a2);
        this.g = (Provider<d>)se2.h.a((Provider)zk0.i.a((Provider)a.m));
        final Provider b3 = se2.c.b((Provider)new vh1.a((Object)this.c, 3));
        this.h = (Provider<b>)b3;
        final Provider b4 = se2.c.b((Provider)new q30.b((Provider)this.c, b3, (Provider)a.e0, 29));
        this.i = (Provider<a>)b4;
        this.j = (Provider<ou1.b>)se2.c.b((Provider)new g((Provider)this.b, (Provider)a.X, (Provider)this.e, (Provider)a.m, (Provider)a.W, (Provider)a.d0, (Provider)this.f, (Provider)this.g, (Provider)a.p4, b4, 7));
    }
}
