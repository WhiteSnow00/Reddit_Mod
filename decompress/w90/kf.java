// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import r50.d;
import ca0.o0;
import zg2.a;
import q20.c;
import qi1.b;
import com.reddit.events.onboardingchaining.OnboardingChainingAnalytics;
import javax.inject.Provider;
import af2.e;

public final class kf
{
    public final a1 a;
    public e b;
    public Provider<OnboardingChainingAnalytics> c;
    public e d;
    public Provider<b> e;
    public Provider<c> f;
    
    public kf(final a1 a, final qi1.c c, final a a2, final a a3) {
        this.a = a;
        this.b = af2.e.a((Object)c);
        this.c = (Provider<OnboardingChainingAnalytics>)af2.c.b((Provider)o0.b((Provider)a.h));
        this.d = af2.e.a((Object)a2);
        this.e = (Provider<b>)af2.c.b((Provider)new f31.d((Provider)this.b, (Provider)a.T1, (Provider)r50.d.a, (Provider)this.c, (Provider)a.T3, (Provider)this.d, (Provider)d00.c.c((Provider)a.Q1, (Provider)a.r), (Provider)a.r, (Provider)a.s0, 2));
        this.f = (Provider<c>)af2.c.b((Provider)ei1.a.a((Provider)af2.e.a((Object)a3)));
    }
}
