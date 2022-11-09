// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import lx.d;
import com.reddit.screen.BaseScreen;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import lq1.b;
import zg2.a;
import kq1.c;

public final class bn implements du
{
    public final c a;
    public final a<? extends b> b;
    public final kl c;
    public Provider<ChatAnalytics> d;
    
    public bn(final kl c, final BaseScreen baseScreen, final c a, final kq1.a a2, final a b) {
        this.c = c;
        this.a = a;
        this.b = (a<? extends b>)b;
        this.d = (Provider<ChatAnalytics>)af2.c.b((Provider)lx.d.a((Provider)c.p1, n41.c.b((Provider)c.p1, (Provider)c.o), (Provider)c.M, (Provider)c.u0, (Provider)c.F));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.c.k();
    }
}
