// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import sa1.b;
import xa2.d;
import xa2.a;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.feature.vault.payment.loading.PaymentLoadingPresenter;
import javax.inject.Provider;
import af2.e;

public final class so implements du
{
    public final kl a;
    public e b;
    public e c;
    public e d;
    public Provider<PaymentLoadingPresenter> e;
    
    public so(final kl a, final BaseScreen baseScreen, final a a2, final d d) {
        this.a = a;
        this.b = af2.e.a((Object)a2);
        this.c = af2.e.a((Object)d);
        final e a3 = af2.e.a((Object)baseScreen);
        this.d = a3;
        this.e = (Provider<PaymentLoadingPresenter>)af2.c.b((Provider)new bc0.d((Provider)this.b, (Provider)this.c, (Provider)a.O4, (Provider)new ct1.b((Provider)sa1.b.a((Provider)a3), (Provider)new iv0.b((Provider)this.d, 23), (Provider)a.D2, 3), (Provider)new b((Object)a.P4, 10), (Provider)a.Q4, 7));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
