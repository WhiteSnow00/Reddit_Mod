// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import bv.h;
import ah2.f;
import bv.e;
import com.reddit.ads.brandlift.BrandLiftSurveyViewPresenter;
import javax.inject.Provider;

public final class fi implements du
{
    public final kl a;
    public Provider<BrandLiftSurveyViewPresenter> b;
    
    public fi(final kl a, final e e) {
        this.a = a;
        final af2.e a2 = af2.e.a((Object)e);
        final kl$t o = a.o;
        final kl.k9 u1 = a.U1;
        final kl.qa u2 = a.u0;
        final kl$a0 v1 = a.V1;
        final kl$s8 q1 = a.Q1;
        final kl.i0 o2 = a.O0;
        f.f((Object)o, "dispatcherProvider");
        f.f((Object)u1, "webCookieDelegate");
        f.f((Object)u2, "sessionManager");
        f.f((Object)v1, "accountHelper");
        f.f((Object)q1, "themeSettings");
        f.f((Object)o2, "adsFeatures");
        this.b = (Provider<BrandLiftSurveyViewPresenter>)c.b((Provider)new h(a2, o, u1, u2, v1, q1, o2));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
