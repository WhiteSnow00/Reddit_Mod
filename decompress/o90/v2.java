// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.events.livediscovery.RedditLiveDiscoveryAnalytics;
import ic0.d;
import se2.e;
import nx0.g;
import m20.c;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import android.content.Context;
import po1.b;
import po1.a;

public final class v2
{
    public final a a;
    public final b b;
    public final rg2.a<? extends Context> c;
    public final z0 d;
    public Provider<ChatAnalytics> e;
    public Provider<c> f;
    
    public v2(final z0 d, final b b, final a a, final rg2.a c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = (Provider<ChatAnalytics>)se2.c.b((Provider)px.a.a((Provider)d.K0, g.a((Provider)d.K0, (Provider)d.r), (Provider)d.b0, (Provider)d.c, (Provider)d.h));
        this.f = (Provider<c>)se2.c.b((Provider)oa1.b.a((Provider)se2.e.a((Object)c)));
    }
    
    public final uq1.a a() {
        final rg2.a<? extends Context> c = this.c;
        final l20.a m0 = this.d.a.m0();
        ui.b.n((Object)m0);
        final d i = this.d.a.i();
        ui.b.n((Object)i);
        final sw.b s = this.d.a.s();
        ui.b.n((Object)s);
        final rv0.c m2 = this.d.a.M3();
        ui.b.n((Object)m2);
        final RedditLiveDiscoveryAnalytics d1 = this.d.a.D1();
        ui.b.n((Object)d1);
        return new uq1.a((rg2.a)c, m0, i, s, (iv0.a)m2, (sh0.a)d1);
    }
}
