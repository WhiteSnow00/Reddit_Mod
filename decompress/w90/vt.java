// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import com.reddit.session.r;
import s40.e;
import com.reddit.vault.domain.RedditCanVaultBeSecuredUseCase;
import ib2.f;
import com.reddit.screen.BaseScreen;
import android.content.Context;
import co1.j;
import mj2.b0;
import com.reddit.snoovatar.domain.common.usecase.SaveNftAvatarUseCase;
import com.reddit.events.marketplace.MarketplaceAnalytics;
import lx0.i;
import lx0.l;
import zg2.a;
import com.reddit.screen.di.ScreenPresentationModule;
import kz0.k;
import ww0.c;
import j31.d;
import com.reddit.marketplace.impl.screens.nft.detail.ctasection.CtaScreen;
import lx0.g;
import com.reddit.marketplace.impl.screens.nft.detail.ctasection.CtaScreen$a;
import lx0.b;

public final class vt implements b
{
    public final CtaScreen$a a;
    public final g b;
    public final kl c;
    public final rq d;
    
    public vt(final kl c, final rq d, final CtaScreen$a a, final g b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final CtaScreen ctaScreen) {
        final CtaScreen$a a = this.a;
        final b0 d = sa1.b.d(this.d.a);
        final sk1.a a2 = j31.d.a(this.d.a);
        final j b = ww0.c.b(this.d.a);
        final a<? extends Context> a3 = this.d.a();
        final com.reddit.snoovatar.impl.domain.common.usecase.a g6 = ((e0)this.c.a).g6();
        k.N((Object)g6);
        final rq d2 = this.d;
        final BaseScreen a4 = d2.a;
        final a a5 = ScreenPresentationModule.a(a4);
        final rc0.d i = ((e0)d2.b.a).i();
        k.N((Object)i);
        final ow0.b j2 = ((e0)d2.b.a).J2();
        k.N((Object)j2);
        final dx0.c c = new dx0.c(a5, i, j2, (ox1.c)d2.b.Q0.get());
        final rq d3 = this.d;
        final a<? extends Context> a6 = d3.a();
        final eb2.a t0 = ((e0)d3.b.a).t0();
        k.N((Object)t0);
        final f c2 = n41.c.c((a)a6, t0);
        final gy1.a q4 = ((e0)this.c.a).Q4();
        k.N((Object)q4);
        final l l = new l((jy1.b)q4, (a)this.d.a());
        final i k = new i((a)this.d.a());
        final RedditCanVaultBeSecuredUseCase w2 = ((e0)this.c.a).w2();
        kz0.k.N((Object)w2);
        final eb2.a t2 = ((e0)this.c.a).t0();
        kz0.k.N((Object)t2);
        final e u4 = ((e0)this.c.a).U4();
        kz0.k.N((Object)u4);
        final MarketplaceAnalytics marketplaceAnalytics = new MarketplaceAnalytics(u4);
        final r e8 = ((e0)this.c.a).E8();
        kz0.k.N((Object)e8);
        final o20.a a7 = (o20.a)this.d.u.get();
        final dx0.d p = ((e0)this.c.a).p7();
        kz0.k.N((Object)p);
        final ow0.b j3 = ((e0)this.c.a).J2();
        kz0.k.N((Object)j3);
        ctaScreen.g0 = new com.reddit.marketplace.impl.screens.nft.detail.ctasection.a(a, d, a2, b, (a)a3, (SaveNftAvatarUseCase)g6, a4, c, c2, l, k, (e92.a)w2, t2, marketplaceAnalytics, e8, a7, (ow0.c)p, j3, this.b, kl.A(this.c), kl.B(this.c), this.d.a);
    }
}
