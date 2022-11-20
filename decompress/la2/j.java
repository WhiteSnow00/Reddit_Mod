// 
// Decompiled by Procyon v0.6.0
// 

package la2;

import q90.e0;
import com.bluelinelabs.conductor.Router;
import com.reddit.vault.c;
import s82.f;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import o90.lk;
import com.reddit.vault.h;
import com.reddit.vault.util.BiometricsHandler;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionPresenter;
import zr0.d;
import za2.n;
import com.reddit.screen.di.ScreenPresentationModule;
import zd.b;
import com.reddit.screen.BaseScreen;
import o90.xg;
import o90.ht;
import mg2.a;
import javax.inject.Inject;
import o90.hg;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionScreen;
import o90.dt;

public final class j implements dt<ApproveTransactionScreen, e>
{
    public final i a;
    
    @Inject
    public j(final hg a) {
        this.a = (i)a;
    }
    
    public final ht inject(final Object o, final a a) {
        final ApproveTransactionScreen approveTransactionScreen = (ApproveTransactionScreen)o;
        ng2.e.f((Object)approveTransactionScreen, "target");
        ng2.e.f((Object)a, "factory");
        final e e = (e)a.invoke();
        final i a2 = this.a;
        final la2.b a3 = e.a;
        final la2.d b = e.b;
        final BiometricsHandler c = e.c;
        final h d = e.d;
        final com.reddit.vault.e e2 = e.e;
        final hg hg = (hg)a2;
        hg.getClass();
        a3.getClass();
        b.getClass();
        c.getClass();
        final lk a4 = hg.a;
        final xg xg = new xg(a4, (BaseScreen)approveTransactionScreen, a3, b, c, d, e2);
        final RemoteVaultDataSource g4 = ((o82.a)a4.a).g4();
        zd.b.r(g4);
        final s82.a i8 = ((o82.a)a4.a).i8();
        zd.b.r(i8);
        final f w7 = ((o82.a)a4.a).w7();
        zd.b.r(w7);
        final s82.h n8 = ((o82.a)a4.a).n8();
        zd.b.r(n8);
        final s82.d q5 = ((o82.a)a4.a).q5();
        zd.b.r(q5);
        final pa2.b g5 = ((o82.a)a4.a).G4();
        zd.b.r(g5);
        final n n9 = new n(ScreenPresentationModule.c((BaseScreen)approveTransactionScreen));
        final c o2 = ((e0)a4.a).O6();
        zd.b.r(o2);
        final d82.a a5 = new d82.a(o2);
        final a a6 = ScreenPresentationModule.a((BaseScreen)approveTransactionScreen);
        final Router e3 = zr0.d.e((BaseScreen)approveTransactionScreen);
        final ln1.d e4 = ((e0)a4.a).e0();
        zd.b.r(e4);
        approveTransactionScreen.i0 = (la2.c)new ApproveTransactionPresenter(a3, b, g4, i8, w7, n8, q5, g5, c, d, e2, n9, a5, new ua2.d(a6, e3, e4));
        return new ht((Object)xg);
    }
}
