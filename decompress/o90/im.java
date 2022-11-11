// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.c;
import ff0.q1;
import com.reddit.events.creatorstats.CreatorStatsAnalytics;
import javax.inject.Provider;

public final class im implements yt
{
    public final dl a;
    public Provider<CreatorStatsAnalytics> b;
    
    public im(final dl a) {
        this.a = a;
        this.b = (Provider<CreatorStatsAnalytics>)c.b((Provider)q1.f((Provider)a.F));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
