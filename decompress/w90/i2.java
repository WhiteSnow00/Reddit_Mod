// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import g60.u1;
import af2.c;
import w30.d;
import yy1.b;
import ls1.a;
import javax.inject.Provider;
import af2.e;
import com.reddit.screen.BaseScreen;

public final class i2
{
    public final BaseScreen a;
    public final a1 b;
    public e c;
    public e d;
    public Provider<a> e;
    public Provider<yy1.a> f;
    
    public i2(final a1 b, final BaseScreen a, final b b2) {
        this.b = b;
        this.a = a;
        this.c = af2.e.a((Object)b2);
        final e a2 = af2.e.a((Object)a);
        this.d = a2;
        this.e = (Provider<a>)af2.c.b((Provider)w30.d.b((Provider)iv0.b.b((Provider)a2), (Provider)this.d, (Provider)b.w, (Provider)b.T, (Provider)b.U, (Provider)b.V));
        this.f = (Provider<yy1.a>)af2.c.b((Provider)u1.a((Provider)this.c, (Provider)b.X, this.e, (Provider)b.W, (Provider)b.V, (Provider)af2.e.a((Object)"my_subscriptions"), (Provider)b.n, (Provider)b.a1));
    }
}
