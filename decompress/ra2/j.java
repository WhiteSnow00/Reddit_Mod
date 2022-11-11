// 
// Decompiled by Procyon v0.6.0
// 

package ra2;

import q90.e0;
import com.bluelinelabs.conductor.Router;
import com.reddit.vault.c;
import y82.f;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import o90.dl;
import com.reddit.vault.h;
import com.reddit.vault.util.BiometricsHandler;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionPresenter;
import ab2.d;
import android.content.Context;
import fb2.n;
import com.reddit.screen.di.ScreenPresentationModule;
import ui.b;
import com.reddit.screen.BaseScreen;
import o90.qh;
import o90.xt;
import rg2.a;
import javax.inject.Inject;
import o90.ug;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionScreen;
import o90.tt;

public final class j implements tt<ApproveTransactionScreen, e>
{
    public final i a;
    
    @Inject
    public j(final ug a) {
        this.a = (i)a;
    }
    
    @Override
    public final xt inject(final Object o, final a a) {
        final ApproveTransactionScreen approveTransactionScreen = (ApproveTransactionScreen)o;
        sg2.e.f((Object)approveTransactionScreen, "target");
        sg2.e.f((Object)a, "factory");
        final e e = a.invoke();
        final i a2 = this.a;
        final ra2.b a3 = e.a;
        final ra2.d b = e.b;
        final BiometricsHandler c = e.c;
        final h d = e.d;
        final com.reddit.vault.e e2 = e.e;
        final ug ug = (ug)a2;
        ug.getClass();
        a3.getClass();
        b.getClass();
        c.getClass();
        final dl a4 = ug.a;
        final qh qh = new qh(a4, (BaseScreen)approveTransactionScreen, a3, b, c, d, e2);
        final RemoteVaultDataSource c2 = ((u82.a)a4.a).c4();
        ui.b.n((Object)c2);
        final y82.a y7 = ((u82.a)a4.a).Y7();
        ui.b.n((Object)y7);
        final f m7 = ((u82.a)a4.a).m7();
        ui.b.n((Object)m7);
        final y82.h d2 = ((u82.a)a4.a).d8();
        ui.b.n((Object)d2);
        final y82.d k5 = ((u82.a)a4.a).k5();
        ui.b.n((Object)k5);
        final va2.b b2 = ((u82.a)a4.a).B4();
        ui.b.n((Object)b2);
        final n n = new n(ScreenPresentationModule.c((BaseScreen)approveTransactionScreen));
        final c h6 = ((e0)a4.a).H6();
        ui.b.n((Object)h6);
        final i82.a a5 = new i82.a(h6);
        final a a6 = ScreenPresentationModule.a((BaseScreen)approveTransactionScreen);
        final Router c3 = vh1.a.c((BaseScreen)approveTransactionScreen);
        final pn1.d e3 = ((e0)a4.a).e0();
        ui.b.n((Object)e3);
        approveTransactionScreen.i0 = (ra2.c)new ApproveTransactionPresenter(a3, b, c2, y7, m7, d2, k5, b2, c, d, e2, n, a5, new d(a6, c3, e3));
        return new xt((Object)qh);
    }
}
