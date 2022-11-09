// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.h;
import qb0.b;
import com.reddit.screen.BaseScreen;
import ri0.a0;
import javax.inject.Provider;
import je0.q;

public final class um implements du
{
    public final q a;
    public final kl b;
    public Provider<a0> c;
    
    public um(final kl b, final BaseScreen baseScreen, final String s, final q a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<a0>)h.a((Provider)qb0.b.c((Provider)b.F));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
