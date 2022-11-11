// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import dl1.a;
import dl1.c;
import dl1.b;
import javax.inject.Provider;
import se2.e;

public final class kj implements yt
{
    public final dl a;
    public e b;
    public Provider<b> c;
    
    public kj(final dl a, final c c, final a a2) {
        this.a = a;
        this.b = e.a((Object)c);
        final e a3 = e.a((Object)a2);
        final e b = this.b;
        final dl.dl$z4 h2 = a.h2;
        final dl.dl$h8 i4 = a.I4;
        final dl.dl$sa u0 = a.u0;
        final dl.na z = a.z;
        final dl.ja h3 = a.H;
        sg2.e.f((Object)b, "view");
        sg2.e.f((Object)h2, "myAccountRepository");
        sg2.e.f((Object)i4, "ssoLinkUseCase");
        sg2.e.f((Object)u0, "sessionManager");
        sg2.e.f((Object)z, "resourceProvider");
        sg2.e.f((Object)h3, "postExecutionThread");
        this.c = (Provider<b>)se2.c.b((Provider)new dl1.e((Provider)b, a3, h2, i4, u0, z, h3));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
