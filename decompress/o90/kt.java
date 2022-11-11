// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import q90.e0;
import com.reddit.session.p;
import l40.e;
import com.reddit.vault.domain.RedditCanVaultBeSecuredUseCase;
import ic0.d;
import com.reddit.screen.BaseScreen;
import android.content.Context;
import qn1.j;
import ej2.b0;
import com.reddit.snoovatar.domain.common.usecase.SaveNftAvatarUseCase;
import com.reddit.events.marketplace.MarketplaceAnalytics;
import ex0.k;
import rg2.a;
import w82.f;
import gx1.c;
import be1.h;
import com.reddit.marketplace.impl.screens.nft.detail.ctasection.CtaScreen;
import ex0.g;
import com.reddit.marketplace.impl.screens.nft.detail.ctasection.CtaScreen$a;
import ex0.b;

public final class kt implements b
{
    public final CtaScreen$a a;
    public final g b;
    public final dl c;
    public final ln d;
    
    public kt(final dl c, final ln d, final CtaScreen$a a, final g b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final CtaScreen ctaScreen) {
        final CtaScreen$a a = this.a;
        final b0 h = uv0.b.h(this.d.a);
        final gk1.a b = be1.h.b(this.d.a);
        final j c = oa1.b.c(this.d.a);
        final a<? extends Context> a2 = this.d.a();
        final com.reddit.snoovatar.impl.domain.common.usecase.a f6 = ((e0)this.c.a).f6();
        ui.b.n((Object)f6);
        final ln d = this.d;
        final BaseScreen a3 = d.a;
        final a g = uv0.b.g(a3);
        final d i = ((e0)d.b.a).i();
        ui.b.n((Object)i);
        final hw0.b g2 = ((e0)d.b.a).G2();
        ui.b.n((Object)g2);
        final ww0.c c2 = new ww0.c(g, i, g2, (c)d.b.R0.get());
        final ln d2 = this.d;
        final a<? extends Context> a4 = d2.a();
        final wa2.a s0 = ((e0)d2.b.a).s0();
        ui.b.n((Object)s0);
        final ab2.f b2 = f.b(a4, s0);
        final yx1.a o4 = ((e0)this.c.a).O4();
        ui.b.n((Object)o4);
        final k k = new k((by1.b)o4, (a)this.d.a());
        final ex0.h h2 = new ex0.h((a)this.d.a());
        final RedditCanVaultBeSecuredUseCase t2 = ((e0)this.c.a).t2();
        ui.b.n((Object)t2);
        final wa2.a s2 = ((e0)this.c.a).s0();
        ui.b.n((Object)s2);
        final e s3 = ((e0)this.c.a).S4();
        ui.b.n((Object)s3);
        final MarketplaceAnalytics marketplaceAnalytics = new MarketplaceAnalytics(s3);
        final p c3 = ((e0)this.c.a).C8();
        ui.b.n((Object)c3);
        final k20.a a5 = (k20.a)this.d.L.get();
        final ww0.d o5 = ((e0)this.c.a).o7();
        ui.b.n((Object)o5);
        final hw0.b g3 = ((e0)this.c.a).G2();
        ui.b.n((Object)g3);
        ctaScreen.g0 = new com.reddit.marketplace.impl.screens.nft.detail.ctasection.a(a, h, b, c, (a)a2, (SaveNftAvatarUseCase)f6, a3, c2, b2, k, h2, (w82.a)t2, s2, marketplaceAnalytics, c3, a5, (hw0.c)o5, g3, this.b, dl.B(this.c), dl.C(this.c), this.d.a);
    }
}
