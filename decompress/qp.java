// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import com.bluelinelabs.conductor.Router;
import kz0.k;
import iv0.b;
import com.reddit.screen.di.ScreenPresentationModule;
import ib2.d;
import nb2.l;
import y92.c;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.h;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;
import p92.a;

public final class qp implements du
{
    public final a a;
    public final MasterKeyScreen$a b;
    public final h c;
    public final BaseScreen d;
    public final kl e;
    
    public qp(final kl e, final BaseScreen d, final y92.a a, final c c, final l l, final a a2, final h c2, final MasterKeyScreen$a b) {
        this.e = e;
        this.a = a2;
        this.b = b;
        this.c = c2;
        this.d = d;
    }
    
    public final d a() {
        final zg2.a a = ScreenPresentationModule.a(this.d);
        final Router d = iv0.b.d(this.d);
        final bo1.d f0 = ((e0)this.e.a).f0();
        k.N((Object)f0);
        return new d(a, d, f0);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.e.k();
    }
}
