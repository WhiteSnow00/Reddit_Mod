// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import q90.e0;
import java.util.Map;
import com.bluelinelabs.conductor.Router;
import ui.b;
import vh1.a;
import com.reddit.screen.di.ScreenPresentationModule;
import ab2.d;
import fb2.l;
import n92.g;
import n92.e;
import com.reddit.vault.h;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.feature.registration.createvault.ConfirmRestorePreviousVaultScreen$a;
import com.reddit.vault.feature.registration.createvault.IgnoreRecoveryConfirmationScreen$a;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;

public final class zj implements yt
{
    public final MasterKeyScreen.a a;
    public final IgnoreRecoveryConfirmationScreen$a b;
    public final ConfirmRestorePreviousVaultScreen$a c;
    public final BaseScreen d;
    public final h e;
    public final dl f;
    
    public zj(final dl f, final BaseScreen d, final e e, final g g, final l l, final MasterKeyScreen.a a, final IgnoreRecoveryConfirmationScreen$a b, final ConfirmRestorePreviousVaultScreen$a c, final h e2) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e2;
    }
    
    public final d a() {
        final rg2.a a = ScreenPresentationModule.a(this.d);
        final Router c = vh1.a.c(this.d);
        final pn1.d e0 = ((e0)this.f.a).e0();
        ui.b.n((Object)e0);
        return new d(a, c, e0);
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.f.k();
    }
}
