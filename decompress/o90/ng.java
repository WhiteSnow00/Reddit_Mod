// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import bz.r;
import rx.b;
import com.reddit.auth.screen.welcome.WelcomeFragment;
import bz.o;
import bz.p;
import com.reddit.auth.impl.onetap.OneTapDelegateImpl;
import hg0.f;
import my.c;
import rx.d;
import androidx.lifecycle.q;
import se2.e;
import com.reddit.events.welcome.WelcomeAnalytics;
import javax.inject.Provider;
import android.app.Activity;
import rg2.a;

public final class ng
{
    public final a<? extends Activity> a;
    public final z0 b;
    public Provider<WelcomeAnalytics> c;
    public e d;
    public Provider<hx.e> e;
    public Provider<q> f;
    public Provider<ts0.a> g;
    public e h;
    public d i;
    public Provider<c> j;
    public f k;
    public Provider<my.a> l;
    public Provider<OneTapDelegateImpl> m;
    public nx.a n;
    public Provider<p> o;
    public Provider<o> p;
    
    public ng(final z0 b, final a a, final WelcomeFragment welcomeFragment) {
        this.b = b;
        this.a = a;
        this.c = (Provider<WelcomeAnalytics>)se2.c.b((Provider)new wb0.a((Provider)b.h, 23));
        final e a2 = se2.e.a((Object)welcomeFragment);
        this.d = a2;
        this.e = (Provider<hx.e>)se2.c.b((Provider)a2);
        this.f = (Provider<q>)se2.c.b((Provider)this.d);
        this.g = (Provider<ts0.a>)se2.c.b((Provider)this.d);
        final e a3 = se2.e.a((Object)a);
        this.h = a3;
        this.i = new d((Provider)this.g, (Provider)b.K, (Provider)new b((Provider)a3, (Provider)b.m, 0), 0);
        this.j = (Provider<c>)se2.c.b((Provider)this.d);
        this.k = hg0.f.b((Provider)b.h);
        final Provider b2 = se2.c.b((Provider)this.d);
        this.l = (Provider<my.a>)b2;
        this.m = (Provider<OneTapDelegateImpl>)se2.c.b((Provider)rx.c.a((Provider)b.R3, (Provider)this.f, (Provider)this.i, (Provider)this.j, (Provider)this.e, (Provider)b.D, (Provider)this.k, (Provider)b.b0, b2, (Provider)b.h4, (Provider)b.r, (Provider)b.A0));
        this.n = new nx.a((Provider)new ly.b((Provider)this.h, (Provider)b.H4, 0), 1);
        final Provider b3 = se2.c.b((Provider)this.d);
        this.o = (Provider<p>)b3;
        this.p = (Provider<o>)se2.c.b((Provider)new r((Provider)b.R, (Provider)b.c, (Provider)this.n, b3, (Provider)b.m, (Provider)this.k, (Provider)this.m, (Provider)b.A0, 0));
    }
}
