// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import rx.d;
import com.reddit.screen.BaseScreen;
import cs1.b;
import dx.a;
import javax.inject.Provider;
import hg0.f;
import se2.e;
import cz0.c;

public final class u4
{
    public c a;
    public e b;
    public f c;
    public Provider<f42.f> d;
    public a e;
    public Provider<cs1.a> f;
    
    public u4(final z0 z0, final b b, final BaseScreen baseScreen) {
        this.a = cz0.c.b((Provider)se2.e.a((Object)baseScreen));
        this.b = se2.e.a((Object)b);
        this.c = hg0.f.c((Provider)z0.j);
        final Provider b2 = se2.c.b((Provider)uv0.b.c((Provider)this.a));
        this.d = (Provider<f42.f>)b2;
        this.e = new a((Provider)z0.Q0, (Provider)this.c, b2, (Provider)z0.m, 8);
        this.f = (Provider<cs1.a>)se2.c.b((Provider)new q40.a((Provider)this.a, (Provider)this.b, (Provider)z0.m, (Provider)z0.D, (Provider)this.e, (Provider)z0.W1, (Provider)rx.d.a((Provider)z0.y, (Provider)z0.e, (Provider)z0.p0), (Provider)new wb0.a((Provider)z0.h, 14), (Provider)z0.r, 7));
    }
}
