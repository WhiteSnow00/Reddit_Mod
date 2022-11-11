// 
// Decompiled by Procyon v0.6.0
// 

package da2;

import q90.e0;
import com.bluelinelabs.conductor.Router;
import o90.dl;
import com.reddit.vault.domain.ClearUpVaultForSignOutUseCase;
import ab2.d;
import ui.b;
import com.reddit.screen.di.ScreenPresentationModule;
import com.reddit.screen.BaseScreen;
import o90.ik;
import o90.xt;
import rg2.a;
import javax.inject.Inject;
import o90.yg;
import com.reddit.vault.feature.vault.deactivatedvault.DeactivatedVaultAlertScreen;
import o90.tt;

public final class f implements tt<DeactivatedVaultAlertScreen, c>
{
    public final e a;
    
    @Inject
    public f(final yg a) {
        this.a = (e)a;
    }
    
    @Override
    public final xt inject(final Object o, final a a) {
        final DeactivatedVaultAlertScreen deactivatedVaultAlertScreen = (DeactivatedVaultAlertScreen)o;
        sg2.e.f((Object)deactivatedVaultAlertScreen, "target");
        sg2.e.f((Object)a, "factory");
        final c c = a.invoke();
        final e a2 = this.a;
        final da2.b a3 = c.a;
        final yg yg = (yg)a2;
        yg.getClass();
        a3.getClass();
        final dl a4 = yg.a;
        final ik ik = new ik(a4, (BaseScreen)deactivatedVaultAlertScreen);
        final a a5 = ScreenPresentationModule.a((BaseScreen)deactivatedVaultAlertScreen);
        final Router c2 = vh1.a.c((BaseScreen)deactivatedVaultAlertScreen);
        final pn1.d e0 = ((e0)a4.a).e0();
        b.n((Object)e0);
        final d d = new d(a5, c2, e0);
        final y82.a y7 = ((u82.a)a4.a).Y7();
        b.n((Object)y7);
        final y82.d k5 = ((u82.a)a4.a).k5();
        b.n((Object)k5);
        final y82.f m7 = ((u82.a)a4.a).m7();
        b.n((Object)m7);
        deactivatedVaultAlertScreen.i0 = new da2.d(d, new ClearUpVaultForSignOutUseCase(y7, k5, m7));
        return new xt((Object)ik);
    }
}
