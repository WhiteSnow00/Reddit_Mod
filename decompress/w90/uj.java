// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import ug0.a;
import al1.b;
import com.reddit.screen.BaseScreen;
import com.reddit.events.settings.ContentLanguagesAnalytics;
import javax.inject.Provider;

public final class uj implements du
{
    public final kl a;
    public Provider<ContentLanguagesAnalytics> b;
    
    public uj(final kl a, final BaseScreen baseScreen, final b b) {
        this.a = a;
        this.b = (Provider<ContentLanguagesAnalytics>)c.b((Provider)new a((Provider)a.F, 15));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}