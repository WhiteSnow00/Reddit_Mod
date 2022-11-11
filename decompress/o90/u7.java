// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.session.Session;
import v12.m;
import va0.s;
import us0.j;
import xd0.g0;
import com.reddit.data.onboardingtopic.RedditOnboardingChainingRepository;
import yr0.d;
import com.reddit.data.onboardingtopic.RedditOnboardingChainingUseCase;
import com.bluelinelabs.conductor.Router;
import pc0.b;
import fi1.a;
import com.reddit.screen.BaseScreen;

public final class u7
{
    public final BaseScreen a;
    public final a b;
    public final b c;
    public final rg2.a<? extends Router> d;
    public final rg2.a<? extends Router> e;
    public final z0 f;
    
    public u7(final z0 f, final BaseScreen a, final a b, final rg2.a d, final rg2.a e, final b c) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final RedditOnboardingChainingUseCase a() {
        final RedditOnboardingChainingRepository r2 = this.f.a.r2();
        ui.b.n((Object)r2);
        final g0 w0 = this.f.a.W0();
        ui.b.n((Object)w0);
        final j x6 = this.f.a.X6();
        ui.b.n((Object)x6);
        final b c = this.c;
        final s p = this.f.a.P();
        ui.b.n((Object)p);
        final tc0.a b = vh1.a.b(yr0.d.c(this.a));
        final m o4 = this.f.a.o4();
        ui.b.n((Object)o4);
        final Session c2 = this.f.a.c();
        ui.b.n((Object)c2);
        return new RedditOnboardingChainingUseCase((wc0.b)r2, w0, x6, c, p, b, o4, c2);
    }
}
