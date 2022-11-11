// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import xd0.g0;
import us0.g;
import com.bluelinelabs.conductor.Router;
import y82.f;
import o90.dl;
import ab2.h;
import com.reddit.vault.feature.vault.feed.VaultFeedPresenter;
import com.reddit.vault.domain.GetPointsInfoUseCase;
import com.reddit.vault.domain.IsEligibleToCommunityPointsUseCase;
import com.reddit.vault.domain.GetCollectibleAvatarsUseCase;
import com.reddit.vault.data.repository.CollectibleAvatarRepository;
import com.reddit.vault.data.remote.graphql.RemoteGqlVaultDataSource;
import javax.inject.Provider;
import se2.c;
import ab2.d;
import ui.b;
import com.reddit.screen.di.ScreenPresentationModule;
import com.reddit.screen.BaseScreen;
import o90.qr;
import sg2.e;
import o90.xt;
import rg2.a;
import javax.inject.Inject;
import o90.wg;
import com.reddit.vault.feature.vault.feed.VaultFeedScreen;
import o90.tt;

public final class e0 implements tt<VaultFeedScreen, z>
{
    public final d0 a;
    
    @Inject
    public e0(final wg a) {
        this.a = (d0)a;
    }
    
    @Override
    public final xt inject(final Object o, final a a) {
        final VaultFeedScreen vaultFeedScreen = (VaultFeedScreen)o;
        e.f((Object)vaultFeedScreen, "target");
        e.f((Object)a, "factory");
        final z z = a.invoke();
        final d0 a2 = this.a;
        final x a3 = z.a;
        final pa2.b b = z.b;
        final wg wg = (wg)a2;
        wg.getClass();
        a3.getClass();
        b.getClass();
        final dl a4 = wg.a;
        final qr qr = new qr(a4, (BaseScreen)vaultFeedScreen, a3, b);
        final a c = ScreenPresentationModule.c((BaseScreen)vaultFeedScreen);
        final y82.a y7 = ((u82.a)a4.a).Y7();
        ui.b.n((Object)y7);
        final y82.d k5 = ((u82.a)a4.a).k5();
        ui.b.n((Object)k5);
        final f m7 = ((u82.a)a4.a).m7();
        ui.b.n((Object)m7);
        final y82.c q8 = ((u82.a)a4.a).q8();
        ui.b.n((Object)q8);
        final ab2.e o2 = ((q90.e0)a4.a).O8();
        ui.b.n((Object)o2);
        final com.reddit.vault.c h6 = ((q90.e0)a4.a).H6();
        ui.b.n((Object)h6);
        final i82.a a5 = new i82.a(h6);
        final a a6 = ScreenPresentationModule.a((BaseScreen)vaultFeedScreen);
        final Router c2 = vh1.a.c((BaseScreen)vaultFeedScreen);
        final pn1.d e0 = ((q90.e0)a4.a).e0();
        ui.b.n((Object)e0);
        final d d = new d(a6, c2, e0);
        final va0.e0 n3 = ((q90.e0)a4.a).N3();
        ui.b.n((Object)n3);
        final y82.h d2 = ((u82.a)a4.a).d8();
        ui.b.n((Object)d2);
        final pe2.a a7 = se2.c.a((Provider)a4.h);
        final g o3 = ((q90.e0)a4.a).O1();
        ui.b.n((Object)o3);
        ((q90.e0)a4.a).J5();
        final RemoteGqlVaultDataSource remoteGqlVaultDataSource = new RemoteGqlVaultDataSource(new q82.b(a7, o3, (n20.a)n20.b.a));
        final cw0.a a8 = ((q90.e0)a4.a).a();
        ui.b.n((Object)a8);
        final CollectibleAvatarRepository collectibleAvatarRepository = new CollectibleAvatarRepository(remoteGqlVaultDataSource, a8);
        final wa2.a s0 = ((q90.e0)a4.a).s0();
        ui.b.n((Object)s0);
        final GetCollectibleAvatarsUseCase getCollectibleAvatarsUseCase = new GetCollectibleAvatarsUseCase(collectibleAvatarRepository, s0);
        final yx1.a o4 = ((q90.e0)a4.a).O4();
        ui.b.n((Object)o4);
        final ww0.d o5 = ((q90.e0)a4.a).o7();
        ui.b.n((Object)o5);
        final f m8 = ((u82.a)a4.a).m7();
        ui.b.n((Object)m8);
        final y82.c q9 = ((u82.a)a4.a).q8();
        ui.b.n((Object)q9);
        final r82.c x7 = ((q90.e0)a4.a).X7();
        ui.b.n((Object)x7);
        final g0 w0 = ((q90.e0)a4.a).W0();
        ui.b.n((Object)w0);
        vaultFeedScreen.i0 = (w)new VaultFeedPresenter(c, a3, y7, k5, m7, q8, (h)o2, a5, d, n3, b, d2, getCollectibleAvatarsUseCase, (by1.b)o4, (hw0.c)o5, new GetPointsInfoUseCase(m8, q9, new IsEligibleToCommunityPointsUseCase(x7, w0)));
        return new xt((Object)qr);
    }
}
