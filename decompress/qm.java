// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import ug0.a;
import com.reddit.events.creatorstats.CreatorStatsAnalytics;
import javax.inject.Provider;

public final class qm implements du
{
    public final kl a;
    public Provider<CreatorStatsAnalytics> b;
    
    public qm(final kl a) {
        this.a = a;
        this.b = (Provider<CreatorStatsAnalytics>)c.b((Provider)ug0.a.d((Provider)a.F));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
