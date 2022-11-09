// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import xb0.b;
import com.reddit.events.usermodal.UserModalAnalytics;
import javax.inject.Provider;
import android.content.Context;
import zg2.a;

public final class rm implements du
{
    public final a<? extends Context> a;
    public final kl b;
    public Provider<UserModalAnalytics> c;
    
    public rm(final kl b, final a a) {
        this.b = b;
        this.a = (a<? extends Context>)a;
        this.c = (Provider<UserModalAnalytics>)af2.c.b((Provider)xb0.b.d((Provider)b.F));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
