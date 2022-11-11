// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import mg0.x;
import se2.c;
import com.reddit.screen.BaseScreen;
import zk1.b;
import javax.inject.Provider;
import vh1.a;
import yr0.d;
import se2.e;

public final class zl implements yt
{
    public final dl a;
    public e b;
    public d c;
    public a d;
    public Provider<b> e;
    public Provider<mh0.a> f;
    
    public zl(final dl a, final BaseScreen baseScreen, final cl1.b b) {
        this.a = a;
        final e a2 = se2.e.a((Object)baseScreen);
        this.b = a2;
        this.c = yr0.d.a(a2);
        this.d = vh1.a.a((Provider)uv0.b.e((Provider)this.b));
        this.e = (Provider<b>)se2.c.b((Provider)zk1.a.a((Provider)this.c, (Provider)this.b, a.S, (Provider)this.d, dt.b.b(a.e), a.z));
        this.f = (Provider<mh0.a>)se2.c.b((Provider)x.d((Provider)a.F));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
