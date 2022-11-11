// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.c;
import pk1.b;
import com.reddit.events.settings.ContentLanguagesAnalytics;
import javax.inject.Provider;

public final class zg implements yt
{
    public final dl a;
    public Provider<ContentLanguagesAnalytics> b;
    
    public zg(final dl a, final b b) {
        this.a = a;
        this.b = (Provider<ContentLanguagesAnalytics>)c.b((Provider)new ib0.b((Provider)a.F, 23));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
