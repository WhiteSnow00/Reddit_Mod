// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import fl1.h;
import ah2.f;
import af2.e;
import fl1.c;
import fl1.b;
import javax.inject.Provider;

public final class dl implements du
{
    public final kl a;
    public Provider<b> b;
    
    public dl(final kl a, final c c) {
        this.a = a;
        final e a2 = e.a((Object)c);
        final kl.p2 p2 = a.P2;
        final kl.q2 g1 = a.G1;
        final kl.k j = a.j;
        final kl.ha h = a.H;
        f.f((Object)p2, "experimentManager");
        f.f((Object)g1, "experimentReader");
        f.f((Object)j, "backgroundThread");
        f.f((Object)h, "postExecutionThread");
        this.b = (Provider<b>)af2.c.b((Provider)new h(a2, p2, g1, j, h));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
