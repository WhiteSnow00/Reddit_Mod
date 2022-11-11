// 
// Decompiled by Procyon v0.6.0
// 

package k50;

import sg2.e;
import o90.z0$e7;
import o90.z0$b8;
import o90.z0$f5;
import o90.z0$h5;
import o90.z0;
import o90.z0$e5;
import com.reddit.session.Session;
import v12.m;
import tc0.a;
import va0.s;
import us0.j;
import xd0.g0;
import wc0.b;
import javax.inject.Provider;
import com.reddit.data.onboardingtopic.RedditOnboardingChainingUseCase;
import se2.d;

public final class h implements d<RedditOnboardingChainingUseCase>
{
    public final Provider<b> a;
    public final Provider<g0> b;
    public final Provider<j> c;
    public final Provider<pc0.b> d;
    public final Provider<s> e;
    public final Provider<a> f;
    public final Provider<m> g;
    public final Provider<Session> h;
    
    public h(final z0$e5 a, final z0.z9 b, final z0$h5 c, final Provider d, final z0$f5 e, final vh1.a f, final z0$b8 g, final z0$e7 h) {
        sg2.e.f((Object)a, "onboardingChainingRepository");
        sg2.e.f((Object)b, "subredditRepository");
        sg2.e.f((Object)c, "onboardingSettings");
        sg2.e.f((Object)d, "startParameters");
        sg2.e.f((Object)e, "onboardingFeatures");
        sg2.e.f((Object)g, "systemTimeProvider");
        sg2.e.f((Object)h, "activeSession");
        this.a = (Provider<b>)a;
        this.b = (Provider<g0>)b;
        this.c = (Provider<j>)c;
        this.d = (Provider<pc0.b>)d;
        this.e = (Provider<s>)e;
        this.f = (Provider<a>)f;
        this.g = (Provider<m>)g;
        this.h = (Provider<Session>)h;
    }
    
    public static final h a(final z0$e5 z0$e5, final z0.z9 z9, final z0$h5 z0$h5, final Provider provider, final z0$f5 z0$f5, final vh1.a a, final z0$b8 z0$b8, final z0$e7 z0$e6) {
        e.f((Object)z0$e5, "onboardingChainingRepository");
        e.f((Object)z9, "subredditRepository");
        e.f((Object)z0$h5, "onboardingSettings");
        e.f((Object)provider, "startParameters");
        e.f((Object)z0$f5, "onboardingFeatures");
        e.f((Object)z0$b8, "systemTimeProvider");
        e.f((Object)z0$e6, "activeSession");
        return new h(z0$e5, z9, z0$h5, provider, z0$f5, a, z0$b8, z0$e6);
    }
    
    public final Object get() {
        final Object value = this.a.get();
        sg2.e.e(value, "onboardingChainingRepository.get()");
        final b b = (b)value;
        final Object value2 = this.b.get();
        sg2.e.e(value2, "subredditRepository.get()");
        final g0 g0 = (g0)value2;
        final Object value3 = this.c.get();
        sg2.e.e(value3, "onboardingSettings.get()");
        final j j = (j)value3;
        final Object value4 = this.d.get();
        sg2.e.e(value4, "startParameters.get()");
        final pc0.b b2 = (pc0.b)value4;
        final Object value5 = this.e.get();
        sg2.e.e(value5, "onboardingFeatures.get()");
        final s s = (s)value5;
        final Object value6 = this.f.get();
        sg2.e.e(value6, "onboardingSessionStorage.get()");
        final a a = (a)value6;
        final Object value7 = this.g.get();
        sg2.e.e(value7, "systemTimeProvider.get()");
        final m m = (m)value7;
        final Object value8 = this.h.get();
        sg2.e.e(value8, "activeSession.get()");
        return new RedditOnboardingChainingUseCase(b, g0, j, b2, s, a, m, (Session)value8);
    }
}
