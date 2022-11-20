// 
// Decompiled by Procyon v0.6.0
// 

package ja2;

import com.reddit.screen.BaseScreen;
import o90.tn;
import o90.ht;
import mg2.a;
import javax.inject.Inject;
import o90.sn;
import com.reddit.vault.feature.vault.payment.loading.PaymentLoadingScreen;
import o90.dt;

public final class g implements dt<PaymentLoadingScreen, e>
{
    public final f a;
    
    @Inject
    public g(final sn a) {
        this.a = (f)a;
    }
    
    public final ht inject(final Object o, final a a) {
        final PaymentLoadingScreen paymentLoadingScreen = (PaymentLoadingScreen)o;
        ng2.e.f((Object)paymentLoadingScreen, "target");
        ng2.e.f((Object)a, "factory");
        final e e = (e)a.invoke();
        final f a2 = this.a;
        final ja2.a a3 = e.a;
        final d b = e.b;
        final sn sn = (sn)a2;
        sn.getClass();
        a3.getClass();
        b.getClass();
        final tn tn = new tn(sn.a, (BaseScreen)paymentLoadingScreen, a3, b);
        paymentLoadingScreen.i0 = (c)tn.e.get();
        paymentLoadingScreen.j0 = (i)tn.e.get();
        return new ht((Object)tn);
    }
}
