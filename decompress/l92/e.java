// 
// Decompiled by Procyon v0.6.0
// 

package l92;

import q90.e0;
import r82.n0;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import com.bluelinelabs.conductor.Router;
import o90.lk;
import ib1.r;
import com.reddit.vault.feature.registration.protectvaultflow.ProtectVaultFlowPresenter;
import com.reddit.vault.domain.GetActiveVaultUseCase;
import zd.b;
import com.reddit.screen.di.ScreenPresentationModule;
import com.reddit.screen.BaseScreen;
import o90.so;
import o90.ht;
import mg2.a;
import javax.inject.Inject;
import o90.jg;
import com.reddit.vault.feature.registration.protectvaultflow.ProtectVaultFlowScreen;
import o90.dt;

public final class e implements dt<ProtectVaultFlowScreen, c>
{
    public final d a;
    
    @Inject
    public e(final jg a) {
        this.a = (d)a;
    }
    
    public final ht inject(final Object o, final a a) {
        final ProtectVaultFlowScreen protectVaultFlowScreen = (ProtectVaultFlowScreen)o;
        ng2.e.f((Object)protectVaultFlowScreen, "target");
        ng2.e.f((Object)a, "factory");
        final c c = (c)a.invoke();
        final d a2 = this.a;
        final l92.b a3 = c.a;
        final jg jg = (jg)a2;
        jg.getClass();
        a3.getClass();
        final lk a4 = jg.a;
        final so so = new so(a4, (BaseScreen)protectVaultFlowScreen);
        final a a5 = ScreenPresentationModule.a((BaseScreen)protectVaultFlowScreen);
        final Router e = zr0.d.e((BaseScreen)protectVaultFlowScreen);
        final ln1.d e2 = ((e0)a4.a).e0();
        b.r(e2);
        final ua2.d d = new ua2.d(a5, e, e2);
        final RemoteVaultDataSource g4 = ((o82.a)a4.a).g4();
        b.r(g4);
        final n0 b = ((o82.a)a4.a).b();
        zd.b.r(b);
        final GetActiveVaultUseCase getActiveVaultUseCase = new GetActiveVaultUseCase(g4, b);
        final qa2.a s0 = ((e0)a4.a).s0();
        zd.b.r(s0);
        protectVaultFlowScreen.i0 = (l92.a)new ProtectVaultFlowPresenter(d, getActiveVaultUseCase, s0, (r)protectVaultFlowScreen);
        return new ht((Object)so);
    }
}
