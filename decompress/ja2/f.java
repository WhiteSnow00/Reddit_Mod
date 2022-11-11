// 
// Decompiled by Procyon v0.6.0
// 

package ja2;

import q90.e0;
import com.bluelinelabs.conductor.Router;
import o90.dl;
import com.reddit.vault.feature.errors.ErrorScreen$a;
import com.reddit.vault.h;
import com.reddit.vault.util.BiometricsHandler;
import com.reddit.vault.feature.vault.membership.cancel.CancelMembershipPresenter;
import com.reddit.screen.di.ScreenPresentationModule;
import ui.b;
import com.reddit.screen.BaseScreen;
import o90.gi;
import o90.xt;
import rg2.a;
import javax.inject.Inject;
import o90.fi;
import com.reddit.vault.feature.vault.membership.cancel.CancelMembershipScreen;
import o90.tt;

public final class f implements tt<CancelMembershipScreen, d>
{
    public final e a;
    
    @Inject
    public f(final fi a) {
        this.a = (e)a;
    }
    
    @Override
    public final xt inject(final Object o, final a a) {
        final CancelMembershipScreen cancelMembershipScreen = (CancelMembershipScreen)o;
        sg2.e.f((Object)cancelMembershipScreen, "target");
        sg2.e.f((Object)a, "factory");
        final d d = a.invoke();
        final e a2 = this.a;
        final ja2.a a3 = d.a;
        final c b = d.b;
        final BiometricsHandler c = d.c;
        final h d2 = d.d;
        final ErrorScreen$a e = d.e;
        final fi fi = (fi)a2;
        fi.getClass();
        a3.getClass();
        b.getClass();
        c.getClass();
        e.getClass();
        final dl a4 = fi.a;
        final gi gi = new gi(a4, (BaseScreen)cancelMembershipScreen, a3, b, c, d2, e);
        final y82.h d3 = ((u82.a)a4.a).d8();
        ui.b.n((Object)d3);
        final y82.d k5 = ((u82.a)a4.a).k5();
        ui.b.n((Object)k5);
        final va2.b b2 = ((u82.a)a4.a).B4();
        ui.b.n((Object)b2);
        final com.reddit.vault.c h6 = ((e0)a4.a).H6();
        ui.b.n((Object)h6);
        final i82.a a5 = new i82.a(h6);
        final a a6 = ScreenPresentationModule.a((BaseScreen)cancelMembershipScreen);
        final Router c2 = vh1.a.c((BaseScreen)cancelMembershipScreen);
        final pn1.d e2 = ((e0)a4.a).e0();
        ui.b.n((Object)e2);
        cancelMembershipScreen.i0 = (ja2.b)new CancelMembershipPresenter(a3, b, d3, k5, b2, c, d2, a5, e, new ab2.d(a6, c2, e2));
        return new xt((Object)gi);
    }
}
