// 
// Decompiled by Procyon v0.6.0
// 

package l92;

import q90.e0;
import com.bluelinelabs.conductor.Router;
import o90.dl;
import com.reddit.vault.h;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;
import ui.b;
import com.reddit.screen.di.ScreenPresentationModule;
import com.reddit.screen.BaseScreen;
import o90.ti;
import sg2.e;
import o90.xt;
import rg2.a;
import javax.inject.Inject;
import o90.si;
import com.reddit.vault.feature.registration.collectiblesecurevault.CollectibleSecureVaultScreen;
import o90.tt;

public final class g implements tt<CollectibleSecureVaultScreen, d>
{
    public final f a;
    
    @Inject
    public g(final si a) {
        this.a = (f)a;
    }
    
    @Override
    public final xt inject(final Object o, final a a) {
        final CollectibleSecureVaultScreen collectibleSecureVaultScreen = (CollectibleSecureVaultScreen)o;
        e.f((Object)collectibleSecureVaultScreen, "target");
        e.f((Object)a, "factory");
        final d d = a.invoke();
        final f a2 = this.a;
        final l92.a a3 = d.a;
        final c b = d.b;
        final MasterKeyScreen.a c = d.c;
        final h d2 = d.d;
        final si si = (si)a2;
        si.getClass();
        a3.getClass();
        b.getClass();
        c.getClass();
        final dl a4 = si.a;
        final ti ti = new ti(a4, (BaseScreen)collectibleSecureVaultScreen, a3, c, d2);
        final a a5 = ScreenPresentationModule.a((BaseScreen)collectibleSecureVaultScreen);
        final Router c2 = vh1.a.c((BaseScreen)collectibleSecureVaultScreen);
        final pn1.d e0 = ((e0)a4.a).e0();
        ui.b.n((Object)e0);
        collectibleSecureVaultScreen.i0 = (l92.b)new l92.e(a3, new ab2.d(a5, c2, e0), c, d2);
        return new xt((Object)ti);
    }
}
