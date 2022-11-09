// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import com.reddit.session.Session;
import db0.t;
import bt0.j;
import com.reddit.data.onboardingtopic.RedditOnboardingChainingRepository;
import n41.d;
import kz0.k;
import com.reddit.data.onboardingtopic.RedditOnboardingChainingUseCase;
import ca0.o0;
import q20.c;
import com.reddit.events.onboardingchaining.OnboardingChainingAnalytics;
import javax.inject.Provider;
import android.content.Context;
import pj2.e;
import com.reddit.screen.BaseScreen;
import com.bluelinelabs.conductor.Router;
import android.app.Activity;
import zg2.a;
import yc0.b;
import ui1.i;

public final class wq implements du
{
    public final i a;
    public final b b;
    public final a<? extends Activity> c;
    public final a<? extends Router> d;
    public final a<? extends Router> e;
    public final BaseScreen f;
    public final a<? extends e<? extends hi1.i>> g;
    public final a<? extends Context> h;
    public final kl i;
    public Provider<OnboardingChainingAnalytics> j;
    public Provider<c> k;
    public Provider<ui1.c> l;
    
    public wq(final kl i, final BaseScreen f, final i a, final a h, final a c, final a d, final a e, final a g, final b b) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = (a<? extends Activity>)c;
        this.d = (a<? extends Router>)d;
        this.e = (a<? extends Router>)e;
        this.f = f;
        this.g = (a<? extends e<? extends hi1.i>>)g;
        this.h = (a<? extends Context>)h;
        this.j = (Provider<OnboardingChainingAnalytics>)af2.c.b((Provider)o0.b((Provider)i.F));
        final Provider b2 = af2.c.b((Provider)ei1.a.a((Provider)af2.e.a((Object)h)));
        this.k = (Provider<c>)b2;
        this.l = (Provider<ui1.c>)af2.c.b((Provider)new hg0.c((Provider)i.Q1, (Provider)ms1.a.b(b2, (Provider)i.b0), 8));
    }
    
    public final RedditOnboardingChainingUseCase a() {
        final RedditOnboardingChainingRepository u2 = ((e0)this.i.a).u2();
        kz0.k.N((Object)u2);
        final ge0.o0 z0 = ((e0)this.i.a).Z0();
        kz0.k.N((Object)z0);
        final j y6 = ((e0)this.i.a).Y6();
        kz0.k.N((Object)y6);
        final b b = this.b;
        final t p = ((e0)this.i.a).P();
        kz0.k.N((Object)p);
        final cd0.a e = ei1.a.e(n41.d.d(this.f));
        final Session c = ((e0)this.i.a).c();
        kz0.k.N((Object)c);
        return new RedditOnboardingChainingUseCase((fd0.b)u2, z0, y6, b, p, e, c);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.i.k();
    }
}
