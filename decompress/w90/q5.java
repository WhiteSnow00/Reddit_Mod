// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import kz0.k;
import com.reddit.utilityscreens.select_option.navigator.SelectOptionNavigator;
import com.reddit.screen.di.ScreenPresentationModule;
import lx.d;
import zo1.a;
import q20.c;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import com.reddit.screen.BaseScreen;
import tp1.e;
import zo1.b;
import np1.g;
import np1.f;

public final class q5
{
    public final f a;
    public final g b;
    public final b<e> c;
    public final BaseScreen d;
    public final a1 e;
    public Provider<ChatAnalytics> f;
    public Provider<c> g;
    
    public q5(final a1 e, final g b, final f a, final BaseScreen d, final a c) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = (b<e>)c;
        this.d = d;
        this.f = (Provider<ChatAnalytics>)af2.c.b((Provider)lx.d.a((Provider)e.I0, n41.c.b((Provider)e.I0, (Provider)e.r), (Provider)e.b0, (Provider)e.c, (Provider)e.h));
        this.g = (Provider<c>)af2.c.b((Provider)ei1.a.a((Provider)iv0.b.b((Provider)af2.e.a((Object)d))));
    }
    
    public final com.reddit.screens.chat.modals.useractionsmodal.navigator.a a() {
        final SelectOptionNavigator selectOptionNavigator = new SelectOptionNavigator(ScreenPresentationModule.a(this.d));
        final q20.b k4 = this.e.a.k4();
        k.N((Object)k4);
        return new com.reddit.screens.chat.modals.useractionsmodal.navigator.a(selectOptionNavigator, k4, this.d);
    }
}
