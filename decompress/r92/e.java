// 
// Decompiled by Procyon v0.6.0
// 

package r92;

import q90.e0;
import x82.n0;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import com.bluelinelabs.conductor.Router;
import o90.dl;
import kb1.s;
import com.reddit.vault.feature.registration.protectvaultflow.ProtectVaultFlowPresenter;
import com.reddit.vault.domain.GetActiveVaultUseCase;
import ui.b;
import com.reddit.screen.di.ScreenPresentationModule;
import com.reddit.screen.BaseScreen;
import o90.fp;
import o90.xt;
import rg2.a;
import javax.inject.Inject;
import o90.sg;
import com.reddit.vault.feature.registration.protectvaultflow.ProtectVaultFlowScreen;
import o90.tt;

public final class e implements tt<ProtectVaultFlowScreen, c>
{
    public final d a;
    
    @Inject
    public e(final sg a) {
        this.a = (d)a;
    }
    
    @Override
    public final xt inject(final Object o, final a a) {
        final ProtectVaultFlowScreen protectVaultFlowScreen = (ProtectVaultFlowScreen)o;
        sg2.e.f((Object)protectVaultFlowScreen, "target");
        sg2.e.f((Object)a, "factory");
        final c c = a.invoke();
        final d a2 = this.a;
        final r92.b a3 = c.a;
        final sg sg = (sg)a2;
        sg.getClass();
        a3.getClass();
        final dl a4 = sg.a;
        final fp fp = new fp(a4, (BaseScreen)protectVaultFlowScreen);
        final a a5 = ScreenPresentationModule.a((BaseScreen)protectVaultFlowScreen);
        final Router c2 = vh1.a.c((BaseScreen)protectVaultFlowScreen);
        final pn1.d e0 = ((e0)a4.a).e0();
        b.n((Object)e0);
        final ab2.d d = new ab2.d(a5, c2, e0);
        final RemoteVaultDataSource c3 = ((u82.a)a4.a).c4();
        b.n((Object)c3);
        final n0 b = ((u82.a)a4.a).b();
        ui.b.n((Object)b);
        final GetActiveVaultUseCase getActiveVaultUseCase = new GetActiveVaultUseCase(c3, b);
        final wa2.a s0 = ((e0)a4.a).s0();
        ui.b.n((Object)s0);
        protectVaultFlowScreen.i0 = (r92.a)new ProtectVaultFlowPresenter(d, getActiveVaultUseCase, s0, (s)protectVaultFlowScreen);
        return new xt((Object)fp);
    }
}
