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
import x92.e;
import x92.c;
import com.reddit.vault.h;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;

public final class dn implements du
{
    public final MasterKeyScreen$a a;
    public final BaseScreen b;
    public final h c;
    public final kl d;
    
    public dn(final kl d, final BaseScreen b, final c c, final e e, final l l, final MasterKeyScreen$a a, final h c2) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c2;
    }
    
    public final d a() {
        final a a = ScreenPresentationModule.a(this.b);
        final Router d = iv0.b.d(this.b);
        final bo1.d f0 = ((e0)this.d.a).f0();
        k.N((Object)f0);
        return new d(a, d, f0);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.d.k();
    }
}
