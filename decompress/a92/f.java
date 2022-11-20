// 
// Decompiled by Procyon v0.6.0
// 

package a92;

import com.reddit.vault.data.remote.RemoteVaultDataSource;
import o90.lk;
import com.reddit.vault.feature.loading.LoadingPresenter;
import zd.b;
import o90.xl;
import o90.ht;
import mg2.a;
import javax.inject.Inject;
import o90.hg;
import com.reddit.vault.feature.loading.LoadingScreen;
import o90.dt;

public final class f implements dt<LoadingScreen, d>
{
    public final e a;
    
    @Inject
    public f(final hg a) {
        this.a = (e)a;
    }
    
    public final ht inject(final Object o, final a a) {
        final LoadingScreen loadingScreen = (LoadingScreen)o;
        ng2.e.f((Object)loadingScreen, "target");
        ng2.e.f((Object)a, "factory");
        final d d = (d)a.invoke();
        final e a2 = this.a;
        final a92.a a3 = d.a;
        final c b = d.b;
        final hg hg = (hg)a2;
        hg.getClass();
        a3.getClass();
        b.getClass();
        final lk a4 = hg.a;
        final xl xl = new xl(a4, a3, b);
        final s82.c a5 = ((o82.a)a4.a).A8();
        zd.b.r(a5);
        final s82.a i8 = ((o82.a)a4.a).i8();
        zd.b.r(i8);
        final s82.d q5 = ((o82.a)a4.a).q5();
        zd.b.r(q5);
        final s82.f w7 = ((o82.a)a4.a).w7();
        zd.b.r(w7);
        final RemoteVaultDataSource g4 = ((o82.a)a4.a).g4();
        zd.b.r(g4);
        final s82.d q6 = ((o82.a)a4.a).q5();
        zd.b.r(q6);
        loadingScreen.i0 = (a92.b)new LoadingPresenter(a3, b, a5, i8, q5, w7, g4, new za2.f(q6));
        return new ht((Object)xl);
    }
}
