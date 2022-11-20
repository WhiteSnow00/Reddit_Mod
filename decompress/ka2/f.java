// 
// Decompiled by Procyon v0.6.0
// 

package ka2;

import q90.e0;
import com.bluelinelabs.conductor.Router;
import o90.lk;
import com.reddit.vault.feature.vault.points.PointsInfoPresenter;
import com.reddit.screen.di.ScreenPresentationModule;
import zd.b;
import com.reddit.screen.BaseScreen;
import o90.yn;
import o90.ht;
import mg2.a;
import javax.inject.Inject;
import o90.sn;
import com.reddit.vault.feature.vault.points.PointsInfoScreen;
import o90.dt;

public final class f implements dt<PointsInfoScreen, d>
{
    public final e a;
    
    @Inject
    public f(final sn a) {
        this.a = (e)a;
    }
    
    public final ht inject(final Object o, final a a) {
        final PointsInfoScreen pointsInfoScreen = (PointsInfoScreen)o;
        ng2.e.f((Object)pointsInfoScreen, "target");
        ng2.e.f((Object)a, "factory");
        final d d = (d)a.invoke();
        final e a2 = this.a;
        final ka2.a a3 = d.a;
        final c b = d.b;
        final sn sn = (sn)a2;
        sn.getClass();
        a3.getClass();
        b.getClass();
        final lk a4 = sn.a;
        final yn yn = new yn(a4, (BaseScreen)pointsInfoScreen, a3, b);
        final s82.c a5 = ((o82.a)a4.a).A8();
        zd.b.r(a5);
        final a a6 = ScreenPresentationModule.a((BaseScreen)pointsInfoScreen);
        final Router e = zr0.d.e((BaseScreen)pointsInfoScreen);
        final ln1.d e2 = ((e0)a4.a).e0();
        zd.b.r(e2);
        pointsInfoScreen.i0 = (ka2.b)new PointsInfoPresenter(a3, b, a5, new ua2.d(a6, e, e2));
        return new ht((Object)yn);
    }
}
