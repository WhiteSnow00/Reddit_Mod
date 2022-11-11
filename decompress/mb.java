// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import oa1.b;
import rg2.a;
import com.reddit.screen.BaseScreen;
import j91.g;
import java.util.List;
import j91.d;
import m20.c;
import j91.f;
import javax.inject.Provider;
import se2.e;

public final class mb
{
    public final z0 a;
    public e b;
    public e c;
    public e d;
    public Provider<f> e;
    public e f;
    public Provider<c> g;
    public Provider<j91.e> h;
    
    public mb(final z0 a, final d d, final List list, final g g, final BaseScreen baseScreen, final a a2, final j91.c c) {
        this.a = a;
        this.b = se2.e.a((Object)d);
        this.c = se2.e.a((Object)list);
        this.d = se2.e.a((Object)g);
        this.e = (Provider<f>)se2.c.b((Provider)new nx.c((Provider)se2.e.a((Object)baseScreen), 14));
        this.f = se2.e.a((Object)c);
        final Provider b = se2.c.b((Provider)oa1.b.a((Provider)se2.e.a((Object)a2)));
        this.g = (Provider<c>)b;
        this.h = (Provider<j91.e>)se2.c.b((Provider)new f40.a((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)this.e, (Provider)this.f, b, 2));
    }
}
