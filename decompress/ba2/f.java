// 
// Decompiled by Procyon v0.6.0
// 

package ba2;

import q90.e0;
import com.bluelinelabs.conductor.Router;
import o90.lk;
import com.reddit.vault.feature.vault.forcebackup.ForceBackupPresenter;
import com.reddit.screen.di.ScreenPresentationModule;
import zd.b;
import com.reddit.screen.BaseScreen;
import o90.ok;
import o90.ht;
import mg2.a;
import javax.inject.Inject;
import o90.fg;
import com.reddit.vault.feature.vault.forcebackup.ForceBackupScreen;
import o90.dt;

public final class f implements dt<ForceBackupScreen, d>
{
    public final e a;
    
    @Inject
    public f(final fg a) {
        this.a = (e)a;
    }
    
    public final ht inject(final Object o, final a a) {
        final ForceBackupScreen forceBackupScreen = (ForceBackupScreen)o;
        ng2.e.f((Object)forceBackupScreen, "target");
        ng2.e.f((Object)a, "factory");
        final d d = (d)a.invoke();
        final e a2 = this.a;
        final c a3 = d.a;
        final b92.a b = d.b;
        final fg fg = (fg)a2;
        fg.getClass();
        a3.getClass();
        b.getClass();
        final lk a4 = fg.a;
        final ok ok = new ok(a4, (BaseScreen)forceBackupScreen, a3, b);
        final s82.a i8 = ((o82.a)a4.a).i8();
        zd.b.r(i8);
        final s82.d q5 = ((o82.a)a4.a).q5();
        zd.b.r(q5);
        final a a5 = ScreenPresentationModule.a((BaseScreen)forceBackupScreen);
        final Router e = zr0.d.e((BaseScreen)forceBackupScreen);
        final ln1.d e2 = ((e0)a4.a).e0();
        zd.b.r(e2);
        forceBackupScreen.i0 = (ba2.b)new ForceBackupPresenter(a3, i8, q5, b, new ua2.d(a5, e, e2));
        return new ht((Object)ok);
    }
}
