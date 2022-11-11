// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import com.reddit.session.Session;
import db0.t;
import rc0.d;
import kz0.k;
import com.reddit.screen.di.ScreenPresentationModule;
import com.reddit.screen.onboarding.coordinator.RedditOnboardingFlowNavigator;
import h00.i;
import af2.e;
import je0.s;
import gd0.c;
import javax.inject.Provider;
import iv0.b;
import com.bluelinelabs.conductor.Router;
import zg2.a;
import com.reddit.screen.BaseScreen;

public final class dp implements du
{
    public final BaseScreen a;
    public final a<? extends Router> b;
    public final a<? extends Router> c;
    public final kl d;
    public b e;
    public Provider<dj1.b> f;
    
    public dp(final kl d, final BaseScreen a, final yc0.b b, final c c, final a b2, final a c2, final s s) {
        this.d = d;
        this.a = a;
        this.b = (a<? extends Router>)b2;
        this.c = (a<? extends Router>)c2;
        this.e = iv0.b.b((Provider)af2.e.a((Object)a));
        this.f = (Provider<dj1.b>)af2.c.b((Provider)new i((Provider)this.e, (Provider)d.P, (Provider)af2.e.a((Object)s), (Provider)d.b0, (Provider)d.z, 11));
    }
    
    public final RedditOnboardingFlowNavigator a() {
        final a a = ScreenPresentationModule.a(this.a);
        final a<? extends Router> b = this.b;
        final a<? extends Router> c = this.c;
        final d i = ((e0)this.d.a).i();
        k.N((Object)i);
        final bt0.e e1 = ((e0)this.d.a).E1();
        k.N((Object)e1);
        final e80.e f6 = ((e0)this.d.a).F6();
        k.N((Object)f6);
        final t p = ((e0)this.d.a).P();
        k.N((Object)p);
        final Session c2 = ((e0)this.d.a).c();
        k.N((Object)c2);
        return new RedditOnboardingFlowNavigator(a, (a)b, (a)c, i, e1, f6, p, c2);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.d.k();
    }
}
