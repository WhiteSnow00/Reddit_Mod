// 
// Decompiled by Procyon v0.6.0
// 

package f92;

import q90.e0;
import x82.n0;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import com.bluelinelabs.conductor.Router;
import com.reddit.vault.c;
import com.reddit.vault.l;
import com.reddit.vault.data.local.LocalVaultDataSource;
import o90.dl;
import com.reddit.vault.feature.intro.IntroPresenter;
import com.reddit.vault.domain.GetActiveVaultUseCase;
import ab2.d;
import com.reddit.screen.di.ScreenPresentationModule;
import ui.b;
import com.reddit.screen.BaseScreen;
import o90.cm;
import sg2.e;
import o90.xt;
import rg2.a;
import javax.inject.Inject;
import o90.nh;
import com.reddit.vault.feature.intro.IntroScreen;
import o90.tt;

public final class k implements tt<IntroScreen, i>
{
    public final j a;
    
    @Inject
    public k(final nh a) {
        this.a = (j)a;
    }
    
    @Override
    public final xt inject(final Object o, final a a) {
        final IntroScreen introScreen = (IntroScreen)o;
        e.f((Object)introScreen, "target");
        e.f((Object)a, "factory");
        final i i = a.invoke();
        final j a2 = this.a;
        final f a3 = i.a;
        final h b = i.b;
        final nh nh = (nh)a2;
        nh.getClass();
        a3.getClass();
        b.getClass();
        final dl a4 = nh.a;
        final cm cm = new cm(a4, (BaseScreen)introScreen, a3, b);
        final LocalVaultDataSource p2 = ((u82.a)a4.a).p1();
        ui.b.n((Object)p2);
        final y82.f m7 = ((u82.a)a4.a).m7();
        ui.b.n((Object)m7);
        final l d4 = ((u82.a)a4.a).D4();
        ui.b.n((Object)d4);
        final c h6 = ((e0)a4.a).H6();
        ui.b.n((Object)h6);
        final i82.a a5 = new i82.a(h6);
        final a a6 = ScreenPresentationModule.a((BaseScreen)introScreen);
        final Router c = vh1.a.c((BaseScreen)introScreen);
        final pn1.d e0 = ((e0)a4.a).e0();
        ui.b.n((Object)e0);
        final d d5 = new d(a6, c, e0);
        final RemoteVaultDataSource c2 = ((u82.a)a4.a).c4();
        ui.b.n((Object)c2);
        final n0 b2 = ((u82.a)a4.a).b();
        ui.b.n((Object)b2);
        final GetActiveVaultUseCase getActiveVaultUseCase = new GetActiveVaultUseCase(c2, b2);
        final a20.a b3 = ((e0)a4.a).B2();
        ui.b.n((Object)b3);
        introScreen.i0 = (g)new IntroPresenter(a3, b, p2, m7, d4, a5, d5, getActiveVaultUseCase, b3);
        return new xt((Object)cm);
    }
}
