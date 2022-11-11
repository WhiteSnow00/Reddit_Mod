// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import el1.d;
import af2.c;
import ah2.f;
import el1.a;
import com.reddit.events.settings.EmailSettingsAnalytics;
import javax.inject.Provider;
import ol1.g;
import py.b;
import af2.e;

public final class uk implements du
{
    public final kl a;
    public e b;
    public b c;
    public g d;
    public Provider<EmailSettingsAnalytics> e;
    public Provider<a> f;
    
    public uk(final kl a, final el1.b b) {
        this.a = a;
        this.b = af2.e.a((Object)b);
        final kl.o3 o2 = a.O2;
        final kl.la z = a.z;
        this.c = new b((Provider)o2, (Provider)z, 14);
        ah2.f.f((Object)z, "resourceProvider");
        this.d = new g(z);
        final Provider b2 = af2.c.b((Provider)new qb0.b((Provider)a.F, 23));
        this.e = (Provider<EmailSettingsAnalytics>)b2;
        final e b3 = this.b;
        final b c = this.c;
        final kl.o3 o3 = a.O2;
        final g d = this.d;
        final kl.la z2 = a.z;
        final kl.ja t0 = a.t0;
        ah2.f.f((Object)b3, "view");
        ah2.f.f((Object)c, "useCase");
        ah2.f.f((Object)o3, "settingsRepository");
        ah2.f.f((Object)d, "uiMapper");
        ah2.f.f((Object)z2, "resourceProvider");
        ah2.f.f((Object)t0, "preferenceRepository");
        this.f = (Provider<a>)af2.c.b((Provider)new d((Provider)b3, (Provider)c, o3, (Provider)d, z2, b2, t0));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
