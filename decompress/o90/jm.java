// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.c;
import com.reddit.events.usermodal.UserModalAnalytics;
import javax.inject.Provider;
import android.content.Context;
import rg2.a;

public final class jm implements yt
{
    public final a<? extends Context> a;
    public final dl b;
    public Provider<UserModalAnalytics> c;
    
    public jm(final dl b, final a a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<UserModalAnalytics>)se2.c.b((Provider)wb0.a.b((Provider)b.F));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
