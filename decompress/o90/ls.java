// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import q90.e0;
import ww0.d;
import com.reddit.session.p;
import l40.e;
import com.reddit.vault.domain.RedditCanVaultBeSecuredUseCase;
import com.reddit.screen.BaseScreen;
import qn1.j;
import ej2.b0;
import hw0.c;
import com.reddit.snoovatar.domain.common.usecase.SaveNftAvatarUseCase;
import k20.a;
import com.reddit.events.marketplace.MarketplaceAnalytics;
import ex0.k;
import w82.f;
import be1.h;
import com.reddit.marketplace.impl.screens.nft.detail.ctasection.CtaScreen;
import ex0.g;
import com.reddit.marketplace.impl.screens.nft.detail.ctasection.CtaScreen$a;
import ex0.b;

public final class ls implements b
{
    public final CtaScreen$a a;
    public final g b;
    public final dl c;
    public final sn d;
    
    public ls(final dl c, final sn d, final CtaScreen$a a, final g b) {
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
        final rg2.a a2 = this.d.a();
        final com.reddit.snoovatar.impl.domain.common.usecase.a f6 = ((e0)this.c.a).f6();
        ui.b.n((Object)f6);
        final sn d = this.d;
        final BaseScreen a3 = d.a;
        final ww0.c b2 = d.b();
        final sn d2 = this.d;
        final rg2.a a4 = d2.a();
        final wa2.a s0 = ((e0)d2.c.a).s0();
        ui.b.n((Object)s0);
        final ab2.f b3 = f.b(a4, s0);
        final yx1.a o4 = ((e0)this.c.a).O4();
        ui.b.n((Object)o4);
        final k k = new k((by1.b)o4, this.d.a());
        final ex0.h h2 = new ex0.h(this.d.a());
        final RedditCanVaultBeSecuredUseCase t2 = ((e0)this.c.a).t2();
        ui.b.n((Object)t2);
        final wa2.a s2 = ((e0)this.c.a).s0();
        ui.b.n((Object)s2);
        final e s3 = ((e0)this.d.c.a).S4();
        ui.b.n((Object)s3);
        final MarketplaceAnalytics marketplaceAnalytics = new MarketplaceAnalytics(s3);
        final p c2 = ((e0)this.c.a).C8();
        ui.b.n((Object)c2);
        final a a5 = (a)this.d.e.get();
        final d o5 = ((e0)this.c.a).o7();
        ui.b.n((Object)o5);
        final hw0.b g2 = ((e0)this.c.a).G2();
        ui.b.n((Object)g2);
        ctaScreen.g0 = new com.reddit.marketplace.impl.screens.nft.detail.ctasection.a(a, h, b, c, a2, (SaveNftAvatarUseCase)f6, a3, b2, b3, k, h2, (w82.a)t2, s2, marketplaceAnalytics, c2, a5, (c)o5, g2, this.b, dl.B(this.c), dl.C(this.c), this.d.a);
    }
}
