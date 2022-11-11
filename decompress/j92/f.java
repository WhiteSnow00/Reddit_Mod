// 
// Decompiled by Procyon v0.6.0
// 

package j92;

import q90.e0;
import com.bluelinelabs.conductor.Router;
import o90.dl;
import com.reddit.vault.feature.recoveryphrase.display.RecoveryPhraseDisplayPresenter;
import fb2.t;
import com.reddit.screen.di.ScreenPresentationModule;
import ui.b;
import com.reddit.screen.BaseScreen;
import o90.up;
import o90.xt;
import rg2.a;
import javax.inject.Inject;
import o90.ch;
import com.reddit.vault.feature.recoveryphrase.display.RecoveryPhraseDisplayScreen;
import o90.tt;

public final class f implements tt<RecoveryPhraseDisplayScreen, d>
{
    public final e a;
    
    @Inject
    public f(final ch a) {
        this.a = (e)a;
    }
    
    @Override
    public final xt inject(final Object o, final a a) {
        final RecoveryPhraseDisplayScreen recoveryPhraseDisplayScreen = (RecoveryPhraseDisplayScreen)o;
        sg2.e.f((Object)recoveryPhraseDisplayScreen, "target");
        sg2.e.f((Object)a, "factory");
        final d d = a.invoke();
        final e a2 = this.a;
        final j92.a a3 = d.a;
        final c b = d.b;
        final h92.a c = d.c;
        final ch ch = (ch)a2;
        ch.getClass();
        a3.getClass();
        b.getClass();
        c.getClass();
        final dl a4 = ch.a;
        final up up = new up(a4, (BaseScreen)recoveryPhraseDisplayScreen, a3, b, c);
        final y82.a y7 = ((u82.a)a4.a).Y7();
        ui.b.n((Object)y7);
        final y82.d k5 = ((u82.a)a4.a).k5();
        ui.b.n((Object)k5);
        final t t = new t(ScreenPresentationModule.c((BaseScreen)recoveryPhraseDisplayScreen));
        final a a5 = ScreenPresentationModule.a((BaseScreen)recoveryPhraseDisplayScreen);
        final Router c2 = vh1.a.c((BaseScreen)recoveryPhraseDisplayScreen);
        final pn1.d e0 = ((e0)a4.a).e0();
        ui.b.n((Object)e0);
        recoveryPhraseDisplayScreen.i0 = (j92.b)new RecoveryPhraseDisplayPresenter(a3, b, y7, k5, c, t, new ab2.d(a5, c2, e0));
        return new xt((Object)up);
    }
}
