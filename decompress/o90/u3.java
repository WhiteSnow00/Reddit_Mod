// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import u30.f;
import javax.inject.Provider;
import se2.e;
import fb0.b;
import com.reddit.screen.BaseScreen;
import ne1.a;
import ne1.c;

public final class u3
{
    public final c a;
    public final a b;
    public final BaseScreen c;
    public final rg2.a<b> d;
    public final z0 e;
    public e f;
    public e g;
    public Provider<as1.a> h;
    public Provider<qy1.a> i;
    
    public u3(final z0 e, final c a, final a b, final BaseScreen c, final qy1.b b2, final String s, final rg2.a d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = se2.e.a((Object)b2);
        final e a2 = se2.e.a((Object)c);
        this.g = a2;
        this.h = (Provider<as1.a>)se2.c.b((Provider)oy.e.b((Provider)cz0.c.b((Provider)a2), (Provider)this.g, (Provider)e.w, (Provider)e.T, (Provider)e.U, (Provider)e.V));
        this.i = (Provider<qy1.a>)se2.c.b((Provider)new f((Provider)this.f, (Provider)e.X, (Provider)this.h, (Provider)e.W, (Provider)e.V, (Provider)se2.e.a((Object)s), (Provider)e.n, (Provider)e.d1, 3));
    }
}
