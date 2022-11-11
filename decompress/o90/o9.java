// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import rj1.a;
import com.reddit.screen.BaseScreen;
import javax.inject.Provider;
import uv0.b;
import cz0.c;
import se2.e;

public final class o9
{
    public e a;
    public e b;
    public c c;
    public b d;
    public r10.e e;
    public e f;
    public Provider<rj1.b> g;
    
    public o9(final z0 z0, final rj1.c c, final BaseScreen baseScreen, final a a, final String s) {
        this.a = se2.e.a((Object)c);
        this.b = se2.e.a((Object)a);
        this.c = cz0.c.b((Provider)se2.e.a((Object)baseScreen));
        this.d = uv0.b.d((Provider)z0.m);
        this.e = r10.e.b((Provider)z0.c0, (Provider)z0.m, (Provider)this.c, (Provider)z0.n, (Provider)z0.i, (Provider)z0.D2, (Provider)z0.V, (Provider)this.d, (Provider)nx.a.a(), (Provider)z0.i0, (Provider)z0.E2);
        this.f = se2.e.b((Object)s);
        this.g = (Provider<rj1.b>)se2.c.b((Provider)new f40.a((Provider)this.a, (Provider)this.b, (Provider)this.e, (Provider)z0.D2, (Provider)this.f, (Provider)id0.b.e((Provider)z0.h), 3));
    }
}
