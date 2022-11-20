// 
// Decompiled by Procyon v0.6.0
// 

package m50;

import ng2.e;
import o90.x0$z6;
import o90.x0$w7;
import o90.x0$d5;
import o90.x0$b8;
import o90.x0;
import o90.x0$t9;
import o90.x0$c5;
import ws0.f;
import com.reddit.session.Session;
import n12.m;
import tc0.a;
import ws0.r;
import ws0.k;
import xd0.h0;
import wc0.b;
import javax.inject.Provider;
import com.reddit.data.onboardingtopic.RedditOnboardingChainingUseCase;
import ne2.d;

public final class h implements d<RedditOnboardingChainingUseCase>
{
    public final Provider<b> a;
    public final Provider<h0> b;
    public final Provider<k> c;
    public final Provider<r> d;
    public final Provider<oc0.b> e;
    public final Provider<wa0.r> f;
    public final Provider<a> g;
    public final Provider<m> h;
    public final Provider<Session> i;
    public final Provider<f> j;
    
    public h(final x0$c5 a, final x0$t9 b, final x0.f5 c, final x0$b8 d, final Provider e, final x0$d5 f, final yi0.b g, final x0$w7 h, final x0$z6 i, final x0.g3 j) {
        ng2.e.f((Object)a, "onboardingChainingRepository");
        ng2.e.f((Object)b, "subredditRepository");
        ng2.e.f((Object)c, "onboardingSettings");
        ng2.e.f((Object)d, "tooltipSettings");
        ng2.e.f((Object)e, "startParameters");
        ng2.e.f((Object)f, "onboardingFeatures");
        ng2.e.f((Object)h, "systemTimeProvider");
        ng2.e.f((Object)i, "activeSession");
        ng2.e.f((Object)j, "growthSettings");
        this.a = (Provider<b>)a;
        this.b = (Provider<h0>)b;
        this.c = (Provider<k>)c;
        this.d = (Provider<r>)d;
        this.e = (Provider<oc0.b>)e;
        this.f = (Provider<wa0.r>)f;
        this.g = (Provider<a>)g;
        this.h = (Provider<m>)h;
        this.i = (Provider<Session>)i;
        this.j = (Provider<f>)j;
    }
    
    public static final h a(final x0$c5 x0$c5, final x0$t9 x0$t9, final x0.f5 f5, final x0$b8 x0$b8, final Provider provider, final x0$d5 x0$d5, final yi0.b b, final x0$w7 x0$w7, final x0$z6 x0$z6, final x0.g3 g3) {
        e.f((Object)x0$c5, "onboardingChainingRepository");
        e.f((Object)x0$t9, "subredditRepository");
        e.f((Object)f5, "onboardingSettings");
        e.f((Object)x0$b8, "tooltipSettings");
        e.f((Object)provider, "startParameters");
        e.f((Object)x0$d5, "onboardingFeatures");
        e.f((Object)x0$w7, "systemTimeProvider");
        e.f((Object)x0$z6, "activeSession");
        e.f((Object)g3, "growthSettings");
        return new h(x0$c5, x0$t9, f5, x0$b8, provider, x0$d5, b, x0$w7, x0$z6, g3);
    }
    
    public final Object get() {
        final Object value = this.a.get();
        ng2.e.e(value, "onboardingChainingRepository.get()");
        final b b = (b)value;
        final Object value2 = this.b.get();
        ng2.e.e(value2, "subredditRepository.get()");
        final h0 h0 = (h0)value2;
        final Object value3 = this.c.get();
        ng2.e.e(value3, "onboardingSettings.get()");
        final k k = (k)value3;
        final Object value4 = this.d.get();
        ng2.e.e(value4, "tooltipSettings.get()");
        final r r = (r)value4;
        final Object value5 = this.e.get();
        ng2.e.e(value5, "startParameters.get()");
        final oc0.b b2 = (oc0.b)value5;
        final Object value6 = this.f.get();
        ng2.e.e(value6, "onboardingFeatures.get()");
        final wa0.r r2 = (wa0.r)value6;
        final Object value7 = this.g.get();
        ng2.e.e(value7, "onboardingSessionStorage.get()");
        final a a = (a)value7;
        final Object value8 = this.h.get();
        ng2.e.e(value8, "systemTimeProvider.get()");
        final m m = (m)value8;
        final Object value9 = this.i.get();
        ng2.e.e(value9, "activeSession.get()");
        final Session session = (Session)value9;
        final Object value10 = this.j.get();
        ng2.e.e(value10, "growthSettings.get()");
        return new RedditOnboardingChainingUseCase(b, h0, k, r, b2, r2, a, m, session, (f)value10);
    }
}
