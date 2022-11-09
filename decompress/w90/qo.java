// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import java.lang.ref.WeakReference;
import ua2.g;

public final class qo implements du
{
    public final kl a;
    
    public qo(final kl a, final g g, final WeakReference weakReference) {
        this.a = a;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
