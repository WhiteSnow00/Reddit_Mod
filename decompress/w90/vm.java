// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import lx.d;
import n41.c;
import com.reddit.screen.BaseScreen;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;

public final class vm implements du
{
    public final kl a;
    public Provider<ChatAnalytics> b;
    
    public vm(final kl a, final BaseScreen baseScreen) {
        this.a = a;
        this.b = (Provider<ChatAnalytics>)af2.c.b((Provider)d.a((Provider)a.p1, c.b((Provider)a.p1, (Provider)a.o), (Provider)a.M, (Provider)a.u0, (Provider)a.F));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
