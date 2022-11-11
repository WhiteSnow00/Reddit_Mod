// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import cz0.c;
import uv0.b;
import pa2.d;
import pa2.a;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.feature.vault.payment.loading.PaymentLoadingPresenter;
import javax.inject.Provider;
import se2.e;

public final class io implements yt
{
    public final dl a;
    public e b;
    public e c;
    public e d;
    public Provider<PaymentLoadingPresenter> e;
    
    public io(final dl a, final BaseScreen baseScreen, final a a2, final d d) {
        this.a = a;
        this.b = se2.e.a((Object)a2);
        this.c = se2.e.a((Object)d);
        final e a3 = se2.e.a((Object)baseScreen);
        this.d = a3;
        this.e = (Provider<PaymentLoadingPresenter>)se2.c.b((Provider)new q30.e((Provider)this.b, (Provider)this.c, (Provider)a.Q4, (Provider)new rx.d((Provider)uv0.b.e((Provider)a3), (Provider)new vh1.a((Object)this.d, 8), (Provider)a.D2, 27), (Provider)new c((Provider)a.R4, 19), (Provider)a.S4, 12));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
