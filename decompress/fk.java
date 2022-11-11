// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import com.bluelinelabs.conductor.Router;
import zg2.a;
import kz0.k;
import iv0.b;
import com.reddit.screen.di.ScreenPresentationModule;
import ib2.d;
import nb2.l;
import v92.f;
import com.reddit.vault.h;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.feature.registration.createvault.ConfirmRestorePreviousVaultScreen$a;
import com.reddit.vault.feature.registration.createvault.IgnoreRecoveryConfirmationScreen$a;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;

public final class fk implements du
{
    public final MasterKeyScreen$a a;
    public final IgnoreRecoveryConfirmationScreen$a b;
    public final ConfirmRestorePreviousVaultScreen$a c;
    public final BaseScreen d;
    public final h e;
    public final kl f;
    
    public fk(final kl f, final BaseScreen d, final f f2, final v92.h h, final l l, final MasterKeyScreen$a a, final IgnoreRecoveryConfirmationScreen$a b, final ConfirmRestorePreviousVaultScreen$a c, final h e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final d a() {
        final a a = ScreenPresentationModule.a(this.d);
        final Router d = iv0.b.d(this.d);
        final bo1.d f0 = ((e0)this.f.a).f0();
        k.N((Object)f0);
        return new d(a, d, f0);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.f.k();
    }
}
