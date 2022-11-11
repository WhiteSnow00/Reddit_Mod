// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import ah2.f;
import pl1.a;
import pl1.c;
import pl1.b;
import javax.inject.Provider;
import af2.e;

public final class qj implements du
{
    public final kl a;
    public e b;
    public Provider<b> c;
    
    public qj(final kl a, final c c, final a a2) {
        this.a = a;
        this.b = e.a((Object)c);
        final e a3 = e.a((Object)a2);
        final e b = this.b;
        final kl$z4 g2 = a.g2;
        final kl.f8 g3 = a.G4;
        final kl.qa u0 = a.u0;
        final kl.la z = a.z;
        final kl.ha h = a.H;
        f.f((Object)b, "view");
        f.f((Object)g2, "myAccountRepository");
        f.f((Object)g3, "ssoLinkUseCase");
        f.f((Object)u0, "sessionManager");
        f.f((Object)z, "resourceProvider");
        f.f((Object)h, "postExecutionThread");
        this.c = (Provider<b>)af2.c.b((Provider)new pl1.e((Provider)b, a3, g2, g3, u0, z, h));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
