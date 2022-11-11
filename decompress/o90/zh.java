// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.c;
import xu.h;
import xu.e;
import com.reddit.ads.brandlift.BrandLiftSurveyViewPresenter;
import javax.inject.Provider;

public final class zh implements yt
{
    public final dl a;
    public Provider<BrandLiftSurveyViewPresenter> b;
    
    public zh(final dl a, final e e) {
        this.a = a;
        final se2.e a2 = se2.e.a((Object)e);
        final dl.dl$t o = a.o;
        final dl.m9 v1 = a.V1;
        final dl.dl$sa u0 = a.u0;
        final dl.dl$a0 w1 = a.W1;
        final dl.dl$u8 r1 = a.R1;
        final dl.dl$i0 p2 = a.P0;
        sg2.e.f((Object)o, "dispatcherProvider");
        sg2.e.f((Object)v1, "webCookieDelegate");
        sg2.e.f((Object)u0, "sessionManager");
        sg2.e.f((Object)w1, "accountHelper");
        sg2.e.f((Object)r1, "themeSettings");
        sg2.e.f((Object)p2, "adsFeatures");
        this.b = (Provider<BrandLiftSurveyViewPresenter>)c.b((Provider)new h(a2, o, v1, u0, w1, r1, p2));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
