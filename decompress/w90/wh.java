// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.vault.util.BiometricsHandler;
import za2.d;
import za2.b;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.e;
import com.reddit.vault.h;

public final class wh implements du
{
    public final h a;
    public final e b;
    public final kl c;
    
    public wh(final kl c, final BaseScreen baseScreen, final b b, final d d, final BiometricsHandler biometricsHandler, final h a, final e b2) {
        this.c = c;
        this.a = a;
        this.b = b2;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.c.k();
    }
}
