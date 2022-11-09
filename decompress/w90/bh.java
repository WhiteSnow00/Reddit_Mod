// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import ah2.f;
import af2.c;
import com.reddit.screen.BaseScreen;
import vk1.a;
import javax.inject.Provider;
import iv0.b;
import n41.d;
import af2.e;

public final class bh implements du
{
    public final kl a;
    public e b;
    public e c;
    public d d;
    public b e;
    public Provider<ll1.b> f;
    public Provider<a> g;
    
    public bh(final kl a, final BaseScreen baseScreen, final vk1.b b) {
        this.a = a;
        this.b = af2.e.a((Object)b);
        final e a2 = af2.e.a((Object)baseScreen);
        this.c = a2;
        this.d = n41.d.b(a2);
        this.e = iv0.b.a((Provider)sa1.b.a((Provider)this.c));
        final Provider b2 = af2.c.b((Provider)ll1.a.a((Provider)this.d, (Provider)this.c, a.P, (Provider)this.e, ht.b.a(a.e), a.z));
        this.f = (Provider<ll1.b>)b2;
        final e b3 = this.b;
        final kl.e0 g2 = a.G2;
        final kl.la z = a.z;
        final kl.k j = a.j;
        final kl.ha h = a.H;
        ah2.f.f((Object)b3, "view");
        ah2.f.f((Object)g2, "adPersonalizationRepository");
        ah2.f.f((Object)z, "resourceProvider");
        ah2.f.f((Object)j, "backgroundThread");
        ah2.f.f((Object)h, "postExecutionThread");
        this.g = (Provider<a>)af2.c.b((Provider)new vk1.d((Provider)b3, g2, b2, z, j, h));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
